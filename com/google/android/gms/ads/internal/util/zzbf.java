package com.google.android.gms.ads.internal.util;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.bs2;
import com.google.android.gms.internal.ads.zr2;
import e.c.b.b.b.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class zzbf extends zr2 implements zzbh {
    zzbf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // com.google.android.gms.ads.internal.util.zzbh
    public final boolean zze(b bVar, String str, String str2) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        Parcel parcelZzbi = zzbi(1, parcelZza);
        boolean zA = bs2.a(parcelZzbi);
        parcelZzbi.recycle();
        return zA;
    }

    @Override // com.google.android.gms.ads.internal.util.zzbh
    public final void zzf(b bVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        zzbj(2, parcelZza);
    }
}