package okhttp3;

import j.h;

/* compiled from: ResponseBody.kt */
/* loaded from: classes3.dex */
public final class ResponseBody$Companion$asResponseBody$1 extends ResponseBody {
    final /* synthetic */ long $contentLength;
    final /* synthetic */ MediaType $contentType;

    ResponseBody$Companion$asResponseBody$1(MediaType mediaType, long j2) {
        mediaType = mediaType;
        j2 = j2;
    }

    @Override // okhttp3.ResponseBody
    public long contentLength() {
        return j2;
    }

    @Override // okhttp3.ResponseBody
    public MediaType contentType() {
        return mediaType;
    }

    @Override // okhttp3.ResponseBody
    public h source() {
        return hVar;
    }
}