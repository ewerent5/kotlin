package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class a61 implements l31<hq1, h51> {
    private final js0 a;

    public a61(js0 js0Var) {
        this.a = js0Var;
    }

    @Override // com.google.android.gms.internal.ads.l31
    public final m31<hq1, h51> a(String str, JSONObject jSONObject) {
        return new m31<>(this.a.b(str, jSONObject), new h51(), str);
    }
}