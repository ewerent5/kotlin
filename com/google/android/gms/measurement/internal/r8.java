package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class r8 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ n3 f11185e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ s8 f11186f;

    r8(s8 s8Var, n3 n3Var) {
        this.f11186f = s8Var;
        this.f11185e = n3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f11186f) {
            s8.c(this.f11186f, false);
            if (!this.f11186f.f11213c.Q()) {
                this.f11186f.f11213c.zzq().I().a("Connected to service");
                this.f11186f.f11213c.F(this.f11185e);
            }
        }
    }
}