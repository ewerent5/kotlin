package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class j81 implements l31<th, h51> {
    private final o91 a;

    public j81(o91 o91Var) {
        this.a = o91Var;
    }

    @Override // com.google.android.gms.internal.ads.l31
    public final m31<th, h51> a(String str, JSONObject jSONObject) {
        th thVarB = this.a.b(str);
        if (thVarB == null) {
            return null;
        }
        return new m31<>(thVarB, new h51(), str);
    }
}