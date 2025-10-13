package com.google.android.gms.measurement.internal;

import e.c.b.b.c.e.ec;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
final class p5 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ ka f11107e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ e5 f11108f;

    p5(e5 e5Var, ka kaVar) {
        this.f11108f = e5Var;
        this.f11107e = kaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11108f.f10830e.f0();
        t9 t9Var = this.f11108f.f10830e;
        ka kaVar = this.f11107e;
        if (ec.a() && t9Var.G().o(t.L0)) {
            t9Var.zzp().d();
            t9Var.d0();
            com.google.android.gms.common.internal.p.f(kaVar.f10989e);
            d dVarB = d.b(kaVar.A);
            d dVarB2 = t9Var.b(kaVar.f10989e);
            t9Var.zzq().I().c("Setting consent, package, consent", kaVar.f10989e, dVarB);
            t9Var.x(kaVar.f10989e, dVarB);
            if (dVarB.h(dVarB2)) {
                t9Var.s(kaVar);
            }
        }
    }
}