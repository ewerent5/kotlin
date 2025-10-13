package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.RequestConfiguration;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class x2 extends com.google.android.gms.common.internal.w.a {
    public static final Parcelable.Creator<x2> CREATOR = new y2();

    /* renamed from: e, reason: collision with root package name */
    public final int f10102e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10103f;

    public x2(int i2, int i3) {
        this.f10102e = i2;
        this.f10103f = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.m(parcel, 1, this.f10102e);
        com.google.android.gms.common.internal.w.c.m(parcel, 2, this.f10103f);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }

    public x2(RequestConfiguration requestConfiguration) {
        this.f10102e = requestConfiguration.getTagForChildDirectedTreatment();
        this.f10103f = requestConfiguration.getTagForUnderAgeOfConsent();
    }
}