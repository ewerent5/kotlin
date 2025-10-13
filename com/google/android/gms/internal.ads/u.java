package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e.c.b.b.b.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class u extends zr2 implements w {
    u(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // com.google.android.gms.internal.ads.w
    public final boolean zzA() {
        Parcel parcelZzbi = zzbi(23, zza());
        boolean zA = bs2.a(parcelZzbi);
        parcelZzbi.recycle();
        return zA;
    }

    @Override // com.google.android.gms.internal.ads.w
    public final n1 zzE() {
        n1 l1Var;
        Parcel parcelZzbi = zzbi(26, zza());
        IBinder strongBinder = parcelZzbi.readStrongBinder();
        if (strongBinder == null) {
            l1Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            l1Var = iInterfaceQueryLocalInterface instanceof n1 ? (n1) iInterfaceQueryLocalInterface : new l1(strongBinder);
        }
        parcelZzbi.recycle();
        return l1Var;
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzF(d3 d3Var) {
        Parcel parcelZza = zza();
        bs2.d(parcelZza, d3Var);
        zzbj(29, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzH(y93 y93Var) {
        Parcel parcelZza = zza();
        bs2.d(parcelZza, y93Var);
        zzbj(39, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzI(t33 t33Var) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, t33Var);
        zzbj(40, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzJ(boolean z) {
        Parcel parcelZza = zza();
        bs2.b(parcelZza, z);
        zzbj(34, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzO(h1 h1Var) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, h1Var);
        zzbj(42, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzP(m93 m93Var, m mVar) {
        Parcel parcelZza = zza();
        bs2.d(parcelZza, m93Var);
        bs2.f(parcelZza, mVar);
        zzbj(43, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzQ(e.c.b.b.b.b bVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        zzbj(44, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzR(l0 l0Var) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, l0Var);
        zzbj(45, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.w
    public final e.c.b.b.b.b zzb() {
        Parcel parcelZzbi = zzbi(1, zza());
        e.c.b.b.b.b bVarU = b.a.U(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return bVarU;
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzc() {
        zzbj(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.w
    public final boolean zze(m93 m93Var) {
        Parcel parcelZza = zza();
        bs2.d(parcelZza, m93Var);
        Parcel parcelZzbi = zzbi(4, parcelZza);
        boolean zA = bs2.a(parcelZzbi);
        parcelZzbi.recycle();
        return zA;
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzf() {
        zzbj(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzg() {
        zzbj(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzh(j jVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, jVar);
        zzbj(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzi(e0 e0Var) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, e0Var);
        zzbj(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzm() {
        zzbj(11, zza());
    }

    @Override // com.google.android.gms.internal.ads.w
    public final r93 zzn() {
        Parcel parcelZzbi = zzbi(12, zza());
        r93 r93Var = (r93) bs2.c(parcelZzbi, r93.CREATOR);
        parcelZzbi.recycle();
        return r93Var;
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzo(r93 r93Var) {
        Parcel parcelZza = zza();
        bs2.d(parcelZza, r93Var);
        zzbj(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.w
    public final k1 zzt() {
        k1 i1Var;
        Parcel parcelZzbi = zzbi(41, zza());
        IBinder strongBinder = parcelZzbi.readStrongBinder();
        if (strongBinder == null) {
            i1Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            i1Var = iInterfaceQueryLocalInterface instanceof k1 ? (k1) iInterfaceQueryLocalInterface : new i1(strongBinder);
        }
        parcelZzbi.recycle();
        return i1Var;
    }

    @Override // com.google.android.gms.internal.ads.w
    public final String zzu() {
        Parcel parcelZzbi = zzbi(31, zza());
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.w
    public final e0 zzv() {
        e0 b0Var;
        Parcel parcelZzbi = zzbi(32, zza());
        IBinder strongBinder = parcelZzbi.readStrongBinder();
        if (strongBinder == null) {
            b0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            b0Var = iInterfaceQueryLocalInterface instanceof e0 ? (e0) iInterfaceQueryLocalInterface : new b0(strongBinder);
        }
        parcelZzbi.recycle();
        return b0Var;
    }

    @Override // com.google.android.gms.internal.ads.w
    public final j zzw() {
        j hVar;
        Parcel parcelZzbi = zzbi(33, zza());
        IBinder strongBinder = parcelZzbi.readStrongBinder();
        if (strongBinder == null) {
            hVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            hVar = iInterfaceQueryLocalInterface instanceof j ? (j) iInterfaceQueryLocalInterface : new h(strongBinder);
        }
        parcelZzbi.recycle();
        return hVar;
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzy(g gVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, gVar);
        zzbj(20, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.w
    public final void zzz(boolean z) {
        Parcel parcelZza = zza();
        bs2.b(parcelZza, z);
        zzbj(22, parcelZza);
    }
}