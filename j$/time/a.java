package j$.time;

import j$.time.o.m;
import j$.time.o.n;
import j$.time.o.p;
import j$.time.o.q;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.List;
import j$.util.Map;
import j$.util.Set;
import j$.util.Spliterator;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.C0273a;
import j$.util.function.Consumer;
import j$.util.function.Function;
import j$.util.o;
import j$.util.r;
import j$.util.s;
import j$.util.stream.A2;
import j$.util.v;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes2.dex */
public /* synthetic */ class a {
    public static /* synthetic */ int A(int i2, int i3) {
        long j2 = i2 * i3;
        int i4 = (int) j2;
        if (j2 == i4) {
            return i4;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long B(long j2, long j3) {
        long j4 = j2 % j3;
        if (j4 == 0) {
            return 0L;
        }
        return (((j2 ^ j3) >> 63) | 1) > 0 ? j4 : j4 + j3;
    }

    public static /* synthetic */ long C(long j2, long j3) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j3) + Long.numberOfLeadingZeros(j3) + Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2);
        if (iNumberOfLeadingZeros > 65) {
            return j2 * j3;
        }
        if (iNumberOfLeadingZeros >= 64) {
            if ((j2 >= 0) | (j3 != Long.MIN_VALUE)) {
                long j4 = j2 * j3;
                if (j2 == 0 || j4 / j2 == j3) {
                    return j4;
                }
            }
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long D(long j2, long j3) {
        long j4 = j2 / j3;
        return (j2 - (j3 * j4) != 0 && (((j2 ^ j3) >> 63) | 1) < 0) ? j4 - 1 : j4;
    }

    public static Object E(Map map, Object obj, Object obj2, BiFunction biFunction) {
        if (map instanceof j$.util.Map) {
            return ((j$.util.Map) map).merge(obj, obj2, biFunction);
        }
        if (!(map instanceof ConcurrentMap)) {
            return Map.CC.$default$merge(map, obj, obj2, biFunction);
        }
        ConcurrentMap concurrentMap = (ConcurrentMap) map;
        Objects.requireNonNull(biFunction);
        Objects.requireNonNull(obj2);
        while (true) {
            Object objPutIfAbsent = concurrentMap.get(obj);
            while (objPutIfAbsent == null) {
                objPutIfAbsent = concurrentMap.putIfAbsent(obj, obj2);
                if (objPutIfAbsent == null) {
                    return obj2;
                }
            }
            Object objApply = biFunction.apply(objPutIfAbsent, obj2);
            if (objApply != null) {
                if (concurrentMap.replace(obj, objPutIfAbsent, objApply)) {
                    return objApply;
                }
            } else if (concurrentMap.remove(obj, objPutIfAbsent)) {
                return null;
            }
        }
    }

    public static /* synthetic */ Object F(java.util.Map map, Object obj, Object obj2) {
        return map instanceof j$.util.Map ? ((j$.util.Map) map).putIfAbsent(obj, obj2) : Map.CC.$default$putIfAbsent(map, obj, obj2);
    }

    public static /* synthetic */ boolean G(java.util.Map map, Object obj, Object obj2) {
        return map instanceof j$.util.Map ? ((j$.util.Map) map).remove(obj, obj2) : Map.CC.$default$remove(map, obj, obj2);
    }

    public static /* synthetic */ Object H(java.util.Map map, Object obj, Object obj2) {
        return map instanceof j$.util.Map ? ((j$.util.Map) map).replace(obj, obj2) : Map.CC.$default$replace(map, obj, obj2);
    }

    public static /* synthetic */ boolean I(java.util.Map map, Object obj, Object obj2, Object obj3) {
        return map instanceof j$.util.Map ? ((j$.util.Map) map).replace(obj, obj2, obj3) : Map.CC.$default$replace(map, obj, obj2, obj3);
    }

    public static void J(java.util.Map map, final BiFunction biFunction) {
        if (map instanceof j$.util.Map) {
            ((j$.util.Map) map).replaceAll(biFunction);
            return;
        }
        if (!(map instanceof ConcurrentMap)) {
            Map.CC.$default$replaceAll(map, biFunction);
            return;
        }
        final ConcurrentMap concurrentMap = (ConcurrentMap) map;
        Objects.requireNonNull(biFunction);
        BiConsumer biConsumer = new BiConsumer() { // from class: j$.util.concurrent.a
            @Override // j$.util.function.BiConsumer
            public BiConsumer a(BiConsumer biConsumer2) {
                Objects.requireNonNull(biConsumer2);
                return new C0273a(this, biConsumer2);
            }

            @Override // j$.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ConcurrentMap concurrentMap2 = concurrentMap;
                BiFunction biFunction2 = biFunction;
                while (!concurrentMap2.replace(obj, obj2, biFunction2.apply(obj, obj2)) && (obj2 = concurrentMap2.get(obj)) != null) {
                }
            }
        };
        if (concurrentMap instanceof j$.util.concurrent.b) {
            ((j$.util.concurrent.b) concurrentMap).forEach(biConsumer);
        } else {
            e(concurrentMap, biConsumer);
        }
    }

    public static /* synthetic */ void K(List list, Comparator comparator) {
        if (list instanceof j$.util.List) {
            ((j$.util.List) list).sort(comparator);
        } else {
            List.CC.$default$sort(list, comparator);
        }
    }

    public static Spliterator L(Collection collection) {
        return collection instanceof j$.util.Collection ? ((j$.util.Collection) collection).spliterator() : collection instanceof LinkedHashSet ? v.m((LinkedHashSet) collection, 17) : collection instanceof SortedSet ? s.d((SortedSet) collection) : collection instanceof Set ? Set.CC.$default$spliterator((java.util.Set) collection) : collection instanceof java.util.List ? List.CC.$default$spliterator((java.util.List) collection) : Collection.CC.$default$spliterator(collection);
    }

    public static /* synthetic */ Comparator M(Comparator comparator, Comparator comparator2) {
        return comparator instanceof j$.util.Comparator ? ((j$.util.Comparator) comparator).thenComparing(comparator2) : Comparator.CC.$default$thenComparing(comparator, comparator2);
    }

    public static void a(A2 a2) {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void b(A2 a2) {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void c(A2 a2) {
        throw new IllegalStateException("called wrong accept method");
    }

    public static int d(j$.time.m.c cVar, j$.time.m.c cVar2) {
        int iS = cVar.c().compareTo(cVar2.c());
        if (iS != 0) {
            return iS;
        }
        int iT = cVar.b().compareTo(cVar2.b());
        return iT == 0 ? cVar.a().compareTo(cVar2.a()) : iT;
    }

    public static void e(ConcurrentMap concurrentMap, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        for (Map.Entry entry : concurrentMap.entrySet()) {
            try {
                biConsumer.accept(entry.getKey(), entry.getValue());
            } catch (IllegalStateException unused) {
            }
        }
    }

    public static int f(j$.time.o.k kVar, j$.time.o.l lVar) {
        q qVarJ = kVar.j(lVar);
        if (!qVarJ.g()) {
            throw new p("Invalid field " + lVar + " for get() method, use getLong() instead");
        }
        long jL = kVar.l(lVar);
        if (qVarJ.h(jL)) {
            return (int) jL;
        }
        throw new c("Invalid value for " + lVar + " (valid values " + qVarJ + "): " + jL);
    }

    public static Object g(j$.time.m.c cVar, n nVar) {
        int i2 = m.a;
        if (nVar == j$.time.o.d.a || nVar == j$.time.o.g.a || nVar == j$.time.o.c.a) {
            return null;
        }
        return nVar == j$.time.o.f.a ? cVar.b() : nVar == j$.time.o.b.a ? cVar.a() : nVar == j$.time.o.e.a ? j$.time.o.i.NANOS : nVar.a(cVar);
    }

    public static Object h(j$.time.o.k kVar, n nVar) {
        int i2 = m.a;
        if (nVar == j$.time.o.d.a || nVar == j$.time.o.b.a || nVar == j$.time.o.e.a) {
            return null;
        }
        return nVar.a(kVar);
    }

    public static q i(j$.time.o.k kVar, j$.time.o.l lVar) {
        if (!(lVar instanceof j$.time.o.h)) {
            Objects.requireNonNull(lVar, "field");
            return lVar.t(kVar);
        }
        if (kVar.d(lVar)) {
            return lVar.h();
        }
        throw new p("Unsupported field: " + lVar);
    }

    public static long j(j$.time.m.c cVar, k kVar) {
        Objects.requireNonNull(kVar, "offset");
        return ((cVar.c().m() * 86400) + cVar.b().C()) - kVar.y();
    }

    public static Object k(java.util.Map map, Object obj, BiFunction biFunction) {
        Object objApply;
        if (map instanceof j$.util.Map) {
            return ((j$.util.Map) map).compute(obj, biFunction);
        }
        if (!(map instanceof ConcurrentMap)) {
            return Map.CC.$default$compute(map, obj, biFunction);
        }
        ConcurrentMap concurrentMap = (ConcurrentMap) map;
        Objects.requireNonNull(biFunction);
        loop0: while (true) {
            Object objPutIfAbsent = concurrentMap.get(obj);
            while (true) {
                objApply = biFunction.apply(obj, objPutIfAbsent);
                if (objApply == null) {
                    objApply = null;
                    if ((objPutIfAbsent == null && !concurrentMap.containsKey(obj)) || concurrentMap.remove(obj, objPutIfAbsent)) {
                        break;
                    }
                } else if (objPutIfAbsent == null) {
                    objPutIfAbsent = concurrentMap.putIfAbsent(obj, objApply);
                    if (objPutIfAbsent == null) {
                        break loop0;
                    }
                } else if (concurrentMap.replace(obj, objPutIfAbsent, objApply)) {
                    break;
                }
            }
        }
        return objApply;
    }

    public static Object l(java.util.Map map, Object obj, Function function) {
        Object objApply;
        if (map instanceof j$.util.Map) {
            return ((j$.util.Map) map).computeIfAbsent(obj, function);
        }
        if (!(map instanceof ConcurrentMap)) {
            return Map.CC.$default$computeIfAbsent(map, obj, function);
        }
        ConcurrentMap concurrentMap = (ConcurrentMap) map;
        Objects.requireNonNull(function);
        Object obj2 = concurrentMap.get(obj);
        if (obj2 != null || (objApply = function.apply(obj)) == null) {
            return obj2;
        }
        Object objPutIfAbsent = concurrentMap.putIfAbsent(obj, objApply);
        return objPutIfAbsent == null ? objApply : objPutIfAbsent;
    }

    public static Object m(java.util.Map map, Object obj, BiFunction biFunction) {
        if (map instanceof j$.util.Map) {
            return ((j$.util.Map) map).computeIfPresent(obj, biFunction);
        }
        if (!(map instanceof ConcurrentMap)) {
            return Map.CC.$default$computeIfPresent(map, obj, biFunction);
        }
        ConcurrentMap concurrentMap = (ConcurrentMap) map;
        Objects.requireNonNull(biFunction);
        while (true) {
            Object obj2 = concurrentMap.get(obj);
            if (obj2 == null) {
                return obj2;
            }
            Object objApply = biFunction.apply(obj, obj2);
            if (objApply != null) {
                if (concurrentMap.replace(obj, obj2, objApply)) {
                    return objApply;
                }
            } else if (concurrentMap.remove(obj, obj2)) {
                return null;
            }
        }
    }

    public static o n(Optional optional) {
        if (optional == null) {
            return null;
        }
        return optional.isPresent() ? o.d(optional.get()) : o.a();
    }

    public static j$.util.p o(OptionalDouble optionalDouble) {
        if (optionalDouble == null) {
            return null;
        }
        return optionalDouble.isPresent() ? j$.util.p.d(optionalDouble.getAsDouble()) : j$.util.p.a();
    }

    public static j$.util.q p(OptionalInt optionalInt) {
        if (optionalInt == null) {
            return null;
        }
        return optionalInt.isPresent() ? j$.util.q.d(optionalInt.getAsInt()) : j$.util.q.a();
    }

    public static r q(OptionalLong optionalLong) {
        if (optionalLong == null) {
            return null;
        }
        return optionalLong.isPresent() ? r.d(optionalLong.getAsLong()) : r.a();
    }

    public static Optional r(o oVar) {
        if (oVar == null) {
            return null;
        }
        return oVar.c() ? Optional.of(oVar.b()) : Optional.empty();
    }

    public static OptionalDouble s(j$.util.p pVar) {
        if (pVar == null) {
            return null;
        }
        return pVar.c() ? OptionalDouble.of(pVar.b()) : OptionalDouble.empty();
    }

    public static OptionalInt t(j$.util.q qVar) {
        if (qVar == null) {
            return null;
        }
        return qVar.c() ? OptionalInt.of(qVar.b()) : OptionalInt.empty();
    }

    public static OptionalLong u(r rVar) {
        if (rVar == null) {
            return null;
        }
        return rVar.c() ? OptionalLong.of(rVar.b()) : OptionalLong.empty();
    }

    public static boolean v(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void w(java.util.Collection collection, Consumer consumer) {
        if (collection instanceof j$.util.Collection) {
            ((j$.util.Collection) collection).forEach(consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    public static /* synthetic */ void x(java.util.Map map, BiConsumer biConsumer) {
        if (map instanceof j$.util.Map) {
            ((j$.util.Map) map).forEach(biConsumer);
        } else if (map instanceof ConcurrentMap) {
            e((ConcurrentMap) map, biConsumer);
        } else {
            Map.CC.$default$forEach(map, biConsumer);
        }
    }

    public static Object y(java.util.Map map, Object obj, Object obj2) {
        if (map instanceof j$.util.Map) {
            return ((j$.util.Map) map).getOrDefault(obj, obj2);
        }
        if (!(map instanceof ConcurrentMap)) {
            return Map.CC.$default$getOrDefault(map, obj, obj2);
        }
        Object obj3 = ((ConcurrentMap) map).get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    public static /* synthetic */ long z(long j2, long j3) {
        long j4 = j2 + j3;
        if (((j3 ^ j2) < 0) || ((j2 ^ j4) >= 0)) {
            return j4;
        }
        throw new ArithmeticException();
    }
}