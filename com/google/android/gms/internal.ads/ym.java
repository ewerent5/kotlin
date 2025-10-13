package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class ym extends zr2 implements an {
    ym(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.an
    public final void V(boolean z) {
        Parcel parcelZza = zza();
        bs2.b(parcelZza, z);
        zzbj(15, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.an
    public final void V2(m93 m93Var, hn hnVar) {
        Parcel parcelZza = zza();
        bs2.d(parcelZza, m93Var);
        bs2.f(parcelZza, hnVar);
        zzbj(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.an
    public final void c1(h1 h1Var) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, h1Var);
        zzbj(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.an
    public final void d0(on onVar) {
        Parcel parcelZza = zza();
        bs2.d(parcelZza, onVar);
        zzbj(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.an
    public final void e3(dn dnVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, dnVar);
        zzbj(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.an
    public final void k(e.c.b.b.b.b bVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        zzbj(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.an
    public final void w2(m93 m93Var, hn hnVar) {
        Parcel parcelZza = zza();
        bs2.d(parcelZza, m93Var);
        bs2.f(parcelZza, hnVar);
        zzbj(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.an
    public final void y3(e1 e1Var) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, e1Var);
        zzbj(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.an
    public final Bundle zzg() {
        Parcel parcelZzbi = zzbi(9, zza());
        Bundle bundle = (Bundle) bs2.c(parcelZzbi, Bundle.CREATOR);
        parcelZzbi.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.an
    public final xm zzl() {
        xm vmVar;
        Parcel parcelZzbi = zzbi(11, zza());
        IBinder strongBinder = parcelZzbi.readStrongBinder();
        if (strongBinder == null) {
            vmVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            vmVar = iInterfaceQueryLocalInterface instanceof xm ? (xm) iInterfaceQueryLocalInterface : new vm(strongBinder);
        }
        parcelZzbi.recycle();
        return vmVar;
    }

    @Override // com.google.android.gms.internal.ads.an
    public final k1 zzm() {
        Parcel parcelZzbi = zzbi(12, zza());
        k1 k1VarI4 = j1.I4(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return k1VarI4;
    }
}