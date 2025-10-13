package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ty0 implements mo2<sy0> {
    private final wo2<ScheduledExecutorService> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<h52> f9294b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<iz0> f9295c;

    /* renamed from: d, reason: collision with root package name */
    private final wo2<v01> f9296d;

    public ty0(wo2<ScheduledExecutorService> wo2Var, wo2<h52> wo2Var2, wo2<iz0> wo2Var3, wo2<v01> wo2Var4) {
        this.a = wo2Var;
        this.f9294b = wo2Var2;
        this.f9295c = wo2Var3;
        this.f9296d = wo2Var4;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final sy0 zzb() {
        ScheduledExecutorService scheduledExecutorServiceZzb = this.a.zzb();
        h52 h52Var = qr.a;
        ro2.b(h52Var);
        return new sy0(scheduledExecutorServiceZzb, h52Var, ((kz0) this.f9295c).zzb(), lo2.b(this.f9296d));
    }
}