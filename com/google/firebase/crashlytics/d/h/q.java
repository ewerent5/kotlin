package com.google.firebase.crashlytics.d.h;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: CrashlyticsUncaughtExceptionHandler.java */
/* loaded from: classes.dex */
class q implements Thread.UncaughtExceptionHandler {
    private final a a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.crashlytics.d.p.e f12456b;

    /* renamed from: c, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f12457c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f12458d = new AtomicBoolean(false);

    /* compiled from: CrashlyticsUncaughtExceptionHandler.java */
    interface a {
        void a(com.google.firebase.crashlytics.d.p.e eVar, Thread thread, Throwable th);
    }

    public q(a aVar, com.google.firebase.crashlytics.d.p.e eVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = aVar;
        this.f12456b = eVar;
        this.f12457c = uncaughtExceptionHandler;
    }

    boolean a() {
        return this.f12458d.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Thread$UncaughtExceptionHandler] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Thread$UncaughtExceptionHandler] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.firebase.crashlytics.d.b] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Thread] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Thread] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.concurrent.atomic.AtomicBoolean] */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        this.f12458d.set(true);
        ?? r1 = "Crashlytics completed exception processing. Invoking default exception handler.";
        try {
            try {
                if (thread == 0) {
                    com.google.firebase.crashlytics.d.b.f().d("Could not handle uncaught exception; null thread");
                } else if (th == null) {
                    com.google.firebase.crashlytics.d.b.f().d("Could not handle uncaught exception; null throwable");
                } else {
                    this.a.a(this.f12456b, thread, th);
                }
            } catch (Exception e2) {
                com.google.firebase.crashlytics.d.b.f().e("An error occurred in the uncaught exception handler", e2);
            }
            com.google.firebase.crashlytics.d.b.f().b("Crashlytics completed exception processing. Invoking default exception handler.");
            r1 = this.f12457c;
            r1.uncaughtException(thread, th);
            thread = this.f12458d;
            thread.set(false);
        } catch (Throwable th2) {
            com.google.firebase.crashlytics.d.b.f().b(r1);
            this.f12457c.uncaughtException(thread, th);
            this.f12458d.set(false);
            throw th2;
        }
    }
}