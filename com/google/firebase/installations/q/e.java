package com.google.firebase.installations.q;

import com.google.firebase.installations.o;
import java.util.concurrent.TimeUnit;

/* compiled from: RequestLimiter.java */
/* loaded from: classes.dex */
class e {
    private static final long a = TimeUnit.HOURS.toMillis(24);

    /* renamed from: b, reason: collision with root package name */
    private static final long f12854b = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: c, reason: collision with root package name */
    private final o f12855c = o.c();

    /* renamed from: d, reason: collision with root package name */
    private long f12856d;

    /* renamed from: e, reason: collision with root package name */
    private int f12857e;

    e() {
    }

    private synchronized long a(int i2) {
        if (c(i2)) {
            return (long) Math.min(Math.pow(2.0d, this.f12857e) + this.f12855c.e(), f12854b);
        }
        return a;
    }

    private static boolean c(int i2) {
        return i2 == 429 || (i2 >= 500 && i2 < 600);
    }

    private static boolean d(int i2) {
        return (i2 >= 200 && i2 < 300) || i2 == 401 || i2 == 404;
    }

    private synchronized void e() {
        this.f12857e = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean b() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f12857e     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L14
            com.google.firebase.installations.o r0 = r5.f12855c     // Catch: java.lang.Throwable -> L17
            long r0 = r0.a()     // Catch: java.lang.Throwable -> L17
            long r2 = r5.f12856d     // Catch: java.lang.Throwable -> L17
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L12
            goto L14
        L12:
            r0 = 0
            goto L15
        L14:
            r0 = 1
        L15:
            monitor-exit(r5)
            return r0
        L17:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.q.e.b():boolean");
    }

    public synchronized void f(int i2) {
        if (d(i2)) {
            e();
            return;
        }
        this.f12857e++;
        this.f12856d = this.f12855c.a() + a(i2);
    }
}