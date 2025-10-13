package com.bumptech.glide.r.j;

import android.graphics.drawable.Drawable;
import ch.qos.logback.classic.Level;
import com.bumptech.glide.t.k;

/* compiled from: CustomTarget.java */
/* loaded from: classes.dex */
public abstract class c<T> implements h<T> {

    /* renamed from: e, reason: collision with root package name */
    private final int f4215e;

    /* renamed from: f, reason: collision with root package name */
    private final int f4216f;

    /* renamed from: g, reason: collision with root package name */
    private com.bumptech.glide.r.c f4217g;

    public c() {
        this(Level.ALL_INT, Level.ALL_INT);
    }

    @Override // com.bumptech.glide.r.j.h
    public final void a(g gVar) {
    }

    @Override // com.bumptech.glide.r.j.h
    public final void c(com.bumptech.glide.r.c cVar) {
        this.f4217g = cVar;
    }

    @Override // com.bumptech.glide.r.j.h
    public void d(Drawable drawable) {
    }

    @Override // com.bumptech.glide.r.j.h
    public void e(Drawable drawable) {
    }

    @Override // com.bumptech.glide.r.j.h
    public final com.bumptech.glide.r.c f() {
        return this.f4217g;
    }

    @Override // com.bumptech.glide.o.m
    public void h() {
    }

    @Override // com.bumptech.glide.r.j.h
    public final void i(g gVar) {
        gVar.f(this.f4215e, this.f4216f);
    }

    @Override // com.bumptech.glide.o.m
    public void l() {
    }

    @Override // com.bumptech.glide.o.m
    public void onDestroy() {
    }

    public c(int i2, int i3) {
        if (k.s(i2, i3)) {
            this.f4215e = i2;
            this.f4216f = i3;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i2 + " and height: " + i3);
    }
}