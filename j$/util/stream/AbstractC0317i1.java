package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.AbstractC0317i1;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: j$.util.stream.i1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC0317i1<P_IN, P_OUT, R, K extends AbstractC0317i1<P_IN, P_OUT, R, K>> extends AbstractC0325k1<P_IN, P_OUT, R, K> {

    /* renamed from: h, reason: collision with root package name */
    protected final AtomicReference f16305h;

    /* renamed from: i, reason: collision with root package name */
    protected volatile boolean f16306i;

    protected AbstractC0317i1(T1 t1, Spliterator spliterator) {
        super(t1, spliterator);
        this.f16305h = new AtomicReference(null);
    }

    protected AbstractC0317i1(AbstractC0317i1 abstractC0317i1, Spliterator spliterator) {
        super(abstractC0317i1, spliterator);
        this.f16305h = abstractC0317i1.f16305h;
    }

    @Override // j$.util.stream.AbstractC0325k1
    public Object b() {
        if (!e()) {
            return super.b();
        }
        Object obj = this.f16305h.get();
        return obj == null ? k() : obj;
    }

    @Override // j$.util.stream.AbstractC0325k1, java.util.concurrent.CountedCompleter
    public void compute() {
        Object objK;
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f16317c;
        long jEstimateSize = spliterator.estimateSize();
        long jH = this.f16318d;
        if (jH == 0) {
            jH = AbstractC0325k1.h(jEstimateSize);
            this.f16318d = jH;
        }
        boolean z = false;
        AtomicReference atomicReference = this.f16305h;
        AbstractC0317i1<P_IN, P_OUT, R, K> abstractC0317i1 = this;
        while (true) {
            objK = atomicReference.get();
            if (objK != null) {
                break;
            }
            boolean z2 = abstractC0317i1.f16306i;
            if (!z2) {
                AbstractC0325k1 abstractC0325k1C = abstractC0317i1.c();
                while (true) {
                    AbstractC0317i1 abstractC0317i12 = (AbstractC0317i1) abstractC0325k1C;
                    if (z2 || abstractC0317i12 == null) {
                        break;
                    }
                    z2 = abstractC0317i12.f16306i;
                    abstractC0325k1C = abstractC0317i12.c();
                }
            }
            if (z2) {
                objK = abstractC0317i1.k();
                break;
            }
            if (jEstimateSize <= jH || (spliteratorTrySplit = spliterator.trySplit()) == null) {
                break;
            }
            AbstractC0317i1<P_IN, P_OUT, R, K> abstractC0317i13 = (AbstractC0317i1) abstractC0317i1.f(spliteratorTrySplit);
            abstractC0317i1.f16319e = abstractC0317i13;
            AbstractC0317i1<P_IN, P_OUT, R, K> abstractC0317i14 = (AbstractC0317i1) abstractC0317i1.f(spliterator);
            abstractC0317i1.f16320f = abstractC0317i14;
            abstractC0317i1.setPendingCount(1);
            if (z) {
                spliterator = spliteratorTrySplit;
                abstractC0317i1 = abstractC0317i13;
                abstractC0317i13 = abstractC0317i14;
            } else {
                abstractC0317i1 = abstractC0317i14;
            }
            z = !z;
            abstractC0317i13.fork();
            jEstimateSize = spliterator.estimateSize();
        }
        objK = abstractC0317i1.a();
        abstractC0317i1.g(objK);
        abstractC0317i1.tryComplete();
    }

    @Override // j$.util.stream.AbstractC0325k1
    protected void g(Object obj) {
        if (!e()) {
            super.g(obj);
        } else if (obj != null) {
            this.f16305h.compareAndSet(null, obj);
        }
    }

    @Override // j$.util.stream.AbstractC0325k1, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return b();
    }

    protected void i() {
        this.f16306i = true;
    }

    protected void j() {
        AbstractC0317i1<P_IN, P_OUT, R, K> abstractC0317i1 = this;
        for (AbstractC0317i1<P_IN, P_OUT, R, K> abstractC0317i12 = (AbstractC0317i1) c(); abstractC0317i12 != null; abstractC0317i12 = (AbstractC0317i1) abstractC0317i12.c()) {
            if (abstractC0317i12.f16319e == abstractC0317i1) {
                AbstractC0317i1 abstractC0317i13 = (AbstractC0317i1) abstractC0317i12.f16320f;
                if (!abstractC0317i13.f16306i) {
                    abstractC0317i13.i();
                }
            }
            abstractC0317i1 = abstractC0317i12;
        }
    }

    protected abstract Object k();

    protected void l(Object obj) {
        if (obj != null) {
            this.f16305h.compareAndSet(null, obj);
        }
    }
}