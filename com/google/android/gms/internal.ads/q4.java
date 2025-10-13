package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class q4 extends zr2 implements s4 {
    q4(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.s4
    public final void u4(p4 p4Var) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, p4Var);
        zzbj(1, parcelZza);
    }
}