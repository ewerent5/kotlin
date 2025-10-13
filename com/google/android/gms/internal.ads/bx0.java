package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class bx0 {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5213b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5214c;

    /* renamed from: d, reason: collision with root package name */
    private final String f5215d;

    /* renamed from: e, reason: collision with root package name */
    private final int f5216e;

    public bx0(String str, String str2, int i2, String str3, int i3) {
        this.a = str;
        this.f5213b = str2;
        this.f5214c = i2;
        this.f5215d = str3;
        this.f5216e = i3;
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adapterClassName", this.a);
        jSONObject.put("version", this.f5213b);
        jSONObject.put("status", this.f5214c);
        jSONObject.put("description", this.f5215d);
        jSONObject.put("initializationLatencyMillis", this.f5216e);
        return jSONObject;
    }
}