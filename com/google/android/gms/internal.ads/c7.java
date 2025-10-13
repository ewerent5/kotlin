package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class c7 extends zr2 implements IInterface {
    c7(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
    }

    public final IBinder R(e.c.b.b.b.b bVar, e.c.b.b.b.b bVar2, e.c.b.b.b.b bVar3) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        bs2.f(parcelZza, bVar2);
        bs2.f(parcelZza, bVar3);
        Parcel parcelZzbi = zzbi(1, parcelZza);
        IBinder strongBinder = parcelZzbi.readStrongBinder();
        parcelZzbi.recycle();
        return strongBinder;
    }
}