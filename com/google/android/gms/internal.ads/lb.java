package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class lb extends com.google.android.gms.common.internal.w.a {
    public static final Parcelable.Creator<lb> CREATOR = new mb();

    /* renamed from: e, reason: collision with root package name */
    public final boolean f7228e;

    /* renamed from: f, reason: collision with root package name */
    public final String f7229f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7230g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f7231h;

    /* renamed from: i, reason: collision with root package name */
    public final String[] f7232i;

    /* renamed from: j, reason: collision with root package name */
    public final String[] f7233j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f7234k;

    /* renamed from: l, reason: collision with root package name */
    public final long f7235l;

    lb(boolean z, String str, int i2, byte[] bArr, String[] strArr, String[] strArr2, boolean z2, long j2) {
        this.f7228e = z;
        this.f7229f = str;
        this.f7230g = i2;
        this.f7231h = bArr;
        this.f7232i = strArr;
        this.f7233j = strArr2;
        this.f7234k = z2;
        this.f7235l = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.c(parcel, 1, this.f7228e);
        com.google.android.gms.common.internal.w.c.s(parcel, 2, this.f7229f, false);
        com.google.android.gms.common.internal.w.c.m(parcel, 3, this.f7230g);
        com.google.android.gms.common.internal.w.c.g(parcel, 4, this.f7231h, false);
        com.google.android.gms.common.internal.w.c.t(parcel, 5, this.f7232i, false);
        com.google.android.gms.common.internal.w.c.t(parcel, 6, this.f7233j, false);
        com.google.android.gms.common.internal.w.c.c(parcel, 7, this.f7234k);
        com.google.android.gms.common.internal.w.c.p(parcel, 8, this.f7235l);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }
}