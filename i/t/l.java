package i.t;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: Collections.kt */
/* loaded from: classes3.dex */
public class l extends k {
    public static final <T> Collection<T> c(T[] tArr) {
        i.y.d.l.d(tArr, "$this$asCollection");
        return new c(tArr, false);
    }

    public static final <T extends Comparable<? super T>> int d(List<? extends T> list, T t, int i2, int i3) {
        i.y.d.l.d(list, "$this$binarySearch");
        l(list.size(), i2, i3);
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int iA = i.u.b.a(list.get(i5), t);
            if (iA < 0) {
                i2 = i5 + 1;
            } else {
                if (iA <= 0) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static /* synthetic */ int e(List list, Comparable comparable, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = list.size();
        }
        return d(list, comparable, i2, i3);
    }

    public static <T> List<T> f() {
        return v.f15841e;
    }

    public static <T> int g(List<? extends T> list) {
        i.y.d.l.d(list, "$this$lastIndex");
        return list.size() - 1;
    }

    public static <T> List<T> h(T... tArr) {
        i.y.d.l.d(tArr, "elements");
        return tArr.length > 0 ? g.b(tArr) : f();
    }

    public static <T> List<T> i(T... tArr) {
        i.y.d.l.d(tArr, "elements");
        return h.n(tArr);
    }

    public static <T> List<T> j(T... tArr) {
        i.y.d.l.d(tArr, "elements");
        return tArr.length == 0 ? new ArrayList() : new ArrayList(new c(tArr, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> List<T> k(List<? extends T> list) {
        i.y.d.l.d(list, "$this$optimizeReadOnlyList");
        int size = list.size();
        return size != 0 ? size != 1 ? list : k.b(list.get(0)) : f();
    }

    private static final void l(int i2, int i3, int i4) {
        if (i3 > i4) {
            throw new IllegalArgumentException("fromIndex (" + i3 + ") is greater than toIndex (" + i4 + ").");
        }
        if (i3 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i3 + ") is less than zero.");
        }
        if (i4 <= i2) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i4 + ") is greater than size (" + i2 + ").");
    }

    public static void m() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void n() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}