package j$;

import java.util.function.LongUnaryOperator;

/* renamed from: j$.q0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0267q0 implements LongUnaryOperator {
    final /* synthetic */ j$.util.function.F a;

    private /* synthetic */ C0267q0(j$.util.function.F f2) {
        this.a = f2;
    }

    public static /* synthetic */ LongUnaryOperator a(j$.util.function.F f2) {
        if (f2 == null) {
            return null;
        }
        return f2 instanceof C0265p0 ? ((C0265p0) f2).a : new C0267q0(f2);
    }

    @Override // java.util.function.LongUnaryOperator
    public /* synthetic */ LongUnaryOperator andThen(LongUnaryOperator longUnaryOperator) {
        return a(this.a.a(C0265p0.c(longUnaryOperator)));
    }

    @Override // java.util.function.LongUnaryOperator
    public /* synthetic */ long applyAsLong(long j2) {
        return this.a.applyAsLong(j2);
    }

    @Override // java.util.function.LongUnaryOperator
    public /* synthetic */ LongUnaryOperator compose(LongUnaryOperator longUnaryOperator) {
        return a(this.a.b(C0265p0.c(longUnaryOperator)));
    }
}