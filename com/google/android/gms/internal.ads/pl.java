package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class pl implements Parcelable.Creator<ol> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ol createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            if (com.google.android.gms.common.internal.w.b.l(iT) != 2) {
                com.google.android.gms.common.internal.w.b.z(parcel, iT);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) com.google.android.gms.common.internal.w.b.e(parcel, iT, ParcelFileDescriptor.CREATOR);
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new ol(parcelFileDescriptor);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ol[] newArray(int i2) {
        return new ol[i2];
    }
}