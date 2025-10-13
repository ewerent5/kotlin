package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class nd1 implements zg1<Bundle> {
    public final double a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7694b;

    public nd1(double d2, boolean z) {
        this.a = d2;
        this.f7694b = z;
    }

    @Override // com.google.android.gms.internal.ads.zg1
    public final /* bridge */ /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        Bundle bundleA = cq1.a(bundle2, "device");
        bundle2.putBundle("device", bundleA);
        Bundle bundleA2 = cq1.a(bundleA, "battery");
        bundleA.putBundle("battery", bundleA2);
        bundleA2.putBoolean("is_charging", this.f7694b);
        bundleA2.putDouble("battery_level", this.a);
    }
}