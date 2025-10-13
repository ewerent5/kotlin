package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class z7 extends zr2 implements b8 {
    z7(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.b8
    public final void X1(w wVar, e.c.b.b.b.b bVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, wVar);
        bs2.f(parcelZza, bVar);
        zzbj(1, parcelZza);
    }
}