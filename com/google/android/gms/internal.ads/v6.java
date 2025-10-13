package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import e.c.b.b.b.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class v6 extends zr2 implements x6 {
    v6(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.x6
    public final void H4(e.c.b.b.b.b bVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        zzbj(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.x6
    public final void K0(q6 q6Var) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, q6Var);
        zzbj(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.x6
    public final void M(e.c.b.b.b.b bVar, int i2) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        parcelZza.writeInt(i2);
        zzbj(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.x6
    public final void P2(e.c.b.b.b.b bVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        zzbj(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.x6
    public final e.c.b.b.b.b d(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzbi = zzbi(2, parcelZza);
        e.c.b.b.b.b bVarU = b.a.U(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return bVarU;
    }

    @Override // com.google.android.gms.internal.ads.x6
    public final void r1(String str, e.c.b.b.b.b bVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        bs2.f(parcelZza, bVar);
        zzbj(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.x6
    public final void v(e.c.b.b.b.b bVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        zzbj(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.x6
    public final void zze() {
        zzbj(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.x6
    public final void zzg(e.c.b.b.b.b bVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        zzbj(6, parcelZza);
    }
}