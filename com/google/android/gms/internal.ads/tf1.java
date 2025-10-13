package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class tf1 implements ah1, zg1 {
    private final ApplicationInfo a;

    /* renamed from: b, reason: collision with root package name */
    private final PackageInfo f9126b;

    tf1(ApplicationInfo applicationInfo, PackageInfo packageInfo) {
        this.a = applicationInfo;
        this.f9126b = packageInfo;
    }

    @Override // com.google.android.gms.internal.ads.zg1
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.a.packageName;
        PackageInfo packageInfo = this.f9126b;
        Integer numValueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
        bundle.putString("pn", str);
        if (numValueOf != null) {
            bundle.putInt("vc", numValueOf.intValue());
        }
        PackageInfo packageInfo2 = this.f9126b;
        String str2 = packageInfo2 != null ? packageInfo2.versionName : null;
        if (str2 != null) {
            bundle.putString("vnm", str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.ah1
    public final g52<zg1<Bundle>> zza() {
        return y42.a(this);
    }
}