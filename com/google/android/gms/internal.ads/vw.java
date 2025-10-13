package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class vw implements ba<ew> {
    final /* synthetic */ xw a;

    vw(xw xwVar) {
        this.a = xwVar;
    }

    @Override // com.google.android.gms.internal.ads.ba
    public final /* bridge */ /* synthetic */ void a(ew ewVar, Map map) throws NumberFormatException {
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int i2 = Integer.parseInt(str);
                synchronized (this.a) {
                    if (this.a.K != i2) {
                        this.a.K = i2;
                        this.a.requestLayout();
                    }
                }
            } catch (Exception e2) {
                er.zzj("Exception occurred while getting webview content height", e2);
            }
        }
    }
}