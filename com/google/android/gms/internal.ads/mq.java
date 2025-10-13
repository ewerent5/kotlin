package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.zzs;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class mq extends zzb {
    final /* synthetic */ oq a;

    mq(oq oqVar) {
        this.a = oqVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        z3 z3Var = new z3(this.a.f7991e, this.a.f7992f.f7054e);
        synchronized (this.a.a) {
            try {
                zzs.zzl();
                c4.a(this.a.f7993g, z3Var);
            } catch (IllegalArgumentException e2) {
                er.zzj("Cannot config CSI reporter.", e2);
            }
        }
    }
}