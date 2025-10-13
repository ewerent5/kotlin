package com.bumptech.glide.load.o;

import com.bumptech.glide.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ModelLoaderRegistry.java */
/* loaded from: classes.dex */
public class p {
    private final r a;

    /* renamed from: b, reason: collision with root package name */
    private final a f3910b;

    /* compiled from: ModelLoaderRegistry.java */
    private static class a {
        private final Map<Class<?>, C0091a<?>> a = new HashMap();

        /* compiled from: ModelLoaderRegistry.java */
        /* renamed from: com.bumptech.glide.load.o.p$a$a, reason: collision with other inner class name */
        private static class C0091a<Model> {
            final List<n<Model, ?>> a;

            public C0091a(List<n<Model, ?>> list) {
                this.a = list;
            }
        }

        a() {
        }

        public void a() {
            this.a.clear();
        }

        public <Model> List<n<Model, ?>> b(Class<Model> cls) {
            C0091a<?> c0091a = this.a.get(cls);
            if (c0091a == null) {
                return null;
            }
            return (List<n<Model, ?>>) c0091a.a;
        }

        public <Model> void c(Class<Model> cls, List<n<Model, ?>> list) {
            if (this.a.put(cls, new C0091a<>(list)) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public p(c.h.k.e<List<Throwable>> eVar) {
        this(new r(eVar));
    }

    private static <A> Class<A> b(A a2) {
        return (Class<A>) a2.getClass();
    }

    private synchronized <A> List<n<A, ?>> e(Class<A> cls) {
        List<n<A, ?>> listB;
        listB = this.f3910b.b(cls);
        if (listB == null) {
            listB = Collections.unmodifiableList(this.a.e(cls));
            this.f3910b.c(cls, listB);
        }
        return listB;
    }

    public synchronized <Model, Data> void a(Class<Model> cls, Class<Data> cls2, o<? extends Model, ? extends Data> oVar) {
        this.a.b(cls, cls2, oVar);
        this.f3910b.a();
    }

    public synchronized List<Class<?>> c(Class<?> cls) {
        return this.a.g(cls);
    }

    public <A> List<n<A, ?>> d(A a2) {
        List<n<A, ?>> listE = e(b(a2));
        if (listE.isEmpty()) {
            throw new i.c(a2);
        }
        int size = listE.size();
        List<n<A, ?>> listEmptyList = Collections.emptyList();
        boolean z = true;
        for (int i2 = 0; i2 < size; i2++) {
            n<A, ?> nVar = listE.get(i2);
            if (nVar.a(a2)) {
                if (z) {
                    listEmptyList = new ArrayList<>(size - i2);
                    z = false;
                }
                listEmptyList.add(nVar);
            }
        }
        if (listEmptyList.isEmpty()) {
            throw new i.c(a2, listE);
        }
        return listEmptyList;
    }

    private p(r rVar) {
        this.f3910b = new a();
        this.a = rVar;
    }
}