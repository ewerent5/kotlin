package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzs;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class os0 {
    private final Map<String, Map<String, JSONObject>> a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private JSONObject f8012b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f8013c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f8014d;

    /* renamed from: e, reason: collision with root package name */
    private JSONObject f8015e;

    public os0(Executor executor) {
        this.f8013c = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized void f() {
        Map<String, JSONObject> map;
        this.f8014d = true;
        kq kqVarZzn = zzs.zzg().l().zzn();
        if (kqVarZzn == null) {
            return;
        }
        JSONObject jSONObjectG = kqVarZzn.g();
        if (jSONObjectG == null) {
            return;
        }
        this.f8012b = ((Boolean) c.c().b(w3.k2)).booleanValue() ? jSONObjectG.optJSONObject("common_settings") : null;
        this.f8015e = jSONObjectG.optJSONObject("ad_unit_patterns");
        JSONArray jSONArrayOptJSONArray = jSONObjectG.optJSONArray("ad_unit_id_settings");
        if (jSONArrayOptJSONArray != null) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("ad_unit_id");
                    String strOptString2 = jSONObjectOptJSONObject.optString("format");
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("request_signals");
                    if (strOptString != null && jSONObjectOptJSONObject2 != null && strOptString2 != null) {
                        if (this.a.containsKey(strOptString2)) {
                            map = this.a.get(strOptString2);
                        } else {
                            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                            this.a.put(strOptString2, concurrentHashMap);
                            map = concurrentHashMap;
                        }
                        map.put(strOptString, jSONObjectOptJSONObject2);
                    }
                }
            }
        }
    }

    public final void a() {
        zzs.zzg().l().zzo(new Runnable(this) { // from class: com.google.android.gms.internal.ads.ls0

            /* renamed from: e, reason: collision with root package name */
            private final os0 f7300e;

            {
                this.f7300e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f7300e.e();
            }
        });
        this.f8013c.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.ms0

            /* renamed from: e, reason: collision with root package name */
            private final os0 f7536e;

            {
                this.f7536e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f7536e.d();
            }
        });
    }

    @CheckForNull
    public final JSONObject b(String str, String str2) {
        if (!((Boolean) c.c().b(w3.j2)).booleanValue() || str == null || str2 == null) {
            return null;
        }
        if (!this.f8014d) {
            f();
        }
        Map<String, JSONObject> map = this.a.get(str2);
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = map.get(str);
        if (jSONObject != null) {
            return jSONObject;
        }
        String strA = qs0.a(this.f8015e, str, str2);
        if (strA == null) {
            return null;
        }
        return map.get(strA);
    }

    @CheckForNull
    public final JSONObject c() {
        if (((Boolean) c.c().b(w3.k2)).booleanValue()) {
            return this.f8012b;
        }
        return null;
    }

    final /* synthetic */ void e() {
        this.f8013c.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.ns0

            /* renamed from: e, reason: collision with root package name */
            private final os0 f7795e;

            {
                this.f7795e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f7795e.f();
            }
        });
    }
}