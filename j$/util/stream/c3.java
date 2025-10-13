package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.C0277e;
import j$.util.function.C0278f;
import j$.util.function.C0279g;
import j$.util.function.C0280h;
import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Objects;

/* loaded from: classes2.dex */
abstract class c3<T, T_SPLITR extends Spliterator<T>> {
    final long a;

    /* renamed from: b, reason: collision with root package name */
    final long f16267b;

    /* renamed from: c, reason: collision with root package name */
    Spliterator f16268c;

    /* renamed from: d, reason: collision with root package name */
    long f16269d;

    /* renamed from: e, reason: collision with root package name */
    long f16270e;

    static final class a extends d<Double, Spliterator.a, j$.util.function.q> implements Spliterator.a {
        a(Spliterator.a aVar, long j2, long j3) {
            super(aVar, j2, j3);
        }

        a(Spliterator.a aVar, long j2, long j3, long j4, long j5) {
            super(aVar, j2, j3, j4, j5, null);
        }

        @Override // j$.util.stream.c3
        protected Spliterator a(Spliterator spliterator, long j2, long j3, long j4, long j5) {
            return new a((Spliterator.a) spliterator, j2, j3, j4, j5);
        }

        @Override // j$.util.stream.c3.d
        protected /* bridge */ /* synthetic */ Object e() {
            return new j$.util.function.q() { // from class: j$.util.stream.C0
                @Override // j$.util.function.q
                public final void accept(double d2) {
                }

                @Override // j$.util.function.q
                public j$.util.function.q k(j$.util.function.q qVar) {
                    Objects.requireNonNull(qVar);
                    return new C0278f(this, qVar);
                }
            };
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            j$.util.s.a(this, consumer);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean tryAdvance(Consumer consumer) {
            return j$.util.s.e(this, consumer);
        }
    }

    static final class b extends d<Integer, Spliterator.b, j$.util.function.w> implements Spliterator.b {
        b(Spliterator.b bVar, long j2, long j3) {
            super(bVar, j2, j3);
        }

        b(Spliterator.b bVar, long j2, long j3, long j4, long j5) {
            super(bVar, j2, j3, j4, j5, null);
        }

        @Override // j$.util.stream.c3
        protected Spliterator a(Spliterator spliterator, long j2, long j3, long j4, long j5) {
            return new b((Spliterator.b) spliterator, j2, j3, j4, j5);
        }

        @Override // j$.util.stream.c3.d
        protected /* bridge */ /* synthetic */ Object e() {
            return new j$.util.function.w() { // from class: j$.util.stream.D0
                @Override // j$.util.function.w
                public final void accept(int i2) {
                }

                @Override // j$.util.function.w
                public j$.util.function.w l(j$.util.function.w wVar) {
                    Objects.requireNonNull(wVar);
                    return new C0279g(this, wVar);
                }
            };
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            j$.util.s.b(this, consumer);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean tryAdvance(Consumer consumer) {
            return j$.util.s.f(this, consumer);
        }
    }

    static final class c extends d<Long, Spliterator.c, j$.util.function.C> implements Spliterator.c {
        c(Spliterator.c cVar, long j2, long j3) {
            super(cVar, j2, j3);
        }

        c(Spliterator.c cVar, long j2, long j3, long j4, long j5) {
            super(cVar, j2, j3, j4, j5, null);
        }

        @Override // j$.util.stream.c3
        protected Spliterator a(Spliterator spliterator, long j2, long j3, long j4, long j5) {
            return new c((Spliterator.c) spliterator, j2, j3, j4, j5);
        }

        @Override // j$.util.stream.c3.d
        protected /* bridge */ /* synthetic */ Object e() {
            return new j$.util.function.C() { // from class: j$.util.stream.E0
                @Override // j$.util.function.C
                public final void accept(long j2) {
                }

                @Override // j$.util.function.C
                public j$.util.function.C f(j$.util.function.C c2) {
                    Objects.requireNonNull(c2);
                    return new C0280h(this, c2);
                }
            };
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            j$.util.s.c(this, consumer);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean tryAdvance(Consumer consumer) {
            return j$.util.s.g(this, consumer);
        }
    }

    static abstract class d<T, T_SPLITR extends Spliterator.d<T, T_CONS, T_SPLITR>, T_CONS> extends c3<T, T_SPLITR> implements Spliterator.d<T, T_CONS, T_SPLITR> {
        d(Spliterator.d dVar, long j2, long j3) {
            super(dVar, j2, j3, 0L, Math.min(dVar.estimateSize(), j3));
        }

        protected abstract Object e();

        @Override // j$.util.Spliterator.d
        /* renamed from: forEachRemaining, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public void d(Object obj) {
            Objects.requireNonNull(obj);
            long j2 = this.a;
            long j3 = this.f16270e;
            if (j2 >= j3) {
                return;
            }
            long j4 = this.f16269d;
            if (j4 >= j3) {
                return;
            }
            if (j4 >= j2 && ((Spliterator.d) this.f16268c).estimateSize() + j4 <= this.f16267b) {
                ((Spliterator.d) this.f16268c).d(obj);
                this.f16269d = this.f16270e;
                return;
            }
            while (this.a > this.f16269d) {
                ((Spliterator.d) this.f16268c).j(e());
                this.f16269d++;
            }
            while (this.f16269d < this.f16270e) {
                ((Spliterator.d) this.f16268c).j(obj);
                this.f16269d++;
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

        @Override // j$.util.Spliterator.d
        /* renamed from: tryAdvance, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public boolean j(Object obj) {
            long j2;
            Objects.requireNonNull(obj);
            if (this.a >= this.f16270e) {
                return false;
            }
            while (true) {
                long j3 = this.a;
                j2 = this.f16269d;
                if (j3 <= j2) {
                    break;
                }
                ((Spliterator.d) this.f16268c).j(e());
                this.f16269d++;
            }
            if (j2 >= this.f16270e) {
                return false;
            }
            this.f16269d = j2 + 1;
            return ((Spliterator.d) this.f16268c).j(obj);
        }

        d(Spliterator.d dVar, long j2, long j3, long j4, long j5, V2 v2) {
            super(dVar, j2, j3, j4, j5);
        }
    }

    static final class e<T> extends c3<T, Spliterator<T>> implements Spliterator<T> {
        e(Spliterator spliterator, long j2, long j3) {
            super(spliterator, j2, j3, 0L, Math.min(spliterator.estimateSize(), j3));
        }

        private e(Spliterator spliterator, long j2, long j3, long j4, long j5) {
            super(spliterator, j2, j3, j4, j5);
        }

        @Override // j$.util.stream.c3
        protected Spliterator a(Spliterator spliterator, long j2, long j3, long j4, long j5) {
            return new e(spliterator, j2, j3, j4, j5);
        }

        @Override // j$.util.Spliterator
        public void forEachRemaining(Consumer consumer) {
            Objects.requireNonNull(consumer);
            long j2 = this.a;
            long j3 = this.f16270e;
            if (j2 >= j3) {
                return;
            }
            long j4 = this.f16269d;
            if (j4 >= j3) {
                return;
            }
            if (j4 >= j2 && this.f16268c.estimateSize() + j4 <= this.f16267b) {
                this.f16268c.forEachRemaining(consumer);
                this.f16269d = this.f16270e;
                return;
            }
            while (this.a > this.f16269d) {
                this.f16268c.tryAdvance(new Consumer() { // from class: j$.util.stream.G0
                    @Override // j$.util.function.Consumer
                    public final void accept(Object obj) {
                    }

                    @Override // j$.util.function.Consumer
                    public Consumer e(Consumer consumer2) {
                        Objects.requireNonNull(consumer2);
                        return new C0277e(this, consumer2);
                    }
                });
                this.f16269d++;
            }
            while (this.f16269d < this.f16270e) {
                this.f16268c.tryAdvance(consumer);
                this.f16269d++;
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

        @Override // j$.util.Spliterator
        public boolean tryAdvance(Consumer consumer) {
            long j2;
            Objects.requireNonNull(consumer);
            if (this.a >= this.f16270e) {
                return false;
            }
            while (true) {
                long j3 = this.a;
                j2 = this.f16269d;
                if (j3 <= j2) {
                    break;
                }
                this.f16268c.tryAdvance(new Consumer() { // from class: j$.util.stream.F0
                    @Override // j$.util.function.Consumer
                    public final void accept(Object obj) {
                    }

                    @Override // j$.util.function.Consumer
                    public Consumer e(Consumer consumer2) {
                        Objects.requireNonNull(consumer2);
                        return new C0277e(this, consumer2);
                    }
                });
                this.f16269d++;
            }
            if (j2 >= this.f16270e) {
                return false;
            }
            this.f16269d = j2 + 1;
            return this.f16268c.tryAdvance(consumer);
        }
    }

    c3(Spliterator spliterator, long j2, long j3, long j4, long j5) {
        this.f16268c = spliterator;
        this.a = j2;
        this.f16267b = j3;
        this.f16269d = j4;
        this.f16270e = j5;
    }

    protected abstract Spliterator a(Spliterator spliterator, long j2, long j3, long j4, long j5);

    public int characteristics() {
        return this.f16268c.characteristics();
    }

    public long estimateSize() {
        long j2 = this.a;
        long j3 = this.f16270e;
        if (j2 < j3) {
            return j3 - Math.max(j2, this.f16269d);
        }
        return 0L;
    }

    public /* bridge */ /* synthetic */ Spliterator.a trySplit() {
        return (Spliterator.a) m5trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Spliterator.b m2trySplit() {
        return (Spliterator.b) m5trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Spliterator.c m3trySplit() {
        return (Spliterator.c) m5trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Spliterator.d m4trySplit() {
        return (Spliterator.d) m5trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public Spliterator m5trySplit() {
        long j2 = this.a;
        long j3 = this.f16270e;
        if (j2 >= j3 || this.f16269d >= j3) {
            return null;
        }
        while (true) {
            Spliterator spliteratorTrySplit = this.f16268c.trySplit();
            if (spliteratorTrySplit == null) {
                return null;
            }
            long jEstimateSize = spliteratorTrySplit.estimateSize() + this.f16269d;
            long jMin = Math.min(jEstimateSize, this.f16267b);
            long j4 = this.a;
            if (j4 >= jMin) {
                this.f16269d = jMin;
            } else {
                long j5 = this.f16267b;
                if (jMin < j5) {
                    long j6 = this.f16269d;
                    if (j6 < j4 || jEstimateSize > j5) {
                        this.f16269d = jMin;
                        return a(spliteratorTrySplit, j4, j5, j6, jMin);
                    }
                    this.f16269d = jMin;
                    return spliteratorTrySplit;
                }
                this.f16268c = spliteratorTrySplit;
                this.f16270e = jMin;
            }
        }
    }
}