package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class au0 implements jd0, dc0, ta0 {

    /* renamed from: e, reason: collision with root package name */
    private final ju0 f5002e;

    /* renamed from: f, reason: collision with root package name */
    private final su0 f5003f;

    public au0(ju0 ju0Var, su0 su0Var) {
        this.f5002e = ju0Var;
        this.f5003f = su0Var;
    }

    @Override // com.google.android.gms.internal.ads.ta0
    public final void B0(g93 g93Var) {
        this.f5002e.c().put("action", "ftl");
        this.f5002e.c().put("ftl", String.valueOf(g93Var.f6091e));
        this.f5002e.c().put("ed", g93Var.f6093g);
        this.f5003f.a(this.f5002e.c());
    }

    @Override // com.google.android.gms.internal.ads.jd0
    public final void R(kp1 kp1Var) {
        this.f5002e.a(kp1Var);
    }

    @Override // com.google.android.gms.internal.ads.dc0
    public final void b0() {
        this.f5002e.c().put("action", "loaded");
        this.f5003f.a(this.f5002e.c());
    }

    @Override // com.google.android.gms.internal.ads.jd0
    public final void f(ql qlVar) {
        this.f5002e.b(qlVar.f8401e);
    }
}