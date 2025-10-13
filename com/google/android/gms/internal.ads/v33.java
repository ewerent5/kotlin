package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class v33 extends zr2 implements x33 {
    v33(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.x33
    public final void F(g93 g93Var) {
        Parcel parcelZza = zza();
        bs2.d(parcelZza, g93Var);
        zzbj(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.x33
    public final void zzc() {
        zzbj(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.x33
    public final void zzd() {
        zzbj(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.x33
    public final void zzf() {
        zzbj(4, zza());
    }
}