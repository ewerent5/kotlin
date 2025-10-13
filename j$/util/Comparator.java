package j$.util;

import j$.util.function.Function;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;
import java.util.Objects;

/* loaded from: classes2.dex */
public interface Comparator<T> {
    int compare(Object obj, Object obj2);

    boolean equals(Object obj);

    java.util.Comparator reversed();

    java.util.Comparator thenComparing(Function function);

    java.util.Comparator thenComparing(Function function, java.util.Comparator comparator);

    java.util.Comparator thenComparing(java.util.Comparator comparator);

    java.util.Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction);

    java.util.Comparator thenComparingInt(ToIntFunction toIntFunction);

    java.util.Comparator thenComparingLong(ToLongFunction toLongFunction);

    /* renamed from: j$.util.Comparator$-CC */
    public final /* synthetic */ class CC {
        public static java.util.Comparator $default$thenComparing(java.util.Comparator comparator, Function function) {
            Objects.requireNonNull(function);
            return j$.time.a.M(comparator, new a(function));
        }

        public static java.util.Comparator $default$thenComparingDouble(java.util.Comparator comparator, ToDoubleFunction toDoubleFunction) {
            Objects.requireNonNull(toDoubleFunction);
            return j$.time.a.M(comparator, new c(toDoubleFunction));
        }

        public static java.util.Comparator $default$thenComparingInt(java.util.Comparator comparator, ToIntFunction toIntFunction) {
            Objects.requireNonNull(toIntFunction);
            return j$.time.a.M(comparator, new e(toIntFunction));
        }

        public static java.util.Comparator $default$thenComparingLong(java.util.Comparator comparator, ToLongFunction toLongFunction) {
            Objects.requireNonNull(toLongFunction);
            return j$.time.a.M(comparator, new f(toLongFunction));
        }

        public static java.util.Comparator a() {
            return k.INSTANCE;
        }

        public static java.util.Comparator $default$thenComparing(java.util.Comparator comparator, Function function, java.util.Comparator comparator2) {
            Objects.requireNonNull(function);
            Objects.requireNonNull(comparator2);
            return j$.time.a.M(comparator, new b(comparator2, function));
        }

        public static java.util.Comparator $default$thenComparing(java.util.Comparator comparator, java.util.Comparator comparator2) {
            Objects.requireNonNull(comparator2);
            return new d(comparator, comparator2);
        }
    }
}