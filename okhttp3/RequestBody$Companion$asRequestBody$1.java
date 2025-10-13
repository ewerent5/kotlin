package okhttp3;

import i.y.d.l;
import j.d0;
import j.g;
import j.q;
import java.io.File;

/* compiled from: RequestBody.kt */
/* loaded from: classes3.dex */
public final class RequestBody$Companion$asRequestBody$1 extends RequestBody {
    final /* synthetic */ MediaType $contentType;
    final /* synthetic */ File $this_asRequestBody;

    RequestBody$Companion$asRequestBody$1(File file, MediaType mediaType) {
        file = file;
        mediaType = mediaType;
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        return file.length();
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return mediaType;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(g gVar) {
        l.d(gVar, "sink");
        d0 d0VarJ = q.j(file);
        try {
            gVar.m0(d0VarJ);
            i.x.a.a(d0VarJ, null);
        } finally {
        }
    }
}