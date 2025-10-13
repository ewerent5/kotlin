package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class y61 extends t61<xq0> {
    private final cy a;

    /* renamed from: b, reason: collision with root package name */
    private final aa0 f10381b;

    /* renamed from: c, reason: collision with root package name */
    private final vf0 f10382c;

    public y61(cy cyVar, aa0 aa0Var, vf0 vf0Var) {
        this.a = cyVar;
        this.f10381b = aa0Var;
        this.f10382c = vf0Var;
    }

    @Override // com.google.android.gms.internal.ads.t61
    protected final g52<xq0> c(qp1 qp1Var, Bundle bundle) {
        cr0 cr0VarV = this.a.v();
        aa0 aa0Var = this.f10381b;
        aa0Var.b(qp1Var);
        aa0Var.c(bundle);
        cr0VarV.l(aa0Var.d());
        cr0VarV.d(this.f10382c);
        w70<xq0> w70VarZzc = cr0VarV.zza().zzc();
        return w70VarZzc.c(w70VarZzc.b());
    }
}