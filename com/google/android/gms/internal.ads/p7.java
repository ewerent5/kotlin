package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class p7 extends zr2 implements r7 {
    p7(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.r7
    public final void C4(g7 g7Var) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, g7Var);
        zzbj(1, parcelZza);
    }
}