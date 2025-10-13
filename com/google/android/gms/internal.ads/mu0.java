package com.google.android.gms.internal.ads;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class mu0 {
    private final Map<String, String> a = new ConcurrentHashMap();

    /* renamed from: b */
    final /* synthetic */ nu0 f7553b;

    mu0(nu0 nu0Var) {
        this.f7553b = nu0Var;
    }

    static /* synthetic */ mu0 g(mu0 mu0Var) {
        mu0Var.a.putAll(mu0Var.f7553b.f7800c);
        return mu0Var;
    }

    public final mu0 a(ap1 ap1Var) {
        this.a.put("gqi", ap1Var.f4967b);
        return this;
    }

    public final mu0 b(xo1 xo1Var) {
        this.a.put("aai", xo1Var.v);
        return this;
    }

    public final mu0 c(String str, String str2) {
        this.a.put(str, str2);
        return this;
    }

    public final void d() {
        this.f7553b.f7799b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.lu0

            /* renamed from: e, reason: collision with root package name */
            private final mu0 f7312e;

            {
                this.f7312e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f7312e.f();
            }
        });
    }

    public final String e() {
        return this.f7553b.a.b(this.a);
    }

    final /* synthetic */ void f() {
        this.f7553b.a.a(this.a);
    }
}