package okhttp3.internal.http;

import i.y.d.l;
import j.h;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* compiled from: RealResponseBody.kt */
/* loaded from: classes3.dex */
public final class RealResponseBody extends ResponseBody {
    private final long contentLength;
    private final String contentTypeString;
    private final h source;

    public RealResponseBody(String str, long j2, h hVar) {
        l.d(hVar, "source");
        this.contentTypeString = str;
        this.contentLength = j2;
        this.source = hVar;
    }

    @Override // okhttp3.ResponseBody
    public long contentLength() {
        return this.contentLength;
    }

    @Override // okhttp3.ResponseBody
    public MediaType contentType() {
        String str = this.contentTypeString;
        if (str != null) {
            return MediaType.Companion.parse(str);
        }
        return null;
    }

    @Override // okhttp3.ResponseBody
    public h source() {
        return this.source;
    }
}