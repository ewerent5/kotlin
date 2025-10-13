package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class xf extends zr2 implements zf {
    xf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.zf
    public final void A4(xm xmVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, xmVar);
        zzbj(16, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zf
    public final void D4(int i2, String str) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i2);
        parcelZza.writeString(str);
        zzbj(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zf
    public final void H3(k7 k7Var, String str) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, k7Var);
        parcelZza.writeString(str);
        zzbj(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zf
    public final void S3(String str, String str2) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbj(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zf
    public final void W(int i2) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i2);
        zzbj(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zf
    public final void Y1(g93 g93Var) {
        Parcel parcelZza = zza();
        bs2.d(parcelZza, g93Var);
        zzbj(24, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zf
    public final void a() {
        zzbj(13, zza());
    }

    @Override // com.google.android.gms.internal.ads.zf
    public final void g1(int i2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zf
    public final void o1(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzbj(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zf
    public final void v0(g93 g93Var) {
        Parcel parcelZza = zza();
        bs2.d(parcelZza, g93Var);
        zzbj(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zf
    public final void w3(tm tmVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zf
    public final void zze() {
        zzbj(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zf
    public final void zzf() {
        zzbj(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zf
    public final void zzh() {
        zzbj(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zf
    public final void zzi() {
        zzbj(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zf
    public final void zzj() {
        zzbj(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zf
    public final void zzk() {
        zzbj(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zf
    public final void zzn() {
        zzbj(11, zza());
    }

    @Override // com.google.android.gms.internal.ads.zf
    public final void zzq() {
        zzbj(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.zf
    public final void zzt() {
        zzbj(18, zza());
    }

    @Override // com.google.android.gms.internal.ads.zf
    public final void zzu() {
        zzbj(20, zza());
    }
}