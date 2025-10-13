package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class zb extends zr2 implements bc {
    zb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.bc
    public final void b(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzbj(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.bc
    public final void zze() {
        zzbj(2, zza());
    }
}