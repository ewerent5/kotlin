package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzaq;
import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class r01 implements u42<ParcelFileDescriptor> {
    final /* synthetic */ ll a;

    r01(v01 v01Var, ll llVar) {
        this.a = llVar;
    }

    @Override // com.google.android.gms.internal.ads.u42
    public final void zza(Throwable th) {
        try {
            this.a.v4(zzaq.zza(th));
        } catch (RemoteException e2) {
            zze.zzb("Service can't call client", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.u42
    public final /* bridge */ /* synthetic */ void zzb(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            this.a.c3(parcelFileDescriptor);
        } catch (RemoteException e2) {
            zze.zzb("Service can't call client", e2);
        }
    }
}