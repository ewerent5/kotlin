package com.bumptech.glide.load.p.d;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* compiled from: LazyBitmapDrawableResource.java */
/* loaded from: classes.dex */
public final class u implements com.bumptech.glide.load.n.v<BitmapDrawable>, com.bumptech.glide.load.n.r {

    /* renamed from: e, reason: collision with root package name */
    private final Resources f4010e;

    /* renamed from: f, reason: collision with root package name */
    private final com.bumptech.glide.load.n.v<Bitmap> f4011f;

    private u(Resources resources, com.bumptech.glide.load.n.v<Bitmap> vVar) {
        this.f4010e = (Resources) com.bumptech.glide.t.j.d(resources);
        this.f4011f = (com.bumptech.glide.load.n.v) com.bumptech.glide.t.j.d(vVar);
    }

    public static com.bumptech.glide.load.n.v<BitmapDrawable> f(Resources resources, com.bumptech.glide.load.n.v<Bitmap> vVar) {
        if (vVar == null) {
            return null;
        }
        return new u(resources, vVar);
    }

    @Override // com.bumptech.glide.load.n.r
    public void a() {
        com.bumptech.glide.load.n.v<Bitmap> vVar = this.f4011f;
        if (vVar instanceof com.bumptech.glide.load.n.r) {
            ((com.bumptech.glide.load.n.r) vVar).a();
        }
    }

    @Override // com.bumptech.glide.load.n.v
    public void b() {
        this.f4011f.b();
    }

    @Override // com.bumptech.glide.load.n.v
    public int c() {
        return this.f4011f.c();
    }

    @Override // com.bumptech.glide.load.n.v
    public Class<BitmapDrawable> d() {
        return BitmapDrawable.class;
    }

    @Override // com.bumptech.glide.load.n.v
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f4010e, this.f4011f.get());
    }
}