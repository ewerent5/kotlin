package j$;

import java.util.function.LongBinaryOperator;

/* renamed from: j$.e0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0243e0 implements LongBinaryOperator {
    final /* synthetic */ j$.util.function.B a;

    private /* synthetic */ C0243e0(j$.util.function.B b2) {
        this.a = b2;
    }

    public static /* synthetic */ LongBinaryOperator a(j$.util.function.B b2) {
        if (b2 == null) {
            return null;
        }
        return b2 instanceof C0241d0 ? ((C0241d0) b2).a : new C0243e0(b2);
    }

    @Override // java.util.function.LongBinaryOperator
    public /* synthetic */ long applyAsLong(long j2, long j3) {
        return this.a.applyAsLong(j2, j3);
    }
}