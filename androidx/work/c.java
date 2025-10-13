package androidx.work;

import android.os.Build;

/* compiled from: Constraints.java */
/* loaded from: classes.dex */
public final class c {
    public static final c a = new a().a();

    /* renamed from: b, reason: collision with root package name */
    private i f2106b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2107c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f2108d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f2109e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f2110f;

    /* renamed from: g, reason: collision with root package name */
    private long f2111g;

    /* renamed from: h, reason: collision with root package name */
    private long f2112h;

    /* renamed from: i, reason: collision with root package name */
    private d f2113i;

    /* compiled from: Constraints.java */
    public static final class a {
        boolean a = false;

        /* renamed from: b, reason: collision with root package name */
        boolean f2114b = false;

        /* renamed from: c, reason: collision with root package name */
        i f2115c = i.NOT_REQUIRED;

        /* renamed from: d, reason: collision with root package name */
        boolean f2116d = false;

        /* renamed from: e, reason: collision with root package name */
        boolean f2117e = false;

        /* renamed from: f, reason: collision with root package name */
        long f2118f = -1;

        /* renamed from: g, reason: collision with root package name */
        long f2119g = -1;

        /* renamed from: h, reason: collision with root package name */
        d f2120h = new d();

        public c a() {
            return new c(this);
        }

        public a b(i iVar) {
            this.f2115c = iVar;
            return this;
        }
    }

    public c() {
        this.f2106b = i.NOT_REQUIRED;
        this.f2111g = -1L;
        this.f2112h = -1L;
        this.f2113i = new d();
    }

    public d a() {
        return this.f2113i;
    }

    public i b() {
        return this.f2106b;
    }

    public long c() {
        return this.f2111g;
    }

    public long d() {
        return this.f2112h;
    }

    public boolean e() {
        return this.f2113i.c() > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f2107c == cVar.f2107c && this.f2108d == cVar.f2108d && this.f2109e == cVar.f2109e && this.f2110f == cVar.f2110f && this.f2111g == cVar.f2111g && this.f2112h == cVar.f2112h && this.f2106b == cVar.f2106b) {
            return this.f2113i.equals(cVar.f2113i);
        }
        return false;
    }

    public boolean f() {
        return this.f2109e;
    }

    public boolean g() {
        return this.f2107c;
    }

    public boolean h() {
        return this.f2108d;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f2106b.hashCode() * 31) + (this.f2107c ? 1 : 0)) * 31) + (this.f2108d ? 1 : 0)) * 31) + (this.f2109e ? 1 : 0)) * 31) + (this.f2110f ? 1 : 0)) * 31;
        long j2 = this.f2111g;
        int i2 = (iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f2112h;
        return ((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.f2113i.hashCode();
    }

    public boolean i() {
        return this.f2110f;
    }

    public void j(d dVar) {
        this.f2113i = dVar;
    }

    public void k(i iVar) {
        this.f2106b = iVar;
    }

    public void l(boolean z) {
        this.f2109e = z;
    }

    public void m(boolean z) {
        this.f2107c = z;
    }

    public void n(boolean z) {
        this.f2108d = z;
    }

    public void o(boolean z) {
        this.f2110f = z;
    }

    public void p(long j2) {
        this.f2111g = j2;
    }

    public void q(long j2) {
        this.f2112h = j2;
    }

    c(a aVar) {
        this.f2106b = i.NOT_REQUIRED;
        this.f2111g = -1L;
        this.f2112h = -1L;
        this.f2113i = new d();
        this.f2107c = aVar.a;
        int i2 = Build.VERSION.SDK_INT;
        this.f2108d = i2 >= 23 && aVar.f2114b;
        this.f2106b = aVar.f2115c;
        this.f2109e = aVar.f2116d;
        this.f2110f = aVar.f2117e;
        if (i2 >= 24) {
            this.f2113i = aVar.f2120h;
            this.f2111g = aVar.f2118f;
            this.f2112h = aVar.f2119g;
        }
    }

    public c(c cVar) {
        this.f2106b = i.NOT_REQUIRED;
        this.f2111g = -1L;
        this.f2112h = -1L;
        this.f2113i = new d();
        this.f2107c = cVar.f2107c;
        this.f2108d = cVar.f2108d;
        this.f2106b = cVar.f2106b;
        this.f2109e = cVar.f2109e;
        this.f2110f = cVar.f2110f;
        this.f2113i = cVar.f2113i;
    }
}