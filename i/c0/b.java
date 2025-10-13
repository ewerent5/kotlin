package i.c0;

import ch.qos.logback.core.CoreConstants;
import i.y.d.l;
import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;

/* compiled from: Sequences.kt */
/* loaded from: classes3.dex */
public final class b<T> implements d<T>, c<T> {
    private final d<T> a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15783b;

    /* compiled from: Sequences.kt */
    public static final class a implements Iterator<T>, i.y.d.z.a, j$.util.Iterator {

        /* renamed from: e, reason: collision with root package name */
        private final Iterator<T> f15784e;

        /* renamed from: f, reason: collision with root package name */
        private int f15785f;

        a() {
            this.f15784e = b.this.a.iterator();
            this.f15785f = b.this.f15783b;
        }

        private final void a() {
            while (this.f15785f > 0 && this.f15784e.hasNext()) {
                this.f15784e.next();
                this.f15785f--;
            }
        }

        @Override // j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public boolean hasNext() {
            a();
            return this.f15784e.hasNext();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public T next() {
            a();
            return this.f15784e.next();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(d<? extends T> dVar, int i2) {
        l.d(dVar, "sequence");
        this.a = dVar;
        this.f15783b = i2;
        if (i2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i2 + CoreConstants.DOT).toString());
    }

    @Override // i.c0.c
    public d<T> a(int i2) {
        int i3 = this.f15783b + i2;
        return i3 < 0 ? new b(this, i2) : new b(this.a, i3);
    }

    @Override // i.c0.d
    public java.util.Iterator<T> iterator() {
        return new a();
    }
}