package ch.qos.logback.core.net.ssl;

import java.net.InetAddress;
import java.net.ServerSocket;
import javax.net.ServerSocketFactory;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;

/* loaded from: classes.dex */
public class ConfigurableSSLServerSocketFactory extends ServerSocketFactory {
    private final SSLServerSocketFactory delegate;
    private final SSLParametersConfiguration parameters;

    public ConfigurableSSLServerSocketFactory(SSLParametersConfiguration sSLParametersConfiguration, SSLServerSocketFactory sSLServerSocketFactory) {
        this.parameters = sSLParametersConfiguration;
        this.delegate = sSLServerSocketFactory;
    }

    @Override // javax.net.ServerSocketFactory
    public ServerSocket createServerSocket(int i2) {
        SSLServerSocket sSLServerSocket = (SSLServerSocket) this.delegate.createServerSocket(i2);
        this.parameters.configure(new SSLConfigurableServerSocket(sSLServerSocket));
        return sSLServerSocket;
    }

    @Override // javax.net.ServerSocketFactory
    public ServerSocket createServerSocket(int i2, int i3) {
        SSLServerSocket sSLServerSocket = (SSLServerSocket) this.delegate.createServerSocket(i2, i3);
        this.parameters.configure(new SSLConfigurableServerSocket(sSLServerSocket));
        return sSLServerSocket;
    }

    @Override // javax.net.ServerSocketFactory
    public ServerSocket createServerSocket(int i2, int i3, InetAddress inetAddress) {
        SSLServerSocket sSLServerSocket = (SSLServerSocket) this.delegate.createServerSocket(i2, i3, inetAddress);
        this.parameters.configure(new SSLConfigurableServerSocket(sSLServerSocket));
        return sSLServerSocket;
    }
}