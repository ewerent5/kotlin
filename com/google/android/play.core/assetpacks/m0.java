package com.google.android.play.core.assetpacks;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class m0 implements e.c.b.d.a.b.h0<l0> {
    private final e.c.b.d.a.b.h0 a;

    /* renamed from: b, reason: collision with root package name */
    private final e.c.b.d.a.b.h0 f12077b;

    /* renamed from: c, reason: collision with root package name */
    private final e.c.b.d.a.b.h0 f12078c;

    /* renamed from: d, reason: collision with root package name */
    private final e.c.b.d.a.b.h0 f12079d;

    /* renamed from: e, reason: collision with root package name */
    private final e.c.b.d.a.b.h0 f12080e;

    /* renamed from: f, reason: collision with root package name */
    private final e.c.b.d.a.b.h0 f12081f;

    /* renamed from: g, reason: collision with root package name */
    private final e.c.b.d.a.b.h0 f12082g;

    /* renamed from: h, reason: collision with root package name */
    private final e.c.b.d.a.b.h0 f12083h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ int f12084i = 0;

    public m0(e.c.b.d.a.b.h0<a1> h0Var, e.c.b.d.a.b.h0<s2> h0Var2, e.c.b.d.a.b.h0<j0> h0Var3, e.c.b.d.a.b.h0<b2> h0Var4, e.c.b.d.a.b.h0<m1> h0Var5, e.c.b.d.a.b.h0<r1> h0Var6, e.c.b.d.a.b.h0<v1> h0Var7, e.c.b.d.a.b.h0<d1> h0Var8) {
        this.a = h0Var;
        this.f12077b = h0Var2;
        this.f12078c = h0Var3;
        this.f12079d = h0Var4;
        this.f12080e = h0Var5;
        this.f12081f = h0Var6;
        this.f12082g = h0Var7;
        this.f12083h = h0Var8;
    }

    public m0(e.c.b.d.a.b.h0<Context> h0Var, e.c.b.d.a.b.h0<a1> h0Var2, e.c.b.d.a.b.h0<l0> h0Var3, e.c.b.d.a.b.h0<s2> h0Var4, e.c.b.d.a.b.h0<o0> h0Var5, e.c.b.d.a.b.h0<e0> h0Var6, e.c.b.d.a.b.h0<Executor> h0Var7, e.c.b.d.a.b.h0<Executor> h0Var8, byte[] bArr) {
        this.a = h0Var;
        this.f12082g = h0Var2;
        this.f12083h = h0Var3;
        this.f12077b = h0Var4;
        this.f12080e = h0Var5;
        this.f12081f = h0Var6;
        this.f12078c = h0Var7;
        this.f12079d = h0Var8;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [com.google.android.play.core.assetpacks.l0, com.google.android.play.core.assetpacks.s] */
    @Override // e.c.b.d.a.b.h0
    public final /* bridge */ /* synthetic */ l0 a() {
        if (this.f12084i == 0) {
            Object objA = this.a.a();
            return new l0((a1) objA, e.c.b.d.a.b.g0.c(this.f12077b), (j0) this.f12078c.a(), (b2) this.f12079d.a(), (m1) this.f12080e.a(), (r1) this.f12081f.a(), (v1) this.f12082g.a(), (d1) this.f12083h.a());
        }
        Context contextA = ((o2) this.a).a();
        Object objA2 = this.f12082g.a();
        Object objA3 = this.f12083h.a();
        e.c.b.d.a.b.e0 e0VarC = e.c.b.d.a.b.g0.c(this.f12077b);
        Object objA4 = this.f12080e.a();
        Object objA5 = this.f12081f.a();
        return new s(contextA, (a1) objA2, (l0) objA3, e0VarC, (o0) objA4, (e0) objA5, e.c.b.d.a.b.g0.c(this.f12078c), e.c.b.d.a.b.g0.c(this.f12079d));
    }
}