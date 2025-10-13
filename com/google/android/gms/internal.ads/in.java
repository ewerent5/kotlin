package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class in extends zr2 implements IInterface {
    in(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
    }

    public final void R(xm xmVar, String str, String str2) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, xmVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbj(2, parcelZza);
    }
}