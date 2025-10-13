package okhttp3.internal.http2;

import i.y.d.l;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: Http2Connection.kt */
/* loaded from: classes3.dex */
public final class Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1 extends Http2Connection.Listener {
    Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1() {
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public void onStream(Http2Stream http2Stream) {
        l.d(http2Stream, "stream");
        http2Stream.close(ErrorCode.REFUSED_STREAM, null);
    }
}