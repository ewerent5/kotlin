package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import ch.qos.logback.classic.Level;
import ch.qos.logback.core.CoreConstants;
import com.google.android.datatransport.cct.f.j;
import com.google.android.datatransport.cct.f.k;
import com.google.android.datatransport.cct.f.l;
import com.google.android.datatransport.cct.f.m;
import com.google.android.datatransport.cct.f.n;
import com.google.android.datatransport.cct.f.o;
import com.google.android.datatransport.cct.f.p;
import com.google.android.datatransport.runtime.backends.f;
import com.google.android.datatransport.runtime.backends.m;
import e.c.b.a.i.g;
import e.c.b.a.i.h;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: CctTransportBackend.java */
/* loaded from: classes.dex */
final class d implements m {
    private final com.google.firebase.k.a a;

    /* renamed from: b, reason: collision with root package name */
    private final ConnectivityManager f4280b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f4281c;

    /* renamed from: d, reason: collision with root package name */
    final URL f4282d;

    /* renamed from: e, reason: collision with root package name */
    private final e.c.b.a.i.y.a f4283e;

    /* renamed from: f, reason: collision with root package name */
    private final e.c.b.a.i.y.a f4284f;

    /* renamed from: g, reason: collision with root package name */
    private final int f4285g;

    /* compiled from: CctTransportBackend.java */
    static final class a {
        final URL a;

        /* renamed from: b, reason: collision with root package name */
        final j f4286b;

        /* renamed from: c, reason: collision with root package name */
        final String f4287c;

        a(URL url, j jVar, String str) {
            this.a = url;
            this.f4286b = jVar;
            this.f4287c = str;
        }

        a a(URL url) {
            return new a(url, this.f4286b, this.f4287c);
        }
    }

    /* compiled from: CctTransportBackend.java */
    static final class b {
        final int a;

        /* renamed from: b, reason: collision with root package name */
        final URL f4288b;

        /* renamed from: c, reason: collision with root package name */
        final long f4289c;

        b(int i2, URL url, long j2) {
            this.a = i2;
            this.f4288b = url;
            this.f4289c = j2;
        }
    }

    d(Context context, e.c.b.a.i.y.a aVar, e.c.b.a.i.y.a aVar2, int i2) {
        this.a = j.b();
        this.f4281c = context;
        this.f4280b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f4282d = m(com.google.android.datatransport.cct.a.a);
        this.f4283e = aVar2;
        this.f4284f = aVar;
        this.f4285g = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b d(a aVar) throws IOException {
        e.c.b.a.i.u.a.a("CctTransportBackend", "Making request to: %s", aVar.a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f4285g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "2.3.2"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f4287c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.a.a(aVar.f4286b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    e.c.b.a.i.u.a.e("CctTransportBackend", "Status Code: " + responseCode);
                    e.c.b.a.i.u.a.e("CctTransportBackend", "Content-Type: " + httpURLConnection.getHeaderField("Content-Type"));
                    e.c.b.a.i.u.a.e("CctTransportBackend", "Content-Encoding: " + httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream inputStreamL = l(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        try {
                            b bVar = new b(responseCode, null, n.b(new BufferedReader(new InputStreamReader(inputStreamL))).c());
                            if (inputStreamL != null) {
                                inputStreamL.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } catch (Throwable th) {
                            if (inputStreamL != null) {
                                try {
                                    inputStreamL.close();
                                } catch (Throwable unused) {
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable unused2) {
                            }
                        }
                        throw th2;
                    }
                } catch (Throwable th3) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable unused3) {
                    }
                    throw th3;
                }
            } catch (Throwable th4) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable unused4) {
                    }
                }
                throw th4;
            }
        } catch (com.google.firebase.k.b e2) {
            e = e2;
            e.c.b.a.i.u.a.c("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        } catch (ConnectException e3) {
            e = e3;
            e.c.b.a.i.u.a.c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (UnknownHostException e4) {
            e = e4;
            e.c.b.a.i.u.a.c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (IOException e5) {
            e = e5;
            e.c.b.a.i.u.a.c("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        }
    }

    private static int e(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return o.b.UNKNOWN_MOBILE_SUBTYPE.b();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return o.b.COMBINED.b();
        }
        if (o.b.a(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    private static int f(NetworkInfo networkInfo) {
        return networkInfo == null ? o.c.NONE.b() : networkInfo.getType();
    }

    private static int g(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            e.c.b.a.i.u.a.c("CctTransportBackend", "Unable to find version code for package", e2);
            return -1;
        }
    }

    private j h(f fVar) {
        l.a aVarJ;
        HashMap map = new HashMap();
        for (h hVar : fVar.b()) {
            String strJ = hVar.j();
            if (map.containsKey(strJ)) {
                ((List) map.get(strJ)).add(hVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(hVar);
                map.put(strJ, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            h hVar2 = (h) ((List) entry.getValue()).get(0);
            m.a aVarB = com.google.android.datatransport.cct.f.m.a().f(p.DEFAULT).g(this.f4284f.a()).h(this.f4283e.a()).b(k.a().c(k.b.ANDROID_FIREBASE).b(com.google.android.datatransport.cct.f.a.a().m(Integer.valueOf(hVar2.g("sdk-version"))).j(hVar2.b("model")).f(hVar2.b("hardware")).d(hVar2.b("device")).l(hVar2.b("product")).k(hVar2.b("os-uild")).h(hVar2.b("manufacturer")).e(hVar2.b("fingerprint")).c(hVar2.b("country")).g(hVar2.b("locale")).i(hVar2.b("mcc_mnc")).b(hVar2.b("application_build")).a()).a());
            try {
                aVarB.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                aVarB.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (h hVar3 : (List) entry.getValue()) {
                g gVarE = hVar3.e();
                e.c.b.a.b bVarB = gVarE.b();
                if (bVarB.equals(e.c.b.a.b.b("proto"))) {
                    aVarJ = l.j(gVarE.a());
                } else if (bVarB.equals(e.c.b.a.b.b("json"))) {
                    aVarJ = l.i(new String(gVarE.a(), Charset.forName("UTF-8")));
                } else {
                    e.c.b.a.i.u.a.f("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", bVarB);
                }
                aVarJ.c(hVar3.f()).d(hVar3.k()).h(hVar3.h("tz-offset")).e(o.a().c(o.c.a(hVar3.g("net-type"))).b(o.b.a(hVar3.g("mobile-subtype"))).a());
                if (hVar3.d() != null) {
                    aVarJ.b(hVar3.d());
                }
                arrayList3.add(aVarJ.a());
            }
            aVarB.c(arrayList3);
            arrayList2.add(aVarB.a());
        }
        return j.a(arrayList2);
    }

    private static TelephonyManager i(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    static long j() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / CoreConstants.MILLIS_IN_ONE_SECOND;
    }

    static /* synthetic */ a k(a aVar, b bVar) {
        URL url = bVar.f4288b;
        if (url == null) {
            return null;
        }
        e.c.b.a.i.u.a.a("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.a(bVar.f4288b);
    }

    private static InputStream l(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    private static URL m(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e2) {
            throw new IllegalArgumentException("Invalid url: " + str, e2);
        }
    }

    @Override // com.google.android.datatransport.runtime.backends.m
    public com.google.android.datatransport.runtime.backends.g a(f fVar) {
        j jVarH = h(fVar);
        URL urlM = this.f4282d;
        if (fVar.c() != null) {
            try {
                com.google.android.datatransport.cct.a aVarC = com.google.android.datatransport.cct.a.c(fVar.c());
                strD = aVarC.d() != null ? aVarC.d() : null;
                if (aVarC.e() != null) {
                    urlM = m(aVarC.e());
                }
            } catch (IllegalArgumentException unused) {
                return com.google.android.datatransport.runtime.backends.g.a();
            }
        }
        try {
            b bVar = (b) e.c.b.a.i.v.b.a(5, new a(urlM, jVarH, strD), com.google.android.datatransport.cct.b.a(this), c.b());
            int i2 = bVar.a;
            if (i2 == 200) {
                return com.google.android.datatransport.runtime.backends.g.d(bVar.f4289c);
            }
            if (i2 < 500 && i2 != 404) {
                return com.google.android.datatransport.runtime.backends.g.a();
            }
            return com.google.android.datatransport.runtime.backends.g.e();
        } catch (IOException e2) {
            e.c.b.a.i.u.a.c("CctTransportBackend", "Could not make request to the backend", e2);
            return com.google.android.datatransport.runtime.backends.g.e();
        }
    }

    @Override // com.google.android.datatransport.runtime.backends.m
    public h b(h hVar) {
        NetworkInfo activeNetworkInfo = this.f4280b.getActiveNetworkInfo();
        return hVar.l().a("sdk-version", Build.VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c("device", Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", j()).a("net-type", f(activeNetworkInfo)).a("mobile-subtype", e(activeNetworkInfo)).c("country", Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", i(this.f4281c).getSimOperator()).c("application_build", Integer.toString(g(this.f4281c))).d();
    }

    d(Context context, e.c.b.a.i.y.a aVar, e.c.b.a.i.y.a aVar2) {
        this(context, aVar, aVar2, Level.ERROR_INT);
    }
}