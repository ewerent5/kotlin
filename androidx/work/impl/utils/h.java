package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.l.k;
import androidx.work.n;

/* compiled from: StopWorkRunnable.java */
/* loaded from: classes.dex */
public class h implements Runnable {

    /* renamed from: e */
    private static final String f2366e = androidx.work.h.f("StopWorkRunnable");

    /* renamed from: f */
    private androidx.work.impl.h f2367f;

    /* renamed from: g */
    private String f2368g;

    public h(androidx.work.impl.h hVar, String str) {
        this.f2367f = hVar;
        this.f2368g = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        WorkDatabase workDatabaseN = this.f2367f.n();
        k kVarM = workDatabaseN.M();
        workDatabaseN.c();
        try {
            if (kVarM.l(this.f2368g) == n.a.RUNNING) {
                kVarM.a(n.a.ENQUEUED, this.f2368g);
            }
            androidx.work.h.c().a(f2366e, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.f2368g, Boolean.valueOf(this.f2367f.l().i(this.f2368g))), new Throwable[0]);
            workDatabaseN.D();
        } finally {
            workDatabaseN.h();
        }
    }
}