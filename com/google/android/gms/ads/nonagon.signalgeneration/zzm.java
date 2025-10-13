package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.c;
import com.google.android.gms.internal.ads.er;
import com.google.android.gms.internal.ads.u42;
import com.google.android.gms.internal.ads.w3;
import com.google.android.gms.internal.ads.wp;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class zzm implements u42<zzab> {
    final /* synthetic */ wp zza;
    final /* synthetic */ zzp zzb;

    zzm(zzp zzpVar, wp wpVar) {
        this.zzb = zzpVar;
        this.zza = wpVar;
    }

    @Override // com.google.android.gms.internal.ads.u42
    public final void zza(Throwable th) {
        try {
            wp wpVar = this.zza;
            String strValueOf = String.valueOf(th.getMessage());
            wpVar.d(strValueOf.length() != 0 ? "Internal error. ".concat(strValueOf) : new String("Internal error. "));
        } catch (RemoteException e2) {
            er.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.u42
    public final /* bridge */ /* synthetic */ void zzb(zzab zzabVar) {
        zzab zzabVar2 = zzabVar;
        try {
            if (((Boolean) c.c().b(w3.W4)).booleanValue()) {
                if (this.zzb.zzi.f7056g >= ((Integer) c.c().b(w3.Y4)).intValue()) {
                    if (zzabVar2 == null) {
                        this.zza.E(null, null, null);
                        return;
                    } else {
                        this.zza.E(zzabVar2.zza, zzabVar2.zzb, zzabVar2.zzc);
                        return;
                    }
                }
            }
            if (zzabVar2 == null) {
                this.zza.o(null, null);
            } else {
                this.zza.o(zzabVar2.zza, zzabVar2.zzb);
            }
        } catch (RemoteException e2) {
            er.zzg("", e2);
        }
    }
}