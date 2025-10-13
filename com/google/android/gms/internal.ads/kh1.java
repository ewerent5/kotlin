package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class kh1 implements zg1<Bundle> {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6993b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6994c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6995d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6996e;

    /* renamed from: f, reason: collision with root package name */
    public final int f6997f;

    public kh1(String str, int i2, int i3, int i4, boolean z, int i5) {
        this.a = str;
        this.f6993b = i2;
        this.f6994c = i3;
        this.f6995d = i4;
        this.f6996e = z;
        this.f6997f = i5;
    }

    @Override // com.google.android.gms.internal.ads.zg1
    public final /* bridge */ /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        cq1.b(bundle2, "carrier", this.a, !TextUtils.isEmpty(r0));
        cq1.c(bundle2, "cnt", Integer.valueOf(this.f6993b), this.f6993b != -2);
        bundle2.putInt("gnt", this.f6994c);
        bundle2.putInt("pt", this.f6995d);
        Bundle bundleA = cq1.a(bundle2, "device");
        bundle2.putBundle("device", bundleA);
        Bundle bundleA2 = cq1.a(bundleA, "network");
        bundleA.putBundle("network", bundleA2);
        bundleA2.putInt("active_network_state", this.f6997f);
        bundleA2.putBoolean("active_network_metered", this.f6996e);
    }
}