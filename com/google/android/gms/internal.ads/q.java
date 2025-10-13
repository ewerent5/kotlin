package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class q extends zr2 implements s {
    q(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.s
    public final void B3(e8 e8Var) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, e8Var);
        zzbj(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.s
    public final void G4(String str, x7 x7Var, u7 u7Var) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        bs2.f(parcelZza, x7Var);
        bs2.f(parcelZza, u7Var);
        zzbj(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.s
    public final void V3(g6 g6Var) {
        Parcel parcelZza = zza();
        bs2.d(parcelZza, g6Var);
        zzbj(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.s
    public final void b0(j jVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, jVar);
        zzbj(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.s
    public final void p1(b8 b8Var, r93 r93Var) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, b8Var);
        bs2.d(parcelZza, r93Var);
        zzbj(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.s
    public final void x1(AdManagerAdViewOptions adManagerAdViewOptions) {
        Parcel parcelZza = zza();
        bs2.d(parcelZza, adManagerAdViewOptions);
        zzbj(15, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.s
    public final p zze() {
        p nVar;
        Parcel parcelZzbi = zzbi(1, zza());
        IBinder strongBinder = parcelZzbi.readStrongBinder();
        if (strongBinder == null) {
            nVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            nVar = iInterfaceQueryLocalInterface instanceof p ? (p) iInterfaceQueryLocalInterface : new n(strongBinder);
        }
        parcelZzbi.recycle();
        return nVar;
    }
}