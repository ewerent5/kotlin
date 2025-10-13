package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.appopen.AppOpenAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class y93 extends com.google.android.gms.common.internal.w.a {
    public static final Parcelable.Creator<y93> CREATOR = new z93();

    /* renamed from: e, reason: collision with root package name */
    @AppOpenAd.AppOpenAdOrientation
    public final int f10399e;

    public y93(@AppOpenAd.AppOpenAdOrientation int i2) {
        this.f10399e = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.m(parcel, 2, this.f10399e);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }
}