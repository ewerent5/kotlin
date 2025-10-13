package com.bumptech.glide.r.j;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.r.k.b;

/* compiled from: ImageViewTarget.java */
/* loaded from: classes.dex */
public abstract class e<Z> extends i<ImageView, Z> implements b.a {

    /* renamed from: l, reason: collision with root package name */
    private Animatable f4218l;

    public e(ImageView imageView) {
        super(imageView);
    }

    private void o(Z z) {
        if (!(z instanceof Animatable)) {
            this.f4218l = null;
            return;
        }
        Animatable animatable = (Animatable) z;
        this.f4218l = animatable;
        animatable.start();
    }

    private void r(Z z) {
        q(z);
        o(z);
    }

    @Override // com.bumptech.glide.r.j.h
    public void b(Z z, com.bumptech.glide.r.k.b<? super Z> bVar) {
        if (bVar == null || !bVar.a(z, this)) {
            r(z);
        } else {
            o(z);
        }
    }

    @Override // com.bumptech.glide.r.j.a, com.bumptech.glide.r.j.h
    public void d(Drawable drawable) {
        super.d(drawable);
        r(null);
        p(drawable);
    }

    @Override // com.bumptech.glide.r.j.i, com.bumptech.glide.r.j.a, com.bumptech.glide.r.j.h
    public void e(Drawable drawable) {
        super.e(drawable);
        r(null);
        p(drawable);
    }

    @Override // com.bumptech.glide.r.j.i, com.bumptech.glide.r.j.a, com.bumptech.glide.r.j.h
    public void g(Drawable drawable) {
        super.g(drawable);
        Animatable animatable = this.f4218l;
        if (animatable != null) {
            animatable.stop();
        }
        r(null);
        p(drawable);
    }

    @Override // com.bumptech.glide.r.j.a, com.bumptech.glide.o.m
    public void h() {
        Animatable animatable = this.f4218l;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // com.bumptech.glide.r.j.a, com.bumptech.glide.o.m
    public void l() {
        Animatable animatable = this.f4218l;
        if (animatable != null) {
            animatable.stop();
        }
    }

    public void p(Drawable drawable) {
        ((ImageView) this.f4221g).setImageDrawable(drawable);
    }

    protected abstract void q(Z z);
}