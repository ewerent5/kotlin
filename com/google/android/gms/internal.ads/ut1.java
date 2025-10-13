package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ut1 implements mo2<st1> {
    private final wo2<h52> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<ScheduledExecutorService> f9554b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<rt1> f9555c;

    public ut1(wo2<h52> wo2Var, wo2<ScheduledExecutorService> wo2Var2, wo2<rt1> wo2Var3) {
        this.a = wo2Var;
        this.f9554b = wo2Var2;
        this.f9555c = wo2Var3;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        h52 h52Var = qr.a;
        ro2.b(h52Var);
        return new st1(h52Var, this.f9554b.zzb(), ((vt1) this.f9555c).zzb());
    }
}