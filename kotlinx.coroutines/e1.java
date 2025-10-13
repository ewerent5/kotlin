package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: Executors.kt */
/* loaded from: classes3.dex */
public abstract class e1 extends d1 {

    /* renamed from: g, reason: collision with root package name */
    private boolean f16942g;

    private final void h0(i.v.g gVar, RejectedExecutionException rejectedExecutionException) {
        s1.c(gVar, c1.a("The task was rejected", rejectedExecutionException));
    }

    @Override // kotlinx.coroutines.d0
    public void Z(i.v.g gVar, Runnable runnable) {
        Runnable runnableA;
        try {
            Executor executorB0 = b0();
            k2 k2VarA = l2.a();
            if (k2VarA == null || (runnableA = k2VarA.a(runnable)) == null) {
                runnableA = runnable;
            }
            executorB0.execute(runnableA);
        } catch (RejectedExecutionException e2) {
            k2 k2VarA2 = l2.a();
            if (k2VarA2 != null) {
                k2VarA2.c();
            }
            h0(gVar, e2);
            t0.b().Z(gVar, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor executorB0 = b0();
        if (!(executorB0 instanceof ExecutorService)) {
            executorB0 = null;
        }
        ExecutorService executorService = (ExecutorService) executorB0;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof e1) && ((e1) obj).b0() == b0();
    }

    public int hashCode() {
        return System.identityHashCode(b0());
    }

    public final void j0() {
        this.f16942g = kotlinx.coroutines.internal.d.a(b0());
    }

    @Override // kotlinx.coroutines.d0
    public String toString() {
        return b0().toString();
    }
}