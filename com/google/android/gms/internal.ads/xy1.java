package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class xy1 extends com.google.android.gms.common.internal.w.a {
    public static final Parcelable.Creator<xy1> CREATOR = new yy1();

    /* renamed from: e, reason: collision with root package name */
    public final int f10311e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f10312f;

    xy1(int i2, byte[] bArr) {
        this.f10311e = i2;
        this.f10312f = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.m(parcel, 1, this.f10311e);
        com.google.android.gms.common.internal.w.c.g(parcel, 2, this.f10312f, false);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }

    public xy1(byte[] bArr) {
        this(1, bArr);
    }
}