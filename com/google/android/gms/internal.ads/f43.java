package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class f43 implements Parcelable.Creator<e43> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ e43 createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        long jW = 0;
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            int iL = com.google.android.gms.common.internal.w.b.l(iT);
            if (iL == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) com.google.android.gms.common.internal.w.b.e(parcel, iT, ParcelFileDescriptor.CREATOR);
            } else if (iL == 3) {
                zM = com.google.android.gms.common.internal.w.b.m(parcel, iT);
            } else if (iL == 4) {
                zM2 = com.google.android.gms.common.internal.w.b.m(parcel, iT);
            } else if (iL == 5) {
                jW = com.google.android.gms.common.internal.w.b.w(parcel, iT);
            } else if (iL != 6) {
                com.google.android.gms.common.internal.w.b.z(parcel, iT);
            } else {
                zM3 = com.google.android.gms.common.internal.w.b.m(parcel, iT);
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new e43(parcelFileDescriptor, zM, zM2, jW, zM3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ e43[] newArray(int i2) {
        return new e43[i2];
    }
}