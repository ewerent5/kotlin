package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class y31 implements mo2<x31> {
    private final wo2<f40> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<Context> f10350b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<Executor> f10351c;

    /* renamed from: d, reason: collision with root package name */
    private final wo2<vr0> f10352d;

    /* renamed from: e, reason: collision with root package name */
    private final wo2<qp1> f10353e;

    /* renamed from: f, reason: collision with root package name */
    private final wo2<kr> f10354f;

    /* renamed from: g, reason: collision with root package name */
    private final wo2<ea> f10355g;

    public y31(wo2<f40> wo2Var, wo2<Context> wo2Var2, wo2<Executor> wo2Var3, wo2<vr0> wo2Var4, wo2<qp1> wo2Var5, wo2<kr> wo2Var6, wo2<ea> wo2Var7) {
        this.a = wo2Var;
        this.f10350b = wo2Var2;
        this.f10351c = wo2Var3;
        this.f10352d = wo2Var4;
        this.f10353e = wo2Var5;
        this.f10354f = wo2Var6;
        this.f10355g = wo2Var7;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new x31(this.a.zzb(), this.f10350b.zzb(), this.f10351c.zzb(), this.f10352d.zzb(), ((ga0) this.f10353e).a(), ((qy) this.f10354f).a(), new ea());
    }
}