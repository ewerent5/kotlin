package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class jc1 implements mo2<hc1> {
    private final wo2<td1<gh1>> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<qp1> f6732b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<Context> f6733c;

    /* renamed from: d, reason: collision with root package name */
    private final wo2<oq> f6734d;

    public jc1(wo2<td1<gh1>> wo2Var, wo2<qp1> wo2Var2, wo2<Context> wo2Var3, wo2<oq> wo2Var4) {
        this.a = wo2Var;
        this.f6732b = wo2Var2;
        this.f6733c = wo2Var3;
        this.f6734d = wo2Var4;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new hc1(this.a.zzb(), ((ga0) this.f6732b).a(), ((vq1) this.f6733c).a(), this.f6734d.zzb());
    }
}