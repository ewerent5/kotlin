package com.bumptech.glide.load.o;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* compiled from: GlideUrl.java */
/* loaded from: classes.dex */
public class g implements com.bumptech.glide.load.g {

    /* renamed from: b, reason: collision with root package name */
    private final h f3887b;

    /* renamed from: c, reason: collision with root package name */
    private final URL f3888c;

    /* renamed from: d, reason: collision with root package name */
    private final String f3889d;

    /* renamed from: e, reason: collision with root package name */
    private String f3890e;

    /* renamed from: f, reason: collision with root package name */
    private URL f3891f;

    /* renamed from: g, reason: collision with root package name */
    private volatile byte[] f3892g;

    /* renamed from: h, reason: collision with root package name */
    private int f3893h;

    public g(URL url) {
        this(url, h.f3894b);
    }

    private byte[] d() {
        if (this.f3892g == null) {
            this.f3892g = c().getBytes(com.bumptech.glide.load.g.a);
        }
        return this.f3892g;
    }

    private String f() {
        if (TextUtils.isEmpty(this.f3890e)) {
            String string = this.f3889d;
            if (TextUtils.isEmpty(string)) {
                string = ((URL) com.bumptech.glide.t.j.d(this.f3888c)).toString();
            }
            this.f3890e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f3890e;
    }

    private URL g() {
        if (this.f3891f == null) {
            this.f3891f = new URL(f());
        }
        return this.f3891f;
    }

    @Override // com.bumptech.glide.load.g
    public void a(MessageDigest messageDigest) {
        messageDigest.update(d());
    }

    public String c() {
        String str = this.f3889d;
        return str != null ? str : ((URL) com.bumptech.glide.t.j.d(this.f3888c)).toString();
    }

    public Map<String, String> e() {
        return this.f3887b.a();
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return c().equals(gVar.c()) && this.f3887b.equals(gVar.f3887b);
    }

    public URL h() {
        return g();
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        if (this.f3893h == 0) {
            int iHashCode = c().hashCode();
            this.f3893h = iHashCode;
            this.f3893h = (iHashCode * 31) + this.f3887b.hashCode();
        }
        return this.f3893h;
    }

    public String toString() {
        return c();
    }

    public g(String str) {
        this(str, h.f3894b);
    }

    public g(URL url, h hVar) {
        this.f3888c = (URL) com.bumptech.glide.t.j.d(url);
        this.f3889d = null;
        this.f3887b = (h) com.bumptech.glide.t.j.d(hVar);
    }

    public g(String str, h hVar) {
        this.f3888c = null;
        this.f3889d = com.bumptech.glide.t.j.b(str);
        this.f3887b = (h) com.bumptech.glide.t.j.d(hVar);
    }
}