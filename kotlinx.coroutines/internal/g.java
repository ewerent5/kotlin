package kotlinx.coroutines.internal;

import i.m;
import j$.util.Comparator;
import j$.util.function.Function;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: ExceptionsConstuctor.kt */
/* loaded from: classes3.dex */
public final class g {
    private static final int a = d(Throwable.class, -1);

    /* renamed from: b, reason: collision with root package name */
    private static final ReentrantReadWriteLock f16971b = new ReentrantReadWriteLock();

    /* renamed from: c, reason: collision with root package name */
    private static final WeakHashMap<Class<? extends Throwable>, i.y.c.l<Throwable, Throwable>> f16972c = new WeakHashMap<>();

    /* compiled from: ExceptionsConstuctor.kt */
    public static final class a extends i.y.d.m implements i.y.c.l<Throwable, Throwable> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Constructor f16973e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Constructor constructor) {
            super(1);
            this.f16973e = constructor;
        }

        @Override // i.y.c.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(Throwable th) {
            Object objA;
            Object objNewInstance;
            try {
                m.a aVar = i.m.f15825e;
                objNewInstance = this.f16973e.newInstance(th.getMessage(), th);
            } catch (Throwable th2) {
                m.a aVar2 = i.m.f15825e;
                objA = i.m.a(i.n.a(th2));
            }
            if (objNewInstance == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            }
            objA = i.m.a((Throwable) objNewInstance);
            if (i.m.c(objA)) {
                objA = null;
            }
            return (Throwable) objA;
        }
    }

    /* compiled from: ExceptionsConstuctor.kt */
    public static final class b extends i.y.d.m implements i.y.c.l<Throwable, Throwable> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Constructor f16974e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Constructor constructor) {
            super(1);
            this.f16974e = constructor;
        }

        @Override // i.y.c.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(Throwable th) {
            Object objA;
            Object objNewInstance;
            try {
                m.a aVar = i.m.f15825e;
                objNewInstance = this.f16974e.newInstance(th);
            } catch (Throwable th2) {
                m.a aVar2 = i.m.f15825e;
                objA = i.m.a(i.n.a(th2));
            }
            if (objNewInstance == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            }
            objA = i.m.a((Throwable) objNewInstance);
            if (i.m.c(objA)) {
                objA = null;
            }
            return (Throwable) objA;
        }
    }

    /* compiled from: ExceptionsConstuctor.kt */
    public static final class c extends i.y.d.m implements i.y.c.l<Throwable, Throwable> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Constructor f16975e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Constructor constructor) {
            super(1);
            this.f16975e = constructor;
        }

        @Override // i.y.c.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(Throwable th) {
            Object objA;
            Object objNewInstance;
            try {
                m.a aVar = i.m.f15825e;
                objNewInstance = this.f16975e.newInstance(th.getMessage());
            } catch (Throwable th2) {
                m.a aVar2 = i.m.f15825e;
                objA = i.m.a(i.n.a(th2));
            }
            if (objNewInstance == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            }
            Throwable th3 = (Throwable) objNewInstance;
            th3.initCause(th);
            objA = i.m.a(th3);
            if (i.m.c(objA)) {
                objA = null;
            }
            return (Throwable) objA;
        }
    }

    /* compiled from: ExceptionsConstuctor.kt */
    public static final class d extends i.y.d.m implements i.y.c.l<Throwable, Throwable> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Constructor f16976e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Constructor constructor) {
            super(1);
            this.f16976e = constructor;
        }

        @Override // i.y.c.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(Throwable th) {
            Object objA;
            Object objNewInstance;
            try {
                m.a aVar = i.m.f15825e;
                objNewInstance = this.f16976e.newInstance(new Object[0]);
            } catch (Throwable th2) {
                m.a aVar2 = i.m.f15825e;
                objA = i.m.a(i.n.a(th2));
            }
            if (objNewInstance == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            }
            Throwable th3 = (Throwable) objNewInstance;
            th3.initCause(th);
            objA = i.m.a(th3);
            if (i.m.c(objA)) {
                objA = null;
            }
            return (Throwable) objA;
        }
    }

    /* compiled from: Comparisons.kt */
    public static final class e<T> implements Comparator<T>, j$.util.Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator, j$.util.Comparator
        public final int compare(T t, T t2) {
            return i.u.b.a(Integer.valueOf(((Constructor) t2).getParameterTypes().length), Integer.valueOf(((Constructor) t).getParameterTypes().length));
        }

        @Override // java.util.Comparator, j$.util.Comparator
        public /* synthetic */ Comparator reversed() {
            return Collections.reverseOrder(this);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ Comparator thenComparing(Function function) {
            return Comparator.CC.$default$thenComparing(this, function);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparing(Function function, java.util.Comparator comparator) {
            return Comparator.CC.$default$thenComparing(this, function, comparator);
        }

        @Override // java.util.Comparator, j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparing(java.util.Comparator comparator) {
            return Comparator.CC.$default$thenComparing(this, comparator);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
            return Comparator.CC.$default$thenComparingDouble(this, toDoubleFunction);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparingInt(ToIntFunction toIntFunction) {
            return Comparator.CC.$default$thenComparingInt(this, toIntFunction);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparingLong(ToLongFunction toLongFunction) {
            return Comparator.CC.$default$thenComparingLong(this, toLongFunction);
        }
    }

    /* compiled from: ExceptionsConstuctor.kt */
    static final class f extends i.y.d.m implements i.y.c.l {

        /* renamed from: e, reason: collision with root package name */
        public static final f f16977e = new f();

        f() {
            super(1);
        }

        @Override // i.y.c.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Throwable th) {
            return null;
        }
    }

    /* compiled from: ExceptionsConstuctor.kt */
    /* renamed from: kotlinx.coroutines.internal.g$g, reason: collision with other inner class name */
    static final class C0225g extends i.y.d.m implements i.y.c.l {

        /* renamed from: e, reason: collision with root package name */
        public static final C0225g f16978e = new C0225g();

        C0225g() {
            super(1);
        }

        @Override // i.y.c.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Throwable th) {
            return null;
        }
    }

    private static final i.y.c.l<Throwable, Throwable> a(Constructor<?> constructor) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        int length = parameterTypes.length;
        if (length == 0) {
            return new d(constructor);
        }
        if (length == 1) {
            Class<?> cls = parameterTypes[0];
            if (i.y.d.l.a(cls, Throwable.class)) {
                return new b(constructor);
            }
            if (i.y.d.l.a(cls, String.class)) {
                return new c(constructor);
            }
        } else if (length == 2 && i.y.d.l.a(parameterTypes[0], String.class) && i.y.d.l.a(parameterTypes[1], Throwable.class)) {
            return new a(constructor);
        }
        return null;
    }

    private static final int b(Class<?> cls, int i2) {
        do {
            int length = cls.getDeclaredFields().length;
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                if (!Modifier.isStatic(r0[i4].getModifiers())) {
                    i3++;
                }
            }
            i2 += i3;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i2;
    }

    static /* synthetic */ int c(Class cls, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        return b(cls, i2);
    }

    private static final int d(Class<?> cls, int i2) {
        Object objA;
        i.y.a.b(cls);
        try {
            m.a aVar = i.m.f15825e;
            objA = i.m.a(Integer.valueOf(c(cls, 0, 1, null)));
        } catch (Throwable th) {
            m.a aVar2 = i.m.f15825e;
            objA = i.m.a(i.n.a(th));
        }
        Integer numValueOf = Integer.valueOf(i2);
        if (i.m.c(objA)) {
            objA = numValueOf;
        }
        return ((Number) objA).intValue();
    }

    public static final <E extends Throwable> E e(E e2) {
        Object objA;
        ReentrantReadWriteLock.ReadLock lock;
        int readHoldCount;
        ReentrantReadWriteLock.WriteLock writeLock;
        if (e2 instanceof kotlinx.coroutines.b0) {
            try {
                m.a aVar = i.m.f15825e;
                objA = i.m.a(((kotlinx.coroutines.b0) e2).a());
            } catch (Throwable th) {
                m.a aVar2 = i.m.f15825e;
                objA = i.m.a(i.n.a(th));
            }
            return (E) (i.m.c(objA) ? null : objA);
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f16971b;
        ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock.readLock();
        lock2.lock();
        try {
            i.y.c.l<Throwable, Throwable> lVar = f16972c.get(e2.getClass());
            if (lVar != null) {
                return (E) lVar.invoke(e2);
            }
            int i2 = 0;
            if (a != d(e2.getClass(), 0)) {
                lock = reentrantReadWriteLock.readLock();
                readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i3 = 0; i3 < readHoldCount; i3++) {
                    lock.unlock();
                }
                writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    f16972c.put(e2.getClass(), f.f16977e);
                    i.s sVar = i.s.a;
                    return null;
                } finally {
                    while (i2 < readHoldCount) {
                        lock.lock();
                        i2++;
                    }
                    writeLock.unlock();
                }
            }
            Iterator it = i.t.h.v(e2.getClass().getConstructors(), new e()).iterator();
            i.y.c.l<Throwable, Throwable> lVarA = null;
            while (it.hasNext() && (lVarA = a((Constructor) it.next())) == null) {
            }
            ReentrantReadWriteLock reentrantReadWriteLock2 = f16971b;
            lock = reentrantReadWriteLock2.readLock();
            readHoldCount = reentrantReadWriteLock2.getWriteHoldCount() == 0 ? reentrantReadWriteLock2.getReadHoldCount() : 0;
            for (int i4 = 0; i4 < readHoldCount; i4++) {
                lock.unlock();
            }
            writeLock = reentrantReadWriteLock2.writeLock();
            writeLock.lock();
            try {
                f16972c.put(e2.getClass(), lVarA != null ? lVarA : C0225g.f16978e);
                i.s sVar2 = i.s.a;
                while (i2 < readHoldCount) {
                    lock.lock();
                    i2++;
                }
                writeLock.unlock();
                if (lVarA != null) {
                    return (E) lVarA.invoke(e2);
                }
                return null;
            } finally {
                while (i2 < readHoldCount) {
                    lock.lock();
                    i2++;
                }
                writeLock.unlock();
            }
        } finally {
            lock2.unlock();
        }
    }
}