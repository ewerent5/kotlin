package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzm;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class s9 implements ba<ew> {
    s9() {
    }

    @Override // com.google.android.gms.internal.ads.ba
    public final /* bridge */ /* synthetic */ void a(ew ewVar, Map map) {
        ew ewVar2 = ewVar;
        if (ewVar2.F() != null) {
            ewVar2.F().zza();
        }
        zzm zzmVarP = ewVar2.p();
        if (zzmVarP != null) {
            zzmVarP.zzb();
            return;
        }
        zzm zzmVarY = ewVar2.y();
        if (zzmVarY != null) {
            zzmVarY.zzb();
        } else {
            er.zzi("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}