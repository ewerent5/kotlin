package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.er;
import com.google.android.gms.internal.ads.kk;
import com.google.android.gms.internal.ads.u42;
import java.util.ArrayList;
import javax.annotation.Nonnull;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class zzn implements u42<ArrayList<Uri>> {
    final /* synthetic */ kk zza;

    zzn(zzp zzpVar, kk kkVar) {
        this.zza = kkVar;
    }

    @Override // com.google.android.gms.internal.ads.u42
    public final void zza(Throwable th) {
        try {
            kk kkVar = this.zza;
            String strValueOf = String.valueOf(th.getMessage());
            kkVar.b(strValueOf.length() != 0 ? "Internal error: ".concat(strValueOf) : new String("Internal error: "));
        } catch (RemoteException e2) {
            er.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.u42
    public final /* bridge */ /* synthetic */ void zzb(@Nonnull ArrayList<Uri> arrayList) {
        try {
            this.zza.U3(arrayList);
        } catch (RemoteException e2) {
            er.zzg("", e2);
        }
    }
}