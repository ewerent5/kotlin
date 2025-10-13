package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class zzc implements Parcelable.Creator<AdManagerAdViewOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AdManagerAdViewOptions createFromParcel(Parcel parcel) {
        int iA = b.A(parcel);
        boolean zM = false;
        IBinder iBinderU = null;
        while (parcel.dataPosition() < iA) {
            int iT = b.t(parcel);
            int iL = b.l(iT);
            if (iL == 1) {
                zM = b.m(parcel, iT);
            } else if (iL != 2) {
                b.z(parcel, iT);
            } else {
                iBinderU = b.u(parcel, iT);
            }
        }
        b.k(parcel, iA);
        return new AdManagerAdViewOptions(zM, iBinderU);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AdManagerAdViewOptions[] newArray(int i2) {
        return new AdManagerAdViewOptions[i2];
    }
}