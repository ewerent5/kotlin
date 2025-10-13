package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class t8 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ n3 f11243e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ s8 f11244f;

    t8(s8 s8Var, n3 n3Var) {
        this.f11244f = s8Var;
        this.f11243e = n3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f11244f) {
            s8.c(this.f11244f, false);
            if (!this.f11244f.f11213c.Q()) {
                this.f11244f.f11213c.zzq().H().a("Connected to remote service");
                this.f11244f.f11213c.F(this.f11243e);
            }
        }
    }
}