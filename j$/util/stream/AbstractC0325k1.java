package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.AbstractC0325k1;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;

/* renamed from: j$.util.stream.k1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC0325k1<P_IN, P_OUT, R, K extends AbstractC0325k1<P_IN, P_OUT, R, K>> extends CountedCompleter<R> {
    static final int a = ForkJoinPool.getCommonPoolParallelism() << 2;

    /* renamed from: b, reason: collision with root package name */
    protected final T1 f16316b;

    /* renamed from: c, reason: collision with root package name */
    protected Spliterator f16317c;

    /* renamed from: d, reason: collision with root package name */
    protected long f16318d;

    /* renamed from: e, reason: collision with root package name */
    protected AbstractC0325k1 f16319e;

    /* renamed from: f, reason: collision with root package name */
    protected AbstractC0325k1 f16320f;

    /* renamed from: g, reason: collision with root package name */
    private Object f16321g;

    protected AbstractC0325k1(T1 t1, Spliterator spliterator) {
        super(null);
        this.f16316b = t1;
        this.f16317c = spliterator;
        this.f16318d = 0L;
    }

    protected AbstractC0325k1(AbstractC0325k1 abstractC0325k1, Spliterator spliterator) {
        super(abstractC0325k1);
        this.f16317c = spliterator;
        this.f16316b = abstractC0325k1.f16316b;
        this.f16318d = abstractC0325k1.f16318d;
    }

    public static long h(long j2) {
        long j3 = j2 / a;
        if (j3 > 0) {
            return j3;
        }
        return 1L;
    }

    protected abstract Object a();

    protected Object b() {
        return this.f16321g;
    }

    protected AbstractC0325k1 c() {
        return (AbstractC0325k1) getCompleter();
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f16317c;
        long jEstimateSize = spliterator.estimateSize();
        long jH = this.f16318d;
        if (jH == 0) {
            jH = h(jEstimateSize);
            this.f16318d = jH;
        }
        boolean z = false;
        AbstractC0325k1<P_IN, P_OUT, R, K> abstractC0325k1 = this;
        while (jEstimateSize > jH && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            AbstractC0325k1<P_IN, P_OUT, R, K> abstractC0325k1F = abstractC0325k1.f(spliteratorTrySplit);
            abstractC0325k1.f16319e = abstractC0325k1F;
            AbstractC0325k1<P_IN, P_OUT, R, K> abstractC0325k1F2 = abstractC0325k1.f(spliterator);
            abstractC0325k1.f16320f = abstractC0325k1F2;
            abstractC0325k1.setPendingCount(1);
            if (z) {
                spliterator = spliteratorTrySplit;
                abstractC0325k1 = abstractC0325k1F;
                abstractC0325k1F = abstractC0325k1F2;
            } else {
                abstractC0325k1 = abstractC0325k1F2;
            }
            z = !z;
            abstractC0325k1F.fork();
            jEstimateSize = spliterator.estimateSize();
        }
        abstractC0325k1.g(abstractC0325k1.a());
        abstractC0325k1.tryComplete();
    }

    protected boolean d() {
        return this.f16319e == null;
    }

    protected boolean e() {
        return c() == null;
    }

    protected abstract AbstractC0325k1 f(Spliterator spliterator);

    protected void g(Object obj) {
        this.f16321g = obj;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return this.f16321g;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        this.f16317c = null;
        this.f16320f = null;
        this.f16319e = null;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    protected void setRawResult(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }
}