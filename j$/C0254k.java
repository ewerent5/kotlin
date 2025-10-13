package j$;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Spliterator;

/* renamed from: j$.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0254k implements Spliterator.b {
    final /* synthetic */ Spliterator.OfInt a;

    private /* synthetic */ C0254k(Spliterator.OfInt ofInt) {
        this.a = ofInt;
    }

    public static /* synthetic */ Spliterator.b a(Spliterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return ofInt instanceof C0256l ? ((C0256l) ofInt).a : new C0254k(ofInt);
    }

    @Override // j$.util.Spliterator.b
    /* renamed from: b */
    public /* synthetic */ void forEachRemaining(j$.util.function.w wVar) {
        this.a.forEachRemaining(S.a(wVar));
    }

    @Override // j$.util.Spliterator
    public /* synthetic */ int characteristics() {
        return this.a.characteristics();
    }

    @Override // j$.util.Spliterator
    public /* synthetic */ long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // j$.util.Spliterator.b, j$.util.Spliterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining(C0388x.a(consumer));
    }

    @Override // j$.util.Spliterator.d
    /* renamed from: forEachRemaining */
    public /* synthetic */ void d(Object obj) {
        this.a.forEachRemaining((Spliterator.OfInt) obj);
    }

    @Override // j$.util.Spliterator.b
    /* renamed from: g */
    public /* synthetic */ boolean tryAdvance(j$.util.function.w wVar) {
        return this.a.tryAdvance(S.a(wVar));
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

    @Override // j$.util.Spliterator.b, j$.util.Spliterator
    public /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.a.tryAdvance(C0388x.a(consumer));
    }

    @Override // j$.util.Spliterator.d
    /* renamed from: tryAdvance */
    public /* synthetic */ boolean j(Object obj) {
        return this.a.tryAdvance((Spliterator.OfInt) obj);
    }

    @Override // j$.util.Spliterator.b, j$.util.Spliterator.d, j$.util.Spliterator
    public /* synthetic */ Spliterator.b trySplit() {
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