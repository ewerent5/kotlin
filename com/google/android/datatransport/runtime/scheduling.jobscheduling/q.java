package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: WorkInitializer.java */
/* loaded from: classes.dex */
public class q {
    private final Executor a;

    /* renamed from: b */
    private final e.c.b.a.i.w.j.c f4432b;

    /* renamed from: c */
    private final s f4433c;

    /* renamed from: d */
    private final e.c.b.a.i.x.b f4434d;

    q(Executor executor, e.c.b.a.i.w.j.c cVar, s sVar, e.c.b.a.i.x.b bVar) {
        this.a = executor;
        this.f4432b = cVar;
        this.f4433c = sVar;
        this.f4434d = bVar;
    }

    static /* synthetic */ Object b(q qVar) {
        Iterator<e.c.b.a.i.m> it = qVar.f4432b.L().iterator();
        while (it.hasNext()) {
            qVar.f4433c.a(it.next(), 1);
        }
        return null;
    }

    public void a() {
        this.a.execute(o.a(this));
    }
}