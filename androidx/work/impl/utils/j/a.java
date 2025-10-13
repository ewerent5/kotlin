package androidx.work.impl.utils.j;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: AbstractFuture.java */
/* loaded from: classes.dex */
public abstract class a<V> implements e.c.c.a.a.a<V> {

    /* renamed from: e, reason: collision with root package name */
    static final boolean f2370e = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: f, reason: collision with root package name */
    private static final Logger f2371f = Logger.getLogger(a.class.getName());

    /* renamed from: g, reason: collision with root package name */
    static final b f2372g;

    /* renamed from: h, reason: collision with root package name */
    private static final Object f2373h;

    /* renamed from: i, reason: collision with root package name */
    volatile Object f2374i;

    /* renamed from: j, reason: collision with root package name */
    volatile e f2375j;

    /* renamed from: k, reason: collision with root package name */
    volatile i f2376k;

    /* compiled from: AbstractFuture.java */
    private static abstract class b {
        private b() {
        }

        abstract boolean a(a<?> aVar, e eVar, e eVar2);

        abstract boolean b(a<?> aVar, Object obj, Object obj2);

        abstract boolean c(a<?> aVar, i iVar, i iVar2);

        abstract void d(i iVar, i iVar2);

        abstract void e(i iVar, Thread thread);
    }

    /* compiled from: AbstractFuture.java */
    private static final class c {
        static final c a;

        /* renamed from: b, reason: collision with root package name */
        static final c f2377b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f2378c;

        /* renamed from: d, reason: collision with root package name */
        final Throwable f2379d;

        static {
            if (a.f2370e) {
                f2377b = null;
                a = null;
            } else {
                f2377b = new c(false, null);
                a = new c(true, null);
            }
        }

        c(boolean z, Throwable th) {
            this.f2378c = z;
            this.f2379d = th;
        }
    }

    /* compiled from: AbstractFuture.java */
    private static final class d {
        static final d a = new d(new C0037a("Failure occurred while trying to finish a future."));

        /* renamed from: b, reason: collision with root package name */
        final Throwable f2380b;

        /* compiled from: AbstractFuture.java */
        /* renamed from: androidx.work.impl.utils.j.a$d$a, reason: collision with other inner class name */
        static class C0037a extends Throwable {
            C0037a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f2380b = (Throwable) a.e(th);
        }
    }

    /* compiled from: AbstractFuture.java */
    private static final class e {
        static final e a = new e(null, null);

        /* renamed from: b, reason: collision with root package name */
        final Runnable f2381b;

        /* renamed from: c, reason: collision with root package name */
        final Executor f2382c;

        /* renamed from: d, reason: collision with root package name */
        e f2383d;

        e(Runnable runnable, Executor executor) {
            this.f2381b = runnable;
            this.f2382c = executor;
        }
    }

    /* compiled from: AbstractFuture.java */
    private static final class f extends b {
        final AtomicReferenceFieldUpdater<i, Thread> a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, i> f2384b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, i> f2385c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, e> f2386d;

        /* renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, Object> f2387e;

        f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.a = atomicReferenceFieldUpdater;
            this.f2384b = atomicReferenceFieldUpdater2;
            this.f2385c = atomicReferenceFieldUpdater3;
            this.f2386d = atomicReferenceFieldUpdater4;
            this.f2387e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.work.impl.utils.j.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            return this.f2386d.compareAndSet(aVar, eVar, eVar2);
        }

        @Override // androidx.work.impl.utils.j.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            return this.f2387e.compareAndSet(aVar, obj, obj2);
        }

        @Override // androidx.work.impl.utils.j.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            return this.f2385c.compareAndSet(aVar, iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.j.a.b
        void d(i iVar, i iVar2) {
            this.f2384b.lazySet(iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.j.a.b
        void e(i iVar, Thread thread) {
            this.a.lazySet(iVar, thread);
        }
    }

    /* compiled from: AbstractFuture.java */
    private static final class g<V> implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final a<V> f2388e;

        /* renamed from: f, reason: collision with root package name */
        final e.c.c.a.a.a<? extends V> f2389f;

        g(a<V> aVar, e.c.c.a.a.a<? extends V> aVar2) {
            this.f2388e = aVar;
            this.f2389f = aVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2388e.f2374i != this) {
                return;
            }
            if (a.f2372g.b(this.f2388e, this, a.j(this.f2389f))) {
                a.g(this.f2388e);
            }
        }
    }

    /* compiled from: AbstractFuture.java */
    private static final class h extends b {
        h() {
            super();
        }

        @Override // androidx.work.impl.utils.j.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                if (aVar.f2375j != eVar) {
                    return false;
                }
                aVar.f2375j = eVar2;
                return true;
            }
        }

        @Override // androidx.work.impl.utils.j.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f2374i != obj) {
                    return false;
                }
                aVar.f2374i = obj2;
                return true;
            }
        }

        @Override // androidx.work.impl.utils.j.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                if (aVar.f2376k != iVar) {
                    return false;
                }
                aVar.f2376k = iVar2;
                return true;
            }
        }

        @Override // androidx.work.impl.utils.j.a.b
        void d(i iVar, i iVar2) {
            iVar.f2391c = iVar2;
        }

        @Override // androidx.work.impl.utils.j.a.b
        void e(i iVar, Thread thread) {
            iVar.f2390b = thread;
        }
    }

    /* compiled from: AbstractFuture.java */
    private static final class i {
        static final i a = new i(false);

        /* renamed from: b, reason: collision with root package name */
        volatile Thread f2390b;

        /* renamed from: c, reason: collision with root package name */
        volatile i f2391c;

        i(boolean z) {
        }

        void a(i iVar) {
            a.f2372g.d(this, iVar);
        }

        void b() {
            Thread thread = this.f2390b;
            if (thread != null) {
                this.f2390b = null;
                LockSupport.unpark(thread);
            }
        }

        i() {
            a.f2372g.e(this, Thread.currentThread());
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "b"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a.class, i.class, "k"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "j"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, IntegerTokenConverter.CONVERTER_KEY));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        f2372g = hVar;
        if (th != null) {
            f2371f.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f2373h = new Object();
    }

    protected a() {
    }

    private void b(StringBuilder sb) {
        try {
            Object objK = k(this);
            sb.append("SUCCESS, result=[");
            sb.append(s(objK));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    private static CancellationException d(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    static <T> T e(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    private e f(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f2375j;
        } while (!f2372g.a(this, eVar2, e.a));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f2383d;
            eVar4.f2383d = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    static void g(a<?> aVar) {
        e eVar = null;
        while (true) {
            aVar.n();
            aVar.c();
            e eVarF = aVar.f(eVar);
            while (eVarF != null) {
                eVar = eVarF.f2383d;
                Runnable runnable = eVarF.f2381b;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f2388e;
                    if (aVar.f2374i == gVar) {
                        if (f2372g.b(aVar, gVar, j(gVar.f2389f))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    h(runnable, eVarF.f2382c);
                }
                eVarF = eVar;
            }
            return;
        }
    }

    private static void h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            f2371f.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V i(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw d("Task was cancelled.", ((c) obj).f2379d);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f2380b);
        }
        if (obj == f2373h) {
            return null;
        }
        return obj;
    }

    static Object j(e.c.c.a.a.a<?> aVar) {
        if (aVar instanceof a) {
            Object obj = ((a) aVar).f2374i;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            return cVar.f2378c ? cVar.f2379d != null ? new c(false, cVar.f2379d) : c.f2377b : obj;
        }
        boolean zIsCancelled = aVar.isCancelled();
        if ((!f2370e) && zIsCancelled) {
            return c.f2377b;
        }
        try {
            Object objK = k(aVar);
            return objK == null ? f2373h : objK;
        } catch (CancellationException e2) {
            if (zIsCancelled) {
                return new c(false, e2);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + aVar, e2));
        } catch (ExecutionException e3) {
            return new d(e3.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    private static <V> V k(Future<V> future) {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    private void n() {
        i iVar;
        do {
            iVar = this.f2376k;
        } while (!f2372g.c(this, iVar, i.a));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f2391c;
        }
    }

    private void o(i iVar) {
        iVar.f2390b = null;
        while (true) {
            i iVar2 = this.f2376k;
            if (iVar2 == i.a) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f2391c;
                if (iVar2.f2390b != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f2391c = iVar4;
                    if (iVar3.f2390b == null) {
                        break;
                    }
                } else if (!f2372g.c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    private String s(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    @Override // e.c.c.a.a.a
    public final void a(Runnable runnable, Executor executor) {
        e(runnable);
        e(executor);
        e eVar = this.f2375j;
        if (eVar != e.a) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f2383d = eVar;
                if (f2372g.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f2375j;
                }
            } while (eVar != e.a);
        }
        h(runnable, executor);
    }

    protected void c() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.f2374i;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        c cVar = f2370e ? new c(z, new CancellationException("Future.cancel() was called.")) : z ? c.a : c.f2377b;
        boolean z2 = false;
        a<V> aVar = this;
        while (true) {
            if (f2372g.b(aVar, obj, cVar)) {
                if (z) {
                    aVar.l();
                }
                g(aVar);
                if (!(obj instanceof g)) {
                    return true;
                }
                e.c.c.a.a.a<? extends V> aVar2 = ((g) obj).f2389f;
                if (!(aVar2 instanceof a)) {
                    aVar2.cancel(z);
                    return true;
                }
                aVar = (a) aVar2;
                obj = aVar.f2374i;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z2 = true;
            } else {
                obj = aVar.f2374i;
                if (!(obj instanceof g)) {
                    return z2;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final V get(long j2, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f2374i;
        if ((obj != null) && (!(obj instanceof g))) {
            return i(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f2376k;
            if (iVar != i.a) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f2372g.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                o(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f2374i;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return i(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        o(iVar2);
                    } else {
                        iVar = this.f2376k;
                    }
                } while (iVar != i.a);
            }
            return i(this.f2374i);
        }
        while (nanos > 0) {
            Object obj3 = this.f2374i;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return i(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j3 = -nanos;
            long jConvert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String str3 = str2 + jConvert + " " + lowerCase;
                if (z) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f2374i instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof g)) & (this.f2374i != null);
    }

    protected void l() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String m() {
        Object obj = this.f2374i;
        if (obj instanceof g) {
            return "setFuture=[" + s(((g) obj).f2389f) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    protected boolean p(V v) {
        if (v == null) {
            v = (V) f2373h;
        }
        if (!f2372g.b(this, null, v)) {
            return false;
        }
        g(this);
        return true;
    }

    protected boolean q(Throwable th) {
        if (!f2372g.b(this, null, new d((Throwable) e(th)))) {
            return false;
        }
        g(this);
        return true;
    }

    protected boolean r(e.c.c.a.a.a<? extends V> aVar) {
        d dVar;
        e(aVar);
        Object obj = this.f2374i;
        if (obj == null) {
            if (aVar.isDone()) {
                if (!f2372g.b(this, null, j(aVar))) {
                    return false;
                }
                g(this);
                return true;
            }
            g gVar = new g(this, aVar);
            if (f2372g.b(this, null, gVar)) {
                try {
                    aVar.a(gVar, androidx.work.impl.utils.j.b.INSTANCE);
                } catch (Throwable th) {
                    try {
                        dVar = new d(th);
                    } catch (Throwable unused) {
                        dVar = d.a;
                    }
                    f2372g.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.f2374i;
        }
        if (obj instanceof c) {
            aVar.cancel(((c) obj).f2378c);
        }
        return false;
    }

    public String toString() {
        String strM;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                strM = m();
            } catch (RuntimeException e2) {
                strM = "Exception thrown from implementation: " + e2.getClass();
            }
            if (strM != null && !strM.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strM);
                sb.append("]");
            } else if (isDone()) {
                b(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f2374i;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return i(obj2);
            }
            i iVar = this.f2376k;
            if (iVar != i.a) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f2372g.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f2374i;
                            } else {
                                o(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return i(obj);
                    }
                    iVar = this.f2376k;
                } while (iVar != i.a);
            }
            return i(this.f2374i);
        }
        throw new InterruptedException();
    }
}