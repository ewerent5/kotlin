package com.google.android.play.core.assetpacks;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class o0 {
    private final Map<String, Double> a = new HashMap();

    o0() {
    }

    final synchronized void a(String str) {
        this.a.put(str, Double.valueOf(0.0d));
    }

    final synchronized double b(String str) {
        Double d2 = this.a.get(str);
        if (d2 == null) {
            return 0.0d;
        }
        return d2.doubleValue();
    }

    final synchronized double c(String str, c1 c1Var) {
        double d2;
        d2 = (((i0) c1Var).f12037g + 1.0d) / ((i0) c1Var).f12038h;
        this.a.put(str, Double.valueOf(d2));
        return d2;
    }
}