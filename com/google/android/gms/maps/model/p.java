package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-maps@@17.0.1 */
/* loaded from: classes.dex */
public final class p implements Parcelable.Creator<i> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ i createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        LatLng latLng4 = null;
        LatLngBounds latLngBounds = null;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            int iL = com.google.android.gms.common.internal.w.b.l(iT);
            if (iL == 2) {
                latLng = (LatLng) com.google.android.gms.common.internal.w.b.e(parcel, iT, LatLng.CREATOR);
            } else if (iL == 3) {
                latLng2 = (LatLng) com.google.android.gms.common.internal.w.b.e(parcel, iT, LatLng.CREATOR);
            } else if (iL == 4) {
                latLng3 = (LatLng) com.google.android.gms.common.internal.w.b.e(parcel, iT, LatLng.CREATOR);
            } else if (iL == 5) {
                latLng4 = (LatLng) com.google.android.gms.common.internal.w.b.e(parcel, iT, LatLng.CREATOR);
            } else if (iL != 6) {
                com.google.android.gms.common.internal.w.b.z(parcel, iT);
            } else {
                latLngBounds = (LatLngBounds) com.google.android.gms.common.internal.w.b.e(parcel, iT, LatLngBounds.CREATOR);
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new i(latLng, latLng2, latLng3, latLng4, latLngBounds);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ i[] newArray(int i2) {
        return new i[i2];
    }
}