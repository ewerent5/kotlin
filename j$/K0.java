package j$;

import j$.util.stream.InterfaceC0333m1;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/* loaded from: classes2.dex */
public final /* synthetic */ class K0 implements Collector {
    final /* synthetic */ InterfaceC0333m1 a;

    private /* synthetic */ K0(InterfaceC0333m1 interfaceC0333m1) {
        this.a = interfaceC0333m1;
    }

    public static /* synthetic */ Collector a(InterfaceC0333m1 interfaceC0333m1) {
        if (interfaceC0333m1 == null) {
            return null;
        }
        return interfaceC0333m1 instanceof J0 ? ((J0) interfaceC0333m1).a : new K0(interfaceC0333m1);
    }

    @Override // java.util.stream.Collector
    public /* synthetic */ BiConsumer accumulator() {
        return r.a(this.a.accumulator());
    }

    @Override // java.util.stream.Collector
    public /* synthetic */ Set characteristics() {
        return this.a.characteristics();
    }

    @Override // java.util.stream.Collector
    public /* synthetic */ BinaryOperator combiner() {
        return C0386v.a(this.a.combiner());
    }

    @Override // java.util.stream.Collector
    public /* synthetic */ Function finisher() {
        return N.a(this.a.finisher());
    }

    @Override // java.util.stream.Collector
    public /* synthetic */ Supplier supplier() {
        return A0.a(this.a.supplier());
    }
}