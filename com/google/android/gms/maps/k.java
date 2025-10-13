package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: com.google.android.gms:play-services-maps@@17.0.1 */
/* loaded from: classes.dex */
public final class k implements Parcelable.Creator<GoogleMapOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GoogleMapOptions createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        CameraPosition cameraPosition = null;
        Float fS = null;
        Float fS2 = null;
        LatLngBounds latLngBounds = null;
        byte bO = -1;
        byte bO2 = -1;
        int iV = 0;
        byte bO3 = -1;
        byte bO4 = -1;
        byte bO5 = -1;
        byte bO6 = -1;
        byte bO7 = -1;
        byte bO8 = -1;
        byte bO9 = -1;
        byte bO10 = -1;
        byte bO11 = -1;
        byte bO12 = -1;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            switch (com.google.android.gms.common.internal.w.b.l(iT)) {
                case 2:
                    bO = com.google.android.gms.common.internal.w.b.o(parcel, iT);
                    break;
                case 3:
                    bO2 = com.google.android.gms.common.internal.w.b.o(parcel, iT);
                    break;
                case 4:
                    iV = com.google.android.gms.common.internal.w.b.v(parcel, iT);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) com.google.android.gms.common.internal.w.b.e(parcel, iT, CameraPosition.CREATOR);
                    break;
                case 6:
                    bO3 = com.google.android.gms.common.internal.w.b.o(parcel, iT);
                    break;
                case 7:
                    bO4 = com.google.android.gms.common.internal.w.b.o(parcel, iT);
                    break;
                case 8:
                    bO5 = com.google.android.gms.common.internal.w.b.o(parcel, iT);
                    break;
                case 9:
                    bO6 = com.google.android.gms.common.internal.w.b.o(parcel, iT);
                    break;
                case 10:
                    bO7 = com.google.android.gms.common.internal.w.b.o(parcel, iT);
                    break;
                case 11:
                    bO8 = com.google.android.gms.common.internal.w.b.o(parcel, iT);
                    break;
                case 12:
                    bO9 = com.google.android.gms.common.internal.w.b.o(parcel, iT);
                    break;
                case 13:
                default:
                    com.google.android.gms.common.internal.w.b.z(parcel, iT);
                    break;
                case 14:
                    bO10 = com.google.android.gms.common.internal.w.b.o(parcel, iT);
                    break;
                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                    bO11 = com.google.android.gms.common.internal.w.b.o(parcel, iT);
                    break;
                case 16:
                    fS = com.google.android.gms.common.internal.w.b.s(parcel, iT);
                    break;
                case 17:
                    fS2 = com.google.android.gms.common.internal.w.b.s(parcel, iT);
                    break;
                case 18:
                    latLngBounds = (LatLngBounds) com.google.android.gms.common.internal.w.b.e(parcel, iT, LatLngBounds.CREATOR);
                    break;
                case 19:
                    bO12 = com.google.android.gms.common.internal.w.b.o(parcel, iT);
                    break;
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new GoogleMapOptions(bO, bO2, iV, cameraPosition, bO3, bO4, bO5, bO6, bO7, bO8, bO9, bO10, bO11, fS, fS2, latLngBounds, bO12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GoogleMapOptions[] newArray(int i2) {
        return new GoogleMapOptions[i2];
    }
}