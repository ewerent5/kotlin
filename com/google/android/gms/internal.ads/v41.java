package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class v41 extends fh {

    /* renamed from: e, reason: collision with root package name */
    private final m31<th, h51> f9651e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ w41 f9652f;

    /* synthetic */ v41(w41 w41Var, m31 m31Var, u41 u41Var) {
        this.f9652f = w41Var;
        this.f9651e = m31Var;
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final void b(String str) {
        ((h51) this.f9651e.f7413c).D4(0, str);
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final void e(g93 g93Var) {
        ((h51) this.f9651e.f7413c).v0(g93Var);
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final void i(e.c.b.b.b.b bVar) {
        this.f9652f.f9888c = (View) e.c.b.b.b.d.Y(bVar);
        ((h51) this.f9651e.f7413c).zzj();
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final void k1(cg cgVar) {
        this.f9652f.f9889d = cgVar;
        ((h51) this.f9651e.f7413c).zzj();
    }
}