package androidx.work.impl;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.impl.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* compiled from: Processor.java */
/* loaded from: classes.dex */
public class c implements androidx.work.impl.a {

    /* renamed from: e, reason: collision with root package name */
    private static final String f2197e = androidx.work.h.f("Processor");

    /* renamed from: f, reason: collision with root package name */
    private Context f2198f;

    /* renamed from: g, reason: collision with root package name */
    private androidx.work.b f2199g;

    /* renamed from: h, reason: collision with root package name */
    private androidx.work.impl.utils.k.a f2200h;

    /* renamed from: i, reason: collision with root package name */
    private WorkDatabase f2201i;

    /* renamed from: k, reason: collision with root package name */
    private List<d> f2203k;

    /* renamed from: j, reason: collision with root package name */
    private Map<String, i> f2202j = new HashMap();

    /* renamed from: l, reason: collision with root package name */
    private Set<String> f2204l = new HashSet();

    /* renamed from: m, reason: collision with root package name */
    private final List<androidx.work.impl.a> f2205m = new ArrayList();
    private final Object n = new Object();

    /* compiled from: Processor.java */
    private static class a implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        private androidx.work.impl.a f2206e;

        /* renamed from: f, reason: collision with root package name */
        private String f2207f;

        /* renamed from: g, reason: collision with root package name */
        private e.c.c.a.a.a<Boolean> f2208g;

        a(androidx.work.impl.a aVar, String str, e.c.c.a.a.a<Boolean> aVar2) {
            this.f2206e = aVar;
            this.f2207f = str;
            this.f2208g = aVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zBooleanValue;
            try {
                zBooleanValue = this.f2208g.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                zBooleanValue = true;
            }
            this.f2206e.c(this.f2207f, zBooleanValue);
        }
    }

    public c(Context context, androidx.work.b bVar, androidx.work.impl.utils.k.a aVar, WorkDatabase workDatabase, List<d> list) {
        this.f2198f = context;
        this.f2199g = bVar;
        this.f2200h = aVar;
        this.f2201i = workDatabase;
        this.f2203k = list;
    }

    public void a(androidx.work.impl.a aVar) {
        synchronized (this.n) {
            this.f2205m.add(aVar);
        }
    }

    public boolean b(String str) {
        boolean zContains;
        synchronized (this.n) {
            zContains = this.f2204l.contains(str);
        }
        return zContains;
    }

    @Override // androidx.work.impl.a
    public void c(String str, boolean z) {
        synchronized (this.n) {
            this.f2202j.remove(str);
            androidx.work.h.c().a(f2197e, String.format("%s %s executed; reschedule = %s", getClass().getSimpleName(), str, Boolean.valueOf(z)), new Throwable[0]);
            Iterator<androidx.work.impl.a> it = this.f2205m.iterator();
            while (it.hasNext()) {
                it.next().c(str, z);
            }
        }
    }

    public boolean d(String str) {
        boolean zContainsKey;
        synchronized (this.n) {
            zContainsKey = this.f2202j.containsKey(str);
        }
        return zContainsKey;
    }

    public void e(androidx.work.impl.a aVar) {
        synchronized (this.n) {
            this.f2205m.remove(aVar);
        }
    }

    public boolean f(String str) {
        return g(str, null);
    }

    public boolean g(String str, WorkerParameters.a aVar) {
        synchronized (this.n) {
            if (this.f2202j.containsKey(str)) {
                androidx.work.h.c().a(f2197e, String.format("Work %s is already enqueued for processing", str), new Throwable[0]);
                return false;
            }
            i iVarA = new i.c(this.f2198f, this.f2199g, this.f2200h, this.f2201i, str).c(this.f2203k).b(aVar).a();
            e.c.c.a.a.a<Boolean> aVarB = iVarA.b();
            aVarB.a(new a(this, str, aVarB), this.f2200h.a());
            this.f2202j.put(str, iVarA);
            this.f2200h.c().execute(iVarA);
            androidx.work.h.c().a(f2197e, String.format("%s: processing %s", c.class.getSimpleName(), str), new Throwable[0]);
            return true;
        }
    }

    public boolean h(String str) {
        synchronized (this.n) {
            androidx.work.h hVarC = androidx.work.h.c();
            String str2 = f2197e;
            hVarC.a(str2, String.format("Processor cancelling %s", str), new Throwable[0]);
            this.f2204l.add(str);
            i iVarRemove = this.f2202j.remove(str);
            if (iVarRemove == null) {
                androidx.work.h.c().a(str2, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
                return false;
            }
            iVarRemove.d(true);
            androidx.work.h.c().a(str2, String.format("WorkerWrapper cancelled for %s", str), new Throwable[0]);
            return true;
        }
    }

    public boolean i(String str) {
        synchronized (this.n) {
            androidx.work.h hVarC = androidx.work.h.c();
            String str2 = f2197e;
            hVarC.a(str2, String.format("Processor stopping %s", str), new Throwable[0]);
            i iVarRemove = this.f2202j.remove(str);
            if (iVarRemove == null) {
                androidx.work.h.c().a(str2, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
                return false;
            }
            iVarRemove.d(false);
            androidx.work.h.c().a(str2, String.format("WorkerWrapper stopped for %s", str), new Throwable[0]);
            return true;
        }
    }
}