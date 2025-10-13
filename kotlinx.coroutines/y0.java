package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: EventLoop.common.kt */
/* loaded from: classes3.dex */
public abstract class y0 extends z0 {

    /* renamed from: i, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f17182i = AtomicReferenceFieldUpdater.newUpdater(y0.class, Object.class, "_queue");

    /* renamed from: j, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f17183j = AtomicReferenceFieldUpdater.newUpdater(y0.class, Object.class, "_delayed");
    private volatile Object _queue = null;
    private volatile Object _delayed = null;
    private volatile int _isCompleted = 0;

    /* compiled from: EventLoop.common.kt */
    public static abstract class a implements Runnable, Comparable<a>, u0, kotlinx.coroutines.internal.f0 {

        /* renamed from: e, reason: collision with root package name */
        private Object f17184e;

        /* renamed from: f, reason: collision with root package name */
        private int f17185f;

        /* renamed from: g, reason: collision with root package name */
        public long f17186g;

        @Override // kotlinx.coroutines.internal.f0
        public void a(kotlinx.coroutines.internal.e0<?> e0Var) {
            if (!(this.f17184e != b1.a)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this.f17184e = e0Var;
        }

        @Override // kotlinx.coroutines.internal.f0
        public kotlinx.coroutines.internal.e0<?> b() {
            Object obj = this.f17184e;
            if (!(obj instanceof kotlinx.coroutines.internal.e0)) {
                obj = null;
            }
            return (kotlinx.coroutines.internal.e0) obj;
        }

        @Override // kotlinx.coroutines.internal.f0
        public void d(int i2) {
            this.f17185f = i2;
        }

        @Override // kotlinx.coroutines.internal.f0
        public int e() {
            return this.f17185f;
        }

        @Override // kotlinx.coroutines.u0
        public final synchronized void f() {
            Object obj = this.f17184e;
            if (obj == b1.a) {
                return;
            }
            if (!(obj instanceof b)) {
                obj = null;
            }
            b bVar = (b) obj;
            if (bVar != null) {
                bVar.g(this);
            }
            this.f17184e = b1.a;
        }

        @Override // java.lang.Comparable
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            long j2 = this.f17186g - aVar.f17186g;
            if (j2 > 0) {
                return 1;
            }
            return j2 < 0 ? -1 : 0;
        }

        public final synchronized int j(long j2, b bVar, y0 y0Var) {
            if (this.f17184e == b1.a) {
                return 2;
            }
            synchronized (bVar) {
                a aVarB = bVar.b();
                if (y0Var.Y0()) {
                    return 1;
                }
                if (aVarB == null) {
                    bVar.f17187b = j2;
                } else {
                    long j3 = aVarB.f17186g;
                    if (j3 - j2 < 0) {
                        j2 = j3;
                    }
                    if (j2 - bVar.f17187b > 0) {
                        bVar.f17187b = j2;
                    }
                }
                long j4 = this.f17186g;
                long j5 = bVar.f17187b;
                if (j4 - j5 < 0) {
                    this.f17186g = j5;
                }
                bVar.a(this);
                return 0;
            }
        }

        public final boolean k(long j2) {
            return j2 - this.f17186g >= 0;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f17186g + ']';
        }
    }

    /* compiled from: EventLoop.common.kt */
    public static final class b extends kotlinx.coroutines.internal.e0<a> {

        /* renamed from: b, reason: collision with root package name */
        public long f17187b;

        public b(long j2) {
            this.f17187b = j2;
        }
    }

    private final void U0() {
        if (m0.a() && !Y0()) {
            throw new AssertionError();
        }
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                if (f17182i.compareAndSet(this, null, b1.f16933b)) {
                    return;
                }
            } else if (obj instanceof kotlinx.coroutines.internal.o) {
                ((kotlinx.coroutines.internal.o) obj).d();
                return;
            } else {
                if (obj == b1.f16933b) {
                    return;
                }
                kotlinx.coroutines.internal.o oVar = new kotlinx.coroutines.internal.o(8, true);
                oVar.a((Runnable) obj);
                if (f17182i.compareAndSet(this, obj, oVar)) {
                    return;
                }
            }
        }
    }

    private final Runnable V0() {
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof kotlinx.coroutines.internal.o) {
                kotlinx.coroutines.internal.o oVar = (kotlinx.coroutines.internal.o) obj;
                Object objJ = oVar.j();
                if (objJ != kotlinx.coroutines.internal.o.f16988c) {
                    return (Runnable) objJ;
                }
                f17182i.compareAndSet(this, obj, oVar.i());
            } else {
                if (obj == b1.f16933b) {
                    return null;
                }
                if (f17182i.compareAndSet(this, obj, null)) {
                    return (Runnable) obj;
                }
            }
        }
    }

    private final boolean X0(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (Y0()) {
                return false;
            }
            if (obj == null) {
                if (f17182i.compareAndSet(this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof kotlinx.coroutines.internal.o) {
                kotlinx.coroutines.internal.o oVar = (kotlinx.coroutines.internal.o) obj;
                int iA = oVar.a(runnable);
                if (iA == 0) {
                    return true;
                }
                if (iA == 1) {
                    f17182i.compareAndSet(this, obj, oVar.i());
                } else if (iA == 2) {
                    return false;
                }
            } else {
                if (obj == b1.f16933b) {
                    return false;
                }
                kotlinx.coroutines.internal.o oVar2 = new kotlinx.coroutines.internal.o(8, true);
                oVar2.a((Runnable) obj);
                oVar2.a(runnable);
                if (f17182i.compareAndSet(this, obj, oVar2)) {
                    return true;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean Y0() {
        return this._isCompleted;
    }

    private final void a1() {
        a aVarI;
        k2 k2VarA = l2.a();
        long jNanoTime = k2VarA != null ? k2VarA.nanoTime() : System.nanoTime();
        while (true) {
            b bVar = (b) this._delayed;
            if (bVar == null || (aVarI = bVar.i()) == null) {
                return;
            } else {
                O0(jNanoTime, aVarI);
            }
        }
    }

    private final int d1(long j2, a aVar) {
        if (Y0()) {
            return 1;
        }
        b bVar = (b) this._delayed;
        if (bVar == null) {
            f17183j.compareAndSet(this, null, new b(j2));
            Object obj = this._delayed;
            i.y.d.l.b(obj);
            bVar = (b) obj;
        }
        return aVar.j(j2, bVar, this);
    }

    private final void e1(boolean z) {
        this._isCompleted = z ? 1 : 0;
    }

    private final boolean f1(a aVar) {
        b bVar = (b) this._delayed;
        return (bVar != null ? bVar.e() : null) == aVar;
    }

    @Override // kotlinx.coroutines.x0
    public long C0() {
        a aVarH;
        if (G0()) {
            return 0L;
        }
        b bVar = (b) this._delayed;
        if (bVar != null && !bVar.d()) {
            k2 k2VarA = l2.a();
            long jNanoTime = k2VarA != null ? k2VarA.nanoTime() : System.nanoTime();
            do {
                synchronized (bVar) {
                    a aVarB = bVar.b();
                    if (aVarB != null) {
                        a aVar = aVarB;
                        aVarH = aVar.k(jNanoTime) ? X0(aVar) : false ? bVar.h(0) : null;
                    }
                }
            } while (aVarH != null);
        }
        Runnable runnableV0 = V0();
        if (runnableV0 == null) {
            return l0();
        }
        runnableV0.run();
        return 0L;
    }

    public final void W0(Runnable runnable) {
        if (X0(runnable)) {
            S0();
        } else {
            o0.f17024l.W0(runnable);
        }
    }

    @Override // kotlinx.coroutines.d0
    public final void Z(i.v.g gVar, Runnable runnable) {
        W0(runnable);
    }

    protected boolean Z0() {
        if (!y0()) {
            return false;
        }
        b bVar = (b) this._delayed;
        if (bVar != null && !bVar.d()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof kotlinx.coroutines.internal.o) {
                return ((kotlinx.coroutines.internal.o) obj).g();
            }
            if (obj != b1.f16933b) {
                return false;
            }
        }
        return true;
    }

    protected final void b1() {
        this._queue = null;
        this._delayed = null;
    }

    public final void c1(long j2, a aVar) {
        int iD1 = d1(j2, aVar);
        if (iD1 == 0) {
            if (f1(aVar)) {
                S0();
            }
        } else if (iD1 == 1) {
            O0(j2, aVar);
        } else if (iD1 != 2) {
            throw new IllegalStateException("unexpected result".toString());
        }
    }

    @Override // kotlinx.coroutines.x0
    protected long l0() {
        a aVarE;
        if (super.l0() == 0) {
            return 0L;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (!(obj instanceof kotlinx.coroutines.internal.o)) {
                return obj == b1.f16933b ? Long.MAX_VALUE : 0L;
            }
            if (!((kotlinx.coroutines.internal.o) obj).g()) {
                return 0L;
            }
        }
        b bVar = (b) this._delayed;
        if (bVar == null || (aVarE = bVar.e()) == null) {
            return Long.MAX_VALUE;
        }
        long j2 = aVarE.f17186g;
        k2 k2VarA = l2.a();
        return i.a0.f.c(j2 - (k2VarA != null ? k2VarA.nanoTime() : System.nanoTime()), 0L);
    }

    @Override // kotlinx.coroutines.x0
    protected void shutdown() {
        j2.f17004b.c();
        e1(true);
        U0();
        while (C0() <= 0) {
        }
        a1();
    }
}