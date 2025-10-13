package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class wi1 implements zg1<JSONObject> {
    private final List<String> a;

    public wi1(List<String> list) {
        this.a = list;
    }

    @Override // com.google.android.gms.internal.ads.zg1
    public final /* bridge */ /* synthetic */ void a(JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.put("eid", TextUtils.join(",", this.a));
        } catch (JSONException unused) {
            zze.zza("Failed putting experiment ids.");
        }
    }
}