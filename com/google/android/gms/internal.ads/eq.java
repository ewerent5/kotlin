package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class eq implements Parcelable.Creator<dq> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ dq createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        String strF = null;
        String strF2 = null;
        r93 r93Var = null;
        m93 m93Var = null;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            int iL = com.google.android.gms.common.internal.w.b.l(iT);
            if (iL == 1) {
                strF = com.google.android.gms.common.internal.w.b.f(parcel, iT);
            } else if (iL == 2) {
                strF2 = com.google.android.gms.common.internal.w.b.f(parcel, iT);
            } else if (iL == 3) {
                r93Var = (r93) com.google.android.gms.common.internal.w.b.e(parcel, iT, r93.CREATOR);
            } else if (iL != 4) {
                com.google.android.gms.common.internal.w.b.z(parcel, iT);
            } else {
                m93Var = (m93) com.google.android.gms.common.internal.w.b.e(parcel, iT, m93.CREATOR);
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new dq(strF, strF2, r93Var, m93Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ dq[] newArray(int i2) {
        return new dq[i2];
    }
}