package j$;

import java.util.function.IntUnaryOperator;

/* renamed from: j$.c0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0239c0 implements IntUnaryOperator {
    final /* synthetic */ j$.util.function.A a;

    private /* synthetic */ C0239c0(j$.util.function.A a) {
        this.a = a;
    }

    public static /* synthetic */ IntUnaryOperator a(j$.util.function.A a) {
        if (a == null) {
            return null;
        }
        return a instanceof C0237b0 ? ((C0237b0) a).a : new C0239c0(a);
    }

    @Override // java.util.function.IntUnaryOperator
    public /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
        return a(C0237b0.b(((C0237b0) this.a).a.andThen(a(C0237b0.b(intUnaryOperator)))));
    }

    @Override // java.util.function.IntUnaryOperator
    public /* synthetic */ int applyAsInt(int i2) {
        return ((C0237b0) this.a).a.applyAsInt(i2);
    }

    @Override // java.util.function.IntUnaryOperator
    public /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
        return a(C0237b0.b(((C0237b0) this.a).a.compose(a(C0237b0.b(intUnaryOperator)))));
    }
}