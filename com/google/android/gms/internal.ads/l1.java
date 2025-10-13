package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class l1 extends zr2 implements n1 {
    l1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // com.google.android.gms.internal.ads.n1
    public final void R2(q1 q1Var) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, q1Var);
        zzbj(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.n1
    public final q1 a() {
        q1 o1Var;
        Parcel parcelZzbi = zzbi(11, zza());
        IBinder strongBinder = parcelZzbi.readStrongBinder();
        if (strongBinder == null) {
            o1Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            o1Var = iInterfaceQueryLocalInterface instanceof q1 ? (q1) iInterfaceQueryLocalInterface : new o1(strongBinder);
        }
        parcelZzbi.recycle();
        return o1Var;
    }

    @Override // com.google.android.gms.internal.ads.n1
    public final void zze() {
        zzbj(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.n1
    public final void zzf() {
        zzbj(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.n1
    public final void zzg(boolean z) {
        Parcel parcelZza = zza();
        bs2.b(parcelZza, z);
        zzbj(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.n1
    public final boolean zzh() {
        Parcel parcelZzbi = zzbi(4, zza());
        boolean zA = bs2.a(parcelZzbi);
        parcelZzbi.recycle();
        return zA;
    }

    @Override // com.google.android.gms.internal.ads.n1
    public final int zzi() {
        Parcel parcelZzbi = zzbi(5, zza());
        int i2 = parcelZzbi.readInt();
        parcelZzbi.recycle();
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.n1
    public final float zzj() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.n1
    public final float zzk() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.n1
    public final float zzm() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.n1
    public final boolean zzn() {
        Parcel parcelZzbi = zzbi(10, zza());
        boolean zA = bs2.a(parcelZzbi);
        parcelZzbi.recycle();
        return zA;
    }

    @Override // com.google.android.gms.internal.ads.n1
    public final boolean zzp() {
        Parcel parcelZzbi = zzbi(12, zza());
        boolean zA = bs2.a(parcelZzbi);
        parcelZzbi.recycle();
        return zA;
    }

    @Override // com.google.android.gms.internal.ads.n1
    public final void zzq() {
        zzbj(13, zza());
    }
}