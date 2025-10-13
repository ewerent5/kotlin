package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class m0 extends zr2 implements o0 {
    m0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final void D0(ec ecVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, ecVar);
        zzbj(12, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final void F1(x2 x2Var) {
        Parcel parcelZza = zza();
        bs2.d(parcelZza, x2Var);
        zzbj(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final void J(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzbj(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final void L2(tf tfVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, tfVar);
        zzbj(11, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final void P(boolean z) {
        Parcel parcelZza = zza();
        bs2.b(parcelZza, z);
        zzbj(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final void U0(e.c.b.b.b.b bVar, String str) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        parcelZza.writeString(str);
        zzbj(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final void V0(float f2) {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f2);
        zzbj(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final void Z0(String str, e.c.b.b.b.b bVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(null);
        bs2.f(parcelZza, bVar);
        zzbj(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final void k4(a1 a1Var) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, a1Var);
        zzbj(16, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final void zze() {
        zzbj(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final float zzk() {
        Parcel parcelZzbi = zzbi(7, zza());
        float f2 = parcelZzbi.readFloat();
        parcelZzbi.recycle();
        return f2;
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final boolean zzl() {
        Parcel parcelZzbi = zzbi(8, zza());
        boolean zA = bs2.a(parcelZzbi);
        parcelZzbi.recycle();
        return zA;
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final String zzm() {
        Parcel parcelZzbi = zzbi(9, zza());
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final List<xb> zzq() {
        Parcel parcelZzbi = zzbi(13, zza());
        ArrayList arrayListCreateTypedArrayList = parcelZzbi.createTypedArrayList(xb.CREATOR);
        parcelZzbi.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.internal.ads.o0
    public final void zzs() {
        zzbj(15, zza());
    }
}