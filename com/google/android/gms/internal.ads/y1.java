package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.InitializationStatus;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class y1 implements InitializationStatus {
    private final c2 a;

    y1(c2 c2Var) {
        this.a = c2Var;
    }

    @Override // com.google.android.gms.ads.initialization.InitializationStatus
    public final Map getAdapterStatusMap() {
        c2 c2Var = this.a;
        HashMap map = new HashMap();
        map.put("com.google.android.gms.ads.MobileAds", new z1(c2Var));
        return map;
    }
}