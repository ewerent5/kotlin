package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-maps@@17.0.1 */
/* loaded from: classes.dex */
public final class j implements Parcelable.Creator<CameraPosition> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CameraPosition createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        float fR = 0.0f;
        LatLng latLng = null;
        float fR2 = 0.0f;
        float fR3 = 0.0f;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            int iL = com.google.android.gms.common.internal.w.b.l(iT);
            if (iL == 2) {
                latLng = (LatLng) com.google.android.gms.common.internal.w.b.e(parcel, iT, LatLng.CREATOR);
            } else if (iL == 3) {
                fR = com.google.android.gms.common.internal.w.b.r(parcel, iT);
            } else if (iL == 4) {
                fR2 = com.google.android.gms.common.internal.w.b.r(parcel, iT);
            } else if (iL != 5) {
                com.google.android.gms.common.internal.w.b.z(parcel, iT);
            } else {
                fR3 = com.google.android.gms.common.internal.w.b.r(parcel, iT);
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new CameraPosition(latLng, fR, fR2, fR3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CameraPosition[] newArray(int i2) {
        return new CameraPosition[i2];
    }
}