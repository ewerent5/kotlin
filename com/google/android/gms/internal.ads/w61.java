package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class w61 extends t61<li0> {
    private final cy a;

    /* renamed from: b, reason: collision with root package name */
    private final aa0 f9898b;

    /* renamed from: c, reason: collision with root package name */
    private final f91 f9899c;

    /* renamed from: d, reason: collision with root package name */
    private final vf0 f9900d;

    public w61(cy cyVar, aa0 aa0Var, f91 f91Var, vf0 vf0Var) {
        this.a = cyVar;
        this.f9898b = aa0Var;
        this.f9899c = f91Var;
        this.f9900d = vf0Var;
    }

    @Override // com.google.android.gms.internal.ads.t61
    protected final g52<li0> c(qp1 qp1Var, Bundle bundle) {
        ij0 ij0VarS = this.a.s();
        aa0 aa0Var = this.f9898b;
        aa0Var.b(qp1Var);
        aa0Var.c(bundle);
        ij0VarS.zzc(aa0Var.d());
        ij0VarS.s(this.f9900d);
        ij0VarS.h(this.f9899c);
        w70<li0> w70VarB = ij0VarS.zza().b();
        return w70VarB.c(w70VarB.b());
    }
}