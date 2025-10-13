package kotlinx.coroutines.t2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.m0;

/* compiled from: WorkQueue.kt */
/* loaded from: classes3.dex */
public final class n {
    private static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "lastScheduledTask");

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f17150b = AtomicIntegerFieldUpdater.newUpdater(n.class, "producerIndex");

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f17151c = AtomicIntegerFieldUpdater.newUpdater(n.class, "consumerIndex");

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f17152d = AtomicIntegerFieldUpdater.newUpdater(n.class, "blockingTasksInBuffer");

    /* renamed from: e, reason: collision with root package name */
    private final AtomicReferenceArray<i> f17153e = new AtomicReferenceArray<>(128);
    private volatile Object lastScheduledTask = null;
    private volatile int producerIndex = 0;
    private volatile int consumerIndex = 0;
    private volatile int blockingTasksInBuffer = 0;

    public static /* synthetic */ i b(n nVar, i iVar, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return nVar.a(iVar, z);
    }

    private final i c(i iVar) {
        if (iVar.f17143f.A() == 1) {
            f17152d.incrementAndGet(this);
        }
        if (e() == 127) {
            return iVar;
        }
        int i2 = this.producerIndex & 127;
        while (this.f17153e.get(i2) != null) {
            Thread.yield();
        }
        this.f17153e.lazySet(i2, iVar);
        f17150b.incrementAndGet(this);
        return null;
    }

    private final void d(i iVar) {
        if (iVar != null) {
            if (iVar.f17143f.A() == 1) {
                int iDecrementAndGet = f17152d.decrementAndGet(this);
                if (m0.a()) {
                    if (!(iDecrementAndGet >= 0)) {
                        throw new AssertionError();
                    }
                }
            }
        }
    }

    private final i i() {
        i andSet;
        while (true) {
            int i2 = this.consumerIndex;
            if (i2 - this.producerIndex == 0) {
                return null;
            }
            int i3 = i2 & 127;
            if (f17151c.compareAndSet(this, i2, i2 + 1) && (andSet = this.f17153e.getAndSet(i3, null)) != null) {
                d(andSet);
                return andSet;
            }
        }
    }

    private final boolean j(e eVar) {
        i iVarI = i();
        if (iVarI == null) {
            return false;
        }
        eVar.a(iVarI);
        return true;
    }

    private final long m(n nVar, boolean z) {
        i iVar;
        do {
            iVar = (i) nVar.lastScheduledTask;
            if (iVar == null) {
                return -2L;
            }
            if (z) {
                if (!(iVar.f17143f.A() == 1)) {
                    return -2L;
                }
            }
            long jA = l.f17149f.a() - iVar.f17142e;
            long j2 = l.a;
            if (jA < j2) {
                return j2 - jA;
            }
        } while (!a.compareAndSet(nVar, iVar, null));
        b(this, iVar, false, 2, null);
        return -1L;
    }

    public final i a(i iVar, boolean z) {
        if (z) {
            return c(iVar);
        }
        i iVar2 = (i) a.getAndSet(this, iVar);
        if (iVar2 != null) {
            return c(iVar2);
        }
        return null;
    }

    public final int e() {
        return this.producerIndex - this.consumerIndex;
    }

    public final int f() {
        return this.lastScheduledTask != null ? e() + 1 : e();
    }

    public final void g(e eVar) {
        i iVar = (i) a.getAndSet(this, null);
        if (iVar != null) {
            eVar.a(iVar);
        }
        while (j(eVar)) {
        }
    }

    public final i h() {
        i iVar = (i) a.getAndSet(this, null);
        return iVar != null ? iVar : i();
    }

    public final long k(n nVar) {
        if (m0.a()) {
            if (!(e() == 0)) {
                throw new AssertionError();
            }
        }
        int i2 = nVar.producerIndex;
        AtomicReferenceArray<i> atomicReferenceArray = nVar.f17153e;
        for (int i3 = nVar.consumerIndex; i3 != i2; i3++) {
            int i4 = i3 & 127;
            if (nVar.blockingTasksInBuffer == 0) {
                break;
            }
            i iVar = atomicReferenceArray.get(i4);
            if (iVar != null) {
                if ((iVar.f17143f.A() == 1) && atomicReferenceArray.compareAndSet(i4, iVar, null)) {
                    f17152d.decrementAndGet(nVar);
                    b(this, iVar, false, 2, null);
                    return -1L;
                }
            }
        }
        return m(nVar, true);
    }

    public final long l(n nVar) {
        if (m0.a()) {
            if (!(e() == 0)) {
                throw new AssertionError();
            }
        }
        i iVarI = nVar.i();
        if (iVarI == null) {
            return m(nVar, false);
        }
        i iVarB = b(this, iVarI, false, 2, null);
        if (!m0.a()) {
            return -1L;
        }
        if (iVarB == null) {
            return -1L;
        }
        throw new AssertionError();
    }
}