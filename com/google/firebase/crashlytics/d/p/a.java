package com.google.firebase.crashlytics.d.p;

import android.content.Context;
import com.google.firebase.crashlytics.d.l.i;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

/* compiled from: CachedSettingsIo.java */
/* loaded from: classes.dex */
public class a {
    private final Context a;

    public a(Context context) {
        this.a = context;
    }

    private File a() {
        return new File(new i(this.a).b(), "com.crashlytics.settings.json");
    }

    public JSONObject b() throws Throwable {
        Throwable th;
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        com.google.firebase.crashlytics.d.b.f().b("Reading cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            try {
                File fileA = a();
                if (fileA.exists()) {
                    fileInputStream = new FileInputStream(fileA);
                    try {
                        jSONObject = new JSONObject(com.google.firebase.crashlytics.d.h.h.G(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e2) {
                        e = e2;
                        com.google.firebase.crashlytics.d.b.f().e("Failed to fetch cached settings", e);
                        com.google.firebase.crashlytics.d.h.h.e(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    com.google.firebase.crashlytics.d.b.f().b("No cached settings found.");
                    jSONObject = null;
                }
                com.google.firebase.crashlytics.d.h.h.e(fileInputStream2, "Error while closing settings cache file.");
                return jSONObject;
            } catch (Exception e3) {
                e = e3;
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                com.google.firebase.crashlytics.d.h.h.e(null, "Error while closing settings cache file.");
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            com.google.firebase.crashlytics.d.h.h.e(null, "Error while closing settings cache file.");
            throw th;
        }
    }

    public void c(long j2, JSONObject jSONObject) throws Throwable {
        com.google.firebase.crashlytics.d.b.f().b("Writing settings to cache file...");
        if (jSONObject == null) {
            return;
        }
        FileWriter fileWriter = null;
        try {
            try {
                jSONObject.put("expires_at", j2);
                FileWriter fileWriter2 = new FileWriter(a());
                try {
                    fileWriter2.write(jSONObject.toString());
                    fileWriter2.flush();
                    com.google.firebase.crashlytics.d.h.h.e(fileWriter2, "Failed to close settings writer.");
                } catch (Exception e2) {
                    e = e2;
                    fileWriter = fileWriter2;
                    com.google.firebase.crashlytics.d.b.f().e("Failed to cache settings", e);
                    com.google.firebase.crashlytics.d.h.h.e(fileWriter, "Failed to close settings writer.");
                } catch (Throwable th) {
                    th = th;
                    fileWriter = fileWriter2;
                    com.google.firebase.crashlytics.d.h.h.e(fileWriter, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}