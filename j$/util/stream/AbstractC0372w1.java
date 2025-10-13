package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.C0277e;
import j$.util.function.C0278f;
import j$.util.function.C0279g;
import j$.util.function.C0280h;
import j$.util.function.Consumer;
import j$.util.stream.A2;
import java.util.Objects;

/* renamed from: j$.util.stream.w1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC0372w1<T> implements g3<T, Void>, h3<T, Void> {
    private final boolean a;

    /* renamed from: j$.util.stream.w1$a */
    static final class a extends AbstractC0372w1<Double> implements A2.e {

        /* renamed from: b, reason: collision with root package name */
        final j$.util.function.q f16367b;

        a(j$.util.function.q qVar, boolean z) {
            super(z);
            this.f16367b = qVar;
        }

        @Override // j$.util.stream.AbstractC0372w1, j$.util.stream.A2
        public void accept(double d2) {
            this.f16367b.accept(d2);
        }

        @Override // j$.util.function.Consumer
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void accept(Double d2) {
            Q1.a(this, d2);
        }

        @Override // j$.util.function.q
        public j$.util.function.q k(j$.util.function.q qVar) {
            Objects.requireNonNull(qVar);
            return new C0278f(this, qVar);
        }
    }

    /* renamed from: j$.util.stream.w1$b */
    static final class b extends AbstractC0372w1<Integer> implements A2.f {

        /* renamed from: b, reason: collision with root package name */
        final j$.util.function.w f16368b;

        b(j$.util.function.w wVar, boolean z) {
            super(z);
            this.f16368b = wVar;
        }

        @Override // j$.util.stream.AbstractC0372w1, j$.util.stream.A2, j$.util.function.w
        public void accept(int i2) {
            this.f16368b.accept(i2);
        }

        @Override // j$.util.function.Consumer
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void accept(Integer num) {
            Q1.b(this, num);
        }

        @Override // j$.util.function.w
        public j$.util.function.w l(j$.util.function.w wVar) {
            Objects.requireNonNull(wVar);
            return new C0279g(this, wVar);
        }
    }

    /* renamed from: j$.util.stream.w1$c */
    static final class c extends AbstractC0372w1<Long> implements A2.g {

        /* renamed from: b, reason: collision with root package name */
        final j$.util.function.C f16369b;

        c(j$.util.function.C c2, boolean z) {
            super(z);
            this.f16369b = c2;
        }

        @Override // j$.util.stream.AbstractC0372w1, j$.util.stream.A2
        public void accept(long j2) {
            this.f16369b.accept(j2);
        }

        @Override // j$.util.function.C
        public j$.util.function.C f(j$.util.function.C c2) {
            Objects.requireNonNull(c2);
            return new C0280h(this, c2);
        }

        @Override // j$.util.function.Consumer
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void accept(Long l2) {
            Q1.c(this, l2);
        }
    }

    /* renamed from: j$.util.stream.w1$d */
    static final class d<T> extends AbstractC0372w1<T> {

        /* renamed from: b, reason: collision with root package name */
        final Consumer f16370b;

        d(Consumer consumer, boolean z) {
            super(z);
            this.f16370b = consumer;
        }

        @Override // j$.util.function.Consumer
        public void accept(Object obj) {
            this.f16370b.accept(obj);
        }
    }

    protected AbstractC0372w1(boolean z) {
        this.a = z;
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

    @Override // j$.util.stream.g3
    public int b() {
        if (this.a) {
            return 0;
        }
        return T2.f16227m;
    }

    @Override // j$.util.stream.g3
    public Object c(T1 t1, Spliterator spliterator) {
        (this.a ? new C0376x1(t1, spliterator, this) : new C0380y1(t1, spliterator, t1.u0(this))).invoke();
        return null;
    }

    @Override // j$.util.stream.g3
    public Object d(T1 t1, Spliterator spliterator) {
        AbstractC0313h1 abstractC0313h1 = (AbstractC0313h1) t1;
        abstractC0313h1.m0(abstractC0313h1.u0(this), spliterator);
        return null;
    }

    @Override // j$.util.function.Consumer
    public Consumer e(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return new C0277e(this, consumer);
    }

    @Override // j$.util.function.J
    public /* bridge */ /* synthetic */ Object get() {
        return null;
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
}