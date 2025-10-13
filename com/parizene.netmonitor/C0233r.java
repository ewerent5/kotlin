package com.parizene.netmonitor;

import android.content.Context;

/* compiled from: FieldTest_Factory.java */
/* renamed from: com.parizene.netmonitor.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0233r implements f.c.c<q> {
    private final h.a.a<Context> a;

    public C0233r(h.a.a<Context> aVar) {
        this.a = aVar;
    }

    public static C0233r a(h.a.a<Context> aVar) {
        return new C0233r(aVar);
    }

    public static q c(Context context) {
        return new q(context);
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public q get() {
        return c(this.a.get());
    }
}