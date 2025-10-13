package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class sh1 implements mo2<qh1> {
    private final wo2<hq> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<Context> f8866b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<ScheduledExecutorService> f8867c;

    /* renamed from: d, reason: collision with root package name */
    private final wo2<Executor> f8868d;

    /* renamed from: e, reason: collision with root package name */
    private final wo2<Integer> f8869e;

    public sh1(wo2<hq> wo2Var, wo2<Context> wo2Var2, wo2<ScheduledExecutorService> wo2Var3, wo2<Executor> wo2Var4, wo2<Integer> wo2Var5) {
        this.a = wo2Var;
        this.f8866b = wo2Var2;
        this.f8867c = wo2Var3;
        this.f8868d = wo2Var4;
        this.f8869e = wo2Var5;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        hq hqVar = new hq();
        Context contextA = ((hy) this.f8866b).a();
        ScheduledExecutorService scheduledExecutorServiceZzb = this.f8867c.zzb();
        h52 h52Var = qr.a;
        ro2.b(h52Var);
        return new qh1(hqVar, contextA, scheduledExecutorServiceZzb, h52Var, ((ej1) this.f8869e).zzb().intValue(), null);
    }
}