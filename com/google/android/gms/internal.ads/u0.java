package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class u0 extends zr2 implements w0 {
    u0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    @Override // com.google.android.gms.internal.ads.w0
    public final String zze() {
        Parcel parcelZzbi = zzbi(1, zza());
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.w0
    public final String zzf() {
        Parcel parcelZzbi = zzbi(2, zza());
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }
}