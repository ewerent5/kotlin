package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class h6 implements Parcelable.Creator<g6> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ g6 createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        d3 d3Var = null;
        int iV = 0;
        boolean zM = false;
        int iV2 = 0;
        boolean zM2 = false;
        int iV3 = 0;
        boolean zM3 = false;
        int iV4 = 0;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            switch (com.google.android.gms.common.internal.w.b.l(iT)) {
                case 1:
                    iV = com.google.android.gms.common.internal.w.b.v(parcel, iT);
                    break;
                case 2:
                    zM = com.google.android.gms.common.internal.w.b.m(parcel, iT);
                    break;
                case 3:
                    iV2 = com.google.android.gms.common.internal.w.b.v(parcel, iT);
                    break;
                case 4:
                    zM2 = com.google.android.gms.common.internal.w.b.m(parcel, iT);
                    break;
                case 5:
                    iV3 = com.google.android.gms.common.internal.w.b.v(parcel, iT);
                    break;
                case 6:
                    d3Var = (d3) com.google.android.gms.common.internal.w.b.e(parcel, iT, d3.CREATOR);
                    break;
                case 7:
                    zM3 = com.google.android.gms.common.internal.w.b.m(parcel, iT);
                    break;
                case 8:
                    iV4 = com.google.android.gms.common.internal.w.b.v(parcel, iT);
                    break;
                default:
                    com.google.android.gms.common.internal.w.b.z(parcel, iT);
                    break;
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new g6(iV, zM, iV2, zM2, iV3, d3Var, zM3, iV4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ g6[] newArray(int i2) {
        return new g6[i2];
    }
}