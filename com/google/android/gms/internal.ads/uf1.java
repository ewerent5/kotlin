package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class uf1 implements mo2<tf1> {
    private final wo2<ApplicationInfo> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<PackageInfo> f9440b;

    public uf1(wo2<ApplicationInfo> wo2Var, wo2<PackageInfo> wo2Var2) {
        this.a = wo2Var;
        this.f9440b = wo2Var2;
    }

    public static tf1 a(ApplicationInfo applicationInfo, PackageInfo packageInfo) {
        return new tf1(applicationInfo, packageInfo);
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new tf1(((fy0) this.a).zzb(), this.f9440b.zzb());
    }
}