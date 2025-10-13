package ch.qos.logback.core.net;

import ch.qos.logback.core.net.SocketConnector;
import ch.qos.logback.core.util.DelayStrategy;
import ch.qos.logback.core.util.FixedDelay;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.SocketFactory;

/* loaded from: classes.dex */
public class DefaultSocketConnector implements SocketConnector {
    private final InetAddress address;
    private final DelayStrategy delayStrategy;
    private SocketConnector.ExceptionHandler exceptionHandler;
    private final int port;
    private SocketFactory socketFactory;

    private static class ConsoleExceptionHandler implements SocketConnector.ExceptionHandler {
        private ConsoleExceptionHandler() {
        }

        @Override // ch.qos.logback.core.net.SocketConnector.ExceptionHandler
        public void connectionFailed(SocketConnector socketConnector, Exception exc) {
            System.out.println(exc);
        }
    }

    public DefaultSocketConnector(InetAddress inetAddress, int i2, long j2, long j3) {
        this(inetAddress, i2, new FixedDelay(j2, j3));
    }

    public DefaultSocketConnector(InetAddress inetAddress, int i2, DelayStrategy delayStrategy) {
        this.address = inetAddress;
        this.port = i2;
        this.delayStrategy = delayStrategy;
    }

    private Socket createSocket() {
        try {
            return this.socketFactory.createSocket(this.address, this.port);
        } catch (IOException e2) {
            this.exceptionHandler.connectionFailed(this, e2);
            return null;
        }
    }

    private void useDefaultsForMissingFields() {
        if (this.exceptionHandler == null) {
            this.exceptionHandler = new ConsoleExceptionHandler();
        }
        if (this.socketFactory == null) {
            this.socketFactory = SocketFactory.getDefault();
        }
    }

    @Override // java.util.concurrent.Callable
    public Socket call() throws InterruptedException {
        Socket socketCreateSocket;
        useDefaultsForMissingFields();
        while (true) {
            socketCreateSocket = createSocket();
            if (socketCreateSocket != null || Thread.currentThread().isInterrupted()) {
                break;
            }
            Thread.sleep(this.delayStrategy.nextDelay());
        }
        return socketCreateSocket;
    }

    @Override // ch.qos.logback.core.net.SocketConnector
    public void setExceptionHandler(SocketConnector.ExceptionHandler exceptionHandler) {
        this.exceptionHandler = exceptionHandler;
    }

    @Override // ch.qos.logback.core.net.SocketConnector
    public void setSocketFactory(SocketFactory socketFactory) {
        this.socketFactory = socketFactory;
    }
}