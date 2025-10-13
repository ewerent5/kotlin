package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class u61 extends t61<r40> {
    private final cy a;

    /* renamed from: b, reason: collision with root package name */
    private final aa0 f9392b;

    /* renamed from: c, reason: collision with root package name */
    private final f91 f9393c;

    /* renamed from: d, reason: collision with root package name */
    private final vf0 f9394d;

    /* renamed from: e, reason: collision with root package name */
    private final bk0 f9395e;

    /* renamed from: f, reason: collision with root package name */
    private final ed0 f9396f;

    /* renamed from: g, reason: collision with root package name */
    private final ViewGroup f9397g;

    public u61(cy cyVar, aa0 aa0Var, f91 f91Var, vf0 vf0Var, bk0 bk0Var, ed0 ed0Var, ViewGroup viewGroup) {
        this.a = cyVar;
        this.f9392b = aa0Var;
        this.f9393c = f91Var;
        this.f9394d = vf0Var;
        this.f9395e = bk0Var;
        this.f9396f = ed0Var;
        this.f9397g = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.t61
    protected final g52<r40> c(qp1 qp1Var, Bundle bundle) {
        o50 o50VarN = this.a.n();
        aa0 aa0Var = this.f9392b;
        aa0Var.b(qp1Var);
        aa0Var.c(bundle);
        o50VarN.k(aa0Var.d());
        o50VarN.c(this.f9394d);
        o50VarN.r(this.f9393c);
        o50VarN.i(this.f9395e);
        o50VarN.n(new m60(this.f9396f));
        o50VarN.j(new o40(this.f9397g));
        w70<r40> w70VarB = o50VarN.zza().b();
        return w70VarB.c(w70VarB.b());
    }
}