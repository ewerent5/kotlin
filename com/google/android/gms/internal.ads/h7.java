package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e.c.b.b.b.b;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class h7 extends zr2 implements k7 {
    h7(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final boolean a() {
        Parcel parcelZzbi = zzbi(12, zza());
        boolean zA = bs2.a(parcelZzbi);
        parcelZzbi.recycle();
        return zA;
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final t6 b(String str) {
        t6 r6Var;
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzbi = zzbi(2, parcelZza);
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

    @Override // com.google.android.gms.internal.ads.k7
    public final void y1(e.c.b.b.b.b bVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        zzbj(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final String zze(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzbi = zzbi(1, parcelZza);
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final List<String> zzg() {
        Parcel parcelZzbi = zzbi(3, zza());
        ArrayList<String> arrayListCreateStringArrayList = parcelZzbi.createStringArrayList();
        parcelZzbi.recycle();
        return arrayListCreateStringArrayList;
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final String zzh() {
        Parcel parcelZzbi = zzbi(4, zza());
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void zzi(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzbj(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void zzj() {
        zzbj(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final n1 zzk() {
        Parcel parcelZzbi = zzbi(7, zza());
        n1 n1VarI4 = m1.I4(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return n1VarI4;
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void zzl() {
        zzbj(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final e.c.b.b.b.b zzm() {
        Parcel parcelZzbi = zzbi(9, zza());
        e.c.b.b.b.b bVarU = b.a.U(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return bVarU;
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final boolean zzn(e.c.b.b.b.b bVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        Parcel parcelZzbi = zzbi(10, parcelZza);
        boolean zA = bs2.a(parcelZzbi);
        parcelZzbi.recycle();
        return zA;
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final boolean zzp() {
        Parcel parcelZzbi = zzbi(13, zza());
        boolean zA = bs2.a(parcelZzbi);
        parcelZzbi.recycle();
        return zA;
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void zzr() {
        zzbj(15, zza());
    }
}