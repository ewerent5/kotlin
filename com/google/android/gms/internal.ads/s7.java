package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class s7 extends zr2 implements u7 {
    s7(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.u7
    public final void y4(k7 k7Var, String str) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, k7Var);
        parcelZza.writeString(str);
        zzbj(1, parcelZza);
    }
}