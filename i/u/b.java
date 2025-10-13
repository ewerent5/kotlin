package i.u;

import java.util.Comparator;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Comparisons.kt */
/* loaded from: classes3.dex */
public class b {
    public static <T extends Comparable<?>> int a(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }

    public static <T extends Comparable<? super T>> Comparator<T> b() {
        e eVar = e.f15844e;
        Objects.requireNonNull(eVar, "null cannot be cast to non-null type kotlin.Comparator<T> /* = java.util.Comparator<T> */");
        return eVar;
    }
}