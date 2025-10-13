package androidx.work.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.h;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.k;
import androidx.work.l;
import androidx.work.o;
import androidx.work.p;
import java.util.Arrays;
import java.util.List;

/* compiled from: WorkManagerImpl.java */
/* loaded from: classes.dex */
public class h extends o {
    private static h a;

    /* renamed from: b, reason: collision with root package name */
    private static h f2221b;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f2222c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private Context f2223d;

    /* renamed from: e, reason: collision with root package name */
    private androidx.work.b f2224e;

    /* renamed from: f, reason: collision with root package name */
    private WorkDatabase f2225f;

    /* renamed from: g, reason: collision with root package name */
    private androidx.work.impl.utils.k.a f2226g;

    /* renamed from: h, reason: collision with root package name */
    private List<d> f2227h;

    /* renamed from: i, reason: collision with root package name */
    private c f2228i;

    /* renamed from: j, reason: collision with root package name */
    private androidx.work.impl.utils.e f2229j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f2230k;

    /* renamed from: l, reason: collision with root package name */
    private BroadcastReceiver.PendingResult f2231l;

    public h(Context context, androidx.work.b bVar, androidx.work.impl.utils.k.a aVar) {
        this(context, bVar, aVar, context.getResources().getBoolean(l.a));
    }

    public static void e(Context context, androidx.work.b bVar) {
        synchronized (f2222c) {
            h hVar = a;
            if (hVar != null && f2221b != null) {
                throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class levelJavadoc for more information.");
            }
            if (hVar == null) {
                Context applicationContext = context.getApplicationContext();
                if (f2221b == null) {
                    f2221b = new h(applicationContext, bVar, new androidx.work.impl.utils.k.b(bVar.g()));
                }
                a = f2221b;
            }
        }
    }

    @Deprecated
    public static h i() {
        synchronized (f2222c) {
            h hVar = a;
            if (hVar != null) {
                return hVar;
            }
            return f2221b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static h j(Context context) {
        h hVarI;
        synchronized (f2222c) {
            hVarI = i();
            if (hVarI == null) {
                Context applicationContext = context.getApplicationContext();
                if (!(applicationContext instanceof b.InterfaceC0033b)) {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
                e(applicationContext, ((b.InterfaceC0033b) applicationContext).a());
                hVarI = j(applicationContext);
            }
        }
        return hVarI;
    }

    private void p(Context context, androidx.work.b bVar, androidx.work.impl.utils.k.a aVar, WorkDatabase workDatabase, List<d> list, c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.f2223d = applicationContext;
        this.f2224e = bVar;
        this.f2226g = aVar;
        this.f2225f = workDatabase;
        this.f2227h = list;
        this.f2228i = cVar;
        this.f2229j = new androidx.work.impl.utils.e(applicationContext);
        this.f2230k = false;
        this.f2226g.b(new ForceStopRunnable(applicationContext, this));
    }

    @Override // androidx.work.o
    public k a(String str) {
        androidx.work.impl.utils.a aVarC = androidx.work.impl.utils.a.c(str, this);
        this.f2226g.b(aVarC);
        return aVarC.d();
    }

    @Override // androidx.work.o
    public k c(List<? extends p> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new f(this, list).a();
    }

    public List<d> f(Context context, androidx.work.impl.utils.k.a aVar) {
        return Arrays.asList(e.a(context, this), new androidx.work.impl.j.a.a(context, aVar, this));
    }

    public Context g() {
        return this.f2223d;
    }

    public androidx.work.b h() {
        return this.f2224e;
    }

    public androidx.work.impl.utils.e k() {
        return this.f2229j;
    }

    public c l() {
        return this.f2228i;
    }

    public List<d> m() {
        return this.f2227h;
    }

    public WorkDatabase n() {
        return this.f2225f;
    }

    public androidx.work.impl.utils.k.a o() {
        return this.f2226g;
    }

    public void q() {
        synchronized (f2222c) {
            this.f2230k = true;
            BroadcastReceiver.PendingResult pendingResult = this.f2231l;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f2231l = null;
            }
        }
    }

    public void r() {
        if (Build.VERSION.SDK_INT >= 23) {
            androidx.work.impl.background.systemjob.b.b(g());
        }
        n().M().s();
        e.b(h(), n(), m());
    }

    public void s(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f2222c) {
            this.f2231l = pendingResult;
            if (this.f2230k) {
                pendingResult.finish();
                this.f2231l = null;
            }
        }
    }

    public void t(String str) {
        u(str, null);
    }

    public void u(String str, WorkerParameters.a aVar) {
        this.f2226g.b(new androidx.work.impl.utils.g(this, str, aVar));
    }

    public void v(String str) {
        this.f2226g.b(new androidx.work.impl.utils.h(this, str));
    }

    public h(Context context, androidx.work.b bVar, androidx.work.impl.utils.k.a aVar, boolean z) {
        Context applicationContext = context.getApplicationContext();
        WorkDatabase workDatabaseF = WorkDatabase.F(applicationContext, bVar.g(), z);
        androidx.work.h.e(new h.a(bVar.f()));
        List<d> listF = f(applicationContext, aVar);
        p(context, bVar, aVar, workDatabaseF, listF, new c(context, bVar, aVar, workDatabaseF, listF));
    }
}