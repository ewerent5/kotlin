package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import com.google.android.gms.ads.internal.util.zzg;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class mf1 implements mo2<kf1> {
    private final wo2<h52> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<qp1> f7476b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<PackageInfo> f7477c;

    /* renamed from: d, reason: collision with root package name */
    private final wo2<zzg> f7478d;

    public mf1(wo2<h52> wo2Var, wo2<qp1> wo2Var2, wo2<PackageInfo> wo2Var3, wo2<zzg> wo2Var4) {
        this.a = wo2Var;
        this.f7476b = wo2Var2;
        this.f7477c = wo2Var3;
        this.f7478d = wo2Var4;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        h52 h52Var = qr.a;
        ro2.b(h52Var);
        return new kf1(h52Var, ((ga0) this.f7476b).a(), this.f7477c.zzb(), ((uq1) this.f7478d).zzb());
    }
}