package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.stream.A2;

/* loaded from: classes2.dex */
interface R1<T> {

    public interface a<T> extends A2<T> {

        /* renamed from: j$.util.stream.R1$a$a, reason: collision with other inner class name */
        public interface InterfaceC0206a extends a<Double>, A2.e {
            @Override // j$.util.stream.R1.a
            b a();
        }

        public interface b extends a<Integer>, A2.f {
            @Override // j$.util.stream.R1.a
            c a();
        }

        public interface c extends a<Long>, A2.g {
            @Override // j$.util.stream.R1.a
            d a();
        }

        R1 a();
    }

    public interface b extends e<Double, j$.util.function.q, double[], Spliterator.a, b> {
    }

    public interface c extends e<Integer, j$.util.function.w, int[], Spliterator.b, c> {
    }

    public interface d extends e<Long, j$.util.function.C, long[], Spliterator.c, d> {
    }

    public interface e<T, T_CONS, T_ARR, T_SPLITR extends Spliterator.d<T, T_CONS, T_SPLITR>, T_NODE extends e<T, T_CONS, T_ARR, T_SPLITR, T_NODE>> extends R1<T> {
        @Override // j$.util.stream.R1
        e b(int i2);

        Object c(int i2);

        void d(Object obj, int i2);

        Object g();

        void h(Object obj);

        @Override // j$.util.stream.R1
        Spliterator.d spliterator();
    }

    R1 b(int i2);

    long count();

    void forEach(Consumer consumer);

    void j(Object[] objArr, int i2);

    int p();

    Object[] q(j$.util.function.x xVar);

    R1 r(long j2, long j3, j$.util.function.x xVar);

    Spliterator spliterator();
}