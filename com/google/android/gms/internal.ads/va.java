package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class va extends zr2 implements xa {
    va(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    @Override // com.google.android.gms.internal.ads.xa
    public final void c(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzbj(1, parcelZza);
    }
}