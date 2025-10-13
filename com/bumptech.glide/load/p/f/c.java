package com.bumptech.glide.load.p.f;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.n.v;

/* compiled from: NonOwnedDrawableResource.java */
/* loaded from: classes.dex */
final class c extends b<Drawable> {
    private c(Drawable drawable) {
        super(drawable);
    }

    static v<Drawable> f(Drawable drawable) {
        if (drawable != null) {
            return new c(drawable);
        }
        return null;
    }

    @Override // com.bumptech.glide.load.n.v
    public void b() {
    }

    @Override // com.bumptech.glide.load.n.v
    public int c() {
        return Math.max(1, this.f4026e.getIntrinsicWidth() * this.f4026e.getIntrinsicHeight() * 4);
    }

    @Override // com.bumptech.glide.load.n.v
    public Class<Drawable> d() {
        return this.f4026e.getClass();
    }
}