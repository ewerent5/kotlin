package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
abstract class f5 extends d2 {

    /* renamed from: b */
    private boolean f10868b;

    f5(z4 z4Var) {
        super(z4Var);
        this.a.e(this);
    }

    final boolean q() {
        return this.f10868b;
    }

    protected final void r() {
        if (!q()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void s() {
        if (this.f10868b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (u()) {
            return;
        }
        this.a.o();
        this.f10868b = true;
    }

    public final void t() {
        if (this.f10868b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        v();
        this.a.o();
        this.f10868b = true;
    }

    protected abstract boolean u();

    protected void v() {
    }
}