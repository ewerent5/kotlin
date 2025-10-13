package j$.util;

import j$.util.function.C;
import j$.util.function.Consumer;

/* loaded from: classes2.dex */
public interface Spliterator<T> {
    public static final int CONCURRENT = 4096;
    public static final int DISTINCT = 1;
    public static final int IMMUTABLE = 1024;
    public static final int NONNULL = 256;
    public static final int ORDERED = 16;
    public static final int SIZED = 64;
    public static final int SORTED = 4;
    public static final int SUBSIZED = 16384;

    /* renamed from: j$.util.Spliterator$-CC */
    public final /* synthetic */ class CC {
        public static java.util.Comparator $default$getComparator(Spliterator spliterator) {
            throw new IllegalStateException();
        }

        public static long $default$getExactSizeIfKnown(Spliterator spliterator) {
            if ((spliterator.characteristics() & 64) == 0) {
                return -1L;
            }
            return spliterator.estimateSize();
        }

        public static boolean $default$hasCharacteristics(Spliterator spliterator, int i2) {
            return (spliterator.characteristics() & i2) == i2;
        }
    }

    public interface a extends d<Double, j$.util.function.q, a> {
        void d(j$.util.function.q qVar);

        @Override // j$.util.Spliterator
        void forEachRemaining(Consumer consumer);

        boolean j(j$.util.function.q qVar);

        @Override // j$.util.Spliterator
        boolean tryAdvance(Consumer consumer);

        @Override // j$.util.Spliterator.d, j$.util.Spliterator
        a trySplit();
    }

    public interface b extends d<Integer, j$.util.function.w, b> {
        void b(j$.util.function.w wVar);

        @Override // j$.util.Spliterator
        void forEachRemaining(Consumer consumer);

        boolean g(j$.util.function.w wVar);

        @Override // j$.util.Spliterator
        boolean tryAdvance(Consumer consumer);

        @Override // j$.util.Spliterator.d, j$.util.Spliterator
        b trySplit();
    }

    public interface c extends d<Long, C, c> {
        void c(C c2);

        @Override // j$.util.Spliterator
        void forEachRemaining(Consumer consumer);

        boolean h(C c2);

        @Override // j$.util.Spliterator
        boolean tryAdvance(Consumer consumer);

        @Override // j$.util.Spliterator.d, j$.util.Spliterator
        c trySplit();
    }

    public interface d<T, T_CONS, T_SPLITR extends d<T, T_CONS, T_SPLITR>> extends Spliterator<T> {
        void forEachRemaining(Object obj);

        boolean tryAdvance(Object obj);

        @Override // j$.util.Spliterator
        d trySplit();
    }

    int characteristics();

    long estimateSize();

    void forEachRemaining(Consumer consumer);

    java.util.Comparator getComparator();

    long getExactSizeIfKnown();

    boolean hasCharacteristics(int i2);

    boolean tryAdvance(Consumer consumer);

    Spliterator trySplit();
}