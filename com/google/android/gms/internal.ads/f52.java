package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
abstract class f52<T> extends AtomicReference<Runnable> implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private static final Runnable f5803e = new e52(null);

    /* renamed from: f, reason: collision with root package name */
    private static final Runnable f5804f = new e52(null);

    /* renamed from: g, reason: collision with root package name */
    private static final Runnable f5805g = new e52(null);

    f52() {
    }

    abstract T a();

    abstract String b();

    abstract boolean c();

    abstract void d(@NullableDecl T t, @NullableDecl Throwable th);

    final void e() {
        Runnable runnable = get();
        if ((runnable instanceof Thread) && compareAndSet(runnable, f5804f)) {
            try {
                Thread thread = (Thread) runnable;
                thread.interrupt();
                if (getAndSet(f5803e) == f5805g) {
                    LockSupport.unpark(thread);
                }
            } catch (Throwable th) {
                if (getAndSet(f5803e) == f5805g) {
                    LockSupport.unpark((Thread) runnable);
                }
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        T tA;
        Thread threadCurrentThread = Thread.currentThread();
        if (compareAndSet(null, threadCurrentThread)) {
            boolean z = !c();
            if (z) {
                try {
                    tA = a();
                } catch (Throwable th) {
                    if (!compareAndSet(threadCurrentThread, f5803e)) {
                        Runnable runnable = get();
                        boolean z2 = false;
                        int i2 = 0;
                        while (true) {
                            Runnable runnable2 = f5804f;
                            if (runnable != runnable2 && runnable != f5805g) {
                                break;
                            }
                            i2++;
                            if (i2 > 1000) {
                                Runnable runnable3 = f5805g;
                                if (runnable == runnable3 || compareAndSet(runnable2, runnable3)) {
                                    z2 = Thread.interrupted() || z2;
                                    LockSupport.park(this);
                                }
                            } else {
                                Thread.yield();
                            }
                            runnable = get();
                        }
                        if (z2) {
                            threadCurrentThread.interrupt();
                        }
                    }
                    d(null, th);
                    return;
                }
            } else {
                tA = null;
            }
            if (!compareAndSet(threadCurrentThread, f5803e)) {
                Runnable runnable4 = get();
                boolean z3 = false;
                int i3 = 0;
                while (true) {
                    Runnable runnable5 = f5804f;
                    if (runnable4 != runnable5 && runnable4 != f5805g) {
                        break;
                    }
                    i3++;
                    if (i3 > 1000) {
                        Runnable runnable6 = f5805g;
                        if (runnable4 == runnable6 || compareAndSet(runnable5, runnable6)) {
                            z3 = Thread.interrupted() || z3;
                            LockSupport.park(this);
                        }
                    } else {
                        Thread.yield();
                    }
                    runnable4 = get();
                }
                if (z3) {
                    threadCurrentThread.interrupt();
                }
            }
            if (z) {
                d(tA, null);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String string;
        Runnable runnable = get();
        if (runnable == f5803e) {
            string = "running=[DONE]";
        } else if (runnable == f5804f) {
            string = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 21);
            sb.append("running=[RUNNING ON ");
            sb.append(name);
            sb.append("]");
            string = sb.toString();
        } else {
            string = "running=[NOT STARTED YET]";
        }
        String strB = b();
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 2 + String.valueOf(strB).length());
        sb2.append(string);
        sb2.append(", ");
        sb2.append(strB);
        return sb2.toString();
    }
}