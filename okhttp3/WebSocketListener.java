package okhttp3;

import i.y.d.l;
import j.i;

/* compiled from: WebSocketListener.kt */
/* loaded from: classes3.dex */
public abstract class WebSocketListener {
    public void onClosed(WebSocket webSocket, int i2, String str) {
        l.d(webSocket, "webSocket");
        l.d(str, "reason");
    }

    public void onClosing(WebSocket webSocket, int i2, String str) {
        l.d(webSocket, "webSocket");
        l.d(str, "reason");
    }

    public void onFailure(WebSocket webSocket, Throwable th, Response response) {
        l.d(webSocket, "webSocket");
        l.d(th, "t");
    }

    public void onMessage(WebSocket webSocket, i iVar) {
        l.d(webSocket, "webSocket");
        l.d(iVar, "bytes");
    }

    public void onMessage(WebSocket webSocket, String str) {
        l.d(webSocket, "webSocket");
        l.d(str, "text");
    }

    public void onOpen(WebSocket webSocket, Response response) {
        l.d(webSocket, "webSocket");
        l.d(response, "response");
    }
}