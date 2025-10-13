package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class it1<O> {
    private final Object a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6596b;

    /* renamed from: c, reason: collision with root package name */
    private final g52<?> f6597c;

    /* renamed from: d, reason: collision with root package name */
    private final List<g52<?>> f6598d;

    /* renamed from: e, reason: collision with root package name */
    private final g52<O> f6599e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ jt1 f6600f;

    private it1(jt1 jt1Var, jt1 jt1Var2, String str, g52 g52Var, List<g52> list, g52<O> g52Var2) {
        this.f6600f = jt1Var;
        this.a = jt1Var2;
        this.f6596b = str;
        this.f6597c = g52Var;
        this.f6598d = list;
        this.f6599e = g52Var2;
    }

    public final it1<O> a(String str) {
        return new it1<>(this.f6600f, this.a, str, this.f6597c, this.f6598d, this.f6599e);
    }

    public final <O2> it1<O2> b(final vs1<O, O2> vs1Var) {
        return c(new e42(vs1Var) { // from class: com.google.android.gms.internal.ads.dt1
            private final vs1 a;

            {
                this.a = vs1Var;
            }

            @Override // com.google.android.gms.internal.ads.e42
            public final g52 zza(Object obj) {
                return y42.a(this.a.zza(obj));
            }
        });
    }

    public final <O2> it1<O2> c(e42<O, O2> e42Var) {
        return d(e42Var, this.f6600f.f6842b);
    }

    public final <O2> it1<O2> d(e42<O, O2> e42Var, Executor executor) {
        return new it1<>(this.f6600f, this.a, this.f6596b, this.f6597c, this.f6598d, y42.h(this.f6599e, e42Var, executor));
    }

    public final <O2> it1<O2> e(final g52<O2> g52Var) {
        return d(new e42(g52Var) { // from class: com.google.android.gms.internal.ads.et1
            private final g52 a;

            {
                this.a = g52Var;
            }

            @Override // com.google.android.gms.internal.ads.e42
            public final g52 zza(Object obj) {
                return this.a;
            }
        }, qr.f8451f);
    }

    public final <T extends Throwable> it1<O> f(Class<T> cls, final vs1<T, O> vs1Var) {
        return g(cls, new e42(vs1Var) { // from class: com.google.android.gms.internal.ads.ft1
            private final vs1 a;

            {
                this.a = vs1Var;
            }

            @Override // com.google.android.gms.internal.ads.e42
            public final g52 zza(Object obj) {
                return y42.a("");
            }
        });
    }

    public final <T extends Throwable> it1<O> g(Class<T> cls, e42<T, O> e42Var) {
        jt1 jt1Var = this.f6600f;
        return new it1<>(jt1Var, this.a, this.f6596b, this.f6597c, this.f6598d, y42.f(this.f6599e, cls, e42Var, jt1Var.f6842b));
    }

    public final it1<O> h(long j2, TimeUnit timeUnit) {
        jt1 jt1Var = this.f6600f;
        return new it1<>(jt1Var, this.a, this.f6596b, this.f6597c, this.f6598d, y42.g(this.f6599e, j2, timeUnit, jt1Var.f6843c));
    }

    public final xs1 i() {
        Object obj = this.a;
        String strC = this.f6596b;
        if (strC == null) {
            strC = this.f6600f.c(obj);
        }
        final xs1 xs1Var = new xs1(obj, strC, this.f6599e);
        this.f6600f.f6844d.A(xs1Var);
        g52<?> g52Var = this.f6597c;
        Runnable runnable = new Runnable(this, xs1Var) { // from class: com.google.android.gms.internal.ads.gt1

            /* renamed from: e, reason: collision with root package name */
            private final it1 f6176e;

            /* renamed from: f, reason: collision with root package name */
            private final xs1 f6177f;

            {
                this.f6176e = this;
                this.f6177f = xs1Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                it1 it1Var = this.f6176e;
                it1Var.f6600f.f6844d.o(this.f6177f);
            }
        };
        h52 h52Var = qr.f8451f;
        g52Var.zze(runnable, h52Var);
        y42.o(xs1Var, new ht1(this, xs1Var), h52Var);
        return xs1Var;
    }

    public final it1<O> j(Object obj) {
        return this.f6600f.a(obj, i());
    }
}