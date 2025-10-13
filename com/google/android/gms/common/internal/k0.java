package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public final class k0 implements Parcelable.Creator<t> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ t createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        int iV = 0;
        boolean zM = false;
        boolean zM2 = false;
        int iV2 = 0;
        int iV3 = 0;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            int iL = com.google.android.gms.common.internal.w.b.l(iT);
            if (iL == 1) {
                iV = com.google.android.gms.common.internal.w.b.v(parcel, iT);
            } else if (iL == 2) {
                zM = com.google.android.gms.common.internal.w.b.m(parcel, iT);
            } else if (iL == 3) {
                zM2 = com.google.android.gms.common.internal.w.b.m(parcel, iT);
            } else if (iL == 4) {
                iV2 = com.google.android.gms.common.internal.w.b.v(parcel, iT);
            } else if (iL != 5) {
                com.google.android.gms.common.internal.w.b.z(parcel, iT);
            } else {
                iV3 = com.google.android.gms.common.internal.w.b.v(parcel, iT);
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new t(iV, zM, zM2, iV2, iV3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ t[] newArray(int i2) {
        return new t[i2];
    }
}