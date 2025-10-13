package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class pj1 implements mo2<oj1> {
    private final wo2<Context> a;

    /* renamed from: b */
    private final wo2<Executor> f8175b;

    /* renamed from: c */
    private final wo2<cy> f8176c;

    /* renamed from: d */
    private final wo2<mm1<t30, z30>> f8177d;

    /* renamed from: e */
    private final wo2<rk1> f8178e;

    /* renamed from: f */
    private final wo2<pp1> f8179f;

    public pj1(wo2<Context> wo2Var, wo2<Executor> wo2Var2, wo2<cy> wo2Var3, wo2<mm1<t30, z30>> wo2Var4, wo2<rk1> wo2Var5, wo2<pp1> wo2Var6) {
        this.a = wo2Var;
        this.f8175b = wo2Var2;
        this.f8176c = wo2Var3;
        this.f8177d = wo2Var4;
        this.f8178e = wo2Var5;
        this.f8179f = wo2Var6;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new oj1(this.a.zzb(), this.f8175b.zzb(), this.f8176c.zzb(), ((qm1) this.f8177d).zzb(), this.f8178e.zzb(), new pp1());
    }
}