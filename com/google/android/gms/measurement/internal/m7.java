package com.google.android.gms.measurement.internal;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class m7 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final URL f11032e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f11033f;

    /* renamed from: g, reason: collision with root package name */
    private final j7 f11034g;

    /* renamed from: h, reason: collision with root package name */
    private final String f11035h;

    /* renamed from: i, reason: collision with root package name */
    private final Map<String, String> f11036i;

    /* renamed from: j, reason: collision with root package name */
    private final /* synthetic */ k7 f11037j;

    public m7(k7 k7Var, String str, URL url, byte[] bArr, Map<String, String> map, j7 j7Var) {
        this.f11037j = k7Var;
        com.google.android.gms.common.internal.p.f(str);
        com.google.android.gms.common.internal.p.j(url);
        com.google.android.gms.common.internal.p.j(j7Var);
        this.f11032e = url;
        this.f11033f = null;
        this.f11034g = j7Var;
        this.f11035h = str;
        this.f11036i = null;
    }

    private final void b(final int i2, final Exception exc, final byte[] bArr, final Map<String, List<String>> map) {
        this.f11037j.zzp().u(new Runnable(this, i2, exc, bArr, map) { // from class: com.google.android.gms.measurement.internal.l7

            /* renamed from: e, reason: collision with root package name */
            private final m7 f11008e;

            /* renamed from: f, reason: collision with root package name */
            private final int f11009f;

            /* renamed from: g, reason: collision with root package name */
            private final Exception f11010g;

            /* renamed from: h, reason: collision with root package name */
            private final byte[] f11011h;

            /* renamed from: i, reason: collision with root package name */
            private final Map f11012i;

            {
                this.f11008e = this;
                this.f11009f = i2;
                this.f11010g = exc;
                this.f11011h = bArr;
                this.f11012i = map;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f11008e.a(this.f11009f, this.f11010g, this.f11011h, this.f11012i);
            }
        });
    }

    final /* synthetic */ void a(int i2, Exception exc, byte[] bArr, Map map) {
        this.f11034g.a(this.f11035h, i2, exc, bArr, map);
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnectionP;
        Map<String, List<String>> headerFields;
        this.f11037j.c();
        int responseCode = 0;
        try {
            httpURLConnectionP = this.f11037j.p(this.f11032e);
            try {
                responseCode = httpURLConnectionP.getResponseCode();
                headerFields = httpURLConnectionP.getHeaderFields();
            } catch (IOException e2) {
                e = e2;
                headerFields = null;
            } catch (Throwable th) {
                th = th;
                headerFields = null;
            }
            try {
                k7 k7Var = this.f11037j;
                byte[] bArrR = k7.r(httpURLConnectionP);
                httpURLConnectionP.disconnect();
                b(responseCode, null, bArrR, headerFields);
            } catch (IOException e3) {
                e = e3;
                if (httpURLConnectionP != null) {
                    httpURLConnectionP.disconnect();
                }
                b(responseCode, e, null, headerFields);
            } catch (Throwable th2) {
                th = th2;
                if (httpURLConnectionP != null) {
                    httpURLConnectionP.disconnect();
                }
                b(responseCode, null, null, headerFields);
                throw th;
            }
        } catch (IOException e4) {
            e = e4;
            httpURLConnectionP = null;
            headerFields = null;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnectionP = null;
            headerFields = null;
        }
    }
}