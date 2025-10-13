package androidx.work.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.l.j;
import androidx.work.impl.l.k;
import androidx.work.impl.l.n;
import androidx.work.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: WorkerWrapper.java */
/* loaded from: classes.dex */
public class i implements Runnable {

    /* renamed from: e */
    static final String f2232e = androidx.work.h.f("WorkerWrapper");

    /* renamed from: f */
    private Context f2233f;

    /* renamed from: g */
    private String f2234g;

    /* renamed from: h */
    private List<d> f2235h;

    /* renamed from: i */
    private WorkerParameters.a f2236i;

    /* renamed from: j */
    j f2237j;

    /* renamed from: k */
    ListenableWorker f2238k;

    /* renamed from: m */
    private androidx.work.b f2240m;
    private androidx.work.impl.utils.k.a n;
    private WorkDatabase o;
    private k p;
    private androidx.work.impl.l.b q;
    private n r;
    private List<String> s;
    private String t;
    private volatile boolean w;

    /* renamed from: l */
    ListenableWorker.a f2239l = ListenableWorker.a.a();
    private androidx.work.impl.utils.j.c<Boolean> u = androidx.work.impl.utils.j.c.t();
    e.c.c.a.a.a<ListenableWorker.a> v = null;

    /* compiled from: WorkerWrapper.java */
    class a implements Runnable {

        /* renamed from: e */
        final /* synthetic */ androidx.work.impl.utils.j.c f2241e;

        a(androidx.work.impl.utils.j.c cVar) {
            this.f2241e = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                androidx.work.h.c().a(i.f2232e, String.format("Starting work for %s", i.this.f2237j.f2304e), new Throwable[0]);
                i iVar = i.this;
                iVar.v = iVar.f2238k.startWork();
                this.f2241e.r(i.this.v);
            } catch (Throwable th) {
                this.f2241e.q(th);
            }
        }
    }

    /* compiled from: WorkerWrapper.java */
    class b implements Runnable {

        /* renamed from: e */
        final /* synthetic */ androidx.work.impl.utils.j.c f2243e;

        /* renamed from: f */
        final /* synthetic */ String f2244f;

        b(androidx.work.impl.utils.j.c cVar, String str) {
            this.f2243e = cVar;
            this.f2244f = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            try {
                try {
                    ListenableWorker.a aVar = (ListenableWorker.a) this.f2243e.get();
                    if (aVar == null) {
                        androidx.work.h.c().b(i.f2232e, String.format("%s returned a null result. Treating it as a failure.", i.this.f2237j.f2304e), new Throwable[0]);
                    } else {
                        androidx.work.h.c().a(i.f2232e, String.format("%s returned a %s result.", i.this.f2237j.f2304e, aVar), new Throwable[0]);
                        i.this.f2239l = aVar;
                    }
                } catch (InterruptedException e2) {
                    e = e2;
                    androidx.work.h.c().b(i.f2232e, String.format("%s failed because it threw an exception/error", this.f2244f), e);
                } catch (CancellationException e3) {
                    androidx.work.h.c().d(i.f2232e, String.format("%s was cancelled", this.f2244f), e3);
                } catch (ExecutionException e4) {
                    e = e4;
                    androidx.work.h.c().b(i.f2232e, String.format("%s failed because it threw an exception/error", this.f2244f), e);
                }
            } finally {
                i.this.f();
            }
        }
    }

    /* compiled from: WorkerWrapper.java */
    public static class c {
        Context a;

        /* renamed from: b */
        ListenableWorker f2246b;

        /* renamed from: c */
        androidx.work.impl.utils.k.a f2247c;

        /* renamed from: d */
        androidx.work.b f2248d;

        /* renamed from: e */
        WorkDatabase f2249e;

        /* renamed from: f */
        String f2250f;

        /* renamed from: g */
        List<d> f2251g;

        /* renamed from: h */
        WorkerParameters.a f2252h = new WorkerParameters.a();

        public c(Context context, androidx.work.b bVar, androidx.work.impl.utils.k.a aVar, WorkDatabase workDatabase, String str) {
            this.a = context.getApplicationContext();
            this.f2247c = aVar;
            this.f2248d = bVar;
            this.f2249e = workDatabase;
            this.f2250f = str;
        }

        public i a() {
            return new i(this);
        }

        public c b(WorkerParameters.a aVar) {
            if (aVar != null) {
                this.f2252h = aVar;
            }
            return this;
        }

        public c c(List<d> list) {
            this.f2251g = list;
            return this;
        }
    }

    i(c cVar) {
        this.f2233f = cVar.a;
        this.n = cVar.f2247c;
        this.f2234g = cVar.f2250f;
        this.f2235h = cVar.f2251g;
        this.f2236i = cVar.f2252h;
        this.f2238k = cVar.f2246b;
        this.f2240m = cVar.f2248d;
        WorkDatabase workDatabase = cVar.f2249e;
        this.o = workDatabase;
        this.p = workDatabase.M();
        this.q = this.o.G();
        this.r = this.o.N();
    }

    private String a(List<String> list) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.f2234g);
        sb.append(", tags={ ");
        boolean z = true;
        for (String str : list) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(" } ]");
        return sb.toString();
    }

    private void c(ListenableWorker.a aVar) {
        if (aVar instanceof ListenableWorker.a.c) {
            androidx.work.h.c().d(f2232e, String.format("Worker result SUCCESS for %s", this.t), new Throwable[0]);
            if (this.f2237j.d()) {
                h();
                return;
            } else {
                m();
                return;
            }
        }
        if (aVar instanceof ListenableWorker.a.b) {
            androidx.work.h.c().d(f2232e, String.format("Worker result RETRY for %s", this.t), new Throwable[0]);
            g();
            return;
        }
        androidx.work.h.c().d(f2232e, String.format("Worker result FAILURE for %s", this.t), new Throwable[0]);
        if (this.f2237j.d()) {
            h();
        } else {
            l();
        }
    }

    private void e(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.p.l(str2) != n.a.CANCELLED) {
                this.p.a(n.a.FAILED, str2);
            }
            linkedList.addAll(this.q.b(str2));
        }
    }

    private void g() {
        this.o.c();
        try {
            this.p.a(n.a.ENQUEUED, this.f2234g);
            this.p.r(this.f2234g, System.currentTimeMillis());
            this.p.b(this.f2234g, -1L);
            this.o.D();
        } finally {
            this.o.h();
            i(true);
        }
    }

    private void h() {
        this.o.c();
        try {
            this.p.r(this.f2234g, System.currentTimeMillis());
            this.p.a(n.a.ENQUEUED, this.f2234g);
            this.p.n(this.f2234g);
            this.p.b(this.f2234g, -1L);
            this.o.D();
        } finally {
            this.o.h();
            i(false);
        }
    }

    private void i(boolean z) {
        this.o.c();
        try {
            List<String> listJ = this.o.M().j();
            if (listJ == null || listJ.isEmpty()) {
                androidx.work.impl.utils.d.a(this.f2233f, RescheduleReceiver.class, false);
            }
            this.o.D();
            this.o.h();
            this.u.p(Boolean.valueOf(z));
        } catch (Throwable th) {
            this.o.h();
            throw th;
        }
    }

    private void j() {
        n.a aVarL = this.p.l(this.f2234g);
        if (aVarL == n.a.RUNNING) {
            androidx.work.h.c().a(f2232e, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.f2234g), new Throwable[0]);
            i(true);
        } else {
            androidx.work.h.c().a(f2232e, String.format("Status for %s is %s; not doing any work", this.f2234g, aVarL), new Throwable[0]);
            i(false);
        }
    }

    private void k() {
        androidx.work.e eVarB;
        if (n()) {
            return;
        }
        this.o.c();
        try {
            j jVarM = this.p.m(this.f2234g);
            this.f2237j = jVarM;
            if (jVarM == null) {
                androidx.work.h.c().b(f2232e, String.format("Didn't find WorkSpec for id %s", this.f2234g), new Throwable[0]);
                i(false);
                return;
            }
            if (jVarM.f2303d != n.a.ENQUEUED) {
                j();
                this.o.D();
                androidx.work.h.c().a(f2232e, String.format("%s is not in ENQUEUED state. Nothing more to do.", this.f2237j.f2304e), new Throwable[0]);
                return;
            }
            if (jVarM.d() || this.f2237j.c()) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                j jVar = this.f2237j;
                if (!(jVar.p == 0) && jCurrentTimeMillis < jVar.a()) {
                    androidx.work.h.c().a(f2232e, String.format("Delaying execution for %s because it is being executed before schedule.", this.f2237j.f2304e), new Throwable[0]);
                    i(true);
                    return;
                }
            }
            this.o.D();
            this.o.h();
            if (this.f2237j.d()) {
                eVarB = this.f2237j.f2306g;
            } else {
                androidx.work.g gVarA = androidx.work.g.a(this.f2237j.f2305f);
                if (gVarA == null) {
                    androidx.work.h.c().b(f2232e, String.format("Could not create Input Merger %s", this.f2237j.f2305f), new Throwable[0]);
                    l();
                    return;
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f2237j.f2306g);
                    arrayList.addAll(this.p.p(this.f2234g));
                    eVarB = gVarA.b(arrayList);
                }
            }
            WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.f2234g), eVarB, this.s, this.f2236i, this.f2237j.f2312m, this.f2240m.b(), this.n, this.f2240m.h());
            if (this.f2238k == null) {
                this.f2238k = this.f2240m.h().b(this.f2233f, this.f2237j.f2304e, workerParameters);
            }
            ListenableWorker listenableWorker = this.f2238k;
            if (listenableWorker == null) {
                androidx.work.h.c().b(f2232e, String.format("Could not create Worker %s", this.f2237j.f2304e), new Throwable[0]);
                l();
                return;
            }
            if (listenableWorker.isUsed()) {
                androidx.work.h.c().b(f2232e, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", this.f2237j.f2304e), new Throwable[0]);
                l();
                return;
            }
            this.f2238k.setUsed();
            if (!o()) {
                j();
            } else {
                if (n()) {
                    return;
                }
                androidx.work.impl.utils.j.c cVarT = androidx.work.impl.utils.j.c.t();
                this.n.a().execute(new a(cVarT));
                cVarT.a(new b(cVarT, this.t), this.n.c());
            }
        } finally {
            this.o.h();
        }
    }

    private void m() {
        this.o.c();
        try {
            this.p.a(n.a.SUCCEEDED, this.f2234g);
            this.p.h(this.f2234g, ((ListenableWorker.a.c) this.f2239l).e());
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (String str : this.q.b(this.f2234g)) {
                if (this.p.l(str) == n.a.BLOCKED && this.q.c(str)) {
                    androidx.work.h.c().d(f2232e, String.format("Setting status to enqueued for %s", str), new Throwable[0]);
                    this.p.a(n.a.ENQUEUED, str);
                    this.p.r(str, jCurrentTimeMillis);
                }
            }
            this.o.D();
        } finally {
            this.o.h();
            i(false);
        }
    }

    private boolean n() {
        if (!this.w) {
            return false;
        }
        androidx.work.h.c().a(f2232e, String.format("Work interrupted for %s", this.t), new Throwable[0]);
        if (this.p.l(this.f2234g) == null) {
            i(false);
        } else {
            i(!r0.a());
        }
        return true;
    }

    private boolean o() {
        this.o.c();
        try {
            boolean z = true;
            if (this.p.l(this.f2234g) == n.a.ENQUEUED) {
                this.p.a(n.a.RUNNING, this.f2234g);
                this.p.q(this.f2234g);
            } else {
                z = false;
            }
            this.o.D();
            return z;
        } finally {
            this.o.h();
        }
    }

    public e.c.c.a.a.a<Boolean> b() {
        return this.u;
    }

    public void d(boolean z) {
        this.w = true;
        n();
        e.c.c.a.a.a<ListenableWorker.a> aVar = this.v;
        if (aVar != null) {
            aVar.cancel(true);
        }
        ListenableWorker listenableWorker = this.f2238k;
        if (listenableWorker != null) {
            listenableWorker.stop();
        }
    }

    void f() {
        boolean zA = false;
        if (!n()) {
            this.o.c();
            try {
                n.a aVarL = this.p.l(this.f2234g);
                if (aVarL == null) {
                    i(false);
                    zA = true;
                } else if (aVarL == n.a.RUNNING) {
                    c(this.f2239l);
                    zA = this.p.l(this.f2234g).a();
                } else if (!aVarL.a()) {
                    g();
                }
                this.o.D();
            } finally {
                this.o.h();
            }
        }
        List<d> list = this.f2235h;
        if (list != null) {
            if (zA) {
                Iterator<d> it = list.iterator();
                while (it.hasNext()) {
                    it.next().d(this.f2234g);
                }
            }
            e.b(this.f2240m, this.o, this.f2235h);
        }
    }

    void l() {
        this.o.c();
        try {
            e(this.f2234g);
            this.p.h(this.f2234g, ((ListenableWorker.a.C0032a) this.f2239l).e());
            this.o.D();
        } finally {
            this.o.h();
            i(false);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        List<String> listB = this.r.b(this.f2234g);
        this.s = listB;
        this.t = a(listB);
        k();
    }
}