package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
final class h5 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ ka f10913e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ e5 f10914f;

    h5(e5 e5Var, ka kaVar) {
        this.f10914f = e5Var;
        this.f10913e = kaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10914f.f10830e.f0();
        t9 t9Var = this.f10914f.f10830e;
        ka kaVar = this.f10913e;
        t9Var.zzp().d();
        t9Var.d0();
        com.google.android.gms.common.internal.p.f(kaVar.f10989e);
        t9Var.Q(kaVar);
    }
}