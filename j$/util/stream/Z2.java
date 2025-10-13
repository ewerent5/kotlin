package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.C0277e;
import j$.util.function.C0278f;
import j$.util.function.Consumer;
import j$.util.stream.A2;
import j$.util.stream.S2;
import java.util.Objects;

/* loaded from: classes2.dex */
final class Z2<P_IN> extends W2<P_IN, Double, S2.b> implements Spliterator.a {
    Z2(T1 t1, Spliterator spliterator, boolean z) {
        super(t1, spliterator, z);
    }

    Z2(T1 t1, j$.util.function.J j2, boolean z) {
        super(t1, j2, z);
    }

    @Override // j$.util.Spliterator.d
    public void d(final j$.util.function.q qVar) {
        if (this.f16242h != null || this.f16243i) {
            while (j(qVar)) {
            }
            return;
        }
        Objects.requireNonNull(qVar);
        f();
        this.f16236b.t0(new A2.e() { // from class: j$.util.stream.n0
            @Override // j$.util.stream.A2.e, j$.util.stream.A2
            public final void accept(double d2) {
                qVar.accept(d2);
            }

            @Override // j$.util.stream.A2, j$.util.function.w
            public /* synthetic */ void accept(int i2) {
                j$.time.a.a(this);
                throw null;
            }

            @Override // j$.util.stream.A2
            public /* synthetic */ void accept(long j2) {
                j$.time.a.b(this);
                throw null;
            }

            @Override // j$.util.function.Consumer
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public /* synthetic */ void accept(Double d2) {
                Q1.a(this, d2);
            }

            @Override // j$.util.function.Consumer
            public Consumer e(Consumer consumer) {
                Objects.requireNonNull(consumer);
                return new C0277e(this, consumer);
            }

            @Override // j$.util.function.q
            public j$.util.function.q k(j$.util.function.q qVar2) {
                Objects.requireNonNull(qVar2);
                return new C0278f(this, qVar2);
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
        j$.util.s.a(this, consumer);
    }

    @Override // j$.util.stream.W2
    void i() {
        final S2.b bVar = new S2.b();
        this.f16242h = bVar;
        this.f16239e = this.f16236b.u0(new A2.e() { // from class: j$.util.stream.T0
            @Override // j$.util.stream.A2.e, j$.util.stream.A2
            public final void accept(double d2) {
                bVar.accept(d2);
            }

            @Override // j$.util.stream.A2, j$.util.function.w
            public /* synthetic */ void accept(int i2) {
                j$.time.a.a(this);
                throw null;
            }

            @Override // j$.util.stream.A2
            public /* synthetic */ void accept(long j2) {
                j$.time.a.b(this);
                throw null;
            }

            @Override // j$.util.function.Consumer
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public /* synthetic */ void accept(Double d2) {
                Q1.a(this, d2);
            }

            @Override // j$.util.function.Consumer
            public Consumer e(Consumer consumer) {
                Objects.requireNonNull(consumer);
                return new C0277e(this, consumer);
            }

            @Override // j$.util.function.q
            public j$.util.function.q k(j$.util.function.q qVar) {
                Objects.requireNonNull(qVar);
                return new C0278f(this, qVar);
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
        this.f16240f = new j$.util.function.o() { // from class: j$.util.stream.z0
            @Override // j$.util.function.o
            public final boolean a() {
                Z2 z2 = this.a;
                return z2.f16238d.tryAdvance(z2.f16239e);
            }
        };
    }

    @Override // j$.util.Spliterator.d
    public boolean j(j$.util.function.q qVar) {
        Objects.requireNonNull(qVar);
        boolean zA = a();
        if (zA) {
            S2.b bVar = (S2.b) this.f16242h;
            long j2 = this.f16241g;
            int iW = bVar.w(j2);
            qVar.accept((bVar.f16311c == 0 && iW == 0) ? ((double[]) bVar.f16209e)[(int) j2] : ((double[][]) bVar.f16210f)[iW][(int) (j2 - bVar.f16312d[iW])]);
        }
        return zA;
    }

    @Override // j$.util.stream.W2
    W2 k(Spliterator spliterator) {
        return new Z2(this.f16236b, spliterator, this.a);
    }

    @Override // j$.util.Spliterator
    public /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.s.e(this, consumer);
    }

    @Override // j$.util.stream.W2, j$.util.Spliterator
    public Spliterator.a trySplit() {
        return (Spliterator.a) super.trySplit();
    }
}