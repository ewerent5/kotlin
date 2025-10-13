package j$.util.function;

import java.util.Objects;

/* loaded from: classes2.dex */
public final /* synthetic */ class m implements Predicate {
    public final /* synthetic */ Predicate a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Predicate f16081b;

    public /* synthetic */ m(Predicate predicate, Predicate predicate2) {
        this.a = predicate;
        this.f16081b = predicate2;
    }

    @Override // j$.util.function.Predicate
    public Predicate a(Predicate predicate) {
        Objects.requireNonNull(predicate);
        return new k(this, predicate);
    }

    @Override // j$.util.function.Predicate
    public Predicate b(Predicate predicate) {
        Objects.requireNonNull(predicate);
        return new m(this, predicate);
    }

    @Override // j$.util.function.Predicate
    public Predicate negate() {
        return new l(this);
    }

    @Override // j$.util.function.Predicate
    public final boolean test(Object obj) {
        return this.a.test(obj) && this.f16081b.test(obj);
    }
}