package j$.util.stream;

import j$.util.function.C0277e;
import j$.util.function.C0278f;
import j$.util.function.C0279g;
import j$.util.function.C0280h;
import j$.util.function.Consumer;
import java.util.Objects;

/* loaded from: classes2.dex */
abstract class X2 {
    int a;

    static final class a extends d<j$.util.function.q> implements j$.util.function.q {

        /* renamed from: c, reason: collision with root package name */
        final double[] f16246c;

        a(int i2) {
            this.f16246c = new double[i2];
        }

        @Override // j$.util.function.q
        public void accept(double d2) {
            double[] dArr = this.f16246c;
            int i2 = this.f16249b;
            this.f16249b = i2 + 1;
            dArr[i2] = d2;
        }

        @Override // j$.util.stream.X2.d
        void b(Object obj, long j2) {
            j$.util.function.q qVar = (j$.util.function.q) obj;
            for (int i2 = 0; i2 < j2; i2++) {
                qVar.accept(this.f16246c[i2]);
            }
        }

        @Override // j$.util.function.q
        public j$.util.function.q k(j$.util.function.q qVar) {
            Objects.requireNonNull(qVar);
            return new C0278f(this, qVar);
        }
    }

    static final class b extends d<j$.util.function.w> implements j$.util.function.w {

        /* renamed from: c, reason: collision with root package name */
        final int[] f16247c;

        b(int i2) {
            this.f16247c = new int[i2];
        }

        @Override // j$.util.function.w
        public void accept(int i2) {
            int[] iArr = this.f16247c;
            int i3 = this.f16249b;
            this.f16249b = i3 + 1;
            iArr[i3] = i2;
        }

        @Override // j$.util.stream.X2.d
        public void b(Object obj, long j2) {
            j$.util.function.w wVar = (j$.util.function.w) obj;
            for (int i2 = 0; i2 < j2; i2++) {
                wVar.accept(this.f16247c[i2]);
            }
        }

        @Override // j$.util.function.w
        public j$.util.function.w l(j$.util.function.w wVar) {
            Objects.requireNonNull(wVar);
            return new C0279g(this, wVar);
        }
    }

    static final class c extends d<j$.util.function.C> implements j$.util.function.C {

        /* renamed from: c, reason: collision with root package name */
        final long[] f16248c;

        c(int i2) {
            this.f16248c = new long[i2];
        }

        @Override // j$.util.function.C
        public void accept(long j2) {
            long[] jArr = this.f16248c;
            int i2 = this.f16249b;
            this.f16249b = i2 + 1;
            jArr[i2] = j2;
        }

        @Override // j$.util.stream.X2.d
        public void b(Object obj, long j2) {
            j$.util.function.C c2 = (j$.util.function.C) obj;
            for (int i2 = 0; i2 < j2; i2++) {
                c2.accept(this.f16248c[i2]);
            }
        }

        @Override // j$.util.function.C
        public j$.util.function.C f(j$.util.function.C c2) {
            Objects.requireNonNull(c2);
            return new C0280h(this, c2);
        }
    }

    static abstract class d<T_CONS> extends X2 {

        /* renamed from: b, reason: collision with root package name */
        int f16249b;

        d() {
        }

        abstract void b(Object obj, long j2);
    }

    static final class e<T> extends X2 implements Consumer<T> {

        /* renamed from: b, reason: collision with root package name */
        final Object[] f16250b;

        e(int i2) {
            this.f16250b = new Object[i2];
        }

        @Override // j$.util.function.Consumer
        public void accept(Object obj) {
            Object[] objArr = this.f16250b;
            int i2 = this.a;
            this.a = i2 + 1;
            objArr[i2] = obj;
        }

        @Override // j$.util.function.Consumer
        public Consumer e(Consumer consumer) {
            Objects.requireNonNull(consumer);
            return new C0277e(this, consumer);
        }
    }

    X2() {
    }
}