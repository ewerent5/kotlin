package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class g51 implements mo2<f51> {
    private final wo2<p50> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<l41> f6044b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<sa0> f6045c;

    /* renamed from: d, reason: collision with root package name */
    private final wo2<ScheduledExecutorService> f6046d;

    /* renamed from: e, reason: collision with root package name */
    private final wo2<h52> f6047e;

    public g51(wo2<p50> wo2Var, wo2<l41> wo2Var2, wo2<sa0> wo2Var3, wo2<ScheduledExecutorService> wo2Var4, wo2<h52> wo2Var5) {
        this.a = wo2Var;
        this.f6044b = wo2Var2;
        this.f6045c = wo2Var3;
        this.f6046d = wo2Var4;
        this.f6047e = wo2Var5;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final f51 zzb() {
        p50 p50VarZzb = this.a.zzb();
        l41 l41VarZzb = ((m41) this.f6044b).zzb();
        sa0 sa0VarZzb = this.f6045c.zzb();
        ScheduledExecutorService scheduledExecutorServiceZzb = this.f6046d.zzb();
        h52 h52Var = qr.a;
        ro2.b(h52Var);
        return new f51(p50VarZzb, l41VarZzb, sa0VarZzb, scheduledExecutorServiceZzb, h52Var);
    }
}