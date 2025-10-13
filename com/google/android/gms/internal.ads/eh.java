package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class eh extends zr2 implements gh {
    eh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final void b(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString("Adapter returned null.");
        zzbj(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final void e(g93 g93Var) {
        Parcel parcelZza = zza();
        bs2.d(parcelZza, g93Var);
        zzbj(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final void i(e.c.b.b.b.b bVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        zzbj(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final void k1(cg cgVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, cgVar);
        zzbj(4, parcelZza);
    }
}