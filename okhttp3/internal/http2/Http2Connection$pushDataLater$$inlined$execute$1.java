package okhttp3.internal.http2;

import j.f;
import java.io.IOException;
import okhttp3.internal.concurrent.Task;

/* compiled from: TaskQueue.kt */
/* loaded from: classes3.dex */
public final class Http2Connection$pushDataLater$$inlined$execute$1 extends Task {
    final /* synthetic */ f $buffer$inlined;
    final /* synthetic */ int $byteCount$inlined;
    final /* synthetic */ boolean $cancelable;
    final /* synthetic */ boolean $inFinished$inlined;
    final /* synthetic */ String $name;
    final /* synthetic */ int $streamId$inlined;
    final /* synthetic */ Http2Connection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Http2Connection$pushDataLater$$inlined$execute$1(String str, boolean z, String str2, boolean z2, Http2Connection http2Connection, int i2, f fVar, int i3, boolean z3) {
        super(str2, z2);
        str = str;
        z2 = z;
        this = http2Connection;
        i2 = i2;
        fVar = fVar;
        i3 = i3;
        z = z3;
    }

    @Override // okhttp3.internal.concurrent.Task
    public long runOnce() {
        try {
            boolean zOnData = this.pushObserver.onData(i2, fVar, i3, z);
            if (zOnData) {
                this.getWriter().rstStream(i2, ErrorCode.CANCEL);
            }
            if (!zOnData && !z) {
                return -1L;
            }
            synchronized (this) {
                this.currentPushRequests.remove(Integer.valueOf(i2));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}