package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ConfigContainer.java */
/* loaded from: classes.dex */
public class f {
    private static final Date a = new Date(0);

    /* renamed from: b, reason: collision with root package name */
    private JSONObject f12928b;

    /* renamed from: c, reason: collision with root package name */
    private JSONObject f12929c;

    /* renamed from: d, reason: collision with root package name */
    private Date f12930d;

    /* renamed from: e, reason: collision with root package name */
    private JSONArray f12931e;

    /* renamed from: f, reason: collision with root package name */
    private JSONObject f12932f;

    /* compiled from: ConfigContainer.java */
    public static class b {
        private JSONObject a;

        /* renamed from: b, reason: collision with root package name */
        private Date f12933b;

        /* renamed from: c, reason: collision with root package name */
        private JSONArray f12934c;

        /* renamed from: d, reason: collision with root package name */
        private JSONObject f12935d;

        public f a() {
            return new f(this.a, this.f12933b, this.f12934c, this.f12935d);
        }

        public b b(Map<String, String> map) {
            this.a = new JSONObject(map);
            return this;
        }

        public b c(JSONObject jSONObject) {
            try {
                this.a = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b d(JSONArray jSONArray) {
            try {
                this.f12934c = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b e(Date date) {
            this.f12933b = date;
            return this;
        }

        public b f(JSONObject jSONObject) {
            try {
                this.f12935d = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        private b() {
            this.a = new JSONObject();
            this.f12933b = f.a;
            this.f12934c = new JSONArray();
            this.f12935d = new JSONObject();
        }
    }

    static f b(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        return new f(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObjectOptJSONObject);
    }

    public static b g() {
        return new b();
    }

    public JSONArray c() {
        return this.f12931e;
    }

    public JSONObject d() {
        return this.f12929c;
    }

    public Date e() {
        return this.f12930d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            return this.f12928b.toString().equals(((f) obj).toString());
        }
        return false;
    }

    public JSONObject f() {
        return this.f12932f;
    }

    public int hashCode() {
        return this.f12928b.hashCode();
    }

    public String toString() {
        return this.f12928b.toString();
    }

    private f(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        this.f12929c = jSONObject;
        this.f12930d = date;
        this.f12931e = jSONArray;
        this.f12932f = jSONObject2;
        this.f12928b = jSONObject3;
    }
}