package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class r51 implements mo2<q51> {
    private final wo2<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<kr> f8587b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<qp1> f8588c;

    /* renamed from: d, reason: collision with root package name */
    private final wo2<Executor> f8589d;

    /* renamed from: e, reason: collision with root package name */
    private final wo2<jj0> f8590e;

    /* renamed from: f, reason: collision with root package name */
    private final wo2<vr0> f8591f;

    /* renamed from: g, reason: collision with root package name */
    private final wo2<ea> f8592g;

    public r51(wo2<Context> wo2Var, wo2<kr> wo2Var2, wo2<qp1> wo2Var3, wo2<Executor> wo2Var4, wo2<jj0> wo2Var5, wo2<vr0> wo2Var6, wo2<ea> wo2Var7) {
        this.a = wo2Var;
        this.f8587b = wo2Var2;
        this.f8588c = wo2Var3;
        this.f8589d = wo2Var4;
        this.f8590e = wo2Var5;
        this.f8591f = wo2Var6;
        this.f8592g = wo2Var7;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new q51(this.a.zzb(), ((qy) this.f8587b).a(), ((ga0) this.f8588c).a(), this.f8589d.zzb(), this.f8590e.zzb(), this.f8591f.zzb(), new ea());
    }
}