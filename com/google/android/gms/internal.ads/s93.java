package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class s93 implements Parcelable.Creator<r93> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ r93 createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        String strF = null;
        r93[] r93VarArr = null;
        int iV = 0;
        int iV2 = 0;
        boolean zM = false;
        int iV3 = 0;
        int iV4 = 0;
        boolean zM2 = false;
        boolean zM3 = false;
        boolean zM4 = false;
        boolean zM5 = false;
        boolean zM6 = false;
        boolean zM7 = false;
        boolean zM8 = false;
        boolean zM9 = false;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            switch (com.google.android.gms.common.internal.w.b.l(iT)) {
                case 2:
                    strF = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 3:
                    iV = com.google.android.gms.common.internal.w.b.v(parcel, iT);
                    break;
                case 4:
                    iV2 = com.google.android.gms.common.internal.w.b.v(parcel, iT);
                    break;
                case 5:
                    zM = com.google.android.gms.common.internal.w.b.m(parcel, iT);
                    break;
                case 6:
                    iV3 = com.google.android.gms.common.internal.w.b.v(parcel, iT);
                    break;
                case 7:
                    iV4 = com.google.android.gms.common.internal.w.b.v(parcel, iT);
                    break;
                case 8:
                    r93VarArr = (r93[]) com.google.android.gms.common.internal.w.b.i(parcel, iT, r93.CREATOR);
                    break;
                case 9:
                    zM2 = com.google.android.gms.common.internal.w.b.m(parcel, iT);
                    break;
                case 10:
                    zM3 = com.google.android.gms.common.internal.w.b.m(parcel, iT);
                    break;
                case 11:
                    zM4 = com.google.android.gms.common.internal.w.b.m(parcel, iT);
                    break;
                case 12:
                    zM5 = com.google.android.gms.common.internal.w.b.m(parcel, iT);
                    break;
                case 13:
                    zM6 = com.google.android.gms.common.internal.w.b.m(parcel, iT);
                    break;
                case 14:
                    zM7 = com.google.android.gms.common.internal.w.b.m(parcel, iT);
                    break;
                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                    zM8 = com.google.android.gms.common.internal.w.b.m(parcel, iT);
                    break;
                case 16:
                    zM9 = com.google.android.gms.common.internal.w.b.m(parcel, iT);
                    break;
                default:
                    com.google.android.gms.common.internal.w.b.z(parcel, iT);
                    break;
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new r93(strF, iV, iV2, zM, iV3, iV4, r93VarArr, zM2, zM3, zM4, zM5, zM6, zM7, zM8, zM9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ r93[] newArray(int i2) {
        return new r93[i2];
    }
}