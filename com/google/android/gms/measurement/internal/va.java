package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class va implements Parcelable.Creator<wa> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ wa createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        long jW = 0;
        long jW2 = 0;
        long jW3 = 0;
        String strF = null;
        String strF2 = null;
        ca caVar = null;
        String strF3 = null;
        r rVar = null;
        r rVar2 = null;
        r rVar3 = null;
        boolean zM = false;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            switch (com.google.android.gms.common.internal.w.b.l(iT)) {
                case 2:
                    strF = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 3:
                    strF2 = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 4:
                    caVar = (ca) com.google.android.gms.common.internal.w.b.e(parcel, iT, ca.CREATOR);
                    break;
                case 5:
                    jW = com.google.android.gms.common.internal.w.b.w(parcel, iT);
                    break;
                case 6:
                    zM = com.google.android.gms.common.internal.w.b.m(parcel, iT);
                    break;
                case 7:
                    strF3 = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 8:
                    rVar = (r) com.google.android.gms.common.internal.w.b.e(parcel, iT, r.CREATOR);
                    break;
                case 9:
                    jW2 = com.google.android.gms.common.internal.w.b.w(parcel, iT);
                    break;
                case 10:
                    rVar2 = (r) com.google.android.gms.common.internal.w.b.e(parcel, iT, r.CREATOR);
                    break;
                case 11:
                    jW3 = com.google.android.gms.common.internal.w.b.w(parcel, iT);
                    break;
                case 12:
                    rVar3 = (r) com.google.android.gms.common.internal.w.b.e(parcel, iT, r.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.w.b.z(parcel, iT);
                    break;
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new wa(strF, strF2, caVar, jW, zM, strF3, rVar, jW2, rVar2, jW3, rVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ wa[] newArray(int i2) {
        return new wa[i2];
    }
}