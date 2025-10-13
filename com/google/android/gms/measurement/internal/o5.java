package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
final class o5 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ r f11083e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ ka f11084f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ e5 f11085g;

    o5(e5 e5Var, r rVar, ka kaVar) {
        this.f11085g = e5Var;
        this.f11083e = rVar;
        this.f11084f = kaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r rVarJ4 = this.f11085g.J4(this.f11083e, this.f11084f);
        this.f11085g.f10830e.f0();
        this.f11085g.f10830e.l(rVarJ4, this.f11084f);
    }
}