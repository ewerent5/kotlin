package j$.util.stream;

import j$.util.function.C0277e;
import j$.util.function.C0278f;
import j$.util.function.C0279g;
import j$.util.function.C0280h;
import j$.util.function.Consumer;
import j$.util.stream.A2;
import java.util.Objects;

/* renamed from: j$.util.stream.u1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC0364u1<T, O> implements h3<T, O> {
    boolean a;

    /* renamed from: b, reason: collision with root package name */
    Object f16365b;

    /* renamed from: j$.util.stream.u1$a */
    static final class a extends AbstractC0364u1<Double, j$.util.p> implements A2.e {
        a() {
        }

        @Override // j$.util.stream.AbstractC0364u1, j$.util.stream.A2
        public void accept(double d2) {
            accept(Double.valueOf(d2));
        }

        @Override // j$.util.function.J
        public Object get() {
            if (this.a) {
                return j$.util.p.d(((Double) this.f16365b).doubleValue());
            }
            return null;
        }

        @Override // j$.util.function.q
        public j$.util.function.q k(j$.util.function.q qVar) {
            Objects.requireNonNull(qVar);
            return new C0278f(this, qVar);
        }
    }

    /* renamed from: j$.util.stream.u1$b */
    static final class b extends AbstractC0364u1<Integer, j$.util.q> implements A2.f {
        b() {
        }

        @Override // j$.util.stream.AbstractC0364u1, j$.util.stream.A2, j$.util.function.w
        public void accept(int i2) {
            accept(Integer.valueOf(i2));
        }

        @Override // j$.util.function.J
        public Object get() {
            if (this.a) {
                return j$.util.q.d(((Integer) this.f16365b).intValue());
            }
            return null;
        }

        @Override // j$.util.function.w
        public j$.util.function.w l(j$.util.function.w wVar) {
            Objects.requireNonNull(wVar);
            return new C0279g(this, wVar);
        }
    }

    /* renamed from: j$.util.stream.u1$c */
    static final class c extends AbstractC0364u1<Long, j$.util.r> implements A2.g {
        c() {
        }

        @Override // j$.util.stream.AbstractC0364u1, j$.util.stream.A2
        public void accept(long j2) {
            accept(Long.valueOf(j2));
        }

        @Override // j$.util.function.C
        public j$.util.function.C f(j$.util.function.C c2) {
            Objects.requireNonNull(c2);
            return new C0280h(this, c2);
        }

        @Override // j$.util.function.J
        public Object get() {
            if (this.a) {
                return j$.util.r.d(((Long) this.f16365b).longValue());
            }
            return null;
        }
    }

    /* renamed from: j$.util.stream.u1$d */
    static final class d<T> extends AbstractC0364u1<T, j$.util.o<T>> {
        d() {
        }

        @Override // j$.util.function.J
        public Object get() {
            if (this.a) {
                return j$.util.o.d(this.f16365b);
            }
            return null;
        }
    }

    AbstractC0364u1() {
    }

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
    public void accept(Object obj) {
        if (this.a) {
            return;
        }
        this.a = true;
        this.f16365b = obj;
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
    public boolean o() {
        return this.a;
    }
}