package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import e.c.b.a.i.x.b;

/* compiled from: Uploader.java */
/* loaded from: classes.dex */
final /* synthetic */ class l implements b.a {
    private final m a;

    /* renamed from: b, reason: collision with root package name */
    private final e.c.b.a.i.m f4417b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4418c;

    private l(m mVar, e.c.b.a.i.m mVar2, int i2) {
        this.a = mVar;
        this.f4417b = mVar2;
        this.f4418c = i2;
    }

    public static b.a a(m mVar, e.c.b.a.i.m mVar2, int i2) {
        return new l(mVar, mVar2, i2);
    }

    @Override // e.c.b.a.i.x.b.a
    public Object execute() {
        return m.d(this.a, this.f4417b, this.f4418c);
    }
}