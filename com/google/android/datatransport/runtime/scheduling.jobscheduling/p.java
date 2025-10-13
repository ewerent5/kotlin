package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import e.c.b.a.i.x.b;

/* compiled from: WorkInitializer.java */
/* loaded from: classes.dex */
final /* synthetic */ class p implements b.a {
    private final q a;

    private p(q qVar) {
        this.a = qVar;
    }

    public static b.a a(q qVar) {
        return new p(qVar);
    }

    @Override // e.c.b.a.i.x.b.a
    public Object execute() {
        return q.b(this.a);
    }
}