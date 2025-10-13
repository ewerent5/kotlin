package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class v93 implements Parcelable.Creator<t93> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ t93 createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        String strF = null;
        long jW = 0;
        int iV = 0;
        int iV2 = 0;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            int iL = com.google.android.gms.common.internal.w.b.l(iT);
            if (iL == 1) {
                iV = com.google.android.gms.common.internal.w.b.v(parcel, iT);
            } else if (iL == 2) {
                iV2 = com.google.android.gms.common.internal.w.b.v(parcel, iT);
            } else if (iL == 3) {
                strF = com.google.android.gms.common.internal.w.b.f(parcel, iT);
            } else if (iL != 4) {
                com.google.android.gms.common.internal.w.b.z(parcel, iT);
            } else {
                jW = com.google.android.gms.common.internal.w.b.w(parcel, iT);
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new t93(iV, iV2, strF, jW);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ t93[] newArray(int i2) {
        return new t93[i2];
    }
}