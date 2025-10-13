package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class yb implements Parcelable.Creator<xb> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ xb createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        boolean zM = false;
        String strF = null;
        String strF2 = null;
        int iV = 0;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            int iL = com.google.android.gms.common.internal.w.b.l(iT);
            if (iL == 1) {
                strF = com.google.android.gms.common.internal.w.b.f(parcel, iT);
            } else if (iL == 2) {
                zM = com.google.android.gms.common.internal.w.b.m(parcel, iT);
            } else if (iL == 3) {
                iV = com.google.android.gms.common.internal.w.b.v(parcel, iT);
            } else if (iL != 4) {
                com.google.android.gms.common.internal.w.b.z(parcel, iT);
            } else {
                strF2 = com.google.android.gms.common.internal.w.b.f(parcel, iT);
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new xb(strF, zM, iV, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ xb[] newArray(int i2) {
        return new xb[i2];
    }
}