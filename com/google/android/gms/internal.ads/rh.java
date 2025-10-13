package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class rh extends zr2 implements th {
    rh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.th
    public final void B4(String str, String str2, m93 m93Var, e.c.b.b.b.b bVar, nh nhVar, zf zfVar, g6 g6Var) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        bs2.d(parcelZza, m93Var);
        bs2.f(parcelZza, bVar);
        bs2.f(parcelZza, nhVar);
        bs2.f(parcelZza, zfVar);
        bs2.d(parcelZza, g6Var);
        zzbj(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.th
    public final void C3(String str, String str2, m93 m93Var, e.c.b.b.b.b bVar, jh jhVar, zf zfVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        bs2.d(parcelZza, m93Var);
        bs2.f(parcelZza, bVar);
        bs2.f(parcelZza, jhVar);
        bs2.f(parcelZza, zfVar);
        zzbj(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.th
    public final boolean Q(e.c.b.b.b.b bVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        Parcel parcelZzbi = zzbi(15, parcelZza);
        boolean zA = bs2.a(parcelZzbi);
        parcelZzbi.recycle();
        return zA;
    }

    @Override // com.google.android.gms.internal.ads.th
    public final boolean Q3(e.c.b.b.b.b bVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        Parcel parcelZzbi = zzbi(17, parcelZza);
        boolean zA = bs2.a(parcelZzbi);
        parcelZzbi.recycle();
        return zA;
    }

    @Override // com.google.android.gms.internal.ads.th
    public final void S(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzbj(19, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.th
    public final void U2(String str, String str2, m93 m93Var, e.c.b.b.b.b bVar, gh ghVar, zf zfVar, r93 r93Var) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        bs2.d(parcelZza, m93Var);
        bs2.f(parcelZza, bVar);
        bs2.f(parcelZza, ghVar);
        bs2.f(parcelZza, zfVar);
        bs2.d(parcelZza, r93Var);
        zzbj(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.th
    public final void j1(e.c.b.b.b.b bVar, String str, Bundle bundle, Bundle bundle2, r93 r93Var, wh whVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        parcelZza.writeString(str);
        bs2.d(parcelZza, bundle);
        bs2.d(parcelZza, bundle2);
        bs2.d(parcelZza, r93Var);
        bs2.f(parcelZza, whVar);
        zzbj(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.th
    public final void n0(String str, String str2, m93 m93Var, e.c.b.b.b.b bVar, qh qhVar, zf zfVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        bs2.d(parcelZza, m93Var);
        bs2.f(parcelZza, bVar);
        bs2.f(parcelZza, qhVar);
        bs2.f(parcelZza, zfVar);
        zzbj(20, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.th
    public final void o2(String str, String str2, m93 m93Var, e.c.b.b.b.b bVar, qh qhVar, zf zfVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        bs2.d(parcelZza, m93Var);
        bs2.f(parcelZza, bVar);
        bs2.f(parcelZza, qhVar);
        bs2.f(parcelZza, zfVar);
        zzbj(16, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.th
    public final void p3(String str, String str2, m93 m93Var, e.c.b.b.b.b bVar, gh ghVar, zf zfVar, r93 r93Var) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        bs2.d(parcelZza, m93Var);
        bs2.f(parcelZza, bVar);
        bs2.f(parcelZza, ghVar);
        bs2.f(parcelZza, zfVar);
        bs2.d(parcelZza, r93Var);
        zzbj(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.th
    public final void s1(String str, String str2, m93 m93Var, e.c.b.b.b.b bVar, nh nhVar, zf zfVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        bs2.d(parcelZza, m93Var);
        bs2.f(parcelZza, bVar);
        bs2.f(parcelZza, nhVar);
        bs2.f(parcelZza, zfVar);
        zzbj(18, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.th
    public final gi zzf() {
        Parcel parcelZzbi = zzbi(2, zza());
        gi giVar = (gi) bs2.c(parcelZzbi, gi.CREATOR);
        parcelZzbi.recycle();
        return giVar;
    }

    @Override // com.google.android.gms.internal.ads.th
    public final gi zzg() {
        Parcel parcelZzbi = zzbi(3, zza());
        gi giVar = (gi) bs2.c(parcelZzbi, gi.CREATOR);
        parcelZzbi.recycle();
        return giVar;
    }

    @Override // com.google.android.gms.internal.ads.th
    public final n1 zzh() {
        Parcel parcelZzbi = zzbi(5, zza());
        n1 n1VarI4 = m1.I4(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return n1VarI4;
    }
}