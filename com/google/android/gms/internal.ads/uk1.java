package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class uk1 implements mo2<tk1> {
    private final wo2<Context> a;

    /* renamed from: b */
    private final wo2<Executor> f9482b;

    /* renamed from: c */
    private final wo2<cy> f9483c;

    /* renamed from: d */
    private final wo2<mm1<f40, k40>> f9484d;

    /* renamed from: e */
    private final wo2<rk1> f9485e;

    /* renamed from: f */
    private final wo2<pp1> f9486f;

    public uk1(wo2<Context> wo2Var, wo2<Executor> wo2Var2, wo2<cy> wo2Var3, wo2<mm1<f40, k40>> wo2Var4, wo2<rk1> wo2Var5, wo2<pp1> wo2Var6) {
        this.a = wo2Var;
        this.f9482b = wo2Var2;
        this.f9483c = wo2Var3;
        this.f9484d = wo2Var4;
        this.f9485e = wo2Var5;
        this.f9486f = wo2Var6;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new tk1(this.a.zzb(), this.f9482b.zzb(), this.f9483c.zzb(), ((pm1) this.f9484d).zzb(), this.f9485e.zzb(), new pp1());
    }
}