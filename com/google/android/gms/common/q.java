package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public final class q implements Parcelable.Creator<b> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ b createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        PendingIntent pendingIntent = null;
        String strF = null;
        int iV = 0;
        int iV2 = 0;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            int iL = com.google.android.gms.common.internal.w.b.l(iT);
            if (iL == 1) {
                iV = com.google.android.gms.common.internal.w.b.v(parcel, iT);
            } else if (iL == 2) {
                iV2 = com.google.android.gms.common.internal.w.b.v(parcel, iT);
            } else if (iL == 3) {
                pendingIntent = (PendingIntent) com.google.android.gms.common.internal.w.b.e(parcel, iT, PendingIntent.CREATOR);
            } else if (iL != 4) {
                com.google.android.gms.common.internal.w.b.z(parcel, iT);
            } else {
                strF = com.google.android.gms.common.internal.w.b.f(parcel, iT);
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new b(iV, iV2, pendingIntent, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ b[] newArray(int i2) {
        return new b[i2];
    }
}