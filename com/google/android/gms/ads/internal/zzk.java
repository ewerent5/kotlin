package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.b;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class zzk implements Parcelable.Creator<zzj> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzj createFromParcel(Parcel parcel) {
        int iA = b.A(parcel);
        String strF = null;
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        float fR = 0.0f;
        int iV = 0;
        boolean zM4 = false;
        boolean zM5 = false;
        boolean zM6 = false;
        while (parcel.dataPosition() < iA) {
            int iT = b.t(parcel);
            switch (b.l(iT)) {
                case 2:
                    zM = b.m(parcel, iT);
                    break;
                case 3:
                    zM2 = b.m(parcel, iT);
                    break;
                case 4:
                    strF = b.f(parcel, iT);
                    break;
                case 5:
                    zM3 = b.m(parcel, iT);
                    break;
                case 6:
                    fR = b.r(parcel, iT);
                    break;
                case 7:
                    iV = b.v(parcel, iT);
                    break;
                case 8:
                    zM4 = b.m(parcel, iT);
                    break;
                case 9:
                    zM5 = b.m(parcel, iT);
                    break;
                case 10:
                    zM6 = b.m(parcel, iT);
                    break;
                default:
                    b.z(parcel, iT);
                    break;
            }
        }
        b.k(parcel, iA);
        return new zzj(zM, zM2, strF, zM3, fR, iV, zM4, zM5, zM6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzj[] newArray(int i2) {
        return new zzj[i2];
    }
}