package okhttp3.internal.http2;

import java.io.IOException;
import java.util.List;
import okhttp3.internal.concurrent.Task;

/* compiled from: TaskQueue.kt */
/* loaded from: classes3.dex */
public final class Http2Connection$pushHeadersLater$$inlined$execute$1 extends Task {
    final /* synthetic */ boolean $cancelable;
    final /* synthetic */ boolean $inFinished$inlined;
    final /* synthetic */ String $name;
    final /* synthetic */ List $requestHeaders$inlined;
    final /* synthetic */ int $streamId$inlined;
    final /* synthetic */ Http2Connection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Http2Connection$pushHeadersLater$$inlined$execute$1(String str, boolean z, String str2, boolean z2, Http2Connection http2Connection, int i2, List list, boolean z3) {
        super(str2, z2);
        str = str;
        z2 = z;
        this = http2Connection;
        i2 = i2;
        list = list;
        z = z3;
    }

    @Override // okhttp3.internal.concurrent.Task
    public long runOnce() {
        boolean zOnHeaders = this.pushObserver.onHeaders(i2, list, z);
        if (zOnHeaders) {
            try {
                this.getWriter().rstStream(i2, ErrorCode.CANCEL);
            } catch (IOException unused) {
                return -1L;
            }
        }
        if (!zOnHeaders && !z) {
            return -1L;
        }
        synchronized (this) {
            this.currentPushRequests.remove(Integer.valueOf(i2));
        }
        return -1L;
    }
}