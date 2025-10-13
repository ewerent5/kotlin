package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.h;
import androidx.work.impl.utils.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: SystemAlarmDispatcher.java */
/* loaded from: classes.dex */
public class e implements androidx.work.impl.a {

    /* renamed from: e, reason: collision with root package name */
    static final String f2163e = h.f("SystemAlarmDispatcher");

    /* renamed from: f, reason: collision with root package name */
    final Context f2164f;

    /* renamed from: g, reason: collision with root package name */
    private final androidx.work.impl.utils.k.a f2165g;

    /* renamed from: h, reason: collision with root package name */
    private final g f2166h;

    /* renamed from: i, reason: collision with root package name */
    private final androidx.work.impl.c f2167i;

    /* renamed from: j, reason: collision with root package name */
    private final androidx.work.impl.h f2168j;

    /* renamed from: k, reason: collision with root package name */
    final androidx.work.impl.background.systemalarm.b f2169k;

    /* renamed from: l, reason: collision with root package name */
    private final Handler f2170l;

    /* renamed from: m, reason: collision with root package name */
    final List<Intent> f2171m;
    Intent n;
    private c o;

    /* compiled from: SystemAlarmDispatcher.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar;
            d dVar;
            synchronized (e.this.f2171m) {
                e eVar2 = e.this;
                eVar2.n = eVar2.f2171m.get(0);
            }
            Intent intent = e.this.n;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = e.this.n.getIntExtra("KEY_START_ID", 0);
                h hVarC = h.c();
                String str = e.f2163e;
                hVarC.a(str, String.format("Processing command %s, %s", e.this.n, Integer.valueOf(intExtra)), new Throwable[0]);
                PowerManager.WakeLock wakeLockB = i.b(e.this.f2164f, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
                try {
                    h.c().a(str, String.format("Acquiring operation wake lock (%s) %s", action, wakeLockB), new Throwable[0]);
                    wakeLockB.acquire();
                    e eVar3 = e.this;
                    eVar3.f2169k.p(eVar3.n, intExtra, eVar3);
                    h.c().a(str, String.format("Releasing operation wake lock (%s) %s", action, wakeLockB), new Throwable[0]);
                    wakeLockB.release();
                    eVar = e.this;
                    dVar = new d(eVar);
                } catch (Throwable th) {
                    try {
                        h hVarC2 = h.c();
                        String str2 = e.f2163e;
                        hVarC2.b(str2, "Unexpected error in onHandleIntent", th);
                        h.c().a(str2, String.format("Releasing operation wake lock (%s) %s", action, wakeLockB), new Throwable[0]);
                        wakeLockB.release();
                        eVar = e.this;
                        dVar = new d(eVar);
                    } catch (Throwable th2) {
                        h.c().a(e.f2163e, String.format("Releasing operation wake lock (%s) %s", action, wakeLockB), new Throwable[0]);
                        wakeLockB.release();
                        e eVar4 = e.this;
                        eVar4.k(new d(eVar4));
                        throw th2;
                    }
                }
                eVar.k(dVar);
            }
        }
    }

    /* compiled from: SystemAlarmDispatcher.java */
    static class b implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        private final e f2173e;

        /* renamed from: f, reason: collision with root package name */
        private final Intent f2174f;

        /* renamed from: g, reason: collision with root package name */
        private final int f2175g;

        b(e eVar, Intent intent, int i2) {
            this.f2173e = eVar;
            this.f2174f = intent;
            this.f2175g = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2173e.a(this.f2174f, this.f2175g);
        }
    }

    /* compiled from: SystemAlarmDispatcher.java */
    interface c {
        void a();
    }

    /* compiled from: SystemAlarmDispatcher.java */
    static class d implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        private final e f2176e;

        d(e eVar) {
            this.f2176e = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2176e.d();
        }
    }

    e(Context context) {
        this(context, null, null);
    }

    private void b() {
        if (this.f2170l.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    private boolean i(String str) {
        b();
        synchronized (this.f2171m) {
            Iterator<Intent> it = this.f2171m.iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    private void l() {
        b();
        PowerManager.WakeLock wakeLockB = i.b(this.f2164f, "ProcessCommand");
        try {
            wakeLockB.acquire();
            this.f2168j.o().b(new a());
        } finally {
            wakeLockB.release();
        }
    }

    public boolean a(Intent intent, int i2) {
        h hVarC = h.c();
        String str = f2163e;
        hVarC.a(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i2)), new Throwable[0]);
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            h.c().h(str, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        }
        intent.putExtra("KEY_START_ID", i2);
        synchronized (this.f2171m) {
            boolean z = this.f2171m.isEmpty() ? false : true;
            this.f2171m.add(intent);
            if (!z) {
                l();
            }
        }
        return true;
    }

    @Override // androidx.work.impl.a
    public void c(String str, boolean z) {
        k(new b(this, androidx.work.impl.background.systemalarm.b.d(this.f2164f, str, z), 0));
    }

    void d() {
        h hVarC = h.c();
        String str = f2163e;
        hVarC.a(str, "Checking if commands are complete.", new Throwable[0]);
        b();
        synchronized (this.f2171m) {
            if (this.n != null) {
                h.c().a(str, String.format("Removing command %s", this.n), new Throwable[0]);
                if (!this.f2171m.remove(0).equals(this.n)) {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
                this.n = null;
            }
            if (!this.f2169k.o() && this.f2171m.isEmpty()) {
                h.c().a(str, "No more commands & intents.", new Throwable[0]);
                c cVar = this.o;
                if (cVar != null) {
                    cVar.a();
                }
            } else if (!this.f2171m.isEmpty()) {
                l();
            }
        }
    }

    androidx.work.impl.c e() {
        return this.f2167i;
    }

    androidx.work.impl.utils.k.a f() {
        return this.f2165g;
    }

    androidx.work.impl.h g() {
        return this.f2168j;
    }

    g h() {
        return this.f2166h;
    }

    void j() {
        h.c().a(f2163e, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f2167i.e(this);
        this.f2166h.a();
        this.o = null;
    }

    void k(Runnable runnable) {
        this.f2170l.post(runnable);
    }

    void m(c cVar) {
        if (this.o != null) {
            h.c().b(f2163e, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            this.o = cVar;
        }
    }

    e(Context context, androidx.work.impl.c cVar, androidx.work.impl.h hVar) {
        Context applicationContext = context.getApplicationContext();
        this.f2164f = applicationContext;
        this.f2169k = new androidx.work.impl.background.systemalarm.b(applicationContext);
        this.f2166h = new g();
        hVar = hVar == null ? androidx.work.impl.h.j(context) : hVar;
        this.f2168j = hVar;
        cVar = cVar == null ? hVar.l() : cVar;
        this.f2167i = cVar;
        this.f2165g = hVar.o();
        cVar.a(this);
        this.f2171m = new ArrayList();
        this.n = null;
        this.f2170l = new Handler(Looper.getMainLooper());
    }
}