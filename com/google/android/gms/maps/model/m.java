package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-maps@@17.0.1 */
/* loaded from: classes.dex */
public final class m implements Parcelable.Creator<LatLng> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LatLng createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        double dP = 0.0d;
        double dP2 = 0.0d;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            int iL = com.google.android.gms.common.internal.w.b.l(iT);
            if (iL == 2) {
                dP = com.google.android.gms.common.internal.w.b.p(parcel, iT);
            } else if (iL != 3) {
                com.google.android.gms.common.internal.w.b.z(parcel, iT);
            } else {
                dP2 = com.google.android.gms.common.internal.w.b.p(parcel, iT);
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new LatLng(dP, dP2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LatLng[] newArray(int i2) {
        return new LatLng[i2];
    }
}