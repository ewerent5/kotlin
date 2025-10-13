package ch.qos.logback.classic.net.server;

import ch.qos.logback.classic.net.ReceiverBase;
import ch.qos.logback.core.net.AbstractSocketAppender;
import ch.qos.logback.core.net.server.ServerListener;
import ch.qos.logback.core.net.server.ServerRunner;
import ch.qos.logback.core.util.CloseUtil;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.util.concurrent.Executor;
import javax.net.ServerSocketFactory;

/* loaded from: classes.dex */
public class ServerSocketReceiver extends ReceiverBase {
    public static final int DEFAULT_BACKLOG = 50;
    private String address;
    private ServerRunner runner;
    private ServerSocket serverSocket;
    private int port = AbstractSocketAppender.DEFAULT_PORT;
    private int backlog = 50;

    protected ServerListener<RemoteAppenderClient> createServerListener(ServerSocket serverSocket) {
        return new RemoteAppenderServerListener(serverSocket);
    }

    protected ServerRunner createServerRunner(ServerListener<RemoteAppenderClient> serverListener, Executor executor) {
        return new RemoteAppenderServerRunner(serverListener, executor);
    }

    public String getAddress() {
        return this.address;
    }

    public int getBacklog() {
        return this.backlog;
    }

    protected InetAddress getInetAddress() {
        if (getAddress() == null) {
            return null;
        }
        return InetAddress.getByName(getAddress());
    }

    public int getPort() {
        return this.port;
    }

    @Override // ch.qos.logback.classic.net.ReceiverBase
    protected Runnable getRunnableTask() {
        return this.runner;
    }

    protected ServerSocketFactory getServerSocketFactory() {
        return ServerSocketFactory.getDefault();
    }

    @Override // ch.qos.logback.classic.net.ReceiverBase
    protected void onStop() {
        try {
            ServerRunner serverRunner = this.runner;
            if (serverRunner == null) {
                return;
            }
            serverRunner.stop();
        } catch (IOException e2) {
            addError("server shutdown error: " + e2, e2);
        }
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setBacklog(int i2) {
        this.backlog = i2;
    }

    public void setPort(int i2) {
        this.port = i2;
    }

    @Override // ch.qos.logback.classic.net.ReceiverBase
    protected boolean shouldStart() throws IOException {
        try {
            ServerRunner serverRunnerCreateServerRunner = createServerRunner(createServerListener(getServerSocketFactory().createServerSocket(getPort(), getBacklog(), getInetAddress())), getContext().getExecutorService());
            this.runner = serverRunnerCreateServerRunner;
            serverRunnerCreateServerRunner.setContext(getContext());
            return true;
        } catch (Exception e2) {
            addError("server startup error: " + e2, e2);
            CloseUtil.closeQuietly(this.serverSocket);
            return false;
        }
    }
}