package e.c.b.b.e;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-tasks@@17.0.2 */
/* loaded from: classes.dex */
public final class k {

    /* compiled from: com.google.android.gms:play-services-tasks@@17.0.2 */
    private static final class b implements c {
        private final Object a = new Object();

        /* renamed from: b, reason: collision with root package name */
        private final int f15021b;

        /* renamed from: c, reason: collision with root package name */
        private final d0<Void> f15022c;

        /* renamed from: d, reason: collision with root package name */
        @GuardedBy("mLock")
        private int f15023d;

        /* renamed from: e, reason: collision with root package name */
        @GuardedBy("mLock")
        private int f15024e;

        /* renamed from: f, reason: collision with root package name */
        @GuardedBy("mLock")
        private int f15025f;

        /* renamed from: g, reason: collision with root package name */
        @GuardedBy("mLock")
        private Exception f15026g;

        /* renamed from: h, reason: collision with root package name */
        @GuardedBy("mLock")
        private boolean f15027h;

        public b(int i2, d0<Void> d0Var) {
            this.f15021b = i2;
            this.f15022c = d0Var;
        }

        @GuardedBy("mLock")
        private final void b() {
            if (this.f15023d + this.f15024e + this.f15025f == this.f15021b) {
                if (this.f15026g == null) {
                    if (this.f15027h) {
                        this.f15022c.s();
                        return;
                    } else {
                        this.f15022c.r(null);
                        return;
                    }
                }
                d0<Void> d0Var = this.f15022c;
                int i2 = this.f15024e;
                int i3 = this.f15021b;
                StringBuilder sb = new StringBuilder(54);
                sb.append(i2);
                sb.append(" out of ");
                sb.append(i3);
                sb.append(" underlying tasks failed");
                d0Var.q(new ExecutionException(sb.toString(), this.f15026g));
            }
        }

        @Override // e.c.b.b.e.d
        public final void a(Exception exc) {
            synchronized (this.a) {
                this.f15024e++;
                this.f15026g = exc;
                b();
            }
        }

        @Override // e.c.b.b.e.b
        public final void c() {
            synchronized (this.a) {
                this.f15025f++;
                this.f15027h = true;
                b();
            }
        }

        @Override // e.c.b.b.e.e
        public final void onSuccess(Object obj) {
            synchronized (this.a) {
                this.f15023d++;
                b();
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-tasks@@17.0.2 */
    interface c extends e.c.b.b.e.b, d, e<Object> {
    }

    public static <TResult> TResult a(h<TResult> hVar, long j2, TimeUnit timeUnit) throws TimeoutException {
        com.google.android.gms.common.internal.p.h();
        com.google.android.gms.common.internal.p.k(hVar, "Task must not be null");
        com.google.android.gms.common.internal.p.k(timeUnit, "TimeUnit must not be null");
        if (hVar.m()) {
            return (TResult) i(hVar);
        }
        a aVar = new a(null);
        j(hVar, aVar);
        if (aVar.b(j2, timeUnit)) {
            return (TResult) i(hVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static <TResult> h<TResult> b(Executor executor, Callable<TResult> callable) {
        com.google.android.gms.common.internal.p.k(executor, "Executor must not be null");
        com.google.android.gms.common.internal.p.k(callable, "Callback must not be null");
        d0 d0Var = new d0();
        executor.execute(new h0(d0Var, callable));
        return d0Var;
    }

    public static <TResult> h<TResult> c(Exception exc) {
        d0 d0Var = new d0();
        d0Var.q(exc);
        return d0Var;
    }

    public static <TResult> h<TResult> d(TResult tresult) {
        d0 d0Var = new d0();
        d0Var.r(tresult);
        return d0Var;
    }

    public static h<Void> e(Collection<? extends h<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return d(null);
        }
        Iterator<? extends h<?>> it = collection.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next(), "null tasks are not accepted");
        }
        d0 d0Var = new d0();
        b bVar = new b(collection.size(), d0Var);
        Iterator<? extends h<?>> it2 = collection.iterator();
        while (it2.hasNext()) {
            j(it2.next(), bVar);
        }
        return d0Var;
    }

    public static h<Void> f(h<?>... hVarArr) {
        return (hVarArr == null || hVarArr.length == 0) ? d(null) : e(Arrays.asList(hVarArr));
    }

    public static h<List<h<?>>> g(Collection<? extends h<?>> collection) {
        return (collection == null || collection.isEmpty()) ? d(Collections.emptyList()) : e(collection).h(new l(collection));
    }

    public static h<List<h<?>>> h(h<?>... hVarArr) {
        return (hVarArr == null || hVarArr.length == 0) ? d(Collections.emptyList()) : g(Arrays.asList(hVarArr));
    }

    private static <TResult> TResult i(h<TResult> hVar) throws ExecutionException {
        if (hVar.n()) {
            return hVar.k();
        }
        if (hVar.l()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(hVar.j());
    }

    private static void j(h<?> hVar, c cVar) {
        Executor executor = j.f15019b;
        hVar.e(executor, cVar);
        hVar.d(executor, cVar);
        hVar.a(executor, cVar);
    }

    /* compiled from: com.google.android.gms:play-services-tasks@@17.0.2 */
    private static final class a implements c {
        private final CountDownLatch a;

        private a() {
            this.a = new CountDownLatch(1);
        }

        @Override // e.c.b.b.e.d
        public final void a(Exception exc) {
            this.a.countDown();
        }

        public final boolean b(long j2, TimeUnit timeUnit) {
            return this.a.await(j2, timeUnit);
        }

        @Override // e.c.b.b.e.b
        public final void c() {
            this.a.countDown();
        }

        @Override // e.c.b.b.e.e
        public final void onSuccess(Object obj) {
            this.a.countDown();
        }

        /* synthetic */ a(h0 h0Var) {
            this();
        }
    }
}