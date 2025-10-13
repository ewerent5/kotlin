package com.google.firebase.components;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: Component.java */
/* loaded from: classes.dex */
public final class d<T> {
    private final Set<Class<? super T>> a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<n> f12274b;

    /* renamed from: c, reason: collision with root package name */
    private final int f12275c;

    /* renamed from: d, reason: collision with root package name */
    private final int f12276d;

    /* renamed from: e, reason: collision with root package name */
    private final g<T> f12277e;

    /* renamed from: f, reason: collision with root package name */
    private final Set<Class<?>> f12278f;

    /* compiled from: Component.java */
    public static class b<T> {
        private final Set<Class<? super T>> a;

        /* renamed from: b, reason: collision with root package name */
        private final Set<n> f12279b;

        /* renamed from: c, reason: collision with root package name */
        private int f12280c;

        /* renamed from: d, reason: collision with root package name */
        private int f12281d;

        /* renamed from: e, reason: collision with root package name */
        private g<T> f12282e;

        /* renamed from: f, reason: collision with root package name */
        private Set<Class<?>> f12283f;

        /* JADX INFO: Access modifiers changed from: private */
        public b<T> f() {
            this.f12281d = 1;
            return this;
        }

        private b<T> g(int i2) {
            u.d(this.f12280c == 0, "Instantiation type has already been set.");
            this.f12280c = i2;
            return this;
        }

        private void h(Class<?> cls) {
            u.a(!this.a.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b<T> b(n nVar) {
            u.c(nVar, "Null dependency");
            h(nVar.a());
            this.f12279b.add(nVar);
            return this;
        }

        public d<T> c() {
            u.d(this.f12282e != null, "Missing required property: factory.");
            return new d<>(new HashSet(this.a), new HashSet(this.f12279b), this.f12280c, this.f12281d, this.f12282e, this.f12283f);
        }

        public b<T> d() {
            return g(2);
        }

        public b<T> e(g<T> gVar) {
            this.f12282e = (g) u.c(gVar, "Null factory");
            return this;
        }

        @SafeVarargs
        private b(Class<T> cls, Class<? super T>... clsArr) {
            HashSet hashSet = new HashSet();
            this.a = hashSet;
            this.f12279b = new HashSet();
            this.f12280c = 0;
            this.f12281d = 0;
            this.f12283f = new HashSet();
            u.c(cls, "Null interface");
            hashSet.add(cls);
            for (Class<? super T> cls2 : clsArr) {
                u.c(cls2, "Null interface");
            }
            Collections.addAll(this.a, clsArr);
        }
    }

    public static <T> b<T> a(Class<T> cls) {
        return new b<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> b<T> b(Class<T> cls, Class<? super T>... clsArr) {
        return new b<>(cls, clsArr);
    }

    public static <T> d<T> g(T t, Class<T> cls) {
        return h(cls).e(c.b(t)).c();
    }

    public static <T> b<T> h(Class<T> cls) {
        return a(cls).f();
    }

    static /* synthetic */ Object l(Object obj, e eVar) {
        return obj;
    }

    static /* synthetic */ Object m(Object obj, e eVar) {
        return obj;
    }

    @SafeVarargs
    public static <T> d<T> n(T t, Class<T> cls, Class<? super T>... clsArr) {
        return b(cls, clsArr).e(com.google.firebase.components.b.b(t)).c();
    }

    public Set<n> c() {
        return this.f12274b;
    }

    public g<T> d() {
        return this.f12277e;
    }

    public Set<Class<? super T>> e() {
        return this.a;
    }

    public Set<Class<?>> f() {
        return this.f12278f;
    }

    public boolean i() {
        return this.f12275c == 1;
    }

    public boolean j() {
        return this.f12275c == 2;
    }

    public boolean k() {
        return this.f12276d == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.a.toArray()) + ">{" + this.f12275c + ", type=" + this.f12276d + ", deps=" + Arrays.toString(this.f12274b.toArray()) + "}";
    }

    private d(Set<Class<? super T>> set, Set<n> set2, int i2, int i3, g<T> gVar, Set<Class<?>> set3) {
        this.a = Collections.unmodifiableSet(set);
        this.f12274b = Collections.unmodifiableSet(set2);
        this.f12275c = i2;
        this.f12276d = i3;
        this.f12277e = gVar;
        this.f12278f = Collections.unmodifiableSet(set3);
    }
}