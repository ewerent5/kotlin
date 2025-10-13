package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class fl extends zr2 implements hl {
    fl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.hl
    public final void J0(ql qlVar, ll llVar) {
        Parcel parcelZza = zza();
        bs2.d(parcelZza, qlVar);
        bs2.f(parcelZza, llVar);
        zzbj(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.hl
    public final void i3(String str, ll llVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        bs2.f(parcelZza, llVar);
        zzbj(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.hl
    public final void p0(ql qlVar, ll llVar) {
        Parcel parcelZza = zza();
        bs2.d(parcelZza, qlVar);
        bs2.f(parcelZza, llVar);
        zzbj(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.hl
    public final void s4(ql qlVar, ll llVar) {
        Parcel parcelZza = zza();
        bs2.d(parcelZza, qlVar);
        bs2.f(parcelZza, llVar);
        zzbj(4, parcelZza);
    }
}