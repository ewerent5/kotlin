package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class ij extends zr2 implements kj {
    ij(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // com.google.android.gms.internal.ads.kj
    public final void a0(Intent intent) {
        Parcel parcelZza = zza();
        bs2.d(parcelZza, intent);
        zzbj(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.kj
    public final void e0(e.c.b.b.b.b bVar, String str, String str2) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbj(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.kj
    public final void zzg() {
        zzbj(3, zza());
    }
}