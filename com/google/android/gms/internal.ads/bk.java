package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class bk {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5122b;

    public bk(boolean z, String str) {
        this.a = z;
        this.f5122b = str;
    }

    public static bk a(JSONObject jSONObject) {
        return new bk(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", ""));
    }
}