package okhttp3.internal.http2;

import i.y.d.l;
import java.io.IOException;

/* compiled from: StreamResetException.kt */
/* loaded from: classes3.dex */
public final class StreamResetException extends IOException {
    public final ErrorCode errorCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamResetException(ErrorCode errorCode) {
        super("stream was reset: " + errorCode);
        l.d(errorCode, "errorCode");
        this.errorCode = errorCode;
    }
}