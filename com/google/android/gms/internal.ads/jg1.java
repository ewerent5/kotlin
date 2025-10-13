package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class jg1 implements mo2<hg1> {
    private final wo2<h52> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<ScheduledExecutorService> f6751b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<String> f6752c;

    /* renamed from: d, reason: collision with root package name */
    private final wo2<t91> f6753d;

    /* renamed from: e, reason: collision with root package name */
    private final wo2<Context> f6754e;

    /* renamed from: f, reason: collision with root package name */
    private final wo2<qp1> f6755f;

    /* renamed from: g, reason: collision with root package name */
    private final wo2<o91> f6756g;

    public jg1(wo2<h52> wo2Var, wo2<ScheduledExecutorService> wo2Var2, wo2<String> wo2Var3, wo2<t91> wo2Var4, wo2<Context> wo2Var5, wo2<qp1> wo2Var6, wo2<o91> wo2Var7) {
        this.a = wo2Var;
        this.f6751b = wo2Var2;
        this.f6752c = wo2Var3;
        this.f6753d = wo2Var4;
        this.f6754e = wo2Var5;
        this.f6755f = wo2Var6;
        this.f6756g = wo2Var7;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        h52 h52Var = qr.a;
        ro2.b(h52Var);
        return new hg1(h52Var, this.f6751b.zzb(), this.f6752c.zzb(), this.f6753d.zzb(), this.f6754e.zzb(), ((ga0) this.f6755f).a(), this.f6756g.zzb());
    }
}