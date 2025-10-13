package j$.util.stream;

import j$.C$r8$wrapper$java$util$Spliterator$WRP;
import j$.C0387w;
import j$.lang.Iterable;
import j$.util.Spliterator;
import j$.util.function.C0277e;
import j$.util.function.C0278f;
import j$.util.function.C0279g;
import j$.util.function.C0280h;
import j$.util.function.Consumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes2.dex */
class S2<E> extends AbstractC0321j1 implements Consumer<E>, Iterable<E>, Iterable {

    /* renamed from: e, reason: collision with root package name */
    protected Object[] f16199e = new Object[16];

    /* renamed from: f, reason: collision with root package name */
    protected Object[][] f16200f;

    class a implements Spliterator<E> {
        int a;

        /* renamed from: b, reason: collision with root package name */
        final int f16201b;

        /* renamed from: c, reason: collision with root package name */
        int f16202c;

        /* renamed from: d, reason: collision with root package name */
        final int f16203d;

        /* renamed from: e, reason: collision with root package name */
        Object[] f16204e;

        a(int i2, int i3, int i4, int i5) {
            this.a = i2;
            this.f16201b = i3;
            this.f16202c = i4;
            this.f16203d = i5;
            Object[][] objArr = S2.this.f16200f;
            this.f16204e = objArr == null ? S2.this.f16199e : objArr[i2];
        }

        @Override // j$.util.Spliterator
        public int characteristics() {
            return 16464;
        }

        @Override // j$.util.Spliterator
        public long estimateSize() {
            int i2 = this.a;
            int i3 = this.f16201b;
            if (i2 == i3) {
                return this.f16203d - this.f16202c;
            }
            long[] jArr = S2.this.f16312d;
            return ((jArr[i3] + this.f16203d) - jArr[i2]) - this.f16202c;
        }

        @Override // j$.util.Spliterator
        public void forEachRemaining(Consumer consumer) {
            int i2;
            Objects.requireNonNull(consumer);
            int i3 = this.a;
            int i4 = this.f16201b;
            if (i3 < i4 || (i3 == i4 && this.f16202c < this.f16203d)) {
                int i5 = this.f16202c;
                while (true) {
                    i2 = this.f16201b;
                    if (i3 >= i2) {
                        break;
                    }
                    Object[] objArr = S2.this.f16200f[i3];
                    while (i5 < objArr.length) {
                        consumer.accept(objArr[i5]);
                        i5++;
                    }
                    i5 = 0;
                    i3++;
                }
                Object[] objArr2 = this.a == i2 ? this.f16204e : S2.this.f16200f[i2];
                int i6 = this.f16203d;
                while (i5 < i6) {
                    consumer.accept(objArr2[i5]);
                    i5++;
                }
                this.a = this.f16201b;
                this.f16202c = this.f16203d;
            }
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

        @Override // j$.util.Spliterator
        public boolean tryAdvance(Consumer consumer) {
            Objects.requireNonNull(consumer);
            int i2 = this.a;
            int i3 = this.f16201b;
            if (i2 >= i3 && (i2 != i3 || this.f16202c >= this.f16203d)) {
                return false;
            }
            Object[] objArr = this.f16204e;
            int i4 = this.f16202c;
            this.f16202c = i4 + 1;
            consumer.accept(objArr[i4]);
            if (this.f16202c == this.f16204e.length) {
                this.f16202c = 0;
                int i5 = this.a + 1;
                this.a = i5;
                Object[][] objArr2 = S2.this.f16200f;
                if (objArr2 != null && i5 <= this.f16201b) {
                    this.f16204e = objArr2[i5];
                }
            }
            return true;
        }

        @Override // j$.util.Spliterator
        public Spliterator trySplit() {
            int i2 = this.a;
            int i3 = this.f16201b;
            if (i2 < i3) {
                S2 s2 = S2.this;
                int i4 = i3 - 1;
                a aVar = new a(i2, i4, this.f16202c, s2.f16200f[i4].length);
                int i5 = this.f16201b;
                this.a = i5;
                this.f16202c = 0;
                this.f16204e = S2.this.f16200f[i5];
                return aVar;
            }
            if (i2 != i3) {
                return null;
            }
            int i6 = this.f16203d;
            int i7 = this.f16202c;
            int i8 = (i6 - i7) / 2;
            if (i8 == 0) {
                return null;
            }
            Spliterator spliteratorN = j$.util.v.n(this.f16204e, i7, i7 + i8, 1040);
            this.f16202c += i8;
            return spliteratorN;
        }
    }

    static class b extends e<Double, double[], j$.util.function.q> implements j$.util.function.q {

        class a extends e<Double, double[], j$.util.function.q>.a<Spliterator.a> implements Spliterator.a {
            a(int i2, int i3, int i4, int i5) {
                super(i2, i3, i4, i5);
            }

            @Override // j$.util.stream.S2.e.a
            void a(Object obj, int i2, Object obj2) {
                ((j$.util.function.q) obj2).accept(((double[]) obj)[i2]);
            }

            @Override // j$.util.stream.S2.e.a
            Spliterator.d e(Object obj, int i2, int i3) {
                return j$.util.v.j((double[]) obj, i2, i3 + i2, 1040);
            }

            @Override // j$.util.stream.S2.e.a
            Spliterator.d f(int i2, int i3, int i4, int i5) {
                return b.this.new a(i2, i3, i4, i5);
            }

            @Override // j$.util.Spliterator
            public /* synthetic */ void forEachRemaining(Consumer consumer) {
                j$.util.s.a(this, consumer);
            }

            @Override // j$.util.Spliterator
            public /* synthetic */ boolean tryAdvance(Consumer consumer) {
                return j$.util.s.e(this, consumer);
            }
        }

        b() {
        }

        b(int i2) {
            super(i2);
        }

        @Override // j$.util.stream.S2.e, java.lang.Iterable, j$.lang.Iterable
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public Spliterator.a spliterator() {
            return new a(0, this.f16311c, 0, this.f16310b);
        }

        public void accept(double d2) {
            A();
            double[] dArr = (double[]) this.f16209e;
            int i2 = this.f16310b;
            this.f16310b = i2 + 1;
            dArr[i2] = d2;
        }

        @Override // j$.util.stream.S2.e
        public Object c(int i2) {
            return new double[i2];
        }

        @Override // j$.lang.Iterable
        public void forEach(Consumer consumer) {
            if (consumer instanceof j$.util.function.q) {
                h((j$.util.function.q) consumer);
            } else {
                if (i3.a) {
                    i3.a(getClass(), "{0} calling SpinedBuffer.OfDouble.forEach(Consumer)");
                    throw null;
                }
                spliterator().forEachRemaining(consumer);
            }
        }

        @Override // java.lang.Iterable, j$.lang.Iterable
        public Iterator iterator() {
            return j$.util.v.f(spliterator());
        }

        @Override // j$.util.function.q
        public j$.util.function.q k(j$.util.function.q qVar) {
            Objects.requireNonNull(qVar);
            return new C0278f(this, qVar);
        }

        @Override // j$.util.stream.S2.e
        protected void t(Object obj, int i2, int i3, Object obj2) {
            double[] dArr = (double[]) obj;
            j$.util.function.q qVar = (j$.util.function.q) obj2;
            while (i2 < i3) {
                qVar.accept(dArr[i2]);
                i2++;
            }
        }

        public String toString() {
            double[] dArr = (double[]) g();
            return dArr.length < 200 ? String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f16311c), Arrays.toString(dArr)) : String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f16311c), Arrays.toString(Arrays.copyOf(dArr, 200)));
        }

        @Override // j$.util.stream.S2.e
        protected int u(Object obj) {
            return ((double[]) obj).length;
        }

        @Override // j$.util.stream.S2.e
        protected Object[] z(int i2) {
            return new double[i2][];
        }
    }

    static class c extends e<Integer, int[], j$.util.function.w> implements j$.util.function.w {

        class a extends e<Integer, int[], j$.util.function.w>.a<Spliterator.b> implements Spliterator.b {
            a(int i2, int i3, int i4, int i5) {
                super(i2, i3, i4, i5);
            }

            @Override // j$.util.stream.S2.e.a
            void a(Object obj, int i2, Object obj2) {
                ((j$.util.function.w) obj2).accept(((int[]) obj)[i2]);
            }

            @Override // j$.util.stream.S2.e.a
            Spliterator.d e(Object obj, int i2, int i3) {
                return j$.util.v.k((int[]) obj, i2, i3 + i2, 1040);
            }

            @Override // j$.util.stream.S2.e.a
            Spliterator.d f(int i2, int i3, int i4, int i5) {
                return c.this.new a(i2, i3, i4, i5);
            }

            @Override // j$.util.Spliterator
            public /* synthetic */ void forEachRemaining(Consumer consumer) {
                j$.util.s.b(this, consumer);
            }

            @Override // j$.util.Spliterator
            public /* synthetic */ boolean tryAdvance(Consumer consumer) {
                return j$.util.s.f(this, consumer);
            }
        }

        c() {
        }

        c(int i2) {
            super(i2);
        }

        @Override // j$.util.stream.S2.e, java.lang.Iterable, j$.lang.Iterable
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public Spliterator.b spliterator() {
            return new a(0, this.f16311c, 0, this.f16310b);
        }

        public void accept(int i2) {
            A();
            int[] iArr = (int[]) this.f16209e;
            int i3 = this.f16310b;
            this.f16310b = i3 + 1;
            iArr[i3] = i2;
        }

        @Override // j$.util.stream.S2.e
        public Object c(int i2) {
            return new int[i2];
        }

        @Override // j$.lang.Iterable
        public void forEach(Consumer consumer) {
            if (consumer instanceof j$.util.function.w) {
                h((j$.util.function.w) consumer);
            } else {
                if (i3.a) {
                    i3.a(getClass(), "{0} calling SpinedBuffer.OfInt.forEach(Consumer)");
                    throw null;
                }
                spliterator().forEachRemaining(consumer);
            }
        }

        @Override // java.lang.Iterable, j$.lang.Iterable
        public Iterator iterator() {
            return j$.util.v.g(spliterator());
        }

        @Override // j$.util.function.w
        public j$.util.function.w l(j$.util.function.w wVar) {
            Objects.requireNonNull(wVar);
            return new C0279g(this, wVar);
        }

        @Override // j$.util.stream.S2.e
        protected void t(Object obj, int i2, int i3, Object obj2) {
            int[] iArr = (int[]) obj;
            j$.util.function.w wVar = (j$.util.function.w) obj2;
            while (i2 < i3) {
                wVar.accept(iArr[i2]);
                i2++;
            }
        }

        public String toString() {
            int[] iArr = (int[]) g();
            return iArr.length < 200 ? String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f16311c), Arrays.toString(iArr)) : String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f16311c), Arrays.toString(Arrays.copyOf(iArr, 200)));
        }

        @Override // j$.util.stream.S2.e
        protected int u(Object obj) {
            return ((int[]) obj).length;
        }

        @Override // j$.util.stream.S2.e
        protected Object[] z(int i2) {
            return new int[i2][];
        }
    }

    static class d extends e<Long, long[], j$.util.function.C> implements j$.util.function.C {

        class a extends e<Long, long[], j$.util.function.C>.a<Spliterator.c> implements Spliterator.c {
            a(int i2, int i3, int i4, int i5) {
                super(i2, i3, i4, i5);
            }

            @Override // j$.util.stream.S2.e.a
            void a(Object obj, int i2, Object obj2) {
                ((j$.util.function.C) obj2).accept(((long[]) obj)[i2]);
            }

            @Override // j$.util.stream.S2.e.a
            Spliterator.d e(Object obj, int i2, int i3) {
                return j$.util.v.l((long[]) obj, i2, i3 + i2, 1040);
            }

            @Override // j$.util.stream.S2.e.a
            Spliterator.d f(int i2, int i3, int i4, int i5) {
                return d.this.new a(i2, i3, i4, i5);
            }

            @Override // j$.util.Spliterator
            public /* synthetic */ void forEachRemaining(Consumer consumer) {
                j$.util.s.c(this, consumer);
            }

            @Override // j$.util.Spliterator
            public /* synthetic */ boolean tryAdvance(Consumer consumer) {
                return j$.util.s.g(this, consumer);
            }
        }

        d() {
        }

        d(int i2) {
            super(i2);
        }

        @Override // j$.util.stream.S2.e, java.lang.Iterable, j$.lang.Iterable
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public Spliterator.c spliterator() {
            return new a(0, this.f16311c, 0, this.f16310b);
        }

        public void accept(long j2) {
            A();
            long[] jArr = (long[]) this.f16209e;
            int i2 = this.f16310b;
            this.f16310b = i2 + 1;
            jArr[i2] = j2;
        }

        @Override // j$.util.stream.S2.e
        public Object c(int i2) {
            return new long[i2];
        }

        @Override // j$.util.function.C
        public j$.util.function.C f(j$.util.function.C c2) {
            Objects.requireNonNull(c2);
            return new C0280h(this, c2);
        }

        @Override // j$.lang.Iterable
        public void forEach(Consumer consumer) {
            if (consumer instanceof j$.util.function.C) {
                h((j$.util.function.C) consumer);
            } else {
                if (i3.a) {
                    i3.a(getClass(), "{0} calling SpinedBuffer.OfLong.forEach(Consumer)");
                    throw null;
                }
                spliterator().forEachRemaining(consumer);
            }
        }

        @Override // java.lang.Iterable, j$.lang.Iterable
        public Iterator iterator() {
            return j$.util.v.h(spliterator());
        }

        @Override // j$.util.stream.S2.e
        protected void t(Object obj, int i2, int i3, Object obj2) {
            long[] jArr = (long[]) obj;
            j$.util.function.C c2 = (j$.util.function.C) obj2;
            while (i2 < i3) {
                c2.accept(jArr[i2]);
                i2++;
            }
        }

        public String toString() {
            long[] jArr = (long[]) g();
            return jArr.length < 200 ? String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f16311c), Arrays.toString(jArr)) : String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f16311c), Arrays.toString(Arrays.copyOf(jArr, 200)));
        }

        @Override // j$.util.stream.S2.e
        protected int u(Object obj) {
            return ((long[]) obj).length;
        }

        @Override // j$.util.stream.S2.e
        protected Object[] z(int i2) {
            return new long[i2][];
        }
    }

    static abstract class e<E, T_ARR, T_CONS> extends AbstractC0321j1 implements Iterable<E>, Iterable {

        /* renamed from: e, reason: collision with root package name */
        Object f16209e;

        /* renamed from: f, reason: collision with root package name */
        Object[] f16210f;

        abstract class a<T_SPLITR extends Spliterator.d<E, T_CONS, T_SPLITR>> implements Spliterator.d<E, T_CONS, T_SPLITR> {
            int a;

            /* renamed from: b, reason: collision with root package name */
            final int f16211b;

            /* renamed from: c, reason: collision with root package name */
            int f16212c;

            /* renamed from: d, reason: collision with root package name */
            final int f16213d;

            /* renamed from: e, reason: collision with root package name */
            Object f16214e;

            a(int i2, int i3, int i4, int i5) {
                this.a = i2;
                this.f16211b = i3;
                this.f16212c = i4;
                this.f16213d = i5;
                Object[] objArr = e.this.f16210f;
                this.f16214e = objArr == null ? e.this.f16209e : objArr[i2];
            }

            abstract void a(Object obj, int i2, Object obj2);

            @Override // j$.util.Spliterator
            public int characteristics() {
                return 16464;
            }

            abstract Spliterator.d e(Object obj, int i2, int i3);

            @Override // j$.util.Spliterator
            public long estimateSize() {
                int i2 = this.a;
                int i3 = this.f16211b;
                if (i2 == i3) {
                    return this.f16213d - this.f16212c;
                }
                long[] jArr = e.this.f16312d;
                return ((jArr[i3] + this.f16213d) - jArr[i2]) - this.f16212c;
            }

            abstract Spliterator.d f(int i2, int i3, int i4, int i5);

            @Override // j$.util.Spliterator.d
            /* renamed from: forEachRemaining, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public void d(Object obj) {
                int i2;
                Objects.requireNonNull(obj);
                int i3 = this.a;
                int i4 = this.f16211b;
                if (i3 < i4 || (i3 == i4 && this.f16212c < this.f16213d)) {
                    int i5 = this.f16212c;
                    while (true) {
                        i2 = this.f16211b;
                        if (i3 >= i2) {
                            break;
                        }
                        e eVar = e.this;
                        Object obj2 = eVar.f16210f[i3];
                        eVar.t(obj2, i5, eVar.u(obj2), obj);
                        i5 = 0;
                        i3++;
                    }
                    e.this.t(this.a == i2 ? this.f16214e : e.this.f16210f[i2], i5, this.f16213d, obj);
                    this.a = this.f16211b;
                    this.f16212c = this.f16213d;
                }
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
            /* renamed from: tryAdvance, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public boolean j(Object obj) {
                Objects.requireNonNull(obj);
                int i2 = this.a;
                int i3 = this.f16211b;
                if (i2 >= i3 && (i2 != i3 || this.f16212c >= this.f16213d)) {
                    return false;
                }
                Object obj2 = this.f16214e;
                int i4 = this.f16212c;
                this.f16212c = i4 + 1;
                a(obj2, i4, obj);
                if (this.f16212c == e.this.u(this.f16214e)) {
                    this.f16212c = 0;
                    int i5 = this.a + 1;
                    this.a = i5;
                    Object[] objArr = e.this.f16210f;
                    if (objArr != null && i5 <= this.f16211b) {
                        this.f16214e = objArr[i5];
                    }
                }
                return true;
            }

            @Override // j$.util.Spliterator.d, j$.util.Spliterator
            public /* bridge */ /* synthetic */ Spliterator.a trySplit() {
                return (Spliterator.a) trySplit();
            }

            @Override // j$.util.Spliterator.d, j$.util.Spliterator
            public /* bridge */ /* synthetic */ Spliterator.b trySplit() {
                return (Spliterator.b) trySplit();
            }

            @Override // j$.util.Spliterator.d, j$.util.Spliterator
            public /* bridge */ /* synthetic */ Spliterator.c trySplit() {
                return (Spliterator.c) trySplit();
            }

            @Override // j$.util.Spliterator
            public Spliterator.d trySplit() {
                int i2 = this.a;
                int i3 = this.f16211b;
                if (i2 < i3) {
                    int i4 = this.f16212c;
                    e eVar = e.this;
                    Spliterator.d dVarF = f(i2, i3 - 1, i4, eVar.u(eVar.f16210f[i3 - 1]));
                    int i5 = this.f16211b;
                    this.a = i5;
                    this.f16212c = 0;
                    this.f16214e = e.this.f16210f[i5];
                    return dVarF;
                }
                if (i2 != i3) {
                    return null;
                }
                int i6 = this.f16213d;
                int i7 = this.f16212c;
                int i8 = (i6 - i7) / 2;
                if (i8 == 0) {
                    return null;
                }
                Spliterator.d dVarE = e(this.f16214e, i7, i8);
                this.f16212c += i8;
                return dVarE;
            }
        }

        e() {
            this.f16209e = c(16);
        }

        e(int i2) {
            super(i2);
            this.f16209e = c(1 << this.a);
        }

        private void y() {
            if (this.f16210f == null) {
                Object[] objArrZ = z(8);
                this.f16210f = objArrZ;
                this.f16312d = new long[8];
                objArrZ[0] = this.f16209e;
            }
        }

        protected void A() {
            if (this.f16310b == u(this.f16209e)) {
                y();
                int i2 = this.f16311c;
                int i3 = i2 + 1;
                Object[] objArr = this.f16210f;
                if (i3 >= objArr.length || objArr[i2 + 1] == null) {
                    x(v() + 1);
                }
                this.f16310b = 0;
                int i4 = this.f16311c + 1;
                this.f16311c = i4;
                this.f16209e = this.f16210f[i4];
            }
        }

        public abstract Object c(int i2);

        @Override // j$.util.stream.AbstractC0321j1
        public void clear() {
            Object[] objArr = this.f16210f;
            if (objArr != null) {
                this.f16209e = objArr[0];
                this.f16210f = null;
                this.f16312d = null;
            }
            this.f16310b = 0;
            this.f16311c = 0;
        }

        public void d(Object obj, int i2) {
            long j2 = i2;
            long jCount = count() + j2;
            if (jCount > u(obj) || jCount < j2) {
                throw new IndexOutOfBoundsException("does not fit");
            }
            if (this.f16311c == 0) {
                System.arraycopy(this.f16209e, 0, obj, i2, this.f16310b);
                return;
            }
            for (int i3 = 0; i3 < this.f16311c; i3++) {
                Object[] objArr = this.f16210f;
                System.arraycopy(objArr[i3], 0, obj, i2, u(objArr[i3]));
                i2 += u(this.f16210f[i3]);
            }
            int i4 = this.f16310b;
            if (i4 > 0) {
                System.arraycopy(this.f16209e, 0, obj, i2, i4);
            }
        }

        public Object g() {
            long jCount = count();
            if (jCount >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            Object objC = c((int) jCount);
            d(objC, 0);
            return objC;
        }

        public void h(Object obj) {
            for (int i2 = 0; i2 < this.f16311c; i2++) {
                Object[] objArr = this.f16210f;
                t(objArr[i2], 0, u(objArr[i2]), obj);
            }
            t(this.f16209e, 0, this.f16310b, obj);
        }

        public abstract Spliterator spliterator();

        @Override // java.lang.Iterable
        public /* synthetic */ java.util.Spliterator spliterator() {
            return C$r8$wrapper$java$util$Spliterator$WRP.convert(spliterator());
        }

        protected abstract void t(Object obj, int i2, int i3, Object obj2);

        protected abstract int u(Object obj);

        protected long v() {
            int i2 = this.f16311c;
            if (i2 == 0) {
                return u(this.f16209e);
            }
            return u(this.f16210f[i2]) + this.f16312d[i2];
        }

        protected int w(long j2) {
            if (this.f16311c == 0) {
                if (j2 < this.f16310b) {
                    return 0;
                }
                throw new IndexOutOfBoundsException(Long.toString(j2));
            }
            if (j2 >= count()) {
                throw new IndexOutOfBoundsException(Long.toString(j2));
            }
            for (int i2 = 0; i2 <= this.f16311c; i2++) {
                if (j2 < this.f16312d[i2] + u(this.f16210f[i2])) {
                    return i2;
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j2));
        }

        protected final void x(long j2) {
            long jV = v();
            if (j2 <= jV) {
                return;
            }
            y();
            int i2 = this.f16311c;
            while (true) {
                i2++;
                if (j2 <= jV) {
                    return;
                }
                Object[] objArr = this.f16210f;
                if (i2 >= objArr.length) {
                    int length = objArr.length * 2;
                    this.f16210f = Arrays.copyOf(objArr, length);
                    this.f16312d = Arrays.copyOf(this.f16312d, length);
                }
                int iS = s(i2);
                this.f16210f[i2] = c(iS);
                long[] jArr = this.f16312d;
                jArr[i2] = jArr[i2 - 1] + u(this.f16210f[r5]);
                jV += iS;
            }
        }

        protected abstract Object[] z(int i2);
    }

    S2() {
    }

    private void v() {
        if (this.f16200f == null) {
            Object[][] objArr = new Object[8][];
            this.f16200f = objArr;
            this.f16312d = new long[8];
            objArr[0] = this.f16199e;
        }
    }

    public void accept(Object obj) {
        if (this.f16310b == this.f16199e.length) {
            v();
            int i2 = this.f16311c;
            int i3 = i2 + 1;
            Object[][] objArr = this.f16200f;
            if (i3 >= objArr.length || objArr[i2 + 1] == null) {
                u(t() + 1);
            }
            this.f16310b = 0;
            int i4 = this.f16311c + 1;
            this.f16311c = i4;
            this.f16199e = this.f16200f[i4];
        }
        Object[] objArr2 = this.f16199e;
        int i5 = this.f16310b;
        this.f16310b = i5 + 1;
        objArr2[i5] = obj;
    }

    @Override // j$.util.stream.AbstractC0321j1
    public void clear() {
        Object[][] objArr = this.f16200f;
        if (objArr != null) {
            this.f16199e = objArr[0];
            int i2 = 0;
            while (true) {
                Object[] objArr2 = this.f16199e;
                if (i2 >= objArr2.length) {
                    break;
                }
                objArr2[i2] = null;
                i2++;
            }
            this.f16200f = null;
            this.f16312d = null;
        } else {
            for (int i3 = 0; i3 < this.f16310b; i3++) {
                this.f16199e[i3] = null;
            }
        }
        this.f16310b = 0;
        this.f16311c = 0;
    }

    @Override // j$.util.function.Consumer
    public Consumer e(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return new C0277e(this, consumer);
    }

    public void forEach(Consumer consumer) {
        for (int i2 = 0; i2 < this.f16311c; i2++) {
            for (Object obj : this.f16200f[i2]) {
                consumer.accept(obj);
            }
        }
        for (int i3 = 0; i3 < this.f16310b; i3++) {
            consumer.accept(this.f16199e[i3]);
        }
    }

    @Override // java.lang.Iterable
    public /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        forEach(C0387w.b(consumer));
    }

    @Override // java.lang.Iterable, j$.lang.Iterable
    public Iterator iterator() {
        return j$.util.v.i(spliterator());
    }

    public void j(Object[] objArr, int i2) {
        long j2 = i2;
        long jCount = count() + j2;
        if (jCount > objArr.length || jCount < j2) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.f16311c == 0) {
            System.arraycopy(this.f16199e, 0, objArr, i2, this.f16310b);
            return;
        }
        for (int i3 = 0; i3 < this.f16311c; i3++) {
            Object[][] objArr2 = this.f16200f;
            System.arraycopy(objArr2[i3], 0, objArr, i2, objArr2[i3].length);
            i2 += this.f16200f[i3].length;
        }
        int i4 = this.f16310b;
        if (i4 > 0) {
            System.arraycopy(this.f16199e, 0, objArr, i2, i4);
        }
    }

    public Spliterator spliterator() {
        return new a(0, this.f16311c, 0, this.f16310b);
    }

    @Override // java.lang.Iterable
    public /* synthetic */ java.util.Spliterator spliterator() {
        return C$r8$wrapper$java$util$Spliterator$WRP.convert(spliterator());
    }

    protected long t() {
        int i2 = this.f16311c;
        if (i2 == 0) {
            return this.f16199e.length;
        }
        return this.f16200f[i2].length + this.f16312d[i2];
    }

    public String toString() {
        final ArrayList arrayList = new ArrayList();
        forEach(new Consumer() { // from class: j$.util.stream.b1
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                arrayList.add(obj);
            }

            @Override // j$.util.function.Consumer
            public Consumer e(Consumer consumer) {
                Objects.requireNonNull(consumer);
                return new C0277e(this, consumer);
            }
        });
        StringBuilder sbA = j$.T0.a.a.a.a.a("SpinedBuffer:");
        sbA.append(arrayList.toString());
        return sbA.toString();
    }

    protected final void u(long j2) {
        long jT = t();
        if (j2 <= jT) {
            return;
        }
        v();
        int i2 = this.f16311c;
        while (true) {
            i2++;
            if (j2 <= jT) {
                return;
            }
            Object[][] objArr = this.f16200f;
            if (i2 >= objArr.length) {
                int length = objArr.length * 2;
                this.f16200f = (Object[][]) Arrays.copyOf(objArr, length);
                this.f16312d = Arrays.copyOf(this.f16312d, length);
            }
            int iS = s(i2);
            this.f16200f[i2] = new Object[iS];
            long[] jArr = this.f16312d;
            jArr[i2] = jArr[i2 - 1] + r4[r6].length;
            jT += iS;
        }
    }
}