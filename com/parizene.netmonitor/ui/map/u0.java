package com.parizene.netmonitor.ui.map;

import android.content.Context;

/* compiled from: ResourcesProvider_Factory.java */
/* loaded from: classes3.dex */
public final class u0 implements f.c.c<t0> {
    private final h.a.a<Context> a;

    public u0(h.a.a<Context> aVar) {
        this.a = aVar;
    }

    public static u0 a(h.a.a<Context> aVar) {
        return new u0(aVar);
    }

    public static t0 c(Context context) {
        return new t0(context);
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public t0 get() {
        return c(this.a.get());
    }
}