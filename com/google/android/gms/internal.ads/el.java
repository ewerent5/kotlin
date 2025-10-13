package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class el implements Parcelable.Creator<dl> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ dl createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        boolean zM = false;
        ArrayList<String> arrayListH = null;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            int iL = com.google.android.gms.common.internal.w.b.l(iT);
            if (iL == 2) {
                zM = com.google.android.gms.common.internal.w.b.m(parcel, iT);
            } else if (iL != 3) {
                com.google.android.gms.common.internal.w.b.z(parcel, iT);
            } else {
                arrayListH = com.google.android.gms.common.internal.w.b.h(parcel, iT);
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new dl(zM, arrayListH);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ dl[] newArray(int i2) {
        return new dl[i2];
    }
}