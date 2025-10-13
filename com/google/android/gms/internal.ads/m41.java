package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzak;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class m41 implements mo2<l41> {
    private final wo2<p50> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<Context> f7417b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<Executor> f7418c;

    /* renamed from: d, reason: collision with root package name */
    private final wo2<vr0> f7419d;

    /* renamed from: e, reason: collision with root package name */
    private final wo2<qp1> f7420e;

    /* renamed from: f, reason: collision with root package name */
    private final wo2<x02<xo1, zzak>> f7421f;

    public m41(wo2<p50> wo2Var, wo2<Context> wo2Var2, wo2<Executor> wo2Var3, wo2<vr0> wo2Var4, wo2<qp1> wo2Var5, wo2<x02<xo1, zzak>> wo2Var6) {
        this.a = wo2Var;
        this.f7417b = wo2Var2;
        this.f7418c = wo2Var3;
        this.f7419d = wo2Var4;
        this.f7420e = wo2Var5;
        this.f7421f = wo2Var6;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final l41 zzb() {
        return new l41(this.a.zzb(), this.f7417b.zzb(), this.f7418c.zzb(), this.f7419d.zzb(), ((ga0) this.f7420e).a(), this.f7421f.zzb());
    }
}