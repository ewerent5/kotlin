package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class q71 implements l31<hq1, i51> {

    @GuardedBy("this")
    private final Map<String, m31<hq1, i51>> a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final js0 f8340b;

    public q71(js0 js0Var) {
        this.f8340b = js0Var;
    }

    @Override // com.google.android.gms.internal.ads.l31
    public final m31<hq1, i51> a(String str, JSONObject jSONObject) {
        m31<hq1, i51> m31Var;
        synchronized (this) {
            m31Var = this.a.get(str);
            if (m31Var == null) {
                m31Var = new m31<>(this.f8340b.b(str, jSONObject), new i51(), str);
                this.a.put(str, m31Var);
            }
        }
        return m31Var;
    }
}