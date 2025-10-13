package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.util.zzbk;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class cp1 {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5346b;

    /* renamed from: c, reason: collision with root package name */
    public final JSONObject f5347c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONObject f5348d;

    cp1(JsonReader jsonReader) {
        JSONObject jSONObjectZzc = zzbk.zzc(jsonReader);
        this.f5348d = jSONObjectZzc;
        this.a = jSONObjectZzc.optString("ad_html", null);
        this.f5346b = jSONObjectZzc.optString("ad_base_url", null);
        this.f5347c = jSONObjectZzc.optJSONObject("ad_json");
    }
}