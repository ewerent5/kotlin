package com.google.firebase.crashlytics.d.n.d;

import com.google.firebase.crashlytics.d.h.d0;
import com.google.firebase.crashlytics.d.h.m;
import java.io.File;
import java.io.IOException;

/* compiled from: NativeCreateReportSpiCall.java */
/* loaded from: classes.dex */
public class d extends com.google.firebase.crashlytics.d.h.a implements b {

    /* renamed from: f, reason: collision with root package name */
    private final String f12714f;

    public d(String str, String str2, com.google.firebase.crashlytics.d.k.c cVar, String str3) {
        super(str, str2, cVar, com.google.firebase.crashlytics.d.k.a.POST);
        this.f12714f = str3;
    }

    private com.google.firebase.crashlytics.d.k.b g(com.google.firebase.crashlytics.d.k.b bVar, String str) {
        bVar.d("User-Agent", "Crashlytics Android SDK/" + m.i()).d("X-CRASHLYTICS-API-CLIENT-TYPE", "android").d("X-CRASHLYTICS-API-CLIENT-VERSION", this.f12714f).d("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        return bVar;
    }

    private com.google.firebase.crashlytics.d.k.b h(com.google.firebase.crashlytics.d.k.b bVar, String str, com.google.firebase.crashlytics.d.n.c.c cVar) {
        if (str != null) {
            bVar.g("org_id", str);
        }
        bVar.g("report_id", cVar.b());
        for (File file : cVar.d()) {
            if (file.getName().equals("minidump")) {
                bVar.h("minidump_file", file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("metadata")) {
                bVar.h("crash_meta_file", file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("binaryImages")) {
                bVar.h("binary_images_file", file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("session")) {
                bVar.h("session_meta_file", file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("app")) {
                bVar.h("app_meta_file", file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("device")) {
                bVar.h("device_meta_file", file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("os")) {
                bVar.h("os_meta_file", file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("user")) {
                bVar.h("user_meta_file", file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("logs")) {
                bVar.h("logs_file", file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("keys")) {
                bVar.h("keys_file", file.getName(), "application/octet-stream", file);
            }
        }
        return bVar;
    }

    @Override // com.google.firebase.crashlytics.d.n.d.b
    public boolean b(com.google.firebase.crashlytics.d.n.c.a aVar, boolean z) {
        if (!z) {
            throw new RuntimeException("An invalid data collection token was used.");
        }
        com.google.firebase.crashlytics.d.k.b bVarH = h(g(c(), aVar.f12705b), aVar.a, aVar.f12706c);
        com.google.firebase.crashlytics.d.b.f().b("Sending report to: " + e());
        try {
            int iB = bVarH.b().b();
            com.google.firebase.crashlytics.d.b.f().b("Result was: " + iB);
            return d0.a(iB) == 0;
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }
}