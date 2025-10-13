package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class lr implements Parcelable.Creator<kr> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ kr createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        String strF = null;
        int iV = 0;
        int iV2 = 0;
        boolean zM = false;
        boolean zM2 = false;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            int iL = com.google.android.gms.common.internal.w.b.l(iT);
            if (iL == 2) {
                strF = com.google.android.gms.common.internal.w.b.f(parcel, iT);
            } else if (iL == 3) {
                iV = com.google.android.gms.common.internal.w.b.v(parcel, iT);
            } else if (iL == 4) {
                iV2 = com.google.android.gms.common.internal.w.b.v(parcel, iT);
            } else if (iL == 5) {
                zM = com.google.android.gms.common.internal.w.b.m(parcel, iT);
            } else if (iL != 6) {
                com.google.android.gms.common.internal.w.b.z(parcel, iT);
            } else {
                zM2 = com.google.android.gms.common.internal.w.b.m(parcel, iT);
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new kr(strF, iV, iV2, zM, zM2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ kr[] newArray(int i2) {
        return new kr[i2];
    }
}