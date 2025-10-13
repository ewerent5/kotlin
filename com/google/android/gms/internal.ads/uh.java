package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class uh extends zr2 implements wh {
    uh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override // com.google.android.gms.internal.ads.wh
    public final void b(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzbj(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.wh
    public final void e(g93 g93Var) {
        Parcel parcelZza = zza();
        bs2.d(parcelZza, g93Var);
        zzbj(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.wh
    public final void zze(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzbj(1, parcelZza);
    }
}