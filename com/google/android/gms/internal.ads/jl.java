package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzaq;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class jl extends zr2 implements ll {
    jl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.ll
    public final void c3(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel parcelZza = zza();
        bs2.d(parcelZza, parcelFileDescriptor);
        zzbj(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.ll
    public final void v4(zzaq zzaqVar) {
        Parcel parcelZza = zza();
        bs2.d(parcelZza, zzaqVar);
        zzbj(2, parcelZza);
    }
}