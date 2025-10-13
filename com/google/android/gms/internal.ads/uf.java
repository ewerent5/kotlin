package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e.c.b.b.b.b;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class uf extends zr2 implements wf {
    uf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final ig A3() {
        ig ggVar;
        Parcel parcelZzbi = zzbi(27, zza());
        IBinder strongBinder = parcelZzbi.readStrongBinder();
        if (strongBinder == null) {
            ggVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            ggVar = iInterfaceQueryLocalInterface instanceof ig ? (ig) iInterfaceQueryLocalInterface : new gg(strongBinder);
        }
        parcelZzbi.recycle();
        return ggVar;
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void B(e.c.b.b.b.b bVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        zzbj(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void F4(m93 m93Var, String str) {
        Parcel parcelZza = zza();
        bs2.d(parcelZza, m93Var);
        parcelZza.writeString(str);
        zzbj(11, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void I3(e.c.b.b.b.b bVar, m93 m93Var, String str, zf zfVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        bs2.d(parcelZza, m93Var);
        parcelZza.writeString(str);
        bs2.f(parcelZza, zfVar);
        zzbj(32, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void K2(e.c.b.b.b.b bVar, r93 r93Var, m93 m93Var, String str, String str2, zf zfVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        bs2.d(parcelZza, r93Var);
        bs2.d(parcelZza, m93Var);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        bs2.f(parcelZza, zfVar);
        zzbj(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final eg N() {
        eg egVar;
        Parcel parcelZzbi = zzbi(15, zza());
        IBinder strongBinder = parcelZzbi.readStrongBinder();
        if (strongBinder == null) {
            egVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            egVar = iInterfaceQueryLocalInterface instanceof eg ? (eg) iInterfaceQueryLocalInterface : new eg(strongBinder);
        }
        parcelZzbi.recycle();
        return egVar;
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void N0(e.c.b.b.b.b bVar, m93 m93Var, String str, zf zfVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        bs2.d(parcelZza, m93Var);
        parcelZza.writeString(str);
        bs2.f(parcelZza, zfVar);
        zzbj(28, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void Q1(e.c.b.b.b.b bVar, sm smVar, List<String> list) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        bs2.f(parcelZza, smVar);
        parcelZza.writeStringList(list);
        zzbj(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void R1(e.c.b.b.b.b bVar, m93 m93Var, String str, sm smVar, String str2) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        bs2.d(parcelZza, m93Var);
        parcelZza.writeString(null);
        bs2.f(parcelZza, smVar);
        parcelZza.writeString(str2);
        zzbj(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void T0(e.c.b.b.b.b bVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        zzbj(37, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void U1(e.c.b.b.b.b bVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        zzbj(30, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void W0(e.c.b.b.b.b bVar, bc bcVar, List<hc> list) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        bs2.f(parcelZza, bcVar);
        parcelZza.writeTypedList(list);
        zzbj(31, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final gi X() {
        Parcel parcelZzbi = zzbi(34, zza());
        gi giVar = (gi) bs2.c(parcelZzbi, gi.CREATOR);
        parcelZzbi.recycle();
        return giVar;
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void X0(e.c.b.b.b.b bVar, m93 m93Var, String str, String str2, zf zfVar, g6 g6Var, List<String> list) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        bs2.d(parcelZza, m93Var);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        bs2.f(parcelZza, zfVar);
        bs2.d(parcelZza, g6Var);
        parcelZza.writeStringList(list);
        zzbj(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final gi n() {
        Parcel parcelZzbi = zzbi(33, zza());
        gi giVar = (gi) bs2.c(parcelZzbi, gi.CREATOR);
        parcelZzbi.recycle();
        return giVar;
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final fg p() {
        fg fgVar;
        Parcel parcelZzbi = zzbi(16, zza());
        IBinder strongBinder = parcelZzbi.readStrongBinder();
        if (strongBinder == null) {
            fgVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            fgVar = iInterfaceQueryLocalInterface instanceof fg ? (fg) iInterfaceQueryLocalInterface : new fg(strongBinder);
        }
        parcelZzbi.recycle();
        return fgVar;
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void r0(e.c.b.b.b.b bVar, m93 m93Var, String str, String str2, zf zfVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        bs2.d(parcelZza, m93Var);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        bs2.f(parcelZza, zfVar);
        zzbj(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final cg t() {
        cg agVar;
        Parcel parcelZzbi = zzbi(36, zza());
        IBinder strongBinder = parcelZzbi.readStrongBinder();
        if (strongBinder == null) {
            agVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            agVar = iInterfaceQueryLocalInterface instanceof cg ? (cg) iInterfaceQueryLocalInterface : new ag(strongBinder);
        }
        parcelZzbi.recycle();
        return agVar;
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void v1(e.c.b.b.b.b bVar, r93 r93Var, m93 m93Var, String str, String str2, zf zfVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        bs2.d(parcelZza, r93Var);
        bs2.d(parcelZza, m93Var);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        bs2.f(parcelZza, zfVar);
        zzbj(35, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void zzA(boolean z) {
        Parcel parcelZza = zza();
        bs2.b(parcelZza, z);
        zzbj(25, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final n1 zzB() {
        Parcel parcelZzbi = zzbi(26, zza());
        n1 n1VarI4 = m1.I4(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return n1VarI4;
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final e.c.b.b.b.b zzf() {
        Parcel parcelZzbi = zzbi(2, zza());
        e.c.b.b.b.b bVarU = b.a.U(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return bVarU;
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void zzh() {
        zzbj(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void zzi() {
        zzbj(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void zzl() {
        zzbj(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void zzm() {
        zzbj(9, zza());
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final void zzp() {
        zzbj(12, zza());
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final boolean zzq() {
        Parcel parcelZzbi = zzbi(13, zza());
        boolean zA = bs2.a(parcelZzbi);
        parcelZzbi.recycle();
        return zA;
    }

    @Override // com.google.android.gms.internal.ads.wf
    public final boolean zzx() {
        Parcel parcelZzbi = zzbi(22, zza());
        boolean zA = bs2.a(parcelZzbi);
        parcelZzbi.recycle();
        return zA;
    }
}