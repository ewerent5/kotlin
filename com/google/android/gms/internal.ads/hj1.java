package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class hj1 implements zg1 {
    static final zg1 a = new hj1();

    private hj1() {
    }

    @Override // com.google.android.gms.internal.ads.zg1
    public final void a(Object obj) throws JSONException {
        try {
            ((JSONObject) obj).getJSONObject("sdk_env").put("container_version", 12451000);
        } catch (JSONException unused) {
        }
    }
}