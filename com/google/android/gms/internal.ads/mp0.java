package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class mp0 implements mo2<kp0> {
    private final wo2<Executor> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<j30> f7520b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<ph0> f7521c;

    public mp0(wo2<Executor> wo2Var, wo2<j30> wo2Var2, wo2<ph0> wo2Var3) {
        this.a = wo2Var;
        this.f7520b = wo2Var2;
        this.f7521c = wo2Var3;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new kp0(this.a.zzb(), this.f7520b.zzb(), this.f7521c.zzb());
    }
}