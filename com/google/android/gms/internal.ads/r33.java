package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class r33 extends zr2 implements t33 {
    r33(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.t33
    public final void c0(q33 q33Var) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, q33Var);
        zzbj(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.t33
    public final void g(int i2) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i2);
        zzbj(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.t33
    public final void x(g93 g93Var) {
        Parcel parcelZza = zza();
        bs2.d(parcelZza, g93Var);
        zzbj(3, parcelZza);
    }
}