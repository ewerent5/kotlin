package j$;

import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class A implements j$.util.function.q {
    final /* synthetic */ DoubleConsumer a;

    private /* synthetic */ A(DoubleConsumer doubleConsumer) {
        this.a = doubleConsumer;
    }

    public static /* synthetic */ j$.util.function.q b(DoubleConsumer doubleConsumer) {
        if (doubleConsumer == null) {
            return null;
        }
        return doubleConsumer instanceof B ? ((B) doubleConsumer).a : new A(doubleConsumer);
    }

    @Override // j$.util.function.q
    public /* synthetic */ void accept(double d2) {
        this.a.accept(d2);
    }

    @Override // j$.util.function.q
    public /* synthetic */ j$.util.function.q k(j$.util.function.q qVar) {
        return b(this.a.andThen(B.a(qVar)));
    }
}