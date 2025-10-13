package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class r1 extends com.google.android.gms.common.internal.w.a {
    public static final Parcelable.Creator<r1> CREATOR = new s1();

    /* renamed from: e, reason: collision with root package name */
    public final int f8555e;

    public r1(int i2) {
        this.f8555e = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.m(parcel, 2, this.f8555e);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }
}