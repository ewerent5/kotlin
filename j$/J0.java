package j$;

import j$.util.function.BiConsumer;
import j$.util.function.Function;
import j$.util.stream.InterfaceC0333m1;
import java.util.Set;
import java.util.stream.Collector;

/* loaded from: classes2.dex */
public final /* synthetic */ class J0 implements InterfaceC0333m1 {
    final /* synthetic */ Collector a;

    private /* synthetic */ J0(Collector collector) {
        this.a = collector;
    }

    public static /* synthetic */ InterfaceC0333m1 a(Collector collector) {
        if (collector == null) {
            return null;
        }
        return collector instanceof K0 ? ((K0) collector).a : new J0(collector);
    }

    @Override // j$.util.stream.InterfaceC0333m1
    public /* synthetic */ BiConsumer accumulator() {
        return C0266q.b(this.a.accumulator());
    }

    @Override // j$.util.stream.InterfaceC0333m1
    public /* synthetic */ Set characteristics() {
        return this.a.characteristics();
    }

    @Override // j$.util.stream.InterfaceC0333m1
    public /* synthetic */ j$.util.function.n combiner() {
        return C0272u.b(this.a.combiner());
    }

    @Override // j$.util.stream.InterfaceC0333m1
    public /* synthetic */ Function finisher() {
        return M.c(this.a.finisher());
    }

    @Override // j$.util.stream.InterfaceC0333m1
    public /* synthetic */ j$.util.function.J supplier() {
        return z0.a(this.a.supplier());
    }
}