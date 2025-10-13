package okhttp3.internal.http2;

import java.io.IOException;
import okhttp3.internal.concurrent.Task;

/* compiled from: TaskQueue.kt */
/* loaded from: classes3.dex */
public final class Http2Connection$sendDegradedPingLater$$inlined$execute$1 extends Task {
    final /* synthetic */ boolean $cancelable;
    final /* synthetic */ String $name;
    final /* synthetic */ Http2Connection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Http2Connection$sendDegradedPingLater$$inlined$execute$1(String str, boolean z, String str2, boolean z2, Http2Connection http2Connection) {
        super(str2, z2);
        str = str;
        z = z;
        this = http2Connection;
    }

    @Override // okhttp3.internal.concurrent.Task
    public long runOnce() throws IOException {
        this.writePing(false, 2, 0);
        return -1L;
    }
}