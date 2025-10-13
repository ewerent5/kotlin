package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class r10 {
    private final Map<String, u10> a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, t10> f8556b;

    r10(Map<String, u10> map, Map<String, t10> map2) {
        this.a = map;
        this.f8556b = map2;
    }

    public final void a(kp1 kp1Var) {
        for (hp1 hp1Var : kp1Var.f7035b.f6563c) {
            if (this.a.containsKey(hp1Var.a)) {
                this.a.get(hp1Var.a).d(hp1Var.f6369b);
            } else if (this.f8556b.containsKey(hp1Var.a)) {
                t10 t10Var = this.f8556b.get(hp1Var.a);
                JSONObject jSONObject = hp1Var.f6369b;
                HashMap map = new HashMap();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String strOptString = jSONObject.optString(next);
                    if (strOptString != null) {
                        map.put(next, strOptString);
                    }
                }
                t10Var.a(map);
            }
        }
    }
}