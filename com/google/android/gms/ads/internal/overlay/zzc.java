package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;
import e.c.b.b.b.b;
import e.c.b.b.b.d;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class zzc extends a {
    public static final Parcelable.Creator<zzc> CREATOR = new zzb();
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final String zze;
    public final String zzf;
    public final String zzg;
    public final Intent zzh;
    public final zzu zzi;
    public final boolean zzj;

    public zzc(Intent intent, zzu zzuVar) {
        this(null, null, null, null, null, null, null, intent, d.m4(zzuVar).asBinder(), false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = c.a(parcel);
        c.s(parcel, 2, this.zza, false);
        c.s(parcel, 3, this.zzb, false);
        c.s(parcel, 4, this.zzc, false);
        c.s(parcel, 5, this.zzd, false);
        c.s(parcel, 6, this.zze, false);
        c.s(parcel, 7, this.zzf, false);
        c.s(parcel, 8, this.zzg, false);
        c.r(parcel, 9, this.zzh, i2, false);
        c.l(parcel, 10, d.m4(this.zzi).asBinder(), false);
        c.c(parcel, 11, this.zzj);
        c.b(parcel, iA);
    }

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent, IBinder iBinder, boolean z) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = intent;
        this.zzi = (zzu) d.Y(b.a.U(iBinder));
        this.zzj = z;
    }

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7, zzu zzuVar) {
        this(str, str2, str3, str4, str5, str6, str7, null, d.m4(zzuVar).asBinder(), false);
    }
}