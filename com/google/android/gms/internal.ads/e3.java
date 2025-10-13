package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class e3 implements Parcelable.Creator<d3> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ d3 createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            int iL = com.google.android.gms.common.internal.w.b.l(iT);
            if (iL == 2) {
                zM = com.google.android.gms.common.internal.w.b.m(parcel, iT);
            } else if (iL == 3) {
                zM2 = com.google.android.gms.common.internal.w.b.m(parcel, iT);
            } else if (iL != 4) {
                com.google.android.gms.common.internal.w.b.z(parcel, iT);
            } else {
                zM3 = com.google.android.gms.common.internal.w.b.m(parcel, iT);
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new d3(zM, zM2, zM3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ d3[] newArray(int i2) {
        return new d3[i2];
    }
}