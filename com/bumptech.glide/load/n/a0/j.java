package com.bumptech.glide.load.n.a0;

import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: LruArrayPool.java */
/* loaded from: classes.dex */
public final class j implements com.bumptech.glide.load.n.a0.b {
    private final h<a, Object> a = new h<>();

    /* renamed from: b, reason: collision with root package name */
    private final b f3656b = new b();

    /* renamed from: c, reason: collision with root package name */
    private final Map<Class<?>, NavigableMap<Integer, Integer>> f3657c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map<Class<?>, com.bumptech.glide.load.n.a0.a<?>> f3658d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final int f3659e;

    /* renamed from: f, reason: collision with root package name */
    private int f3660f;

    /* compiled from: LruArrayPool.java */
    private static final class a implements m {
        private final b a;

        /* renamed from: b, reason: collision with root package name */
        int f3661b;

        /* renamed from: c, reason: collision with root package name */
        private Class<?> f3662c;

        a(b bVar) {
            this.a = bVar;
        }

        @Override // com.bumptech.glide.load.n.a0.m
        public void a() {
            this.a.c(this);
        }

        void b(int i2, Class<?> cls) {
            this.f3661b = i2;
            this.f3662c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f3661b == aVar.f3661b && this.f3662c == aVar.f3662c;
        }

        public int hashCode() {
            int i2 = this.f3661b * 31;
            Class<?> cls = this.f3662c;
            return i2 + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f3661b + "array=" + this.f3662c + CoreConstants.CURLY_RIGHT;
        }
    }

    /* compiled from: LruArrayPool.java */
    private static final class b extends d<a> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.bumptech.glide.load.n.a0.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a(this);
        }

        a e(int i2, Class<?> cls) {
            a aVarB = b();
            aVarB.b(i2, cls);
            return aVarB;
        }
    }

    public j(int i2) {
        this.f3659e = i2;
    }

    private void f(int i2, Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMapM = m(cls);
        Integer num = (Integer) navigableMapM.get(Integer.valueOf(i2));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapM.remove(Integer.valueOf(i2));
                return;
            } else {
                navigableMapM.put(Integer.valueOf(i2), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i2 + ", this: " + this);
    }

    private void g() {
        h(this.f3659e);
    }

    private void h(int i2) {
        while (this.f3660f > i2) {
            Object objF = this.a.f();
            com.bumptech.glide.t.j.d(objF);
            com.bumptech.glide.load.n.a0.a aVarI = i(objF);
            this.f3660f -= aVarI.c(objF) * aVarI.a();
            f(aVarI.c(objF), objF.getClass());
            if (Log.isLoggable(aVarI.b(), 2)) {
                Log.v(aVarI.b(), "evicted: " + aVarI.c(objF));
            }
        }
    }

    private <T> com.bumptech.glide.load.n.a0.a<T> i(T t) {
        return j(t.getClass());
    }

    private <T> com.bumptech.glide.load.n.a0.a<T> j(Class<T> cls) {
        com.bumptech.glide.load.n.a0.a<T> gVar = (com.bumptech.glide.load.n.a0.a) this.f3658d.get(cls);
        if (gVar == null) {
            if (cls.equals(int[].class)) {
                gVar = new i();
            } else {
                if (!cls.equals(byte[].class)) {
                    throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
                }
                gVar = new g();
            }
            this.f3658d.put(cls, gVar);
        }
        return gVar;
    }

    private <T> T k(a aVar) {
        return (T) this.a.a(aVar);
    }

    private <T> T l(a aVar, Class<T> cls) {
        com.bumptech.glide.load.n.a0.a<T> aVarJ = j(cls);
        T t = (T) k(aVar);
        if (t != null) {
            this.f3660f -= aVarJ.c(t) * aVarJ.a();
            f(aVarJ.c(t), cls);
        }
        if (t != null) {
            return t;
        }
        if (Log.isLoggable(aVarJ.b(), 2)) {
            Log.v(aVarJ.b(), "Allocated " + aVar.f3661b + " bytes");
        }
        return aVarJ.newArray(aVar.f3661b);
    }

    private NavigableMap<Integer, Integer> m(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f3657c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f3657c.put(cls, treeMap);
        return treeMap;
    }

    private boolean n() {
        int i2 = this.f3660f;
        return i2 == 0 || this.f3659e / i2 >= 2;
    }

    private boolean o(int i2) {
        return i2 <= this.f3659e / 2;
    }

    private boolean p(int i2, Integer num) {
        return num != null && (n() || num.intValue() <= i2 * 8);
    }

    @Override // com.bumptech.glide.load.n.a0.b
    public synchronized void a(int i2) {
        try {
            if (i2 >= 40) {
                b();
            } else if (i2 >= 20 || i2 == 15) {
                h(this.f3659e / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.n.a0.b
    public synchronized void b() {
        h(0);
    }

    @Override // com.bumptech.glide.load.n.a0.b
    public synchronized <T> T c(int i2, Class<T> cls) {
        return (T) l(this.f3656b.e(i2, cls), cls);
    }

    @Override // com.bumptech.glide.load.n.a0.b
    public synchronized <T> void d(T t) {
        Class<?> cls = t.getClass();
        com.bumptech.glide.load.n.a0.a<T> aVarJ = j(cls);
        int iC = aVarJ.c(t);
        int iA = aVarJ.a() * iC;
        if (o(iA)) {
            a aVarE = this.f3656b.e(iC, cls);
            this.a.d(aVarE, t);
            NavigableMap<Integer, Integer> navigableMapM = m(cls);
            Integer num = (Integer) navigableMapM.get(Integer.valueOf(aVarE.f3661b));
            Integer numValueOf = Integer.valueOf(aVarE.f3661b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapM.put(numValueOf, Integer.valueOf(iIntValue));
            this.f3660f += iA;
            g();
        }
    }

    @Override // com.bumptech.glide.load.n.a0.b
    public synchronized <T> T e(int i2, Class<T> cls) {
        Integer numCeilingKey;
        numCeilingKey = m(cls).ceilingKey(Integer.valueOf(i2));
        return (T) l(p(i2, numCeilingKey) ? this.f3656b.e(numCeilingKey.intValue(), cls) : this.f3656b.e(i2, cls), cls);
    }
}