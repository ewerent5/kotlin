package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import e.c.b.a.i.x.b;

/* compiled from: Uploader.java */
/* loaded from: classes.dex */
final /* synthetic */ class i implements b.a {
    private final m a;

    /* renamed from: b, reason: collision with root package name */
    private final e.c.b.a.i.m f4412b;

    private i(m mVar, e.c.b.a.i.m mVar2) {
        this.a = mVar;
        this.f4412b = mVar2;
    }

    public static b.a a(m mVar, e.c.b.a.i.m mVar2) {
        return new i(mVar, mVar2);
    }

    @Override // e.c.b.a.i.x.b.a
    public Object execute() {
        return this.a.f4420c.z(this.f4412b);
    }
}