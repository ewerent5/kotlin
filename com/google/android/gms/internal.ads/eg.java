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
public final class eg extends zr2 implements IInterface {
    eg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    public final void C0(e.c.b.b.b.b bVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        zzbj(12, parcelZza);
    }

    public final l6 I4() {
        Parcel parcelZzbi = zzbi(19, zza());
        l6 l6VarI4 = k6.I4(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return l6VarI4;
    }

    public final e.c.b.b.b.b J4() {
        Parcel parcelZzbi = zzbi(20, zza());
        e.c.b.b.b.b bVarU = b.a.U(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return bVarU;
    }

    public final e.c.b.b.b.b K4() {
        Parcel parcelZzbi = zzbi(21, zza());
        e.c.b.b.b.b bVarU = b.a.U(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return bVarU;
    }

    public final void L4(e.c.b.b.b.b bVar, e.c.b.b.b.b bVar2, e.c.b.b.b.b bVar3) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        bs2.f(parcelZza, bVar2);
        bs2.f(parcelZza, bVar3);
        zzbj(22, parcelZza);
    }

    public final double R() {
        Parcel parcelZzbi = zzbi(7, zza());
        double d2 = parcelZzbi.readDouble();
        parcelZzbi.recycle();
        return d2;
    }

    public final Bundle U() {
        Parcel parcelZzbi = zzbi(15, zza());
        Bundle bundle = (Bundle) bs2.c(parcelZzbi, Bundle.CREATOR);
        parcelZzbi.recycle();
        return bundle;
    }

    public final void Y(e.c.b.b.b.b bVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        zzbj(16, parcelZza);
    }

    public final n1 m4() {
        Parcel parcelZzbi = zzbi(17, zza());
        n1 n1VarI4 = m1.I4(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return n1VarI4;
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

    public final String zzk() {
        Parcel parcelZzbi = zzbi(8, zza());
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }

    public final String zzl() {
        Parcel parcelZzbi = zzbi(9, zza());
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }

    public final void zzm() {
        zzbj(10, zza());
    }

    public final void zzn(e.c.b.b.b.b bVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        zzbj(11, parcelZza);
    }

    public final boolean zzp() {
        Parcel parcelZzbi = zzbi(13, zza());
        boolean zA = bs2.a(parcelZzbi);
        parcelZzbi.recycle();
        return zA;
    }

    public final boolean zzq() {
        Parcel parcelZzbi = zzbi(14, zza());
        boolean zA = bs2.a(parcelZzbi);
        parcelZzbi.recycle();
        return zA;
    }

    public final e.c.b.b.b.b zzu() {
        Parcel parcelZzbi = zzbi(18, zza());
        e.c.b.b.b.b bVarU = b.a.U(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return bVarU;
    }
}