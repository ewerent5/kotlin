package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public final class d0 implements Parcelable.Creator<c0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ c0 createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        String strF = null;
        IBinder iBinderU = null;
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            int iL = com.google.android.gms.common.internal.w.b.l(iT);
            if (iL == 1) {
                strF = com.google.android.gms.common.internal.w.b.f(parcel, iT);
            } else if (iL == 2) {
                zM = com.google.android.gms.common.internal.w.b.m(parcel, iT);
            } else if (iL == 3) {
                zM2 = com.google.android.gms.common.internal.w.b.m(parcel, iT);
            } else if (iL == 4) {
                iBinderU = com.google.android.gms.common.internal.w.b.u(parcel, iT);
            } else if (iL != 5) {
                com.google.android.gms.common.internal.w.b.z(parcel, iT);
            } else {
                zM3 = com.google.android.gms.common.internal.w.b.m(parcel, iT);
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new c0(strF, zM, zM2, iBinderU, zM3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ c0[] newArray(int i2) {
        return new c0[i2];
    }
}