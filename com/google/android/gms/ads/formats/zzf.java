package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class zzf implements Parcelable.Creator<PublisherAdViewOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PublisherAdViewOptions createFromParcel(Parcel parcel) {
        int iA = b.A(parcel);
        IBinder iBinderU = null;
        IBinder iBinderU2 = null;
        boolean zM = false;
        while (parcel.dataPosition() < iA) {
            int iT = b.t(parcel);
            int iL = b.l(iT);
            if (iL == 1) {
                zM = b.m(parcel, iT);
            } else if (iL == 2) {
                iBinderU = b.u(parcel, iT);
            } else if (iL != 3) {
                b.z(parcel, iT);
            } else {
                iBinderU2 = b.u(parcel, iT);
            }
        }
        b.k(parcel, iA);
        return new PublisherAdViewOptions(zM, iBinderU, iBinderU2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PublisherAdViewOptions[] newArray(int i2) {
        return new PublisherAdViewOptions[i2];
    }
}