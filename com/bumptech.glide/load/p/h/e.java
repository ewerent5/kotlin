package com.bumptech.glide.load.p.h;

import com.bumptech.glide.load.n.r;

/* compiled from: GifDrawableResource.java */
/* loaded from: classes.dex */
public class e extends com.bumptech.glide.load.p.f.b<c> implements r {
    public e(c cVar) {
        super(cVar);
    }

    @Override // com.bumptech.glide.load.p.f.b, com.bumptech.glide.load.n.r
    public void a() {
        ((c) this.f4026e).e().prepareToDraw();
    }

    @Override // com.bumptech.glide.load.n.v
    public void b() {
        ((c) this.f4026e).stop();
        ((c) this.f4026e).k();
    }

    @Override // com.bumptech.glide.load.n.v
    public int c() {
        return ((c) this.f4026e).i();
    }

    @Override // com.bumptech.glide.load.n.v
    public Class<c> d() {
        return c.class;
    }
}