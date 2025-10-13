package com.bumptech.glide.load.p.d;

import android.graphics.Bitmap;

/* compiled from: BitmapResource.java */
/* loaded from: classes.dex */
public class e implements com.bumptech.glide.load.n.v<Bitmap>, com.bumptech.glide.load.n.r {

    /* renamed from: e, reason: collision with root package name */
    private final Bitmap f3965e;

    /* renamed from: f, reason: collision with root package name */
    private final com.bumptech.glide.load.n.a0.e f3966f;

    public e(Bitmap bitmap, com.bumptech.glide.load.n.a0.e eVar) {
        this.f3965e = (Bitmap) com.bumptech.glide.t.j.e(bitmap, "Bitmap must not be null");
        this.f3966f = (com.bumptech.glide.load.n.a0.e) com.bumptech.glide.t.j.e(eVar, "BitmapPool must not be null");
    }

    public static e f(Bitmap bitmap, com.bumptech.glide.load.n.a0.e eVar) {
        if (bitmap == null) {
            return null;
        }
        return new e(bitmap, eVar);
    }

    @Override // com.bumptech.glide.load.n.r
    public void a() {
        this.f3965e.prepareToDraw();
    }

    @Override // com.bumptech.glide.load.n.v
    public void b() {
        this.f3966f.c(this.f3965e);
    }

    @Override // com.bumptech.glide.load.n.v
    public int c() {
        return com.bumptech.glide.t.k.g(this.f3965e);
    }

    @Override // com.bumptech.glide.load.n.v
    public Class<Bitmap> d() {
        return Bitmap.class;
    }

    @Override // com.bumptech.glide.load.n.v
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Bitmap get() {
        return this.f3965e;
    }
}