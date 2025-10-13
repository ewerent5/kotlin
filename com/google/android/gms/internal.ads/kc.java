package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class kc implements Parcelable.Creator<jc> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ jc createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        int iV = 0;
        String strF = null;
        int iV2 = 0;
        int iV3 = 0;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            int iL = com.google.android.gms.common.internal.w.b.l(iT);
            if (iL == 1) {
                iV2 = com.google.android.gms.common.internal.w.b.v(parcel, iT);
            } else if (iL == 2) {
                strF = com.google.android.gms.common.internal.w.b.f(parcel, iT);
            } else if (iL == 3) {
                iV3 = com.google.android.gms.common.internal.w.b.v(parcel, iT);
            } else if (iL != 1000) {
                com.google.android.gms.common.internal.w.b.z(parcel, iT);
            } else {
                iV = com.google.android.gms.common.internal.w.b.v(parcel, iT);
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new jc(iV, iV2, strF, iV3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ jc[] newArray(int i2) {
        return new jc[i2];
    }
}