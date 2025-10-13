package com.google.android.play.core.assetpacks;

import android.content.Context;

/* loaded from: classes.dex */
public final class n1 implements e.c.b.d.a.b.h0<m1> {
    private final e.c.b.d.a.b.h0 a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f12099b = 0;

    public n1(e.c.b.d.a.b.h0<v> h0Var) {
        this.a = h0Var;
    }

    public n1(e.c.b.d.a.b.h0<s2> h0Var, byte[] bArr) {
        this.a = h0Var;
    }

    public n1(e.c.b.d.a.b.h0<Context> h0Var, char[] cArr) {
        this.a = h0Var;
    }

    public n1(e.c.b.d.a.b.h0<v> h0Var, short[] sArr) {
        this.a = h0Var;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.play.core.assetpacks.c0, com.google.android.play.core.assetpacks.m1] */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.play.core.assetpacks.m1, com.google.android.play.core.assetpacks.t1] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.google.android.play.core.assetpacks.b2, com.google.android.play.core.assetpacks.m1] */
    @Override // e.c.b.d.a.b.h0
    public final /* bridge */ /* synthetic */ m1 a() {
        int i2 = this.f12099b;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? new b2((v) this.a.a()) : new t1(((o2) this.a).a()) : new c0(e.c.b.d.a.b.g0.c(this.a)) : new m1((v) this.a.a());
    }
}