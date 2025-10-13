package k.c.e.m;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import k.c.e.n.a;

/* compiled from: TileDownloader.java */
/* loaded from: classes3.dex */
public class t {
    private boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r25v0, types: [k.c.e.m.g] */
    /* JADX WARN: Type inference failed for: r26v0, types: [k.c.e.n.a, k.c.e.n.d, k.c.e.n.e] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.io.ByteArrayOutputStream, java.io.Closeable, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v68 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v33, types: [java.io.BufferedOutputStream, java.io.Closeable, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r3v36, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v37, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v58 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r5v49, types: [java.lang.StringBuilder] */
    public Drawable a(long j2, int i2, String str, g gVar, k.c.e.n.e eVar) throws Throwable {
        Throwable th;
        InputStream inputStream;
        ByteArrayInputStream byteArrayInputStream;
        ByteArrayInputStream byteArrayInputStream2;
        ByteArrayInputStream byteArrayInputStream3;
        HttpURLConnection httpURLConnection;
        a.C0213a c0213a;
        Closeable closeable;
        Closeable closeable2;
        IOException iOException;
        InputStream inputStream2;
        ByteArrayInputStream byteArrayInputStream4;
        ByteArrayInputStream byteArrayInputStream5;
        UnknownHostException unknownHostException;
        InputStream inputStream3;
        ByteArrayInputStream byteArrayInputStream6;
        ByteArrayInputStream byteArrayInputStream7;
        FileNotFoundException fileNotFoundException;
        InputStream inputStream4;
        ByteArrayInputStream byteArrayInputStream8;
        ByteArrayInputStream byteArrayInputStream9;
        Throwable th2;
        Closeable closeable3;
        Closeable closeable4;
        ?? r1;
        InputStream inputStream5;
        ByteArrayInputStream byteArrayInputStream10;
        InputStream inputStream6;
        ByteArrayInputStream byteArrayInputStream11;
        InputStream inputStream7;
        ByteArrayInputStream byteArrayInputStream12;
        InputStream inputStream8;
        ByteArrayInputStream byteArrayInputStream13;
        ByteArrayInputStream byteArrayInputStream14;
        ByteArrayInputStream byteArrayInputStream15;
        ByteArrayInputStream byteArrayInputStream16;
        ByteArrayInputStream byteArrayInputStream17;
        ByteArrayInputStream byteArrayInputStream18;
        InputStream inputStream9;
        ByteArrayInputStream byteArrayInputStream19;
        InputStream inputStream10;
        ByteArrayInputStream byteArrayInputStream20;
        InputStream inputStream11;
        ByteArrayInputStream byteArrayInputStream21;
        InputStream inputStream12;
        InputStream inputStream13;
        ?? byteArrayOutputStream;
        ?? bufferedOutputStream;
        String string;
        ?? r12 = i2;
        ?? r2 = str;
        ?? r3 = "https://";
        Object obj = null;
        if (r12 > 3) {
            return null;
        }
        String strS = eVar.l().i() ? k.c.b.a.a().s() : null;
        if (strS == null) {
            strS = k.c.b.a.a().x();
        }
        if (!eVar.l().c(strS)) {
            Log.e("OsmDroid", "Please configure a relevant user agent; current value is: " + strS);
            return null;
        }
        try {
            try {
                if (k.c.b.a.a().c()) {
                    Log.d("OsmDroid", "Downloading Maptile from url: " + r2);
                }
                if (TextUtils.isEmpty(str)) {
                    k.c.e.o.f.a(null);
                    k.c.e.o.f.a(null);
                    k.c.e.o.f.a(null);
                    k.c.e.o.f.a(null);
                    try {
                        throw null;
                    } catch (Exception unused) {
                        return null;
                    }
                }
                if (Build.VERSION.SDK_INT < 20 && !this.a) {
                    HttpsURLConnection.setDefaultSSLSocketFactory(new a(HttpsURLConnection.getDefaultSSLSocketFactory()));
                    this.a = true;
                }
                httpURLConnection = k.c.b.a.a().E() != null ? (HttpURLConnection) new URL(r2).openConnection(k.c.b.a.a().E()) : (HttpURLConnection) new URL(r2).openConnection();
                try {
                    httpURLConnection.setUseCaches(true);
                    httpURLConnection.setRequestProperty(k.c.b.a.a().r(), strS);
                    for (Map.Entry<String, String> entry : k.c.b.a.a().n().entrySet()) {
                        httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                    httpURLConnection.connect();
                    if (httpURLConnection.getResponseCode() != 200) {
                        int responseCode = httpURLConnection.getResponseCode();
                        if ((responseCode != 301 && responseCode != 302 && responseCode != 307 && responseCode != 308) || !k.c.b.a.a().t()) {
                            Log.w("OsmDroid", "Problem downloading MapTile: " + k.c.f.m.h(j2) + " HTTP response: " + httpURLConnection.getResponseMessage());
                            if (k.c.b.a.a().F()) {
                                Log.d("OsmDroid", r2);
                            }
                            k.c.e.o.b.f16708b++;
                            k.c.e.o.f.a(httpURLConnection.getErrorStream());
                            k.c.e.o.f.a(null);
                            k.c.e.o.f.a(null);
                            k.c.e.o.f.a(null);
                            try {
                                httpURLConnection.disconnect();
                            } catch (Exception unused2) {
                            }
                            return null;
                        }
                        String headerField = httpURLConnection.getHeaderField("Location");
                        if (headerField != null) {
                            if (headerField.startsWith("/")) {
                                URL url = new URL(r2);
                                int port = url.getPort();
                                boolean zStartsWith = str.toLowerCase().startsWith("https://");
                                if (port == -1) {
                                    port = str.toLowerCase().startsWith("http://") ? 80 : 443;
                                }
                                StringBuilder sb = new StringBuilder();
                                sb.append(zStartsWith ? r3 : "http");
                                sb.append(url.getHost());
                                sb.append(":");
                                sb.append(port);
                                sb.append(headerField);
                                string = sb.toString();
                            } else {
                                string = headerField;
                            }
                            Log.i("OsmDroid", "Http redirect for MapTile: " + k.c.f.m.h(j2) + " HTTP response: " + httpURLConnection.getResponseMessage() + " to url " + string);
                            Drawable drawableA = a(j2, r12 + 1, string, gVar, eVar);
                            k.c.e.o.f.a(null);
                            k.c.e.o.f.a(null);
                            k.c.e.o.f.a(null);
                            k.c.e.o.f.a(null);
                            try {
                                httpURLConnection.disconnect();
                            } catch (Exception unused3) {
                            }
                            return drawableA;
                        }
                    }
                    String headerField2 = httpURLConnection.getHeaderField("Content-Type");
                    if (k.c.b.a.a().F()) {
                        Log.d("OsmDroid", r2 + " success, mime is " + headerField2);
                    }
                    if (headerField2 != null && !headerField2.toLowerCase().contains("image")) {
                        Log.w("OsmDroid", r2 + " success, however the mime type does not appear to be an image " + headerField2);
                    }
                    inputStream13 = httpURLConnection.getInputStream();
                } catch (FileNotFoundException e2) {
                    fileNotFoundException = e2;
                    inputStream8 = null;
                    byteArrayInputStream13 = null;
                } catch (UnknownHostException e3) {
                    unknownHostException = e3;
                    inputStream7 = null;
                    byteArrayInputStream12 = null;
                } catch (IOException e4) {
                    iOException = e4;
                    inputStream6 = null;
                    byteArrayInputStream11 = null;
                } catch (a.C0213a e5) {
                    c0213a = e5;
                    closeable = null;
                    closeable2 = null;
                    byteArrayInputStream3 = null;
                } catch (Throwable th3) {
                    th = th3;
                    inputStream5 = null;
                    byteArrayInputStream10 = null;
                }
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        bufferedOutputStream = new BufferedOutputStream(byteArrayOutputStream, 8192);
                        try {
                            long jE = eVar.l().e(httpURLConnection, System.currentTimeMillis());
                            k.c.e.o.f.b(inputStream13, bufferedOutputStream);
                            bufferedOutputStream.flush();
                            byteArrayInputStream3 = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                            if (gVar != 0) {
                                try {
                                    gVar.b(eVar, j2, byteArrayInputStream3, Long.valueOf(jE));
                                    byteArrayInputStream3.reset();
                                } catch (FileNotFoundException e6) {
                                    fileNotFoundException = e6;
                                    inputStream4 = inputStream13;
                                    byteArrayInputStream8 = byteArrayOutputStream;
                                    byteArrayInputStream9 = bufferedOutputStream;
                                    k.c.e.o.b.f16708b++;
                                    Log.w("OsmDroid", "Tile not found: " + k.c.f.m.h(j2) + " : " + fileNotFoundException);
                                    r12 = inputStream4;
                                    r2 = byteArrayInputStream8;
                                    r3 = byteArrayInputStream9;
                                    k.c.e.o.f.a(r12);
                                    k.c.e.o.f.a(r3);
                                    k.c.e.o.f.a(byteArrayInputStream3);
                                    k.c.e.o.f.a(r2);
                                    try {
                                        httpURLConnection.disconnect();
                                    } catch (Exception unused4) {
                                    }
                                    return null;
                                } catch (UnknownHostException e7) {
                                    unknownHostException = e7;
                                    inputStream3 = inputStream13;
                                    byteArrayInputStream6 = byteArrayOutputStream;
                                    byteArrayInputStream7 = bufferedOutputStream;
                                    Log.w("OsmDroid", "UnknownHostException downloading MapTile: " + k.c.f.m.h(j2) + " : " + unknownHostException);
                                    k.c.e.o.b.f16708b = k.c.e.o.b.f16708b + 1;
                                    r12 = inputStream3;
                                    r2 = byteArrayInputStream6;
                                    r3 = byteArrayInputStream7;
                                    k.c.e.o.f.a(r12);
                                    k.c.e.o.f.a(r3);
                                    k.c.e.o.f.a(byteArrayInputStream3);
                                    k.c.e.o.f.a(r2);
                                    httpURLConnection.disconnect();
                                    return null;
                                } catch (IOException e8) {
                                    iOException = e8;
                                    inputStream2 = inputStream13;
                                    byteArrayInputStream4 = byteArrayOutputStream;
                                    byteArrayInputStream5 = bufferedOutputStream;
                                    k.c.e.o.b.f16708b++;
                                    Log.w("OsmDroid", "IOException downloading MapTile: " + k.c.f.m.h(j2) + " : " + iOException);
                                    r12 = inputStream2;
                                    r2 = byteArrayInputStream4;
                                    r3 = byteArrayInputStream5;
                                    k.c.e.o.f.a(r12);
                                    k.c.e.o.f.a(r3);
                                    k.c.e.o.f.a(byteArrayInputStream3);
                                    k.c.e.o.f.a(r2);
                                    httpURLConnection.disconnect();
                                    return null;
                                } catch (a.C0213a e9) {
                                    e = e9;
                                    obj = inputStream13;
                                    c0213a = e;
                                    closeable = byteArrayOutputStream;
                                    closeable2 = bufferedOutputStream;
                                    try {
                                        k.c.e.o.b.a++;
                                        Log.w("OsmDroid", "LowMemoryException downloading MapTile: " + k.c.f.m.h(j2) + " : " + c0213a);
                                        throw new b(c0213a);
                                    } catch (Throwable th4) {
                                        th2 = th4;
                                        r1 = obj;
                                        closeable4 = closeable;
                                        closeable3 = closeable2;
                                        k.c.e.o.f.a(r1);
                                        k.c.e.o.f.a(closeable3);
                                        k.c.e.o.f.a(byteArrayInputStream3);
                                        k.c.e.o.f.a(closeable4);
                                        try {
                                            httpURLConnection.disconnect();
                                            throw th2;
                                        } catch (Exception unused5) {
                                            throw th2;
                                        }
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    inputStream = inputStream13;
                                    byteArrayInputStream = byteArrayOutputStream;
                                    byteArrayInputStream2 = bufferedOutputStream;
                                    k.c.e.o.b.f16708b++;
                                    Log.e("OsmDroid", "Error downloading MapTile: " + k.c.f.m.h(j2), th);
                                    r12 = inputStream;
                                    r2 = byteArrayInputStream;
                                    r3 = byteArrayInputStream2;
                                    k.c.e.o.f.a(r12);
                                    k.c.e.o.f.a(r3);
                                    k.c.e.o.f.a(byteArrayInputStream3);
                                    k.c.e.o.f.a(r2);
                                    httpURLConnection.disconnect();
                                    return null;
                                }
                            }
                            Drawable drawableE = eVar.e(byteArrayInputStream3);
                            k.c.e.o.f.a(inputStream13);
                            k.c.e.o.f.a(bufferedOutputStream);
                            k.c.e.o.f.a(byteArrayInputStream3);
                            k.c.e.o.f.a(byteArrayOutputStream);
                            try {
                                httpURLConnection.disconnect();
                            } catch (Exception unused6) {
                            }
                            return drawableE;
                        } catch (FileNotFoundException e10) {
                            fileNotFoundException = e10;
                            byteArrayInputStream3 = null;
                            inputStream4 = inputStream13;
                            byteArrayInputStream8 = byteArrayOutputStream;
                            byteArrayInputStream9 = bufferedOutputStream;
                        } catch (UnknownHostException e11) {
                            unknownHostException = e11;
                            byteArrayInputStream3 = null;
                            inputStream3 = inputStream13;
                            byteArrayInputStream6 = byteArrayOutputStream;
                            byteArrayInputStream7 = bufferedOutputStream;
                        } catch (IOException e12) {
                            iOException = e12;
                            byteArrayInputStream3 = null;
                            inputStream2 = inputStream13;
                            byteArrayInputStream4 = byteArrayOutputStream;
                            byteArrayInputStream5 = bufferedOutputStream;
                        } catch (a.C0213a e13) {
                            e = e13;
                            byteArrayInputStream3 = null;
                        } catch (Throwable th6) {
                            th = th6;
                            byteArrayInputStream3 = null;
                            inputStream = inputStream13;
                            byteArrayInputStream = byteArrayOutputStream;
                            byteArrayInputStream2 = bufferedOutputStream;
                        }
                    } catch (FileNotFoundException e14) {
                        fileNotFoundException = e14;
                        byteArrayInputStream17 = null;
                        inputStream12 = inputStream13;
                        byteArrayInputStream21 = byteArrayOutputStream;
                        byteArrayInputStream3 = byteArrayInputStream17;
                        inputStream4 = inputStream12;
                        byteArrayInputStream8 = byteArrayInputStream21;
                        byteArrayInputStream9 = byteArrayInputStream17;
                        k.c.e.o.b.f16708b++;
                        Log.w("OsmDroid", "Tile not found: " + k.c.f.m.h(j2) + " : " + fileNotFoundException);
                        r12 = inputStream4;
                        r2 = byteArrayInputStream8;
                        r3 = byteArrayInputStream9;
                        k.c.e.o.f.a(r12);
                        k.c.e.o.f.a(r3);
                        k.c.e.o.f.a(byteArrayInputStream3);
                        k.c.e.o.f.a(r2);
                        httpURLConnection.disconnect();
                        return null;
                    } catch (UnknownHostException e15) {
                        unknownHostException = e15;
                        byteArrayInputStream16 = null;
                        inputStream11 = inputStream13;
                        byteArrayInputStream20 = byteArrayOutputStream;
                        byteArrayInputStream3 = byteArrayInputStream16;
                        inputStream3 = inputStream11;
                        byteArrayInputStream6 = byteArrayInputStream20;
                        byteArrayInputStream7 = byteArrayInputStream16;
                        Log.w("OsmDroid", "UnknownHostException downloading MapTile: " + k.c.f.m.h(j2) + " : " + unknownHostException);
                        k.c.e.o.b.f16708b = k.c.e.o.b.f16708b + 1;
                        r12 = inputStream3;
                        r2 = byteArrayInputStream6;
                        r3 = byteArrayInputStream7;
                        k.c.e.o.f.a(r12);
                        k.c.e.o.f.a(r3);
                        k.c.e.o.f.a(byteArrayInputStream3);
                        k.c.e.o.f.a(r2);
                        httpURLConnection.disconnect();
                        return null;
                    } catch (IOException e16) {
                        iOException = e16;
                        byteArrayInputStream15 = null;
                        inputStream10 = inputStream13;
                        byteArrayInputStream19 = byteArrayOutputStream;
                        byteArrayInputStream3 = byteArrayInputStream15;
                        inputStream2 = inputStream10;
                        byteArrayInputStream4 = byteArrayInputStream19;
                        byteArrayInputStream5 = byteArrayInputStream15;
                        k.c.e.o.b.f16708b++;
                        Log.w("OsmDroid", "IOException downloading MapTile: " + k.c.f.m.h(j2) + " : " + iOException);
                        r12 = inputStream2;
                        r2 = byteArrayInputStream4;
                        r3 = byteArrayInputStream5;
                        k.c.e.o.f.a(r12);
                        k.c.e.o.f.a(r3);
                        k.c.e.o.f.a(byteArrayInputStream3);
                        k.c.e.o.f.a(r2);
                        httpURLConnection.disconnect();
                        return null;
                    } catch (a.C0213a e17) {
                        e = e17;
                        bufferedOutputStream = 0;
                        byteArrayOutputStream = byteArrayOutputStream;
                        byteArrayInputStream3 = bufferedOutputStream;
                        obj = inputStream13;
                        c0213a = e;
                        closeable = byteArrayOutputStream;
                        closeable2 = bufferedOutputStream;
                        k.c.e.o.b.a++;
                        Log.w("OsmDroid", "LowMemoryException downloading MapTile: " + k.c.f.m.h(j2) + " : " + c0213a);
                        throw new b(c0213a);
                    } catch (Throwable th7) {
                        th = th7;
                        byteArrayInputStream14 = null;
                        inputStream9 = inputStream13;
                        byteArrayInputStream18 = byteArrayOutputStream;
                        byteArrayInputStream3 = byteArrayInputStream14;
                        inputStream = inputStream9;
                        byteArrayInputStream = byteArrayInputStream18;
                        byteArrayInputStream2 = byteArrayInputStream14;
                        k.c.e.o.b.f16708b++;
                        Log.e("OsmDroid", "Error downloading MapTile: " + k.c.f.m.h(j2), th);
                        r12 = inputStream;
                        r2 = byteArrayInputStream;
                        r3 = byteArrayInputStream2;
                        k.c.e.o.f.a(r12);
                        k.c.e.o.f.a(r3);
                        k.c.e.o.f.a(byteArrayInputStream3);
                        k.c.e.o.f.a(r2);
                        httpURLConnection.disconnect();
                        return null;
                    }
                } catch (FileNotFoundException e18) {
                    fileNotFoundException = e18;
                    byteArrayInputStream13 = null;
                    inputStream8 = inputStream13;
                    byteArrayInputStream17 = byteArrayInputStream13;
                    inputStream12 = inputStream8;
                    byteArrayInputStream21 = byteArrayInputStream13;
                    byteArrayInputStream3 = byteArrayInputStream17;
                    inputStream4 = inputStream12;
                    byteArrayInputStream8 = byteArrayInputStream21;
                    byteArrayInputStream9 = byteArrayInputStream17;
                    k.c.e.o.b.f16708b++;
                    Log.w("OsmDroid", "Tile not found: " + k.c.f.m.h(j2) + " : " + fileNotFoundException);
                    r12 = inputStream4;
                    r2 = byteArrayInputStream8;
                    r3 = byteArrayInputStream9;
                    k.c.e.o.f.a(r12);
                    k.c.e.o.f.a(r3);
                    k.c.e.o.f.a(byteArrayInputStream3);
                    k.c.e.o.f.a(r2);
                    httpURLConnection.disconnect();
                    return null;
                } catch (UnknownHostException e19) {
                    unknownHostException = e19;
                    byteArrayInputStream12 = null;
                    inputStream7 = inputStream13;
                    byteArrayInputStream16 = byteArrayInputStream12;
                    inputStream11 = inputStream7;
                    byteArrayInputStream20 = byteArrayInputStream12;
                    byteArrayInputStream3 = byteArrayInputStream16;
                    inputStream3 = inputStream11;
                    byteArrayInputStream6 = byteArrayInputStream20;
                    byteArrayInputStream7 = byteArrayInputStream16;
                    Log.w("OsmDroid", "UnknownHostException downloading MapTile: " + k.c.f.m.h(j2) + " : " + unknownHostException);
                    k.c.e.o.b.f16708b = k.c.e.o.b.f16708b + 1;
                    r12 = inputStream3;
                    r2 = byteArrayInputStream6;
                    r3 = byteArrayInputStream7;
                    k.c.e.o.f.a(r12);
                    k.c.e.o.f.a(r3);
                    k.c.e.o.f.a(byteArrayInputStream3);
                    k.c.e.o.f.a(r2);
                    httpURLConnection.disconnect();
                    return null;
                } catch (IOException e20) {
                    iOException = e20;
                    byteArrayInputStream11 = null;
                    inputStream6 = inputStream13;
                    byteArrayInputStream15 = byteArrayInputStream11;
                    inputStream10 = inputStream6;
                    byteArrayInputStream19 = byteArrayInputStream11;
                    byteArrayInputStream3 = byteArrayInputStream15;
                    inputStream2 = inputStream10;
                    byteArrayInputStream4 = byteArrayInputStream19;
                    byteArrayInputStream5 = byteArrayInputStream15;
                    k.c.e.o.b.f16708b++;
                    Log.w("OsmDroid", "IOException downloading MapTile: " + k.c.f.m.h(j2) + " : " + iOException);
                    r12 = inputStream2;
                    r2 = byteArrayInputStream4;
                    r3 = byteArrayInputStream5;
                    k.c.e.o.f.a(r12);
                    k.c.e.o.f.a(r3);
                    k.c.e.o.f.a(byteArrayInputStream3);
                    k.c.e.o.f.a(r2);
                    httpURLConnection.disconnect();
                    return null;
                } catch (a.C0213a e21) {
                    e = e21;
                    byteArrayOutputStream = 0;
                    bufferedOutputStream = 0;
                } catch (Throwable th8) {
                    th = th8;
                    byteArrayInputStream10 = null;
                    inputStream5 = inputStream13;
                    byteArrayInputStream14 = byteArrayInputStream10;
                    inputStream9 = inputStream5;
                    byteArrayInputStream18 = byteArrayInputStream10;
                    byteArrayInputStream3 = byteArrayInputStream14;
                    inputStream = inputStream9;
                    byteArrayInputStream = byteArrayInputStream18;
                    byteArrayInputStream2 = byteArrayInputStream14;
                    k.c.e.o.b.f16708b++;
                    Log.e("OsmDroid", "Error downloading MapTile: " + k.c.f.m.h(j2), th);
                    r12 = inputStream;
                    r2 = byteArrayInputStream;
                    r3 = byteArrayInputStream2;
                    k.c.e.o.f.a(r12);
                    k.c.e.o.f.a(r3);
                    k.c.e.o.f.a(byteArrayInputStream3);
                    k.c.e.o.f.a(r2);
                    httpURLConnection.disconnect();
                    return null;
                }
            } catch (FileNotFoundException e22) {
                fileNotFoundException = e22;
                inputStream4 = null;
                byteArrayInputStream8 = null;
                byteArrayInputStream9 = null;
                byteArrayInputStream3 = null;
                httpURLConnection = null;
            } catch (UnknownHostException e23) {
                unknownHostException = e23;
                inputStream3 = null;
                byteArrayInputStream6 = null;
                byteArrayInputStream7 = null;
                byteArrayInputStream3 = null;
                httpURLConnection = null;
            } catch (IOException e24) {
                iOException = e24;
                inputStream2 = null;
                byteArrayInputStream4 = null;
                byteArrayInputStream5 = null;
                byteArrayInputStream3 = null;
                httpURLConnection = null;
            } catch (a.C0213a e25) {
                c0213a = e25;
                closeable = null;
                closeable2 = null;
                byteArrayInputStream3 = null;
                httpURLConnection = null;
            } catch (Throwable th9) {
                th = th9;
                inputStream = null;
                byteArrayInputStream = null;
                byteArrayInputStream2 = null;
                byteArrayInputStream3 = null;
                httpURLConnection = null;
            }
        } catch (Throwable th10) {
            th2 = th10;
            r1 = r12;
            closeable4 = r2;
            closeable3 = r3;
            k.c.e.o.f.a(r1);
            k.c.e.o.f.a(closeable3);
            k.c.e.o.f.a(byteArrayInputStream3);
            k.c.e.o.f.a(closeable4);
            httpURLConnection.disconnect();
            throw th2;
        }
    }

    /* compiled from: TileDownloader.java */
    private static class a extends SSLSocketFactory {
        SSLSocketFactory a;

        a(SSLSocketFactory sSLSocketFactory) {
            this.a = sSLSocketFactory;
        }

        private SSLSocket a(SSLSocket sSLSocket) {
            String[] supportedProtocols = sSLSocket.getSupportedProtocols();
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            if (Arrays.binarySearch(supportedProtocols, "TLSv1.2") >= 0) {
                enabledProtocols = new String[]{"TLSv1.2"};
            } else {
                int iBinarySearch = Arrays.binarySearch(enabledProtocols, "SSLv3");
                if (iBinarySearch >= 0) {
                    int length = enabledProtocols.length - 1;
                    String[] strArr = new String[length];
                    System.arraycopy(enabledProtocols, 0, strArr, 0, iBinarySearch);
                    if (length > iBinarySearch) {
                        System.arraycopy(enabledProtocols, iBinarySearch + 1, strArr, iBinarySearch, length - iBinarySearch);
                    }
                    enabledProtocols = strArr;
                }
            }
            sSLSocket.setEnabledProtocols(enabledProtocols);
            return sSLSocket;
        }

        @Override // javax.net.SocketFactory
        public Socket createSocket() {
            return a((SSLSocket) this.a.createSocket());
        }

        @Override // javax.net.ssl.SSLSocketFactory
        public String[] getDefaultCipherSuites() {
            return this.a.getDefaultCipherSuites();
        }

        @Override // javax.net.ssl.SSLSocketFactory
        public String[] getSupportedCipherSuites() {
            return this.a.getSupportedCipherSuites();
        }

        @Override // javax.net.ssl.SSLSocketFactory
        public Socket createSocket(Socket socket, String str, int i2, boolean z) {
            return a((SSLSocket) this.a.createSocket(socket, str, i2, z));
        }

        @Override // javax.net.SocketFactory
        public Socket createSocket(String str, int i2) {
            return a((SSLSocket) this.a.createSocket(str, i2));
        }

        @Override // javax.net.SocketFactory
        public Socket createSocket(String str, int i2, InetAddress inetAddress, int i3) {
            return a((SSLSocket) this.a.createSocket(str, i2, inetAddress, i3));
        }

        @Override // javax.net.SocketFactory
        public Socket createSocket(InetAddress inetAddress, int i2) {
            return a((SSLSocket) this.a.createSocket(inetAddress, i2));
        }

        @Override // javax.net.SocketFactory
        public Socket createSocket(InetAddress inetAddress, int i2, InetAddress inetAddress2, int i3) {
            return a((SSLSocket) this.a.createSocket(inetAddress, i2, inetAddress2, i3));
        }
    }
}