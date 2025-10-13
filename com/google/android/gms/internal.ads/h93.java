package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class h93 implements Parcelable.Creator<g93> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ g93 createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        String strF = null;
        String strF2 = null;
        g93 g93Var = null;
        IBinder iBinderU = null;
        int iV = 0;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            int iL = com.google.android.gms.common.internal.w.b.l(iT);
            if (iL == 1) {
                iV = com.google.android.gms.common.internal.w.b.v(parcel, iT);
            } else if (iL == 2) {
                strF = com.google.android.gms.common.internal.w.b.f(parcel, iT);
            } else if (iL == 3) {
                strF2 = com.google.android.gms.common.internal.w.b.f(parcel, iT);
            } else if (iL == 4) {
                g93Var = (g93) com.google.android.gms.common.internal.w.b.e(parcel, iT, g93.CREATOR);
            } else if (iL != 5) {
                com.google.android.gms.common.internal.w.b.z(parcel, iT);
            } else {
                iBinderU = com.google.android.gms.common.internal.w.b.u(parcel, iT);
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new g93(iV, strF, strF2, g93Var, iBinderU);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ g93[] newArray(int i2) {
        return new g93[i2];
    }
}