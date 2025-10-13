package okhttp3.internal.ws;

import java.io.IOException;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.ws.RealWebSocket;

/* compiled from: TaskQueue.kt */
/* loaded from: classes3.dex */
public final class RealWebSocket$initReaderAndWriter$$inlined$synchronized$lambda$1 extends Task {
    final /* synthetic */ WebSocketExtensions $extensions$inlined;
    final /* synthetic */ String $name;
    final /* synthetic */ String $name$inlined;
    final /* synthetic */ long $pingIntervalNanos$inlined;
    final /* synthetic */ RealWebSocket.Streams $streams$inlined;
    final /* synthetic */ RealWebSocket this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealWebSocket$initReaderAndWriter$$inlined$synchronized$lambda$1(String str, String str2, long j2, RealWebSocket realWebSocket, String str3, RealWebSocket.Streams streams, WebSocketExtensions webSocketExtensions) {
        super(str2, false, 2, null);
        str2 = str;
        nanos = j2;
        this = realWebSocket;
        str = str3;
        streams = streams;
        webSocketExtensions = webSocketExtensions;
    }

    @Override // okhttp3.internal.concurrent.Task
    public long runOnce() throws IOException {
        this.writePingFrame$okhttp();
        return nanos;
    }
}