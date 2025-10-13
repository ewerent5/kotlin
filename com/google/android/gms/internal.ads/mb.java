package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class mb implements Parcelable.Creator<lb> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ lb createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        String strF = null;
        byte[] bArrB = null;
        String[] strArrG = null;
        String[] strArrG2 = null;
        long jW = 0;
        boolean zM = false;
        int iV = 0;
        boolean zM2 = false;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            switch (com.google.android.gms.common.internal.w.b.l(iT)) {
                case 1:
                    zM = com.google.android.gms.common.internal.w.b.m(parcel, iT);
                    break;
                case 2:
                    strF = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 3:
                    iV = com.google.android.gms.common.internal.w.b.v(parcel, iT);
                    break;
                case 4:
                    bArrB = com.google.android.gms.common.internal.w.b.b(parcel, iT);
                    break;
                case 5:
                    strArrG = com.google.android.gms.common.internal.w.b.g(parcel, iT);
                    break;
                case 6:
                    strArrG2 = com.google.android.gms.common.internal.w.b.g(parcel, iT);
                    break;
                case 7:
                    zM2 = com.google.android.gms.common.internal.w.b.m(parcel, iT);
                    break;
                case 8:
                    jW = com.google.android.gms.common.internal.w.b.w(parcel, iT);
                    break;
                default:
                    com.google.android.gms.common.internal.w.b.z(parcel, iT);
                    break;
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new lb(zM, strF, iV, bArrB, strArrG, strArrG2, zM2, jW);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ lb[] newArray(int i2) {
        return new lb[i2];
    }
}