package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import e.c.b.a.i.x.b;

/* compiled from: Uploader.java */
/* loaded from: classes.dex */
final /* synthetic */ class k implements b.a {
    private final e.c.b.a.i.w.j.c a;

    private k(e.c.b.a.i.w.j.c cVar) {
        this.a = cVar;
    }

    public static b.a a(e.c.b.a.i.w.j.c cVar) {
        return new k(cVar);
    }

    @Override // e.c.b.a.i.x.b.a
    public Object execute() {
        return Integer.valueOf(this.a.l());
    }
}