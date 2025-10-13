package com.parizene.netmonitor.k0;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AnalyticsEvent.java */
/* loaded from: classes.dex */
public class c {
    private String a;

    /* renamed from: b, reason: collision with root package name */
    private JSONObject f13202b = new JSONObject();

    public c(String str) {
        this.a = str;
    }

    public String a() {
        return this.a;
    }

    public JSONObject b() {
        return this.f13202b;
    }

    public c c(String str, Object obj) throws JSONException {
        try {
            this.f13202b.put(str, obj);
        } catch (JSONException unused) {
        }
        return this;
    }
}