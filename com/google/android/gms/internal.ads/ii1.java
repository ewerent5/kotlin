package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ii1 implements mo2<gi1> {
    private final wo2<hq> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<Integer> f6534b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<Context> f6535c;

    /* renamed from: d, reason: collision with root package name */
    private final wo2<oq> f6536d;

    /* renamed from: e, reason: collision with root package name */
    private final wo2<ScheduledExecutorService> f6537e;

    /* renamed from: f, reason: collision with root package name */
    private final wo2<Executor> f6538f;

    public ii1(wo2<hq> wo2Var, wo2<Integer> wo2Var2, wo2<Context> wo2Var3, wo2<oq> wo2Var4, wo2<ScheduledExecutorService> wo2Var5, wo2<Executor> wo2Var6) {
        this.a = wo2Var;
        this.f6534b = wo2Var2;
        this.f6535c = wo2Var3;
        this.f6536d = wo2Var4;
        this.f6537e = wo2Var5;
        this.f6538f = wo2Var6;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        hq hqVar = new hq();
        int iIntValue = ((ej1) this.f6534b).zzb().intValue();
        Context contextA = ((hy) this.f6535c).a();
        oq oqVarZzb = this.f6536d.zzb();
        ScheduledExecutorService scheduledExecutorServiceZzb = this.f6537e.zzb();
        h52 h52Var = qr.a;
        ro2.b(h52Var);
        return new gi1(hqVar, iIntValue, contextA, oqVarZzb, scheduledExecutorServiceZzb, h52Var, null);
    }
}