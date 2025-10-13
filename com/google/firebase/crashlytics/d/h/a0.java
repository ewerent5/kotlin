package com.google.firebase.crashlytics.d.h;

import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import org.json.JSONObject;

/* compiled from: MetaDataStore.java */
/* loaded from: classes.dex */
class a0 {
    private static final Charset a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    private final File f12340b;

    public a0(File file) {
        this.f12340b = file;
    }

    private static i0 c(String str) {
        JSONObject jSONObject = new JSONObject(str);
        i0 i0Var = new i0();
        i0Var.d(e(jSONObject, "userId"));
        return i0Var;
    }

    private static String e(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    public File a(String str) {
        return new File(this.f12340b, str + "keys.meta");
    }

    public File b(String str) {
        return new File(this.f12340b, str + "user.meta");
    }

    public i0 d(String str) throws Throwable {
        File fileB = b(str);
        if (!fileB.exists()) {
            return new i0();
        }
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(fileB);
                try {
                    i0 i0VarC = c(h.G(fileInputStream2));
                    h.e(fileInputStream2, "Failed to close user metadata file.");
                    return i0VarC;
                } catch (Exception e2) {
                    e = e2;
                    fileInputStream = fileInputStream2;
                    com.google.firebase.crashlytics.d.b.f().e("Error deserializing user metadata.", e);
                    h.e(fileInputStream, "Failed to close user metadata file.");
                    return new i0();
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    h.e(fileInputStream, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }
}