package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class o20 implements mo2<n20> {
    private final wo2<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<Executor> f7875b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<ScheduledExecutorService> f7876c;

    /* renamed from: d, reason: collision with root package name */
    private final wo2<kp1> f7877d;

    /* renamed from: e, reason: collision with root package name */
    private final wo2<xo1> f7878e;

    /* renamed from: f, reason: collision with root package name */
    private final wo2<su1> f7879f;

    /* renamed from: g, reason: collision with root package name */
    private final wo2<aq1> f7880g;

    /* renamed from: h, reason: collision with root package name */
    private final wo2<View> f7881h;

    /* renamed from: i, reason: collision with root package name */
    private final wo2<ip2> f7882i;

    /* renamed from: j, reason: collision with root package name */
    private final wo2<w4> f7883j;

    /* renamed from: k, reason: collision with root package name */
    private final wo2<y4> f7884k;

    public o20(wo2<Context> wo2Var, wo2<Executor> wo2Var2, wo2<ScheduledExecutorService> wo2Var3, wo2<kp1> wo2Var4, wo2<xo1> wo2Var5, wo2<su1> wo2Var6, wo2<aq1> wo2Var7, wo2<View> wo2Var8, wo2<ip2> wo2Var9, wo2<w4> wo2Var10, wo2<y4> wo2Var11) {
        this.a = wo2Var;
        this.f7875b = wo2Var2;
        this.f7876c = wo2Var3;
        this.f7877d = wo2Var4;
        this.f7878e = wo2Var5;
        this.f7879f = wo2Var6;
        this.f7880g = wo2Var7;
        this.f7881h = wo2Var8;
        this.f7882i = wo2Var9;
        this.f7883j = wo2Var10;
        this.f7884k = wo2Var11;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextA = ((vq1) this.a).a();
        h52 h52Var = qr.a;
        ro2.b(h52Var);
        return new n20(contextA, h52Var, this.f7876c.zzb(), ((m70) this.f7877d).a(), ((j70) this.f7878e).a(), this.f7879f.zzb(), this.f7880g.zzb(), this.f7881h.zzb(), this.f7882i.zzb(), this.f7883j.zzb(), new y4(), null);
    }
}