package com.google.firebase.crashlytics.d.p;

import com.google.firebase.crashlytics.d.h.r;
import org.json.JSONObject;

/* compiled from: SettingsJsonParser.java */
/* loaded from: classes.dex */
public class f {
    private final r a;

    f(r rVar) {
        this.a = rVar;
    }

    private static g a(int i2) {
        return i2 != 3 ? new b() : new h();
    }

    public com.google.firebase.crashlytics.d.p.i.f b(JSONObject jSONObject) {
        return a(jSONObject.getInt("settings_version")).a(this.a, jSONObject);
    }
}