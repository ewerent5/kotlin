package ch.qos.logback.classic.net.server;

import ch.qos.logback.core.net.server.ServerSocketListener;
import java.net.ServerSocket;
import java.net.Socket;

/* loaded from: classes.dex */
class RemoteAppenderServerListener extends ServerSocketListener<RemoteAppenderClient> {
    public RemoteAppenderServerListener(ServerSocket serverSocket) {
        super(serverSocket);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ch.qos.logback.core.net.server.ServerSocketListener
    public RemoteAppenderClient createClient(String str, Socket socket) {
        return new RemoteAppenderStreamClient(str, socket);
    }
}