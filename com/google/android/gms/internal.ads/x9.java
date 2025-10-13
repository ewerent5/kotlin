package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class x9 implements ba<ew> {
    x9() {
    }

    @Override // com.google.android.gms.internal.ads.ba
    public final /* bridge */ /* synthetic */ void a(ew ewVar, Map map) {
        ew ewVar2 = ewVar;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            ewVar2.zzbl();
        } else if ("resume".equals(str)) {
            ewVar2.zzbm();
        }
    }
}