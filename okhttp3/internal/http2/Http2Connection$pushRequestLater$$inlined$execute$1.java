package okhttp3.internal.http2;

import java.io.IOException;
import java.util.List;
import okhttp3.internal.concurrent.Task;

/* compiled from: TaskQueue.kt */
/* loaded from: classes3.dex */
public final class Http2Connection$pushRequestLater$$inlined$execute$1 extends Task {
    final /* synthetic */ boolean $cancelable;
    final /* synthetic */ String $name;
    final /* synthetic */ List $requestHeaders$inlined;
    final /* synthetic */ int $streamId$inlined;
    final /* synthetic */ Http2Connection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Http2Connection$pushRequestLater$$inlined$execute$1(String str, boolean z, String str2, boolean z2, Http2Connection http2Connection, int i2, List list) {
        super(str2, z2);
        str = str;
        z = z;
        this = http2Connection;
        i2 = i2;
        list = list;
    }

    @Override // okhttp3.internal.concurrent.Task
    public long runOnce() {
        if (!this.pushObserver.onRequest(i2, list)) {
            return -1L;
        }
        try {
            this.getWriter().rstStream(i2, ErrorCode.CANCEL);
            synchronized (this) {
                this.currentPushRequests.remove(Integer.valueOf(i2));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}