package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class z6 extends zr2 implements b7 {
    z6(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    @Override // com.google.android.gms.internal.ads.b7
    public final void k(e.c.b.b.b.b bVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        zzbj(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.b7
    public final void v(e.c.b.b.b.b bVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        zzbj(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.b7
    public final void zzc() {
        zzbj(2, zza());
    }
}