package com.bumptech.glide.t.l;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FactoryPools.java */
/* loaded from: classes.dex */
public final class a {
    private static final g<Object> a = new C0104a();

    /* compiled from: FactoryPools.java */
    /* renamed from: com.bumptech.glide.t.l.a$a, reason: collision with other inner class name */
    class C0104a implements g<Object> {
        C0104a() {
        }

        @Override // com.bumptech.glide.t.l.a.g
        public void a(Object obj) {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: FactoryPools.java */
    class b<T> implements d<List<T>> {
        b() {
        }

        @Override // com.bumptech.glide.t.l.a.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public List<T> a() {
            return new ArrayList();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: FactoryPools.java */
    class c<T> implements g<List<T>> {
        c() {
        }

        @Override // com.bumptech.glide.t.l.a.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(List<T> list) {
            list.clear();
        }
    }

    /* compiled from: FactoryPools.java */
    public interface d<T> {
        T a();
    }

    /* compiled from: FactoryPools.java */
    private static final class e<T> implements c.h.k.e<T> {
        private final d<T> a;

        /* renamed from: b, reason: collision with root package name */
        private final g<T> f4254b;

        /* renamed from: c, reason: collision with root package name */
        private final c.h.k.e<T> f4255c;

        e(c.h.k.e<T> eVar, d<T> dVar, g<T> gVar) {
            this.f4255c = eVar;
            this.a = dVar;
            this.f4254b = gVar;
        }

        @Override // c.h.k.e
        public boolean a(T t) {
            if (t instanceof f) {
                ((f) t).e().b(true);
            }
            this.f4254b.a(t);
            return this.f4255c.a(t);
        }

        @Override // c.h.k.e
        public T b() {
            T tB = this.f4255c.b();
            if (tB == null) {
                tB = this.a.a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + tB.getClass());
                }
            }
            if (tB instanceof f) {
                tB.e().b(false);
            }
            return (T) tB;
        }
    }

    /* compiled from: FactoryPools.java */
    public interface f {
        com.bumptech.glide.t.l.c e();
    }

    /* compiled from: FactoryPools.java */
    public interface g<T> {
        void a(T t);
    }

    private static <T extends f> c.h.k.e<T> a(c.h.k.e<T> eVar, d<T> dVar) {
        return b(eVar, dVar, c());
    }

    private static <T> c.h.k.e<T> b(c.h.k.e<T> eVar, d<T> dVar, g<T> gVar) {
        return new e(eVar, dVar, gVar);
    }

    private static <T> g<T> c() {
        return (g<T>) a;
    }

    public static <T extends f> c.h.k.e<T> d(int i2, d<T> dVar) {
        return a(new c.h.k.g(i2), dVar);
    }

    public static <T> c.h.k.e<List<T>> e() {
        return f(20);
    }

    public static <T> c.h.k.e<List<T>> f(int i2) {
        return b(new c.h.k.g(i2), new b(), new c());
    }
}