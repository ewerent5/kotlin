package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzs;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class t91 {
    private final Map<String, w91> a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, Map<String, List<w91>>> f9096b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Executor f9097c;

    /* renamed from: d, reason: collision with root package name */
    private JSONObject f9098d;

    public t91(Executor executor) {
        this.f9097c = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized void f() {
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectG = zzs.zzg().l().zzn().g();
        if (jSONObjectG != null) {
            try {
                JSONArray jSONArrayOptJSONArray2 = jSONObjectG.optJSONArray("ad_unit_id_settings");
                this.f9098d = jSONObjectG.optJSONObject("ad_unit_patterns");
                if (jSONArrayOptJSONArray2 != null) {
                    for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                        JSONObject jSONObject = jSONArrayOptJSONArray2.getJSONObject(i2);
                        String strOptString = jSONObject.optString("ad_unit_id", "");
                        String strOptString2 = jSONObject.optString("format", "");
                        ArrayList arrayList = new ArrayList();
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("mediation_config");
                        if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("ad_networks")) != null) {
                            for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i3);
                                ArrayList arrayList2 = new ArrayList();
                                if (jSONObject2 != null) {
                                    JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("data");
                                    Bundle bundle = new Bundle();
                                    if (jSONObjectOptJSONObject2 != null) {
                                        Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
                                        while (itKeys.hasNext()) {
                                            String next = itKeys.next();
                                            bundle.putString(next, jSONObjectOptJSONObject2.optString(next, ""));
                                        }
                                    }
                                    JSONArray jSONArrayOptJSONArray3 = jSONObject2.optJSONArray("rtb_adapters");
                                    if (jSONArrayOptJSONArray3 != null) {
                                        ArrayList arrayList3 = new ArrayList();
                                        for (int i4 = 0; i4 < jSONArrayOptJSONArray3.length(); i4++) {
                                            String strOptString3 = jSONArrayOptJSONArray3.optString(i4, "");
                                            if (!TextUtils.isEmpty(strOptString3)) {
                                                arrayList3.add(strOptString3);
                                            }
                                        }
                                        int size = arrayList3.size();
                                        for (int i5 = 0; i5 < size; i5++) {
                                            String str = (String) arrayList3.get(i5);
                                            c(str);
                                            if (this.a.get(str) != null) {
                                                arrayList2.add(new w91(str, strOptString2, bundle));
                                            }
                                        }
                                    }
                                }
                                arrayList.addAll(arrayList2);
                            }
                        }
                        if (!TextUtils.isEmpty(strOptString2) && !TextUtils.isEmpty(strOptString)) {
                            Map<String, List<w91>> concurrentHashMap = this.f9096b.get(strOptString2);
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap<>();
                            }
                            this.f9096b.put(strOptString2, concurrentHashMap);
                            List<w91> arrayList4 = concurrentHashMap.get(strOptString);
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList<>();
                            }
                            arrayList4.addAll(arrayList);
                            concurrentHashMap.put(strOptString, arrayList4);
                        }
                    }
                }
            } catch (JSONException e2) {
                zze.zzb("Malformed config loading JSON.", e2);
            }
        }
    }

    public final void a() {
        zzs.zzg().l().zzo(new Runnable(this) { // from class: com.google.android.gms.internal.ads.q91

            /* renamed from: e, reason: collision with root package name */
            private final t91 f8351e;

            {
                this.f8351e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f8351e.e();
            }
        });
        this.f9097c.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.r91

            /* renamed from: e, reason: collision with root package name */
            private final t91 f8614e;

            {
                this.f8614e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f8614e.d();
            }
        });
    }

    public final Map<String, List<Bundle>> b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return Collections.emptyMap();
        }
        Map<String, List<w91>> map = this.f9096b.get(str);
        if (map == null) {
            return Collections.emptyMap();
        }
        List<w91> list = map.get(str2);
        if (list == null) {
            list = map.get(qs0.a(this.f9098d, str2, str));
        }
        if (list == null) {
            return Collections.emptyMap();
        }
        HashMap map2 = new HashMap();
        for (w91 w91Var : list) {
            String str3 = w91Var.a;
            if (!map2.containsKey(str3)) {
                map2.put(str3, new ArrayList());
            }
            ((List) map2.get(str3)).add(w91Var.f9932c);
        }
        return map2;
    }

    public final void c(String str) {
        if (TextUtils.isEmpty(str) || this.a.containsKey(str)) {
            return;
        }
        this.a.put(str, new w91(str, "", new Bundle()));
    }

    final /* synthetic */ void e() {
        this.f9097c.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.s91

            /* renamed from: e, reason: collision with root package name */
            private final t91 f8846e;

            {
                this.f8846e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f8846e.f();
            }
        });
    }
}