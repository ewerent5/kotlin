package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e.c.b.b.b.b;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class fg extends zr2 implements IInterface {
    fg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    public final void I4(e.c.b.b.b.b bVar, e.c.b.b.b.b bVar2, e.c.b.b.b.b bVar3) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        bs2.f(parcelZza, bVar2);
        bs2.f(parcelZza, bVar3);
        zzbj(22, parcelZza);
    }

    public final void R(e.c.b.b.b.b bVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        zzbj(10, parcelZza);
    }

    public final Bundle U() {
        Parcel parcelZzbi = zzbi(13, zza());
        Bundle bundle = (Bundle) bs2.c(parcelZzbi, Bundle.CREATOR);
        parcelZzbi.recycle();
        return bundle;
    }

    public final n1 Y() {
        Parcel parcelZzbi = zzbi(16, zza());
        n1 n1VarI4 = m1.I4(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return n1VarI4;
    }

    public final boolean a() {
        Parcel parcelZzbi = zzbi(12, zza());
        boolean zA = bs2.a(parcelZzbi);
        parcelZzbi.recycle();
        return zA;
    }

    public final l6 m4() {
        Parcel parcelZzbi = zzbi(19, zza());
        l6 l6VarI4 = k6.I4(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return l6VarI4;
    }

    public final void t4(e.c.b.b.b.b bVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        zzbj(9, parcelZza);
    }

    public final void y1(e.c.b.b.b.b bVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        zzbj(14, parcelZza);
    }

    public final String zze() {
        Parcel parcelZzbi = zzbi(2, zza());
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }

    public final List zzf() {
        Parcel parcelZzbi = zzbi(3, zza());
        ArrayList arrayListG = bs2.g(parcelZzbi);
        parcelZzbi.recycle();
        return arrayListG;
    }

    public final String zzg() {
        Parcel parcelZzbi = zzbi(4, zza());
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }

    public final t6 zzh() {
        Parcel parcelZzbi = zzbi(5, zza());
        t6 t6VarI4 = s6.I4(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return t6VarI4;
    }

    public final String zzi() {
        Parcel parcelZzbi = zzbi(6, zza());
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }

    public final String zzj() {
        Parcel parcelZzbi = zzbi(7, zza());
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }

    public final void zzk() {
        zzbj(8, zza());
    }

    public final boolean zzn() {
        Parcel parcelZzbi = zzbi(11, zza());
        boolean zA = bs2.a(parcelZzbi);
        parcelZzbi.recycle();
        return zA;
    }

    public final e.c.b.b.b.b zzr() {
        Parcel parcelZzbi = zzbi(15, zza());
        e.c.b.b.b.b bVarU = b.a.U(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return bVarU;
    }

    public final e.c.b.b.b.b zzu() {
        Parcel parcelZzbi = zzbi(20, zza());
        e.c.b.b.b.b bVarU = b.a.U(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return bVarU;
    }

    public final e.c.b.b.b.b zzv() {
        Parcel parcelZzbi = zzbi(21, zza());
        e.c.b.b.b.b bVarU = b.a.U(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return bVarU;
    }
}