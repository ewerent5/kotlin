package okhttp3.internal.http2;

import java.io.IOException;
import okhttp3.internal.concurrent.Task;

/* compiled from: TaskQueue.kt */
/* loaded from: classes3.dex */
public final class Http2Connection$$special$$inlined$schedule$1 extends Task {
    final /* synthetic */ String $name;
    final /* synthetic */ long $pingIntervalNanos$inlined;
    final /* synthetic */ Http2Connection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Http2Connection$$special$$inlined$schedule$1(String str, String str2, Http2Connection http2Connection, long j2) {
        super(str2, false, 2, null);
        str = str;
        this = http2Connection;
        nanos = j2;
    }

    @Override // okhttp3.internal.concurrent.Task
    public long runOnce() throws IOException {
        boolean z;
        synchronized (this) {
            if (this.intervalPongsReceived < this.intervalPingsSent) {
                z = true;
            } else {
                this.intervalPingsSent++;
                z = false;
            }
        }
        if (z) {
            this.failConnection(null);
            return -1L;
        }
        this.writePing(false, 1, 0);
        return nanos;
    }
}