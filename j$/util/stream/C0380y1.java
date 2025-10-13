package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* renamed from: j$.util.stream.y1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0380y1<S, T> extends CountedCompleter<Void> {
    private Spliterator a;

    /* renamed from: b, reason: collision with root package name */
    private final A2 f16380b;

    /* renamed from: c, reason: collision with root package name */
    private final T1 f16381c;

    /* renamed from: d, reason: collision with root package name */
    private long f16382d;

    C0380y1(T1 t1, Spliterator spliterator, A2 a2) {
        super(null);
        this.f16380b = a2;
        this.f16381c = t1;
        this.a = spliterator;
        this.f16382d = 0L;
    }

    C0380y1(C0380y1 c0380y1, Spliterator spliterator) {
        super(c0380y1);
        this.a = spliterator;
        this.f16380b = c0380y1.f16380b;
        this.f16382d = c0380y1.f16382d;
        this.f16381c = c0380y1.f16381c;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.a;
        long jEstimateSize = spliterator.estimateSize();
        long jH = this.f16382d;
        if (jH == 0) {
            jH = AbstractC0325k1.h(jEstimateSize);
            this.f16382d = jH;
        }
        boolean zN = T2.SHORT_CIRCUIT.n(this.f16381c.r0());
        boolean z = false;
        A2 a2 = this.f16380b;
        C0380y1<S, T> c0380y1 = this;
        while (true) {
            if (zN && a2.o()) {
                break;
            }
            if (jEstimateSize <= jH || (spliteratorTrySplit = spliterator.trySplit()) == null) {
                break;
            }
            C0380y1<S, T> c0380y12 = new C0380y1<>(c0380y1, spliteratorTrySplit);
            c0380y1.addToPendingCount(1);
            if (z) {
                spliterator = spliteratorTrySplit;
            } else {
                C0380y1<S, T> c0380y13 = c0380y1;
                c0380y1 = c0380y12;
                c0380y12 = c0380y13;
            }
            z = !z;
            c0380y1.fork();
            c0380y1 = c0380y12;
            jEstimateSize = spliterator.estimateSize();
        }
        c0380y1.f16381c.m0(a2, spliterator);
        c0380y1.a = null;
        c0380y1.propagateCompletion();
    }
}