package i.t;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _Arrays.kt */
/* loaded from: classes3.dex */
public class h extends g {
    public static <T> boolean m(T[] tArr, T t) {
        i.y.d.l.d(tArr, "$this$contains");
        return r(tArr, t) >= 0;
    }

    public static final <T> List<T> n(T[] tArr) {
        i.y.d.l.d(tArr, "$this$filterNotNull");
        return (List) o(tArr, new ArrayList());
    }

    public static final <C extends Collection<? super T>, T> C o(T[] tArr, C c2) {
        i.y.d.l.d(tArr, "$this$filterNotNullTo");
        i.y.d.l.d(c2, "destination");
        for (T t : tArr) {
            if (t != null) {
                c2.add(t);
            }
        }
        return c2;
    }

    public static <T> i.a0.c p(T[] tArr) {
        i.y.d.l.d(tArr, "$this$indices");
        return new i.a0.c(0, q(tArr));
    }

    public static <T> int q(T[] tArr) {
        i.y.d.l.d(tArr, "$this$lastIndex");
        return tArr.length - 1;
    }

    public static final <T> int r(T[] tArr, T t) {
        i.y.d.l.d(tArr, "$this$indexOf");
        int i2 = 0;
        if (t == null) {
            int length = tArr.length;
            while (i2 < length) {
                if (tArr[i2] == null) {
                    return i2;
                }
                i2++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i2 < length2) {
            if (i.y.d.l.a(t, tArr[i2])) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static char s(char[] cArr) {
        i.y.d.l.d(cArr, "$this$single");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static <T> T t(T[] tArr) {
        i.y.d.l.d(tArr, "$this$singleOrNull");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    public static final <T> T[] u(T[] tArr, Comparator<? super T> comparator) {
        i.y.d.l.d(tArr, "$this$sortedArrayWith");
        i.y.d.l.d(comparator, "comparator");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        i.y.d.l.c(tArr2, "java.util.Arrays.copyOf(this, size)");
        g.l(tArr2, comparator);
        return tArr2;
    }

    public static <T> List<T> v(T[] tArr, Comparator<? super T> comparator) {
        i.y.d.l.d(tArr, "$this$sortedWith");
        i.y.d.l.d(comparator, "comparator");
        return g.b(u(tArr, comparator));
    }

    public static <T> List<T> w(T[] tArr) {
        i.y.d.l.d(tArr, "$this$toList");
        int length = tArr.length;
        return length != 0 ? length != 1 ? x(tArr) : k.b(tArr[0]) : l.f();
    }

    public static <T> List<T> x(T[] tArr) {
        i.y.d.l.d(tArr, "$this$toMutableList");
        return new ArrayList(l.c(tArr));
    }
}