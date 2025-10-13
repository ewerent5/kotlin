package okhttp3.internal.http2;

import i.s;
import okhttp3.internal.concurrent.Task;

/* compiled from: TaskQueue.kt */
/* loaded from: classes3.dex */
public final class Http2Connection$pushResetLater$$inlined$execute$1 extends Task {
    final /* synthetic */ boolean $cancelable;
    final /* synthetic */ ErrorCode $errorCode$inlined;
    final /* synthetic */ String $name;
    final /* synthetic */ int $streamId$inlined;
    final /* synthetic */ Http2Connection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Http2Connection$pushResetLater$$inlined$execute$1(String str, boolean z, String str2, boolean z2, Http2Connection http2Connection, int i2, ErrorCode errorCode) {
        super(str2, z2);
        str = str;
        z = z;
        this = http2Connection;
        i2 = i2;
        errorCode = errorCode;
    }

    @Override // okhttp3.internal.concurrent.Task
    public long runOnce() {
        this.pushObserver.onReset(i2, errorCode);
        synchronized (this) {
            this.currentPushRequests.remove(Integer.valueOf(i2));
            s sVar = s.a;
        }
        return -1L;
    }
}