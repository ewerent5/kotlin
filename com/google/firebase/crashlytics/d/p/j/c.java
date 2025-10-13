package com.google.firebase.crashlytics.d.p.j;

import com.google.firebase.crashlytics.d.h.h;
import com.google.firebase.crashlytics.d.h.m;
import com.google.firebase.crashlytics.d.p.i.g;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: DefaultSettingsSpiCall.java */
/* loaded from: classes.dex */
public class c extends com.google.firebase.crashlytics.d.h.a implements d {

    /* renamed from: f, reason: collision with root package name */
    private com.google.firebase.crashlytics.d.b f12765f;

    public c(String str, String str2, com.google.firebase.crashlytics.d.k.c cVar) {
        this(str, str2, cVar, com.google.firebase.crashlytics.d.k.a.GET, com.google.firebase.crashlytics.d.b.f());
    }

    private com.google.firebase.crashlytics.d.k.b g(com.google.firebase.crashlytics.d.k.b bVar, g gVar) {
        h(bVar, "X-CRASHLYTICS-GOOGLE-APP-ID", gVar.a);
        h(bVar, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        h(bVar, "X-CRASHLYTICS-API-CLIENT-VERSION", m.i());
        h(bVar, "Accept", "application/json");
        h(bVar, "X-CRASHLYTICS-DEVICE-MODEL", gVar.f12756b);
        h(bVar, "X-CRASHLYTICS-OS-BUILD-VERSION", gVar.f12757c);
        h(bVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", gVar.f12758d);
        h(bVar, "X-CRASHLYTICS-INSTALLATION-ID", gVar.f12759e.a());
        return bVar;
    }

    private void h(com.google.firebase.crashlytics.d.k.b bVar, String str, String str2) {
        if (str2 != null) {
            bVar.d(str, str2);
        }
    }

    private JSONObject i(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e2) {
            this.f12765f.c("Failed to parse settings JSON from " + e(), e2);
            this.f12765f.b("Settings response " + str);
            return null;
        }
    }

    private Map<String, String> j(g gVar) {
        HashMap map = new HashMap();
        map.put("build_version", gVar.f12762h);
        map.put("display_version", gVar.f12761g);
        map.put("source", Integer.toString(gVar.f12763i));
        String str = gVar.f12760f;
        if (!h.B(str)) {
            map.put("instance", str);
        }
        return map;
    }

    @Override // com.google.firebase.crashlytics.d.p.j.d
    public JSONObject a(g gVar, boolean z) {
        if (!z) {
            throw new RuntimeException("An invalid data collection token was used.");
        }
        try {
            Map<String, String> mapJ = j(gVar);
            com.google.firebase.crashlytics.d.k.b bVarG = g(d(mapJ), gVar);
            this.f12765f.b("Requesting settings from " + e());
            this.f12765f.b("Settings query params were: " + mapJ);
            com.google.firebase.crashlytics.d.k.d dVarB = bVarG.b();
            this.f12765f.b("Settings request ID: " + dVarB.d("X-REQUEST-ID"));
            return k(dVarB);
        } catch (IOException e2) {
            this.f12765f.e("Settings request failed.", e2);
            return null;
        }
    }

    JSONObject k(com.google.firebase.crashlytics.d.k.d dVar) {
        int iB = dVar.b();
        this.f12765f.b("Settings result was: " + iB);
        if (l(iB)) {
            return i(dVar.a());
        }
        this.f12765f.d("Failed to retrieve settings from " + e());
        return null;
    }

    boolean l(int i2) {
        return i2 == 200 || i2 == 201 || i2 == 202 || i2 == 203;
    }

    c(String str, String str2, com.google.firebase.crashlytics.d.k.c cVar, com.google.firebase.crashlytics.d.k.a aVar, com.google.firebase.crashlytics.d.b bVar) {
        super(str, str2, cVar, aVar);
        this.f12765f = bVar;
    }
}