package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* compiled from: WorkInitializer.java */
/* loaded from: classes.dex */
final /* synthetic */ class o implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final q f4431e;

    private o(q qVar) {
        this.f4431e = qVar;
    }

    public static Runnable a(q qVar) {
        return new o(qVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        q qVar = this.f4431e;
        qVar.f4434d.b(p.a(qVar));
    }
}