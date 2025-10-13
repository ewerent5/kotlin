package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class wp1 implements ba {
    private final vu1 a;

    /* renamed from: b */
    private final x21 f10015b;

    wp1(vu1 vu1Var, x21 x21Var) {
        this.a = vu1Var;
        this.f10015b = x21Var;
    }

    @Override // com.google.android.gms.internal.ads.ba
    public final void a(Object obj, Map map) {
        vu1 vu1Var = this.a;
        x21 x21Var = this.f10015b;
        ew ewVar = (ew) obj;
        String str = (String) map.get("u");
        if (str == null) {
            er.zzi("URL missing from click GMSG.");
        } else {
            y42.o(aa.a(ewVar, str), new yp1(ewVar, vu1Var, x21Var), qr.a);
        }
    }
}