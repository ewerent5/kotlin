package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.firebase.remoteconfig.internal.f;
import com.google.firebase.remoteconfig.internal.k;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ConfigFetchHttpClient {
    private static final Pattern a = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: b, reason: collision with root package name */
    private final Context f12913b;

    /* renamed from: c, reason: collision with root package name */
    private final String f12914c;

    /* renamed from: d, reason: collision with root package name */
    private final String f12915d;

    /* renamed from: e, reason: collision with root package name */
    private final String f12916e;

    /* renamed from: f, reason: collision with root package name */
    private final String f12917f;

    /* renamed from: g, reason: collision with root package name */
    private final long f12918g;

    /* renamed from: h, reason: collision with root package name */
    private final long f12919h;

    public ConfigFetchHttpClient(Context context, String str, String str2, String str3, long j2, long j3) {
        this.f12913b = context;
        this.f12914c = str;
        this.f12915d = str2;
        this.f12916e = e(str);
        this.f12917f = str3;
        this.f12918g = j2;
        this.f12919h = j3;
    }

    private boolean a(JSONObject jSONObject) {
        try {
            return !jSONObject.get("state").equals("NO_CHANGE");
        } catch (JSONException unused) {
            return true;
        }
    }

    private JSONObject b(String str, String str2, Map<String, String> map) throws com.google.firebase.remoteconfig.h, PackageManager.NameNotFoundException {
        HashMap map2 = new HashMap();
        if (str == null) {
            throw new com.google.firebase.remoteconfig.h("Fetch failed: Firebase installation id is null.");
        }
        map2.put("appInstanceId", str);
        map2.put("appInstanceIdToken", str2);
        map2.put("appId", this.f12914c);
        Locale locale = this.f12913b.getResources().getConfiguration().locale;
        map2.put("countryCode", locale.getCountry());
        int i2 = Build.VERSION.SDK_INT;
        map2.put("languageCode", i2 >= 21 ? locale.toLanguageTag() : locale.toString());
        map2.put("platformVersion", Integer.toString(i2));
        map2.put("timeZone", TimeZone.getDefault().getID());
        try {
            PackageInfo packageInfo = this.f12913b.getPackageManager().getPackageInfo(this.f12913b.getPackageName(), 0);
            if (packageInfo != null) {
                map2.put("appVersion", packageInfo.versionName);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        map2.put("packageName", this.f12913b.getPackageName());
        map2.put("sdkVersion", "20.0.2");
        map2.put("analyticsUserProperties", new JSONObject(map));
        return new JSONObject(map2);
    }

    private static f d(JSONObject jSONObject, Date date) throws JSONException, com.google.firebase.remoteconfig.h {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        try {
            f.b bVarE = f.g().e(date);
            JSONObject jSONObject3 = null;
            try {
                jSONObject2 = jSONObject.getJSONObject("entries");
            } catch (JSONException unused) {
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                bVarE.c(jSONObject2);
            }
            try {
                jSONArray = jSONObject.getJSONArray("experimentDescriptions");
            } catch (JSONException unused2) {
                jSONArray = null;
            }
            if (jSONArray != null) {
                bVarE.d(jSONArray);
            }
            try {
                jSONObject3 = jSONObject.getJSONObject("personalizationMetadata");
            } catch (JSONException unused3) {
            }
            if (jSONObject3 != null) {
                bVarE.f(jSONObject3);
            }
            return bVarE.a();
        } catch (JSONException e2) {
            throw new com.google.firebase.remoteconfig.h("Fetch failed: fetch response could not be parsed.", e2);
        }
    }

    private static String e(String str) {
        Matcher matcher = a.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    private JSONObject f(URLConnection uRLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream(), "utf-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i2 = bufferedReader.read();
            if (i2 == -1) {
                return new JSONObject(sb.toString());
            }
            sb.append((char) i2);
        }
    }

    private String g(String str, String str2) {
        return String.format("https://firebaseremoteconfig.googleapis.com/v1/projects/%s/namespaces/%s:fetch", str, str2);
    }

    private String h() {
        try {
            Context context = this.f12913b;
            byte[] bArrA = com.google.android.gms.common.util.a.a(context, context.getPackageName());
            if (bArrA != null) {
                return com.google.android.gms.common.util.k.b(bArrA, false);
            }
            Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + this.f12913b.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("FirebaseRemoteConfig", "No such package: " + this.f12913b.getPackageName(), e2);
            return null;
        }
    }

    private void i(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.f12915d);
        httpURLConnection.setRequestProperty("X-Android-Package", this.f12913b.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", h());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
    }

    private void j(HttpURLConnection httpURLConnection, Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
    }

    private void k(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    private void l(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map) {
        httpURLConnection.setDoOutput(true);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(this.f12918g));
        httpURLConnection.setReadTimeout((int) timeUnit.toMillis(this.f12919h));
        httpURLConnection.setRequestProperty("If-None-Match", str);
        i(httpURLConnection, str2);
        j(httpURLConnection, map);
    }

    HttpURLConnection c() throws com.google.firebase.remoteconfig.i {
        try {
            return (HttpURLConnection) new URL(g(this.f12916e, this.f12917f)).openConnection();
        } catch (IOException e2) {
            throw new com.google.firebase.remoteconfig.i(e2.getMessage());
        }
    }

    @Keep
    k.a fetch(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map, String str3, Map<String, String> map2, Date date) throws IOException {
        l(httpURLConnection, str3, str2, map2);
        try {
            try {
                k(httpURLConnection, b(str, str2, map).toString().getBytes("utf-8"));
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 200) {
                    throw new com.google.firebase.remoteconfig.k(responseCode, httpURLConnection.getResponseMessage());
                }
                String headerField = httpURLConnection.getHeaderField("ETag");
                JSONObject jSONObjectF = f(httpURLConnection);
                try {
                    httpURLConnection.getInputStream().close();
                } catch (IOException unused) {
                }
                return !a(jSONObjectF) ? k.a.a(date) : k.a.b(d(jSONObjectF, date), headerField);
            } catch (IOException | JSONException e2) {
                throw new com.google.firebase.remoteconfig.h("The client had an error while calling the backend!", e2);
            }
        } finally {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
            } catch (IOException unused2) {
            }
        }
    }
}