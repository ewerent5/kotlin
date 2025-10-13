package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class ic implements Parcelable.Creator<hc> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ hc createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        String strF = null;
        Bundle bundleA = null;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            int iL = com.google.android.gms.common.internal.w.b.l(iT);
            if (iL == 1) {
                strF = com.google.android.gms.common.internal.w.b.f(parcel, iT);
            } else if (iL != 2) {
                com.google.android.gms.common.internal.w.b.z(parcel, iT);
            } else {
                bundleA = com.google.android.gms.common.internal.w.b.a(parcel, iT);
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new hc(strF, bundleA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ hc[] newArray(int i2) {
        return new hc[i2];
    }
}