package okhttp3;

import j.i;

/* compiled from: WebSocket.kt */
/* loaded from: classes3.dex */
public interface WebSocket {

    /* compiled from: WebSocket.kt */
    public interface Factory {
        WebSocket newWebSocket(Request request, WebSocketListener webSocketListener);
    }

    void cancel();

    boolean close(int i2, String str);

    long queueSize();

    Request request();

    boolean send(i iVar);

    boolean send(String str);
}