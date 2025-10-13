package com.google.android.play.core.assetpacks;

import android.content.Context;
import java.io.File;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class s1 implements e.c.b.d.a.b.h0<r1> {
    private final e.c.b.d.a.b.h0 a;

    /* renamed from: b, reason: collision with root package name */
    private final e.c.b.d.a.b.h0 f12139b;

    /* renamed from: c, reason: collision with root package name */
    private final e.c.b.d.a.b.h0 f12140c;

    /* renamed from: d, reason: collision with root package name */
    private final e.c.b.d.a.b.h0 f12141d;

    /* renamed from: e, reason: collision with root package name */
    private final e.c.b.d.a.b.h0 f12142e;

    /* renamed from: f, reason: collision with root package name */
    private final e.c.b.d.a.b.h0 f12143f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ int f12144g = 0;

    public s1(e.c.b.d.a.b.h0<v> h0Var, e.c.b.d.a.b.h0<s2> h0Var2, e.c.b.d.a.b.h0<a1> h0Var3, e.c.b.d.a.b.h0<Executor> h0Var4, e.c.b.d.a.b.h0<o0> h0Var5, e.c.b.d.a.b.h0<com.google.android.play.core.common.c> h0Var6) {
        this.a = h0Var;
        this.f12139b = h0Var2;
        this.f12140c = h0Var3;
        this.f12141d = h0Var4;
        this.f12142e = h0Var5;
        this.f12143f = h0Var6;
    }

    public s1(e.c.b.d.a.b.h0<String> h0Var, e.c.b.d.a.b.h0<s> h0Var2, e.c.b.d.a.b.h0<o0> h0Var3, e.c.b.d.a.b.h0<Context> h0Var4, e.c.b.d.a.b.h0<t1> h0Var5, e.c.b.d.a.b.h0<Executor> h0Var6, byte[] bArr) {
        this.f12143f = h0Var;
        this.f12139b = h0Var2;
        this.f12142e = h0Var3;
        this.f12141d = h0Var4;
        this.f12140c = h0Var5;
        this.a = h0Var6;
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [com.google.android.play.core.assetpacks.h1, com.google.android.play.core.assetpacks.r1] */
    @Override // e.c.b.d.a.b.h0
    public final /* bridge */ /* synthetic */ r1 a() {
        if (this.f12144g == 0) {
            Object objA = this.a.a();
            e.c.b.d.a.b.e0 e0VarC = e.c.b.d.a.b.g0.c(this.f12139b);
            Object objA2 = this.f12140c.a();
            return new r1((v) objA, e0VarC, (a1) objA2, e.c.b.d.a.b.g0.c(this.f12141d), (o0) this.f12142e.a(), (com.google.android.play.core.common.c) this.f12143f.a());
        }
        String str = (String) this.f12143f.a();
        Object objA3 = this.f12139b.a();
        Object objA4 = this.f12142e.a();
        Context contextA = ((o2) this.f12141d).a();
        Object objA5 = this.f12140c.a();
        return new h1(str != null ? new File(contextA.getExternalFilesDir(null), str) : contextA.getExternalFilesDir(null), (s) objA3, (o0) objA4, contextA, (t1) objA5, e.c.b.d.a.b.g0.c(this.a));
    }
}