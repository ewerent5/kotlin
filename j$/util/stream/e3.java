package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.C0277e;
import j$.util.function.Consumer;
import java.util.Objects;

/* loaded from: classes2.dex */
final class e3<P_IN, P_OUT> extends W2<P_IN, P_OUT, S2<P_OUT>> {
    e3(T1 t1, Spliterator spliterator, boolean z) {
        super(t1, spliterator, z);
    }

    e3(T1 t1, j$.util.function.J j2, boolean z) {
        super(t1, j2, z);
    }

    @Override // j$.util.Spliterator
    public void forEachRemaining(final Consumer consumer) {
        if (this.f16242h != null || this.f16243i) {
            while (tryAdvance(consumer)) {
            }
            return;
        }
        Objects.requireNonNull(consumer);
        f();
        this.f16236b.t0(new A2() { // from class: j$.util.stream.N0
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

            @Override // j$.util.stream.A2
            public /* synthetic */ void accept(long j2) {
                j$.time.a.b(this);
                throw null;
            }

            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                consumer.accept(obj);
            }

            @Override // j$.util.function.Consumer
            public Consumer e(Consumer consumer2) {
                Objects.requireNonNull(consumer2);
                return new C0277e(this, consumer2);
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

    @Override // j$.util.stream.W2
    void i() {
        final S2 s2 = new S2();
        this.f16242h = s2;
        this.f16239e = this.f16236b.u0(new A2() { // from class: j$.util.stream.g
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

            @Override // j$.util.stream.A2
            public /* synthetic */ void accept(long j2) {
                j$.time.a.b(this);
                throw null;
            }

            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                s2.accept(obj);
            }

            @Override // j$.util.function.Consumer
            public Consumer e(Consumer consumer) {
                Objects.requireNonNull(consumer);
                return new C0277e(this, consumer);
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
        this.f16240f = new j$.util.function.o() { // from class: j$.util.stream.H0
            @Override // j$.util.function.o
            public final boolean a() {
                e3 e3Var = this.a;
                return e3Var.f16238d.tryAdvance(e3Var.f16239e);
            }
        };
    }

    @Override // j$.util.stream.W2
    W2 k(Spliterator spliterator) {
        return new e3(this.f16236b, spliterator, this.a);
    }

    @Override // j$.util.Spliterator
    public boolean tryAdvance(Consumer consumer) {
        Object obj;
        Objects.requireNonNull(consumer);
        boolean zA = a();
        if (zA) {
            S2 s2 = (S2) this.f16242h;
            long j2 = this.f16241g;
            if (s2.f16311c != 0) {
                if (j2 >= s2.count()) {
                    throw new IndexOutOfBoundsException(Long.toString(j2));
                }
                for (int i2 = 0; i2 <= s2.f16311c; i2++) {
                    long[] jArr = s2.f16312d;
                    long j3 = jArr[i2];
                    Object[][] objArr = s2.f16200f;
                    if (j2 < j3 + objArr[i2].length) {
                        obj = objArr[i2][(int) (j2 - jArr[i2])];
                    }
                }
                throw new IndexOutOfBoundsException(Long.toString(j2));
            }
            if (j2 >= s2.f16310b) {
                throw new IndexOutOfBoundsException(Long.toString(j2));
            }
            obj = s2.f16199e[(int) j2];
            consumer.accept(obj);
        }
        return zA;
    }
}