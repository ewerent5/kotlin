package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class b0 implements Parcelable.Creator<r> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ r createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        IBinder iBinderU = null;
        com.google.android.gms.common.b bVar = null;
        int iV = 0;
        boolean zM = false;
        boolean zM2 = false;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            int iL = com.google.android.gms.common.internal.w.b.l(iT);
            if (iL == 1) {
                iV = com.google.android.gms.common.internal.w.b.v(parcel, iT);
            } else if (iL == 2) {
                iBinderU = com.google.android.gms.common.internal.w.b.u(parcel, iT);
            } else if (iL == 3) {
                bVar = (com.google.android.gms.common.b) com.google.android.gms.common.internal.w.b.e(parcel, iT, com.google.android.gms.common.b.CREATOR);
            } else if (iL == 4) {
                zM = com.google.android.gms.common.internal.w.b.m(parcel, iT);
            } else if (iL != 5) {
                com.google.android.gms.common.internal.w.b.z(parcel, iT);
            } else {
                zM2 = com.google.android.gms.common.internal.w.b.m(parcel, iT);
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new r(iV, iBinderU, bVar, zM, zM2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ r[] newArray(int i2) {
        return new r[i2];
    }
}