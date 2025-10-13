package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class oi1 implements ah1<zg1<JSONObject>> {
    private final JSONObject a;

    oi1(Context context) {
        this.a = am.b(context);
    }

    final /* synthetic */ void a(JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.put("gms_sdk_env", this.a);
        } catch (JSONException unused) {
            zze.zza("Failed putting version constants.");
        }
    }

    @Override // com.google.android.gms.internal.ads.ah1
    public final g52<zg1<JSONObject>> zza() {
        return y42.a(new zg1(this) { // from class: com.google.android.gms.internal.ads.ni1
            private final oi1 a;

            {
                this.a = this;
            }

            @Override // com.google.android.gms.internal.ads.zg1
            public final void a(Object obj) throws JSONException {
                this.a.a((JSONObject) obj);
            }
        });
    }
}