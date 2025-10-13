package ch.qos.logback.classic.net;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.joran.spi.JoranException;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import javax.net.ServerSocketFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: classes.dex */
public class SimpleSocketServer extends Thread {
    private CountDownLatch latch;
    private final LoggerContext lc;
    private final int port;
    private ServerSocket serverSocket;
    Logger logger = LoggerFactory.getLogger((Class<?>) SimpleSocketServer.class);
    private boolean closed = false;
    private List<SocketNode> socketNodeList = new ArrayList();

    public SimpleSocketServer(LoggerContext loggerContext, int i2) {
        this.lc = loggerContext;
        this.port = i2;
    }

    public static void configureLC(LoggerContext loggerContext, String str) throws JoranException {
        JoranConfigurator joranConfigurator = new JoranConfigurator();
        loggerContext.reset();
        joranConfigurator.setContext(loggerContext);
        joranConfigurator.doConfigure(str);
    }

    protected static void doMain(Class<? extends SimpleSocketServer> cls, String[] strArr) throws JoranException {
        int portNumber;
        if (strArr.length == 2) {
            portNumber = parsePortNumber(strArr[0]);
        } else {
            usage("Wrong number of arguments.");
            portNumber = -1;
        }
        String str = strArr[1];
        LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
        configureLC(loggerContext, str);
        new SimpleSocketServer(loggerContext, portNumber).start();
    }

    public static void main(String[] strArr) throws JoranException {
        doMain(SimpleSocketServer.class, strArr);
    }

    static int parsePortNumber(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e2) {
            e2.printStackTrace();
            usage("Could not interpret port number [" + str + "].");
            return -1;
        }
    }

    static void usage(String str) {
        System.err.println(str);
        System.err.println("Usage: java " + SimpleSocketServer.class.getName() + " port configFile");
        System.exit(1);
    }

    public void close() {
        this.closed = true;
        ServerSocket serverSocket = this.serverSocket;
        if (serverSocket != null) {
            try {
                try {
                    serverSocket.close();
                } catch (IOException e2) {
                    this.logger.error("Failed to close serverSocket", (Throwable) e2);
                }
            } finally {
                this.serverSocket = null;
            }
        }
        this.logger.info("closing this server");
        synchronized (this.socketNodeList) {
            Iterator<SocketNode> it = this.socketNodeList.iterator();
            while (it.hasNext()) {
                it.next().close();
            }
        }
        if (this.socketNodeList.size() != 0) {
            this.logger.warn("Was expecting a 0-sized socketNodeList after server shutdown");
        }
    }

    protected String getClientThreadName(Socket socket) {
        return String.format("Logback SocketNode (client: %s)", socket.getRemoteSocketAddress());
    }

    public CountDownLatch getLatch() {
        return this.latch;
    }

    protected ServerSocketFactory getServerSocketFactory() {
        return ServerSocketFactory.getDefault();
    }

    protected String getServerThreadName() {
        return String.format("Logback %s (port %d)", getClass().getSimpleName(), Integer.valueOf(this.port));
    }

    public boolean isClosed() {
        return this.closed;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        String name = Thread.currentThread().getName();
        try {
            try {
                Thread.currentThread().setName(getServerThreadName());
                this.logger.info("Listening on port " + this.port);
                this.serverSocket = getServerSocketFactory().createServerSocket(this.port);
                while (!this.closed) {
                    this.logger.info("Waiting to accept a new client.");
                    signalAlmostReadiness();
                    Socket socketAccept = this.serverSocket.accept();
                    this.logger.info("Connected to client at " + socketAccept.getInetAddress());
                    this.logger.info("Starting new socket node.");
                    SocketNode socketNode = new SocketNode(this, socketAccept, this.lc);
                    synchronized (this.socketNodeList) {
                        this.socketNodeList.add(socketNode);
                    }
                    new Thread(socketNode, getClientThreadName(socketAccept)).start();
                }
            } catch (Exception e2) {
                if (this.closed) {
                    this.logger.info("Exception in run method for a closed server. This is normal.");
                } else {
                    this.logger.error("Unexpected failure in run method", (Throwable) e2);
                }
            }
        } finally {
            Thread.currentThread().setName(name);
        }
    }

    void setLatch(CountDownLatch countDownLatch) {
        this.latch = countDownLatch;
    }

    void signalAlmostReadiness() {
        CountDownLatch countDownLatch = this.latch;
        if (countDownLatch == null || countDownLatch.getCount() == 0) {
            return;
        }
        this.latch.countDown();
    }

    public void socketNodeClosing(SocketNode socketNode) {
        this.logger.debug("Removing {}", socketNode);
        synchronized (this.socketNodeList) {
            this.socketNodeList.remove(socketNode);
        }
    }
}