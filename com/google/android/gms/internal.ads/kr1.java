package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class kr1 implements Parcelable.Creator<jr1> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ jr1 createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        String strF = null;
        int iV = 0;
        int iV2 = 0;
        int iV3 = 0;
        int iV4 = 0;
        int iV5 = 0;
        int iV6 = 0;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            switch (com.google.android.gms.common.internal.w.b.l(iT)) {
                case 1:
                    iV = com.google.android.gms.common.internal.w.b.v(parcel, iT);
                    break;
                case 2:
                    iV2 = com.google.android.gms.common.internal.w.b.v(parcel, iT);
                    break;
                case 3:
                    iV3 = com.google.android.gms.common.internal.w.b.v(parcel, iT);
                    break;
                case 4:
                    iV4 = com.google.android.gms.common.internal.w.b.v(parcel, iT);
                    break;
                case 5:
                    strF = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 6:
                    iV5 = com.google.android.gms.common.internal.w.b.v(parcel, iT);
                    break;
                case 7:
                    iV6 = com.google.android.gms.common.internal.w.b.v(parcel, iT);
                    break;
                default:
                    com.google.android.gms.common.internal.w.b.z(parcel, iT);
                    break;
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new jr1(iV, iV2, iV3, iV4, strF, iV5, iV6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ jr1[] newArray(int i2) {
        return new jr1[i2];
    }
}