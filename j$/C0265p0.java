package j$;

import java.util.function.LongUnaryOperator;

/* renamed from: j$.p0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0265p0 implements j$.util.function.F {
    final /* synthetic */ LongUnaryOperator a;

    private /* synthetic */ C0265p0(LongUnaryOperator longUnaryOperator) {
        this.a = longUnaryOperator;
    }

    public static /* synthetic */ j$.util.function.F c(LongUnaryOperator longUnaryOperator) {
        if (longUnaryOperator == null) {
            return null;
        }
        return longUnaryOperator instanceof C0267q0 ? ((C0267q0) longUnaryOperator).a : new C0265p0(longUnaryOperator);
    }

    @Override // j$.util.function.F
    public /* synthetic */ j$.util.function.F a(j$.util.function.F f2) {
        return c(this.a.andThen(C0267q0.a(f2)));
    }

    @Override // j$.util.function.F
    public /* synthetic */ long applyAsLong(long j2) {
        return this.a.applyAsLong(j2);
    }

    @Override // j$.util.function.F
    public /* synthetic */ j$.util.function.F b(j$.util.function.F f2) {
        return c(this.a.compose(C0267q0.a(f2)));
    }
}