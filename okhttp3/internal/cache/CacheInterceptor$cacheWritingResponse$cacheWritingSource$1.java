package okhttp3.internal.cache;

import i.y.d.l;
import j.d0;
import j.e0;
import j.f;
import j.g;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.Util;

/* compiled from: CacheInterceptor.kt */
/* loaded from: classes3.dex */
public final class CacheInterceptor$cacheWritingResponse$cacheWritingSource$1 implements d0 {
    final /* synthetic */ g $cacheBody;
    final /* synthetic */ CacheRequest $cacheRequest;
    private boolean cacheRequestClosed;

    CacheInterceptor$cacheWritingResponse$cacheWritingSource$1(CacheRequest cacheRequest, g gVar) {
        cacheRequest = cacheRequest;
        gVarC = gVar;
    }

    @Override // j.d0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.cacheRequestClosed && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
            this.cacheRequestClosed = true;
            cacheRequest.abort();
        }
        hVarSource.close();
    }

    @Override // j.d0
    public long read(f fVar, long j2) throws IOException {
        l.d(fVar, "sink");
        try {
            long j3 = hVarSource.read(fVar, j2);
            if (j3 != -1) {
                fVar.j(gVarC.e(), fVar.y0() - j3, j3);
                gVarC.O();
                return j3;
            }
            if (!this.cacheRequestClosed) {
                this.cacheRequestClosed = true;
                gVarC.close();
            }
            return -1L;
        } catch (IOException e2) {
            if (!this.cacheRequestClosed) {
                this.cacheRequestClosed = true;
                cacheRequest.abort();
            }
            throw e2;
        }
    }

    @Override // j.d0
    public e0 timeout() {
        return hVarSource.timeout();
    }
}