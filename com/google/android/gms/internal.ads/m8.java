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
public final class m8 extends zr2 implements o8 {
    m8(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final void A1(w0 w0Var) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, w0Var);
        zzbj(25, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final void G3(Bundle bundle) {
        Parcel parcelZza = zza();
        bs2.d(parcelZza, bundle);
        zzbj(15, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final boolean T2(Bundle bundle) {
        Parcel parcelZza = zza();
        bs2.d(parcelZza, bundle);
        Parcel parcelZzbi = zzbi(16, parcelZza);
        boolean zA = bs2.a(parcelZzbi);
        parcelZzbi.recycle();
        return zA;
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final String a() {
        Parcel parcelZzbi = zzbi(12, zza());
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final List f() {
        Parcel parcelZzbi = zzbi(23, zza());
        ArrayList arrayListG = bs2.g(parcelZzbi);
        parcelZzbi.recycle();
        return arrayListG;
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final void g3(h1 h1Var) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, h1Var);
        zzbj(32, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final void l2(Bundle bundle) {
        Parcel parcelZza = zza();
        bs2.d(parcelZza, bundle);
        zzbj(17, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final k1 n() {
        Parcel parcelZzbi = zzbi(31, zza());
        k1 k1VarI4 = j1.I4(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return k1VarI4;
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final boolean q() {
        Parcel parcelZzbi = zzbi(30, zza());
        boolean zA = bs2.a(parcelZzbi);
        parcelZzbi.recycle();
        return zA;
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final void q0(l8 l8Var) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, l8Var);
        zzbj(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final void u3(s0 s0Var) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, s0Var);
        zzbj(26, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final boolean zzA() {
        Parcel parcelZzbi = zzbi(24, zza());
        boolean zA = bs2.a(parcelZzbi);
        parcelZzbi.recycle();
        return zA;
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final void zzD() {
        zzbj(27, zza());
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final void zzE() {
        zzbj(28, zza());
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final q6 zzF() {
        q6 o6Var;
        Parcel parcelZzbi = zzbi(29, zza());
        IBinder strongBinder = parcelZzbi.readStrongBinder();
        if (strongBinder == null) {
            o6Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            o6Var = iInterfaceQueryLocalInterface instanceof q6 ? (q6) iInterfaceQueryLocalInterface : new o6(strongBinder);
        }
        parcelZzbi.recycle();
        return o6Var;
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final String zze() {
        Parcel parcelZzbi = zzbi(2, zza());
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final List zzf() {
        Parcel parcelZzbi = zzbi(3, zza());
        ArrayList arrayListG = bs2.g(parcelZzbi);
        parcelZzbi.recycle();
        return arrayListG;
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final String zzg() {
        Parcel parcelZzbi = zzbi(4, zza());
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final t6 zzh() {
        t6 r6Var;
        Parcel parcelZzbi = zzbi(5, zza());
        IBinder strongBinder = parcelZzbi.readStrongBinder();
        if (strongBinder == null) {
            r6Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            r6Var = iInterfaceQueryLocalInterface instanceof t6 ? (t6) iInterfaceQueryLocalInterface : new r6(strongBinder);
        }
        parcelZzbi.recycle();
        return r6Var;
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final String zzi() {
        Parcel parcelZzbi = zzbi(6, zza());
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final String zzj() {
        Parcel parcelZzbi = zzbi(7, zza());
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final double zzk() {
        Parcel parcelZzbi = zzbi(8, zza());
        double d2 = parcelZzbi.readDouble();
        parcelZzbi.recycle();
        return d2;
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final String zzl() {
        Parcel parcelZzbi = zzbi(9, zza());
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final String zzm() {
        Parcel parcelZzbi = zzbi(10, zza());
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final n1 zzn() {
        Parcel parcelZzbi = zzbi(11, zza());
        n1 n1VarI4 = m1.I4(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return n1VarI4;
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final void zzp() {
        zzbj(13, zza());
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final l6 zzq() {
        l6 j6Var;
        Parcel parcelZzbi = zzbi(14, zza());
        IBinder strongBinder = parcelZzbi.readStrongBinder();
        if (strongBinder == null) {
            j6Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            j6Var = iInterfaceQueryLocalInterface instanceof l6 ? (l6) iInterfaceQueryLocalInterface : new j6(strongBinder);
        }
        parcelZzbi.recycle();
        return j6Var;
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final e.c.b.b.b.b zzu() {
        Parcel parcelZzbi = zzbi(18, zza());
        e.c.b.b.b.b bVarU = b.a.U(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return bVarU;
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final e.c.b.b.b.b zzv() {
        Parcel parcelZzbi = zzbi(19, zza());
        e.c.b.b.b.b bVarU = b.a.U(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return bVarU;
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final Bundle zzw() {
        Parcel parcelZzbi = zzbi(20, zza());
        Bundle bundle = (Bundle) bs2.c(parcelZzbi, Bundle.CREATOR);
        parcelZzbi.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.o8
    public final void zzy() {
        zzbj(22, zza());
    }
}