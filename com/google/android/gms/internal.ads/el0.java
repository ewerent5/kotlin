package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class el0 implements mo2<j30> {
    private final wo2<r13> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<Executor> f5658b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<Context> f5659c;

    /* renamed from: d, reason: collision with root package name */
    private final wo2<com.google.android.gms.common.util.f> f5660d;

    public el0(wo2<r13> wo2Var, wo2<Executor> wo2Var2, wo2<Context> wo2Var3, wo2<com.google.android.gms.common.util.f> wo2Var4) {
        this.a = wo2Var;
        this.f5658b = wo2Var2;
        this.f5659c = wo2Var3;
        this.f5660d = wo2Var4;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        r13 r13VarZzb = this.a.zzb();
        Executor executorZzb = this.f5658b.zzb();
        Context contextZzb = this.f5659c.zzb();
        return new j30(executorZzb, new u20(contextZzb, r13VarZzb), this.f5660d.zzb());
    }
}