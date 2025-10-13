package j$;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.Comparator;

/* renamed from: j$.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0248h implements Spliterator {
    final /* synthetic */ java.util.Spliterator a;

    private /* synthetic */ C0248h(java.util.Spliterator spliterator) {
        this.a = spliterator;
    }

    public static /* synthetic */ Spliterator a(java.util.Spliterator spliterator) {
        if (spliterator == null) {
            return null;
        }
        return spliterator instanceof C$r8$wrapper$java$util$Spliterator$WRP ? ((C$r8$wrapper$java$util$Spliterator$WRP) spliterator).a : new C0248h(spliterator);
    }

    @Override // j$.util.Spliterator
    public /* synthetic */ int characteristics() {
        return this.a.characteristics();
    }

    @Override // j$.util.Spliterator
    public /* synthetic */ long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining(C0388x.a(consumer));
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

    @Override // j$.util.Spliterator
    public /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.a.tryAdvance(C0388x.a(consumer));
    }

    @Override // j$.util.Spliterator
    public /* synthetic */ Spliterator trySplit() {
        return a(this.a.trySplit());
    }
}