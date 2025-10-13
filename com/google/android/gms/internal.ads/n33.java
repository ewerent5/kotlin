package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class n33 extends zr2 implements q33 {
    n33(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.q33
    public final void H2(e.c.b.b.b.b bVar, x33 x33Var) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        bs2.f(parcelZza, x33Var);
        zzbj(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.q33
    public final void P(boolean z) {
        Parcel parcelZza = zza();
        bs2.b(parcelZza, z);
        zzbj(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.q33
    public final void j4(h1 h1Var) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, h1Var);
        zzbj(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.q33
    public final k1 zzg() {
        Parcel parcelZzbi = zzbi(5, zza());
        k1 k1VarI4 = j1.I4(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return k1VarI4;
    }
}