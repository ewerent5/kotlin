package okhttp3.internal.http;

import j.b0;
import j.d0;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.RealConnection;

/* compiled from: ExchangeCodec.kt */
/* loaded from: classes3.dex */
public interface ExchangeCodec {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;

    /* compiled from: ExchangeCodec.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;

        private Companion() {
        }
    }

    void cancel();

    b0 createRequestBody(Request request, long j2);

    void finishRequest();

    void flushRequest();

    RealConnection getConnection();

    d0 openResponseBodySource(Response response);

    Response.Builder readResponseHeaders(boolean z);

    long reportedContentLength(Response response);

    Headers trailers();

    void writeRequestHeaders(Request request);
}