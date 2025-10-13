package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import e.c.b.b.b.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class xu1 extends zr2 implements zu1 {
    xu1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.omid.IOmid");
    }

    @Override // com.google.android.gms.internal.ads.zu1
    public final void E3(e.c.b.b.b.b bVar, e.c.b.b.b.b bVar2) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        bs2.f(parcelZza, bVar2);
        zzbj(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zu1
    public final void S1(e.c.b.b.b.b bVar, e.c.b.b.b.b bVar2) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        bs2.f(parcelZza, bVar2);
        zzbj(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zu1
    public final e.c.b.b.b.b d4(String str, e.c.b.b.b.b bVar, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        bs2.f(parcelZza, bVar);
        parcelZza.writeString("");
        parcelZza.writeString("javascript");
        parcelZza.writeString(str4);
        parcelZza.writeString("Google");
        parcelZza.writeString(str6);
        parcelZza.writeString(str7);
        parcelZza.writeString(str8);
        Parcel parcelZzbi = zzbi(11, parcelZza);
        e.c.b.b.b.b bVarU = b.a.U(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return bVarU;
    }

    @Override // com.google.android.gms.internal.ads.zu1
    public final e.c.b.b.b.b f0(String str, e.c.b.b.b.b bVar, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        bs2.f(parcelZza, bVar);
        parcelZza.writeString("");
        parcelZza.writeString("javascript");
        parcelZza.writeString(str4);
        parcelZza.writeString(str5);
        parcelZza.writeString(str6);
        parcelZza.writeString(str7);
        parcelZza.writeString(str8);
        Parcel parcelZzbi = zzbi(10, parcelZza);
        e.c.b.b.b.b bVarU = b.a.U(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return bVarU;
    }

    @Override // com.google.android.gms.internal.ads.zu1
    public final e.c.b.b.b.b h3(String str, e.c.b.b.b.b bVar, String str2, String str3, String str4, String str5) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        bs2.f(parcelZza, bVar);
        parcelZza.writeString("");
        parcelZza.writeString("javascript");
        parcelZza.writeString(str4);
        parcelZza.writeString(str5);
        Parcel parcelZzbi = zzbi(9, parcelZza);
        e.c.b.b.b.b bVarU = b.a.U(parcelZzbi.readStrongBinder());
        parcelZzbi.recycle();
        return bVarU;
    }

    @Override // com.google.android.gms.internal.ads.zu1
    public final boolean i(e.c.b.b.b.b bVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        Parcel parcelZzbi = zzbi(2, parcelZza);
        boolean zA = bs2.a(parcelZzbi);
        parcelZzbi.recycle();
        return zA;
    }

    @Override // com.google.android.gms.internal.ads.zu1
    public final void m(e.c.b.b.b.b bVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        zzbj(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zu1
    public final void zzf(e.c.b.b.b.b bVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        zzbj(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zu1
    public final String zzh() {
        Parcel parcelZzbi = zzbi(6, zza());
        String string = parcelZzbi.readString();
        parcelZzbi.recycle();
        return string;
    }
}