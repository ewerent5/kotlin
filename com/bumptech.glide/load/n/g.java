package com.bumptech.glide.load.n;

import com.bumptech.glide.load.n.h;
import com.bumptech.glide.load.o.n;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: DecodeHelper.java */
/* loaded from: classes.dex */
final class g<Transcode> {
    private final List<n.a<?>> a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List<com.bumptech.glide.load.g> f3733b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private com.bumptech.glide.d f3734c;

    /* renamed from: d, reason: collision with root package name */
    private Object f3735d;

    /* renamed from: e, reason: collision with root package name */
    private int f3736e;

    /* renamed from: f, reason: collision with root package name */
    private int f3737f;

    /* renamed from: g, reason: collision with root package name */
    private Class<?> f3738g;

    /* renamed from: h, reason: collision with root package name */
    private h.e f3739h;

    /* renamed from: i, reason: collision with root package name */
    private com.bumptech.glide.load.i f3740i;

    /* renamed from: j, reason: collision with root package name */
    private Map<Class<?>, com.bumptech.glide.load.m<?>> f3741j;

    /* renamed from: k, reason: collision with root package name */
    private Class<Transcode> f3742k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f3743l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f3744m;
    private com.bumptech.glide.load.g n;
    private com.bumptech.glide.g o;
    private j p;
    private boolean q;
    private boolean r;

    g() {
    }

    void a() {
        this.f3734c = null;
        this.f3735d = null;
        this.n = null;
        this.f3738g = null;
        this.f3742k = null;
        this.f3740i = null;
        this.o = null;
        this.f3741j = null;
        this.p = null;
        this.a.clear();
        this.f3743l = false;
        this.f3733b.clear();
        this.f3744m = false;
    }

    com.bumptech.glide.load.n.a0.b b() {
        return this.f3734c.b();
    }

    List<com.bumptech.glide.load.g> c() {
        if (!this.f3744m) {
            this.f3744m = true;
            this.f3733b.clear();
            List<n.a<?>> listG = g();
            int size = listG.size();
            for (int i2 = 0; i2 < size; i2++) {
                n.a<?> aVar = listG.get(i2);
                if (!this.f3733b.contains(aVar.a)) {
                    this.f3733b.add(aVar.a);
                }
                for (int i3 = 0; i3 < aVar.f3908b.size(); i3++) {
                    if (!this.f3733b.contains(aVar.f3908b.get(i3))) {
                        this.f3733b.add(aVar.f3908b.get(i3));
                    }
                }
            }
        }
        return this.f3733b;
    }

    com.bumptech.glide.load.n.b0.a d() {
        return this.f3739h.a();
    }

    j e() {
        return this.p;
    }

    int f() {
        return this.f3737f;
    }

    List<n.a<?>> g() {
        if (!this.f3743l) {
            this.f3743l = true;
            this.a.clear();
            List listI = this.f3734c.i().i(this.f3735d);
            int size = listI.size();
            for (int i2 = 0; i2 < size; i2++) {
                n.a<?> aVarB = ((com.bumptech.glide.load.o.n) listI.get(i2)).b(this.f3735d, this.f3736e, this.f3737f, this.f3740i);
                if (aVarB != null) {
                    this.a.add(aVarB);
                }
            }
        }
        return this.a;
    }

    <Data> t<Data, ?, Transcode> h(Class<Data> cls) {
        return this.f3734c.i().h(cls, this.f3738g, this.f3742k);
    }

    Class<?> i() {
        return this.f3735d.getClass();
    }

    List<com.bumptech.glide.load.o.n<File, ?>> j(File file) {
        return this.f3734c.i().i(file);
    }

    com.bumptech.glide.load.i k() {
        return this.f3740i;
    }

    com.bumptech.glide.g l() {
        return this.o;
    }

    List<Class<?>> m() {
        return this.f3734c.i().j(this.f3735d.getClass(), this.f3738g, this.f3742k);
    }

    <Z> com.bumptech.glide.load.l<Z> n(v<Z> vVar) {
        return this.f3734c.i().k(vVar);
    }

    com.bumptech.glide.load.g o() {
        return this.n;
    }

    <X> com.bumptech.glide.load.d<X> p(X x) {
        return this.f3734c.i().m(x);
    }

    Class<?> q() {
        return this.f3742k;
    }

    <Z> com.bumptech.glide.load.m<Z> r(Class<Z> cls) {
        com.bumptech.glide.load.m<Z> mVar = (com.bumptech.glide.load.m) this.f3741j.get(cls);
        if (mVar == null) {
            Iterator<Map.Entry<Class<?>, com.bumptech.glide.load.m<?>>> it = this.f3741j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Class<?>, com.bumptech.glide.load.m<?>> next = it.next();
                if (next.getKey().isAssignableFrom(cls)) {
                    mVar = (com.bumptech.glide.load.m) next.getValue();
                    break;
                }
            }
        }
        if (mVar != null) {
            return mVar;
        }
        if (!this.f3741j.isEmpty() || !this.q) {
            return com.bumptech.glide.load.p.c.c();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    int s() {
        return this.f3736e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    boolean t(Class<?> cls) {
        return h(cls) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    <R> void u(com.bumptech.glide.d dVar, Object obj, com.bumptech.glide.load.g gVar, int i2, int i3, j jVar, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar2, com.bumptech.glide.load.i iVar, Map<Class<?>, com.bumptech.glide.load.m<?>> map, boolean z, boolean z2, h.e eVar) {
        this.f3734c = dVar;
        this.f3735d = obj;
        this.n = gVar;
        this.f3736e = i2;
        this.f3737f = i3;
        this.p = jVar;
        this.f3738g = cls;
        this.f3739h = eVar;
        this.f3742k = cls2;
        this.o = gVar2;
        this.f3740i = iVar;
        this.f3741j = map;
        this.q = z;
        this.r = z2;
    }

    boolean v(v<?> vVar) {
        return this.f3734c.i().n(vVar);
    }

    boolean w() {
        return this.r;
    }

    boolean x(com.bumptech.glide.load.g gVar) {
        List<n.a<?>> listG = g();
        int size = listG.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (listG.get(i2).a.equals(gVar)) {
                return true;
            }
        }
        return false;
    }
}