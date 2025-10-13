package e.c.b.d.a.b;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class y extends WeakReference<Throwable> {
    private final int a;

    public y(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        this.a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == y.class) {
            if (this == obj) {
                return true;
            }
            y yVar = (y) obj;
            if (this.a == yVar.a && get() == yVar.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }
}