package e.c.d.y;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* compiled from: ConstructorConstructor.java */
/* loaded from: classes.dex */
public final class c {
    private final Map<Type, e.c.d.h<?>> a;

    /* renamed from: b, reason: collision with root package name */
    private final e.c.d.y.o.b f15459b = e.c.d.y.o.b.a();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    class a<T> implements e.c.d.y.i<T> {
        a() {
        }

        @Override // e.c.d.y.i
        public T a() {
            return (T) new ConcurrentHashMap();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    class b<T> implements e.c.d.y.i<T> {
        b() {
        }

        @Override // e.c.d.y.i
        public T a() {
            return (T) new TreeMap();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: e.c.d.y.c$c, reason: collision with other inner class name */
    class C0190c<T> implements e.c.d.y.i<T> {
        C0190c() {
        }

        @Override // e.c.d.y.i
        public T a() {
            return (T) new LinkedHashMap();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    class d<T> implements e.c.d.y.i<T> {
        d() {
        }

        @Override // e.c.d.y.i
        public T a() {
            return (T) new e.c.d.y.h();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    class e<T> implements e.c.d.y.i<T> {
        private final e.c.d.y.m a = e.c.d.y.m.b();

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f15460b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Type f15461c;

        e(Class cls, Type type) {
            this.f15460b = cls;
            this.f15461c = type;
        }

        @Override // e.c.d.y.i
        public T a() {
            try {
                return (T) this.a.c(this.f15460b);
            } catch (Exception e2) {
                throw new RuntimeException("Unable to invoke no-args constructor for " + this.f15461c + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e2);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    class f<T> implements e.c.d.y.i<T> {
        final /* synthetic */ e.c.d.h a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Type f15463b;

        f(e.c.d.h hVar, Type type) {
            this.a = hVar;
            this.f15463b = type;
        }

        @Override // e.c.d.y.i
        public T a() {
            return (T) this.a.a(this.f15463b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    class g<T> implements e.c.d.y.i<T> {
        final /* synthetic */ e.c.d.h a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Type f15465b;

        g(e.c.d.h hVar, Type type) {
            this.a = hVar;
            this.f15465b = type;
        }

        @Override // e.c.d.y.i
        public T a() {
            return (T) this.a.a(this.f15465b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    class h<T> implements e.c.d.y.i<T> {
        final /* synthetic */ Constructor a;

        h(Constructor constructor) {
            this.a = constructor;
        }

        @Override // e.c.d.y.i
        public T a() {
            try {
                return (T) this.a.newInstance(null);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Failed to invoke " + this.a + " with no args", e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Failed to invoke " + this.a + " with no args", e4.getTargetException());
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    class i<T> implements e.c.d.y.i<T> {
        i() {
        }

        @Override // e.c.d.y.i
        public T a() {
            return (T) new TreeSet();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    class j<T> implements e.c.d.y.i<T> {
        final /* synthetic */ Type a;

        j(Type type) {
            this.a = type;
        }

        @Override // e.c.d.y.i
        public T a() {
            Type type = this.a;
            if (!(type instanceof ParameterizedType)) {
                throw new e.c.d.m("Invalid EnumSet type: " + this.a.toString());
            }
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return (T) EnumSet.noneOf((Class) type2);
            }
            throw new e.c.d.m("Invalid EnumSet type: " + this.a.toString());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    class k<T> implements e.c.d.y.i<T> {
        k() {
        }

        @Override // e.c.d.y.i
        public T a() {
            return (T) new LinkedHashSet();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    class l<T> implements e.c.d.y.i<T> {
        l() {
        }

        @Override // e.c.d.y.i
        public T a() {
            return (T) new ArrayDeque();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    class m<T> implements e.c.d.y.i<T> {
        m() {
        }

        @Override // e.c.d.y.i
        public T a() {
            return (T) new ArrayList();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConstructorConstructor.java */
    class n<T> implements e.c.d.y.i<T> {
        n() {
        }

        @Override // e.c.d.y.i
        public T a() {
            return (T) new ConcurrentSkipListMap();
        }
    }

    public c(Map<Type, e.c.d.h<?>> map) {
        this.a = map;
    }

    private <T> e.c.d.y.i<T> b(Class<? super T> cls) throws NoSuchMethodException, SecurityException {
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f15459b.b(declaredConstructor);
            }
            return new h(declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private <T> e.c.d.y.i<T> c(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return SortedSet.class.isAssignableFrom(cls) ? new i() : EnumSet.class.isAssignableFrom(cls) ? new j(type) : Set.class.isAssignableFrom(cls) ? new k() : Queue.class.isAssignableFrom(cls) ? new l() : new m();
        }
        if (Map.class.isAssignableFrom(cls)) {
            return ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new n() : ConcurrentMap.class.isAssignableFrom(cls) ? new a() : SortedMap.class.isAssignableFrom(cls) ? new b() : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(e.c.d.z.a.b(((ParameterizedType) type).getActualTypeArguments()[0]).c())) ? new d() : new C0190c();
        }
        return null;
    }

    private <T> e.c.d.y.i<T> d(Type type, Class<? super T> cls) {
        return new e(cls, type);
    }

    public <T> e.c.d.y.i<T> a(e.c.d.z.a<T> aVar) throws NoSuchMethodException, SecurityException {
        Type typeE = aVar.e();
        Class<? super T> clsC = aVar.c();
        e.c.d.h<?> hVar = this.a.get(typeE);
        if (hVar != null) {
            return new f(hVar, typeE);
        }
        e.c.d.h<?> hVar2 = this.a.get(clsC);
        if (hVar2 != null) {
            return new g(hVar2, typeE);
        }
        e.c.d.y.i<T> iVarB = b(clsC);
        if (iVarB != null) {
            return iVarB;
        }
        e.c.d.y.i<T> iVarC = c(typeE, clsC);
        return iVarC != null ? iVarC : d(typeE, clsC);
    }

    public String toString() {
        return this.a.toString();
    }
}