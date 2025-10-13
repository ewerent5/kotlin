package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class rw0 implements mo2<qw0> {
    private final wo2<Executor> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<Context> f8770b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<WeakReference<Context>> f8771c;

    /* renamed from: d, reason: collision with root package name */
    private final wo2<Executor> f8772d;

    /* renamed from: e, reason: collision with root package name */
    private final wo2<js0> f8773e;

    /* renamed from: f, reason: collision with root package name */
    private final wo2<ScheduledExecutorService> f8774f;

    /* renamed from: g, reason: collision with root package name */
    private final wo2<wu0> f8775g;

    /* renamed from: h, reason: collision with root package name */
    private final wo2<kr> f8776h;

    /* renamed from: i, reason: collision with root package name */
    private final wo2<zg0> f8777i;

    public rw0(wo2<Executor> wo2Var, wo2<Context> wo2Var2, wo2<WeakReference<Context>> wo2Var3, wo2<Executor> wo2Var4, wo2<js0> wo2Var5, wo2<ScheduledExecutorService> wo2Var6, wo2<wu0> wo2Var7, wo2<kr> wo2Var8, wo2<zg0> wo2Var9) {
        this.a = wo2Var;
        this.f8770b = wo2Var2;
        this.f8771c = wo2Var3;
        this.f8772d = wo2Var4;
        this.f8773e = wo2Var5;
        this.f8774f = wo2Var6;
        this.f8775g = wo2Var7;
        this.f8776h = wo2Var8;
        this.f8777i = wo2Var9;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        Executor executorZzb = this.a.zzb();
        Context contextA = ((hy) this.f8770b).a();
        WeakReference<Context> weakReferenceA = ((iy) this.f8771c).a();
        h52 h52Var = qr.a;
        ro2.b(h52Var);
        return new qw0(executorZzb, contextA, weakReferenceA, h52Var, this.f8773e.zzb(), this.f8774f.zzb(), this.f8775g.zzb(), ((qy) this.f8776h).a(), ((ah0) this.f8777i).zzb());
    }
}