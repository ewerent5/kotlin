package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class aa1 extends r {

    /* renamed from: e, reason: collision with root package name */
    private final Context f4884e;

    /* renamed from: f, reason: collision with root package name */
    private final cy f4885f;

    /* renamed from: g, reason: collision with root package name */
    final pp1 f4886g;

    /* renamed from: h, reason: collision with root package name */
    final em0 f4887h;

    /* renamed from: i, reason: collision with root package name */
    private j f4888i;

    public aa1(cy cyVar, Context context, String str) {
        pp1 pp1Var = new pp1();
        this.f4886g = pp1Var;
        this.f4887h = new em0();
        this.f4885f = cyVar;
        pp1Var.u(str);
        this.f4884e = context;
    }

    @Override // com.google.android.gms.internal.ads.s
    public final void B3(e8 e8Var) {
        this.f4887h.c(e8Var);
    }

    @Override // com.google.android.gms.internal.ads.s
    public final void F0(o7 o7Var) {
        this.f4887h.b(o7Var);
    }

    @Override // com.google.android.gms.internal.ads.s
    public final void G4(String str, x7 x7Var, u7 u7Var) {
        this.f4887h.f(str, x7Var, u7Var);
    }

    @Override // com.google.android.gms.internal.ads.s
    public final void K3(jc jcVar) {
        this.f4886g.E(jcVar);
    }

    @Override // com.google.android.gms.internal.ads.s
    public final void V3(g6 g6Var) {
        this.f4886g.C(g6Var);
    }

    @Override // com.google.android.gms.internal.ads.s
    public final void X3(r7 r7Var) {
        this.f4887h.a(r7Var);
    }

    @Override // com.google.android.gms.internal.ads.s
    public final void b0(j jVar) {
        this.f4888i = jVar;
    }

    @Override // com.google.android.gms.internal.ads.s
    public final void b2(PublisherAdViewOptions publisherAdViewOptions) {
        this.f4886g.F(publisherAdViewOptions);
    }

    @Override // com.google.android.gms.internal.ads.s
    public final void g0(tc tcVar) {
        this.f4887h.e(tcVar);
    }

    @Override // com.google.android.gms.internal.ads.s
    public final void k2(i0 i0Var) {
        this.f4886g.n(i0Var);
    }

    @Override // com.google.android.gms.internal.ads.s
    public final void p1(b8 b8Var, r93 r93Var) {
        this.f4887h.d(b8Var);
        this.f4886g.r(r93Var);
    }

    @Override // com.google.android.gms.internal.ads.s
    public final void x1(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.f4886g.G(adManagerAdViewOptions);
    }

    @Override // com.google.android.gms.internal.ads.s
    public final p zze() {
        fm0 fm0VarG = this.f4887h.g();
        this.f4886g.A(fm0VarG.h());
        this.f4886g.B(fm0VarG.i());
        pp1 pp1Var = this.f4886g;
        if (pp1Var.t() == null) {
            pp1Var.r(r93.I());
        }
        return new ba1(this.f4884e, this.f4885f, this.f4886g, fm0VarG, this.f4888i);
    }
}