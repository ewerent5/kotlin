package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class nc extends zr2 implements qc {
    nc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.qc
    public final void j(int i2) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i2);
        zzbj(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.qc
    public final void zze() {
        zzbj(1, zza());
    }
}