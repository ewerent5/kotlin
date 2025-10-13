package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public final class n implements Parcelable.Creator<Status> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Status createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        String strF = null;
        PendingIntent pendingIntent = null;
        com.google.android.gms.common.b bVar = null;
        int iV = 0;
        int iV2 = 0;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            int iL = com.google.android.gms.common.internal.w.b.l(iT);
            if (iL == 1) {
                iV2 = com.google.android.gms.common.internal.w.b.v(parcel, iT);
            } else if (iL == 2) {
                strF = com.google.android.gms.common.internal.w.b.f(parcel, iT);
            } else if (iL == 3) {
                pendingIntent = (PendingIntent) com.google.android.gms.common.internal.w.b.e(parcel, iT, PendingIntent.CREATOR);
            } else if (iL == 4) {
                bVar = (com.google.android.gms.common.b) com.google.android.gms.common.internal.w.b.e(parcel, iT, com.google.android.gms.common.b.CREATOR);
            } else if (iL != 1000) {
                com.google.android.gms.common.internal.w.b.z(parcel, iT);
            } else {
                iV = com.google.android.gms.common.internal.w.b.v(parcel, iT);
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new Status(iV, iV2, strF, pendingIntent, bVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Status[] newArray(int i2) {
        return new Status[i2];
    }
}