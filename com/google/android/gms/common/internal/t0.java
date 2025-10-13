package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public final class t0 implements Parcelable.Creator<e> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ e createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        t tVar = null;
        int[] iArrC = null;
        int[] iArrC2 = null;
        boolean zM = false;
        boolean zM2 = false;
        int iV = 0;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            switch (com.google.android.gms.common.internal.w.b.l(iT)) {
                case 1:
                    tVar = (t) com.google.android.gms.common.internal.w.b.e(parcel, iT, t.CREATOR);
                    break;
                case 2:
                    zM = com.google.android.gms.common.internal.w.b.m(parcel, iT);
                    break;
                case 3:
                    zM2 = com.google.android.gms.common.internal.w.b.m(parcel, iT);
                    break;
                case 4:
                    iArrC = com.google.android.gms.common.internal.w.b.c(parcel, iT);
                    break;
                case 5:
                    iV = com.google.android.gms.common.internal.w.b.v(parcel, iT);
                    break;
                case 6:
                    iArrC2 = com.google.android.gms.common.internal.w.b.c(parcel, iT);
                    break;
                default:
                    com.google.android.gms.common.internal.w.b.z(parcel, iT);
                    break;
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new e(tVar, zM, zM2, iArrC, iV, iArrC2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ e[] newArray(int i2) {
        return new e[i2];
    }
}