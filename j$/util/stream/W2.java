package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.AbstractC0321j1;
import java.util.Comparator;

/* loaded from: classes2.dex */
abstract class W2<P_IN, P_OUT, T_BUFFER extends AbstractC0321j1> implements Spliterator<P_OUT> {
    final boolean a;

    /* renamed from: b, reason: collision with root package name */
    final T1 f16236b;

    /* renamed from: c, reason: collision with root package name */
    private j$.util.function.J f16237c;

    /* renamed from: d, reason: collision with root package name */
    Spliterator f16238d;

    /* renamed from: e, reason: collision with root package name */
    A2 f16239e;

    /* renamed from: f, reason: collision with root package name */
    j$.util.function.o f16240f;

    /* renamed from: g, reason: collision with root package name */
    long f16241g;

    /* renamed from: h, reason: collision with root package name */
    AbstractC0321j1 f16242h;

    /* renamed from: i, reason: collision with root package name */
    boolean f16243i;

    W2(T1 t1, Spliterator spliterator, boolean z) {
        this.f16236b = t1;
        this.f16237c = null;
        this.f16238d = spliterator;
        this.a = z;
    }

    W2(T1 t1, j$.util.function.J j2, boolean z) {
        this.f16236b = t1;
        this.f16237c = j2;
        this.f16238d = null;
        this.a = z;
    }

    private boolean e() {
        while (this.f16242h.count() == 0) {
            if (this.f16239e.o() || !this.f16240f.a()) {
                if (this.f16243i) {
                    return false;
                }
                this.f16239e.m();
                this.f16243i = true;
            }
        }
        return true;
    }

    final boolean a() {
        AbstractC0321j1 abstractC0321j1 = this.f16242h;
        if (abstractC0321j1 == null) {
            if (this.f16243i) {
                return false;
            }
            f();
            i();
            this.f16241g = 0L;
            this.f16239e.n(this.f16238d.getExactSizeIfKnown());
            return e();
        }
        long j2 = this.f16241g + 1;
        this.f16241g = j2;
        boolean z = j2 < abstractC0321j1.count();
        if (z) {
            return z;
        }
        this.f16241g = 0L;
        this.f16242h.clear();
        return e();
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        f();
        int iW = T2.w(this.f16236b.r0()) & T2.a;
        return (iW & 64) != 0 ? (iW & (-16449)) | (this.f16238d.characteristics() & 16448) : iW;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        f();
        return this.f16238d.estimateSize();
    }

    final void f() {
        if (this.f16238d == null) {
            this.f16238d = (Spliterator) this.f16237c.get();
            this.f16237c = null;
        }
    }

    @Override // j$.util.Spliterator
    public Comparator getComparator() {
        if (Spliterator.CC.$default$hasCharacteristics(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        f();
        if (T2.SIZED.n(this.f16236b.r0())) {
            return this.f16238d.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // j$.util.Spliterator
    public /* synthetic */ boolean hasCharacteristics(int i2) {
        return Spliterator.CC.$default$hasCharacteristics(this, i2);
    }

    abstract void i();

    abstract W2 k(Spliterator spliterator);

    public final String toString() {
        return String.format("%s[%s]", getClass().getName(), this.f16238d);
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        if (!this.a || this.f16243i) {
            return null;
        }
        f();
        Spliterator spliteratorTrySplit = this.f16238d.trySplit();
        if (spliteratorTrySplit == null) {
            return null;
        }
        return k(spliteratorTrySplit);
    }
}