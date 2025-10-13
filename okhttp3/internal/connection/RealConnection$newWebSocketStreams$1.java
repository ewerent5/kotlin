package okhttp3.internal.connection;

import j.g;
import j.h;
import okhttp3.internal.ws.RealWebSocket;

/* compiled from: RealConnection.kt */
/* loaded from: classes3.dex */
public final class RealConnection$newWebSocketStreams$1 extends RealWebSocket.Streams {
    final /* synthetic */ g $sink;
    final /* synthetic */ h $source;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealConnection$newWebSocketStreams$1(h hVar, g gVar, boolean z, h hVar2, g gVar2) {
        super(z, hVar2, gVar2);
        hVar = hVar;
        gVar = gVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        exchange.bodyComplete(-1L, true, true, null);
    }
}