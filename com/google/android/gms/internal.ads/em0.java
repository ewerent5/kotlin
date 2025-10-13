package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class em0 {
    r7 a;

    /* renamed from: b, reason: collision with root package name */
    o7 f5663b;

    /* renamed from: c, reason: collision with root package name */
    e8 f5664c;

    /* renamed from: d, reason: collision with root package name */
    b8 f5665d;

    /* renamed from: e, reason: collision with root package name */
    tc f5666e;

    /* renamed from: f, reason: collision with root package name */
    final c.e.g<String, x7> f5667f = new c.e.g<>();

    /* renamed from: g, reason: collision with root package name */
    final c.e.g<String, u7> f5668g = new c.e.g<>();

    public final em0 a(r7 r7Var) {
        this.a = r7Var;
        return this;
    }

    public final em0 b(o7 o7Var) {
        this.f5663b = o7Var;
        return this;
    }

    public final em0 c(e8 e8Var) {
        this.f5664c = e8Var;
        return this;
    }

    public final em0 d(b8 b8Var) {
        this.f5665d = b8Var;
        return this;
    }

    public final em0 e(tc tcVar) {
        this.f5666e = tcVar;
        return this;
    }

    public final em0 f(String str, x7 x7Var, u7 u7Var) {
        this.f5667f.put(str, x7Var);
        if (u7Var != null) {
            this.f5668g.put(str, u7Var);
        }
        return this;
    }

    public final fm0 g() {
        return new fm0(this);
    }
}