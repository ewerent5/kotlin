package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class kb implements Parcelable.Creator<jb> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ jb createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        String strF = null;
        String[] strArrG = null;
        String[] strArrG2 = null;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            int iL = com.google.android.gms.common.internal.w.b.l(iT);
            if (iL == 1) {
                strF = com.google.android.gms.common.internal.w.b.f(parcel, iT);
            } else if (iL == 2) {
                strArrG = com.google.android.gms.common.internal.w.b.g(parcel, iT);
            } else if (iL != 3) {
                com.google.android.gms.common.internal.w.b.z(parcel, iT);
            } else {
                strArrG2 = com.google.android.gms.common.internal.w.b.g(parcel, iT);
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new jb(strF, strArrG, strArrG2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ jb[] newArray(int i2) {
        return new jb[i2];
    }
}