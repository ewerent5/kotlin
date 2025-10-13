package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class kt {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7063b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7064c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7065d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7066e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7067f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7068g;

    /* renamed from: h, reason: collision with root package name */
    public final int f7069h;

    /* renamed from: i, reason: collision with root package name */
    public final int f7070i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f7071j;

    /* renamed from: k, reason: collision with root package name */
    public final int f7072k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f7073l;

    public kt(String str) throws JSONException {
        String string;
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.a = a(jSONObject, "aggressive_media_codec_release", w3.D);
        this.f7063b = b(jSONObject, "byte_buffer_precache_limit", w3.f9870j);
        this.f7064c = b(jSONObject, "exo_cache_buffer_size", w3.s);
        this.f7065d = b(jSONObject, "exo_connect_timeout_millis", w3.f9866f);
        o3<String> o3Var = w3.f9865e;
        if (jSONObject != null) {
            try {
                string = jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
            }
        } else {
            string = (String) c.c().b(o3Var);
        }
        this.f7066e = string;
        this.f7067f = b(jSONObject, "exo_read_timeout_millis", w3.f9867g);
        this.f7068g = b(jSONObject, "load_check_interval_bytes", w3.f9868h);
        this.f7069h = b(jSONObject, "player_precache_limit", w3.f9869i);
        this.f7070i = b(jSONObject, "socket_receive_buffer_size", w3.f9871k);
        this.f7071j = a(jSONObject, "use_cache_data_source", w3.w2);
        this.f7072k = b(jSONObject, "min_retry_count", w3.f9873m);
        this.f7073l = a(jSONObject, "treat_load_exception_as_non_fatal", w3.p);
    }

    private static final boolean a(JSONObject jSONObject, String str, o3<Boolean> o3Var) {
        boolean zBooleanValue = ((Boolean) c.c().b(o3Var)).booleanValue();
        if (jSONObject == null) {
            return zBooleanValue;
        }
        try {
            return jSONObject.getBoolean(str);
        } catch (JSONException unused) {
            return zBooleanValue;
        }
    }

    private static final int b(JSONObject jSONObject, String str, o3<Integer> o3Var) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) c.c().b(o3Var)).intValue();
    }
}