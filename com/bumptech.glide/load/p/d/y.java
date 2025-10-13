package com.bumptech.glide.load.p.d;

import android.graphics.Bitmap;
import com.bumptech.glide.load.p.d.m;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: StreamBitmapDecoder.java */
/* loaded from: classes.dex */
public class y implements com.bumptech.glide.load.k<InputStream, Bitmap> {
    private final m a;

    /* renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.n.a0.b f4019b;

    /* compiled from: StreamBitmapDecoder.java */
    static class a implements m.b {
        private final w a;

        /* renamed from: b, reason: collision with root package name */
        private final com.bumptech.glide.t.d f4020b;

        a(w wVar, com.bumptech.glide.t.d dVar) {
            this.a = wVar;
            this.f4020b = dVar;
        }

        @Override // com.bumptech.glide.load.p.d.m.b
        public void a(com.bumptech.glide.load.n.a0.e eVar, Bitmap bitmap) throws IOException {
            IOException iOExceptionB = this.f4020b.b();
            if (iOExceptionB != null) {
                if (bitmap == null) {
                    throw iOExceptionB;
                }
                eVar.c(bitmap);
                throw iOExceptionB;
            }
        }

        @Override // com.bumptech.glide.load.p.d.m.b
        public void b() {
            this.a.c();
        }
    }

    public y(m mVar, com.bumptech.glide.load.n.a0.b bVar) {
        this.a = mVar;
        this.f4019b = bVar;
    }

    @Override // com.bumptech.glide.load.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.n.v<Bitmap> b(InputStream inputStream, int i2, int i3, com.bumptech.glide.load.i iVar) {
        w wVar;
        boolean z;
        if (inputStream instanceof w) {
            wVar = (w) inputStream;
            z = false;
        } else {
            wVar = new w(inputStream, this.f4019b);
            z = true;
        }
        com.bumptech.glide.t.d dVarC = com.bumptech.glide.t.d.c(wVar);
        try {
            return this.a.g(new com.bumptech.glide.t.h(dVarC), i2, i3, iVar, new a(wVar, dVarC));
        } finally {
            dVarC.d();
            if (z) {
                wVar.d();
            }
        }
    }

    @Override // com.bumptech.glide.load.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(InputStream inputStream, com.bumptech.glide.load.i iVar) {
        return this.a.p(inputStream);
    }
}