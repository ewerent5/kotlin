package j$;

import j$.util.t;
import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* renamed from: j$.c */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0238c implements PrimitiveIterator.OfDouble {
    final /* synthetic */ t.a a;

    private /* synthetic */ C0238c(t.a aVar) {
        this.a = aVar;
    }

    public static /* synthetic */ PrimitiveIterator.OfDouble a(t.a aVar) {
        if (aVar == null) {
            return null;
        }
        return aVar instanceof C0236b ? ((C0236b) aVar).a : new C0238c(aVar);
    }

    @Override // java.util.PrimitiveIterator
    public /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.a.forEachRemaining(doubleConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining(C0387w.b(consumer));
    }

    @Override // java.util.PrimitiveIterator.OfDouble
    /* renamed from: forEachRemaining */
    public /* synthetic */ void forEachRemaining2(DoubleConsumer doubleConsumer) {
        this.a.forEachRemaining(A.b(doubleConsumer));
    }

    @Override // java.util.Iterator
    public /* synthetic */ boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public /* synthetic */ Double next() {
        return this.a.next();
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public /* synthetic */ Object next() {
        return this.a.next();
    }

    @Override // java.util.PrimitiveIterator.OfDouble
    public /* synthetic */ double nextDouble() {
        return this.a.nextDouble();
    }

    @Override // java.util.Iterator
    public /* synthetic */ void remove() {
        this.a.remove();
    }
}