package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.AdSize;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class r93 extends com.google.android.gms.common.internal.w.a {
    public static final Parcelable.Creator<r93> CREATOR = new s93();

    /* renamed from: e, reason: collision with root package name */
    public final String f8615e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8616f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8617g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f8618h;

    /* renamed from: i, reason: collision with root package name */
    public final int f8619i;

    /* renamed from: j, reason: collision with root package name */
    public final int f8620j;

    /* renamed from: k, reason: collision with root package name */
    public final r93[] f8621k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f8622l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f8623m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;

    public r93() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public static r93 I() {
        return new r93("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
    }

    public static r93 J() {
        return new r93("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public static r93 K() {
        return new r93("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
    }

    public static r93 L() {
        return new r93("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
    }

    private static int M(DisplayMetrics displayMetrics) {
        int i2 = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (i2 <= 400) {
            return 32;
        }
        return i2 <= 720 ? 50 : 90;
    }

    public static int c(DisplayMetrics displayMetrics) {
        return (int) (M(displayMetrics) * displayMetrics.density);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.s(parcel, 2, this.f8615e, false);
        com.google.android.gms.common.internal.w.c.m(parcel, 3, this.f8616f);
        com.google.android.gms.common.internal.w.c.m(parcel, 4, this.f8617g);
        com.google.android.gms.common.internal.w.c.c(parcel, 5, this.f8618h);
        com.google.android.gms.common.internal.w.c.m(parcel, 6, this.f8619i);
        com.google.android.gms.common.internal.w.c.m(parcel, 7, this.f8620j);
        com.google.android.gms.common.internal.w.c.v(parcel, 8, this.f8621k, i2, false);
        com.google.android.gms.common.internal.w.c.c(parcel, 9, this.f8622l);
        com.google.android.gms.common.internal.w.c.c(parcel, 10, this.f8623m);
        com.google.android.gms.common.internal.w.c.c(parcel, 11, this.n);
        com.google.android.gms.common.internal.w.c.c(parcel, 12, this.o);
        com.google.android.gms.common.internal.w.c.c(parcel, 13, this.p);
        com.google.android.gms.common.internal.w.c.c(parcel, 14, this.q);
        com.google.android.gms.common.internal.w.c.c(parcel, 15, this.r);
        com.google.android.gms.common.internal.w.c.c(parcel, 16, this.s);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }

    public r93(Context context, AdSize adSize) {
        this(context, new AdSize[]{adSize});
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public r93(android.content.Context r13, com.google.android.gms.ads.AdSize[] r14) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.r93.<init>(android.content.Context, com.google.android.gms.ads.AdSize[]):void");
    }

    r93(String str, int i2, int i3, boolean z, int i4, int i5, r93[] r93VarArr, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.f8615e = str;
        this.f8616f = i2;
        this.f8617g = i3;
        this.f8618h = z;
        this.f8619i = i4;
        this.f8620j = i5;
        this.f8621k = r93VarArr;
        this.f8622l = z2;
        this.f8623m = z3;
        this.n = z4;
        this.o = z5;
        this.p = z6;
        this.q = z7;
        this.r = z8;
        this.s = z9;
    }
}