package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class o9 implements ba {
    static final ba a = new o9();

    private o9() {
    }

    @Override // com.google.android.gms.internal.ads.ba
    public final void a(Object obj, Map map) throws NumberFormatException {
        ox oxVar = (ox) obj;
        ba<ew> baVar = aa.a;
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int i2 = Integer.parseInt(str);
            int i3 = Integer.parseInt(str2);
            int i4 = Integer.parseInt(str3);
            ip2 ip2VarG = oxVar.g();
            if (ip2VarG != null) {
                ip2VarG.b().zzg(i2, i3, i4);
            }
        } catch (NumberFormatException unused) {
            er.zzi("Could not parse touch parameters from gmsg.");
        }
    }
}