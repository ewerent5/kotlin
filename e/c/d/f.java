package e.c.d;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: Gson.java */
/* loaded from: classes.dex */
public final class f {
    private static final e.c.d.z.a<?> a = e.c.d.z.a.a(Object.class);

    /* renamed from: b, reason: collision with root package name */
    private final ThreadLocal<Map<e.c.d.z.a<?>, C0188f<?>>> f15425b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<e.c.d.z.a<?>, v<?>> f15426c;

    /* renamed from: d, reason: collision with root package name */
    private final e.c.d.y.c f15427d;

    /* renamed from: e, reason: collision with root package name */
    private final e.c.d.y.n.d f15428e;

    /* renamed from: f, reason: collision with root package name */
    final List<w> f15429f;

    /* renamed from: g, reason: collision with root package name */
    final e.c.d.y.d f15430g;

    /* renamed from: h, reason: collision with root package name */
    final e.c.d.e f15431h;

    /* renamed from: i, reason: collision with root package name */
    final Map<Type, h<?>> f15432i;

    /* renamed from: j, reason: collision with root package name */
    final boolean f15433j;

    /* renamed from: k, reason: collision with root package name */
    final boolean f15434k;

    /* renamed from: l, reason: collision with root package name */
    final boolean f15435l;

    /* renamed from: m, reason: collision with root package name */
    final boolean f15436m;
    final boolean n;
    final boolean o;
    final boolean p;
    final String q;
    final int r;
    final int s;
    final u t;
    final List<w> u;
    final List<w> v;

    /* compiled from: Gson.java */
    class a extends v<Number> {
        a() {
        }

        @Override // e.c.d.v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Double b(e.c.d.a0.a aVar) throws IOException {
            if (aVar.k0() != e.c.d.a0.b.NULL) {
                return Double.valueOf(aVar.K());
            }
            aVar.a0();
            return null;
        }

        @Override // e.c.d.v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(e.c.d.a0.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.C();
            } else {
                f.d(number.doubleValue());
                cVar.h0(number);
            }
        }
    }

    /* compiled from: Gson.java */
    class b extends v<Number> {
        b() {
        }

        @Override // e.c.d.v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Float b(e.c.d.a0.a aVar) throws IOException {
            if (aVar.k0() != e.c.d.a0.b.NULL) {
                return Float.valueOf((float) aVar.K());
            }
            aVar.a0();
            return null;
        }

        @Override // e.c.d.v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(e.c.d.a0.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.C();
            } else {
                f.d(number.floatValue());
                cVar.h0(number);
            }
        }
    }

    /* compiled from: Gson.java */
    class c extends v<Number> {
        c() {
        }

        @Override // e.c.d.v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(e.c.d.a0.a aVar) throws IOException {
            if (aVar.k0() != e.c.d.a0.b.NULL) {
                return Long.valueOf(aVar.T());
            }
            aVar.a0();
            return null;
        }

        @Override // e.c.d.v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(e.c.d.a0.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.C();
            } else {
                cVar.j0(number.toString());
            }
        }
    }

    /* compiled from: Gson.java */
    class d extends v<AtomicLong> {
        final /* synthetic */ v a;

        d(v vVar) {
            this.a = vVar;
        }

        @Override // e.c.d.v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicLong b(e.c.d.a0.a aVar) {
            return new AtomicLong(((Number) this.a.b(aVar)).longValue());
        }

        @Override // e.c.d.v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(e.c.d.a0.c cVar, AtomicLong atomicLong) {
            this.a.d(cVar, Long.valueOf(atomicLong.get()));
        }
    }

    /* compiled from: Gson.java */
    class e extends v<AtomicLongArray> {
        final /* synthetic */ v a;

        e(v vVar) {
            this.a = vVar;
        }

        @Override // e.c.d.v
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicLongArray b(e.c.d.a0.a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.b();
            while (aVar.v()) {
                arrayList.add(Long.valueOf(((Number) this.a.b(aVar)).longValue()));
            }
            aVar.j();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i2 = 0; i2 < size; i2++) {
                atomicLongArray.set(i2, ((Long) arrayList.get(i2)).longValue());
            }
            return atomicLongArray;
        }

        @Override // e.c.d.v
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(e.c.d.a0.c cVar, AtomicLongArray atomicLongArray) throws IOException {
            cVar.d();
            int length = atomicLongArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                this.a.d(cVar, Long.valueOf(atomicLongArray.get(i2)));
            }
            cVar.j();
        }
    }

    /* compiled from: Gson.java */
    /* renamed from: e.c.d.f$f, reason: collision with other inner class name */
    static class C0188f<T> extends v<T> {
        private v<T> a;

        C0188f() {
        }

        @Override // e.c.d.v
        public T b(e.c.d.a0.a aVar) {
            v<T> vVar = this.a;
            if (vVar != null) {
                return vVar.b(aVar);
            }
            throw new IllegalStateException();
        }

        @Override // e.c.d.v
        public void d(e.c.d.a0.c cVar, T t) {
            v<T> vVar = this.a;
            if (vVar == null) {
                throw new IllegalStateException();
            }
            vVar.d(cVar, t);
        }

        public void e(v<T> vVar) {
            if (this.a != null) {
                throw new AssertionError();
            }
            this.a = vVar;
        }
    }

    public f() {
        this(e.c.d.y.d.f15469e, e.c.d.d.f15418e, Collections.emptyMap(), false, false, false, true, false, false, false, u.f15450e, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    private static void a(Object obj, e.c.d.a0.a aVar) {
        if (obj != null) {
            try {
                if (aVar.k0() == e.c.d.a0.b.END_DOCUMENT) {
                } else {
                    throw new m("JSON document was not fully consumed.");
                }
            } catch (e.c.d.a0.d e2) {
                throw new t(e2);
            } catch (IOException e3) {
                throw new m(e3);
            }
        }
    }

    private static v<AtomicLong> b(v<Number> vVar) {
        return new d(vVar).a();
    }

    private static v<AtomicLongArray> c(v<Number> vVar) {
        return new e(vVar).a();
    }

    static void d(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            throw new IllegalArgumentException(d2 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    private v<Number> e(boolean z) {
        return z ? e.c.d.y.n.n.v : new a();
    }

    private v<Number> f(boolean z) {
        return z ? e.c.d.y.n.n.u : new b();
    }

    private static v<Number> o(u uVar) {
        return uVar == u.f15450e ? e.c.d.y.n.n.t : new c();
    }

    public <T> T g(l lVar, Type type) {
        if (lVar == null) {
            return null;
        }
        return (T) h(new e.c.d.y.n.e(lVar), type);
    }

    public <T> T h(e.c.d.a0.a aVar, Type type) {
        boolean zA = aVar.A();
        boolean z = true;
        aVar.y0(true);
        try {
            try {
                try {
                    aVar.k0();
                    z = false;
                    T tB = l(e.c.d.z.a.b(type)).b(aVar);
                    aVar.y0(zA);
                    return tB;
                } catch (EOFException e2) {
                    if (!z) {
                        throw new t(e2);
                    }
                    aVar.y0(zA);
                    return null;
                } catch (IOException e3) {
                    throw new t(e3);
                }
            } catch (AssertionError e4) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e4.getMessage());
                assertionError.initCause(e4);
                throw assertionError;
            } catch (IllegalStateException e5) {
                throw new t(e5);
            }
        } catch (Throwable th) {
            aVar.y0(zA);
            throw th;
        }
    }

    public <T> T i(Reader reader, Type type) {
        e.c.d.a0.a aVarP = p(reader);
        T t = (T) h(aVarP, type);
        a(t, aVarP);
        return t;
    }

    public <T> T j(String str, Class<T> cls) {
        return (T) e.c.d.y.k.b(cls).cast(k(str, cls));
    }

    public <T> T k(String str, Type type) {
        if (str == null) {
            return null;
        }
        return (T) i(new StringReader(str), type);
    }

    public <T> v<T> l(e.c.d.z.a<T> aVar) {
        v<T> vVar = (v) this.f15426c.get(aVar == null ? a : aVar);
        if (vVar != null) {
            return vVar;
        }
        Map<e.c.d.z.a<?>, C0188f<?>> map = this.f15425b.get();
        boolean z = false;
        if (map == null) {
            map = new HashMap<>();
            this.f15425b.set(map);
            z = true;
        }
        C0188f<?> c0188f = map.get(aVar);
        if (c0188f != null) {
            return c0188f;
        }
        try {
            C0188f<?> c0188f2 = new C0188f<>();
            map.put(aVar, c0188f2);
            Iterator<w> it = this.f15429f.iterator();
            while (it.hasNext()) {
                v<T> vVarA = it.next().a(this, aVar);
                if (vVarA != null) {
                    c0188f2.e(vVarA);
                    this.f15426c.put(aVar, vVarA);
                    return vVarA;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.6) cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z) {
                this.f15425b.remove();
            }
        }
    }

    public <T> v<T> m(Class<T> cls) {
        return l(e.c.d.z.a.a(cls));
    }

    public <T> v<T> n(w wVar, e.c.d.z.a<T> aVar) {
        if (!this.f15429f.contains(wVar)) {
            wVar = this.f15428e;
        }
        boolean z = false;
        for (w wVar2 : this.f15429f) {
            if (z) {
                v<T> vVarA = wVar2.a(this, aVar);
                if (vVarA != null) {
                    return vVarA;
                }
            } else if (wVar2 == wVar) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public e.c.d.a0.a p(Reader reader) {
        e.c.d.a0.a aVar = new e.c.d.a0.a(reader);
        aVar.y0(this.o);
        return aVar;
    }

    public String toString() {
        return "{serializeNulls:" + this.f15433j + ",factories:" + this.f15429f + ",instanceCreators:" + this.f15427d + "}";
    }

    f(e.c.d.y.d dVar, e.c.d.e eVar, Map<Type, h<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, u uVar, String str, int i2, int i3, List<w> list, List<w> list2, List<w> list3) {
        this.f15425b = new ThreadLocal<>();
        this.f15426c = new ConcurrentHashMap();
        this.f15430g = dVar;
        this.f15431h = eVar;
        this.f15432i = map;
        e.c.d.y.c cVar = new e.c.d.y.c(map);
        this.f15427d = cVar;
        this.f15433j = z;
        this.f15434k = z2;
        this.f15435l = z3;
        this.f15436m = z4;
        this.n = z5;
        this.o = z6;
        this.p = z7;
        this.t = uVar;
        this.q = str;
        this.r = i2;
        this.s = i3;
        this.u = list;
        this.v = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(e.c.d.y.n.n.Y);
        arrayList.add(e.c.d.y.n.h.a);
        arrayList.add(dVar);
        arrayList.addAll(list3);
        arrayList.add(e.c.d.y.n.n.D);
        arrayList.add(e.c.d.y.n.n.f15561m);
        arrayList.add(e.c.d.y.n.n.f15555g);
        arrayList.add(e.c.d.y.n.n.f15557i);
        arrayList.add(e.c.d.y.n.n.f15559k);
        v<Number> vVarO = o(uVar);
        arrayList.add(e.c.d.y.n.n.c(Long.TYPE, Long.class, vVarO));
        arrayList.add(e.c.d.y.n.n.c(Double.TYPE, Double.class, e(z7)));
        arrayList.add(e.c.d.y.n.n.c(Float.TYPE, Float.class, f(z7)));
        arrayList.add(e.c.d.y.n.n.x);
        arrayList.add(e.c.d.y.n.n.o);
        arrayList.add(e.c.d.y.n.n.q);
        arrayList.add(e.c.d.y.n.n.b(AtomicLong.class, b(vVarO)));
        arrayList.add(e.c.d.y.n.n.b(AtomicLongArray.class, c(vVarO)));
        arrayList.add(e.c.d.y.n.n.s);
        arrayList.add(e.c.d.y.n.n.z);
        arrayList.add(e.c.d.y.n.n.F);
        arrayList.add(e.c.d.y.n.n.H);
        arrayList.add(e.c.d.y.n.n.b(BigDecimal.class, e.c.d.y.n.n.B));
        arrayList.add(e.c.d.y.n.n.b(BigInteger.class, e.c.d.y.n.n.C));
        arrayList.add(e.c.d.y.n.n.J);
        arrayList.add(e.c.d.y.n.n.L);
        arrayList.add(e.c.d.y.n.n.P);
        arrayList.add(e.c.d.y.n.n.R);
        arrayList.add(e.c.d.y.n.n.W);
        arrayList.add(e.c.d.y.n.n.N);
        arrayList.add(e.c.d.y.n.n.f15552d);
        arrayList.add(e.c.d.y.n.c.a);
        arrayList.add(e.c.d.y.n.n.U);
        arrayList.add(e.c.d.y.n.k.a);
        arrayList.add(e.c.d.y.n.j.a);
        arrayList.add(e.c.d.y.n.n.S);
        arrayList.add(e.c.d.y.n.a.a);
        arrayList.add(e.c.d.y.n.n.f15550b);
        arrayList.add(new e.c.d.y.n.b(cVar));
        arrayList.add(new e.c.d.y.n.g(cVar, z2));
        e.c.d.y.n.d dVar2 = new e.c.d.y.n.d(cVar);
        this.f15428e = dVar2;
        arrayList.add(dVar2);
        arrayList.add(e.c.d.y.n.n.Z);
        arrayList.add(new e.c.d.y.n.i(cVar, eVar, dVar, dVar2));
        this.f15429f = Collections.unmodifiableList(arrayList);
    }
}