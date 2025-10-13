package j$;

import java.util.function.IntUnaryOperator;

/* renamed from: j$.b0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0237b0 implements j$.util.function.A {
    final /* synthetic */ IntUnaryOperator a;

    private /* synthetic */ C0237b0(IntUnaryOperator intUnaryOperator) {
        this.a = intUnaryOperator;
    }

    public static /* synthetic */ j$.util.function.A b(IntUnaryOperator intUnaryOperator) {
        if (intUnaryOperator == null) {
            return null;
        }
        return intUnaryOperator instanceof C0239c0 ? ((C0239c0) intUnaryOperator).a : new C0237b0(intUnaryOperator);
    }

    public /* synthetic */ int a(int i2) {
        return this.a.applyAsInt(i2);
    }
}