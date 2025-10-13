package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class lo1 implements mo2<ko1> {
    private final wo2<Context> a;

    /* renamed from: b */
    private final wo2<Executor> f7281b;

    /* renamed from: c */
    private final wo2<cy> f7282c;

    /* renamed from: d */
    private final wo2<mm1<dr0, xq0>> f7283d;

    /* renamed from: e */
    private final wo2<ao1> f7284e;

    /* renamed from: f */
    private final wo2<pp1> f7285f;

    /* renamed from: g */
    private final wo2<lp1> f7286g;

    public lo1(wo2<Context> wo2Var, wo2<Executor> wo2Var2, wo2<cy> wo2Var3, wo2<mm1<dr0, xq0>> wo2Var4, wo2<ao1> wo2Var5, wo2<pp1> wo2Var6, wo2<lp1> wo2Var7) {
        this.a = wo2Var;
        this.f7281b = wo2Var2;
        this.f7282c = wo2Var3;
        this.f7283d = wo2Var4;
        this.f7284e = wo2Var5;
        this.f7285f = wo2Var6;
        this.f7286g = wo2Var7;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new ko1(this.a.zzb(), this.f7281b.zzb(), this.f7282c.zzb(), ((rm1) this.f7283d).zzb(), this.f7284e.zzb(), new pp1(), this.f7286g.zzb());
    }
}