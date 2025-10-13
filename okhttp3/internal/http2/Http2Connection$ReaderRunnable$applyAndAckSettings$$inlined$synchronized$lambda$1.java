package okhttp3.internal.http2;

import i.y.d.t;
import i.y.d.u;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: TaskQueue.kt */
/* loaded from: classes3.dex */
public final class Http2Connection$ReaderRunnable$applyAndAckSettings$$inlined$synchronized$lambda$1 extends Task {
    final /* synthetic */ boolean $cancelable;
    final /* synthetic */ boolean $clearPrevious$inlined;
    final /* synthetic */ t $delta$inlined;
    final /* synthetic */ String $name;
    final /* synthetic */ u $newPeerSettings$inlined;
    final /* synthetic */ Settings $settings$inlined;
    final /* synthetic */ u $streamsToNotify$inlined;
    final /* synthetic */ Http2Connection.ReaderRunnable this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Http2Connection$ReaderRunnable$applyAndAckSettings$$inlined$synchronized$lambda$1(String str, boolean z, String str2, boolean z2, Http2Connection.ReaderRunnable readerRunnable, u uVar, boolean z3, Settings settings, t tVar, u uVar2) {
        super(str2, z2);
        str = str;
        z2 = z;
        this = readerRunnable;
        uVar2 = uVar;
        z = z3;
        settings = settings;
        tVar = tVar;
        uVar = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // okhttp3.internal.concurrent.Task
    public long runOnce() {
        this.this$0.getListener$okhttp().onSettings(this.this$0, (Settings) uVar2.f15893e);
        return -1L;
    }
}