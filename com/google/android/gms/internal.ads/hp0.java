package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class hp0 implements v13 {

    /* renamed from: e */
    private final ew f6368e;

    hp0(ew ewVar) {
        this.f6368e = ewVar;
    }

    @Override // com.google.android.gms.internal.ads.v13
    public final void c0(u13 u13Var) {
        ew ewVar = this.f6368e;
        HashMap map = new HashMap();
        map.put("isVisible", true != u13Var.f9355j ? "0" : "1");
        ewVar.e0("onAdVisibilityChanged", map);
    }
}