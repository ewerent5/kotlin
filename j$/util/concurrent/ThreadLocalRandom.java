package j$.util.concurrent;

import j$.M0;
import j$.O0;
import j$.Q0;
import j$.util.Spliterator;
import j$.util.function.C;
import j$.util.function.Consumer;
import j$.util.function.q;
import j$.util.function.w;
import j$.util.s;
import j$.util.stream.Q1;
import java.io.ObjectStreamField;
import java.security.AccessController;
import java.security.SecureRandom;
import java.util.Comparator;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/* loaded from: classes2.dex */
public class ThreadLocalRandom extends Random {
    private static final AtomicInteger a = new AtomicInteger();

    /* renamed from: b */
    private static final AtomicLong f16055b;

    /* renamed from: c */
    private static final ThreadLocal f16056c;

    /* renamed from: d */
    private static final ThreadLocal f16057d;

    /* renamed from: e */
    long f16058e;

    /* renamed from: f */
    int f16059f;

    /* renamed from: g */
    boolean f16060g = true;

    class a extends ThreadLocal<ThreadLocalRandom> {
        a() {
        }

        @Override // java.lang.ThreadLocal
        protected ThreadLocalRandom initialValue() {
            return new ThreadLocalRandom(null);
        }
    }

    static final class b implements Spliterator.a {
        long a;

        /* renamed from: b */
        final long f16061b;

        /* renamed from: c */
        final double f16062c;

        /* renamed from: d */
        final double f16063d;

        b(long j2, long j3, double d2, double d3) {
            this.a = j2;
            this.f16061b = j3;
            this.f16062c = d2;
            this.f16063d = d3;
        }

        @Override // j$.util.Spliterator
        /* renamed from: a */
        public b trySplit() {
            long j2 = this.a;
            long j3 = (this.f16061b + j2) >>> 1;
            if (j3 <= j2) {
                return null;
            }
            this.a = j3;
            return new b(j2, j3, this.f16062c, this.f16063d);
        }

        @Override // j$.util.Spliterator
        public int characteristics() {
            return 17728;
        }

        @Override // j$.util.Spliterator.d
        public void d(q qVar) {
            qVar.getClass();
            long j2 = this.a;
            long j3 = this.f16061b;
            if (j2 < j3) {
                this.a = j3;
                double d2 = this.f16062c;
                double d3 = this.f16063d;
                ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
                do {
                    qVar.accept(threadLocalRandomCurrent.c(d2, d3));
                    j2++;
                } while (j2 < j3);
            }
        }

        @Override // j$.util.Spliterator
        public long estimateSize() {
            return this.f16061b - this.a;
        }

        @Override // j$.util.Spliterator.a, j$.util.Spliterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            s.a(this, consumer);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ Comparator getComparator() {
            return Spliterator.CC.$default$getComparator(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ long getExactSizeIfKnown() {
            return Spliterator.CC.$default$getExactSizeIfKnown(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean hasCharacteristics(int i2) {
            return Spliterator.CC.$default$hasCharacteristics(this, i2);
        }

        @Override // j$.util.Spliterator.d
        public boolean j(q qVar) {
            qVar.getClass();
            long j2 = this.a;
            if (j2 >= this.f16061b) {
                return false;
            }
            qVar.accept(ThreadLocalRandom.current().c(this.f16062c, this.f16063d));
            this.a = j2 + 1;
            return true;
        }

        @Override // j$.util.Spliterator.a, j$.util.Spliterator
        public /* synthetic */ boolean tryAdvance(Consumer consumer) {
            return s.e(this, consumer);
        }
    }

    static final class c implements Spliterator.b {
        long a;

        /* renamed from: b */
        final long f16064b;

        /* renamed from: c */
        final int f16065c;

        /* renamed from: d */
        final int f16066d;

        c(long j2, long j3, int i2, int i3) {
            this.a = j2;
            this.f16064b = j3;
            this.f16065c = i2;
            this.f16066d = i3;
        }

        @Override // j$.util.Spliterator
        /* renamed from: a */
        public c trySplit() {
            long j2 = this.a;
            long j3 = (this.f16064b + j2) >>> 1;
            if (j3 <= j2) {
                return null;
            }
            this.a = j3;
            return new c(j2, j3, this.f16065c, this.f16066d);
        }

        @Override // j$.util.Spliterator.d
        /* renamed from: b */
        public void d(w wVar) {
            wVar.getClass();
            long j2 = this.a;
            long j3 = this.f16064b;
            if (j2 < j3) {
                this.a = j3;
                int i2 = this.f16065c;
                int i3 = this.f16066d;
                ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
                do {
                    wVar.accept(threadLocalRandomCurrent.d(i2, i3));
                    j2++;
                } while (j2 < j3);
            }
        }

        @Override // j$.util.Spliterator
        public int characteristics() {
            return 17728;
        }

        @Override // j$.util.Spliterator
        public long estimateSize() {
            return this.f16064b - this.a;
        }

        @Override // j$.util.Spliterator.b, j$.util.Spliterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            s.b(this, consumer);
        }

        @Override // j$.util.Spliterator.d
        /* renamed from: g */
        public boolean j(w wVar) {
            wVar.getClass();
            long j2 = this.a;
            if (j2 >= this.f16064b) {
                return false;
            }
            wVar.accept(ThreadLocalRandom.current().d(this.f16065c, this.f16066d));
            this.a = j2 + 1;
            return true;
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ Comparator getComparator() {
            return Spliterator.CC.$default$getComparator(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ long getExactSizeIfKnown() {
            return Spliterator.CC.$default$getExactSizeIfKnown(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean hasCharacteristics(int i2) {
            return Spliterator.CC.$default$hasCharacteristics(this, i2);
        }

        @Override // j$.util.Spliterator.b, j$.util.Spliterator
        public /* synthetic */ boolean tryAdvance(Consumer consumer) {
            return s.f(this, consumer);
        }
    }

    static final class d implements Spliterator.c {
        long a;

        /* renamed from: b */
        final long f16067b;

        /* renamed from: c */
        final long f16068c;

        /* renamed from: d */
        final long f16069d;

        d(long j2, long j3, long j4, long j5) {
            this.a = j2;
            this.f16067b = j3;
            this.f16068c = j4;
            this.f16069d = j5;
        }

        @Override // j$.util.Spliterator
        /* renamed from: a */
        public d trySplit() {
            long j2 = this.a;
            long j3 = (this.f16067b + j2) >>> 1;
            if (j3 <= j2) {
                return null;
            }
            this.a = j3;
            return new d(j2, j3, this.f16068c, this.f16069d);
        }

        @Override // j$.util.Spliterator.d
        /* renamed from: c */
        public void d(C c2) {
            c2.getClass();
            long j2 = this.a;
            long j3 = this.f16067b;
            if (j2 < j3) {
                this.a = j3;
                long j4 = this.f16068c;
                long j5 = this.f16069d;
                ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
                do {
                    c2.accept(threadLocalRandomCurrent.e(j4, j5));
                    j2++;
                } while (j2 < j3);
            }
        }

        @Override // j$.util.Spliterator
        public int characteristics() {
            return 17728;
        }

        @Override // j$.util.Spliterator
        public long estimateSize() {
            return this.f16067b - this.a;
        }

        @Override // j$.util.Spliterator.c, j$.util.Spliterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            s.c(this, consumer);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ Comparator getComparator() {
            return Spliterator.CC.$default$getComparator(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ long getExactSizeIfKnown() {
            return Spliterator.CC.$default$getExactSizeIfKnown(this);
        }

        @Override // j$.util.Spliterator.d
        /* renamed from: h */
        public boolean j(C c2) {
            c2.getClass();
            long j2 = this.a;
            if (j2 >= this.f16067b) {
                return false;
            }
            c2.accept(ThreadLocalRandom.current().e(this.f16068c, this.f16069d));
            this.a = j2 + 1;
            return true;
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean hasCharacteristics(int i2) {
            return Spliterator.CC.$default$hasCharacteristics(this, i2);
        }

        @Override // j$.util.Spliterator.c, j$.util.Spliterator
        public /* synthetic */ boolean tryAdvance(Consumer consumer) {
            return s.g(this, consumer);
        }
    }

    static {
        long jH;
        if (((Boolean) AccessController.doPrivileged(new j$.util.concurrent.d())).booleanValue()) {
            byte[] seed = SecureRandom.getSeed(8);
            jH = seed[0] & 255;
            for (int i2 = 1; i2 < 8; i2++) {
                jH = (jH << 8) | (seed[i2] & 255);
            }
        } else {
            jH = h(System.nanoTime()) ^ h(System.currentTimeMillis());
        }
        f16055b = new AtomicLong(jH);
        f16056c = new ThreadLocal();
        f16057d = new a();
        new ObjectStreamField("rnd", Long.TYPE);
        new ObjectStreamField("initialized", Boolean.TYPE);
    }

    private ThreadLocalRandom() {
    }

    ThreadLocalRandom(j$.util.concurrent.d dVar) {
    }

    static final int a(int i2) {
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >>> 17);
        int i5 = i4 ^ (i4 << 5);
        ((ThreadLocalRandom) f16057d.get()).f16059f = i5;
        return i5;
    }

    static final int b() {
        return ((ThreadLocalRandom) f16057d.get()).f16059f;
    }

    public static ThreadLocalRandom current() {
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f16057d.get();
        if (threadLocalRandom.f16059f == 0) {
            f();
        }
        return threadLocalRandom;
    }

    static final void f() {
        int iAddAndGet = a.addAndGet(-1640531527);
        if (iAddAndGet == 0) {
            iAddAndGet = 1;
        }
        long jH = h(f16055b.getAndAdd(-4942790177534073029L));
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f16057d.get();
        threadLocalRandom.f16058e = jH;
        threadLocalRandom.f16059f = iAddAndGet;
    }

    private static int g(long j2) {
        long j3 = (j2 ^ (j2 >>> 33)) * (-49064778989728563L);
        return (int) (((j3 ^ (j3 >>> 33)) * (-4265267296055464877L)) >>> 32);
    }

    private static long h(long j2) {
        long j3 = (j2 ^ (j2 >>> 33)) * (-49064778989728563L);
        long j4 = (j3 ^ (j3 >>> 33)) * (-4265267296055464877L);
        return j4 ^ (j4 >>> 33);
    }

    final double c(double d2, double d3) {
        double dNextLong = (nextLong() >>> 11) * 1.1102230246251565E-16d;
        if (d2 >= d3) {
            return dNextLong;
        }
        double d4 = ((d3 - d2) * dNextLong) + d2;
        return d4 >= d3 ? Double.longBitsToDouble(Double.doubleToLongBits(d3) - 1) : d4;
    }

    final int d(int i2, int i3) {
        int i4;
        int iG = g(i());
        if (i2 >= i3) {
            return iG;
        }
        int i5 = i3 - i2;
        int i6 = i5 - 1;
        if ((i5 & i6) == 0) {
            i4 = iG & i6;
        } else if (i5 > 0) {
            int iG2 = iG >>> 1;
            while (true) {
                int i7 = iG2 + i6;
                i4 = iG2 % i5;
                if (i7 - i4 >= 0) {
                    break;
                }
                iG2 = g(i()) >>> 1;
            }
        } else {
            while (true) {
                if (iG >= i2 && iG < i3) {
                    return iG;
                }
                iG = g(i());
            }
        }
        return i4 + i2;
    }

    @Override // java.util.Random
    public DoubleStream doubles() {
        return M0.m0(Q1.o(new b(0L, Long.MAX_VALUE, Double.MAX_VALUE, 0.0d), false));
    }

    final long e(long j2, long j3) {
        long jH = h(i());
        if (j2 >= j3) {
            return jH;
        }
        long j4 = j3 - j2;
        long j5 = j4 - 1;
        if ((j4 & j5) == 0) {
            return (jH & j5) + j2;
        }
        if (j4 > 0) {
            while (true) {
                long j6 = jH >>> 1;
                long j7 = j6 + j5;
                long j8 = j6 % j4;
                if (j7 - j8 >= 0) {
                    return j8 + j2;
                }
                jH = h(i());
            }
        } else {
            while (true) {
                if (jH >= j2 && jH < j3) {
                    return jH;
                }
                jH = h(i());
            }
        }
    }

    final long i() {
        long j2 = this.f16058e - 7046029254386353131L;
        this.f16058e = j2;
        return j2;
    }

    @Override // java.util.Random
    public IntStream ints() {
        return O0.m0(Q1.p(new c(0L, Long.MAX_VALUE, Integer.MAX_VALUE, 0), false));
    }

    @Override // java.util.Random
    public LongStream longs() {
        return Q0.m0(Q1.q(new d(0L, Long.MAX_VALUE, Long.MAX_VALUE, 0L), false));
    }

    @Override // java.util.Random
    protected int next(int i2) {
        return (int) (h(i()) >>> (64 - i2));
    }

    @Override // java.util.Random
    public boolean nextBoolean() {
        return g(i()) < 0;
    }

    @Override // java.util.Random
    public double nextDouble() {
        return (h(i()) >>> 11) * 1.1102230246251565E-16d;
    }

    @Override // java.util.Random
    public float nextFloat() {
        return (g(i()) >>> 8) * 5.9604645E-8f;
    }

    @Override // java.util.Random
    public double nextGaussian() {
        ThreadLocal threadLocal = f16056c;
        Double d2 = (Double) threadLocal.get();
        if (d2 != null) {
            threadLocal.set(null);
            return d2.doubleValue();
        }
        while (true) {
            double dNextDouble = (nextDouble() * 2.0d) - 1.0d;
            double dNextDouble2 = (nextDouble() * 2.0d) - 1.0d;
            double d3 = (dNextDouble2 * dNextDouble2) + (dNextDouble * dNextDouble);
            if (d3 < 1.0d && d3 != 0.0d) {
                double dSqrt = StrictMath.sqrt((StrictMath.log(d3) * (-2.0d)) / d3);
                f16056c.set(new Double(dNextDouble2 * dSqrt));
                return dNextDouble * dSqrt;
            }
        }
    }

    @Override // java.util.Random
    public int nextInt() {
        return g(i());
    }

    @Override // java.util.Random
    public int nextInt(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("bound must be positive");
        }
        int iG = g(i());
        int i3 = i2 - 1;
        if ((i2 & i3) == 0) {
            return iG & i3;
        }
        while (true) {
            int i4 = iG >>> 1;
            int i5 = i4 + i3;
            int i6 = i4 % i2;
            if (i5 - i6 >= 0) {
                return i6;
            }
            iG = g(i());
        }
    }

    @Override // java.util.Random
    public long nextLong() {
        return h(i());
    }

    @Override // java.util.Random
    public void setSeed(long j2) {
        if (this.f16060g) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Random
    public DoubleStream doubles(double d2, double d3) {
        if (d2 < d3) {
            return M0.m0(Q1.o(new b(0L, Long.MAX_VALUE, d2, d3), false));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public IntStream ints(int i2, int i3) {
        if (i2 < i3) {
            return O0.m0(Q1.p(new c(0L, Long.MAX_VALUE, i2, i3), false));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public LongStream longs(long j2) {
        if (j2 >= 0) {
            return Q0.m0(Q1.q(new d(0L, j2, Long.MAX_VALUE, 0L), false));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public DoubleStream doubles(long j2) {
        if (j2 >= 0) {
            return M0.m0(Q1.o(new b(0L, j2, Double.MAX_VALUE, 0.0d), false));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public IntStream ints(long j2) {
        if (j2 >= 0) {
            return O0.m0(Q1.p(new c(0L, j2, Integer.MAX_VALUE, 0), false));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public LongStream longs(long j2, long j3) {
        if (j2 < j3) {
            return Q0.m0(Q1.q(new d(0L, Long.MAX_VALUE, j2, j3), false));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public DoubleStream doubles(long j2, double d2, double d3) {
        if (j2 < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        if (d2 < d3) {
            return M0.m0(Q1.o(new b(0L, j2, d2, d3), false));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public IntStream ints(long j2, int i2, int i3) {
        if (j2 < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        if (i2 < i3) {
            return O0.m0(Q1.p(new c(0L, j2, i2, i3), false));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public LongStream longs(long j2, long j3, long j4) {
        if (j2 < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        if (j3 < j4) {
            return Q0.m0(Q1.q(new d(0L, j2, j3, j4), false));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }
}