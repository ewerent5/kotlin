package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class jd1 implements zg1<Bundle> {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6735b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6736c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6737d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6738e;

    /* renamed from: f, reason: collision with root package name */
    public final int f6739f;

    /* renamed from: g, reason: collision with root package name */
    public final float f6740g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f6741h;

    public jd1(int i2, boolean z, boolean z2, int i3, int i4, int i5, float f2, boolean z3) {
        this.a = i2;
        this.f6735b = z;
        this.f6736c = z2;
        this.f6737d = i3;
        this.f6738e = i4;
        this.f6739f = i5;
        this.f6740g = f2;
        this.f6741h = z3;
    }

    @Override // com.google.android.gms.internal.ads.zg1
    public final /* bridge */ /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putInt("am", this.a);
        bundle2.putBoolean("ma", this.f6735b);
        bundle2.putBoolean("sp", this.f6736c);
        bundle2.putInt("muv", this.f6737d);
        bundle2.putInt("rm", this.f6738e);
        bundle2.putInt("riv", this.f6739f);
        bundle2.putFloat("android_app_volume", this.f6740g);
        bundle2.putBoolean("android_app_muted", this.f6741h);
    }
}