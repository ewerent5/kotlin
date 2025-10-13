package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class u implements Parcelable.Creator<r> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ r createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        String strF = null;
        q qVar = null;
        String strF2 = null;
        long jW = 0;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            int iL = com.google.android.gms.common.internal.w.b.l(iT);
            if (iL == 2) {
                strF = com.google.android.gms.common.internal.w.b.f(parcel, iT);
            } else if (iL == 3) {
                qVar = (q) com.google.android.gms.common.internal.w.b.e(parcel, iT, q.CREATOR);
            } else if (iL == 4) {
                strF2 = com.google.android.gms.common.internal.w.b.f(parcel, iT);
            } else if (iL != 5) {
                com.google.android.gms.common.internal.w.b.z(parcel, iT);
            } else {
                jW = com.google.android.gms.common.internal.w.b.w(parcel, iT);
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new r(strF, qVar, strF2, jW);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ r[] newArray(int i2) {
        return new r[i2];
    }
}