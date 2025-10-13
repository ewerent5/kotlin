package com.google.firebase.crashlytics.d.h;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: CrashlyticsCore.java */
/* loaded from: classes.dex */
public class m {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.c f12435b;

    /* renamed from: c, reason: collision with root package name */
    private final s f12436c;

    /* renamed from: d, reason: collision with root package name */
    private final long f12437d = System.currentTimeMillis();

    /* renamed from: e, reason: collision with root package name */
    private n f12438e;

    /* renamed from: f, reason: collision with root package name */
    private n f12439f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f12440g;

    /* renamed from: h, reason: collision with root package name */
    private k f12441h;

    /* renamed from: i, reason: collision with root package name */
    private final x f12442i;

    /* renamed from: j, reason: collision with root package name */
    private final com.google.firebase.crashlytics.d.g.b f12443j;

    /* renamed from: k, reason: collision with root package name */
    private final com.google.firebase.crashlytics.d.f.a f12444k;

    /* renamed from: l, reason: collision with root package name */
    private ExecutorService f12445l;

    /* renamed from: m, reason: collision with root package name */
    private i f12446m;
    private com.google.firebase.crashlytics.d.a n;

    /* compiled from: CrashlyticsCore.java */
    class a implements Callable<e.c.b.b.e.h<Void>> {
        final /* synthetic */ com.google.firebase.crashlytics.d.p.e a;

        a(com.google.firebase.crashlytics.d.p.e eVar) {
            this.a = eVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e.c.b.b.e.h<Void> call() {
            return m.this.f(this.a);
        }
    }

    /* compiled from: CrashlyticsCore.java */
    class b implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.google.firebase.crashlytics.d.p.e f12448e;

        b(com.google.firebase.crashlytics.d.p.e eVar) {
            this.f12448e = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            m.this.f(this.f12448e);
        }
    }

    /* compiled from: CrashlyticsCore.java */
    class c implements Callable<Boolean> {
        c() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            try {
                boolean zD = m.this.f12438e.d();
                com.google.firebase.crashlytics.d.b.f().b("Initialization marker file removed: " + zD);
                return Boolean.valueOf(zD);
            } catch (Exception e2) {
                com.google.firebase.crashlytics.d.b.f().e("Problem encountered deleting Crashlytics initialization marker.", e2);
                return Boolean.FALSE;
            }
        }
    }

    /* compiled from: CrashlyticsCore.java */
    class d implements Callable<Boolean> {
        d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            return Boolean.valueOf(m.this.f12441h.H());
        }
    }

    public m(com.google.firebase.c cVar, x xVar, com.google.firebase.crashlytics.d.a aVar, s sVar, com.google.firebase.crashlytics.d.g.b bVar, com.google.firebase.crashlytics.d.f.a aVar2, ExecutorService executorService) {
        this.f12435b = cVar;
        this.f12436c = sVar;
        this.a = cVar.g();
        this.f12442i = xVar;
        this.n = aVar;
        this.f12443j = bVar;
        this.f12444k = aVar2;
        this.f12445l = executorService;
        this.f12446m = new i(executorService);
    }

    private void d() {
        try {
            this.f12440g = Boolean.TRUE.equals((Boolean) k0.a(this.f12446m.h(new d())));
        } catch (Exception unused) {
            this.f12440g = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public e.c.b.b.e.h<Void> f(com.google.firebase.crashlytics.d.p.e eVar) {
        n();
        this.f12441h.B();
        try {
            this.f12443j.a(l.b(this));
            com.google.firebase.crashlytics.d.p.i.e eVarB = eVar.b();
            if (!eVarB.a().a) {
                com.google.firebase.crashlytics.d.b.f().b("Collection of crash reports disabled in Crashlytics settings.");
                return e.c.b.b.e.k.c(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
            if (!this.f12441h.S(eVarB.b().a)) {
                com.google.firebase.crashlytics.d.b.f().b("Could not finalize previous sessions.");
            }
            return this.f12441h.y0(1.0f, eVar.a());
        } catch (Exception e2) {
            com.google.firebase.crashlytics.d.b.f().e("Crashlytics encountered a problem during asynchronous initialization.", e2);
            return e.c.b.b.e.k.c(e2);
        } finally {
            m();
        }
    }

    private void h(com.google.firebase.crashlytics.d.p.e eVar) throws ExecutionException, InterruptedException, TimeoutException {
        Future<?> futureSubmit = this.f12445l.submit(new b(eVar));
        com.google.firebase.crashlytics.d.b.f().b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            futureSubmit.get(4L, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            com.google.firebase.crashlytics.d.b.f().e("Crashlytics was interrupted during initialization.", e2);
        } catch (ExecutionException e3) {
            com.google.firebase.crashlytics.d.b.f().e("Problem encountered during Crashlytics initialization.", e3);
        } catch (TimeoutException e4) {
            com.google.firebase.crashlytics.d.b.f().e("Crashlytics timed out during initialization.", e4);
        }
    }

    public static String i() {
        return "17.3.0";
    }

    static boolean j(String str, boolean z) {
        if (!z) {
            com.google.firebase.crashlytics.d.b.f().b("Configured not to require a build ID.");
            return true;
        }
        if (!h.B(str)) {
            return true;
        }
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".     |  | ");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".   \\ |  | /");
        Log.e("FirebaseCrashlytics", ".    \\    /");
        Log.e("FirebaseCrashlytics", ".     \\  /");
        Log.e("FirebaseCrashlytics", ".      \\/");
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".      /\\");
        Log.e("FirebaseCrashlytics", ".     /  \\");
        Log.e("FirebaseCrashlytics", ".    /    \\");
        Log.e("FirebaseCrashlytics", ".   / |  | \\");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".");
        return false;
    }

    boolean e() {
        return this.f12438e.c();
    }

    public e.c.b.b.e.h<Void> g(com.google.firebase.crashlytics.d.p.e eVar) {
        return k0.b(this.f12445l, new a(eVar));
    }

    public void k(String str) {
        this.f12441h.Q0(System.currentTimeMillis() - this.f12437d, str);
    }

    public void l(Throwable th) {
        this.f12441h.H0(Thread.currentThread(), th);
    }

    void m() {
        this.f12446m.h(new c());
    }

    void n() {
        this.f12446m.b();
        this.f12438e.a();
        com.google.firebase.crashlytics.d.b.f().b("Initialization marker file created.");
    }

    public boolean o(com.google.firebase.crashlytics.d.p.e eVar) {
        String strP = h.p(this.a);
        com.google.firebase.crashlytics.d.b.f().b("Mapping file ID is: " + strP);
        if (!j(strP, h.l(this.a, "com.crashlytics.RequireBuildId", true))) {
            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
        }
        String strC = this.f12435b.j().c();
        try {
            com.google.firebase.crashlytics.d.b.f().g("Initializing Crashlytics " + i());
            com.google.firebase.crashlytics.d.l.i iVar = new com.google.firebase.crashlytics.d.l.i(this.a);
            this.f12439f = new n("crash_marker", iVar);
            this.f12438e = new n("initialization_marker", iVar);
            com.google.firebase.crashlytics.d.k.c cVar = new com.google.firebase.crashlytics.d.k.c();
            com.google.firebase.crashlytics.d.h.b bVarA = com.google.firebase.crashlytics.d.h.b.a(this.a, this.f12442i, strC, strP, new com.google.firebase.crashlytics.d.r.a(this.a));
            com.google.firebase.crashlytics.d.b.f().b("Installer package name is: " + bVarA.f12342c);
            this.f12441h = new k(this.a, this.f12446m, cVar, this.f12442i, this.f12436c, iVar, this.f12439f, bVarA, null, null, this.n, this.f12444k, eVar);
            boolean zE = e();
            d();
            this.f12441h.P(Thread.getDefaultUncaughtExceptionHandler(), eVar);
            if (!zE || !h.c(this.a)) {
                com.google.firebase.crashlytics.d.b.f().b("Exception handling initialization successful");
                return true;
            }
            com.google.firebase.crashlytics.d.b.f().b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
            h(eVar);
            return false;
        } catch (Exception e2) {
            com.google.firebase.crashlytics.d.b.f().e("Crashlytics was not started due to an exception during initialization", e2);
            this.f12441h = null;
            return false;
        }
    }

    public void p(Boolean bool) {
        this.f12436c.g(bool);
    }
}