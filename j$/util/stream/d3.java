package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.C0277e;
import j$.util.function.C0278f;
import j$.util.function.C0279g;
import j$.util.function.C0280h;
import j$.util.function.Consumer;
import j$.util.stream.X2;
import java.util.Comparator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
abstract class d3<T, T_SPLITR extends Spliterator<T>> {
    protected final Spliterator a;

    /* renamed from: b, reason: collision with root package name */
    protected final boolean f16275b;

    /* renamed from: c, reason: collision with root package name */
    private final long f16276c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicLong f16277d;

    static final class a extends d<Double, j$.util.function.q, X2.a, Spliterator.a> implements Spliterator.a, j$.util.function.q {

        /* renamed from: e, reason: collision with root package name */
        double f16278e;

        a(Spliterator.a aVar, long j2, long j3) {
            super(aVar, j2, j3);
        }

        a(Spliterator.a aVar, a aVar2) {
            super(aVar, aVar2);
        }

        @Override // j$.util.function.q
        public void accept(double d2) {
            this.f16278e = d2;
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            j$.util.s.a(this, consumer);
        }

        @Override // j$.util.function.q
        public j$.util.function.q k(j$.util.function.q qVar) {
            Objects.requireNonNull(qVar);
            return new C0278f(this, qVar);
        }

        @Override // j$.util.stream.d3
        protected Spliterator q(Spliterator spliterator) {
            return new a((Spliterator.a) spliterator, this);
        }

        @Override // j$.util.stream.d3.d
        protected void s(Object obj) {
            ((j$.util.function.q) obj).accept(this.f16278e);
        }

        @Override // j$.util.stream.d3.d
        protected X2.d t(int i2) {
            return new X2.a(i2);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean tryAdvance(Consumer consumer) {
            return j$.util.s.e(this, consumer);
        }
    }

    static final class b extends d<Integer, j$.util.function.w, X2.b, Spliterator.b> implements Spliterator.b, j$.util.function.w {

        /* renamed from: e, reason: collision with root package name */
        int f16279e;

        b(Spliterator.b bVar, long j2, long j3) {
            super(bVar, j2, j3);
        }

        b(Spliterator.b bVar, b bVar2) {
            super(bVar, bVar2);
        }

        @Override // j$.util.function.w
        public void accept(int i2) {
            this.f16279e = i2;
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            j$.util.s.b(this, consumer);
        }

        @Override // j$.util.function.w
        public j$.util.function.w l(j$.util.function.w wVar) {
            Objects.requireNonNull(wVar);
            return new C0279g(this, wVar);
        }

        @Override // j$.util.stream.d3
        protected Spliterator q(Spliterator spliterator) {
            return new b((Spliterator.b) spliterator, this);
        }

        @Override // j$.util.stream.d3.d
        protected void s(Object obj) {
            ((j$.util.function.w) obj).accept(this.f16279e);
        }

        @Override // j$.util.stream.d3.d
        protected X2.d t(int i2) {
            return new X2.b(i2);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean tryAdvance(Consumer consumer) {
            return j$.util.s.f(this, consumer);
        }
    }

    static final class c extends d<Long, j$.util.function.C, X2.c, Spliterator.c> implements Spliterator.c, j$.util.function.C {

        /* renamed from: e, reason: collision with root package name */
        long f16280e;

        c(Spliterator.c cVar, long j2, long j3) {
            super(cVar, j2, j3);
        }

        c(Spliterator.c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // j$.util.function.C
        public void accept(long j2) {
            this.f16280e = j2;
        }

        @Override // j$.util.function.C
        public j$.util.function.C f(j$.util.function.C c2) {
            Objects.requireNonNull(c2);
            return new C0280h(this, c2);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            j$.util.s.c(this, consumer);
        }

        @Override // j$.util.stream.d3
        protected Spliterator q(Spliterator spliterator) {
            return new c((Spliterator.c) spliterator, this);
        }

        @Override // j$.util.stream.d3.d
        protected void s(Object obj) {
            ((j$.util.function.C) obj).accept(this.f16280e);
        }

        @Override // j$.util.stream.d3.d
        protected X2.d t(int i2) {
            return new X2.c(i2);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean tryAdvance(Consumer consumer) {
            return j$.util.s.g(this, consumer);
        }
    }

    static abstract class d<T, T_CONS, T_BUFF extends X2.d<T_CONS>, T_SPLITR extends Spliterator.d<T, T_CONS, T_SPLITR>> extends d3<T, T_SPLITR> implements Spliterator.d<T, T_CONS, T_SPLITR> {
        d(Spliterator.d dVar, long j2, long j3) {
            super(dVar, j2, j3);
        }

        d(Spliterator.d dVar, d dVar2) {
            super(dVar, dVar2);
        }

        @Override // j$.util.Spliterator.d
        /* renamed from: forEachRemaining, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public void d(Object obj) {
            Objects.requireNonNull(obj);
            X2.d dVarT = null;
            while (true) {
                f fVarR = r();
                if (fVarR == f.NO_MORE) {
                    return;
                }
                if (fVarR != f.MAYBE_MORE) {
                    ((Spliterator.d) this.a).d(obj);
                    return;
                }
                if (dVarT == null) {
                    dVarT = t(128);
                } else {
                    dVarT.f16249b = 0;
                }
                long j2 = 0;
                while (((Spliterator.d) this.a).j(dVarT)) {
                    j2++;
                    if (j2 >= 128) {
                        break;
                    }
                }
                if (j2 == 0) {
                    return;
                } else {
                    dVarT.b(obj, p(j2));
                }
            }
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ Comparator getComparator() {
            return Spliterator.CC.$default$getComparator(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ long getExactSizeIfKnown() {
            return Spliterator.CC.$default$getExactSizeIfKnown(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean hasCharacteristics(int i2) {
            return Spliterator.CC.$default$hasCharacteristics(this, i2);
        }

        protected abstract void s(Object obj);

        protected abstract X2.d t(int i2);

        @Override // j$.util.Spliterator.d
        /* renamed from: tryAdvance, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public boolean j(Object obj) {
            Objects.requireNonNull(obj);
            while (r() != f.NO_MORE && ((Spliterator.d) this.a).j(this)) {
                if (p(1L) == 1) {
                    s(obj);
                    return true;
                }
            }
            return false;
        }
    }

    static final class e<T> extends d3<T, Spliterator<T>> implements Spliterator<T>, Consumer<T> {

        /* renamed from: e, reason: collision with root package name */
        Object f16281e;

        e(Spliterator spliterator, long j2, long j3) {
            super(spliterator, j2, j3);
        }

        e(Spliterator spliterator, e eVar) {
            super(spliterator, eVar);
        }

        @Override // j$.util.function.Consumer
        public final void accept(Object obj) {
            this.f16281e = obj;
        }

        @Override // j$.util.function.Consumer
        public Consumer e(Consumer consumer) {
            Objects.requireNonNull(consumer);
            return new C0277e(this, consumer);
        }

        @Override // j$.util.Spliterator
        public void forEachRemaining(Consumer consumer) {
            Objects.requireNonNull(consumer);
            X2.e eVar = null;
            while (true) {
                f fVarR = r();
                if (fVarR == f.NO_MORE) {
                    return;
                }
                if (fVarR != f.MAYBE_MORE) {
                    this.a.forEachRemaining(consumer);
                    return;
                }
                if (eVar == null) {
                    eVar = new X2.e(128);
                } else {
                    eVar.a = 0;
                }
                long j2 = 0;
                while (this.a.tryAdvance(eVar)) {
                    j2++;
                    if (j2 >= 128) {
                        break;
                    }
                }
                if (j2 == 0) {
                    return;
                }
                long jP = p(j2);
                for (int i2 = 0; i2 < jP; i2++) {
                    consumer.accept(eVar.f16250b[i2]);
                }
            }
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ Comparator getComparator() {
            return Spliterator.CC.$default$getComparator(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ long getExactSizeIfKnown() {
            return Spliterator.CC.$default$getExactSizeIfKnown(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean hasCharacteristics(int i2) {
            return Spliterator.CC.$default$hasCharacteristics(this, i2);
        }

        @Override // j$.util.stream.d3
        protected Spliterator q(Spliterator spliterator) {
            return new e(spliterator, this);
        }

        @Override // j$.util.Spliterator
        public boolean tryAdvance(Consumer consumer) {
            Objects.requireNonNull(consumer);
            while (r() != f.NO_MORE && this.a.tryAdvance(this)) {
                if (p(1L) == 1) {
                    consumer.accept(this.f16281e);
                    this.f16281e = null;
                    return true;
                }
            }
            return false;
        }
    }

    enum f {
        NO_MORE,
        MAYBE_MORE,
        UNLIMITED
    }

    d3(Spliterator spliterator, long j2, long j3) {
        this.a = spliterator;
        this.f16275b = j3 < 0;
        this.f16276c = j3 >= 0 ? j3 : 0L;
        this.f16277d = new AtomicLong(j3 >= 0 ? j2 + j3 : j2);
    }

    d3(Spliterator spliterator, d3 d3Var) {
        this.a = spliterator;
        this.f16275b = d3Var.f16275b;
        this.f16277d = d3Var.f16277d;
        this.f16276c = d3Var.f16276c;
    }

    public final int characteristics() {
        return this.a.characteristics() & (-16465);
    }

    public final long estimateSize() {
        return this.a.estimateSize();
    }

    protected final long p(long j2) {
        long j3;
        long jMin;
        do {
            j3 = this.f16277d.get();
            if (j3 != 0) {
                jMin = Math.min(j3, j2);
                if (jMin <= 0) {
                    break;
                }
            } else {
                if (this.f16275b) {
                    return j2;
                }
                return 0L;
            }
        } while (!this.f16277d.compareAndSet(j3, j3 - jMin));
        if (this.f16275b) {
            return Math.max(j2 - jMin, 0L);
        }
        long j4 = this.f16276c;
        return j3 > j4 ? Math.max(jMin - (j3 - j4), 0L) : jMin;
    }

    protected abstract Spliterator q(Spliterator spliterator);

    protected final f r() {
        return this.f16277d.get() > 0 ? f.MAYBE_MORE : this.f16275b ? f.UNLIMITED : f.NO_MORE;
    }

    public /* bridge */ /* synthetic */ Spliterator.a trySplit() {
        return (Spliterator.a) m9trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Spliterator.b m6trySplit() {
        return (Spliterator.b) m9trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Spliterator.c m7trySplit() {
        return (Spliterator.c) m9trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Spliterator.d m8trySplit() {
        return (Spliterator.d) m9trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public final Spliterator m9trySplit() {
        Spliterator spliteratorTrySplit;
        if (this.f16277d.get() == 0 || (spliteratorTrySplit = this.a.trySplit()) == null) {
            return null;
        }
        return q(spliteratorTrySplit);
    }
}