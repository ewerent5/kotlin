package e.c.b.b.e;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-tasks@@17.0.2 */
/* loaded from: classes.dex */
final class d0<TResult> extends h<TResult> {
    private final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final b0<TResult> f15011b = new b0<>();

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("mLock")
    private boolean f15012c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f15013d;

    /* renamed from: e, reason: collision with root package name */
    @GuardedBy("mLock")
    private TResult f15014e;

    /* renamed from: f, reason: collision with root package name */
    @GuardedBy("mLock")
    private Exception f15015f;

    d0() {
    }

    @GuardedBy("mLock")
    private final void t() {
        com.google.android.gms.common.internal.p.n(this.f15012c, "Task is not yet complete");
    }

    @GuardedBy("mLock")
    private final void w() {
        com.google.android.gms.common.internal.p.n(!this.f15012c, "Task is already complete");
    }

    @GuardedBy("mLock")
    private final void x() {
        if (this.f15013d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void y() {
        synchronized (this.a) {
            if (this.f15012c) {
                this.f15011b.a(this);
            }
        }
    }

    @Override // e.c.b.b.e.h
    public final h<TResult> a(Executor executor, b bVar) {
        this.f15011b.b(new p(f0.a(executor), bVar));
        y();
        return this;
    }

    @Override // e.c.b.b.e.h
    public final h<TResult> b(c<TResult> cVar) {
        return c(j.a, cVar);
    }

    @Override // e.c.b.b.e.h
    public final h<TResult> c(Executor executor, c<TResult> cVar) {
        this.f15011b.b(new t(f0.a(executor), cVar));
        y();
        return this;
    }

    @Override // e.c.b.b.e.h
    public final h<TResult> d(Executor executor, d dVar) {
        this.f15011b.b(new u(f0.a(executor), dVar));
        y();
        return this;
    }

    @Override // e.c.b.b.e.h
    public final h<TResult> e(Executor executor, e<? super TResult> eVar) {
        this.f15011b.b(new x(f0.a(executor), eVar));
        y();
        return this;
    }

    @Override // e.c.b.b.e.h
    public final <TContinuationResult> h<TContinuationResult> f(a<TResult, TContinuationResult> aVar) {
        return g(j.a, aVar);
    }

    @Override // e.c.b.b.e.h
    public final <TContinuationResult> h<TContinuationResult> g(Executor executor, a<TResult, TContinuationResult> aVar) {
        d0 d0Var = new d0();
        this.f15011b.b(new m(f0.a(executor), aVar, d0Var));
        y();
        return d0Var;
    }

    @Override // e.c.b.b.e.h
    public final <TContinuationResult> h<TContinuationResult> h(a<TResult, h<TContinuationResult>> aVar) {
        return i(j.a, aVar);
    }

    @Override // e.c.b.b.e.h
    public final <TContinuationResult> h<TContinuationResult> i(Executor executor, a<TResult, h<TContinuationResult>> aVar) {
        d0 d0Var = new d0();
        this.f15011b.b(new n(f0.a(executor), aVar, d0Var));
        y();
        return d0Var;
    }

    @Override // e.c.b.b.e.h
    public final Exception j() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f15015f;
        }
        return exc;
    }

    @Override // e.c.b.b.e.h
    public final TResult k() {
        TResult tresult;
        synchronized (this.a) {
            t();
            x();
            if (this.f15015f != null) {
                throw new f(this.f15015f);
            }
            tresult = this.f15014e;
        }
        return tresult;
    }

    @Override // e.c.b.b.e.h
    public final boolean l() {
        return this.f15013d;
    }

    @Override // e.c.b.b.e.h
    public final boolean m() {
        boolean z;
        synchronized (this.a) {
            z = this.f15012c;
        }
        return z;
    }

    @Override // e.c.b.b.e.h
    public final boolean n() {
        boolean z;
        synchronized (this.a) {
            z = this.f15012c && !this.f15013d && this.f15015f == null;
        }
        return z;
    }

    @Override // e.c.b.b.e.h
    public final <TContinuationResult> h<TContinuationResult> o(g<TResult, TContinuationResult> gVar) {
        return p(j.a, gVar);
    }

    @Override // e.c.b.b.e.h
    public final <TContinuationResult> h<TContinuationResult> p(Executor executor, g<TResult, TContinuationResult> gVar) {
        d0 d0Var = new d0();
        this.f15011b.b(new y(f0.a(executor), gVar, d0Var));
        y();
        return d0Var;
    }

    public final void q(Exception exc) {
        com.google.android.gms.common.internal.p.k(exc, "Exception must not be null");
        synchronized (this.a) {
            w();
            this.f15012c = true;
            this.f15015f = exc;
        }
        this.f15011b.a(this);
    }

    public final void r(TResult tresult) {
        synchronized (this.a) {
            w();
            this.f15012c = true;
            this.f15014e = tresult;
        }
        this.f15011b.a(this);
    }

    public final boolean s() {
        synchronized (this.a) {
            if (this.f15012c) {
                return false;
            }
            this.f15012c = true;
            this.f15013d = true;
            this.f15011b.a(this);
            return true;
        }
    }

    public final boolean u(Exception exc) {
        com.google.android.gms.common.internal.p.k(exc, "Exception must not be null");
        synchronized (this.a) {
            if (this.f15012c) {
                return false;
            }
            this.f15012c = true;
            this.f15015f = exc;
            this.f15011b.a(this);
            return true;
        }
    }

    public final boolean v(TResult tresult) {
        synchronized (this.a) {
            if (this.f15012c) {
                return false;
            }
            this.f15012c = true;
            this.f15014e = tresult;
            this.f15011b.a(this);
            return true;
        }
    }
}