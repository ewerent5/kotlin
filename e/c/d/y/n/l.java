package e.c.d.y.n;

import e.c.d.r;
import e.c.d.s;
import e.c.d.v;
import e.c.d.w;
import java.io.IOException;
import java.lang.reflect.Type;

/* compiled from: TreeTypeAdapter.java */
/* loaded from: classes.dex */
public final class l<T> extends v<T> {
    private final s<T> a;

    /* renamed from: b, reason: collision with root package name */
    private final e.c.d.k<T> f15537b;

    /* renamed from: c, reason: collision with root package name */
    final e.c.d.f f15538c;

    /* renamed from: d, reason: collision with root package name */
    private final e.c.d.z.a<T> f15539d;

    /* renamed from: e, reason: collision with root package name */
    private final w f15540e;

    /* renamed from: f, reason: collision with root package name */
    private final l<T>.b f15541f = new b();

    /* renamed from: g, reason: collision with root package name */
    private v<T> f15542g;

    /* compiled from: TreeTypeAdapter.java */
    private final class b implements r, e.c.d.j {
        private b() {
        }

        @Override // e.c.d.j
        public <R> R a(e.c.d.l lVar, Type type) {
            return (R) l.this.f15538c.g(lVar, type);
        }
    }

    /* compiled from: TreeTypeAdapter.java */
    private static final class c implements w {

        /* renamed from: e, reason: collision with root package name */
        private final e.c.d.z.a<?> f15543e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f15544f;

        /* renamed from: g, reason: collision with root package name */
        private final Class<?> f15545g;

        /* renamed from: h, reason: collision with root package name */
        private final s<?> f15546h;

        /* renamed from: i, reason: collision with root package name */
        private final e.c.d.k<?> f15547i;

        c(Object obj, e.c.d.z.a<?> aVar, boolean z, Class<?> cls) {
            s<?> sVar = obj instanceof s ? (s) obj : null;
            this.f15546h = sVar;
            e.c.d.k<?> kVar = obj instanceof e.c.d.k ? (e.c.d.k) obj : null;
            this.f15547i = kVar;
            e.c.d.y.a.a((sVar == null && kVar == null) ? false : true);
            this.f15543e = aVar;
            this.f15544f = z;
            this.f15545g = cls;
        }

        @Override // e.c.d.w
        public <T> v<T> a(e.c.d.f fVar, e.c.d.z.a<T> aVar) {
            e.c.d.z.a<?> aVar2 = this.f15543e;
            if (aVar2 != null ? aVar2.equals(aVar) || (this.f15544f && this.f15543e.e() == aVar.c()) : this.f15545g.isAssignableFrom(aVar.c())) {
                return new l(this.f15546h, this.f15547i, fVar, aVar, this);
            }
            return null;
        }
    }

    public l(s<T> sVar, e.c.d.k<T> kVar, e.c.d.f fVar, e.c.d.z.a<T> aVar, w wVar) {
        this.a = sVar;
        this.f15537b = kVar;
        this.f15538c = fVar;
        this.f15539d = aVar;
        this.f15540e = wVar;
    }

    private v<T> e() {
        v<T> vVar = this.f15542g;
        if (vVar != null) {
            return vVar;
        }
        v<T> vVarN = this.f15538c.n(this.f15540e, this.f15539d);
        this.f15542g = vVarN;
        return vVarN;
    }

    public static w f(e.c.d.z.a<?> aVar, Object obj) {
        return new c(obj, aVar, aVar.e() == aVar.c(), null);
    }

    @Override // e.c.d.v
    public T b(e.c.d.a0.a aVar) {
        if (this.f15537b == null) {
            return e().b(aVar);
        }
        e.c.d.l lVarA = e.c.d.y.l.a(aVar);
        if (lVarA.k()) {
            return null;
        }
        return this.f15537b.a(lVarA, this.f15539d.e(), this.f15541f);
    }

    @Override // e.c.d.v
    public void d(e.c.d.a0.c cVar, T t) throws IOException {
        s<T> sVar = this.a;
        if (sVar == null) {
            e().d(cVar, t);
        } else if (t == null) {
            cVar.C();
        } else {
            e.c.d.y.l.b(sVar.a(t, this.f15539d.e(), this.f15541f), cVar);
        }
    }
}