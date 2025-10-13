package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class f11 implements jd0, dc0, ta0 {

    /* renamed from: e, reason: collision with root package name */
    private final bu1 f5764e;

    /* renamed from: f, reason: collision with root package name */
    private final cu1 f5765f;

    /* renamed from: g, reason: collision with root package name */
    private final sq f5766g;

    public f11(bu1 bu1Var, cu1 cu1Var, sq sqVar) {
        this.f5764e = bu1Var;
        this.f5765f = cu1Var;
        this.f5766g = sqVar;
    }

    @Override // com.google.android.gms.internal.ads.ta0
    public final void B0(g93 g93Var) {
        bu1 bu1Var = this.f5764e;
        bu1Var.c("action", "ftl");
        bu1Var.c("ftl", String.valueOf(g93Var.f6091e));
        bu1Var.c("ed", g93Var.f6093g);
        this.f5765f.b(this.f5764e);
    }

    @Override // com.google.android.gms.internal.ads.jd0
    public final void R(kp1 kp1Var) {
        this.f5764e.g(kp1Var, this.f5766g);
    }

    @Override // com.google.android.gms.internal.ads.dc0
    public final void b0() {
        cu1 cu1Var = this.f5765f;
        bu1 bu1Var = this.f5764e;
        bu1Var.c("action", "loaded");
        cu1Var.b(bu1Var);
    }

    @Override // com.google.android.gms.internal.ads.jd0
    public final void f(ql qlVar) {
        this.f5764e.f(qlVar.f8401e);
    }
}