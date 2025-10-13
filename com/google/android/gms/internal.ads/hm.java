package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class hm extends zr2 implements IInterface {
    hm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void R(gm gmVar, String str, String str2) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, gmVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbj(2, parcelZza);
    }
}