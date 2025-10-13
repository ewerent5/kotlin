package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.zzs;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class am extends bm {
    private final Object a = new Object();

    /* renamed from: b */
    private final Context f4938b;

    /* renamed from: c */
    private SharedPreferences f4939c;

    /* renamed from: d */
    private final ke<JSONObject, JSONObject> f4940d;

    public am(Context context, ke<JSONObject, JSONObject> keVar) {
        this.f4938b = context.getApplicationContext();
        this.f4940d = keVar;
    }

    public static JSONObject b(Context context) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", kr.c().f7054e);
            jSONObject.put("mf", l5.a.e());
            jSONObject.put("cl", "367272508");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 12451000);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.c(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", 12451000);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.bm
    public final g52<Void> a() throws JSONException {
        synchronized (this.a) {
            if (this.f4939c == null) {
                this.f4939c = this.f4938b.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        if (zzs.zzj().a() - this.f4939c.getLong("js_last_update", 0L) < l5.f7196b.e().longValue()) {
            return y42.a(null);
        }
        return y42.i(this.f4940d.zzb(b(this.f4938b)), new x02(this) { // from class: com.google.android.gms.internal.ads.zl
            private final am a;

            {
                this.a = this;
            }

            @Override // com.google.android.gms.internal.ads.x02
            public final Object apply(Object obj) {
                this.a.c((JSONObject) obj);
                return null;
            }
        }, qr.f8451f);
    }

    final /* synthetic */ Void c(JSONObject jSONObject) {
        w3.b(this.f4938b, 1, jSONObject);
        this.f4939c.edit().putLong("js_last_update", zzs.zzj().a()).apply();
        return null;
    }
}