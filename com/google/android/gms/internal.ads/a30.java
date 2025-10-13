package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class a30 implements mo2<t20> {
    private final wo2<r13> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<ef> f4826b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<Executor> f4827c;

    public a30(wo2<r13> wo2Var, wo2<ef> wo2Var2, wo2<Executor> wo2Var3) {
        this.a = wo2Var;
        this.f4826b = wo2Var2;
        this.f4827c = wo2Var3;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        r13 r13VarZzb = this.a.zzb();
        ef efVarZzb = this.f4826b.zzb();
        h52 h52VarA = es1.a();
        ro2.b(h52VarA);
        return new t20(r13VarZzb.d(), efVarZzb, h52VarA);
    }
}