package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class g20 implements t10 {
    private final gx0 a;

    g20(gx0 gx0Var) {
        this.a = gx0Var;
    }

    @Override // com.google.android.gms.internal.ads.t10
    public final void a(Map<String, String> map) {
        String str = map.get("test_mode_enabled");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.a.b(str.equals("true"));
    }
}