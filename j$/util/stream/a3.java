package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.C0277e;
import j$.util.function.C0279g;
import j$.util.function.Consumer;
import j$.util.stream.A2;
import j$.util.stream.S2;
import java.util.Objects;

/* loaded from: classes2.dex */
final class a3<P_IN> extends W2<P_IN, Integer, S2.c> implements Spliterator.b {
    a3(T1 t1, Spliterator spliterator, boolean z) {
        super(t1, spliterator, z);
    }

    a3(T1 t1, j$.util.function.J j2, boolean z) {
        super(t1, j2, z);
    }

    @Override // j$.util.Spliterator.d
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void d(final j$.util.function.w wVar) {
        if (this.f16242h != null || this.f16243i) {
            while (j(wVar)) {
            }
            return;
        }
        Objects.requireNonNull(wVar);
        f();
        this.f16236b.t0(new A2.f() { // from class: j$.util.stream.e
            @Override // j$.util.stream.A2
            public /* synthetic */ void accept(double d2) {
                j$.time.a.c(this);
                throw null;
            }

            @Override // j$.util.stream.A2.f, j$.util.stream.A2, j$.util.function.w
            public final void accept(int i2) {
                wVar.accept(i2);
            }

            @Override // j$.util.stream.A2
            public /* synthetic */ void accept(long j2) {
                j$.time.a.b(this);
                throw null;
            }

            @Override // j$.util.function.Consumer
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public /* synthetic */ void accept(Integer num) {
                Q1.b(this, num);
            }

            @Override // j$.util.function.Consumer
            public Consumer e(Consumer consumer) {
                Objects.requireNonNull(consumer);
                return new C0277e(this, consumer);
            }

            @Override // j$.util.function.w
            public j$.util.function.w l(j$.util.function.w wVar2) {
                Objects.requireNonNull(wVar2);
                return new C0279g(this, wVar2);
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
        j$.util.s.b(this, consumer);
    }

    @Override // j$.util.Spliterator.d
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean j(j$.util.function.w wVar) {
        Objects.requireNonNull(wVar);
        boolean zA = a();
        if (zA) {
            S2.c cVar = (S2.c) this.f16242h;
            long j2 = this.f16241g;
            int iW = cVar.w(j2);
            wVar.accept((cVar.f16311c == 0 && iW == 0) ? ((int[]) cVar.f16209e)[(int) j2] : ((int[][]) cVar.f16210f)[iW][(int) (j2 - cVar.f16312d[iW])]);
        }
        return zA;
    }

    @Override // j$.util.stream.W2
    void i() {
        final S2.c cVar = new S2.c();
        this.f16242h = cVar;
        this.f16239e = this.f16236b.u0(new A2.f() { // from class: j$.util.stream.L0
            @Override // j$.util.stream.A2
            public /* synthetic */ void accept(double d2) {
                j$.time.a.c(this);
                throw null;
            }

            @Override // j$.util.stream.A2.f, j$.util.stream.A2, j$.util.function.w
            public final void accept(int i2) {
                cVar.accept(i2);
            }

            @Override // j$.util.stream.A2
            public /* synthetic */ void accept(long j2) {
                j$.time.a.b(this);
                throw null;
            }

            @Override // j$.util.function.Consumer
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public /* synthetic */ void accept(Integer num) {
                Q1.b(this, num);
            }

            @Override // j$.util.function.Consumer
            public Consumer e(Consumer consumer) {
                Objects.requireNonNull(consumer);
                return new C0277e(this, consumer);
            }

            @Override // j$.util.function.w
            public j$.util.function.w l(j$.util.function.w wVar) {
                Objects.requireNonNull(wVar);
                return new C0279g(this, wVar);
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
        this.f16240f = new j$.util.function.o() { // from class: j$.util.stream.A0
            @Override // j$.util.function.o
            public final boolean a() {
                a3 a3Var = this.a;
                return a3Var.f16238d.tryAdvance(a3Var.f16239e);
            }
        };
    }

    @Override // j$.util.stream.W2
    W2 k(Spliterator spliterator) {
        return new a3(this.f16236b, spliterator, this.a);
    }

    @Override // j$.util.Spliterator
    public /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.s.f(this, consumer);
    }

    @Override // j$.util.stream.W2, j$.util.Spliterator
    public Spliterator.b trySplit() {
        return (Spliterator.b) super.trySplit();
    }
}