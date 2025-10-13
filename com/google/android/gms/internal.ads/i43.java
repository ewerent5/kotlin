package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class i43 implements Parcelable.Creator<h43> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ h43 createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        long jW = 0;
        long jW2 = 0;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        Bundle bundleA = null;
        String strF5 = null;
        boolean zM = false;
        int iV = 0;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            switch (com.google.android.gms.common.internal.w.b.l(iT)) {
                case 2:
                    strF = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 3:
                    jW = com.google.android.gms.common.internal.w.b.w(parcel, iT);
                    break;
                case 4:
                    strF2 = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 5:
                    strF3 = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 6:
                    strF4 = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 7:
                    bundleA = com.google.android.gms.common.internal.w.b.a(parcel, iT);
                    break;
                case 8:
                    zM = com.google.android.gms.common.internal.w.b.m(parcel, iT);
                    break;
                case 9:
                    jW2 = com.google.android.gms.common.internal.w.b.w(parcel, iT);
                    break;
                case 10:
                    strF5 = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 11:
                    iV = com.google.android.gms.common.internal.w.b.v(parcel, iT);
                    break;
                default:
                    com.google.android.gms.common.internal.w.b.z(parcel, iT);
                    break;
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new h43(strF, jW, strF2, strF3, strF4, bundleA, zM, jW2, strF5, iV);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ h43[] newArray(int i2) {
        return new h43[i2];
    }
}