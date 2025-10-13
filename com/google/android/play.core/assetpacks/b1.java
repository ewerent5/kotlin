package com.google.android.play.core.assetpacks;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class b1 implements e.c.b.d.a.b.h0<a1> {
    private final e.c.b.d.a.b.h0 a;

    /* renamed from: b, reason: collision with root package name */
    private final e.c.b.d.a.b.h0 f11946b;

    /* renamed from: c, reason: collision with root package name */
    private final e.c.b.d.a.b.h0 f11947c;

    /* renamed from: d, reason: collision with root package name */
    private final e.c.b.d.a.b.h0 f11948d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f11949e = 0;

    public b1(e.c.b.d.a.b.h0<v> h0Var, e.c.b.d.a.b.h0<s2> h0Var2, e.c.b.d.a.b.h0<o0> h0Var3, e.c.b.d.a.b.h0<Executor> h0Var4) {
        this.a = h0Var;
        this.f11946b = h0Var2;
        this.f11947c = h0Var3;
        this.f11948d = h0Var4;
    }

    public b1(e.c.b.d.a.b.h0<v> h0Var, e.c.b.d.a.b.h0<s2> h0Var2, e.c.b.d.a.b.h0<s> h0Var3, e.c.b.d.a.b.h0<o0> h0Var4, byte[] bArr) {
        this.a = h0Var;
        this.f11946b = h0Var2;
        this.f11947c = h0Var3;
        this.f11948d = h0Var4;
    }

    public b1(e.c.b.d.a.b.h0<a1> h0Var, e.c.b.d.a.b.h0<v> h0Var2, e.c.b.d.a.b.h0<c0> h0Var3, e.c.b.d.a.b.h0<com.google.android.play.core.common.c> h0Var4, char[] cArr) {
        this.f11947c = h0Var;
        this.f11946b = h0Var2;
        this.a = h0Var3;
        this.f11948d = h0Var4;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.android.play.core.assetpacks.a1, com.google.android.play.core.assetpacks.j0] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.google.android.play.core.assetpacks.a1, com.google.android.play.core.assetpacks.d1] */
    @Override // e.c.b.d.a.b.h0
    public final /* bridge */ /* synthetic */ a1 a() {
        int i2 = this.f11949e;
        if (i2 == 0) {
            Object objA = this.a.a();
            return new a1((v) objA, e.c.b.d.a.b.g0.c(this.f11946b), (o0) this.f11947c.a(), e.c.b.d.a.b.g0.c(this.f11948d));
        }
        if (i2 == 1) {
            return new j0((v) this.a.a(), e.c.b.d.a.b.g0.c(this.f11946b), e.c.b.d.a.b.g0.c(this.f11947c), (o0) this.f11948d.a());
        }
        Object objA2 = this.f11947c.a();
        Object objA3 = this.f11946b.a();
        return new d1((a1) objA2, (v) objA3, (c0) this.a.a(), (com.google.android.play.core.common.c) this.f11948d.a());
    }
}