package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class bn1 implements mo2<an1> {
    private final wo2<Context> a;

    /* renamed from: b */
    private final wo2<Executor> f5145b;

    /* renamed from: c */
    private final wo2<cy> f5146c;

    /* renamed from: d */
    private final wo2<wa1> f5147d;

    /* renamed from: e */
    private final wo2<ao1> f5148e;

    /* renamed from: f */
    private final wo2<pp1> f5149f;

    public bn1(wo2<Context> wo2Var, wo2<Executor> wo2Var2, wo2<cy> wo2Var3, wo2<wa1> wo2Var4, wo2<ao1> wo2Var5, wo2<pp1> wo2Var6) {
        this.a = wo2Var;
        this.f5145b = wo2Var2;
        this.f5146c = wo2Var3;
        this.f5147d = wo2Var4;
        this.f5148e = wo2Var5;
        this.f5149f = wo2Var6;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new an1(this.a.zzb(), this.f5145b.zzb(), this.f5146c.zzb(), this.f5147d.zzb(), this.f5148e.zzb(), new pp1());
    }
}