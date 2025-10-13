package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class vm extends zr2 implements xm {
    vm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.xm
    public final String zze() {
        Parcel parcelZzbi = zzbi(1, zza());
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.xm
    public final int zzf() {
        Parcel parcelZzbi = zzbi(2, zza());
        int i2 = parcelZzbi.readInt();
        parcelZzbi.recycle();
        return i2;
    }
}