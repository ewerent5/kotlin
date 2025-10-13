package com.google.firebase.components;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: ComponentRuntime.java */
/* loaded from: classes.dex */
public class l extends a {
    private static final com.google.firebase.n.a<Set<Object>> a = k.a();

    /* renamed from: b, reason: collision with root package name */
    private final Map<d<?>, s<?>> f12286b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map<Class<?>, s<?>> f12287c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map<Class<?>, s<Set<?>>> f12288d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final r f12289e;

    public l(Executor executor, Iterable<h> iterable, d<?>... dVarArr) {
        r rVar = new r(executor);
        this.f12289e = rVar;
        ArrayList<d<?>> arrayList = new ArrayList();
        arrayList.add(d.n(rVar, r.class, com.google.firebase.l.d.class, com.google.firebase.l.c.class));
        Iterator<h> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().getComponents());
        }
        for (d<?> dVar : dVarArr) {
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        m.a(arrayList);
        for (d<?> dVar2 : arrayList) {
            this.f12286b.put(dVar2, new s<>(i.a(this, dVar2)));
        }
        h();
        i();
    }

    static /* synthetic */ Set g(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(((s) it.next()).get());
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private void h() {
        for (Map.Entry<d<?>, s<?>> entry : this.f12286b.entrySet()) {
            d<?> key = entry.getKey();
            if (key.k()) {
                s<?> value = entry.getValue();
                Iterator<Class<? super Object>> it = key.e().iterator();
                while (it.hasNext()) {
                    this.f12287c.put(it.next(), value);
                }
            }
        }
        j();
    }

    private void i() {
        HashMap map = new HashMap();
        for (Map.Entry<d<?>, s<?>> entry : this.f12286b.entrySet()) {
            d<?> key = entry.getKey();
            if (!key.k()) {
                s<?> value = entry.getValue();
                for (Class<? super Object> cls : key.e()) {
                    if (!map.containsKey(cls)) {
                        map.put(cls, new HashSet());
                    }
                    ((Set) map.get(cls)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            this.f12288d.put((Class) entry2.getKey(), new s<>(j.a((Set) entry2.getValue())));
        }
    }

    private void j() {
        for (d<?> dVar : this.f12286b.keySet()) {
            for (n nVar : dVar.c()) {
                if (nVar.c() && !this.f12287c.containsKey(nVar.a())) {
                    throw new t(String.format("Unsatisfied dependency for component %s: %s", dVar, nVar.a()));
                }
            }
        }
    }

    @Override // com.google.firebase.components.a, com.google.firebase.components.e
    public /* bridge */ /* synthetic */ Object a(Class cls) {
        return super.a(cls);
    }

    @Override // com.google.firebase.components.e
    public <T> com.google.firebase.n.a<T> b(Class<T> cls) {
        u.c(cls, "Null interface requested.");
        return this.f12287c.get(cls);
    }

    @Override // com.google.firebase.components.e
    public <T> com.google.firebase.n.a<Set<T>> c(Class<T> cls) {
        s<Set<?>> sVar = this.f12288d.get(cls);
        return sVar != null ? sVar : (com.google.firebase.n.a<Set<T>>) a;
    }

    @Override // com.google.firebase.components.a, com.google.firebase.components.e
    public /* bridge */ /* synthetic */ Set d(Class cls) {
        return super.d(cls);
    }

    public void e(boolean z) {
        for (Map.Entry<d<?>, s<?>> entry : this.f12286b.entrySet()) {
            d<?> key = entry.getKey();
            s<?> value = entry.getValue();
            if (key.i() || (key.j() && z)) {
                value.get();
            }
        }
        this.f12289e.b();
    }
}