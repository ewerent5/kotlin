package j$.util.stream;

import j$.util.function.Predicate;
import java.util.Objects;

/* renamed from: j$.util.stream.g1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0309g1 implements Predicate {
    public static final /* synthetic */ C0309g1 a = new C0309g1();

    private /* synthetic */ C0309g1() {
    }

    @Override // j$.util.function.Predicate
    public Predicate a(Predicate predicate) {
        Objects.requireNonNull(predicate);
        return new j$.util.function.k(this, predicate);
    }

    @Override // j$.util.function.Predicate
    public Predicate b(Predicate predicate) {
        Objects.requireNonNull(predicate);
        return new j$.util.function.m(this, predicate);
    }

    @Override // j$.util.function.Predicate
    public Predicate negate() {
        return new j$.util.function.l(this);
    }

    @Override // j$.util.function.Predicate
    public final boolean test(Object obj) {
        return ((j$.util.o) obj).c();
    }
}