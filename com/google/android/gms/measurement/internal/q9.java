package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
abstract class q9 extends r9 {

    /* renamed from: c, reason: collision with root package name */
    private boolean f11161c;

    q9(t9 t9Var) {
        super(t9Var);
        this.f11187b.o(this);
    }

    final boolean o() {
        return this.f11161c;
    }

    protected final void p() {
        if (!o()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void q() {
        if (this.f11161c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        r();
        this.f11187b.g0();
        this.f11161c = true;
    }

    protected abstract boolean r();
}