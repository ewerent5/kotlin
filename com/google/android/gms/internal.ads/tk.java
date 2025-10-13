package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class tk implements Parcelable.Creator<sk> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ sk createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        IBinder iBinderU = null;
        IBinder iBinderU2 = null;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            int iL = com.google.android.gms.common.internal.w.b.l(iT);
            if (iL == 1) {
                iBinderU = com.google.android.gms.common.internal.w.b.u(parcel, iT);
            } else if (iL != 2) {
                com.google.android.gms.common.internal.w.b.z(parcel, iT);
            } else {
                iBinderU2 = com.google.android.gms.common.internal.w.b.u(parcel, iT);
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new sk(iBinderU, iBinderU2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ sk[] newArray(int i2) {
        return new sk[i2];
    }
}