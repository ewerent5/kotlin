package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class to0 implements mo2<so0> {
    private final wo2<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<eo0> f9221b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<ip2> f9222c;

    /* renamed from: d, reason: collision with root package name */
    private final wo2<kr> f9223d;

    /* renamed from: e, reason: collision with root package name */
    private final wo2<zza> f9224e;

    /* renamed from: f, reason: collision with root package name */
    private final wo2<w43> f9225f;

    /* renamed from: g, reason: collision with root package name */
    private final wo2<Executor> f9226g;

    /* renamed from: h, reason: collision with root package name */
    private final wo2<qp1> f9227h;

    /* renamed from: i, reason: collision with root package name */
    private final wo2<lp0> f9228i;

    /* renamed from: j, reason: collision with root package name */
    private final wo2<ScheduledExecutorService> f9229j;

    public to0(wo2<Context> wo2Var, wo2<eo0> wo2Var2, wo2<ip2> wo2Var3, wo2<kr> wo2Var4, wo2<zza> wo2Var5, wo2<w43> wo2Var6, wo2<Executor> wo2Var7, wo2<qp1> wo2Var8, wo2<lp0> wo2Var9, wo2<ScheduledExecutorService> wo2Var10) {
        this.a = wo2Var;
        this.f9221b = wo2Var2;
        this.f9222c = wo2Var3;
        this.f9223d = wo2Var4;
        this.f9224e = wo2Var5;
        this.f9225f = wo2Var6;
        this.f9226g = wo2Var7;
        this.f9227h = wo2Var8;
        this.f9228i = wo2Var9;
        this.f9229j = wo2Var10;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final so0 zzb() {
        Context contextZzb = this.a.zzb();
        eo0 eo0VarZzb = this.f9221b.zzb();
        ip2 ip2VarZzb = this.f9222c.zzb();
        kr krVarA = ((qy) this.f9223d).a();
        zza zzaVarA = r00.a();
        w43 w43VarZzb = this.f9225f.zzb();
        h52 h52Var = qr.a;
        ro2.b(h52Var);
        return new so0(contextZzb, eo0VarZzb, ip2VarZzb, krVarA, zzaVarA, w43VarZzb, h52Var, ((ga0) this.f9227h).a(), this.f9228i.zzb(), this.f9229j.zzb());
    }
}