package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class fn extends zr2 implements hn {
    fn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.hn
    public final void e(g93 g93Var) {
        Parcel parcelZza = zza();
        bs2.d(parcelZza, g93Var);
        zzbj(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.hn
    public final void j(int i2) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i2);
        zzbj(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.hn
    public final void zze() {
        zzbj(1, zza());
    }
}