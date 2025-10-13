package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class z93 implements Parcelable.Creator<y93> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ y93 createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        int iV = 0;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            if (com.google.android.gms.common.internal.w.b.l(iT) != 2) {
                com.google.android.gms.common.internal.w.b.z(parcel, iT);
            } else {
                iV = com.google.android.gms.common.internal.w.b.v(parcel, iT);
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new y93(iV);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ y93[] newArray(int i2) {
        return new y93[i2];
    }
}