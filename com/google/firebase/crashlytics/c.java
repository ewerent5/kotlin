package com.google.firebase.crashlytics;

import android.content.Context;
import com.google.firebase.analytics.a.a;
import com.google.firebase.crashlytics.d.e;
import com.google.firebase.crashlytics.d.f.f;
import com.google.firebase.crashlytics.d.h.m;
import com.google.firebase.crashlytics.d.h.s;
import com.google.firebase.crashlytics.d.h.v;
import com.google.firebase.crashlytics.d.h.x;
import com.google.firebase.crashlytics.d.p.d;
import com.google.firebase.installations.g;
import e.c.b.b.e.k;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: FirebaseCrashlytics.java */
/* loaded from: classes.dex */
public class c {
    private final m a;

    /* compiled from: FirebaseCrashlytics.java */
    class a implements Callable<Void> {
        final /* synthetic */ e a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ExecutorService f12309b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f12310c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f12311d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ m f12312e;

        a(e eVar, ExecutorService executorService, d dVar, boolean z, m mVar) {
            this.a = eVar;
            this.f12309b = executorService;
            this.f12310c = dVar;
            this.f12311d = z;
            this.f12312e = mVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            this.a.c(this.f12309b, this.f12310c);
            if (!this.f12311d) {
                return null;
            }
            this.f12312e.g(this.f12310c);
            return null;
        }
    }

    private c(m mVar) {
        this.a = mVar;
    }

    public static c a() {
        c cVar = (c) com.google.firebase.c.h().f(c.class);
        Objects.requireNonNull(cVar, "FirebaseCrashlytics component is not present.");
        return cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [com.google.firebase.crashlytics.d.f.b, com.google.firebase.crashlytics.d.f.d] */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.google.firebase.crashlytics.d.f.e] */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.google.firebase.crashlytics.a] */
    /* JADX WARN: Type inference failed for: r6v2, types: [com.google.firebase.crashlytics.d.f.b, com.google.firebase.crashlytics.d.f.c] */
    static c b(com.google.firebase.c cVar, g gVar, com.google.firebase.crashlytics.d.a aVar, com.google.firebase.analytics.a.a aVar2) {
        f fVar;
        com.google.firebase.crashlytics.d.g.c cVar2;
        Context contextG = cVar.g();
        x xVar = new x(contextG, contextG.getPackageName(), gVar);
        s sVar = new s(cVar);
        com.google.firebase.crashlytics.d.a cVar3 = aVar == null ? new com.google.firebase.crashlytics.d.c() : aVar;
        e eVar = new e(cVar, contextG, xVar, sVar);
        if (aVar2 != null) {
            com.google.firebase.crashlytics.d.b.f().b("Firebase Analytics is available.");
            ?? eVar2 = new com.google.firebase.crashlytics.d.f.e(aVar2);
            ?? aVar3 = new com.google.firebase.crashlytics.a();
            if (e(aVar2, aVar3) != null) {
                com.google.firebase.crashlytics.d.b.f().b("Firebase Analytics listener registered successfully.");
                ?? dVar = new com.google.firebase.crashlytics.d.f.d();
                ?? cVar4 = new com.google.firebase.crashlytics.d.f.c(eVar2, 500, TimeUnit.MILLISECONDS);
                aVar3.d(dVar);
                aVar3.e(cVar4);
                fVar = cVar4;
                cVar2 = dVar;
            } else {
                com.google.firebase.crashlytics.d.b.f().b("Firebase Analytics listener registration failed.");
                cVar2 = new com.google.firebase.crashlytics.d.g.c();
                fVar = eVar2;
            }
        } else {
            com.google.firebase.crashlytics.d.b.f().b("Firebase Analytics is unavailable.");
            cVar2 = new com.google.firebase.crashlytics.d.g.c();
            fVar = new f();
        }
        m mVar = new m(cVar, xVar, cVar3, sVar, cVar2, fVar, v.c("Crashlytics Exception Handler"));
        if (!eVar.h()) {
            com.google.firebase.crashlytics.d.b.f().d("Unable to start Crashlytics.");
            return null;
        }
        ExecutorService executorServiceC = v.c("com.google.firebase.crashlytics.startup");
        d dVarL = eVar.l(contextG, cVar, executorServiceC);
        k.b(executorServiceC, new a(eVar, executorServiceC, dVarL, mVar.o(dVarL), mVar));
        return new c(mVar);
    }

    private static a.InterfaceC0127a e(com.google.firebase.analytics.a.a aVar, com.google.firebase.crashlytics.a aVar2) {
        a.InterfaceC0127a interfaceC0127aF = aVar.f("clx", aVar2);
        if (interfaceC0127aF == null) {
            com.google.firebase.crashlytics.d.b.f().b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            interfaceC0127aF = aVar.f("crash", aVar2);
            if (interfaceC0127aF != null) {
                com.google.firebase.crashlytics.d.b.f().i("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return interfaceC0127aF;
    }

    public void c(Throwable th) {
        if (th == null) {
            com.google.firebase.crashlytics.d.b.f().i("Crashlytics is ignoring a request to log a null exception.");
        } else {
            this.a.l(th);
        }
    }

    public void d(boolean z) {
        this.a.p(Boolean.valueOf(z));
    }
}