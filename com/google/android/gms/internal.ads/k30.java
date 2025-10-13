package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class k30 implements mo2<JSONObject> {
    private final wo2<xo1> a;

    public k30(wo2<xo1> wo2Var) {
        this.a = wo2Var;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return new JSONObject(((j70) this.a).a().y);
        } catch (JSONException unused) {
            return null;
        }
    }
}