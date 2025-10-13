package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class up extends zr2 implements wp {
    up(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final void E(String str, String str2, Bundle bundle) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        bs2.d(parcelZza, bundle);
        zzbj(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final void d(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzbj(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.wp
    public final void o(String str, String str2) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbj(1, parcelZza);
    }
}