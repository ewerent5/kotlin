package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class q40 implements mo2<ed0> {
    private final wo2<ScheduledExecutorService> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<com.google.android.gms.common.util.f> f8323b;

    public q40(wo2<ScheduledExecutorService> wo2Var, wo2<com.google.android.gms.common.util.f> wo2Var2) {
        this.a = wo2Var;
        this.f8323b = wo2Var2;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ed0 zzb() {
        return new ed0(this.a.zzb(), this.f8323b.zzb());
    }
}