package g.a.a.a;

import j$.util.Iterator;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Iterator;

/* compiled from: CsvRowSpliterator.java */
/* loaded from: classes3.dex */
final class e<T> implements Spliterator<T> {
    private final Iterator<T> a;

    e(Iterator<T> it) {
        this.a = it;
    }

    @Override // j$.util.Spliterator
    public int characteristics() {
        return 1297;
    }

    @Override // j$.util.Spliterator
    public long estimateSize() {
        return Long.MAX_VALUE;
    }

    @Override // j$.util.Spliterator
    public void forEachRemaining(Consumer<? super T> consumer) {
        Iterator.EL.forEachRemaining(this.a, consumer);
    }

    @Override // j$.util.Spliterator
    public /* synthetic */ Comparator getComparator() {
        return Spliterator.CC.$default$getComparator(this);
    }

    @Override // j$.util.Spliterator
    public /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // j$.util.Spliterator
    public /* synthetic */ boolean hasCharacteristics(int i2) {
        return Spliterator.CC.$default$hasCharacteristics(this, i2);
    }

    @Override // j$.util.Spliterator
    public boolean tryAdvance(Consumer<? super T> consumer) {
        if (!this.a.hasNext()) {
            return false;
        }
        consumer.accept(this.a.next());
        return true;
    }

    @Override // j$.util.Spliterator
    public Spliterator<T> trySplit() {
        return null;
    }
}