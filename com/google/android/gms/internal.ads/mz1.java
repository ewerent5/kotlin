package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class mz1 implements Parcelable.Creator<lz1> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ lz1 createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        int iV = 0;
        byte[] bArrB = null;
        int iV2 = 0;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            int iL = com.google.android.gms.common.internal.w.b.l(iT);
            if (iL == 1) {
                iV = com.google.android.gms.common.internal.w.b.v(parcel, iT);
            } else if (iL == 2) {
                bArrB = com.google.android.gms.common.internal.w.b.b(parcel, iT);
            } else if (iL != 3) {
                com.google.android.gms.common.internal.w.b.z(parcel, iT);
            } else {
                iV2 = com.google.android.gms.common.internal.w.b.v(parcel, iT);
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new lz1(iV, bArrB, iV2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ lz1[] newArray(int i2) {
        return new lz1[i2];
    }
}