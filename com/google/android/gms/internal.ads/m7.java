package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class m7 extends zr2 implements o7 {
    m7(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.o7
    public final void h0(e7 e7Var) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, e7Var);
        zzbj(1, parcelZza);
    }
}