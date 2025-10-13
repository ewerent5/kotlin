package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class v7 extends zr2 implements x7 {
    v7(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.x7
    public final void h4(k7 k7Var) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, k7Var);
        zzbj(1, parcelZza);
    }
}