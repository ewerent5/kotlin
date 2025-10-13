package j$.util.stream;

import j$.util.function.C0277e;
import j$.util.function.C0278f;
import j$.util.function.C0279g;
import j$.util.function.C0280h;
import j$.util.function.Consumer;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public interface A2<T> extends Consumer<T> {

    public static abstract class a<E_OUT> implements e {
        protected final A2 a;

        public a(A2 a2) {
            Objects.requireNonNull(a2);
            this.a = a2;
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
            this.a.m();
        }

        @Override // j$.util.stream.A2
        public void n(long j2) {
            this.a.n(j2);
        }

        @Override // j$.util.stream.A2
        public boolean o() {
            return this.a.o();
        }
    }

    public static abstract class b<E_OUT> implements f {
        protected final A2 a;

        public b(A2 a2) {
            Objects.requireNonNull(a2);
            this.a = a2;
        }

        @Override // j$.util.stream.A2
        public /* synthetic */ void accept(double d2) {
            j$.time.a.c(this);
            throw null;
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
            this.a.m();
        }

        @Override // j$.util.stream.A2
        public void n(long j2) {
            this.a.n(j2);
        }

        @Override // j$.util.stream.A2
        public boolean o() {
            return this.a.o();
        }
    }

    public static abstract class c<E_OUT> implements g {
        protected final A2 a;

        public c(A2 a2) {
            Objects.requireNonNull(a2);
            this.a = a2;
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
            this.a.m();
        }

        @Override // j$.util.stream.A2
        public void n(long j2) {
            this.a.n(j2);
        }

        @Override // j$.util.stream.A2
        public boolean o() {
            return this.a.o();
        }
    }

    public static abstract class d<T, E_OUT> implements A2<T> {
        protected final A2 a;

        public d(A2 a2) {
            Objects.requireNonNull(a2);
            this.a = a2;
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
        public Consumer e(Consumer consumer) {
            Objects.requireNonNull(consumer);
            return new C0277e(this, consumer);
        }

        @Override // j$.util.stream.A2
        public void m() {
            this.a.m();
        }

        @Override // j$.util.stream.A2
        public void n(long j2) {
            this.a.n(j2);
        }

        @Override // j$.util.stream.A2
        public boolean o() {
            return this.a.o();
        }
    }

    public interface e extends A2<Double>, j$.util.function.q {
        @Override // j$.util.stream.A2
        void accept(double d2);
    }

    public interface f extends A2<Integer>, j$.util.function.w {
        @Override // j$.util.stream.A2, j$.util.function.w
        void accept(int i2);
    }

    public interface g extends A2<Long>, j$.util.function.C {
        @Override // j$.util.stream.A2
        void accept(long j2);
    }

    void accept(double d2);

    void accept(int i2);

    void accept(long j2);

    void m();

    void n(long j2);

    boolean o();
}