package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class c81 implements mo2<b81> {
    private final wo2<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<kr> f5287b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<qp1> f5288c;

    /* renamed from: d, reason: collision with root package name */
    private final wo2<Executor> f5289d;

    /* renamed from: e, reason: collision with root package name */
    private final wo2<dr0> f5290e;

    /* renamed from: f, reason: collision with root package name */
    private final wo2<vr0> f5291f;

    /* renamed from: g, reason: collision with root package name */
    private final wo2<ea> f5292g;

    public c81(wo2<Context> wo2Var, wo2<kr> wo2Var2, wo2<qp1> wo2Var3, wo2<Executor> wo2Var4, wo2<dr0> wo2Var5, wo2<vr0> wo2Var6, wo2<ea> wo2Var7) {
        this.a = wo2Var;
        this.f5287b = wo2Var2;
        this.f5288c = wo2Var3;
        this.f5289d = wo2Var4;
        this.f5290e = wo2Var5;
        this.f5291f = wo2Var6;
        this.f5292g = wo2Var7;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new b81(this.a.zzb(), ((qy) this.f5287b).a(), ((ga0) this.f5288c).a(), this.f5289d.zzb(), this.f5290e.zzb(), this.f5291f.zzb(), new ea());
    }
}