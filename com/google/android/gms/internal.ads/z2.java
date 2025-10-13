package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.search.SearchAdRequest;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class z2 extends com.google.android.gms.common.internal.w.a {
    public static final Parcelable.Creator<z2> CREATOR = new a3();

    /* renamed from: e, reason: collision with root package name */
    public final String f10528e;

    public z2(SearchAdRequest searchAdRequest) {
        this.f10528e = searchAdRequest.getQuery();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = com.google.android.gms.common.internal.w.c.a(parcel);
        com.google.android.gms.common.internal.w.c.s(parcel, 15, this.f10528e, false);
        com.google.android.gms.common.internal.w.c.b(parcel, iA);
    }

    z2(String str) {
        this.f10528e = str;
    }
}