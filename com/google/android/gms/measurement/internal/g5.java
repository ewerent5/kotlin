package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
final class g5 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ wa f10890e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ ka f10891f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ e5 f10892g;

    g5(e5 e5Var, wa waVar, ka kaVar) {
        this.f10892g = e5Var;
        this.f10890e = waVar;
        this.f10891f = kaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10892g.f10830e.f0();
        if (this.f10890e.f11320g.c() == null) {
            this.f10892g.f10830e.P(this.f10890e, this.f10891f);
        } else {
            this.f10892g.f10830e.u(this.f10890e, this.f10891f);
        }
    }
}