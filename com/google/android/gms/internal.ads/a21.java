package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class a21 {
    private int a = 0;

    /* renamed from: b, reason: collision with root package name */
    private long f4815b = 0;

    /* renamed from: c, reason: collision with root package name */
    private long f4816c = 0;

    /* renamed from: d, reason: collision with root package name */
    private long f4817d = 0;

    /* renamed from: e, reason: collision with root package name */
    private final Object f4818e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private final Object f4819f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private final Object f4820g = new Object();

    /* renamed from: h, reason: collision with root package name */
    private final Object f4821h = new Object();

    public final void a(int i2) {
        synchronized (this.f4818e) {
            this.a = i2;
        }
    }

    public final int b() {
        int i2;
        synchronized (this.f4818e) {
            i2 = this.a;
        }
        return i2;
    }

    public final void c(long j2) {
        synchronized (this.f4819f) {
            this.f4815b = j2;
        }
    }

    public final long d() {
        long j2;
        synchronized (this.f4819f) {
            j2 = this.f4815b;
        }
        return j2;
    }

    public final synchronized void e(long j2) {
        synchronized (this.f4820g) {
            this.f4816c = j2;
        }
    }

    public final synchronized long f() {
        long j2;
        synchronized (this.f4820g) {
            j2 = this.f4816c;
        }
        return j2;
    }

    public final synchronized void g(long j2) {
        synchronized (this.f4821h) {
            this.f4817d = j2;
        }
    }

    public final synchronized long h() {
        long j2;
        synchronized (this.f4821h) {
            j2 = this.f4817d;
        }
        return j2;
    }
}