package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class o3<V> {
    private static final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final String f11072b;

    /* renamed from: c, reason: collision with root package name */
    private final m3<V> f11073c;

    /* renamed from: d, reason: collision with root package name */
    private final V f11074d;

    /* renamed from: e, reason: collision with root package name */
    private final V f11075e;

    /* renamed from: f, reason: collision with root package name */
    private final Object f11076f;

    /* renamed from: g, reason: collision with root package name */
    private volatile V f11077g;

    /* renamed from: h, reason: collision with root package name */
    private volatile V f11078h;

    private o3(String str, V v, V v2, m3<V> m3Var) {
        this.f11076f = new Object();
        this.f11077g = null;
        this.f11078h = null;
        this.f11072b = str;
        this.f11074d = v;
        this.f11075e = v2;
        this.f11073c = m3Var;
    }

    public final V a(V v) {
        synchronized (this.f11076f) {
        }
        if (v != null) {
            return v;
        }
        if (l3.a == null) {
            return this.f11074d;
        }
        synchronized (a) {
            if (ta.a()) {
                return this.f11078h == null ? this.f11074d : this.f11078h;
            }
            try {
                for (o3 o3Var : t.a) {
                    if (ta.a()) {
                        throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                    }
                    V vZza = null;
                    try {
                        m3<V> m3Var = o3Var.f11073c;
                        if (m3Var != null) {
                            vZza = m3Var.zza();
                        }
                    } catch (IllegalStateException unused) {
                    }
                    synchronized (a) {
                        o3Var.f11078h = vZza;
                    }
                }
            } catch (SecurityException unused2) {
            }
            m3<V> m3Var2 = this.f11073c;
            if (m3Var2 == null) {
                return this.f11074d;
            }
            try {
                return m3Var2.zza();
            } catch (IllegalStateException unused3) {
                return this.f11074d;
            } catch (SecurityException unused4) {
                return this.f11074d;
            }
        }
    }

    public final String b() {
        return this.f11072b;
    }
}