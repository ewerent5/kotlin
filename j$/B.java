package j$;

import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class B implements DoubleConsumer {
    final /* synthetic */ j$.util.function.q a;

    private /* synthetic */ B(j$.util.function.q qVar) {
        this.a = qVar;
    }

    public static /* synthetic */ DoubleConsumer a(j$.util.function.q qVar) {
        if (qVar == null) {
            return null;
        }
        return qVar instanceof A ? ((A) qVar).a : new B(qVar);
    }

    @Override // java.util.function.DoubleConsumer
    public /* synthetic */ void accept(double d2) {
        this.a.accept(d2);
    }

    @Override // java.util.function.DoubleConsumer
    public /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return a(this.a.k(A.b(doubleConsumer)));
    }
}