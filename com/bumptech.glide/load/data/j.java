package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* compiled from: HttpUrlFetcher.java */
/* loaded from: classes.dex */
public class j implements d<InputStream> {

    /* renamed from: e, reason: collision with root package name */
    static final b f3604e = new a();

    /* renamed from: f, reason: collision with root package name */
    private final com.bumptech.glide.load.o.g f3605f;

    /* renamed from: g, reason: collision with root package name */
    private final int f3606g;

    /* renamed from: h, reason: collision with root package name */
    private final b f3607h;

    /* renamed from: i, reason: collision with root package name */
    private HttpURLConnection f3608i;

    /* renamed from: j, reason: collision with root package name */
    private InputStream f3609j;

    /* renamed from: k, reason: collision with root package name */
    private volatile boolean f3610k;

    /* compiled from: HttpUrlFetcher.java */
    private static class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.load.data.j.b
        public HttpURLConnection a(URL url) {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* compiled from: HttpUrlFetcher.java */
    interface b {
        HttpURLConnection a(URL url);
    }

    public j(com.bumptech.glide.load.o.g gVar, int i2) {
        this(gVar, i2, f3604e);
    }

    private HttpURLConnection c(URL url, Map<String, String> map) throws com.bumptech.glide.load.e {
        try {
            HttpURLConnection httpURLConnectionA = this.f3607h.a(url);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnectionA.addRequestProperty(entry.getKey(), entry.getValue());
            }
            httpURLConnectionA.setConnectTimeout(this.f3606g);
            httpURLConnectionA.setReadTimeout(this.f3606g);
            httpURLConnectionA.setUseCaches(false);
            httpURLConnectionA.setDoInput(true);
            httpURLConnectionA.setInstanceFollowRedirects(false);
            return httpURLConnectionA;
        } catch (IOException e2) {
            throw new com.bumptech.glide.load.e("URL.openConnection threw", 0, e2);
        }
    }

    private static int f(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e2) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e2);
            return -1;
        }
    }

    private InputStream g(HttpURLConnection httpURLConnection) throws com.bumptech.glide.load.e {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f3609j = com.bumptech.glide.t.c.c(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
                }
                this.f3609j = httpURLConnection.getInputStream();
            }
            return this.f3609j;
        } catch (IOException e2) {
            throw new com.bumptech.glide.load.e("Failed to obtain InputStream", f(httpURLConnection), e2);
        }
    }

    private static boolean h(int i2) {
        return i2 / 100 == 2;
    }

    private static boolean i(int i2) {
        return i2 / 100 == 3;
    }

    private InputStream j(URL url, int i2, URL url2, Map<String, String> map) throws IOException {
        if (i2 >= 5) {
            throw new com.bumptech.glide.load.e("Too many (> 5) redirects!", -1);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new com.bumptech.glide.load.e("In re-direct loop", -1);
                }
            } catch (URISyntaxException unused) {
            }
        }
        HttpURLConnection httpURLConnectionC = c(url, map);
        this.f3608i = httpURLConnectionC;
        try {
            httpURLConnectionC.connect();
            this.f3609j = this.f3608i.getInputStream();
            if (this.f3610k) {
                return null;
            }
            int iF = f(this.f3608i);
            if (h(iF)) {
                return g(this.f3608i);
            }
            if (!i(iF)) {
                if (iF == -1) {
                    throw new com.bumptech.glide.load.e(iF);
                }
                try {
                    throw new com.bumptech.glide.load.e(this.f3608i.getResponseMessage(), iF);
                } catch (IOException e2) {
                    throw new com.bumptech.glide.load.e("Failed to get a response message", iF, e2);
                }
            }
            String headerField = this.f3608i.getHeaderField("Location");
            if (TextUtils.isEmpty(headerField)) {
                throw new com.bumptech.glide.load.e("Received empty or null redirect url", iF);
            }
            try {
                URL url3 = new URL(url, headerField);
                b();
                return j(url3, i2 + 1, url, map);
            } catch (MalformedURLException e3) {
                throw new com.bumptech.glide.load.e("Bad redirect url: " + headerField, iF, e3);
            }
        } catch (IOException e4) {
            throw new com.bumptech.glide.load.e("Failed to connect or obtain data", f(this.f3608i), e4);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() throws IOException {
        InputStream inputStream = this.f3609j;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f3608i;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f3608i = null;
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
        this.f3610k = true;
    }

    @Override // com.bumptech.glide.load.data.d
    public com.bumptech.glide.load.a d() {
        return com.bumptech.glide.load.a.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.d
    public void e(com.bumptech.glide.g gVar, d.a<? super InputStream> aVar) {
        StringBuilder sb;
        long jB = com.bumptech.glide.t.f.b();
        try {
            try {
                aVar.f(j(this.f3605f.h(), 0, null, this.f3605f.e()));
            } catch (IOException e2) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e2);
                }
                aVar.c(e2);
                if (!Log.isLoggable("HttpUrlFetcher", 2)) {
                    return;
                } else {
                    sb = new StringBuilder();
                }
            }
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
                sb.append("Finished http url fetcher fetch in ");
                sb.append(com.bumptech.glide.t.f.a(jB));
                Log.v("HttpUrlFetcher", sb.toString());
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + com.bumptech.glide.t.f.a(jB));
            }
            throw th;
        }
    }

    j(com.bumptech.glide.load.o.g gVar, int i2, b bVar) {
        this.f3605f = gVar;
        this.f3606g = i2;
        this.f3607h = bVar;
    }
}