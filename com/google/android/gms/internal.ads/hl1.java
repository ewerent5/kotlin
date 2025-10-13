package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class hl1 implements mo2<gl1> {
    private final wo2<Context> a;

    /* renamed from: b */
    private final wo2<Executor> f6343b;

    /* renamed from: c */
    private final wo2<r93> f6344c;

    /* renamed from: d */
    private final wo2<cy> f6345d;

    /* renamed from: e */
    private final wo2<wa1> f6346e;

    /* renamed from: f */
    private final wo2<ab1> f6347f;

    /* renamed from: g */
    private final wo2<pp1> f6348g;

    public hl1(wo2<Context> wo2Var, wo2<Executor> wo2Var2, wo2<r93> wo2Var3, wo2<cy> wo2Var4, wo2<wa1> wo2Var5, wo2<ab1> wo2Var6, wo2<pp1> wo2Var7) {
        this.a = wo2Var;
        this.f6343b = wo2Var2;
        this.f6344c = wo2Var3;
        this.f6345d = wo2Var4;
        this.f6346e = wo2Var5;
        this.f6347f = wo2Var6;
        this.f6348g = wo2Var7;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new gl1(this.a.zzb(), this.f6343b.zzb(), this.f6344c.zzb(), this.f6345d.zzb(), this.f6346e.zzb(), this.f6347f.zzb(), new pp1());
    }
}