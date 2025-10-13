package com.google.android.datatransport.cct;

import com.google.android.datatransport.cct.d;

/* compiled from: CctTransportBackend.java */
/* loaded from: classes.dex */
final /* synthetic */ class b implements e.c.b.a.i.v.a {
    private final d a;

    private b(d dVar) {
        this.a = dVar;
    }

    public static e.c.b.a.i.v.a a(d dVar) {
        return new b(dVar);
    }

    @Override // e.c.b.a.i.v.a
    public Object apply(Object obj) {
        return this.a.d((d.a) obj);
    }
}