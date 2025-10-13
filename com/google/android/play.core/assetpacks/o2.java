package com.google.android.play.core.assetpacks;

import android.content.Context;

/* loaded from: classes.dex */
public final class o2 implements e.c.b.d.a.b.h0<Context> {
    private final j2 a;

    public o2(j2 j2Var) {
        this.a = j2Var;
    }

    public static Context c(j2 j2Var) {
        Context contextA = j2Var.a();
        e.c.b.d.a.b.s.d(contextA);
        return contextA;
    }

    @Override // e.c.b.d.a.b.h0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Context a() {
        return c(this.a);
    }
}