package ch.qos.logback.core.net;

import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.net.SocketConnector;
import ch.qos.logback.core.spi.PreSerializationTransformer;
import ch.qos.logback.core.util.CloseUtil;
import ch.qos.logback.core.util.Duration;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;

/* loaded from: classes.dex */
public abstract class AbstractSocketAppender<E> extends AppenderBase<E> implements Runnable, SocketConnector.ExceptionHandler {
    private static final int DEFAULT_ACCEPT_CONNECTION_DELAY = 5000;
    private static final int DEFAULT_EVENT_DELAY_TIMEOUT = 100;
    public static final int DEFAULT_PORT = 4560;
    public static final int DEFAULT_QUEUE_SIZE = 128;
    public static final int DEFAULT_RECONNECTION_DELAY = 30000;
    private int acceptConnectionTimeout;
    private InetAddress address;
    private Future<Socket> connectorTask;
    private Duration eventDelayLimit;
    private String peerId;
    private int port;
    private BlockingQueue<E> queue;
    private int queueSize;
    private Duration reconnectionDelay;
    private String remoteHost;
    private volatile Socket socket;
    private Future<?> task;

    protected AbstractSocketAppender() {
        this.port = DEFAULT_PORT;
        this.reconnectionDelay = new Duration(30000L);
        this.queueSize = 128;
        this.acceptConnectionTimeout = 5000;
        this.eventDelayLimit = new Duration(100L);
    }

    @Deprecated
    protected AbstractSocketAppender(String str, int i2) {
        this.port = DEFAULT_PORT;
        this.reconnectionDelay = new Duration(30000L);
        this.queueSize = 128;
        this.acceptConnectionTimeout = 5000;
        this.eventDelayLimit = new Duration(100L);
        this.remoteHost = str;
        this.port = i2;
    }

    private Future<Socket> activateConnector(SocketConnector socketConnector) {
        try {
            return getContext().getExecutorService().submit(socketConnector);
        } catch (RejectedExecutionException unused) {
            return null;
        }
    }

    private SocketConnector createConnector(InetAddress inetAddress, int i2, int i3, long j2) {
        SocketConnector socketConnectorNewConnector = newConnector(inetAddress, i2, i3, j2);
        socketConnectorNewConnector.setExceptionHandler(this);
        socketConnectorNewConnector.setSocketFactory(getSocketFactory());
        return socketConnectorNewConnector;
    }

    private void dispatchEvents() throws IOException {
        try {
            try {
                this.socket.setSoTimeout(this.acceptConnectionTimeout);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(this.socket.getOutputStream());
                this.socket.setSoTimeout(0);
                addInfo(this.peerId + "connection established");
                while (true) {
                    int i2 = 0;
                    do {
                        E eTake = this.queue.take();
                        postProcessEvent(eTake);
                        objectOutputStream.writeObject(getPST().transform(eTake));
                        objectOutputStream.flush();
                        i2++;
                    } while (i2 < 70);
                    objectOutputStream.reset();
                }
            } catch (IOException e2) {
                addInfo(this.peerId + "connection failed: " + e2);
                CloseUtil.closeQuietly(this.socket);
                this.socket = null;
                addInfo(this.peerId + "connection closed");
            }
        } catch (Throwable th) {
            CloseUtil.closeQuietly(this.socket);
            this.socket = null;
            addInfo(this.peerId + "connection closed");
            throw th;
        }
    }

    @Deprecated
    protected static InetAddress getAddressByName(String str) {
        try {
            return InetAddress.getByName(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private Socket waitForConnectorToReturnASocket() throws ExecutionException, InterruptedException {
        try {
            Socket socket = this.connectorTask.get();
            this.connectorTask = null;
            return socket;
        } catch (ExecutionException unused) {
            return null;
        }
    }

    @Override // ch.qos.logback.core.AppenderBase
    protected void append(E e2) {
        if (e2 == null || !isStarted()) {
            return;
        }
        try {
            if (this.queue.offer(e2, this.eventDelayLimit.getMilliseconds(), TimeUnit.MILLISECONDS)) {
                return;
            }
            addInfo("Dropping event due to timeout limit of [" + this.eventDelayLimit + "] milliseconds being exceeded");
        } catch (InterruptedException e3) {
            addError("Interrupted while appending event to SocketAppender", e3);
        }
    }

    @Override // ch.qos.logback.core.net.SocketConnector.ExceptionHandler
    public void connectionFailed(SocketConnector socketConnector, Exception exc) {
        StringBuilder sb;
        String string;
        if (exc instanceof InterruptedException) {
            string = "connector interrupted";
        } else {
            if (exc instanceof ConnectException) {
                sb = new StringBuilder();
                sb.append(this.peerId);
                sb.append("connection refused");
            } else {
                sb = new StringBuilder();
                sb.append(this.peerId);
                sb.append(exc);
            }
            string = sb.toString();
        }
        addInfo(string);
    }

    public Duration getEventDelayLimit() {
        return this.eventDelayLimit;
    }

    protected abstract PreSerializationTransformer<E> getPST();

    public int getPort() {
        return this.port;
    }

    public int getQueueSize() {
        return this.queueSize;
    }

    public Duration getReconnectionDelay() {
        return this.reconnectionDelay;
    }

    public String getRemoteHost() {
        return this.remoteHost;
    }

    protected SocketFactory getSocketFactory() {
        return SocketFactory.getDefault();
    }

    BlockingQueue<E> newBlockingQueue(int i2) {
        return i2 <= 0 ? new SynchronousQueue() : new ArrayBlockingQueue(i2);
    }

    protected SocketConnector newConnector(InetAddress inetAddress, int i2, long j2, long j3) {
        return new DefaultSocketConnector(inetAddress, i2, j2, j3);
    }

    protected abstract void postProcessEvent(E e2);

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        signalEntryInRunMethod();
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Future<Socket> futureActivateConnector = activateConnector(createConnector(this.address, this.port, 0, this.reconnectionDelay.getMilliseconds()));
                this.connectorTask = futureActivateConnector;
                if (futureActivateConnector == null) {
                    break;
                }
                this.socket = waitForConnectorToReturnASocket();
                if (this.socket == null) {
                    break;
                } else {
                    dispatchEvents();
                }
            } catch (InterruptedException unused) {
            }
        }
        addInfo("shutting down");
    }

    void setAcceptConnectionTimeout(int i2) {
        this.acceptConnectionTimeout = i2;
    }

    public void setEventDelayLimit(Duration duration) {
        this.eventDelayLimit = duration;
    }

    public void setPort(int i2) {
        this.port = i2;
    }

    public void setQueueSize(int i2) {
        this.queueSize = i2;
    }

    public void setReconnectionDelay(Duration duration) {
        this.reconnectionDelay = duration;
    }

    public void setRemoteHost(String str) {
        this.remoteHost = str;
    }

    protected void signalEntryInRunMethod() {
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        if (isStarted()) {
            return;
        }
        int i2 = 0;
        if (this.port <= 0) {
            addError("No port was configured for appender" + this.name + " For more information, please visit http://logback.qos.ch/codes.html#socket_no_port");
            i2 = 1;
        }
        if (this.remoteHost == null) {
            i2++;
            addError("No remote host was configured for appender" + this.name + " For more information, please visit http://logback.qos.ch/codes.html#socket_no_host");
        }
        if (this.queueSize < 0) {
            i2++;
            addError("Queue size must be non-negative");
        }
        if (i2 == 0) {
            try {
                this.address = InetAddress.getByName(this.remoteHost);
            } catch (UnknownHostException unused) {
                addError("unknown host: " + this.remoteHost);
                i2++;
            }
        }
        if (i2 == 0) {
            this.queue = newBlockingQueue(this.queueSize);
            this.peerId = "remote peer " + this.remoteHost + ":" + this.port + ": ";
            this.task = getContext().getExecutorService().submit(this);
            super.start();
        }
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() throws IOException {
        if (isStarted()) {
            CloseUtil.closeQuietly(this.socket);
            this.task.cancel(true);
            Future<Socket> future = this.connectorTask;
            if (future != null) {
                future.cancel(true);
            }
            super.stop();
        }
    }
}