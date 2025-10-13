package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class x93 implements Parcelable.Creator<w93> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ w93 createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        String strF = null;
        g93 g93Var = null;
        Bundle bundleA = null;
        long jW = 0;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            int iL = com.google.android.gms.common.internal.w.b.l(iT);
            if (iL == 1) {
                strF = com.google.android.gms.common.internal.w.b.f(parcel, iT);
            } else if (iL == 2) {
                jW = com.google.android.gms.common.internal.w.b.w(parcel, iT);
            } else if (iL == 3) {
                g93Var = (g93) com.google.android.gms.common.internal.w.b.e(parcel, iT, g93.CREATOR);
            } else if (iL != 4) {
                com.google.android.gms.common.internal.w.b.z(parcel, iT);
            } else {
                bundleA = com.google.android.gms.common.internal.w.b.a(parcel, iT);
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new w93(strF, jW, g93Var, bundleA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ w93[] newArray(int i2) {
        return new w93[i2];
    }
}