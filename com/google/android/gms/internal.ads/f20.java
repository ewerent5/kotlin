package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.zzs;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class f20 implements t10 {
    private final CookieManager a;

    public f20(Context context) {
        this.a = zzs.zze().zzk(context);
    }

    @Override // com.google.android.gms.internal.ads.t10
    public final void a(Map<String, String> map) {
        if (this.a == null) {
            return;
        }
        if (map.get("clear") == null) {
            String str = map.get("cookie");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.a.setCookie((String) c.c().b(w3.z0), str);
            return;
        }
        String str2 = (String) c.c().b(w3.z0);
        String cookie = this.a.getCookie(str2);
        if (cookie == null) {
            return;
        }
        List<String> listC = m12.a(t02.b(';')).c(cookie);
        for (int i2 = 0; i2 < listC.size(); i2++) {
            CookieManager cookieManager = this.a;
            Iterator<String> it = m12.a(t02.b('=')).b(listC.get(i2)).iterator();
            Objects.requireNonNull(it);
            if (!it.hasNext()) {
                StringBuilder sb = new StringBuilder(91);
                sb.append("position (0) must be less than the number of elements that remained (");
                sb.append(0);
                sb.append(")");
                throw new IndexOutOfBoundsException(sb.toString());
            }
            String strValueOf = String.valueOf(it.next());
            String strValueOf2 = String.valueOf((String) c.c().b(w3.q0));
            cookieManager.setCookie(str2, strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf));
        }
    }
}