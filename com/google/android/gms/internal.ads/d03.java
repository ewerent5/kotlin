package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class d03 {
    private final ExecutorService a = v03.b("Loader:ExtractorMediaPeriod");

    /* renamed from: b, reason: collision with root package name */
    private a03<? extends b03> f5402b;

    /* renamed from: c, reason: collision with root package name */
    private IOException f5403c;

    public d03(String str) {
    }

    public final <T extends b03> long a(T t, zz2<T> zz2Var, int i2) {
        Looper looperMyLooper = Looper.myLooper();
        f03.d(looperMyLooper != null);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new a03(this, looperMyLooper, t, zz2Var, i2, jElapsedRealtime).b(0L);
        return jElapsedRealtime;
    }

    public final boolean b() {
        return this.f5402b != null;
    }

    public final void c() {
        this.f5402b.c(false);
    }

    public final void d(Runnable runnable) {
        a03<? extends b03> a03Var = this.f5402b;
        if (a03Var != null) {
            a03Var.c(true);
        }
        this.a.execute(runnable);
        this.a.shutdown();
    }

    public final void e(int i2) throws IOException {
        IOException iOException = this.f5403c;
        if (iOException != null) {
            throw iOException;
        }
        a03<? extends b03> a03Var = this.f5402b;
        if (a03Var != null) {
            a03Var.a(a03Var.f4800g);
        }
    }
}