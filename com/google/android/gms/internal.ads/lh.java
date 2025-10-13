package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class lh extends zr2 implements nh {
    lh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.nh
    public final void a4(ig igVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, igVar);
        zzbj(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.nh
    public final void b(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString("Adapter returned null.");
        zzbj(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.nh
    public final void e(g93 g93Var) {
        Parcel parcelZza = zza();
        bs2.d(parcelZza, g93Var);
        zzbj(3, parcelZza);
    }
}