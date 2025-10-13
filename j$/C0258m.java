package j$;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Spliterator;

/* renamed from: j$.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0258m implements Spliterator.c {
    final /* synthetic */ Spliterator.OfLong a;

    private /* synthetic */ C0258m(Spliterator.OfLong ofLong) {
        this.a = ofLong;
    }

    public static /* synthetic */ Spliterator.c a(Spliterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof C0260n ? ((C0260n) ofLong).a : new C0258m(ofLong);
    }

    @Override // j$.util.Spliterator.c
    /* renamed from: c */
    public /* synthetic */ void forEachRemaining(j$.util.function.C c2) {
        this.a.forEachRemaining(C0247g0.a(c2));
    }

    @Override // j$.util.Spliterator
    public /* synthetic */ int characteristics() {
        return this.a.characteristics();
    }

    @Override // j$.util.Spliterator
    public /* synthetic */ long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // j$.util.Spliterator.c, j$.util.Spliterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining(C0388x.a(consumer));
    }

    @Override // j$.util.Spliterator.d
    /* renamed from: forEachRemaining */
    public /* synthetic */ void d(Object obj) {
        this.a.forEachRemaining((Spliterator.OfLong) obj);
    }

    @Override // j$.util.Spliterator
    public /* synthetic */ Comparator getComparator() {
        return this.a.getComparator();
    }

    @Override // j$.util.Spliterator
    public /* synthetic */ long getExactSizeIfKnown() {
        return this.a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator.c
    /* renamed from: h */
    public /* synthetic */ boolean tryAdvance(j$.util.function.C c2) {
        return this.a.tryAdvance(C0247g0.a(c2));
    }

    @Override // j$.util.Spliterator
    public /* synthetic */ boolean hasCharacteristics(int i2) {
        return this.a.hasCharacteristics(i2);
    }

    @Override // j$.util.Spliterator.c, j$.util.Spliterator
    public /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.a.tryAdvance(C0388x.a(consumer));
    }

    @Override // j$.util.Spliterator.d
    /* renamed from: tryAdvance */
    public /* synthetic */ boolean j(Object obj) {
        return this.a.tryAdvance((Spliterator.OfLong) obj);
    }

    @Override // j$.util.Spliterator.c, j$.util.Spliterator.d, j$.util.Spliterator
    public /* synthetic */ Spliterator.c trySplit() {
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