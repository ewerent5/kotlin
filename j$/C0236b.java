package j$;

import j$.util.function.Consumer;
import j$.util.t;
import java.util.PrimitiveIterator;

/* renamed from: j$.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0236b implements t.a {
    final /* synthetic */ PrimitiveIterator.OfDouble a;

    private /* synthetic */ C0236b(PrimitiveIterator.OfDouble ofDouble) {
        this.a = ofDouble;
    }

    public static /* synthetic */ t.a a(PrimitiveIterator.OfDouble ofDouble) {
        if (ofDouble == null) {
            return null;
        }
        return ofDouble instanceof C0238c ? ((C0238c) ofDouble).a : new C0236b(ofDouble);
    }

    @Override // j$.util.t.a
    /* renamed from: d */
    public /* synthetic */ void forEachRemaining(j$.util.function.q qVar) {
        this.a.forEachRemaining(B.a(qVar));
    }

    @Override // j$.util.t.a, j$.util.Iterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining(C0388x.a(consumer));
    }

    @Override // j$.util.t
    public /* synthetic */ void forEachRemaining(Object obj) {
        this.a.forEachRemaining((PrimitiveIterator.OfDouble) obj);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public /* synthetic */ boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // j$.util.t.a, java.util.Iterator, j$.util.Iterator
    public /* synthetic */ Double next() {
        return this.a.next();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public /* synthetic */ Object next() {
        return this.a.next();
    }

    @Override // j$.util.t.a
    public /* synthetic */ double nextDouble() {
        return this.a.nextDouble();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public /* synthetic */ void remove() {
        this.a.remove();
    }
}