package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class pm implements Parcelable.Creator<nm> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ nm createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        m93 m93Var = null;
        String strF = null;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            int iL = com.google.android.gms.common.internal.w.b.l(iT);
            if (iL == 2) {
                m93Var = (m93) com.google.android.gms.common.internal.w.b.e(parcel, iT, m93.CREATOR);
            } else if (iL != 3) {
                com.google.android.gms.common.internal.w.b.z(parcel, iT);
            } else {
                strF = com.google.android.gms.common.internal.w.b.f(parcel, iT);
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new nm(m93Var, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ nm[] newArray(int i2) {
        return new nm[i2];
    }
}