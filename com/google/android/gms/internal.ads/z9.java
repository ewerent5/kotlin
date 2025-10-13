package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class z9 implements ba<ew> {
    z9() {
    }

    @Override // com.google.android.gms.internal.ads.ba
    public final /* bridge */ /* synthetic */ void a(ew ewVar, Map map) {
        ew ewVar2 = ewVar;
        if (map.keySet().contains("start")) {
            ewVar2.P(true);
        }
        if (map.keySet().contains("stop")) {
            ewVar2.P(false);
        }
    }
}