package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class fo implements Parcelable.Creator<eo> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ eo createFromParcel(Parcel parcel) {
        int iA = com.google.android.gms.common.internal.w.b.A(parcel);
        String strF = null;
        String strF2 = null;
        ArrayList<String> arrayListH = null;
        ArrayList<String> arrayListH2 = null;
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        boolean zM4 = false;
        while (parcel.dataPosition() < iA) {
            int iT = com.google.android.gms.common.internal.w.b.t(parcel);
            switch (com.google.android.gms.common.internal.w.b.l(iT)) {
                case 2:
                    strF = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 3:
                    strF2 = com.google.android.gms.common.internal.w.b.f(parcel, iT);
                    break;
                case 4:
                    zM = com.google.android.gms.common.internal.w.b.m(parcel, iT);
                    break;
                case 5:
                    zM2 = com.google.android.gms.common.internal.w.b.m(parcel, iT);
                    break;
                case 6:
                    arrayListH = com.google.android.gms.common.internal.w.b.h(parcel, iT);
                    break;
                case 7:
                    zM3 = com.google.android.gms.common.internal.w.b.m(parcel, iT);
                    break;
                case 8:
                    zM4 = com.google.android.gms.common.internal.w.b.m(parcel, iT);
                    break;
                case 9:
                    arrayListH2 = com.google.android.gms.common.internal.w.b.h(parcel, iT);
                    break;
                default:
                    com.google.android.gms.common.internal.w.b.z(parcel, iT);
                    break;
            }
        }
        com.google.android.gms.common.internal.w.b.k(parcel, iA);
        return new eo(strF, strF2, zM, zM2, arrayListH, zM3, zM4, arrayListH2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ eo[] newArray(int i2) {
        return new eo[i2];
    }
}