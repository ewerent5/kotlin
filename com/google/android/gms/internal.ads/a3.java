package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class a3 implements Parcelable.Creator<z2> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ z2 createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        String strF = null;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            if (com.google.android.gms.common.internal.w.b.l(iT) != 15) {
                com.google.android.gms.common.internal.w.b.z(parcel, iT);
            } else {
                strF = com.google.android.gms.common.internal.w.b.f(parcel, iT);
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new z2(strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ z2[] newArray(int i2) {
        return new z2[i2];
    }
}