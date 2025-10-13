package okhttp3.internal.http2;

import java.io.IOException;
import java.util.List;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.platform.Platform;

/* compiled from: TaskQueue.kt */
/* loaded from: classes3.dex */
public final class Http2Connection$ReaderRunnable$headers$$inlined$synchronized$lambda$1 extends Task {
    final /* synthetic */ boolean $cancelable;
    final /* synthetic */ List $headerBlock$inlined;
    final /* synthetic */ boolean $inFinished$inlined;
    final /* synthetic */ String $name;
    final /* synthetic */ Http2Stream $newStream$inlined;
    final /* synthetic */ Http2Stream $stream$inlined;
    final /* synthetic */ int $streamId$inlined;
    final /* synthetic */ Http2Connection.ReaderRunnable this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Http2Connection$ReaderRunnable$headers$$inlined$synchronized$lambda$1(String str, boolean z, String str2, boolean z2, Http2Stream http2Stream, Http2Connection.ReaderRunnable readerRunnable, Http2Stream http2Stream2, int i2, List list, boolean z3) {
        super(str2, z2);
        str = str;
        z2 = z;
        http2Stream = http2Stream;
        this = readerRunnable;
        stream = http2Stream2;
        i2 = i2;
        list = list;
        z = z3;
    }

    @Override // okhttp3.internal.concurrent.Task
    public long runOnce() {
        try {
            this.this$0.getListener$okhttp().onStream(http2Stream);
            return -1L;
        } catch (IOException e2) {
            Platform.Companion.get().log("Http2Connection.Listener failure for " + this.this$0.getConnectionName$okhttp(), 4, e2);
            try {
                http2Stream.close(ErrorCode.PROTOCOL_ERROR, e2);
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }
}