package com.google.firebase.crashlytics.d.n.d;

import com.google.firebase.crashlytics.d.h.d0;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: DefaultCreateReportSpiCall.java */
/* loaded from: classes.dex */
public class c extends com.google.firebase.crashlytics.d.h.a implements b {

    /* renamed from: f, reason: collision with root package name */
    private final String f12713f;

    public c(String str, String str2, com.google.firebase.crashlytics.d.k.c cVar, String str3) {
        this(str, str2, cVar, com.google.firebase.crashlytics.d.k.a.POST, str3);
    }

    private com.google.firebase.crashlytics.d.k.b g(com.google.firebase.crashlytics.d.k.b bVar, com.google.firebase.crashlytics.d.n.c.a aVar) {
        com.google.firebase.crashlytics.d.k.b bVarD = bVar.d("X-CRASHLYTICS-GOOGLE-APP-ID", aVar.f12705b).d("X-CRASHLYTICS-API-CLIENT-TYPE", "android").d("X-CRASHLYTICS-API-CLIENT-VERSION", this.f12713f);
        Iterator<Map.Entry<String, String>> it = aVar.f12706c.a().entrySet().iterator();
        while (it.hasNext()) {
            bVarD = bVarD.e(it.next());
        }
        return bVarD;
    }

    private com.google.firebase.crashlytics.d.k.b h(com.google.firebase.crashlytics.d.k.b bVar, com.google.firebase.crashlytics.d.n.c.c cVar) {
        com.google.firebase.crashlytics.d.k.b bVarG = bVar.g("report[identifier]", cVar.b());
        if (cVar.d().length == 1) {
            com.google.firebase.crashlytics.d.b.f().b("Adding single file " + cVar.e() + " to report " + cVar.b());
            return bVarG.h("report[file]", cVar.e(), "application/octet-stream", cVar.c());
        }
        int i2 = 0;
        for (File file : cVar.d()) {
            com.google.firebase.crashlytics.d.b.f().b("Adding file " + file.getName() + " to report " + cVar.b());
            StringBuilder sb = new StringBuilder();
            sb.append("report[file");
            sb.append(i2);
            sb.append("]");
            bVarG = bVarG.h(sb.toString(), file.getName(), "application/octet-stream", file);
            i2++;
        }
        return bVarG;
    }

    @Override // com.google.firebase.crashlytics.d.n.d.b
    public boolean b(com.google.firebase.crashlytics.d.n.c.a aVar, boolean z) {
        if (!z) {
            throw new RuntimeException("An invalid data collection token was used.");
        }
        com.google.firebase.crashlytics.d.k.b bVarH = h(g(c(), aVar), aVar.f12706c);
        com.google.firebase.crashlytics.d.b.f().b("Sending report to: " + e());
        try {
            com.google.firebase.crashlytics.d.k.d dVarB = bVarH.b();
            int iB = dVarB.b();
            com.google.firebase.crashlytics.d.b.f().b("Create report request ID: " + dVarB.d("X-REQUEST-ID"));
            com.google.firebase.crashlytics.d.b.f().b("Result was: " + iB);
            return d0.a(iB) == 0;
        } catch (IOException e2) {
            com.google.firebase.crashlytics.d.b.f().e("Create report HTTP request failed.", e2);
            throw new RuntimeException(e2);
        }
    }

    c(String str, String str2, com.google.firebase.crashlytics.d.k.c cVar, com.google.firebase.crashlytics.d.k.a aVar, String str3) {
        super(str, str2, cVar, aVar);
        this.f12713f = str3;
    }
}