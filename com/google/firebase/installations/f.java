package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.android.gms.common.internal.p;
import com.google.firebase.installations.h;
import com.google.firebase.installations.q.d;
import com.google.firebase.installations.q.f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: FirebaseInstallations.java */
/* loaded from: classes.dex */
public class f implements g {
    private static final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadFactory f12789b = new a();

    /* renamed from: c, reason: collision with root package name */
    private final com.google.firebase.c f12790c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.firebase.installations.q.c f12791d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.firebase.installations.p.c f12792e;

    /* renamed from: f, reason: collision with root package name */
    private final o f12793f;

    /* renamed from: g, reason: collision with root package name */
    private final com.google.firebase.installations.p.b f12794g;

    /* renamed from: h, reason: collision with root package name */
    private final m f12795h;

    /* renamed from: i, reason: collision with root package name */
    private final Object f12796i;

    /* renamed from: j, reason: collision with root package name */
    private final ExecutorService f12797j;

    /* renamed from: k, reason: collision with root package name */
    private final ExecutorService f12798k;

    /* renamed from: l, reason: collision with root package name */
    private String f12799l;

    /* renamed from: m, reason: collision with root package name */
    private final List<n> f12800m;

    /* compiled from: FirebaseInstallations.java */
    class a implements ThreadFactory {
        private final AtomicInteger a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.a.getAndIncrement())));
        }
    }

    /* compiled from: FirebaseInstallations.java */
    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f12801b;

        static {
            int[] iArr = new int[f.b.values().length];
            f12801b = iArr;
            try {
                iArr[f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12801b[f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12801b[f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[d.b.values().length];
            a = iArr2;
            try {
                iArr2[d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    f(com.google.firebase.c cVar, com.google.firebase.n.a<com.google.firebase.p.i> aVar, com.google.firebase.n.a<com.google.firebase.m.d> aVar2) {
        this(new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f12789b), cVar, new com.google.firebase.installations.q.c(cVar.g(), aVar, aVar2), new com.google.firebase.installations.p.c(cVar), o.c(), new com.google.firebase.installations.p.b(cVar), new m());
    }

    private e.c.b.b.e.h<l> b() {
        e.c.b.b.e.i iVar = new e.c.b.b.e.i();
        d(new j(this.f12793f, iVar));
        return iVar.a();
    }

    private e.c.b.b.e.h<String> c() {
        e.c.b.b.e.i iVar = new e.c.b.b.e.i();
        d(new k(iVar));
        return iVar.a();
    }

    private void d(n nVar) {
        synchronized (this.f12796i) {
            this.f12800m.add(nVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(boolean z) {
        com.google.firebase.installations.p.d dVarV;
        com.google.firebase.installations.p.d dVarM = m();
        try {
            if (dVarM.i() || dVarM.l()) {
                dVarV = v(dVarM);
            } else {
                if (!z && !this.f12793f.f(dVarM)) {
                    return;
                }
                dVarV = g(dVarM);
            }
            p(dVarV);
            if (dVarV.k()) {
                y(dVarV.d());
            }
            if (dVarV.i()) {
                w(new h(h.a.BAD_CONFIG));
            } else if (dVarV.j()) {
                w(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
            } else {
                x(dVarV);
            }
        } catch (h e2) {
            w(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(boolean z) {
        com.google.firebase.installations.p.d dVarN = n();
        if (z) {
            dVarN = dVarN.p();
        }
        x(dVarN);
        this.f12798k.execute(e.a(this, z));
    }

    private com.google.firebase.installations.p.d g(com.google.firebase.installations.p.d dVar) throws h {
        com.google.firebase.installations.q.f fVarE = this.f12791d.e(h(), dVar.d(), o(), dVar.f());
        int i2 = b.f12801b[fVarE.b().ordinal()];
        if (i2 == 1) {
            return dVar.o(fVarE.c(), fVarE.d(), this.f12793f.b());
        }
        if (i2 == 2) {
            return dVar.q("BAD CONFIG");
        }
        if (i2 != 3) {
            throw new h("Firebase Installations Service is unavailable. Please try again later.", h.a.UNAVAILABLE);
        }
        y(null);
        return dVar.r();
    }

    private synchronized String j() {
        return this.f12799l;
    }

    public static f k() {
        return l(com.google.firebase.c.h());
    }

    public static f l(com.google.firebase.c cVar) {
        p.b(cVar != null, "Null is not a valid value of FirebaseApp.");
        return (f) cVar.f(g.class);
    }

    private com.google.firebase.installations.p.d m() {
        com.google.firebase.installations.p.d dVarC;
        synchronized (a) {
            com.google.firebase.installations.b bVarA = com.google.firebase.installations.b.a(this.f12790c.g(), "generatefid.lock");
            try {
                dVarC = this.f12792e.c();
            } finally {
                if (bVarA != null) {
                    bVarA.b();
                }
            }
        }
        return dVarC;
    }

    private com.google.firebase.installations.p.d n() {
        com.google.firebase.installations.p.d dVarC;
        synchronized (a) {
            com.google.firebase.installations.b bVarA = com.google.firebase.installations.b.a(this.f12790c.g(), "generatefid.lock");
            try {
                dVarC = this.f12792e.c();
                if (dVarC.j()) {
                    dVarC = this.f12792e.a(dVarC.t(u(dVarC)));
                }
            } finally {
                if (bVarA != null) {
                    bVarA.b();
                }
            }
        }
        return dVarC;
    }

    private void p(com.google.firebase.installations.p.d dVar) {
        synchronized (a) {
            com.google.firebase.installations.b bVarA = com.google.firebase.installations.b.a(this.f12790c.g(), "generatefid.lock");
            try {
                this.f12792e.a(dVar);
            } finally {
                if (bVarA != null) {
                    bVarA.b();
                }
            }
        }
    }

    private void t() {
        p.g(i(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        p.g(o(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        p.g(h(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        p.b(o.h(i()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        p.b(o.g(h()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    private String u(com.google.firebase.installations.p.d dVar) {
        if ((!this.f12790c.i().equals("CHIME_ANDROID_SDK") && !this.f12790c.q()) || !dVar.m()) {
            return this.f12795h.a();
        }
        String strF = this.f12794g.f();
        return TextUtils.isEmpty(strF) ? this.f12795h.a() : strF;
    }

    private com.google.firebase.installations.p.d v(com.google.firebase.installations.p.d dVar) throws h {
        com.google.firebase.installations.q.d dVarD = this.f12791d.d(h(), dVar.d(), o(), i(), (dVar.d() == null || dVar.d().length() != 11) ? null : this.f12794g.i());
        int i2 = b.a[dVarD.e().ordinal()];
        if (i2 == 1) {
            return dVar.s(dVarD.c(), dVarD.d(), this.f12793f.b(), dVarD.b().c(), dVarD.b().d());
        }
        if (i2 == 2) {
            return dVar.q("BAD CONFIG");
        }
        throw new h("Firebase Installations Service is unavailable. Please try again later.", h.a.UNAVAILABLE);
    }

    private void w(Exception exc) {
        synchronized (this.f12796i) {
            Iterator<n> it = this.f12800m.iterator();
            while (it.hasNext()) {
                if (it.next().a(exc)) {
                    it.remove();
                }
            }
        }
    }

    private void x(com.google.firebase.installations.p.d dVar) {
        synchronized (this.f12796i) {
            Iterator<n> it = this.f12800m.iterator();
            while (it.hasNext()) {
                if (it.next().b(dVar)) {
                    it.remove();
                }
            }
        }
    }

    private synchronized void y(String str) {
        this.f12799l = str;
    }

    @Override // com.google.firebase.installations.g
    public e.c.b.b.e.h<String> G() {
        t();
        String strJ = j();
        if (strJ != null) {
            return e.c.b.b.e.k.d(strJ);
        }
        e.c.b.b.e.h<String> hVarC = c();
        this.f12797j.execute(c.a(this));
        return hVarC;
    }

    @Override // com.google.firebase.installations.g
    public e.c.b.b.e.h<l> a(boolean z) {
        t();
        e.c.b.b.e.h<l> hVarB = b();
        this.f12797j.execute(d.a(this, z));
        return hVarB;
    }

    String h() {
        return this.f12790c.j().b();
    }

    String i() {
        return this.f12790c.j().c();
    }

    String o() {
        return this.f12790c.j().e();
    }

    f(ExecutorService executorService, com.google.firebase.c cVar, com.google.firebase.installations.q.c cVar2, com.google.firebase.installations.p.c cVar3, o oVar, com.google.firebase.installations.p.b bVar, m mVar) {
        this.f12796i = new Object();
        this.f12800m = new ArrayList();
        this.f12790c = cVar;
        this.f12791d = cVar2;
        this.f12792e = cVar3;
        this.f12793f = oVar;
        this.f12794g = bVar;
        this.f12795h = mVar;
        this.f12797j = executorService;
        this.f12798k = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f12789b);
    }
}