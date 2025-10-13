package j$;

import java.util.function.LongBinaryOperator;

/* renamed from: j$.d0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0241d0 implements j$.util.function.B {
    final /* synthetic */ LongBinaryOperator a;

    private /* synthetic */ C0241d0(LongBinaryOperator longBinaryOperator) {
        this.a = longBinaryOperator;
    }

    public static /* synthetic */ j$.util.function.B a(LongBinaryOperator longBinaryOperator) {
        if (longBinaryOperator == null) {
            return null;
        }
        return longBinaryOperator instanceof C0243e0 ? ((C0243e0) longBinaryOperator).a : new C0241d0(longBinaryOperator);
    }

    @Override // j$.util.function.B
    public /* synthetic */ long applyAsLong(long j2, long j3) {
        return this.a.applyAsLong(j2, j3);
    }
}