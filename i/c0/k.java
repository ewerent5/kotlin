package i.c0;

import i.y.c.l;
import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;

/* compiled from: Sequences.kt */
/* loaded from: classes3.dex */
public final class k<T, R> implements d<R> {
    private final d<T> a;

    /* renamed from: b, reason: collision with root package name */
    private final l<T, R> f15788b;

    /* compiled from: Sequences.kt */
    public static final class a implements Iterator<R>, i.y.d.z.a, j$.util.Iterator {

        /* renamed from: e, reason: collision with root package name */
        private final Iterator<T> f15789e;

        a() {
            this.f15789e = k.this.a.iterator();
        }

        @Override // j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public boolean hasNext() {
            return this.f15789e.hasNext();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public R next() {
            return (R) k.this.f15788b.invoke(this.f15789e.next());
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(d<? extends T> dVar, l<? super T, ? extends R> lVar) {
        i.y.d.l.d(dVar, "sequence");
        i.y.d.l.d(lVar, "transformer");
        this.a = dVar;
        this.f15788b = lVar;
    }

    @Override // i.c0.d
    public java.util.Iterator<R> iterator() {
        return new a();
    }
}