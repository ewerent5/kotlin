package j$;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Spliterator;

/* renamed from: j$.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0250i implements Spliterator.a {
    final /* synthetic */ Spliterator.OfDouble a;

    private /* synthetic */ C0250i(Spliterator.OfDouble ofDouble) {
        this.a = ofDouble;
    }

    public static /* synthetic */ Spliterator.a a(Spliterator.OfDouble ofDouble) {
        if (ofDouble == null) {
            return null;
        }
        return ofDouble instanceof C0252j ? ((C0252j) ofDouble).a : new C0250i(ofDouble);
    }

    @Override // j$.util.Spliterator
    public /* synthetic */ int characteristics() {
        return this.a.characteristics();
    }

    @Override // j$.util.Spliterator.a
    /* renamed from: d */
    public /* synthetic */ void forEachRemaining(j$.util.function.q qVar) {
        this.a.forEachRemaining(B.a(qVar));
    }

    @Override // j$.util.Spliterator
    public /* synthetic */ long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // j$.util.Spliterator.a, j$.util.Spliterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining(C0388x.a(consumer));
    }

    @Override // j$.util.Spliterator.d
    /* renamed from: forEachRemaining */
    public /* synthetic */ void d(Object obj) {
        this.a.forEachRemaining((Spliterator.OfDouble) obj);
    }

    @Override // j$.util.Spliterator
    public /* synthetic */ Comparator getComparator() {
        return this.a.getComparator();
    }

    @Override // j$.util.Spliterator
    public /* synthetic */ long getExactSizeIfKnown() {
        return this.a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public /* synthetic */ boolean hasCharacteristics(int i2) {
        return this.a.hasCharacteristics(i2);
    }

    @Override // j$.util.Spliterator.a
    /* renamed from: j */
    public /* synthetic */ boolean tryAdvance(j$.util.function.q qVar) {
        return this.a.tryAdvance(B.a(qVar));
    }

    @Override // j$.util.Spliterator.a, j$.util.Spliterator
    public /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.a.tryAdvance(C0388x.a(consumer));
    }

    @Override // j$.util.Spliterator.d
    /* renamed from: tryAdvance */
    public /* synthetic */ boolean j(Object obj) {
        return this.a.tryAdvance((Spliterator.OfDouble) obj);
    }

    @Override // j$.util.Spliterator.a, j$.util.Spliterator.d, j$.util.Spliterator
    public /* synthetic */ Spliterator.a trySplit() {
        return a(this.a.trySplit());
    }

    @Override // j$.util.Spliterator.d, j$.util.Spliterator
    public /* synthetic */ Spliterator.d trySplit() {
        return C0262o.a(this.a.trySplit());
    }

    @Override // j$.util.Spliterator
    public /* synthetic */ j$.util.Spliterator trySplit() {
        return C0248h.a(this.a.trySplit());
    }
}