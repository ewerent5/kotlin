package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class qg1 implements zg1<Bundle> {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8372b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8373c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8374d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8375e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8376f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8377g;

    public qg1(boolean z, boolean z2, String str, boolean z3, int i2, int i3, int i4) {
        this.a = z;
        this.f8372b = z2;
        this.f8373c = str;
        this.f8374d = z3;
        this.f8375e = i2;
        this.f8376f = i3;
        this.f8377g = i4;
    }

    @Override // com.google.android.gms.internal.ads.zg1
    public final /* bridge */ /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putString("js", this.f8373c);
        bundle2.putBoolean("is_nonagon", true);
        bundle2.putString("extra_caps", (String) c.c().b(w3.V1));
        bundle2.putInt("target_api", this.f8375e);
        bundle2.putInt("dv", this.f8376f);
        bundle2.putInt("lv", this.f8377g);
        Bundle bundleA = cq1.a(bundle2, "sdk_env");
        bundleA.putBoolean("mf", l5.a.e().booleanValue());
        bundleA.putBoolean("instant_app", this.a);
        bundleA.putBoolean("lite", this.f8372b);
        bundleA.putBoolean("is_privileged_process", this.f8374d);
        bundle2.putBundle("sdk_env", bundleA);
        Bundle bundleA2 = cq1.a(bundleA, "build_meta");
        bundleA2.putString("cl", "367272508");
        bundleA2.putString("rapid_rc", "dev");
        bundleA2.putString("rapid_rollup", "HEAD");
        bundleA.putBundle("build_meta", bundleA2);
    }
}