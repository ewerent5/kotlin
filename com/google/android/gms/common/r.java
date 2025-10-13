package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public final class r implements Parcelable.Creator<d> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ d createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        String strF = null;
        int iV = 0;
        long jW = -1;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            int iL = com.google.android.gms.common.internal.w.b.l(iT);
            if (iL == 1) {
                strF = com.google.android.gms.common.internal.w.b.f(parcel, iT);
            } else if (iL == 2) {
                iV = com.google.android.gms.common.internal.w.b.v(parcel, iT);
            } else if (iL != 3) {
                com.google.android.gms.common.internal.w.b.z(parcel, iT);
            } else {
                jW = com.google.android.gms.common.internal.w.b.w(parcel, iT);
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new d(strF, iV, jW);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ d[] newArray(int i2) {
        return new d[i2];
    }
}