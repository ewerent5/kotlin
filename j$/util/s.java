package j$.util;

import j$.util.Spliterator;
import j$.util.function.C;
import j$.util.function.Consumer;
import java.util.Objects;
import java.util.SortedSet;

/* loaded from: classes2.dex */
public final /* synthetic */ class s {
    public static void a(Spliterator.a aVar, Consumer consumer) {
        if (consumer instanceof j$.util.function.q) {
            aVar.forEachRemaining((j$.util.function.q) consumer);
        } else {
            if (w.a) {
                w.a(aVar.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            aVar.forEachRemaining(new j(consumer));
        }
    }

    public static void b(Spliterator.b bVar, Consumer consumer) {
        if (consumer instanceof j$.util.function.w) {
            bVar.forEachRemaining((j$.util.function.w) consumer);
        } else {
            if (w.a) {
                w.a(bVar.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            bVar.forEachRemaining(new h(consumer));
        }
    }

    public static void c(Spliterator.c cVar, Consumer consumer) {
        if (consumer instanceof C) {
            cVar.forEachRemaining((C) consumer);
        } else {
            if (w.a) {
                w.a(cVar.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            cVar.forEachRemaining(new g(consumer));
        }
    }

    public static Spliterator d(SortedSet sortedSet) {
        return new u(sortedSet, sortedSet, 21);
    }

    public static boolean e(Spliterator.a aVar, Consumer consumer) {
        if (consumer instanceof j$.util.function.q) {
            return aVar.tryAdvance((j$.util.function.q) consumer);
        }
        if (w.a) {
            w.a(aVar.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return aVar.tryAdvance(new j(consumer));
    }

    public static boolean f(Spliterator.b bVar, Consumer consumer) {
        if (consumer instanceof j$.util.function.w) {
            return bVar.tryAdvance((j$.util.function.w) consumer);
        }
        if (w.a) {
            w.a(bVar.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return bVar.tryAdvance(new h(consumer));
    }

    public static boolean g(Spliterator.c cVar, Consumer consumer) {
        if (consumer instanceof C) {
            return cVar.tryAdvance((C) consumer);
        }
        if (w.a) {
            w.a(cVar.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return cVar.tryAdvance(new g(consumer));
    }
}