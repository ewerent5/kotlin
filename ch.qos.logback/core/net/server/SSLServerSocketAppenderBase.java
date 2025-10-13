package ch.qos.logback.core.net.server;

import ch.qos.logback.core.net.ssl.ConfigurableSSLServerSocketFactory;
import ch.qos.logback.core.net.ssl.SSLComponent;
import ch.qos.logback.core.net.ssl.SSLConfiguration;
import ch.qos.logback.core.net.ssl.SSLParametersConfiguration;
import javax.net.ServerSocketFactory;
import javax.net.ssl.SSLContext;

/* loaded from: classes.dex */
public abstract class SSLServerSocketAppenderBase<E> extends AbstractServerSocketAppender<E> implements SSLComponent {
    private ServerSocketFactory socketFactory;
    private SSLConfiguration ssl;

    @Override // ch.qos.logback.core.net.server.AbstractServerSocketAppender
    protected ServerSocketFactory getServerSocketFactory() {
        return this.socketFactory;
    }

    @Override // ch.qos.logback.core.net.ssl.SSLComponent
    public SSLConfiguration getSsl() {
        if (this.ssl == null) {
            this.ssl = new SSLConfiguration();
        }
        return this.ssl;
    }

    @Override // ch.qos.logback.core.net.ssl.SSLComponent
    public void setSsl(SSLConfiguration sSLConfiguration) {
        this.ssl = sSLConfiguration;
    }

    @Override // ch.qos.logback.core.net.server.AbstractServerSocketAppender, ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        try {
            SSLContext sSLContextCreateContext = getSsl().createContext(this);
            SSLParametersConfiguration parameters = getSsl().getParameters();
            parameters.setContext(getContext());
            this.socketFactory = new ConfigurableSSLServerSocketFactory(parameters, sSLContextCreateContext.getServerSocketFactory());
            super.start();
        } catch (Exception e2) {
            addError(e2.getMessage(), e2);
        }
    }
}