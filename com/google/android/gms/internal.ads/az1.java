package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class az1 extends com.google.android.gms.common.internal.w.a {
    public static final Parcelable.Creator<az1> CREATOR = new bz1();

    /* renamed from: e, reason: collision with root package name */
    public final int f5024e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5025f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5026g;

    az1(int i2, String str, String str2) {
        this.f5024e = i2;
        this.f5025f = str;
        this.f5026g = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.m(parcel, 1, this.f5024e);
        com.google.android.gms.common.internal.w.c.s(parcel, 2, this.f5025f, false);
        com.google.android.gms.common.internal.w.c.s(parcel, 3, this.f5026g, false);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }

    public az1(String str, String str2) {
        this(1, str, str2);
    }
}