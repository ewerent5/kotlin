package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ak0 implements mo2<zj0> {
    private final wo2<Map<String, j31<z60>>> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<Map<String, j31<ol0>>> f4923b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<Map<String, b61<ol0>>> f4924c;

    /* renamed from: d, reason: collision with root package name */
    private final wo2<v60<r40>> f4925d;

    /* renamed from: e, reason: collision with root package name */
    private final wo2<fm0> f4926e;

    public ak0(wo2<Map<String, j31<z60>>> wo2Var, wo2<Map<String, j31<ol0>>> wo2Var2, wo2<Map<String, b61<ol0>>> wo2Var3, wo2<v60<r40>> wo2Var4, wo2<fm0> wo2Var5) {
        this.a = wo2Var;
        this.f4923b = wo2Var2;
        this.f4924c = wo2Var3;
        this.f4925d = wo2Var4;
        this.f4926e = wo2Var5;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zj0(((qo2) this.a).zzb(), ((qo2) this.f4923b).zzb(), ((qo2) this.f4924c).zzb(), this.f4925d, ((ek0) this.f4926e).a());
    }
}