package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class ba implements Parcelable.Creator<ca> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ca createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        String strF = null;
        Long lX = null;
        Float fS = null;
        String strF2 = null;
        String strF3 = null;
        Double dQ = null;
        long jW = 0;
        int iV = 0;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            switch (com.google.android.gms.common.internal.w.b.l(iT)) {
                case 1:
                    iV = com.google.android.gms.common.internal.w.b.v(parcel, iT);
                    break;
                case 2:
                    strF = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 3:
                    jW = com.google.android.gms.common.internal.w.b.w(parcel, iT);
                    break;
                case 4:
                    lX = com.google.android.gms.common.internal.w.b.x(parcel, iT);
                    break;
                case 5:
                    fS = com.google.android.gms.common.internal.w.b.s(parcel, iT);
                    break;
                case 6:
                    strF2 = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 7:
                    strF3 = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 8:
                    dQ = com.google.android.gms.common.internal.w.b.q(parcel, iT);
                    break;
                default:
                    com.google.android.gms.common.internal.w.b.z(parcel, iT);
                    break;
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new ca(iV, strF, jW, lX, fS, strF2, strF3, dQ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ca[] newArray(int i2) {
        return new ca[i2];
    }
}