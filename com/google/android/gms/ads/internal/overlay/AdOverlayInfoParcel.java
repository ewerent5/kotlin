package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.ads.internal.util.zzbh;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;
import com.google.android.gms.internal.ads.b9;
import com.google.android.gms.internal.ads.c93;
import com.google.android.gms.internal.ads.cu1;
import com.google.android.gms.internal.ads.d9;
import com.google.android.gms.internal.ads.ew;
import com.google.android.gms.internal.ads.kr;
import com.google.android.gms.internal.ads.nu0;
import com.google.android.gms.internal.ads.x21;
import e.c.b.b.b.b;
import e.c.b.b.b.d;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class AdOverlayInfoParcel extends a implements ReflectedParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new zzo();
    public final zzc zza;
    public final c93 zzb;
    public final zzp zzc;
    public final ew zzd;
    public final d9 zze;

    @RecentlyNonNull
    public final String zzf;
    public final boolean zzg;

    @RecentlyNonNull
    public final String zzh;
    public final zzw zzi;
    public final int zzj;
    public final int zzk;

    @RecentlyNonNull
    public final String zzl;
    public final kr zzm;

    @RecentlyNonNull
    public final String zzn;
    public final com.google.android.gms.ads.internal.zzj zzo;
    public final b9 zzp;

    @RecentlyNonNull
    public final String zzq;
    public final x21 zzr;
    public final nu0 zzs;
    public final cu1 zzt;
    public final zzbh zzu;

    @RecentlyNonNull
    public final String zzv;

    @RecentlyNonNull
    public final String zzw;

    public AdOverlayInfoParcel(c93 c93Var, zzp zzpVar, b9 b9Var, d9 d9Var, zzw zzwVar, ew ewVar, boolean z, int i2, String str, kr krVar) {
        this.zza = null;
        this.zzb = c93Var;
        this.zzc = zzpVar;
        this.zzd = ewVar;
        this.zzp = b9Var;
        this.zze = d9Var;
        this.zzf = null;
        this.zzg = z;
        this.zzh = null;
        this.zzi = zzwVar;
        this.zzj = i2;
        this.zzk = 3;
        this.zzl = str;
        this.zzm = krVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzv = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzw = null;
    }

    @RecentlyNonNull
    public static AdOverlayInfoParcel zza(@RecentlyNonNull Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i2) {
        int iA = c.a(parcel);
        c.r(parcel, 2, this.zza, i2, false);
        c.l(parcel, 3, d.m4(this.zzb).asBinder(), false);
        c.l(parcel, 4, d.m4(this.zzc).asBinder(), false);
        c.l(parcel, 5, d.m4(this.zzd).asBinder(), false);
        c.l(parcel, 6, d.m4(this.zze).asBinder(), false);
        c.s(parcel, 7, this.zzf, false);
        c.c(parcel, 8, this.zzg);
        c.s(parcel, 9, this.zzh, false);
        c.l(parcel, 10, d.m4(this.zzi).asBinder(), false);
        c.m(parcel, 11, this.zzj);
        c.m(parcel, 12, this.zzk);
        c.s(parcel, 13, this.zzl, false);
        c.r(parcel, 14, this.zzm, i2, false);
        c.s(parcel, 16, this.zzn, false);
        c.r(parcel, 17, this.zzo, i2, false);
        c.l(parcel, 18, d.m4(this.zzp).asBinder(), false);
        c.s(parcel, 19, this.zzq, false);
        c.l(parcel, 20, d.m4(this.zzr).asBinder(), false);
        c.l(parcel, 21, d.m4(this.zzs).asBinder(), false);
        c.l(parcel, 22, d.m4(this.zzt).asBinder(), false);
        c.l(parcel, 23, d.m4(this.zzu).asBinder(), false);
        c.s(parcel, 24, this.zzv, false);
        c.s(parcel, 25, this.zzw, false);
        c.b(parcel, iA);
    }

    public AdOverlayInfoParcel(c93 c93Var, zzp zzpVar, b9 b9Var, d9 d9Var, zzw zzwVar, ew ewVar, boolean z, int i2, String str, String str2, kr krVar) {
        this.zza = null;
        this.zzb = c93Var;
        this.zzc = zzpVar;
        this.zzd = ewVar;
        this.zzp = b9Var;
        this.zze = d9Var;
        this.zzf = str2;
        this.zzg = z;
        this.zzh = str;
        this.zzi = zzwVar;
        this.zzj = i2;
        this.zzk = 3;
        this.zzl = null;
        this.zzm = krVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzv = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzw = null;
    }

    public AdOverlayInfoParcel(c93 c93Var, zzp zzpVar, zzw zzwVar, ew ewVar, int i2, kr krVar, String str, com.google.android.gms.ads.internal.zzj zzjVar, String str2, String str3, String str4) {
        this.zza = null;
        this.zzb = null;
        this.zzc = zzpVar;
        this.zzd = ewVar;
        this.zzp = null;
        this.zze = null;
        this.zzf = str2;
        this.zzg = false;
        this.zzh = str3;
        this.zzi = null;
        this.zzj = i2;
        this.zzk = 1;
        this.zzl = null;
        this.zzm = krVar;
        this.zzn = str;
        this.zzo = zzjVar;
        this.zzq = null;
        this.zzv = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzw = str4;
    }

    public AdOverlayInfoParcel(c93 c93Var, zzp zzpVar, zzw zzwVar, ew ewVar, boolean z, int i2, kr krVar) {
        this.zza = null;
        this.zzb = c93Var;
        this.zzc = zzpVar;
        this.zzd = ewVar;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = z;
        this.zzh = null;
        this.zzi = zzwVar;
        this.zzj = i2;
        this.zzk = 2;
        this.zzl = null;
        this.zzm = krVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzv = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzw = null;
    }

    AdOverlayInfoParcel(zzc zzcVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i2, int i3, String str3, kr krVar, String str4, com.google.android.gms.ads.internal.zzj zzjVar, IBinder iBinder6, String str5, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, IBinder iBinder10, String str6, String str7) {
        this.zza = zzcVar;
        this.zzb = (c93) d.Y(b.a.U(iBinder));
        this.zzc = (zzp) d.Y(b.a.U(iBinder2));
        this.zzd = (ew) d.Y(b.a.U(iBinder3));
        this.zzp = (b9) d.Y(b.a.U(iBinder6));
        this.zze = (d9) d.Y(b.a.U(iBinder4));
        this.zzf = str;
        this.zzg = z;
        this.zzh = str2;
        this.zzi = (zzw) d.Y(b.a.U(iBinder5));
        this.zzj = i2;
        this.zzk = i3;
        this.zzl = str3;
        this.zzm = krVar;
        this.zzn = str4;
        this.zzo = zzjVar;
        this.zzq = str5;
        this.zzv = str6;
        this.zzr = (x21) d.Y(b.a.U(iBinder7));
        this.zzs = (nu0) d.Y(b.a.U(iBinder8));
        this.zzt = (cu1) d.Y(b.a.U(iBinder9));
        this.zzu = (zzbh) d.Y(b.a.U(iBinder10));
        this.zzw = str7;
    }

    public AdOverlayInfoParcel(zzc zzcVar, c93 c93Var, zzp zzpVar, zzw zzwVar, kr krVar, ew ewVar) {
        this.zza = zzcVar;
        this.zzb = c93Var;
        this.zzc = zzpVar;
        this.zzd = ewVar;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = zzwVar;
        this.zzj = -1;
        this.zzk = 4;
        this.zzl = null;
        this.zzm = krVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzv = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzw = null;
    }

    public AdOverlayInfoParcel(zzp zzpVar, ew ewVar, int i2, kr krVar) {
        this.zzc = zzpVar;
        this.zzd = ewVar;
        this.zzj = 1;
        this.zzm = krVar;
        this.zza = null;
        this.zzb = null;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzk = 1;
        this.zzl = null;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzv = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzw = null;
    }

    public AdOverlayInfoParcel(ew ewVar, kr krVar, zzbh zzbhVar, x21 x21Var, nu0 nu0Var, cu1 cu1Var, String str, String str2, int i2) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = ewVar;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = i2;
        this.zzk = 5;
        this.zzl = null;
        this.zzm = krVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = str;
        this.zzv = str2;
        this.zzr = x21Var;
        this.zzs = nu0Var;
        this.zzt = cu1Var;
        this.zzu = zzbhVar;
        this.zzw = null;
    }
}