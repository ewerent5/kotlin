package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class y9 implements ba<ew> {
    y9() {
    }

    @Override // com.google.android.gms.internal.ads.ba
    public final /* bridge */ /* synthetic */ void a(ew ewVar, Map map) {
        ew ewVar2 = ewVar;
        if (map.keySet().contains("start")) {
            ewVar2.E0().zzi();
        } else if (map.keySet().contains("stop")) {
            ewVar2.E0().zzj();
        } else if (map.keySet().contains("cancel")) {
            ewVar2.E0().zzk();
        }
    }
}