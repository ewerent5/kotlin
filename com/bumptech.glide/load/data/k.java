package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.p.d.w;
import java.io.InputStream;

/* compiled from: InputStreamRewinder.java */
/* loaded from: classes.dex */
public final class k implements e<InputStream> {
    private final w a;

    /* compiled from: InputStreamRewinder.java */
    public static final class a implements e.a<InputStream> {
        private final com.bumptech.glide.load.n.a0.b a;

        public a(com.bumptech.glide.load.n.a0.b bVar) {
            this.a = bVar;
        }

        @Override // com.bumptech.glide.load.data.e.a
        public Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public e<InputStream> b(InputStream inputStream) {
            return new k(inputStream, this.a);
        }
    }

    public k(InputStream inputStream, com.bumptech.glide.load.n.a0.b bVar) {
        w wVar = new w(inputStream, bVar);
        this.a = wVar;
        wVar.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
        this.a.d();
    }

    public void c() {
        this.a.c();
    }

    @Override // com.bumptech.glide.load.data.e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InputStream a() {
        this.a.reset();
        return this.a;
    }
}