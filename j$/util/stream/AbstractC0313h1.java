package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.InterfaceC0329l1;
import j$.util.stream.R1;
import java.util.Objects;

/* renamed from: j$.util.stream.h1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC0313h1<E_IN, E_OUT, S extends InterfaceC0329l1<E_OUT, S>> extends T1<E_OUT> implements InterfaceC0329l1<E_OUT, S> {
    private final AbstractC0313h1 a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC0313h1 f16292b;

    /* renamed from: c, reason: collision with root package name */
    protected final int f16293c;

    /* renamed from: d, reason: collision with root package name */
    private AbstractC0313h1 f16294d;

    /* renamed from: e, reason: collision with root package name */
    private int f16295e;

    /* renamed from: f, reason: collision with root package name */
    private int f16296f;

    /* renamed from: g, reason: collision with root package name */
    private Spliterator f16297g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f16298h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f16299i;

    /* renamed from: j, reason: collision with root package name */
    private Runnable f16300j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f16301k;

    AbstractC0313h1(Spliterator spliterator, int i2, boolean z) {
        this.f16292b = null;
        this.f16297g = spliterator;
        this.a = this;
        int i3 = T2.f16216b & i2;
        this.f16293c = i3;
        this.f16296f = (~(i3 << 1)) & T2.f16221g;
        this.f16295e = 0;
        this.f16301k = z;
    }

    AbstractC0313h1(AbstractC0313h1 abstractC0313h1, int i2) {
        if (abstractC0313h1.f16298h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        abstractC0313h1.f16298h = true;
        abstractC0313h1.f16294d = this;
        this.f16292b = abstractC0313h1;
        this.f16293c = T2.f16217c & i2;
        this.f16296f = T2.h(i2, abstractC0313h1.f16296f);
        AbstractC0313h1 abstractC0313h12 = abstractC0313h1.a;
        this.a = abstractC0313h12;
        if (F0()) {
            abstractC0313h12.f16299i = true;
        }
        this.f16295e = abstractC0313h1.f16295e + 1;
    }

    private Spliterator H0(int i2) {
        int i3;
        int i4;
        AbstractC0313h1<E_IN, E_OUT, S> abstractC0313h1 = this.a;
        Spliterator spliteratorE0 = abstractC0313h1.f16297g;
        if (spliteratorE0 == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        abstractC0313h1.f16297g = null;
        if (abstractC0313h1.f16301k && abstractC0313h1.f16299i) {
            AbstractC0313h1<E_IN, E_OUT, S> abstractC0313h12 = abstractC0313h1.f16294d;
            int i5 = 1;
            while (abstractC0313h1 != this) {
                int i6 = abstractC0313h12.f16293c;
                if (abstractC0313h12.F0()) {
                    i5 = 0;
                    if (T2.SHORT_CIRCUIT.n(i6)) {
                        i6 &= ~T2.p;
                    }
                    spliteratorE0 = abstractC0313h12.E0(abstractC0313h1, spliteratorE0);
                    if (spliteratorE0.hasCharacteristics(64)) {
                        i3 = i6 & (~T2.o);
                        i4 = T2.n;
                    } else {
                        i3 = i6 & (~T2.n);
                        i4 = T2.o;
                    }
                    i6 = i3 | i4;
                }
                abstractC0313h12.f16295e = i5;
                abstractC0313h12.f16296f = T2.h(i6, abstractC0313h1.f16296f);
                i5++;
                AbstractC0313h1<E_IN, E_OUT, S> abstractC0313h13 = abstractC0313h12;
                abstractC0313h12 = abstractC0313h12.f16294d;
                abstractC0313h1 = abstractC0313h13;
            }
        }
        if (i2 != 0) {
            this.f16296f = T2.h(i2, this.f16296f);
        }
        return spliteratorE0;
    }

    abstract U2 A0();

    final boolean B0() {
        return T2.ORDERED.n(this.f16296f);
    }

    public /* synthetic */ Spliterator C0() {
        return H0(0);
    }

    R1 D0(T1 t1, Spliterator spliterator, j$.util.function.x xVar) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    Spliterator E0(T1 t1, Spliterator spliterator) {
        return D0(t1, spliterator, new j$.util.function.x() { // from class: j$.util.stream.j
            @Override // j$.util.function.x
            public final Object apply(int i2) {
                return new Object[i2];
            }
        }).spliterator();
    }

    abstract boolean F0();

    abstract A2 G0(int i2, A2 a2);

    final Spliterator I0() {
        AbstractC0313h1<E_IN, E_OUT, S> abstractC0313h1 = this.a;
        if (this != abstractC0313h1) {
            throw new IllegalStateException();
        }
        if (this.f16298h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f16298h = true;
        Spliterator spliterator = abstractC0313h1.f16297g;
        if (spliterator == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        abstractC0313h1.f16297g = null;
        return spliterator;
    }

    abstract Spliterator J0(T1 t1, j$.util.function.J j2, boolean z);

    @Override // j$.util.stream.InterfaceC0329l1, java.lang.AutoCloseable
    public void close() {
        this.f16298h = true;
        this.f16297g = null;
        AbstractC0313h1 abstractC0313h1 = this.a;
        Runnable runnable = abstractC0313h1.f16300j;
        if (runnable != null) {
            abstractC0313h1.f16300j = null;
            runnable.run();
        }
    }

    @Override // j$.util.stream.InterfaceC0329l1
    public final boolean isParallel() {
        return this.a.f16301k;
    }

    @Override // j$.util.stream.T1
    final void m0(A2 a2, Spliterator spliterator) {
        Objects.requireNonNull(a2);
        if (T2.SHORT_CIRCUIT.n(this.f16296f)) {
            n0(a2, spliterator);
            return;
        }
        a2.n(spliterator.getExactSizeIfKnown());
        spliterator.forEachRemaining(a2);
        a2.m();
    }

    @Override // j$.util.stream.T1
    final void n0(A2 a2, Spliterator spliterator) {
        AbstractC0313h1<E_IN, E_OUT, S> abstractC0313h1 = this;
        while (abstractC0313h1.f16295e > 0) {
            abstractC0313h1 = abstractC0313h1.f16292b;
        }
        a2.n(spliterator.getExactSizeIfKnown());
        abstractC0313h1.z0(spliterator, a2);
        a2.m();
    }

    @Override // j$.util.stream.T1
    final R1 o0(Spliterator spliterator, boolean z, j$.util.function.x xVar) {
        if (this.a.f16301k) {
            return y0(this, spliterator, z, xVar);
        }
        R1.a aVarS0 = s0(p0(spliterator), xVar);
        Objects.requireNonNull(aVarS0);
        m0(u0(aVarS0), spliterator);
        return aVarS0.a();
    }

    @Override // j$.util.stream.InterfaceC0329l1
    public InterfaceC0329l1 onClose(Runnable runnable) {
        AbstractC0313h1 abstractC0313h1 = this.a;
        Runnable runnable2 = abstractC0313h1.f16300j;
        if (runnable2 != null) {
            runnable = new f3(runnable2, runnable);
        }
        abstractC0313h1.f16300j = runnable;
        return this;
    }

    @Override // j$.util.stream.T1
    final long p0(Spliterator spliterator) {
        if (T2.SIZED.n(this.f16296f)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }

    public final InterfaceC0329l1 parallel() {
        this.a.f16301k = true;
        return this;
    }

    @Override // j$.util.stream.T1
    final U2 q0() {
        AbstractC0313h1<E_IN, E_OUT, S> abstractC0313h1 = this;
        while (abstractC0313h1.f16295e > 0) {
            abstractC0313h1 = abstractC0313h1.f16292b;
        }
        return abstractC0313h1.A0();
    }

    @Override // j$.util.stream.T1
    final int r0() {
        return this.f16296f;
    }

    public final InterfaceC0329l1 sequential() {
        this.a.f16301k = false;
        return this;
    }

    public Spliterator spliterator() {
        if (this.f16298h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f16298h = true;
        AbstractC0313h1<E_IN, E_OUT, S> abstractC0313h1 = this.a;
        if (this != abstractC0313h1) {
            return J0(this, new j$.util.function.J() { // from class: j$.util.stream.k
                @Override // j$.util.function.J
                public final Object get() {
                    return this.a.C0();
                }
            }, abstractC0313h1.f16301k);
        }
        Spliterator spliterator = abstractC0313h1.f16297g;
        if (spliterator == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        abstractC0313h1.f16297g = null;
        return spliterator;
    }

    @Override // j$.util.stream.T1
    final A2 t0(A2 a2, Spliterator spliterator) {
        Objects.requireNonNull(a2);
        m0(u0(a2), spliterator);
        return a2;
    }

    @Override // j$.util.stream.T1
    final A2 u0(A2 a2) {
        Objects.requireNonNull(a2);
        for (AbstractC0313h1<E_IN, E_OUT, S> abstractC0313h1 = this; abstractC0313h1.f16295e > 0; abstractC0313h1 = abstractC0313h1.f16292b) {
            a2 = abstractC0313h1.G0(abstractC0313h1.f16292b.f16296f, a2);
        }
        return a2;
    }

    @Override // j$.util.stream.T1
    final Spliterator v0(final Spliterator spliterator) {
        return this.f16295e == 0 ? spliterator : J0(this, new j$.util.function.J() { // from class: j$.util.stream.l
            @Override // j$.util.function.J
            public final Object get() {
                return spliterator;
            }
        }, this.a.f16301k);
    }

    final Object w0(g3 g3Var) {
        if (this.f16298h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f16298h = true;
        return this.a.f16301k ? g3Var.c(this, H0(g3Var.b())) : g3Var.d(this, H0(g3Var.b()));
    }

    final R1 x0(j$.util.function.x xVar) {
        if (this.f16298h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f16298h = true;
        if (!this.a.f16301k || this.f16292b == null || !F0()) {
            return o0(H0(0), true, xVar);
        }
        this.f16295e = 0;
        AbstractC0313h1 abstractC0313h1 = this.f16292b;
        return D0(abstractC0313h1, abstractC0313h1.H0(0), xVar);
    }

    abstract R1 y0(T1 t1, Spliterator spliterator, boolean z, j$.util.function.x xVar);

    abstract void z0(Spliterator spliterator, A2 a2);
}