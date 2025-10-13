package okhttp3;

import i.y.d.l;
import j.g;

/* compiled from: RequestBody.kt */
/* loaded from: classes3.dex */
public final class RequestBody$Companion$toRequestBody$2 extends RequestBody {
    final /* synthetic */ int $byteCount;
    final /* synthetic */ MediaType $contentType;
    final /* synthetic */ int $offset;
    final /* synthetic */ byte[] $this_toRequestBody;

    RequestBody$Companion$toRequestBody$2(byte[] bArr, MediaType mediaType, int i2, int i3) {
        bArr = bArr;
        mediaType = mediaType;
        i3 = i2;
        i2 = i3;
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        return i3;
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return mediaType;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(g gVar) {
        l.d(gVar, "sink");
        gVar.g0(bArr, i2, i3);
    }
}