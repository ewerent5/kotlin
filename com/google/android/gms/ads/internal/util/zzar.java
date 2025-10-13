package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.b;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class zzar implements Parcelable.Creator<zzaq> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzaq createFromParcel(Parcel parcel) {
        int iA = b.A(parcel);
        String strF = null;
        int iV = 0;
        while (parcel.dataPosition() < iA) {
            int iT = b.t(parcel);
            int iL = b.l(iT);
            if (iL == 1) {
                strF = b.f(parcel, iT);
            } else if (iL != 2) {
                b.z(parcel, iT);
            } else {
                iV = b.v(parcel, iT);
            }
        }
        b.k(parcel, iA);
        return new zzaq(strF, iV);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzaq[] newArray(int i2) {
        return new zzaq[i2];
    }
}