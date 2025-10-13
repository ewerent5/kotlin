package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class j43 extends zr2 implements IInterface {
    j43(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final e43 R(h43 h43Var) {
        Parcel parcelZza = zza();
        bs2.d(parcelZza, h43Var);
        Parcel parcelZzbi = zzbi(1, parcelZza);
        e43 e43Var = (e43) bs2.c(parcelZzbi, e43.CREATOR);
        parcelZzbi.recycle();
        return e43Var;
    }

    public final e43 U(h43 h43Var) {
        Parcel parcelZza = zza();
        bs2.d(parcelZza, h43Var);
        Parcel parcelZzbi = zzbi(2, parcelZza);
        e43 e43Var = (e43) bs2.c(parcelZzbi, e43.CREATOR);
        parcelZzbi.recycle();
        return e43Var;
    }

    public final long Y(h43 h43Var) {
        Parcel parcelZza = zza();
        bs2.d(parcelZza, h43Var);
        Parcel parcelZzbi = zzbi(3, parcelZza);
        long j2 = parcelZzbi.readLong();
        parcelZzbi.recycle();
        return j2;
    }
}