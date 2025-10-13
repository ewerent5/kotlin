package j$.util;

import j$.C0266q;
import j$.C0269s;
import j$.M;
import j$.util.Collection;
import j$.util.List;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Consumer;
import j$.util.function.Function;
import j$.util.function.Predicate;
import j$.util.function.UnaryOperator;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

/* loaded from: classes2.dex */
public class DesugarCollections {
    public static final Class a;

    /* renamed from: b */
    static final Class f15997b;

    /* renamed from: c */
    private static final Field f15998c;

    /* renamed from: d */
    private static final Field f15999d;

    /* renamed from: e */
    private static final Constructor f16000e;

    /* renamed from: f */
    private static final Constructor f16001f;

    private static class a<K, V> implements java.util.Map<K, V>, Serializable, Map {
        private final java.util.Map a;

        /* renamed from: b */
        final Object f16002b;

        /* renamed from: c */
        private transient java.util.Set f16003c;

        /* renamed from: d */
        private transient java.util.Set f16004d;

        /* renamed from: e */
        private transient java.util.Collection f16005e;

        a(java.util.Map map) {
            Objects.requireNonNull(map);
            this.a = map;
            this.f16002b = this;
        }

        private java.util.Set a(java.util.Set set, Object obj) {
            if (DesugarCollections.f16001f == null) {
                return Collections.synchronizedSet(set);
            }
            try {
                return (java.util.Set) DesugarCollections.f16001f.newInstance(set, obj);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
                throw new Error("Unable to instantiate a synchronized list.", e2);
            }
        }

        @Override // java.util.Map, j$.util.Map, java.util.HashMap, java.util.AbstractMap
        public void clear() {
            synchronized (this.f16002b) {
                this.a.clear();
            }
        }

        @Override // j$.util.Map
        public Object compute(Object obj, BiFunction biFunction) {
            Object objK;
            synchronized (this.f16002b) {
                objK = j$.time.a.k(this.a, obj, biFunction);
            }
            return objK;
        }

        @Override // java.util.Map
        public Object compute(Object obj, java.util.function.BiFunction biFunction) {
            Object objK;
            BiFunction biFunctionB = C0269s.b(biFunction);
            synchronized (this.f16002b) {
                objK = j$.time.a.k(this.a, obj, biFunctionB);
            }
            return objK;
        }

        @Override // j$.util.Map
        public Object computeIfAbsent(Object obj, Function function) {
            Object objL;
            synchronized (this.f16002b) {
                objL = j$.time.a.l(this.a, obj, function);
            }
            return objL;
        }

        @Override // java.util.Map
        public Object computeIfAbsent(Object obj, java.util.function.Function function) {
            Object objL;
            Function functionC = M.c(function);
            synchronized (this.f16002b) {
                objL = j$.time.a.l(this.a, obj, functionC);
            }
            return objL;
        }

        @Override // j$.util.Map
        public Object computeIfPresent(Object obj, BiFunction biFunction) {
            Object objM;
            synchronized (this.f16002b) {
                objM = j$.time.a.m(this.a, obj, biFunction);
            }
            return objM;
        }

        @Override // java.util.Map
        public Object computeIfPresent(Object obj, java.util.function.BiFunction biFunction) {
            Object objM;
            BiFunction biFunctionB = C0269s.b(biFunction);
            synchronized (this.f16002b) {
                objM = j$.time.a.m(this.a, obj, biFunctionB);
            }
            return objM;
        }

        @Override // java.util.Map, j$.util.Map
        public boolean containsKey(Object obj) {
            boolean zContainsKey;
            synchronized (this.f16002b) {
                zContainsKey = this.a.containsKey(obj);
            }
            return zContainsKey;
        }

        @Override // java.util.Map, j$.util.Map
        public boolean containsValue(Object obj) {
            boolean zContainsValue;
            synchronized (this.f16002b) {
                zContainsValue = this.a.containsValue(obj);
            }
            return zContainsValue;
        }

        @Override // java.util.Map, j$.util.Map
        public java.util.Set entrySet() {
            java.util.Set set;
            synchronized (this.f16002b) {
                if (this.f16004d == null) {
                    this.f16004d = a(this.a.entrySet(), this.f16002b);
                }
                set = this.f16004d;
            }
            return set;
        }

        @Override // java.util.Map, j$.util.Map
        public boolean equals(Object obj) {
            boolean zEquals;
            if (this == obj) {
                return true;
            }
            synchronized (this.f16002b) {
                zEquals = this.a.equals(obj);
            }
            return zEquals;
        }

        @Override // j$.util.Map
        public void forEach(BiConsumer biConsumer) {
            synchronized (this.f16002b) {
                j$.time.a.x(this.a, biConsumer);
            }
        }

        @Override // java.util.Map
        public void forEach(java.util.function.BiConsumer biConsumer) {
            BiConsumer biConsumerB = C0266q.b(biConsumer);
            synchronized (this.f16002b) {
                j$.time.a.x(this.a, biConsumerB);
            }
        }

        @Override // java.util.Map, j$.util.Map
        public Object get(Object obj) {
            Object obj2;
            synchronized (this.f16002b) {
                obj2 = this.a.get(obj);
            }
            return obj2;
        }

        @Override // java.util.Map, j$.util.Map, java.util.HashMap
        public Object getOrDefault(Object obj, Object obj2) {
            Object objY;
            synchronized (this.f16002b) {
                objY = j$.time.a.y(this.a, obj, obj2);
            }
            return objY;
        }

        @Override // java.util.Map, j$.util.Map
        public int hashCode() {
            int iHashCode;
            synchronized (this.f16002b) {
                iHashCode = this.a.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Map, j$.util.Map
        public boolean isEmpty() {
            boolean zIsEmpty;
            synchronized (this.f16002b) {
                zIsEmpty = this.a.isEmpty();
            }
            return zIsEmpty;
        }

        @Override // java.util.Map, j$.util.Map
        public java.util.Set keySet() {
            java.util.Set set;
            synchronized (this.f16002b) {
                if (this.f16003c == null) {
                    this.f16003c = a(this.a.keySet(), this.f16002b);
                }
                set = this.f16003c;
            }
            return set;
        }

        @Override // j$.util.Map
        public Object merge(Object obj, Object obj2, BiFunction biFunction) {
            Object objE;
            synchronized (this.f16002b) {
                objE = j$.time.a.E(this.a, obj, obj2, biFunction);
            }
            return objE;
        }

        @Override // java.util.Map
        public Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
            Object objE;
            BiFunction biFunctionB = C0269s.b(biFunction);
            synchronized (this.f16002b) {
                objE = j$.time.a.E(this.a, obj, obj2, biFunctionB);
            }
            return objE;
        }

        @Override // java.util.Map, j$.util.Map
        public Object put(Object obj, Object obj2) {
            Object objPut;
            synchronized (this.f16002b) {
                objPut = this.a.put(obj, obj2);
            }
            return objPut;
        }

        @Override // java.util.Map, j$.util.Map
        public void putAll(java.util.Map map) {
            synchronized (this.f16002b) {
                this.a.putAll(map);
            }
        }

        @Override // java.util.Map, j$.util.Map
        public Object putIfAbsent(Object obj, Object obj2) {
            Object objF;
            synchronized (this.f16002b) {
                objF = j$.time.a.F(this.a, obj, obj2);
            }
            return objF;
        }

        @Override // java.util.Map, j$.util.Map
        public Object remove(Object obj) {
            Object objRemove;
            synchronized (this.f16002b) {
                objRemove = this.a.remove(obj);
            }
            return objRemove;
        }

        @Override // java.util.Map, j$.util.Map
        public boolean remove(Object obj, Object obj2) {
            boolean zG;
            synchronized (this.f16002b) {
                zG = j$.time.a.G(this.a, obj, obj2);
            }
            return zG;
        }

        @Override // java.util.Map, j$.util.Map
        public Object replace(Object obj, Object obj2) {
            Object objH;
            synchronized (this.f16002b) {
                objH = j$.time.a.H(this.a, obj, obj2);
            }
            return objH;
        }

        @Override // java.util.Map, j$.util.Map
        public boolean replace(Object obj, Object obj2, Object obj3) {
            boolean zI;
            synchronized (this.f16002b) {
                zI = j$.time.a.I(this.a, obj, obj2, obj3);
            }
            return zI;
        }

        @Override // j$.util.Map
        public void replaceAll(BiFunction biFunction) {
            synchronized (this.f16002b) {
                j$.time.a.J(this.a, biFunction);
            }
        }

        @Override // java.util.Map
        public void replaceAll(java.util.function.BiFunction biFunction) {
            BiFunction biFunctionB = C0269s.b(biFunction);
            synchronized (this.f16002b) {
                j$.time.a.J(this.a, biFunctionB);
            }
        }

        @Override // java.util.Map, j$.util.Map
        public int size() {
            int size;
            synchronized (this.f16002b) {
                size = this.a.size();
            }
            return size;
        }

        public String toString() {
            String string;
            synchronized (this.f16002b) {
                string = this.a.toString();
            }
            return string;
        }

        @Override // java.util.Map, j$.util.Map
        public java.util.Collection values() {
            java.util.Collection collection;
            java.util.Collection collectionSynchronizedCollection;
            synchronized (this.f16002b) {
                try {
                    if (this.f16005e == null) {
                        java.util.Collection<V> collectionValues = this.a.values();
                        Object obj = this.f16002b;
                        if (DesugarCollections.f16000e == null) {
                            collectionSynchronizedCollection = Collections.synchronizedCollection(collectionValues);
                        } else {
                            try {
                                collectionSynchronizedCollection = (java.util.Collection) DesugarCollections.f16000e.newInstance(collectionValues, obj);
                            } catch (IllegalAccessException e2) {
                                e = e2;
                                throw new Error("Unable to instantiate a synchronized list.", e);
                            } catch (InstantiationException e3) {
                                e = e3;
                                throw new Error("Unable to instantiate a synchronized list.", e);
                            } catch (InvocationTargetException e4) {
                                e = e4;
                                throw new Error("Unable to instantiate a synchronized list.", e);
                            }
                        }
                        this.f16005e = collectionSynchronizedCollection;
                    }
                    collection = this.f16005e;
                } finally {
                }
            }
            return collection;
        }
    }

    static {
        Field declaredField;
        Field declaredField2;
        Constructor<?> declaredConstructor;
        Class<?> cls = Collections.synchronizedCollection(new ArrayList()).getClass();
        a = cls;
        f15997b = Collections.synchronizedList(new LinkedList()).getClass();
        Constructor<?> declaredConstructor2 = null;
        try {
            declaredField = cls.getDeclaredField("mutex");
        } catch (NoSuchFieldException unused) {
            declaredField = null;
        }
        f15998c = declaredField;
        if (declaredField != null) {
            declaredField.setAccessible(true);
        }
        try {
            declaredField2 = cls.getDeclaredField("c");
        } catch (NoSuchFieldException unused2) {
            declaredField2 = null;
        }
        f15999d = declaredField2;
        if (declaredField2 != null) {
            declaredField2.setAccessible(true);
        }
        try {
            declaredConstructor = Collections.synchronizedSet(new HashSet()).getClass().getDeclaredConstructor(java.util.Set.class, Object.class);
        } catch (NoSuchMethodException unused3) {
            declaredConstructor = null;
        }
        f16001f = declaredConstructor;
        if (declaredConstructor != null) {
            declaredConstructor.setAccessible(true);
        }
        try {
            declaredConstructor2 = cls.getDeclaredConstructor(java.util.Collection.class, Object.class);
        } catch (NoSuchMethodException unused4) {
        }
        f16000e = declaredConstructor2;
        if (declaredConstructor2 != null) {
            declaredConstructor2.setAccessible(true);
        }
    }

    private DesugarCollections() {
    }

    public static void c(Iterable iterable, Consumer consumer) {
        Field field = f15998c;
        if (field == null) {
            try {
                j$.time.a.w((java.util.Collection) f15999d.get(iterable), consumer);
            } catch (IllegalAccessException e2) {
                throw new Error("Runtime illegal access in synchronized collection forEach fall-back.", e2);
            }
        } else {
            try {
                synchronized (field.get(iterable)) {
                    j$.time.a.w((java.util.Collection) f15999d.get(iterable), consumer);
                }
            } catch (IllegalAccessException e3) {
                throw new Error("Runtime illegal access in synchronized collection forEach.", e3);
            }
        }
    }

    static boolean d(java.util.Collection collection, Predicate predicate) {
        boolean zRemoveIf;
        Field field = f15998c;
        if (field == null) {
            try {
                java.util.Collection collection2 = (java.util.Collection) f15999d.get(collection);
                return collection2 instanceof Collection ? ((Collection) collection2).removeIf(predicate) : Collection.CC.$default$removeIf(collection2, predicate);
            } catch (IllegalAccessException e2) {
                throw new Error("Runtime illegal access in synchronized collection removeIf fall-back.", e2);
            }
        }
        try {
            synchronized (field.get(collection)) {
                java.util.Collection collection3 = (java.util.Collection) f15999d.get(collection);
                zRemoveIf = collection3 instanceof Collection ? ((Collection) collection3).removeIf(predicate) : Collection.CC.$default$removeIf(collection3, predicate);
            }
            return zRemoveIf;
        } catch (IllegalAccessException e3) {
            throw new Error("Runtime illegal access in synchronized collection removeIf.", e3);
        }
    }

    static void e(java.util.List list, UnaryOperator unaryOperator) {
        Field field = f15998c;
        if (field == null) {
            try {
                java.util.List list2 = (java.util.List) f15999d.get(list);
                if (list2 instanceof List) {
                    ((List) list2).replaceAll(unaryOperator);
                    return;
                } else {
                    List.CC.$default$replaceAll(list2, unaryOperator);
                    return;
                }
            } catch (IllegalAccessException e2) {
                throw new Error("Runtime illegal access in synchronized list replaceAll fall-back.", e2);
            }
        }
        try {
            synchronized (field.get(list)) {
                java.util.List list3 = (java.util.List) f15999d.get(list);
                if (list3 instanceof List) {
                    ((List) list3).replaceAll(unaryOperator);
                } else {
                    List.CC.$default$replaceAll(list3, unaryOperator);
                }
            }
        } catch (IllegalAccessException e3) {
            throw new Error("Runtime illegal access in synchronized list replaceAll.", e3);
        }
    }

    static void f(java.util.List list, java.util.Comparator comparator) {
        Field field = f15998c;
        if (field == null) {
            try {
                j$.time.a.K((java.util.List) f15999d.get(list), comparator);
            } catch (IllegalAccessException e2) {
                throw new Error("Runtime illegal access in synchronized collection sort fall-back.", e2);
            }
        } else {
            try {
                synchronized (field.get(list)) {
                    j$.time.a.K((java.util.List) f15999d.get(list), comparator);
                }
            } catch (IllegalAccessException e3) {
                throw new Error("Runtime illegal access in synchronized list sort.", e3);
            }
        }
    }

    public static java.util.Map synchronizedMap(java.util.Map map) {
        return new a(map);
    }
}