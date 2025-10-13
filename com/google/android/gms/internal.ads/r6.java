package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import e.c.b.b.b.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class r6 extends zr2 implements t6 {
    r6(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.t6
    public final e.c.b.b.b.b zzb() {
        Parcel parcelZzbi = zzbi(1, zza());
        e.c.b.b.b.b bVarU = b.a.U(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return bVarU;
    }

    @Override // com.google.android.gms.internal.ads.t6
    public final Uri zzc() {
        Parcel parcelZzbi = zzbi(2, zza());
        Uri uri = (Uri) bs2.c(parcelZzbi, Uri.CREATOR);
        parcelZzbi.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.t6
    public final double zzd() {
        Parcel parcelZzbi = zzbi(3, zza());
        double d2 = parcelZzbi.readDouble();
        parcelZzbi.recycle();
        return d2;
    }

    @Override // com.google.android.gms.internal.ads.t6
    public final int zze() {
        Parcel parcelZzbi = zzbi(4, zza());
        int i2 = parcelZzbi.readInt();
        parcelZzbi.recycle();
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.t6
    public final int zzf() {
        Parcel parcelZzbi = zzbi(5, zza());
        int i2 = parcelZzbi.readInt();
        parcelZzbi.recycle();
        return i2;
    }
}