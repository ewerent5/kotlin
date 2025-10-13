package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: Uploader_Factory.java */
/* loaded from: classes.dex */
public final class n implements e.c.b.a.i.t.a.b<m> {
    private final h.a.a<Context> a;

    /* renamed from: b */
    private final h.a.a<com.google.android.datatransport.runtime.backends.e> f4425b;

    /* renamed from: c */
    private final h.a.a<e.c.b.a.i.w.j.c> f4426c;

    /* renamed from: d */
    private final h.a.a<s> f4427d;

    /* renamed from: e */
    private final h.a.a<Executor> f4428e;

    /* renamed from: f */
    private final h.a.a<e.c.b.a.i.x.b> f4429f;

    /* renamed from: g */
    private final h.a.a<e.c.b.a.i.y.a> f4430g;

    public n(h.a.a<Context> aVar, h.a.a<com.google.android.datatransport.runtime.backends.e> aVar2, h.a.a<e.c.b.a.i.w.j.c> aVar3, h.a.a<s> aVar4, h.a.a<Executor> aVar5, h.a.a<e.c.b.a.i.x.b> aVar6, h.a.a<e.c.b.a.i.y.a> aVar7) {
        this.a = aVar;
        this.f4425b = aVar2;
        this.f4426c = aVar3;
        this.f4427d = aVar4;
        this.f4428e = aVar5;
        this.f4429f = aVar6;
        this.f4430g = aVar7;
    }

    public static n a(h.a.a<Context> aVar, h.a.a<com.google.android.datatransport.runtime.backends.e> aVar2, h.a.a<e.c.b.a.i.w.j.c> aVar3, h.a.a<s> aVar4, h.a.a<Executor> aVar5, h.a.a<e.c.b.a.i.x.b> aVar6, h.a.a<e.c.b.a.i.y.a> aVar7) {
        return new n(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static m c(Context context, com.google.android.datatransport.runtime.backends.e eVar, e.c.b.a.i.w.j.c cVar, s sVar, Executor executor, e.c.b.a.i.x.b bVar, e.c.b.a.i.y.a aVar) {
        return new m(context, eVar, cVar, sVar, executor, bVar, aVar);
    }

    @Override // h.a.a
    /* renamed from: b */
    public m get() {
        return c(this.a.get(), this.f4425b.get(), this.f4426c.get(), this.f4427d.get(), this.f4428e.get(), this.f4429f.get(), this.f4430g.get());
    }
}