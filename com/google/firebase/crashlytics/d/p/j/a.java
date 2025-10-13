package com.google.firebase.crashlytics.d.p.j;

import com.google.firebase.crashlytics.d.h.d0;
import com.google.firebase.crashlytics.d.h.h;
import java.io.IOException;

/* compiled from: AbstractAppSpiCall.java */
/* loaded from: classes.dex */
abstract class a extends com.google.firebase.crashlytics.d.h.a {

    /* renamed from: f, reason: collision with root package name */
    private final String f12764f;

    public a(String str, String str2, com.google.firebase.crashlytics.d.k.c cVar, com.google.firebase.crashlytics.d.k.a aVar, String str3) {
        super(str, str2, cVar, aVar);
        this.f12764f = str3;
    }

    private com.google.firebase.crashlytics.d.k.b g(com.google.firebase.crashlytics.d.k.b bVar, com.google.firebase.crashlytics.d.p.i.a aVar) {
        return bVar.d("X-CRASHLYTICS-ORG-ID", aVar.a).d("X-CRASHLYTICS-GOOGLE-APP-ID", aVar.f12733b).d("X-CRASHLYTICS-API-CLIENT-TYPE", "android").d("X-CRASHLYTICS-API-CLIENT-VERSION", this.f12764f);
    }

    private com.google.firebase.crashlytics.d.k.b h(com.google.firebase.crashlytics.d.k.b bVar, com.google.firebase.crashlytics.d.p.i.a aVar) {
        com.google.firebase.crashlytics.d.k.b bVarG = bVar.g("org_id", aVar.a).g("app[identifier]", aVar.f12734c).g("app[name]", aVar.f12738g).g("app[display_version]", aVar.f12735d).g("app[build_version]", aVar.f12736e).g("app[source]", Integer.toString(aVar.f12739h)).g("app[minimum_sdk_version]", aVar.f12740i).g("app[built_sdk_version]", aVar.f12741j);
        if (!h.B(aVar.f12737f)) {
            bVarG.g("app[instance_identifier]", aVar.f12737f);
        }
        return bVarG;
    }

    public boolean i(com.google.firebase.crashlytics.d.p.i.a aVar, boolean z) {
        if (!z) {
            throw new RuntimeException("An invalid data collection token was used.");
        }
        com.google.firebase.crashlytics.d.k.b bVarH = h(g(c(), aVar), aVar);
        com.google.firebase.crashlytics.d.b.f().b("Sending app info to " + e());
        try {
            com.google.firebase.crashlytics.d.k.d dVarB = bVarH.b();
            int iB = dVarB.b();
            String str = "POST".equalsIgnoreCase(bVarH.f()) ? "Create" : "Update";
            com.google.firebase.crashlytics.d.b.f().b(str + " app request ID: " + dVarB.d("X-REQUEST-ID"));
            com.google.firebase.crashlytics.d.b.f().b("Result was " + iB);
            return d0.a(iB) == 0;
        } catch (IOException e2) {
            com.google.firebase.crashlytics.d.b.f().e("HTTP request failed.", e2);
            throw new RuntimeException(e2);
        }
    }
}