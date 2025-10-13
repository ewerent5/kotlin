package ch.qos.logback.classic.net;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.net.ssl.ConfigurableSSLServerSocketFactory;
import ch.qos.logback.core.net.ssl.SSLParametersConfiguration;
import java.util.Objects;
import javax.net.ServerSocketFactory;
import javax.net.ssl.SSLContext;

/* loaded from: classes.dex */
public class SimpleSSLSocketServer extends SimpleSocketServer {
    private final ServerSocketFactory socketFactory;

    public SimpleSSLSocketServer(LoggerContext loggerContext, int i2) {
        this(loggerContext, i2, SSLContext.getDefault());
    }

    public SimpleSSLSocketServer(LoggerContext loggerContext, int i2, SSLContext sSLContext) {
        super(loggerContext, i2);
        Objects.requireNonNull(sSLContext, "SSL context required");
        SSLParametersConfiguration sSLParametersConfiguration = new SSLParametersConfiguration();
        sSLParametersConfiguration.setContext(loggerContext);
        this.socketFactory = new ConfigurableSSLServerSocketFactory(sSLParametersConfiguration, sSLContext.getServerSocketFactory());
    }

    public static void main(String[] strArr) throws JoranException {
        SimpleSocketServer.doMain(SimpleSSLSocketServer.class, strArr);
    }

    @Override // ch.qos.logback.classic.net.SimpleSocketServer
    protected ServerSocketFactory getServerSocketFactory() {
        return this.socketFactory;
    }
}