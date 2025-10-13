package com.bumptech.glide.load.o;

import com.bumptech.glide.i;
import com.bumptech.glide.load.o.n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: MultiModelLoaderFactory.java */
/* loaded from: classes.dex */
public class r {
    private static final c a = new c();

    /* renamed from: b, reason: collision with root package name */
    private static final n<Object, Object> f3919b = new a();

    /* renamed from: c, reason: collision with root package name */
    private final List<b<?, ?>> f3920c;

    /* renamed from: d, reason: collision with root package name */
    private final c f3921d;

    /* renamed from: e, reason: collision with root package name */
    private final Set<b<?, ?>> f3922e;

    /* renamed from: f, reason: collision with root package name */
    private final c.h.k.e<List<Throwable>> f3923f;

    /* compiled from: MultiModelLoaderFactory.java */
    private static class a implements n<Object, Object> {
        a() {
        }

        @Override // com.bumptech.glide.load.o.n
        public boolean a(Object obj) {
            return false;
        }

        @Override // com.bumptech.glide.load.o.n
        public n.a<Object> b(Object obj, int i2, int i3, com.bumptech.glide.load.i iVar) {
            return null;
        }
    }

    /* compiled from: MultiModelLoaderFactory.java */
    private static class b<Model, Data> {
        private final Class<Model> a;

        /* renamed from: b, reason: collision with root package name */
        final Class<Data> f3924b;

        /* renamed from: c, reason: collision with root package name */
        final o<? extends Model, ? extends Data> f3925c;

        public b(Class<Model> cls, Class<Data> cls2, o<? extends Model, ? extends Data> oVar) {
            this.a = cls;
            this.f3924b = cls2;
            this.f3925c = oVar;
        }

        public boolean a(Class<?> cls) {
            return this.a.isAssignableFrom(cls);
        }

        public boolean b(Class<?> cls, Class<?> cls2) {
            return a(cls) && this.f3924b.isAssignableFrom(cls2);
        }
    }

    /* compiled from: MultiModelLoaderFactory.java */
    static class c {
        c() {
        }

        public <Model, Data> q<Model, Data> a(List<n<Model, Data>> list, c.h.k.e<List<Throwable>> eVar) {
            return new q<>(list, eVar);
        }
    }

    public r(c.h.k.e<List<Throwable>> eVar) {
        this(eVar, a);
    }

    private <Model, Data> void a(Class<Model> cls, Class<Data> cls2, o<? extends Model, ? extends Data> oVar, boolean z) {
        b<?, ?> bVar = new b<>(cls, cls2, oVar);
        List<b<?, ?>> list = this.f3920c;
        list.add(z ? list.size() : 0, bVar);
    }

    private <Model, Data> n<Model, Data> c(b<?, ?> bVar) {
        return (n) com.bumptech.glide.t.j.d(bVar.f3925c.b(this));
    }

    private static <Model, Data> n<Model, Data> f() {
        return (n<Model, Data>) f3919b;
    }

    synchronized <Model, Data> void b(Class<Model> cls, Class<Data> cls2, o<? extends Model, ? extends Data> oVar) {
        a(cls, cls2, oVar, true);
    }

    public synchronized <Model, Data> n<Model, Data> d(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (b<?, ?> bVar : this.f3920c) {
                if (this.f3922e.contains(bVar)) {
                    z = true;
                } else if (bVar.b(cls, cls2)) {
                    this.f3922e.add(bVar);
                    arrayList.add(c(bVar));
                    this.f3922e.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f3921d.a(arrayList, this.f3923f);
            }
            if (arrayList.size() == 1) {
                return (n) arrayList.get(0);
            }
            if (!z) {
                throw new i.c((Class<?>) cls, (Class<?>) cls2);
            }
            return f();
        } catch (Throwable th) {
            this.f3922e.clear();
            throw th;
        }
    }

    synchronized <Model> List<n<Model, ?>> e(Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b<?, ?> bVar : this.f3920c) {
                if (!this.f3922e.contains(bVar) && bVar.a(cls)) {
                    this.f3922e.add(bVar);
                    arrayList.add(c(bVar));
                    this.f3922e.remove(bVar);
                }
            }
        } catch (Throwable th) {
            this.f3922e.clear();
            throw th;
        }
        return arrayList;
    }

    synchronized List<Class<?>> g(Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b<?, ?> bVar : this.f3920c) {
            if (!arrayList.contains(bVar.f3924b) && bVar.a(cls)) {
                arrayList.add(bVar.f3924b);
            }
        }
        return arrayList;
    }

    r(c.h.k.e<List<Throwable>> eVar, c cVar) {
        this.f3920c = new ArrayList();
        this.f3922e = new HashSet();
        this.f3923f = eVar;
        this.f3921d = cVar;
    }
}