package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public final class i0 implements Parcelable.Creator<h0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ h0 createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        boolean zM = false;
        String strF = null;
        IBinder iBinderU = null;
        boolean zM2 = false;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            int iL = com.google.android.gms.common.internal.w.b.l(iT);
            if (iL == 1) {
                strF = com.google.android.gms.common.internal.w.b.f(parcel, iT);
            } else if (iL == 2) {
                iBinderU = com.google.android.gms.common.internal.w.b.u(parcel, iT);
            } else if (iL == 3) {
                zM = com.google.android.gms.common.internal.w.b.m(parcel, iT);
            } else if (iL != 4) {
                com.google.android.gms.common.internal.w.b.z(parcel, iT);
            } else {
                zM2 = com.google.android.gms.common.internal.w.b.m(parcel, iT);
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new h0(strF, iBinderU, zM, zM2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ h0[] newArray(int i2) {
        return new h0[i2];
    }
}