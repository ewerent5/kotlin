package okhttp3.internal.http2;

import java.io.IOException;
import okhttp3.internal.concurrent.Task;

/* compiled from: TaskQueue.kt */
/* loaded from: classes3.dex */
public final class Http2Connection$writeWindowUpdateLater$$inlined$execute$1 extends Task {
    final /* synthetic */ boolean $cancelable;
    final /* synthetic */ String $name;
    final /* synthetic */ int $streamId$inlined;
    final /* synthetic */ long $unacknowledgedBytesRead$inlined;
    final /* synthetic */ Http2Connection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Http2Connection$writeWindowUpdateLater$$inlined$execute$1(String str, boolean z, String str2, boolean z2, Http2Connection http2Connection, int i2, long j2) {
        super(str2, z2);
        str = str;
        z = z;
        this = http2Connection;
        i2 = i2;
        j2 = j2;
    }

    @Override // okhttp3.internal.concurrent.Task
    public long runOnce() throws IOException {
        try {
            this.getWriter().windowUpdate(i2, j2);
            return -1L;
        } catch (IOException e2) {
            this.failConnection(e2);
            return -1L;
        }
    }
}