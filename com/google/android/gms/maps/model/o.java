package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-maps@@17.0.1 */
/* loaded from: classes.dex */
public final class o implements Parcelable.Creator<g> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ g createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        int iV = 0;
        Float fS = null;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            int iL = com.google.android.gms.common.internal.w.b.l(iT);
            if (iL == 2) {
                iV = com.google.android.gms.common.internal.w.b.v(parcel, iT);
            } else if (iL != 3) {
                com.google.android.gms.common.internal.w.b.z(parcel, iT);
            } else {
                fS = com.google.android.gms.common.internal.w.b.s(parcel, iT);
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new g(iV, fS);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ g[] newArray(int i2) {
        return new g[i2];
    }
}