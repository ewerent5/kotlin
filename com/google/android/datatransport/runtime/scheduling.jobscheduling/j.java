package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import e.c.b.a.i.x.b;

/* compiled from: Uploader.java */
/* loaded from: classes.dex */
final /* synthetic */ class j implements b.a {
    private final m a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.backends.g f4413b;

    /* renamed from: c, reason: collision with root package name */
    private final Iterable f4414c;

    /* renamed from: d, reason: collision with root package name */
    private final e.c.b.a.i.m f4415d;

    /* renamed from: e, reason: collision with root package name */
    private final int f4416e;

    private j(m mVar, com.google.android.datatransport.runtime.backends.g gVar, Iterable iterable, e.c.b.a.i.m mVar2, int i2) {
        this.a = mVar;
        this.f4413b = gVar;
        this.f4414c = iterable;
        this.f4415d = mVar2;
        this.f4416e = i2;
    }

    public static b.a a(m mVar, com.google.android.datatransport.runtime.backends.g gVar, Iterable iterable, e.c.b.a.i.m mVar2, int i2) {
        return new j(mVar, gVar, iterable, mVar2, i2);
    }

    @Override // e.c.b.a.i.x.b.a
    public Object execute() {
        return m.c(this.a, this.f4413b, this.f4414c, this.f4415d, this.f4416e);
    }
}