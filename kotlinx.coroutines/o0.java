package kotlinx.coroutines;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* compiled from: DefaultExecutor.kt */
/* loaded from: classes3.dex */
public final class o0 extends y0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: k, reason: collision with root package name */
    private static final long f17023k;

    /* renamed from: l, reason: collision with root package name */
    public static final o0 f17024l;

    static {
        Long l2;
        o0 o0Var = new o0();
        f17024l = o0Var;
        x0.r0(o0Var, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        f17023k = timeUnit.toNanos(l2.longValue());
    }

    private o0() {
    }

    private final synchronized void g1() {
        if (i1()) {
            debugStatus = 3;
            b1();
            notifyAll();
        }
    }

    private final synchronized Thread h1() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final boolean i1() {
        int i2 = debugStatus;
        return i2 == 2 || i2 == 3;
    }

    private final synchronized boolean j1() {
        if (i1()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    @Override // kotlinx.coroutines.z0
    protected Thread I0() {
        Thread thread = _thread;
        return thread != null ? thread : h1();
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zZ0;
        j2.f17004b.d(this);
        k2 k2VarA = l2.a();
        if (k2VarA != null) {
            k2VarA.b();
        }
        try {
            if (!j1()) {
                if (zZ0) {
                    return;
                } else {
                    return;
                }
            }
            long j2 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jC0 = C0();
                if (jC0 == Long.MAX_VALUE) {
                    k2 k2VarA2 = l2.a();
                    long jNanoTime = k2VarA2 != null ? k2VarA2.nanoTime() : System.nanoTime();
                    if (j2 == Long.MAX_VALUE) {
                        j2 = f17023k + jNanoTime;
                    }
                    long j3 = j2 - jNanoTime;
                    if (j3 <= 0) {
                        _thread = null;
                        g1();
                        k2 k2VarA3 = l2.a();
                        if (k2VarA3 != null) {
                            k2VarA3.f();
                        }
                        if (Z0()) {
                            return;
                        }
                        I0();
                        return;
                    }
                    jC0 = i.a0.f.e(jC0, j3);
                } else {
                    j2 = Long.MAX_VALUE;
                }
                if (jC0 > 0) {
                    if (i1()) {
                        _thread = null;
                        g1();
                        k2 k2VarA4 = l2.a();
                        if (k2VarA4 != null) {
                            k2VarA4.f();
                        }
                        if (Z0()) {
                            return;
                        }
                        I0();
                        return;
                    }
                    k2 k2VarA5 = l2.a();
                    if (k2VarA5 != null) {
                        k2VarA5.e(this, jC0);
                    } else {
                        LockSupport.parkNanos(this, jC0);
                    }
                }
            }
        } finally {
            _thread = null;
            g1();
            k2 k2VarA6 = l2.a();
            if (k2VarA6 != null) {
                k2VarA6.f();
            }
            if (!Z0()) {
                I0();
            }
        }
    }
}