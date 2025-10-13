package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import e.c.b.b.b.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class o6 extends zr2 implements q6 {
    o6(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.q6
    public final float zze() {
        Parcel parcelZzbi = zzbi(2, zza());
        float f2 = parcelZzbi.readFloat();
        parcelZzbi.recycle();
        return f2;
    }

    @Override // com.google.android.gms.internal.ads.q6
    public final void zzf(e.c.b.b.b.b bVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        zzbj(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.q6
    public final e.c.b.b.b.b zzg() {
        Parcel parcelZzbi = zzbi(4, zza());
        e.c.b.b.b.b bVarU = b.a.U(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return bVarU;
    }

    @Override // com.google.android.gms.internal.ads.q6
    public final float zzh() {
        Parcel parcelZzbi = zzbi(5, zza());
        float f2 = parcelZzbi.readFloat();
        parcelZzbi.recycle();
        return f2;
    }

    @Override // com.google.android.gms.internal.ads.q6
    public final float zzi() {
        Parcel parcelZzbi = zzbi(6, zza());
        float f2 = parcelZzbi.readFloat();
        parcelZzbi.recycle();
        return f2;
    }

    @Override // com.google.android.gms.internal.ads.q6
    public final n1 zzj() {
        Parcel parcelZzbi = zzbi(7, zza());
        n1 n1VarI4 = m1.I4(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return n1VarI4;
    }

    @Override // com.google.android.gms.internal.ads.q6
    public final boolean zzk() {
        Parcel parcelZzbi = zzbi(8, zza());
        boolean zA = bs2.a(parcelZzbi);
        parcelZzbi.recycle();
        return zA;
    }
}