package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.h;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.k.c;
import androidx.work.impl.k.d;
import androidx.work.impl.l.j;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements c {

    /* renamed from: e */
    private static final String f2397e = h.f("ConstraintTrkngWrkr");

    /* renamed from: f */
    private WorkerParameters f2398f;

    /* renamed from: g */
    final Object f2399g;

    /* renamed from: h */
    volatile boolean f2400h;

    /* renamed from: i */
    androidx.work.impl.utils.j.c<ListenableWorker.a> f2401i;

    /* renamed from: j */
    private ListenableWorker f2402j;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ConstraintTrackingWorker.this.f();
        }
    }

    class b implements Runnable {

        /* renamed from: e */
        final /* synthetic */ e.c.c.a.a.a f2404e;

        b(e.c.c.a.a.a aVar) {
            this.f2404e = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (ConstraintTrackingWorker.this.f2399g) {
                if (ConstraintTrackingWorker.this.f2400h) {
                    ConstraintTrackingWorker.this.d();
                } else {
                    ConstraintTrackingWorker.this.f2401i.r(this.f2404e);
                }
            }
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f2398f = workerParameters;
        this.f2399g = new Object();
        this.f2400h = false;
        this.f2401i = androidx.work.impl.utils.j.c.t();
    }

    public WorkDatabase a() {
        return androidx.work.impl.h.j(getApplicationContext()).n();
    }

    @Override // androidx.work.impl.k.c
    public void b(List<String> list) {
        h.c().a(f2397e, String.format("Constraints changed for %s", list), new Throwable[0]);
        synchronized (this.f2399g) {
            this.f2400h = true;
        }
    }

    void c() {
        this.f2401i.p(ListenableWorker.a.a());
    }

    void d() {
        this.f2401i.p(ListenableWorker.a.b());
    }

    @Override // androidx.work.impl.k.c
    public void e(List<String> list) {
    }

    void f() {
        String strI = getInputData().i("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (TextUtils.isEmpty(strI)) {
            h.c().b(f2397e, "No worker to delegate to.", new Throwable[0]);
            c();
            return;
        }
        ListenableWorker listenableWorkerB = getWorkerFactory().b(getApplicationContext(), strI, this.f2398f);
        this.f2402j = listenableWorkerB;
        if (listenableWorkerB == null) {
            h.c().a(f2397e, "No worker to delegate to.", new Throwable[0]);
            c();
            return;
        }
        j jVarM = a().M().m(getId().toString());
        if (jVarM == null) {
            c();
            return;
        }
        d dVar = new d(getApplicationContext(), getTaskExecutor(), this);
        dVar.d(Collections.singletonList(jVarM));
        if (!dVar.c(getId().toString())) {
            h.c().a(f2397e, String.format("Constraints not met for delegate %s. Requesting retry.", strI), new Throwable[0]);
            d();
            return;
        }
        h.c().a(f2397e, String.format("Constraints met for delegate %s", strI), new Throwable[0]);
        try {
            e.c.c.a.a.a<ListenableWorker.a> aVarStartWork = this.f2402j.startWork();
            aVarStartWork.a(new b(aVarStartWork), getBackgroundExecutor());
        } catch (Throwable th) {
            h hVarC = h.c();
            String str = f2397e;
            hVarC.a(str, String.format("Delegated worker %s threw exception in startWork.", strI), th);
            synchronized (this.f2399g) {
                if (this.f2400h) {
                    h.c().a(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                    d();
                } else {
                    c();
                }
            }
        }
    }

    @Override // androidx.work.ListenableWorker
    public androidx.work.impl.utils.k.a getTaskExecutor() {
        return androidx.work.impl.h.j(getApplicationContext()).o();
    }

    @Override // androidx.work.ListenableWorker
    public void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.f2402j;
        if (listenableWorker != null) {
            listenableWorker.stop();
        }
    }

    @Override // androidx.work.ListenableWorker
    public e.c.c.a.a.a<ListenableWorker.a> startWork() {
        getBackgroundExecutor().execute(new a());
        return this.f2401i;
    }
}