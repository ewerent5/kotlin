package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class c8 extends zr2 implements e8 {
    c8(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.e8
    public final void p4(o8 o8Var) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, o8Var);
        zzbj(1, parcelZza);
    }
}