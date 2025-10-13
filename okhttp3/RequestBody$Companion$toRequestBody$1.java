package okhttp3;

import i.y.d.l;
import j.g;

/* compiled from: RequestBody.kt */
/* loaded from: classes3.dex */
public final class RequestBody$Companion$toRequestBody$1 extends RequestBody {
    final /* synthetic */ MediaType $contentType;

    RequestBody$Companion$toRequestBody$1(MediaType mediaType) {
        mediaType = mediaType;
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        return iVar.u();
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return mediaType;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(g gVar) {
        l.d(gVar, "sink");
        gVar.B0(iVar);
    }
}