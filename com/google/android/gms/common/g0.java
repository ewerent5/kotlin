package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public final class g0 implements Parcelable.Creator<f0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ f0 createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        boolean zM = false;
        String strF = null;
        int iV = 0;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            int iL = com.google.android.gms.common.internal.w.b.l(iT);
            if (iL == 1) {
                zM = com.google.android.gms.common.internal.w.b.m(parcel, iT);
            } else if (iL == 2) {
                strF = com.google.android.gms.common.internal.w.b.f(parcel, iT);
            } else if (iL != 3) {
                com.google.android.gms.common.internal.w.b.z(parcel, iT);
            } else {
                iV = com.google.android.gms.common.internal.w.b.v(parcel, iT);
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new f0(zM, strF, iV);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ f0[] newArray(int i2) {
        return new f0[i2];
    }
}