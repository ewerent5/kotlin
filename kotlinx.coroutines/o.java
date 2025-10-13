package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: CompletionState.kt */
/* loaded from: classes3.dex */
public final class o extends w {

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f17022c = AtomicIntegerFieldUpdater.newUpdater(o.class, "_resumed");
    private volatile int _resumed;

    public o(i.v.d<?> dVar, Throwable th, boolean z) {
        if (th == null) {
            th = new CancellationException("Continuation " + dVar + " was cancelled normally");
        }
        super(th, z);
        this._resumed = 0;
    }

    public final boolean c() {
        return f17022c.compareAndSet(this, 0, 1);
    }
}