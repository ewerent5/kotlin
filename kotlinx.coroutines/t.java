package kotlinx.coroutines;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: CommonPool.kt */
/* loaded from: classes3.dex */
public final class t extends d1 {

    /* renamed from: g, reason: collision with root package name */
    private static final int f17097g;

    /* renamed from: h, reason: collision with root package name */
    private static boolean f17098h;

    /* renamed from: i, reason: collision with root package name */
    public static final t f17099i = new t();
    private static volatile Executor pool;

    /* compiled from: CommonPool.kt */
    static final class a implements ThreadFactory {
        final /* synthetic */ AtomicInteger a;

        a(AtomicInteger atomicInteger) {
            this.a = atomicInteger;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "CommonPool-worker-" + this.a.incrementAndGet());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* compiled from: CommonPool.kt */
    static final class b implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        public static final b f17100e = new b();

        b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    static {
        String property;
        int iIntValue;
        try {
            property = System.getProperty("kotlinx.coroutines.default.parallelism");
        } catch (Throwable unused) {
            property = null;
        }
        if (property != null) {
            Integer numI = i.d0.o.i(property);
            if (numI == null || numI.intValue() < 1) {
                throw new IllegalStateException(("Expected positive number in kotlinx.coroutines.default.parallelism, but has " + property).toString());
            }
            iIntValue = numI.intValue();
        } else {
            iIntValue = -1;
        }
        f17097g = iIntValue;
    }

    private t() {
    }

    private final ExecutorService h0() {
        return Executors.newFixedThreadPool(l0(), new a(new AtomicInteger()));
    }

    private final ExecutorService j0() {
        Class<?> cls;
        ExecutorService executorService;
        if (System.getSecurityManager() != null) {
            return h0();
        }
        ExecutorService executorService2 = null;
        try {
            cls = Class.forName("java.util.concurrent.ForkJoinPool");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return h0();
        }
        if (!f17098h && f17097g < 0) {
            try {
                Method method = cls.getMethod("commonPool", new Class[0]);
                Object objInvoke = method != null ? method.invoke(null, new Object[0]) : null;
                if (!(objInvoke instanceof ExecutorService)) {
                    objInvoke = null;
                }
                executorService = (ExecutorService) objInvoke;
            } catch (Throwable unused2) {
                executorService = null;
            }
            if (executorService != null) {
                if (!f17099i.q0(cls, executorService)) {
                    executorService = null;
                }
                if (executorService != null) {
                    return executorService;
                }
            }
        }
        try {
            Object objNewInstance = cls.getConstructor(Integer.TYPE).newInstance(Integer.valueOf(f17099i.l0()));
            if (!(objNewInstance instanceof ExecutorService)) {
                objNewInstance = null;
            }
            executorService2 = (ExecutorService) objNewInstance;
        } catch (Throwable unused3) {
        }
        return executorService2 != null ? executorService2 : h0();
    }

    private final synchronized Executor k0() {
        Executor executorJ0;
        executorJ0 = pool;
        if (executorJ0 == null) {
            executorJ0 = j0();
            pool = executorJ0;
        }
        return executorJ0;
    }

    private final int l0() {
        Integer numValueOf = Integer.valueOf(f17097g);
        if (!(numValueOf.intValue() > 0)) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i.a0.f.b(Runtime.getRuntime().availableProcessors() - 1, 1);
    }

    @Override // kotlinx.coroutines.d0
    public void Z(i.v.g gVar, Runnable runnable) {
        Runnable runnableA;
        try {
            Executor executorK0 = pool;
            if (executorK0 == null) {
                executorK0 = k0();
            }
            k2 k2VarA = l2.a();
            if (k2VarA == null || (runnableA = k2VarA.a(runnable)) == null) {
                runnableA = runnable;
            }
            executorK0.execute(runnableA);
        } catch (RejectedExecutionException unused) {
            k2 k2VarA2 = l2.a();
            if (k2VarA2 != null) {
                k2VarA2.c();
            }
            o0.f17024l.W0(runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Close cannot be invoked on CommonPool".toString());
    }

    public final boolean q0(Class<?> cls, ExecutorService executorService) {
        executorService.submit(b.f17100e);
        Integer num = null;
        try {
            Object objInvoke = cls.getMethod("getPoolSize", new Class[0]).invoke(executorService, new Object[0]);
            if (!(objInvoke instanceof Integer)) {
                objInvoke = null;
            }
            num = (Integer) objInvoke;
        } catch (Throwable unused) {
        }
        return num != null && num.intValue() >= 1;
    }

    @Override // kotlinx.coroutines.d0
    public String toString() {
        return "CommonPool";
    }
}