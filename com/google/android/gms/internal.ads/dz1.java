package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class dz1 implements Parcelable.Creator<cz1> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ cz1 createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        int iV = 0;
        byte[] bArrB = null;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            int iL = com.google.android.gms.common.internal.w.b.l(iT);
            if (iL == 1) {
                iV = com.google.android.gms.common.internal.w.b.v(parcel, iT);
            } else if (iL != 2) {
                com.google.android.gms.common.internal.w.b.z(parcel, iT);
            } else {
                bArrB = com.google.android.gms.common.internal.w.b.b(parcel, iT);
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new cz1(iV, bArrB);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ cz1[] newArray(int i2) {
        return new cz1[i2];
    }
}