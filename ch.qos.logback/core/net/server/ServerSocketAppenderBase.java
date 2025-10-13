package ch.qos.logback.core.net.server;

import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.net.AbstractSocketAppender;
import ch.qos.logback.core.spi.PreSerializationTransformer;
import java.io.IOException;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.util.concurrent.Executor;
import javax.net.ServerSocketFactory;

/* loaded from: classes.dex */
public abstract class ServerSocketAppenderBase<E> extends AppenderBase<E> {
    public static final int DEFAULT_BACKLOG = 50;
    public static final int DEFAULT_CLIENT_QUEUE_SIZE = 100;
    private String address;
    private ServerRunner<RemoteReceiverClient> runner;
    private int port = AbstractSocketAppender.DEFAULT_PORT;
    private int backlog = 50;
    private int clientQueueSize = 100;

    @Override // ch.qos.logback.core.AppenderBase
    protected void append(E e2) {
        if (e2 == null) {
            return;
        }
        postProcessEvent(e2);
        final Serializable serializableTransform = getPST().transform(e2);
        this.runner.accept(new ClientVisitor<RemoteReceiverClient>() { // from class: ch.qos.logback.core.net.server.ServerSocketAppenderBase.1
            @Override // ch.qos.logback.core.net.server.ClientVisitor
            public void visit(RemoteReceiverClient remoteReceiverClient) {
                remoteReceiverClient.offer(serializableTransform);
            }
        });
    }

    protected ServerListener<RemoteReceiverClient> createServerListener(ServerSocket serverSocket) {
        return new RemoteReceiverServerListener(serverSocket);
    }

    protected ServerRunner<RemoteReceiverClient> createServerRunner(ServerListener<RemoteReceiverClient> serverListener, Executor executor) {
        return new RemoteReceiverServerRunner(serverListener, executor, getClientQueueSize());
    }

    public String getAddress() {
        return this.address;
    }

    public Integer getBacklog() {
        return Integer.valueOf(this.backlog);
    }

    public int getClientQueueSize() {
        return this.clientQueueSize;
    }

    protected InetAddress getInetAddress() {
        if (getAddress() == null) {
            return null;
        }
        return InetAddress.getByName(getAddress());
    }

    protected abstract PreSerializationTransformer<E> getPST();

    public int getPort() {
        return this.port;
    }

    protected ServerSocketFactory getServerSocketFactory() {
        return ServerSocketFactory.getDefault();
    }

    protected abstract void postProcessEvent(E e2);

    public void setAddress(String str) {
        this.address = str;
    }

    public void setBacklog(Integer num) {
        this.backlog = num.intValue();
    }

    public void setClientQueueSize(int i2) {
        this.clientQueueSize = i2;
    }

    public void setPort(int i2) {
        this.port = i2;
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        if (isStarted()) {
            return;
        }
        try {
            ServerRunner<RemoteReceiverClient> serverRunnerCreateServerRunner = createServerRunner(createServerListener(getServerSocketFactory().createServerSocket(getPort(), getBacklog().intValue(), getInetAddress())), getContext().getExecutorService());
            this.runner = serverRunnerCreateServerRunner;
            serverRunnerCreateServerRunner.setContext(getContext());
            getContext().getExecutorService().execute(this.runner);
            super.start();
        } catch (Exception e2) {
            addError("server startup error: " + e2, e2);
        }
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        if (isStarted()) {
            try {
                this.runner.stop();
                super.stop();
            } catch (IOException e2) {
                addError("server shutdown error: " + e2, e2);
            }
        }
    }
}