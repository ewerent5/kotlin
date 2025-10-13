package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
abstract class w5 extends x5 {

    /* renamed from: b */
    private boolean f11313b;

    w5(z4 z4Var) {
        super(z4Var);
        this.a.f(this);
    }

    protected void j() {
    }

    final boolean k() {
        return this.f11313b;
    }

    protected final void l() {
        if (!k()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void m() {
        if (this.f11313b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (o()) {
            return;
        }
        this.a.o();
        this.f11313b = true;
    }

    public final void n() {
        if (this.f11313b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        j();
        this.a.o();
        this.f11313b = true;
    }

    protected abstract boolean o();
}