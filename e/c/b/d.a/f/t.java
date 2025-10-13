package e.c.b.d.a.f;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class t<ResultT> extends e<ResultT> {
    private final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final o<ResultT> f15386b = new o<>();

    /* renamed from: c, reason: collision with root package name */
    private boolean f15387c;

    /* renamed from: d, reason: collision with root package name */
    private ResultT f15388d;

    /* renamed from: e, reason: collision with root package name */
    private Exception f15389e;

    t() {
    }

    private final void l() {
        e.c.b.d.a.b.r.b(this.f15387c, "Task is not yet complete");
    }

    private final void m() {
        e.c.b.d.a.b.r.b(!this.f15387c, "Task is already complete");
    }

    private final void n() {
        synchronized (this.a) {
            if (this.f15387c) {
                this.f15386b.b(this);
            }
        }
    }

    @Override // e.c.b.d.a.f.e
    public final e<ResultT> a(a<ResultT> aVar) {
        this.f15386b.a(new i(f.a, aVar));
        n();
        return this;
    }

    @Override // e.c.b.d.a.f.e
    public final e<ResultT> b(Executor executor, b bVar) {
        this.f15386b.a(new k(executor, bVar));
        n();
        return this;
    }

    @Override // e.c.b.d.a.f.e
    public final e<ResultT> c(Executor executor, c<? super ResultT> cVar) {
        this.f15386b.a(new m(executor, cVar));
        n();
        return this;
    }

    @Override // e.c.b.d.a.f.e
    public final Exception d() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f15389e;
        }
        return exc;
    }

    @Override // e.c.b.d.a.f.e
    public final ResultT e() {
        ResultT resultt;
        synchronized (this.a) {
            l();
            Exception exc = this.f15389e;
            if (exc != null) {
                throw new d(exc);
            }
            resultt = this.f15388d;
        }
        return resultt;
    }

    @Override // e.c.b.d.a.f.e
    public final boolean f() {
        boolean z;
        synchronized (this.a) {
            z = this.f15387c;
        }
        return z;
    }

    @Override // e.c.b.d.a.f.e
    public final boolean g() {
        boolean z;
        synchronized (this.a) {
            z = false;
            if (this.f15387c && this.f15389e == null) {
                z = true;
            }
        }
        return z;
    }

    public final void h(ResultT resultt) {
        synchronized (this.a) {
            m();
            this.f15387c = true;
            this.f15388d = resultt;
        }
        this.f15386b.b(this);
    }

    public final boolean i(ResultT resultt) {
        synchronized (this.a) {
            if (this.f15387c) {
                return false;
            }
            this.f15387c = true;
            this.f15388d = resultt;
            this.f15386b.b(this);
            return true;
        }
    }

    public final void j(Exception exc) {
        synchronized (this.a) {
            m();
            this.f15387c = true;
            this.f15389e = exc;
        }
        this.f15386b.b(this);
    }

    public final boolean k(Exception exc) {
        synchronized (this.a) {
            if (this.f15387c) {
                return false;
            }
            this.f15387c = true;
            this.f15389e = exc;
            this.f15386b.b(this);
            return true;
        }
    }
}