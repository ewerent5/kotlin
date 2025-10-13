package com.google.android.gms.internal.ads;

import java.net.HttpURLConnection;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class g02 extends zz1 {

    /* renamed from: e, reason: collision with root package name */
    private p12<Integer> f5999e;

    /* renamed from: f, reason: collision with root package name */
    private p12<Integer> f6000f;

    /* renamed from: g, reason: collision with root package name */
    private f02 f6001g;

    /* renamed from: h, reason: collision with root package name */
    private HttpURLConnection f6002h;

    g02() {
        p12<Integer> p12Var = b02.a;
        p12<Integer> p12Var2 = c02.a;
        this.f5999e = p12Var;
        this.f6000f = p12Var2;
        this.f6001g = null;
    }

    public final HttpURLConnection c(f02 f02Var, int i2, int i3) {
        final int i4 = 265;
        this.f5999e = new p12(i4) { // from class: com.google.android.gms.internal.ads.d02
            @Override // com.google.android.gms.internal.ads.p12
            public final Object zza() {
                return 265;
            }
        };
        final int i5 = -1;
        this.f6000f = new p12(i5) { // from class: com.google.android.gms.internal.ads.e02
            @Override // com.google.android.gms.internal.ads.p12
            public final Object zza() {
                return -1;
            }
        };
        this.f6001g = f02Var;
        a02.a(this.f5999e.zza().intValue(), this.f6000f.zza().intValue());
        f02 f02Var2 = this.f6001g;
        Objects.requireNonNull(f02Var2);
        HttpURLConnection httpURLConnection = (HttpURLConnection) f02Var2.zza();
        this.f6002h = httpURLConnection;
        return httpURLConnection;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        HttpURLConnection httpURLConnection = this.f6002h;
        a02.b();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }
}