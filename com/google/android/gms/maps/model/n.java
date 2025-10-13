package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: com.google.android.gms:play-services-maps@@17.0.1 */
/* loaded from: classes.dex */
public final class n implements Parcelable.Creator<f> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ f createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        LatLng latLng = null;
        String strF = null;
        String strF2 = null;
        IBinder iBinderU = null;
        float fR = 0.0f;
        float fR2 = 0.0f;
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        float fR3 = 0.0f;
        float fR4 = 0.5f;
        float fR5 = 0.0f;
        float fR6 = 1.0f;
        float fR7 = 0.0f;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            switch (com.google.android.gms.common.internal.w.b.l(iT)) {
                case 2:
                    latLng = (LatLng) com.google.android.gms.common.internal.w.b.e(parcel, iT, LatLng.CREATOR);
                    break;
                case 3:
                    strF = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 4:
                    strF2 = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 5:
                    iBinderU = com.google.android.gms.common.internal.w.b.u(parcel, iT);
                    break;
                case 6:
                    fR = com.google.android.gms.common.internal.w.b.r(parcel, iT);
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
                    zM3 = com.google.android.gms.common.internal.w.b.m(parcel, iT);
                    break;
                case 11:
                    fR3 = com.google.android.gms.common.internal.w.b.r(parcel, iT);
                    break;
                case 12:
                    fR4 = com.google.android.gms.common.internal.w.b.r(parcel, iT);
                    break;
                case 13:
                    fR5 = com.google.android.gms.common.internal.w.b.r(parcel, iT);
                    break;
                case 14:
                    fR6 = com.google.android.gms.common.internal.w.b.r(parcel, iT);
                    break;
                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                    fR7 = com.google.android.gms.common.internal.w.b.r(parcel, iT);
                    break;
                default:
                    com.google.android.gms.common.internal.w.b.z(parcel, iT);
                    break;
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new f(latLng, strF, strF2, iBinderU, fR, fR2, zM, zM2, zM3, fR3, fR4, fR5, fR6, fR7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ f[] newArray(int i2) {
        return new f[i2];
    }
}