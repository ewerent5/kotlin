package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class zzj extends a {
    public static final Parcelable.Creator<zzj> CREATOR = new zzk();
    public final boolean zza;
    public final boolean zzb;
    public final String zzc;
    public final boolean zzd;
    public final float zze;
    public final int zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;

    zzj(boolean z, boolean z2, String str, boolean z3, float f2, int i2, boolean z4, boolean z5, boolean z6) {
        this.zza = z;
        this.zzb = z2;
        this.zzc = str;
        this.zzd = z3;
        this.zze = f2;
        this.zzf = i2;
        this.zzg = z4;
        this.zzh = z5;
        this.zzi = z6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = c.a(parcel);
        c.c(parcel, 2, this.zza);
        c.c(parcel, 3, this.zzb);
        c.s(parcel, 4, this.zzc, false);
        c.c(parcel, 5, this.zzd);
        c.j(parcel, 6, this.zze);
        c.m(parcel, 7, this.zzf);
        c.c(parcel, 8, this.zzg);
        c.c(parcel, 9, this.zzh);
        c.c(parcel, 10, this.zzi);
        c.b(parcel, iA);
    }

    public zzj(boolean z, boolean z2, boolean z3, float f2, int i2, boolean z4, boolean z5, boolean z6) {
        this(z, z2, null, z3, f2, -1, z4, z5, z6);
    }
}