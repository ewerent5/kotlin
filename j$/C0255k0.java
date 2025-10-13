package j$;

import java.util.function.LongPredicate;

/* renamed from: j$.k0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0255k0 implements LongPredicate {
    final /* synthetic */ j$.util.function.E a;

    private /* synthetic */ C0255k0(j$.util.function.E e2) {
        this.a = e2;
    }

    public static /* synthetic */ LongPredicate a(j$.util.function.E e2) {
        if (e2 == null) {
            return null;
        }
        return e2 instanceof C0253j0 ? ((C0253j0) e2).a : new C0255k0(e2);
    }

    @Override // java.util.function.LongPredicate
    public /* synthetic */ LongPredicate and(LongPredicate longPredicate) {
        return a(C0253j0.a(((C0253j0) this.a).a.and(a(C0253j0.a(longPredicate)))));
    }

    @Override // java.util.function.LongPredicate
    public /* synthetic */ LongPredicate negate() {
        return a(C0253j0.a(((C0253j0) this.a).a.negate()));
    }

    @Override // java.util.function.LongPredicate
    public /* synthetic */ LongPredicate or(LongPredicate longPredicate) {
        return a(C0253j0.a(((C0253j0) this.a).a.or(a(C0253j0.a(longPredicate)))));
    }

    @Override // java.util.function.LongPredicate
    public /* synthetic */ boolean test(long j2) {
        return ((C0253j0) this.a).a.test(j2);
    }
}