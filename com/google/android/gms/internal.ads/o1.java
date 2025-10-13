package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class o1 extends zr2 implements q1 {
    o1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.internal.ads.q1
    public final void S2(boolean z) {
        Parcel parcelZza = zza();
        bs2.b(parcelZza, z);
        zzbj(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.q1
    public final void zze() {
        zzbj(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.q1
    public final void zzf() {
        zzbj(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.q1
    public final void zzg() {
        zzbj(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.q1
    public final void zzh() {
        zzbj(4, zza());
    }
}