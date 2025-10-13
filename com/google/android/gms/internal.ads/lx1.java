package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class lx1 {
    private static volatile rg0 a = rg0.UNKNOWN;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f7350b = 0;

    /* renamed from: c, reason: collision with root package name */
    private final Context f7351c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f7352d;

    /* renamed from: e, reason: collision with root package name */
    private final e.c.b.b.e.h<vz1> f7353e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f7354f;

    lx1(Context context, Executor executor, e.c.b.b.e.h<vz1> hVar, boolean z) {
        this.f7351c = context;
        this.f7352d = executor;
        this.f7353e = hVar;
        this.f7354f = z;
    }

    static void a(rg0 rg0Var) {
        a = rg0Var;
    }

    public static lx1 b(final Context context, Executor executor, boolean z) {
        return new lx1(context, executor, e.c.b.b.e.k.b(executor, new Callable(context) { // from class: com.google.android.gms.internal.ads.ix1
            private final Context a;

            {
                this.a = context;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new vz1(this.a, "GLAS", null);
            }
        }), z);
    }

    private final e.c.b.b.e.h<Boolean> h(final int i2, long j2, Exception exc, String str, Map<String, String> map, String str2) {
        if (!this.f7354f) {
            return this.f7353e.g(this.f7352d, jx1.a);
        }
        final lb0 lb0VarD = sh0.D();
        lb0VarD.q(this.f7351c.getPackageName());
        lb0VarD.r(j2);
        lb0VarD.w(a);
        if (exc != null) {
            lb0VarD.s(q12.b(exc));
            lb0VarD.t(exc.getClass().getName());
        }
        if (str2 != null) {
            lb0VarD.u(str2);
        }
        if (str != null) {
            lb0VarD.v(str);
        }
        return this.f7353e.g(this.f7352d, new e.c.b.b.e.a(lb0VarD, i2) { // from class: com.google.android.gms.internal.ads.kx1
            private final lb0 a;

            /* renamed from: b, reason: collision with root package name */
            private final int f7120b;

            {
                this.a = lb0VarD;
                this.f7120b = i2;
            }

            @Override // e.c.b.b.e.a
            public final Object a(e.c.b.b.e.h hVar) {
                lb0 lb0Var = this.a;
                int i3 = this.f7120b;
                int i4 = lx1.f7350b;
                if (!hVar.n()) {
                    return Boolean.FALSE;
                }
                tz1 tz1VarA = ((vz1) hVar.k()).a(lb0Var.n().i());
                tz1VarA.c(i3);
                tz1VarA.a();
                return Boolean.TRUE;
            }
        });
    }

    public final e.c.b.b.e.h<Boolean> c(int i2, long j2) {
        return h(i2, j2, null, null, null, null);
    }

    public final e.c.b.b.e.h<Boolean> d(int i2, long j2, Exception exc) {
        return h(i2, j2, exc, null, null, null);
    }

    public final e.c.b.b.e.h<Boolean> e(int i2, long j2, String str, Map<String, String> map) {
        return h(i2, j2, null, str, null, null);
    }

    public final e.c.b.b.e.h<Boolean> f(int i2, String str) {
        return h(i2, 0L, null, null, null, str);
    }

    public final e.c.b.b.e.h<Boolean> g(int i2, long j2, String str) {
        return h(i2, j2, null, null, null, str);
    }
}