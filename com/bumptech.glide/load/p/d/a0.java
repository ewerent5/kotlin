package com.bumptech.glide.load.p.d;

import android.graphics.Bitmap;

/* compiled from: UnitBitmapDecoder.java */
/* loaded from: classes.dex */
public final class a0 implements com.bumptech.glide.load.k<Bitmap, Bitmap> {

    /* compiled from: UnitBitmapDecoder.java */
    private static final class a implements com.bumptech.glide.load.n.v<Bitmap> {

        /* renamed from: e, reason: collision with root package name */
        private final Bitmap f3953e;

        a(Bitmap bitmap) {
            this.f3953e = bitmap;
        }

        @Override // com.bumptech.glide.load.n.v
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bitmap get() {
            return this.f3953e;
        }

        @Override // com.bumptech.glide.load.n.v
        public void b() {
        }

        @Override // com.bumptech.glide.load.n.v
        public int c() {
            return com.bumptech.glide.t.k.g(this.f3953e);
        }

        @Override // com.bumptech.glide.load.n.v
        public Class<Bitmap> d() {
            return Bitmap.class;
        }
    }

    @Override // com.bumptech.glide.load.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.n.v<Bitmap> b(Bitmap bitmap, int i2, int i3, com.bumptech.glide.load.i iVar) {
        return new a(bitmap);
    }

    @Override // com.bumptech.glide.load.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Bitmap bitmap, com.bumptech.glide.load.i iVar) {
        return true;
    }
}