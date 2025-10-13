package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class m9 implements ba {
    static final ba a = new m9();

    private m9() {
    }

    @Override // com.google.android.gms.internal.ads.ba
    public final void a(Object obj, Map map) {
        ew ewVar = (ew) obj;
        ba<ew> baVar = aa.a;
        String str = (String) map.get("u");
        if (str == null) {
            er.zzi("URL missing from click GMSG.");
        } else {
            y42.o(aa.a(ewVar, str), new r9(ewVar), qr.a);
        }
    }
}