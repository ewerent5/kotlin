package j$.util;

import j$.util.function.C;
import j$.util.function.Consumer;

/* loaded from: classes2.dex */
public interface t<T, T_CONS> extends java.util.Iterator<T>, Iterator {

    public interface a extends t<Double, j$.util.function.q> {
        void d(j$.util.function.q qVar);

        void forEachRemaining(Consumer consumer);

        @Override // java.util.Iterator, j$.util.Iterator
        Double next();

        double nextDouble();
    }

    public interface b extends t<Integer, j$.util.function.w> {
        void b(j$.util.function.w wVar);

        void forEachRemaining(Consumer consumer);

        @Override // java.util.Iterator, j$.util.Iterator
        Integer next();

        int nextInt();
    }

    public interface c extends t<Long, C> {
        void c(C c2);

        void forEachRemaining(Consumer consumer);

        @Override // java.util.Iterator, j$.util.Iterator
        Long next();

        long nextLong();
    }

    void forEachRemaining(Object obj);
}