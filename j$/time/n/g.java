package j$.time.n;

import j$.B0;
import j$.D0;
import j$.F0;
import j$.M;
import j$.util.Comparator;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Function;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
class g {
    private static final Comparator a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f15966b = 0;

    class a implements Comparator<Map.Entry<String, Long>>, j$.util.Comparator {
        a() {
        }

        @Override // java.util.Comparator, j$.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((String) ((Map.Entry) obj2).getKey()).length() - ((String) ((Map.Entry) obj).getKey()).length();
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

        @Override // java.util.Comparator
        public /* synthetic */ java.util.Comparator<Map.Entry<String, Long>> thenComparing(java.util.function.Function function) {
            return Comparator.CC.$default$thenComparing(this, M.c(function));
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
            return Comparator.CC.$default$thenComparingDouble(this, toDoubleFunction);
        }

        @Override // java.util.Comparator
        public /* synthetic */ java.util.Comparator<Map.Entry<String, Long>> thenComparingDouble(java.util.function.ToDoubleFunction<? super Map.Entry<String, Long>> toDoubleFunction) {
            return Comparator.CC.$default$thenComparingDouble(this, B0.a(toDoubleFunction));
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparingInt(ToIntFunction toIntFunction) {
            return Comparator.CC.$default$thenComparingInt(this, toIntFunction);
        }

        @Override // java.util.Comparator
        public /* synthetic */ java.util.Comparator<Map.Entry<String, Long>> thenComparingInt(java.util.function.ToIntFunction<? super Map.Entry<String, Long>> toIntFunction) {
            return Comparator.CC.$default$thenComparingInt(this, D0.a(toIntFunction));
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparingLong(ToLongFunction toLongFunction) {
            return Comparator.CC.$default$thenComparingLong(this, toLongFunction);
        }

        @Override // java.util.Comparator
        public /* synthetic */ java.util.Comparator<Map.Entry<String, Long>> thenComparingLong(java.util.function.ToLongFunction<? super Map.Entry<String, Long>> toLongFunction) {
            return Comparator.CC.$default$thenComparingLong(this, F0.a(toLongFunction));
        }

        @Override // java.util.Comparator
        public /* synthetic */ java.util.Comparator<Map.Entry<String, Long>> thenComparing(java.util.function.Function function, java.util.Comparator comparator) {
            return Comparator.CC.$default$thenComparing(this, M.c(function), comparator);
        }
    }

    static final class b {
        private final Map a;

        b(Map map) {
            this.a = map;
            HashMap map2 = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                HashMap map3 = new HashMap();
                for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                    String str = (String) entry2.getValue();
                    String str2 = (String) entry2.getValue();
                    Long l2 = (Long) entry2.getKey();
                    int i2 = g.f15966b;
                    map3.put(str, new AbstractMap.SimpleImmutableEntry(str2, l2));
                }
                ArrayList arrayList2 = new ArrayList(map3.values());
                Collections.sort(arrayList2, g.a);
                map2.put((k) entry.getKey(), arrayList2);
                arrayList.addAll(arrayList2);
                map2.put(null, arrayList);
            }
            Collections.sort(arrayList, g.a);
        }

        String a(long j2, k kVar) {
            Map map = (Map) this.a.get(kVar);
            if (map != null) {
                return (String) map.get(Long.valueOf(j2));
            }
            return null;
        }
    }

    static {
        new ConcurrentHashMap(16, 0.75f, 2);
        a = new a();
    }

    g() {
    }
}