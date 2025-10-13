package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class um implements Parcelable.Creator<tm> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ tm createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        String strF = null;
        int iV = 0;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            int iL = com.google.android.gms.common.internal.w.b.l(iT);
            if (iL == 2) {
                strF = com.google.android.gms.common.internal.w.b.f(parcel, iT);
            } else if (iL != 3) {
                com.google.android.gms.common.internal.w.b.z(parcel, iT);
            } else {
                iV = com.google.android.gms.common.internal.w.b.v(parcel, iT);
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new tm(strF, iV);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ tm[] newArray(int i2) {
        return new tm[i2];
    }
}