package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class q90 implements mo2<p90> {
    private final wo2<gb0> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<xo1> f8348b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<ScheduledExecutorService> f8349c;

    /* renamed from: d, reason: collision with root package name */
    private final wo2<Executor> f8350d;

    public q90(wo2<gb0> wo2Var, wo2<xo1> wo2Var2, wo2<ScheduledExecutorService> wo2Var3, wo2<Executor> wo2Var4) {
        this.a = wo2Var;
        this.f8348b = wo2Var2;
        this.f8349c = wo2Var3;
        this.f8350d = wo2Var4;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        gb0 gb0VarZzb = this.a.zzb();
        xo1 xo1VarA = ((j70) this.f8348b).a();
        ScheduledExecutorService scheduledExecutorServiceZzb = this.f8349c.zzb();
        h52 h52Var = qr.a;
        ro2.b(h52Var);
        return new p90(gb0VarZzb, xo1VarA, scheduledExecutorServiceZzb, h52Var);
    }
}