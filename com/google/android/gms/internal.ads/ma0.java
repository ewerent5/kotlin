package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ma0 implements mo2<ho> {
    private final la0 a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<Context> f7453b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<kr> f7454c;

    /* renamed from: d, reason: collision with root package name */
    private final wo2<xo1> f7455d;

    /* renamed from: e, reason: collision with root package name */
    private final wo2<Cdo> f7456e;

    public ma0(la0 la0Var, wo2<Context> wo2Var, wo2<kr> wo2Var2, wo2<xo1> wo2Var3, wo2<Cdo> wo2Var4) {
        this.a = la0Var;
        this.f7453b = wo2Var;
        this.f7454c = wo2Var2;
        this.f7455d = wo2Var3;
        this.f7456e = wo2Var4;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextZzb = this.f7453b.zzb();
        kr krVarA = ((qy) this.f7454c).a();
        xo1 xo1VarA = ((j70) this.f7455d).a();
        Cdo cdo = new Cdo();
        eo eoVar = xo1VarA.z;
        if (eoVar != null) {
            return new bo(contextZzb, krVarA, eoVar, xo1VarA.r.f5346b, cdo, null);
        }
        return null;
    }
}