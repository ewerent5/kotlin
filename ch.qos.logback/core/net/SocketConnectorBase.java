package ch.qos.logback.core.net;

import ch.qos.logback.core.net.SocketConnector;
import java.net.InetAddress;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.net.SocketFactory;

/* loaded from: classes.dex */
public class SocketConnectorBase implements SocketConnector {
    private final InetAddress address;
    private final Condition connectCondition;
    private DelayStrategy delayStrategy;
    private SocketConnector.ExceptionHandler exceptionHandler;
    private final Lock lock;
    private final int port;
    private Socket socket;
    private SocketFactory socketFactory;

    private static class ConsoleExceptionHandler implements SocketConnector.ExceptionHandler {
        private ConsoleExceptionHandler() {
        }

        @Override // ch.qos.logback.core.net.SocketConnector.ExceptionHandler
        public void connectionFailed(SocketConnector socketConnector, Exception exc) {
            System.out.println(exc);
        }
    }

    public interface DelayStrategy {
        int nextDelay();
    }

    private static class FixedDelay implements DelayStrategy {
        private int nextDelay;
        private final int retryDelay;

        public FixedDelay(int i2, int i3) {
            this.nextDelay = i2;
            this.retryDelay = i3;
        }

        @Override // ch.qos.logback.core.net.SocketConnectorBase.DelayStrategy
        public int nextDelay() {
            int i2 = this.nextDelay;
            this.nextDelay = this.retryDelay;
            return i2;
        }
    }

    public SocketConnectorBase(InetAddress inetAddress, int i2, int i3, int i4) {
        this(inetAddress, i2, new FixedDelay(i3, i4));
    }

    public SocketConnectorBase(InetAddress inetAddress, int i2, DelayStrategy delayStrategy) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.connectCondition = reentrantLock.newCondition();
        this.address = inetAddress;
        this.port = i2;
        this.delayStrategy = delayStrategy;
    }

    private void signalConnected() {
        this.lock.lock();
        try {
            this.connectCondition.signalAll();
        } finally {
            this.lock.unlock();
        }
    }

    public Socket awaitConnection() {
        return awaitConnection(Long.MAX_VALUE);
    }

    public Socket awaitConnection(long j2) {
        Socket socket;
        this.lock.lock();
        boolean z = false;
        while (true) {
            try {
                socket = this.socket;
                if (socket != null || z) {
                    break;
                }
                z = !this.connectCondition.await(j2, TimeUnit.MILLISECONDS);
            } finally {
                this.lock.unlock();
            }
        }
        return socket;
    }

    @Override // java.util.concurrent.Callable
    public Socket call() {
        return null;
    }

    public void run() throws InterruptedException {
        if (this.socket != null) {
            throw new IllegalStateException("connector cannot be reused");
        }
        if (this.exceptionHandler == null) {
            this.exceptionHandler = new ConsoleExceptionHandler();
        }
        if (this.socketFactory == null) {
            this.socketFactory = SocketFactory.getDefault();
        }
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Thread.sleep(this.delayStrategy.nextDelay());
                try {
                    this.socket = this.socketFactory.createSocket(this.address, this.port);
                    signalConnected();
                    return;
                } catch (Exception e2) {
                    this.exceptionHandler.connectionFailed(this, e2);
                }
            } catch (InterruptedException e3) {
                this.exceptionHandler.connectionFailed(this, e3);
                return;
            }
        }
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