package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.C0277e;
import j$.util.function.C0280h;
import j$.util.function.Consumer;
import j$.util.stream.A2;
import j$.util.stream.S2;
import java.util.Objects;

/* loaded from: classes2.dex */
final class b3<P_IN> extends W2<P_IN, Long, S2.d> implements Spliterator.c {
    b3(T1 t1, Spliterator spliterator, boolean z) {
        super(t1, spliterator, z);
    }

    b3(T1 t1, j$.util.function.J j2, boolean z) {
        super(t1, j2, z);
    }

    @Override // j$.util.Spliterator.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void d(final j$.util.function.C c2) {
        if (this.f16242h != null || this.f16243i) {
            while (j(c2)) {
            }
            return;
        }
        Objects.requireNonNull(c2);
        f();
        this.f16236b.t0(new A2.g() { // from class: j$.util.stream.V0
            @Override // j$.util.stream.A2
            public /* synthetic */ void accept(double d2) {
                j$.time.a.c(this);
                throw null;
            }

            @Override // j$.util.stream.A2, j$.util.function.w
            public /* synthetic */ void accept(int i2) {
                j$.time.a.a(this);
                throw null;
            }

            @Override // j$.util.stream.A2.g, j$.util.stream.A2
            public final void accept(long j2) {
                c2.accept(j2);
            }

            @Override // j$.util.function.Consumer
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public /* synthetic */ void accept(Long l2) {
                Q1.c(this, l2);
            }

            @Override // j$.util.function.Consumer
            public Consumer e(Consumer consumer) {
                Objects.requireNonNull(consumer);
                return new C0277e(this, consumer);
            }

            @Override // j$.util.function.C
            public j$.util.function.C f(j$.util.function.C c3) {
                Objects.requireNonNull(c3);
                return new C0280h(this, c3);
            }

            @Override // j$.util.stream.A2
            public void m() {
            }

            @Override // j$.util.stream.A2
            public void n(long j2) {
            }

            @Override // j$.util.stream.A2
            public /* synthetic */ boolean o() {
                return false;
            }
        }, this.f16238d);
        this.f16243i = true;
    }

    @Override // j$.util.Spliterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.s.c(this, consumer);
    }

    @Override // j$.util.Spliterator.d
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean j(j$.util.function.C c2) {
        Objects.requireNonNull(c2);
        boolean zA = a();
        if (zA) {
            S2.d dVar = (S2.d) this.f16242h;
            long j2 = this.f16241g;
            int iW = dVar.w(j2);
            c2.accept((dVar.f16311c == 0 && iW == 0) ? ((long[]) dVar.f16209e)[(int) j2] : ((long[][]) dVar.f16210f)[iW][(int) (j2 - dVar.f16312d[iW])]);
        }
        return zA;
    }

    @Override // j$.util.stream.W2
    void i() {
        final S2.d dVar = new S2.d();
        this.f16242h = dVar;
        this.f16239e = this.f16236b.u0(new A2.g() { // from class: j$.util.stream.p0
            @Override // j$.util.stream.A2
            public /* synthetic */ void accept(double d2) {
                j$.time.a.c(this);
                throw null;
            }

            @Override // j$.util.stream.A2, j$.util.function.w
            public /* synthetic */ void accept(int i2) {
                j$.time.a.a(this);
                throw null;
            }

            @Override // j$.util.stream.A2.g, j$.util.stream.A2
            public final void accept(long j2) {
                dVar.accept(j2);
            }

            @Override // j$.util.function.Consumer
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public /* synthetic */ void accept(Long l2) {
                Q1.c(this, l2);
            }

            @Override // j$.util.function.Consumer
            public Consumer e(Consumer consumer) {
                Objects.requireNonNull(consumer);
                return new C0277e(this, consumer);
            }

            @Override // j$.util.function.C
            public j$.util.function.C f(j$.util.function.C c2) {
                Objects.requireNonNull(c2);
                return new C0280h(this, c2);
            }

            @Override // j$.util.stream.A2
            public void m() {
            }

            @Override // j$.util.stream.A2
            public void n(long j2) {
            }

            @Override // j$.util.stream.A2
            public /* synthetic */ boolean o() {
                return false;
            }
        });
        this.f16240f = new j$.util.function.o() { // from class: j$.util.stream.B0
            @Override // j$.util.function.o
            public final boolean a() {
                b3 b3Var = this.a;
                return b3Var.f16238d.tryAdvance(b3Var.f16239e);
            }
        };
    }

    @Override // j$.util.stream.W2
    W2 k(Spliterator spliterator) {
        return new b3(this.f16236b, spliterator, this.a);
    }

    @Override // j$.util.Spliterator
    public /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.s.g(this, consumer);
    }

    @Override // j$.util.stream.W2, j$.util.Spliterator
    public Spliterator.c trySplit() {
        return (Spliterator.c) super.trySplit();
    }
}