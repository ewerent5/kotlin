package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import e.c.b.b.b.b;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class gg extends zr2 implements ig {
    gg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final void B(e.c.b.b.b.b bVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        zzbj(20, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final void G0(e.c.b.b.b.b bVar, e.c.b.b.b.b bVar2, e.c.b.b.b.b bVar3) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        bs2.f(parcelZza, bVar2);
        bs2.f(parcelZza, bVar3);
        zzbj(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final l6 a() {
        Parcel parcelZzbi = zzbi(12, zza());
        l6 l6VarI4 = k6.I4(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return l6VarI4;
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final float f() {
        Parcel parcelZzbi = zzbi(23, zza());
        float f2 = parcelZzbi.readFloat();
        parcelZzbi.recycle();
        return f2;
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final void m1(e.c.b.b.b.b bVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        zzbj(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final float zzA() {
        Parcel parcelZzbi = zzbi(24, zza());
        float f2 = parcelZzbi.readFloat();
        parcelZzbi.recycle();
        return f2;
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final float zzB() {
        Parcel parcelZzbi = zzbi(25, zza());
        float f2 = parcelZzbi.readFloat();
        parcelZzbi.recycle();
        return f2;
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final String zze() {
        Parcel parcelZzbi = zzbi(2, zza());
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final List zzf() {
        Parcel parcelZzbi = zzbi(3, zza());
        ArrayList arrayListG = bs2.g(parcelZzbi);
        parcelZzbi.recycle();
        return arrayListG;
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final String zzg() {
        Parcel parcelZzbi = zzbi(4, zza());
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final t6 zzh() {
        Parcel parcelZzbi = zzbi(5, zza());
        t6 t6VarI4 = s6.I4(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return t6VarI4;
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final String zzi() {
        Parcel parcelZzbi = zzbi(6, zza());
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final String zzj() {
        Parcel parcelZzbi = zzbi(7, zza());
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final double zzk() {
        Parcel parcelZzbi = zzbi(8, zza());
        double d2 = parcelZzbi.readDouble();
        parcelZzbi.recycle();
        return d2;
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final String zzl() {
        Parcel parcelZzbi = zzbi(9, zza());
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final String zzm() {
        Parcel parcelZzbi = zzbi(10, zza());
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final n1 zzn() {
        Parcel parcelZzbi = zzbi(11, zza());
        n1 n1VarI4 = m1.I4(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return n1VarI4;
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final e.c.b.b.b.b zzp() {
        Parcel parcelZzbi = zzbi(13, zza());
        e.c.b.b.b.b bVarU = b.a.U(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return bVarU;
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final e.c.b.b.b.b zzq() {
        Parcel parcelZzbi = zzbi(14, zza());
        e.c.b.b.b.b bVarU = b.a.U(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return bVarU;
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final e.c.b.b.b.b zzr() {
        Parcel parcelZzbi = zzbi(15, zza());
        e.c.b.b.b.b bVarU = b.a.U(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return bVarU;
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final Bundle zzs() {
        Parcel parcelZzbi = zzbi(16, zza());
        Bundle bundle = (Bundle) bs2.c(parcelZzbi, Bundle.CREATOR);
        parcelZzbi.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final boolean zzt() {
        Parcel parcelZzbi = zzbi(17, zza());
        boolean zA = bs2.a(parcelZzbi);
        parcelZzbi.recycle();
        return zA;
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final boolean zzu() {
        Parcel parcelZzbi = zzbi(18, zza());
        boolean zA = bs2.a(parcelZzbi);
        parcelZzbi.recycle();
        return zA;
    }

    @Override // com.google.android.gms.internal.ads.ig
    public final void zzv() {
        zzbj(19, zza());
    }
}