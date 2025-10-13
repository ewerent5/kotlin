package com.google.firebase.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: CycleDetector.java */
/* loaded from: classes.dex */
class m {

    /* compiled from: CycleDetector.java */
    private static class b {
        private final d<?> a;

        /* renamed from: b, reason: collision with root package name */
        private final Set<b> f12290b = new HashSet();

        /* renamed from: c, reason: collision with root package name */
        private final Set<b> f12291c = new HashSet();

        b(d<?> dVar) {
            this.a = dVar;
        }

        void a(b bVar) {
            this.f12290b.add(bVar);
        }

        void b(b bVar) {
            this.f12291c.add(bVar);
        }

        d<?> c() {
            return this.a;
        }

        Set<b> d() {
            return this.f12290b;
        }

        boolean e() {
            return this.f12290b.isEmpty();
        }

        boolean f() {
            return this.f12291c.isEmpty();
        }

        void g(b bVar) {
            this.f12291c.remove(bVar);
        }
    }

    /* compiled from: CycleDetector.java */
    private static class c {
        private final Class<?> a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f12292b;

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.a.equals(this.a) && cVar.f12292b == this.f12292b;
        }

        public int hashCode() {
            return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f12292b).hashCode();
        }

        private c(Class<?> cls, boolean z) {
            this.a = cls;
            this.f12292b = z;
        }
    }

    static void a(List<d<?>> list) {
        Set<b> setC = c(list);
        Set<b> setB = b(setC);
        int i2 = 0;
        while (!setB.isEmpty()) {
            b next = setB.iterator().next();
            setB.remove(next);
            i2++;
            for (b bVar : next.d()) {
                bVar.g(next);
                if (bVar.f()) {
                    setB.add(bVar);
                }
            }
        }
        if (i2 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar2 : setC) {
            if (!bVar2.f() && !bVar2.e()) {
                arrayList.add(bVar2.c());
            }
        }
        throw new o(arrayList);
    }

    private static Set<b> b(Set<b> set) {
        HashSet hashSet = new HashSet();
        for (b bVar : set) {
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    private static Set<b> c(List<d<?>> list) {
        Set<b> set;
        HashMap map = new HashMap(list.size());
        Iterator<d<?>> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (b bVar : (Set) it2.next()) {
                        for (n nVar : bVar.c().c()) {
                            if (nVar.b() && (set = (Set) map.get(new c(nVar.a(), nVar.d()))) != null) {
                                for (b bVar2 : set) {
                                    bVar.a(bVar2);
                                    bVar2.b(bVar);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                return hashSet;
            }
            d<?> next = it.next();
            b bVar3 = new b(next);
            for (Class<? super Object> cls : next.e()) {
                c cVar = new c(cls, !next.k());
                if (!map.containsKey(cVar)) {
                    map.put(cVar, new HashSet());
                }
                Set set2 = (Set) map.get(cVar);
                if (!set2.isEmpty() && !cVar.f12292b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", cls));
                }
                set2.add(bVar3);
            }
        }
    }
}