package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class hi implements Parcelable.Creator<gi> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ gi createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
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
            } else if (iL != 3) {
                com.google.android.gms.common.internal.w.b.z(parcel, iT);
            } else {
                iV3 = com.google.android.gms.common.internal.w.b.v(parcel, iT);
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new gi(iV, iV2, iV3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ gi[] newArray(int i2) {
        return new gi[i2];
    }
}