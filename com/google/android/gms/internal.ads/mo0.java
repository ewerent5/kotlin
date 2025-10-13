package com.google.android.gms.internal.ads;

import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class mo0 implements x02 {
    private final so0 a;

    /* renamed from: b */
    private final JSONObject f7518b;

    mo0(so0 so0Var, JSONObject jSONObject) {
        this.a = so0Var;
        this.f7518b = jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.x02
    public final Object apply(Object obj) {
        return this.a.f(this.f7518b, (List) obj);
    }
}