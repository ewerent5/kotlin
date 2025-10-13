package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class f0 extends zr2 implements h0 {
    f0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.h0
    public final w zzb(e.c.b.b.b.b bVar, r93 r93Var, String str, tf tfVar, int i2) {
        w uVar;
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        bs2.d(parcelZza, r93Var);
        parcelZza.writeString(str);
        bs2.f(parcelZza, tfVar);
        parcelZza.writeInt(210890000);
        Parcel parcelZzbi = zzbi(1, parcelZza);
        IBinder strongBinder = parcelZzbi.readStrongBinder();
        if (strongBinder == null) {
            uVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            uVar = iInterfaceQueryLocalInterface instanceof w ? (w) iInterfaceQueryLocalInterface : new u(strongBinder);
        }
        parcelZzbi.recycle();
        return uVar;
    }

    @Override // com.google.android.gms.internal.ads.h0
    public final w zzc(e.c.b.b.b.b bVar, r93 r93Var, String str, tf tfVar, int i2) {
        w uVar;
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        bs2.d(parcelZza, r93Var);
        parcelZza.writeString(str);
        bs2.f(parcelZza, tfVar);
        parcelZza.writeInt(210890000);
        Parcel parcelZzbi = zzbi(2, parcelZza);
        IBinder strongBinder = parcelZzbi.readStrongBinder();
        if (strongBinder == null) {
            uVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            uVar = iInterfaceQueryLocalInterface instanceof w ? (w) iInterfaceQueryLocalInterface : new u(strongBinder);
        }
        parcelZzbi.recycle();
        return uVar;
    }

    @Override // com.google.android.gms.internal.ads.h0
    public final s zzd(e.c.b.b.b.b bVar, String str, tf tfVar, int i2) {
        s qVar;
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        parcelZza.writeString(str);
        bs2.f(parcelZza, tfVar);
        parcelZza.writeInt(210890000);
        Parcel parcelZzbi = zzbi(3, parcelZza);
        IBinder strongBinder = parcelZzbi.readStrongBinder();
        if (strongBinder == null) {
            qVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            qVar = iInterfaceQueryLocalInterface instanceof s ? (s) iInterfaceQueryLocalInterface : new q(strongBinder);
        }
        parcelZzbi.recycle();
        return qVar;
    }

    @Override // com.google.android.gms.internal.ads.h0
    public final x6 zze(e.c.b.b.b.b bVar, e.c.b.b.b.b bVar2) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        bs2.f(parcelZza, bVar2);
        Parcel parcelZzbi = zzbi(5, parcelZza);
        x6 x6VarI4 = w6.I4(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return x6VarI4;
    }

    @Override // com.google.android.gms.internal.ads.h0
    public final xj zzg(e.c.b.b.b.b bVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        Parcel parcelZzbi = zzbi(8, parcelZza);
        xj xjVarZzG = wj.zzG(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return xjVarZzG;
    }

    @Override // com.google.android.gms.internal.ads.h0
    public final o0 zzh(e.c.b.b.b.b bVar, int i2) {
        o0 m0Var;
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        parcelZza.writeInt(210890000);
        Parcel parcelZzbi = zzbi(9, parcelZza);
        IBinder strongBinder = parcelZzbi.readStrongBinder();
        if (strongBinder == null) {
            m0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            m0Var = iInterfaceQueryLocalInterface instanceof o0 ? (o0) iInterfaceQueryLocalInterface : new m0(strongBinder);
        }
        parcelZzbi.recycle();
        return m0Var;
    }

    @Override // com.google.android.gms.internal.ads.h0
    public final w zzi(e.c.b.b.b.b bVar, r93 r93Var, String str, int i2) {
        w uVar;
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        bs2.d(parcelZza, r93Var);
        parcelZza.writeString(str);
        parcelZza.writeInt(210890000);
        Parcel parcelZzbi = zzbi(10, parcelZza);
        IBinder strongBinder = parcelZzbi.readStrongBinder();
        if (strongBinder == null) {
            uVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            uVar = iInterfaceQueryLocalInterface instanceof w ? (w) iInterfaceQueryLocalInterface : new u(strongBinder);
        }
        parcelZzbi.recycle();
        return uVar;
    }

    @Override // com.google.android.gms.internal.ads.h0
    public final b7 zzj(e.c.b.b.b.b bVar, e.c.b.b.b.b bVar2, e.c.b.b.b.b bVar3) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        bs2.f(parcelZza, bVar2);
        bs2.f(parcelZza, bVar3);
        Parcel parcelZzbi = zzbi(11, parcelZza);
        b7 b7VarI4 = a7.I4(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return b7VarI4;
    }

    @Override // com.google.android.gms.internal.ads.h0
    public final an zzk(e.c.b.b.b.b bVar, String str, tf tfVar, int i2) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        parcelZza.writeString(str);
        bs2.f(parcelZza, tfVar);
        parcelZza.writeInt(210890000);
        Parcel parcelZzbi = zzbi(12, parcelZza);
        an anVarI4 = zm.I4(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return anVarI4;
    }

    @Override // com.google.android.gms.internal.ads.h0
    public final w zzl(e.c.b.b.b.b bVar, r93 r93Var, String str, tf tfVar, int i2) {
        w uVar;
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        bs2.d(parcelZza, r93Var);
        parcelZza.writeString(str);
        bs2.f(parcelZza, tfVar);
        parcelZza.writeInt(210890000);
        Parcel parcelZzbi = zzbi(13, parcelZza);
        IBinder strongBinder = parcelZzbi.readStrongBinder();
        if (strongBinder == null) {
            uVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            uVar = iInterfaceQueryLocalInterface instanceof w ? (w) iInterfaceQueryLocalInterface : new u(strongBinder);
        }
        parcelZzbi.recycle();
        return uVar;
    }

    @Override // com.google.android.gms.internal.ads.h0
    public final zp zzm(e.c.b.b.b.b bVar, tf tfVar, int i2) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        bs2.f(parcelZza, tfVar);
        parcelZza.writeInt(210890000);
        Parcel parcelZzbi = zzbi(14, parcelZza);
        zp zpVarZzb = yp.zzb(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return zpVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.h0
    public final kj zzn(e.c.b.b.b.b bVar, tf tfVar, int i2) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        bs2.f(parcelZza, tfVar);
        parcelZza.writeInt(210890000);
        Parcel parcelZzbi = zzbi(15, parcelZza);
        kj kjVarI4 = jj.I4(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return kjVarI4;
    }

    @Override // com.google.android.gms.internal.ads.h0
    public final ab zzo(e.c.b.b.b.b bVar, tf tfVar, int i2, xa xaVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        bs2.f(parcelZza, tfVar);
        parcelZza.writeInt(210890000);
        bs2.f(parcelZza, xaVar);
        Parcel parcelZzbi = zzbi(16, parcelZza);
        ab abVarI4 = za.I4(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return abVarI4;
    }
}