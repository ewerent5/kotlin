package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class qb extends zr2 implements IInterface {
    qb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void R(jb jbVar, pb pbVar) {
        Parcel parcelZza = zza();
        bs2.d(parcelZza, jbVar);
        bs2.f(parcelZza, pbVar);
        zzbk(2, parcelZza);
    }
}