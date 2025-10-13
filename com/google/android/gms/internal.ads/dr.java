package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.JsonWriter;
import ch.qos.logback.core.joran.action.Action;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class dr {

    /* renamed from: b, reason: collision with root package name */
    private static boolean f5507b = false;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f5508c = false;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f5511f = 0;

    /* renamed from: g, reason: collision with root package name */
    private final List<String> f5512g;
    private static final Object a = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.android.gms.common.util.f f5509d = com.google.android.gms.common.util.i.d();

    /* renamed from: e, reason: collision with root package name */
    private static final Set<String> f5510e = new HashSet(Arrays.asList(new String[0]));

    public dr(String str) {
        List<String> listAsList;
        if (j()) {
            String[] strArr = new String[1];
            String strValueOf = String.valueOf(UUID.randomUUID().toString());
            strArr[0] = strValueOf.length() != 0 ? "network_request_".concat(strValueOf) : new String("network_request_");
            listAsList = Arrays.asList(strArr);
        } else {
            listAsList = new ArrayList<>();
        }
        this.f5512g = listAsList;
    }

    public static void g() {
        synchronized (a) {
            f5507b = false;
            f5508c = false;
            er.zzi("Ad debug logging enablement is out of date.");
        }
    }

    public static void h(boolean z) {
        synchronized (a) {
            f5507b = true;
            f5508c = z;
        }
    }

    public static boolean i() {
        boolean z;
        synchronized (a) {
            z = f5507b;
        }
        return z;
    }

    public static boolean j() {
        boolean z;
        synchronized (a) {
            z = false;
            if (f5507b && f5508c) {
                z = true;
            }
        }
        return z;
    }

    public static boolean k(Context context) {
        if (Build.VERSION.SDK_INT < 17 || !i5.a.e().booleanValue()) {
            return false;
        }
        try {
            return Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0;
        } catch (Exception e2) {
            er.zzj("Fail to determine debug setting.", e2);
            return false;
        }
    }

    static final /* synthetic */ void l(int i2, Map map, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(i2);
        jsonWriter.endObject();
        q(jsonWriter, map);
        jsonWriter.endObject();
    }

    static final /* synthetic */ void m(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        q(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(com.google.android.gms.common.util.c.a(bArr));
        }
        jsonWriter.endObject();
    }

    private final void n(final String str, final String str2, final Map<String, ?> map, final byte[] bArr) throws IOException {
        r("onNetworkRequest", new cr(str, str2, map, bArr) { // from class: com.google.android.gms.internal.ads.yq
            private final String a;

            /* renamed from: b, reason: collision with root package name */
            private final String f10465b;

            /* renamed from: c, reason: collision with root package name */
            private final Map f10466c;

            /* renamed from: d, reason: collision with root package name */
            private final byte[] f10467d;

            {
                this.a = str;
                this.f10465b = str2;
                this.f10466c = map;
                this.f10467d = bArr;
            }

            @Override // com.google.android.gms.internal.ads.cr
            public final void a(JsonWriter jsonWriter) throws IOException {
                dr.m(this.a, this.f10465b, this.f10466c, this.f10467d, jsonWriter);
            }
        });
    }

    private final void o(final Map<String, ?> map, final int i2) throws IOException {
        r("onNetworkResponse", new cr(i2, map) { // from class: com.google.android.gms.internal.ads.zq
            private final int a;

            /* renamed from: b, reason: collision with root package name */
            private final Map f10628b;

            {
                this.a = i2;
                this.f10628b = map;
            }

            @Override // com.google.android.gms.internal.ads.cr
            public final void a(JsonWriter jsonWriter) throws IOException {
                dr.l(this.a, this.f10628b, jsonWriter);
            }
        });
    }

    private final void p(final String str) throws IOException {
        r("onNetworkRequestError", new cr(str) { // from class: com.google.android.gms.internal.ads.br
            private final String a;

            {
                this.a = str;
            }

            @Override // com.google.android.gms.internal.ads.cr
            public final void a(JsonWriter jsonWriter) throws IOException {
                String str2 = this.a;
                int i2 = dr.f5511f;
                jsonWriter.name("params").beginObject();
                if (str2 != null) {
                    jsonWriter.name("error_description").value(str2);
                }
                jsonWriter.endObject();
            }
        });
    }

    private static void q(JsonWriter jsonWriter, Map<String, ?> map) throws IOException {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        Iterator<Map.Entry<String, ?>> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it.next();
            String key = next.getKey();
            if (!f5510e.contains(key)) {
                if (!(next.getValue() instanceof List)) {
                    if (!(next.getValue() instanceof String)) {
                        er.zzf("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                        break;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name(Action.NAME_ATTRIBUTE).value(key);
                    jsonWriter.name("value").value((String) next.getValue());
                    jsonWriter.endObject();
                } else {
                    for (String str : (List) next.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name(Action.NAME_ATTRIBUTE).value(key);
                        jsonWriter.name("value").value(str);
                        jsonWriter.endObject();
                    }
                }
            }
        }
        jsonWriter.endArray();
    }

    private final void r(String str, cr crVar) throws IOException {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(f5509d.a());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            Iterator<String> it = this.f5512g.iterator();
            while (it.hasNext()) {
                jsonWriter.value(it.next());
            }
            jsonWriter.endArray();
            crVar.a(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e2) {
            er.zzg("unable to log", e2);
        }
        s(stringWriter.toString());
    }

    private static synchronized void s(String str) {
        er.zzh("GMA Debug BEGIN");
        int i2 = 0;
        while (i2 < str.length()) {
            int i3 = i2 + 4000;
            String strValueOf = String.valueOf(str.substring(i2, Math.min(i3, str.length())));
            er.zzh(strValueOf.length() != 0 ? "GMA Debug CONTENT ".concat(strValueOf) : new String("GMA Debug CONTENT "));
            i2 = i3;
        }
        er.zzh("GMA Debug FINISH");
    }

    public final void a(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        if (j()) {
            n(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr);
        }
    }

    public final void b(String str, String str2, Map<String, ?> map, byte[] bArr) throws IOException {
        if (j()) {
            n(str, "GET", map, bArr);
        }
    }

    public final void c(HttpURLConnection httpURLConnection, int i2) throws IOException {
        if (j()) {
            String responseMessage = null;
            o(httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), i2);
            if (i2 < 200 || i2 >= 300) {
                try {
                    responseMessage = httpURLConnection.getResponseMessage();
                } catch (IOException e2) {
                    String strValueOf = String.valueOf(e2.getMessage());
                    er.zzi(strValueOf.length() != 0 ? "Can not get error message from error HttpURLConnection\n".concat(strValueOf) : new String("Can not get error message from error HttpURLConnection\n"));
                }
                p(responseMessage);
            }
        }
    }

    public final void d(Map<String, ?> map, int i2) throws IOException {
        if (j()) {
            o(map, i2);
            if (i2 < 200 || i2 >= 300) {
                p(null);
            }
        }
    }

    public final void e(String str) throws IOException {
        if (j() && str != null) {
            f(str.getBytes());
        }
    }

    public final void f(final byte[] bArr) throws IOException {
        r("onNetworkResponseBody", new cr(bArr) { // from class: com.google.android.gms.internal.ads.ar
            private final byte[] a;

            {
                this.a = bArr;
            }

            @Override // com.google.android.gms.internal.ads.cr
            public final void a(JsonWriter jsonWriter) throws NoSuchAlgorithmException, IOException {
                byte[] bArr2 = this.a;
                int i2 = dr.f5511f;
                jsonWriter.name("params").beginObject();
                int length = bArr2.length;
                String strA = com.google.android.gms.common.util.c.a(bArr2);
                if (length < 10000) {
                    jsonWriter.name("body").value(strA);
                } else {
                    String strD = xq.d(strA);
                    if (strD != null) {
                        jsonWriter.name("bodydigest").value(strD);
                    }
                }
                jsonWriter.name("bodylength").value(length);
                jsonWriter.endObject();
            }
        });
    }
}