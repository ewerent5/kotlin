package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.b;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class zzb implements Parcelable.Creator<zzc> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzc createFromParcel(Parcel parcel) {
        int iA = b.A(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        String strF6 = null;
        String strF7 = null;
        Intent intent = null;
        IBinder iBinderU = null;
        boolean zM = false;
        while (parcel.dataPosition() < iA) {
            int iT = b.t(parcel);
            switch (b.l(iT)) {
                case 2:
                    strF = b.f(parcel, iT);
                    break;
                case 3:
                    strF2 = b.f(parcel, iT);
                    break;
                case 4:
                    strF3 = b.f(parcel, iT);
                    break;
                case 5:
                    strF4 = b.f(parcel, iT);
                    break;
                case 6:
                    strF5 = b.f(parcel, iT);
                    break;
                case 7:
                    strF6 = b.f(parcel, iT);
                    break;
                case 8:
                    strF7 = b.f(parcel, iT);
                    break;
                case 9:
                    intent = (Intent) b.e(parcel, iT, Intent.CREATOR);
                    break;
                case 10:
                    iBinderU = b.u(parcel, iT);
                    break;
                case 11:
                    zM = b.m(parcel, iT);
                    break;
                default:
                    b.z(parcel, iT);
                    break;
            }
        }
        b.k(parcel, iA);
        return new zzc(strF, strF2, strF3, strF4, strF5, strF6, strF7, intent, iBinderU, zM);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzc[] newArray(int i2) {
        return new zzc[i2];
    }
}