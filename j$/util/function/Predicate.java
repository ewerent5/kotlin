package j$.util.function;

/* loaded from: classes2.dex */
public interface Predicate<T> {
    Predicate a(Predicate predicate);

    Predicate b(Predicate predicate);

    Predicate negate();

    boolean test(Object obj);
}