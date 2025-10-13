package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class n extends zr2 implements p {
    n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.p
    public final void Q2(m93 m93Var, int i2) {
        Parcel parcelZza = zza();
        bs2.d(parcelZza, m93Var);
        parcelZza.writeInt(i2);
        zzbj(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.p
    public final void zze(m93 m93Var) {
        Parcel parcelZza = zza();
        bs2.d(parcelZza, m93Var);
        zzbj(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.p
    public final boolean zzg() {
        Parcel parcelZzbi = zzbi(3, zza());
        boolean zA = bs2.a(parcelZzbi);
        parcelZzbi.recycle();
        return zA;
    }
}