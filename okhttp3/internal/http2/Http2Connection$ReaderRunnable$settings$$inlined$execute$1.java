package okhttp3.internal.http2;

import okhttp3.internal.concurrent.Task;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: TaskQueue.kt */
/* loaded from: classes3.dex */
public final class Http2Connection$ReaderRunnable$settings$$inlined$execute$1 extends Task {
    final /* synthetic */ boolean $cancelable;
    final /* synthetic */ boolean $clearPrevious$inlined;
    final /* synthetic */ String $name;
    final /* synthetic */ Settings $settings$inlined;
    final /* synthetic */ Http2Connection.ReaderRunnable this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Http2Connection$ReaderRunnable$settings$$inlined$execute$1(String str, boolean z, String str2, boolean z2, Http2Connection.ReaderRunnable readerRunnable, boolean z3, Settings settings) {
        super(str2, z2);
        str = str;
        z2 = z;
        this = readerRunnable;
        z = z3;
        settings = settings;
    }

    @Override // okhttp3.internal.concurrent.Task
    public long runOnce() {
        this.applyAndAckSettings(z, settings);
        return -1L;
    }
}