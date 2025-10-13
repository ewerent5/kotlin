package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class qn0 implements ib0 {

    /* renamed from: e, reason: collision with root package name */
    private final tl0 f8414e;

    /* renamed from: f, reason: collision with root package name */
    private final zl0 f8415f;

    public qn0(tl0 tl0Var, zl0 zl0Var) {
        this.f8414e = tl0Var;
        this.f8415f = zl0Var;
    }

    @Override // com.google.android.gms.internal.ads.ib0
    public final void b() {
        if (this.f8414e.q() == null) {
            return;
        }
        ew ewVarP = this.f8414e.p();
        ew ewVarO = this.f8414e.o();
        if (ewVarP == null) {
            ewVarP = ewVarO != null ? ewVarO : null;
        }
        if (!this.f8415f.d() || ewVarP == null) {
            return;
        }
        ewVarP.e0("onSdkImpression", new c.e.a());
    }
}