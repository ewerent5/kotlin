package kotlinx.coroutines.t2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import i.s;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.internal.x;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.m0;
import kotlinx.coroutines.n0;

/* compiled from: CoroutineScheduler.kt */
/* loaded from: classes3.dex */
public final class a implements Executor, Closeable {
    private volatile int _isTerminated;
    volatile long controlState;

    /* renamed from: j, reason: collision with root package name */
    public final e f17109j;

    /* renamed from: k, reason: collision with root package name */
    public final e f17110k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicReferenceArray<b> f17111l;

    /* renamed from: m, reason: collision with root package name */
    public final int f17112m;
    public final int n;
    public final long o;
    public final String p;
    private volatile long parkedWorkersStack;

    /* renamed from: i, reason: collision with root package name */
    public static final C0230a f17108i = new C0230a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final x f17107h = new x("NOT_IN_STACK");

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f17104e = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");

    /* renamed from: f, reason: collision with root package name */
    static final AtomicLongFieldUpdater f17105f = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");

    /* renamed from: g, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f17106g = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");

    /* compiled from: CoroutineScheduler.kt */
    /* renamed from: kotlinx.coroutines.t2.a$a, reason: collision with other inner class name */
    public static final class C0230a {
        private C0230a() {
        }

        public /* synthetic */ C0230a(i.y.d.g gVar) {
            this();
        }
    }

    /* compiled from: CoroutineScheduler.kt */
    public enum c {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public a(int i2, int i3, long j2, String str) {
        this.f17112m = i2;
        this.n = i3;
        this.o = j2;
        this.p = str;
        if (!(i2 >= 1)) {
            throw new IllegalArgumentException(("Core pool size " + i2 + " should be at least 1").toString());
        }
        if (!(i3 >= i2)) {
            throw new IllegalArgumentException(("Max pool size " + i3 + " should be greater than or equals to core pool size " + i2).toString());
        }
        if (!(i3 <= 2097150)) {
            throw new IllegalArgumentException(("Max pool size " + i3 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (!(j2 > 0)) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j2 + " must be positive").toString());
        }
        this.f17109j = new e();
        this.f17110k = new e();
        this.parkedWorkersStack = 0L;
        this.f17111l = new AtomicReferenceArray<>(i3 + 1);
        this.controlState = i2 << 42;
        this._isTerminated = 0;
    }

    private final int A(b bVar) {
        Object objG = bVar.g();
        while (objG != f17107h) {
            if (objG == null) {
                return 0;
            }
            b bVar2 = (b) objG;
            int iF = bVar2.f();
            if (iF != 0) {
                return iF;
            }
            objG = bVar2.g();
        }
        return -1;
    }

    private final b B() {
        while (true) {
            long j2 = this.parkedWorkersStack;
            b bVar = this.f17111l.get((int) (2097151 & j2));
            if (bVar == null) {
                return null;
            }
            long j3 = (2097152 + j2) & (-2097152);
            int iA = A(bVar);
            if (iA >= 0 && f17104e.compareAndSet(this, j2, iA | j3)) {
                bVar.o(f17107h);
                return bVar;
            }
        }
    }

    private final void W(boolean z) {
        long jAddAndGet = f17105f.addAndGet(this, 2097152L);
        if (z || j0() || b0(jAddAndGet)) {
            return;
        }
        j0();
    }

    private final i a0(b bVar, i iVar, boolean z) {
        if (bVar == null || bVar.f17115g == c.TERMINATED) {
            return iVar;
        }
        if (iVar.f17143f.A() == 0 && bVar.f17115g == c.BLOCKING) {
            return iVar;
        }
        bVar.f17119k = true;
        return bVar.f17114f.a(iVar, z);
    }

    private final boolean b0(long j2) {
        if (i.a0.f.b(((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21)), 0) < this.f17112m) {
            int iG = g();
            if (iG == 1 && this.f17112m > 1) {
                g();
            }
            if (iG > 0) {
                return true;
            }
        }
        return false;
    }

    private final boolean d(i iVar) {
        return iVar.f17143f.A() == 1 ? this.f17110k.a(iVar) : this.f17109j.a(iVar);
    }

    private final int g() {
        synchronized (this.f17111l) {
            if (isTerminated()) {
                return -1;
            }
            long j2 = this.controlState;
            int i2 = (int) (j2 & 2097151);
            int iB = i.a0.f.b(i2 - ((int) ((j2 & 4398044413952L) >> 21)), 0);
            if (iB >= this.f17112m) {
                return 0;
            }
            if (i2 >= this.n) {
                return 0;
            }
            int i3 = ((int) (this.controlState & 2097151)) + 1;
            if (!(i3 > 0 && this.f17111l.get(i3) == null)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            b bVar = new b(this, i3);
            this.f17111l.set(i3, bVar);
            if (!(i3 == ((int) (2097151 & f17105f.incrementAndGet(this))))) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            bVar.start();
            return iB + 1;
        }
    }

    static /* synthetic */ boolean h0(a aVar, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = aVar.controlState;
        }
        return aVar.b0(j2);
    }

    private final b j() {
        Thread threadCurrentThread = Thread.currentThread();
        if (!(threadCurrentThread instanceof b)) {
            threadCurrentThread = null;
        }
        b bVar = (b) threadCurrentThread;
        if (bVar == null || !i.y.d.l.a(a.this, this)) {
            return null;
        }
        return bVar;
    }

    private final boolean j0() {
        b bVarB;
        do {
            bVarB = B();
            if (bVarB == null) {
                return false;
            }
        } while (!b.f17113e.compareAndSet(bVarB, -1, 0));
        LockSupport.unpark(bVarB);
        return true;
    }

    public static /* synthetic */ void s(a aVar, Runnable runnable, j jVar, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            jVar = h.f17141f;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        aVar.q(runnable, jVar, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int v() {
        return (int) (this.controlState & 2097151);
    }

    public final boolean C(b bVar) {
        long j2;
        long j3;
        int iF;
        if (bVar.g() != f17107h) {
            return false;
        }
        do {
            j2 = this.parkedWorkersStack;
            int i2 = (int) (2097151 & j2);
            j3 = (2097152 + j2) & (-2097152);
            iF = bVar.f();
            if (m0.a()) {
                if (!(iF != 0)) {
                    throw new AssertionError();
                }
            }
            bVar.o(this.f17111l.get(i2));
        } while (!f17104e.compareAndSet(this, j2, iF | j3));
        return true;
    }

    public final void D(b bVar, int i2, int i3) {
        while (true) {
            long j2 = this.parkedWorkersStack;
            int iA = (int) (2097151 & j2);
            long j3 = (2097152 + j2) & (-2097152);
            if (iA == i2) {
                iA = i3 == 0 ? A(bVar) : i3;
            }
            if (iA >= 0 && f17104e.compareAndSet(this, j2, j3 | iA)) {
                return;
            }
        }
    }

    public final void K(i iVar) {
        try {
            iVar.run();
        } catch (Throwable th) {
            try {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                k2 k2VarA = l2.a();
                if (k2VarA == null) {
                }
            } finally {
                k2 k2VarA2 = l2.a();
                if (k2VarA2 != null) {
                    k2VarA2.c();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void T(long r9) throws java.lang.InterruptedException {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.t2.a.f17106g
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            kotlinx.coroutines.t2.a$b r0 = r8.j()
            java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.coroutines.t2.a$b> r3 = r8.f17111l
            monitor-enter(r3)
            long r4 = r8.controlState     // Catch: java.lang.Throwable -> Lb5
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r5 = (int) r4
            monitor-exit(r3)
            if (r2 > r5) goto L5b
            r3 = 1
        L1d:
            java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.coroutines.t2.a$b> r4 = r8.f17111l
            java.lang.Object r4 = r4.get(r3)
            i.y.d.l.b(r4)
            kotlinx.coroutines.t2.a$b r4 = (kotlinx.coroutines.t2.a.b) r4
            if (r4 == r0) goto L56
        L2a:
            boolean r6 = r4.isAlive()
            if (r6 == 0) goto L37
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r4.join(r9)
            goto L2a
        L37:
            kotlinx.coroutines.t2.a$c r6 = r4.f17115g
            boolean r7 = kotlinx.coroutines.m0.a()
            if (r7 == 0) goto L4f
            kotlinx.coroutines.t2.a$c r7 = kotlinx.coroutines.t2.a.c.TERMINATED
            if (r6 != r7) goto L45
            r6 = 1
            goto L46
        L45:
            r6 = 0
        L46:
            if (r6 == 0) goto L49
            goto L4f
        L49:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>()
            throw r9
        L4f:
            kotlinx.coroutines.t2.n r4 = r4.f17114f
            kotlinx.coroutines.t2.e r6 = r8.f17110k
            r4.g(r6)
        L56:
            if (r3 == r5) goto L5b
            int r3 = r3 + 1
            goto L1d
        L5b:
            kotlinx.coroutines.t2.e r9 = r8.f17110k
            r9.b()
            kotlinx.coroutines.t2.e r9 = r8.f17109j
            r9.b()
        L65:
            if (r0 == 0) goto L6e
            kotlinx.coroutines.t2.i r9 = r0.e(r2)
            if (r9 == 0) goto L6e
            goto L76
        L6e:
            kotlinx.coroutines.t2.e r9 = r8.f17109j
            java.lang.Object r9 = r9.d()
            kotlinx.coroutines.t2.i r9 = (kotlinx.coroutines.t2.i) r9
        L76:
            if (r9 == 0) goto L79
            goto L81
        L79:
            kotlinx.coroutines.t2.e r9 = r8.f17110k
            java.lang.Object r9 = r9.d()
            kotlinx.coroutines.t2.i r9 = (kotlinx.coroutines.t2.i) r9
        L81:
            if (r9 == 0) goto L87
            r8.K(r9)
            goto L65
        L87:
            if (r0 == 0) goto L8e
            kotlinx.coroutines.t2.a$c r9 = kotlinx.coroutines.t2.a.c.TERMINATED
            r0.r(r9)
        L8e:
            boolean r9 = kotlinx.coroutines.m0.a()
            if (r9 == 0) goto Lae
            long r9 = r8.controlState
            r3 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r9 = r9 & r3
            r0 = 42
            long r9 = r9 >> r0
            int r10 = (int) r9
            int r9 = r8.f17112m
            if (r10 != r9) goto La5
            r1 = 1
        La5:
            if (r1 == 0) goto La8
            goto Lae
        La8:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>()
            throw r9
        Lae:
            r9 = 0
            r8.parkedWorkersStack = r9
            r8.controlState = r9
            return
        Lb5:
            r9 = move-exception
            monitor-exit(r3)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.t2.a.T(long):void");
    }

    public final void Z() {
        if (j0() || h0(this, 0L, 1, null)) {
            return;
        }
        j0();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        T(AbstractComponentTracker.LINGERING_TIMEOUT);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        s(this, runnable, null, false, 6, null);
    }

    public final i i(Runnable runnable, j jVar) {
        long jA = l.f17149f.a();
        if (!(runnable instanceof i)) {
            return new k(runnable, jA, jVar);
        }
        i iVar = (i) runnable;
        iVar.f17142e = jA;
        iVar.f17143f = jVar;
        return iVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    public final void q(Runnable runnable, j jVar, boolean z) {
        k2 k2VarA = l2.a();
        if (k2VarA != null) {
            k2VarA.g();
        }
        i iVarI = i(runnable, jVar);
        b bVarJ = j();
        i iVarA0 = a0(bVarJ, iVarI, z);
        if (iVarA0 != null && !d(iVarA0)) {
            throw new RejectedExecutionException(this.p + " was terminated");
        }
        boolean z2 = z && bVarJ != null;
        if (iVarI.f17143f.A() != 0) {
            W(z2);
        } else {
            if (z2) {
                return;
            }
            Z();
        }
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int length = this.f17111l.length();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 1; i7 < length; i7++) {
            b bVar = this.f17111l.get(i7);
            if (bVar != null) {
                int iF = bVar.f17114f.f();
                int i8 = kotlinx.coroutines.t2.b.a[bVar.f17115g.ordinal()];
                if (i8 == 1) {
                    i4++;
                } else if (i8 == 2) {
                    i3++;
                    arrayList.add(String.valueOf(iF) + "b");
                } else if (i8 == 3) {
                    i2++;
                    arrayList.add(String.valueOf(iF) + "c");
                } else if (i8 == 4) {
                    i5++;
                    if (iF > 0) {
                        arrayList.add(String.valueOf(iF) + DateTokenConverter.CONVERTER_KEY);
                    }
                } else if (i8 == 5) {
                    i6++;
                }
            }
        }
        long j2 = this.controlState;
        return this.p + '@' + n0.b(this) + "[Pool Size {core = " + this.f17112m + ", max = " + this.n + "}, Worker States {CPU = " + i2 + ", blocking = " + i3 + ", parked = " + i4 + ", dormant = " + i5 + ", terminated = " + i6 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f17109j.c() + ", global blocking queue size = " + this.f17110k.c() + ", Control State {created workers= " + ((int) (2097151 & j2)) + ", blocking tasks = " + ((int) ((4398044413952L & j2) >> 21)) + ", CPUs acquired = " + (this.f17112m - ((int) ((9223367638808264704L & j2) >> 42))) + "}]";
    }

    /* compiled from: CoroutineScheduler.kt */
    public final class b extends Thread {

        /* renamed from: e, reason: collision with root package name */
        static final AtomicIntegerFieldUpdater f17113e = AtomicIntegerFieldUpdater.newUpdater(b.class, "workerCtl");

        /* renamed from: f, reason: collision with root package name */
        public final n f17114f;

        /* renamed from: g, reason: collision with root package name */
        public c f17115g;

        /* renamed from: h, reason: collision with root package name */
        private long f17116h;

        /* renamed from: i, reason: collision with root package name */
        private long f17117i;
        private volatile int indexInArray;

        /* renamed from: j, reason: collision with root package name */
        private int f17118j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f17119k;
        private volatile Object nextParkedWorker;
        volatile int workerCtl;

        private b() {
            setDaemon(true);
            this.f17114f = new n();
            this.f17115g = c.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = a.f17107h;
            this.f17118j = i.z.c.f15897f.b();
        }

        private final void a(int i2) {
            if (i2 == 0) {
                return;
            }
            a.f17105f.addAndGet(a.this, -2097152L);
            c cVar = this.f17115g;
            if (cVar != c.TERMINATED) {
                if (m0.a()) {
                    if (!(cVar == c.BLOCKING)) {
                        throw new AssertionError();
                    }
                }
                this.f17115g = c.DORMANT;
            }
        }

        private final void b(int i2) {
            if (i2 != 0 && r(c.BLOCKING)) {
                a.this.Z();
            }
        }

        private final void c(i iVar) {
            int iA = iVar.f17143f.A();
            h(iA);
            b(iA);
            a.this.K(iVar);
            a(iA);
        }

        private final i d(boolean z) {
            i iVarL;
            i iVarL2;
            if (z) {
                boolean z2 = j(a.this.f17112m * 2) == 0;
                if (z2 && (iVarL2 = l()) != null) {
                    return iVarL2;
                }
                i iVarH = this.f17114f.h();
                if (iVarH != null) {
                    return iVarH;
                }
                if (!z2 && (iVarL = l()) != null) {
                    return iVarL;
                }
            } else {
                i iVarL3 = l();
                if (iVarL3 != null) {
                    return iVarL3;
                }
            }
            return s(false);
        }

        private final void h(int i2) {
            this.f17116h = 0L;
            if (this.f17115g == c.PARKING) {
                if (m0.a()) {
                    if (!(i2 == 1)) {
                        throw new AssertionError();
                    }
                }
                this.f17115g = c.BLOCKING;
            }
        }

        private final boolean i() {
            return this.nextParkedWorker != a.f17107h;
        }

        private final void k() {
            if (this.f17116h == 0) {
                this.f17116h = System.nanoTime() + a.this.o;
            }
            LockSupport.parkNanos(a.this.o);
            if (System.nanoTime() - this.f17116h >= 0) {
                this.f17116h = 0L;
                t();
            }
        }

        private final i l() {
            if (j(2) == 0) {
                i iVarD = a.this.f17109j.d();
                return iVarD != null ? iVarD : a.this.f17110k.d();
            }
            i iVarD2 = a.this.f17110k.d();
            return iVarD2 != null ? iVarD2 : a.this.f17109j.d();
        }

        private final void m() {
            loop0: while (true) {
                boolean z = false;
                while (!a.this.isTerminated() && this.f17115g != c.TERMINATED) {
                    i iVarE = e(this.f17119k);
                    if (iVarE != null) {
                        this.f17117i = 0L;
                        c(iVarE);
                    } else {
                        this.f17119k = false;
                        if (this.f17117i == 0) {
                            q();
                        } else if (z) {
                            r(c.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f17117i);
                            this.f17117i = 0L;
                        } else {
                            z = true;
                        }
                    }
                }
                break loop0;
            }
            r(c.TERMINATED);
        }

        private final boolean p() {
            boolean z;
            if (this.f17115g != c.CPU_ACQUIRED) {
                a aVar = a.this;
                while (true) {
                    long j2 = aVar.controlState;
                    if (((int) ((9223367638808264704L & j2) >> 42)) == 0) {
                        z = false;
                        break;
                    }
                    if (a.f17105f.compareAndSet(aVar, j2, j2 - 4398046511104L)) {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    return false;
                }
                this.f17115g = c.CPU_ACQUIRED;
            }
            return true;
        }

        private final void q() {
            if (!i()) {
                a.this.C(this);
                return;
            }
            if (m0.a()) {
                if (!(this.f17114f.f() == 0)) {
                    throw new AssertionError();
                }
            }
            this.workerCtl = -1;
            while (i() && this.workerCtl == -1 && !a.this.isTerminated() && this.f17115g != c.TERMINATED) {
                r(c.PARKING);
                Thread.interrupted();
                k();
            }
        }

        private final i s(boolean z) {
            if (m0.a()) {
                if (!(this.f17114f.f() == 0)) {
                    throw new AssertionError();
                }
            }
            int iV = a.this.v();
            if (iV < 2) {
                return null;
            }
            int iJ = j(iV);
            long jMin = Long.MAX_VALUE;
            for (int i2 = 0; i2 < iV; i2++) {
                iJ++;
                if (iJ > iV) {
                    iJ = 1;
                }
                b bVar = a.this.f17111l.get(iJ);
                if (bVar != null && bVar != this) {
                    if (m0.a()) {
                        if (!(this.f17114f.f() == 0)) {
                            throw new AssertionError();
                        }
                    }
                    long jK = z ? this.f17114f.k(bVar.f17114f) : this.f17114f.l(bVar.f17114f);
                    if (jK == -1) {
                        return this.f17114f.h();
                    }
                    if (jK > 0) {
                        jMin = Math.min(jMin, jK);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.f17117i = jMin;
            return null;
        }

        private final void t() {
            synchronized (a.this.f17111l) {
                if (a.this.isTerminated()) {
                    return;
                }
                if (a.this.v() <= a.this.f17112m) {
                    return;
                }
                if (f17113e.compareAndSet(this, -1, 1)) {
                    int i2 = this.indexInArray;
                    n(0);
                    a.this.D(this, i2, 0);
                    int andDecrement = (int) (a.f17105f.getAndDecrement(a.this) & 2097151);
                    if (andDecrement != i2) {
                        b bVar = a.this.f17111l.get(andDecrement);
                        i.y.d.l.b(bVar);
                        b bVar2 = bVar;
                        a.this.f17111l.set(i2, bVar2);
                        bVar2.n(i2);
                        a.this.D(bVar2, andDecrement, i2);
                    }
                    a.this.f17111l.set(andDecrement, null);
                    s sVar = s.a;
                    this.f17115g = c.TERMINATED;
                }
            }
        }

        public final i e(boolean z) {
            i iVarD;
            if (p()) {
                return d(z);
            }
            if (!z || (iVarD = this.f17114f.h()) == null) {
                iVarD = a.this.f17110k.d();
            }
            return iVarD != null ? iVarD : s(true);
        }

        public final int f() {
            return this.indexInArray;
        }

        public final Object g() {
            return this.nextParkedWorker;
        }

        public final int j(int i2) {
            int i3 = this.f17118j;
            int i4 = i3 ^ (i3 << 13);
            int i5 = i4 ^ (i4 >> 17);
            int i6 = i5 ^ (i5 << 5);
            this.f17118j = i6;
            int i7 = i2 - 1;
            return (i7 & i2) == 0 ? i6 & i7 : (i6 & Integer.MAX_VALUE) % i2;
        }

        public final void n(int i2) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.this.p);
            sb.append("-worker-");
            sb.append(i2 == 0 ? "TERMINATED" : String.valueOf(i2));
            setName(sb.toString());
            this.indexInArray = i2;
        }

        public final void o(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean r(c cVar) {
            c cVar2 = this.f17115g;
            boolean z = cVar2 == c.CPU_ACQUIRED;
            if (z) {
                a.f17105f.addAndGet(a.this, 4398046511104L);
            }
            if (cVar2 != cVar) {
                this.f17115g = cVar;
            }
            return z;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            m();
        }

        public b(a aVar, int i2) {
            this();
            n(i2);
        }
    }
}