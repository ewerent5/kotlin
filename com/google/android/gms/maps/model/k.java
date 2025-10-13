package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-maps@@17.0.1 */
/* loaded from: classes.dex */
public final class k implements Parcelable.Creator<d> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ d createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        LatLng latLng = null;
        ArrayList arrayListJ = null;
        double dP = 0.0d;
        float fR = 0.0f;
        int iV = 0;
        int iV2 = 0;
        float fR2 = 0.0f;
        boolean zM = false;
        boolean zM2 = false;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            switch (com.google.android.gms.common.internal.w.b.l(iT)) {
                case 2:
                    latLng = (LatLng) com.google.android.gms.common.internal.w.b.e(parcel, iT, LatLng.CREATOR);
                    break;
                case 3:
                    dP = com.google.android.gms.common.internal.w.b.p(parcel, iT);
                    break;
                case 4:
                    fR = com.google.android.gms.common.internal.w.b.r(parcel, iT);
                    break;
                case 5:
                    iV = com.google.android.gms.common.internal.w.b.v(parcel, iT);
                    break;
                case 6:
                    iV2 = com.google.android.gms.common.internal.w.b.v(parcel, iT);
                    break;
                case 7:
                    fR2 = com.google.android.gms.common.internal.w.b.r(parcel, iT);
                    break;
                case 8:
                    zM = com.google.android.gms.common.internal.w.b.m(parcel, iT);
                    break;
                case 9:
                    zM2 = com.google.android.gms.common.internal.w.b.m(parcel, iT);
                    break;
                case 10:
                    arrayListJ = com.google.android.gms.common.internal.w.b.j(parcel, iT, g.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.w.b.z(parcel, iT);
                    break;
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new d(latLng, dP, fR, iV, iV2, fR2, zM, zM2, arrayListJ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ d[] newArray(int i2) {
        return new d[i2];
    }
}