package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class du extends SSLSocketFactory {
    final SSLSocketFactory a = (SSLSocketFactory) SSLSocketFactory.getDefault();

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ eu f5516b;

    du(eu euVar) {
        this.f5516b = euVar;
    }

    private final Socket a(Socket socket) throws SocketException {
        if (this.f5516b.r > 0) {
            socket.setReceiveBufferSize(this.f5516b.r);
        }
        this.f5516b.s.add(socket);
        return socket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i2) throws SocketException {
        Socket socketCreateSocket = this.a.createSocket(str, i2);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.a.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i2, InetAddress inetAddress, int i3) throws SocketException {
        Socket socketCreateSocket = this.a.createSocket(str, i2, inetAddress, i3);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i2) throws SocketException {
        Socket socketCreateSocket = this.a.createSocket(inetAddress, i2);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i2, InetAddress inetAddress2, int i3) throws SocketException {
        Socket socketCreateSocket = this.a.createSocket(inetAddress, i2, inetAddress2, i3);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i2, boolean z) throws IOException {
        Socket socketCreateSocket = this.a.createSocket(socket, str, i2, z);
        a(socketCreateSocket);
        return socketCreateSocket;
    }
}