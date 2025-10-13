package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzg;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class um0 implements mo2<tm0> {
    private final wo2<zzg> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<qp1> f9507b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<zl0> f9508c;

    /* renamed from: d, reason: collision with root package name */
    private final wo2<tl0> f9509d;

    /* renamed from: e, reason: collision with root package name */
    private final wo2<fn0> f9510e;

    /* renamed from: f, reason: collision with root package name */
    private final wo2<nn0> f9511f;

    /* renamed from: g, reason: collision with root package name */
    private final wo2<Executor> f9512g;

    /* renamed from: h, reason: collision with root package name */
    private final wo2<Executor> f9513h;

    /* renamed from: i, reason: collision with root package name */
    private final wo2<ql0> f9514i;

    public um0(wo2<zzg> wo2Var, wo2<qp1> wo2Var2, wo2<zl0> wo2Var3, wo2<tl0> wo2Var4, wo2<fn0> wo2Var5, wo2<nn0> wo2Var6, wo2<Executor> wo2Var7, wo2<Executor> wo2Var8, wo2<ql0> wo2Var9) {
        this.a = wo2Var;
        this.f9507b = wo2Var2;
        this.f9508c = wo2Var3;
        this.f9509d = wo2Var4;
        this.f9510e = wo2Var5;
        this.f9511f = wo2Var6;
        this.f9512g = wo2Var7;
        this.f9513h = wo2Var8;
        this.f9514i = wo2Var9;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final tm0 zzb() {
        zzg zzgVarZzb = ((uq1) this.a).zzb();
        qp1 qp1VarA = ((ga0) this.f9507b).a();
        zl0 zl0VarZzb = this.f9508c.zzb();
        tl0 tl0VarA = ((mm0) this.f9509d).a();
        fn0 fn0VarZzb = this.f9510e.zzb();
        nn0 nn0VarZzb = this.f9511f.zzb();
        Executor executorZzb = this.f9512g.zzb();
        h52 h52Var = qr.a;
        ro2.b(h52Var);
        return new tm0(zzgVarZzb, qp1VarA, zl0VarZzb, tl0VarA, fn0VarZzb, nn0VarZzb, executorZzb, h52Var, this.f9514i.zzb());
    }
}