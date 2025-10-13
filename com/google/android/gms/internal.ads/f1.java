package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class f1 extends zr2 implements h1 {
    f1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override // com.google.android.gms.internal.ads.h1
    public final void W2(t93 t93Var) {
        Parcel parcelZza = zza();
        bs2.d(parcelZza, t93Var);
        zzbj(1, parcelZza);
    }
}