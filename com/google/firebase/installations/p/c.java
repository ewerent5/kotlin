package com.google.firebase.installations.p;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PersistedInstallation.java */
/* loaded from: classes.dex */
public class c {
    private final File a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.c f12827b;

    /* compiled from: PersistedInstallation.java */
    public enum a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public c(com.google.firebase.c cVar) {
        this.a = new File(cVar.g().getFilesDir(), "PersistedInstallation." + cVar.k() + ".json");
        this.f12827b = cVar;
    }

    private JSONObject b() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(this.a);
            while (true) {
                try {
                    int i2 = fileInputStream.read(bArr, 0, 16384);
                    if (i2 < 0) {
                        JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                        fileInputStream.close();
                        return jSONObject;
                    }
                    byteArrayOutputStream.write(bArr, 0, i2);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            }
        } catch (IOException | JSONException unused2) {
            return new JSONObject();
        }
    }

    public d a(d dVar) throws JSONException, IOException {
        File fileCreateTempFile;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", dVar.d());
            jSONObject.put("Status", dVar.g().ordinal());
            jSONObject.put("AuthToken", dVar.b());
            jSONObject.put("RefreshToken", dVar.f());
            jSONObject.put("TokenCreationEpochInSecs", dVar.h());
            jSONObject.put("ExpiresInSecs", dVar.c());
            jSONObject.put("FisError", dVar.e());
            fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f12827b.g().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
        } catch (IOException | JSONException unused) {
        }
        if (fileCreateTempFile.renameTo(this.a)) {
            return dVar;
        }
        throw new IOException("unable to rename the tmpfile to PersistedInstallation");
    }

    public d c() throws IOException {
        JSONObject jSONObjectB = b();
        String strOptString = jSONObjectB.optString("Fid", null);
        int iOptInt = jSONObjectB.optInt("Status", a.ATTEMPT_MIGRATION.ordinal());
        String strOptString2 = jSONObjectB.optString("AuthToken", null);
        String strOptString3 = jSONObjectB.optString("RefreshToken", null);
        long jOptLong = jSONObjectB.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObjectB.optLong("ExpiresInSecs", 0L);
        return d.a().d(strOptString).g(a.values()[iOptInt]).b(strOptString2).f(strOptString3).h(jOptLong).c(jOptLong2).e(jSONObjectB.optString("FisError", null)).a();
    }
}