package com.google.firebase.crashlytics.d;

import android.util.Log;

/* compiled from: Logger.java */
/* loaded from: classes.dex */
public class b {
    static final b a = new b("FirebaseCrashlytics");

    /* renamed from: b, reason: collision with root package name */
    private final String f12313b;

    /* renamed from: c, reason: collision with root package name */
    private int f12314c = 4;

    public b(String str) {
        this.f12313b = str;
    }

    private boolean a(int i2) {
        return this.f12314c <= i2 || Log.isLoggable(this.f12313b, i2);
    }

    public static b f() {
        return a;
    }

    public void b(String str) {
        c(str, null);
    }

    public void c(String str, Throwable th) {
        if (a(3)) {
            Log.d(this.f12313b, str, th);
        }
    }

    public void d(String str) {
        e(str, null);
    }

    public void e(String str, Throwable th) {
        if (a(6)) {
            Log.e(this.f12313b, str, th);
        }
    }

    public void g(String str) {
        h(str, null);
    }

    public void h(String str, Throwable th) {
        if (a(4)) {
            Log.i(this.f12313b, str, th);
        }
    }

    public void i(String str) {
        j(str, null);
    }

    public void j(String str, Throwable th) {
        if (a(5)) {
            Log.w(this.f12313b, str, th);
        }
    }
}