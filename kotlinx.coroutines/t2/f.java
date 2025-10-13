package kotlinx.coroutines.t2;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.d1;

/* compiled from: Dispatcher.kt */
/* loaded from: classes3.dex */
final class f extends d1 implements j, Executor {

    /* renamed from: g, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f17134g = AtomicIntegerFieldUpdater.newUpdater(f.class, "inFlightTasks");

    /* renamed from: i, reason: collision with root package name */
    private final d f17136i;

    /* renamed from: j, reason: collision with root package name */
    private final int f17137j;

    /* renamed from: k, reason: collision with root package name */
    private final String f17138k;

    /* renamed from: l, reason: collision with root package name */
    private final int f17139l;

    /* renamed from: h, reason: collision with root package name */
    private final ConcurrentLinkedQueue<Runnable> f17135h = new ConcurrentLinkedQueue<>();
    private volatile int inFlightTasks = 0;

    public f(d dVar, int i2, String str, int i3) {
        this.f17136i = dVar;
        this.f17137j = i2;
        this.f17138k = str;
        this.f17139l = i3;
    }

    private final void h0(Runnable runnable, boolean z) {
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f17134g;
            if (atomicIntegerFieldUpdater.incrementAndGet(this) <= this.f17137j) {
                this.f17136i.j0(runnable, this, z);
                return;
            }
            this.f17135h.add(runnable);
            if (atomicIntegerFieldUpdater.decrementAndGet(this) >= this.f17137j) {
                return;
            } else {
                runnable = this.f17135h.poll();
            }
        } while (runnable != null);
    }

    @Override // kotlinx.coroutines.t2.j
    public int A() {
        return this.f17139l;
    }

    @Override // kotlinx.coroutines.d0
    public void Z(i.v.g gVar, Runnable runnable) {
        h0(runnable, false);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        h0(runnable, false);
    }

    @Override // kotlinx.coroutines.t2.j
    public void j() {
        Runnable runnablePoll = this.f17135h.poll();
        if (runnablePoll != null) {
            this.f17136i.j0(runnablePoll, this, true);
            return;
        }
        f17134g.decrementAndGet(this);
        Runnable runnablePoll2 = this.f17135h.poll();
        if (runnablePoll2 != null) {
            h0(runnablePoll2, true);
        }
    }

    @Override // kotlinx.coroutines.d0
    public String toString() {
        String str = this.f17138k;
        if (str != null) {
            return str;
        }
        return super.toString() + "[dispatcher = " + this.f17136i + ']';
    }
}