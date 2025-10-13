package okhttp3.internal.http2;

import java.io.IOException;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: TaskQueue.kt */
/* loaded from: classes3.dex */
public final class Http2Connection$ReaderRunnable$ping$$inlined$execute$1 extends Task {
    final /* synthetic */ boolean $cancelable;
    final /* synthetic */ String $name;
    final /* synthetic */ int $payload1$inlined;
    final /* synthetic */ int $payload2$inlined;
    final /* synthetic */ Http2Connection.ReaderRunnable this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Http2Connection$ReaderRunnable$ping$$inlined$execute$1(String str, boolean z, String str2, boolean z2, Http2Connection.ReaderRunnable readerRunnable, int i2, int i3) {
        super(str2, z2);
        str = str;
        z2 = z;
        this = readerRunnable;
        i2 = i2;
        i3 = i3;
    }

    @Override // okhttp3.internal.concurrent.Task
    public long runOnce() throws IOException {
        this.this$0.writePing(true, i2, i3);
        return -1L;
    }
}