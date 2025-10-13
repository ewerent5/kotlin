package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class f9 implements ba {
    static final ba a = new f9();

    private f9() {
    }

    @Override // com.google.android.gms.internal.ads.ba
    public final void a(Object obj, Map map) {
        hx hxVar = (hx) obj;
        ba<ew> baVar = aa.a;
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            er.zzi("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] strArrSplit = str.split(",");
        HashMap map2 = new HashMap();
        PackageManager packageManager = hxVar.getContext().getPackageManager();
        for (String str2 : strArrSplit) {
            String[] strArrSplit2 = str2.split(";", 2);
            boolean z = true;
            if (packageManager.resolveActivity(new Intent(strArrSplit2.length > 1 ? strArrSplit2[1].trim() : "android.intent.action.VIEW", Uri.parse(strArrSplit2[0].trim())), 65536) == null) {
                z = false;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            map2.put(str2, boolValueOf);
            String strValueOf = String.valueOf(boolValueOf);
            StringBuilder sb = new StringBuilder(str2.length() + 14 + strValueOf.length());
            sb.append("/canOpenURLs;");
            sb.append(str2);
            sb.append(";");
            sb.append(strValueOf);
            zze.zza(sb.toString());
        }
        ((vc) hxVar).e0("openableURLs", map2);
    }
}