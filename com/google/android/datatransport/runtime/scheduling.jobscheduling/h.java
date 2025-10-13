package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* compiled from: Uploader.java */
/* loaded from: classes.dex */
final /* synthetic */ class h implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final m f4408e;

    /* renamed from: f, reason: collision with root package name */
    private final e.c.b.a.i.m f4409f;

    /* renamed from: g, reason: collision with root package name */
    private final int f4410g;

    /* renamed from: h, reason: collision with root package name */
    private final Runnable f4411h;

    private h(m mVar, e.c.b.a.i.m mVar2, int i2, Runnable runnable) {
        this.f4408e = mVar;
        this.f4409f = mVar2;
        this.f4410g = i2;
        this.f4411h = runnable;
    }

    public static Runnable a(m mVar, e.c.b.a.i.m mVar2, int i2, Runnable runnable) {
        return new h(mVar, mVar2, i2, runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        m.e(this.f4408e, this.f4409f, this.f4410g, this.f4411h);
    }
}