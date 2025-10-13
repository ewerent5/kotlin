package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class kz1 implements Parcelable.Creator<jz1> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ jz1 createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        String strF = null;
        String strF2 = null;
        int iV = 0;
        int iV2 = 0;
        int iV3 = 0;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            int iL = com.google.android.gms.common.internal.w.b.l(iT);
            if (iL == 1) {
                iV = com.google.android.gms.common.internal.w.b.v(parcel, iT);
            } else if (iL == 2) {
                iV2 = com.google.android.gms.common.internal.w.b.v(parcel, iT);
            } else if (iL == 3) {
                strF = com.google.android.gms.common.internal.w.b.f(parcel, iT);
            } else if (iL == 4) {
                strF2 = com.google.android.gms.common.internal.w.b.f(parcel, iT);
            } else if (iL != 5) {
                com.google.android.gms.common.internal.w.b.z(parcel, iT);
            } else {
                iV3 = com.google.android.gms.common.internal.w.b.v(parcel, iT);
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new jz1(iV, iV2, iV3, strF, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ jz1[] newArray(int i2) {
        return new jz1[i2];
    }
}