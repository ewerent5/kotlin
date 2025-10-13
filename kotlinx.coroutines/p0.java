package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: Builders.common.kt */
/* loaded from: classes3.dex */
final class p0<T> extends kotlinx.coroutines.internal.v<T> {

    /* renamed from: i, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f17029i = AtomicIntegerFieldUpdater.newUpdater(p0.class, "_decision");
    private volatile int _decision;

    public p0(i.v.g gVar, i.v.d<? super T> dVar) {
        super(gVar, dVar);
        this._decision = 0;
    }

    private final boolean J0() {
        do {
            int i2 = this._decision;
            if (i2 != 0) {
                if (i2 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f17029i.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean K0() {
        do {
            int i2 = this._decision;
            if (i2 != 0) {
                if (i2 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f17029i.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // kotlinx.coroutines.internal.v, kotlinx.coroutines.a
    protected void B0(Object obj) {
        if (J0()) {
            return;
        }
        kotlinx.coroutines.internal.f.c(i.v.i.c.b(this.f17001h), a0.a(obj, this.f17001h), null, 2, null);
    }

    public final Object I0() {
        if (K0()) {
            return i.v.i.d.c();
        }
        Object objH = w1.h(U());
        if (objH instanceof w) {
            throw ((w) objH).f17169b;
        }
        return objH;
    }

    @Override // kotlinx.coroutines.internal.v, kotlinx.coroutines.v1
    protected void u(Object obj) {
        B0(obj);
    }
}