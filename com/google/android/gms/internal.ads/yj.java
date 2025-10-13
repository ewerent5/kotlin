package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class yj extends zr2 implements IInterface {
    yj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
    }

    public final IBinder R(e.c.b.b.b.b bVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        Parcel parcelZzbi = zzbi(1, parcelZza);
        IBinder strongBinder = parcelZzbi.readStrongBinder();
        parcelZzbi.recycle();
        return strongBinder;
    }
}