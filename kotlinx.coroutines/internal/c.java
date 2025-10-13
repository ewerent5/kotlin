package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.m0;

/* compiled from: Atomic.kt */
/* loaded from: classes3.dex */
public abstract class c<T> extends t {
    private static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_consensus");
    private volatile Object _consensus = b.a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.t
    public c<?> a() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.t
    public final Object c(Object obj) {
        Object objE = this._consensus;
        if (objE == b.a) {
            objE = e(g(obj));
        }
        d(obj, objE);
        return objE;
    }

    public abstract void d(T t, Object obj);

    public final Object e(Object obj) {
        if (m0.a()) {
            if (!(obj != b.a)) {
                throw new AssertionError();
            }
        }
        Object obj2 = this._consensus;
        Object obj3 = b.a;
        return obj2 != obj3 ? obj2 : a.compareAndSet(this, obj3, obj) ? obj : this._consensus;
    }

    public long f() {
        return 0L;
    }

    public abstract Object g(T t);
}