package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: LockFreeTaskQueue.kt */
/* loaded from: classes3.dex */
public class n<E> {
    private static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_cur");
    private volatile Object _cur;

    public n(boolean z) {
        this._cur = new o(8, z);
    }

    public final boolean a(E e2) {
        while (true) {
            o oVar = (o) this._cur;
            int iA = oVar.a(e2);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                a.compareAndSet(this, oVar, oVar.i());
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            o oVar = (o) this._cur;
            if (oVar.d()) {
                return;
            } else {
                a.compareAndSet(this, oVar, oVar.i());
            }
        }
    }

    public final int c() {
        return ((o) this._cur).f();
    }

    public final E d() {
        while (true) {
            o oVar = (o) this._cur;
            E e2 = (E) oVar.j();
            if (e2 != o.f16988c) {
                return e2;
            }
            a.compareAndSet(this, oVar, oVar.i());
        }
    }
}