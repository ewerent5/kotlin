package i.c0;

import i.y.d.l;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SequencesJVM.kt */
/* loaded from: classes3.dex */
public final class a<T> implements d<T> {
    private final AtomicReference<d<T>> a;

    public a(d<? extends T> dVar) {
        l.d(dVar, "sequence");
        this.a = new AtomicReference<>(dVar);
    }

    @Override // i.c0.d
    public Iterator<T> iterator() {
        d<T> andSet = this.a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}