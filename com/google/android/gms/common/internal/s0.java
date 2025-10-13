package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public final class s0 implements Parcelable.Creator<r0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ r0 createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        Bundle bundleA = null;
        com.google.android.gms.common.d[] dVarArr = null;
        e eVar = null;
        int iV = 0;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            int iL = com.google.android.gms.common.internal.w.b.l(iT);
            if (iL == 1) {
                bundleA = com.google.android.gms.common.internal.w.b.a(parcel, iT);
            } else if (iL == 2) {
                dVarArr = (com.google.android.gms.common.d[]) com.google.android.gms.common.internal.w.b.i(parcel, iT, com.google.android.gms.common.d.CREATOR);
            } else if (iL == 3) {
                iV = com.google.android.gms.common.internal.w.b.v(parcel, iT);
            } else if (iL != 4) {
                com.google.android.gms.common.internal.w.b.z(parcel, iT);
            } else {
                eVar = (e) com.google.android.gms.common.internal.w.b.e(parcel, iT, e.CREATOR);
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new r0(bundleA, dVarArr, iV, eVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ r0[] newArray(int i2) {
        return new r0[i2];
    }
}