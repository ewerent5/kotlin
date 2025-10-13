package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class g9 implements ba {
    static final ba a = new g9();

    private g9() {
    }

    @Override // com.google.android.gms.internal.ads.ba
    public final void a(Object obj, Map map) {
        hx hxVar = (hx) obj;
        ba<ew> baVar = aa.a;
        if (!((Boolean) c.c().b(w3.s5)).booleanValue()) {
            er.zzi("canOpenAppGmsgHandler disabled.");
            return;
        }
        String str = (String) map.get("package_name");
        if (TextUtils.isEmpty(str)) {
            er.zzi("Package name missing in canOpenApp GMSG.");
            return;
        }
        HashMap map2 = new HashMap();
        Boolean boolValueOf = Boolean.valueOf(hxVar.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
        map2.put(str, boolValueOf);
        String strValueOf = String.valueOf(boolValueOf);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13 + strValueOf.length());
        sb.append("/canOpenApp;");
        sb.append(str);
        sb.append(";");
        sb.append(strValueOf);
        zze.zza(sb.toString());
        ((vc) hxVar).e0("openableApp", map2);
    }
}