package com.bumptech.glide;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.n.t;
import com.bumptech.glide.load.n.v;
import com.bumptech.glide.load.o.n;
import com.bumptech.glide.load.o.o;
import com.bumptech.glide.load.o.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: Registry.java */
/* loaded from: classes.dex */
public class i {
    private final p a;

    /* renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.q.a f3554b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.q.e f3555c;

    /* renamed from: d, reason: collision with root package name */
    private final com.bumptech.glide.q.f f3556d;

    /* renamed from: e, reason: collision with root package name */
    private final com.bumptech.glide.load.data.f f3557e;

    /* renamed from: f, reason: collision with root package name */
    private final com.bumptech.glide.load.p.i.f f3558f;

    /* renamed from: g, reason: collision with root package name */
    private final com.bumptech.glide.q.b f3559g;

    /* renamed from: h, reason: collision with root package name */
    private final com.bumptech.glide.q.d f3560h = new com.bumptech.glide.q.d();

    /* renamed from: i, reason: collision with root package name */
    private final com.bumptech.glide.q.c f3561i = new com.bumptech.glide.q.c();

    /* renamed from: j, reason: collision with root package name */
    private final c.h.k.e<List<Throwable>> f3562j;

    /* compiled from: Registry.java */
    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    /* compiled from: Registry.java */
    public static final class b extends a {
        public b() {
            super("Failed to find image header parser.");
        }
    }

    /* compiled from: Registry.java */
    public static class c extends a {
        public c(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public <M> c(M m2, List<n<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m2);
        }

        public c(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    /* compiled from: Registry.java */
    public static class d extends a {
        public d(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    /* compiled from: Registry.java */
    public static class e extends a {
        public e(Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public i() {
        c.h.k.e<List<Throwable>> eVarE = com.bumptech.glide.t.l.a.e();
        this.f3562j = eVarE;
        this.a = new p(eVarE);
        this.f3554b = new com.bumptech.glide.q.a();
        this.f3555c = new com.bumptech.glide.q.e();
        this.f3556d = new com.bumptech.glide.q.f();
        this.f3557e = new com.bumptech.glide.load.data.f();
        this.f3558f = new com.bumptech.glide.load.p.i.f();
        this.f3559g = new com.bumptech.glide.q.b();
        r(Arrays.asList("Gif", "Bitmap", "BitmapDrawable"));
    }

    private <Data, TResource, Transcode> List<com.bumptech.glide.load.n.i<Data, TResource, Transcode>> f(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f3555c.d(cls, cls2)) {
            for (Class cls5 : this.f3558f.b(cls4, cls3)) {
                arrayList.add(new com.bumptech.glide.load.n.i(cls, cls4, cls5, this.f3555c.b(cls, cls4), this.f3558f.a(cls4, cls5), this.f3562j));
            }
        }
        return arrayList;
    }

    public <Data> i a(Class<Data> cls, com.bumptech.glide.load.d<Data> dVar) {
        this.f3554b.a(cls, dVar);
        return this;
    }

    public <TResource> i b(Class<TResource> cls, com.bumptech.glide.load.l<TResource> lVar) {
        this.f3556d.a(cls, lVar);
        return this;
    }

    public <Data, TResource> i c(Class<Data> cls, Class<TResource> cls2, com.bumptech.glide.load.k<Data, TResource> kVar) {
        e("legacy_append", cls, cls2, kVar);
        return this;
    }

    public <Model, Data> i d(Class<Model> cls, Class<Data> cls2, o<Model, Data> oVar) {
        this.a.a(cls, cls2, oVar);
        return this;
    }

    public <Data, TResource> i e(String str, Class<Data> cls, Class<TResource> cls2, com.bumptech.glide.load.k<Data, TResource> kVar) {
        this.f3555c.a(str, kVar, cls, cls2);
        return this;
    }

    public List<ImageHeaderParser> g() {
        List<ImageHeaderParser> listB = this.f3559g.b();
        if (listB.isEmpty()) {
            throw new b();
        }
        return listB;
    }

    public <Data, TResource, Transcode> t<Data, TResource, Transcode> h(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        t<Data, TResource, Transcode> tVarA = this.f3561i.a(cls, cls2, cls3);
        if (this.f3561i.c(tVarA)) {
            return null;
        }
        if (tVarA == null) {
            List<com.bumptech.glide.load.n.i<Data, TResource, Transcode>> listF = f(cls, cls2, cls3);
            tVarA = listF.isEmpty() ? null : new t<>(cls, cls2, cls3, listF, this.f3562j);
            this.f3561i.d(cls, cls2, cls3, tVarA);
        }
        return tVarA;
    }

    public <Model> List<n<Model, ?>> i(Model model) {
        return this.a.d(model);
    }

    public <Model, TResource, Transcode> List<Class<?>> j(Class<Model> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        List<Class<?>> listA = this.f3560h.a(cls, cls2, cls3);
        if (listA == null) {
            listA = new ArrayList<>();
            Iterator<Class<?>> it = this.a.c(cls).iterator();
            while (it.hasNext()) {
                for (Class<?> cls4 : this.f3555c.d(it.next(), cls2)) {
                    if (!this.f3558f.b(cls4, cls3).isEmpty() && !listA.contains(cls4)) {
                        listA.add(cls4);
                    }
                }
            }
            this.f3560h.b(cls, cls2, cls3, Collections.unmodifiableList(listA));
        }
        return listA;
    }

    public <X> com.bumptech.glide.load.l<X> k(v<X> vVar) {
        com.bumptech.glide.load.l<X> lVarB = this.f3556d.b(vVar.d());
        if (lVarB != null) {
            return lVarB;
        }
        throw new d(vVar.d());
    }

    public <X> com.bumptech.glide.load.data.e<X> l(X x) {
        return this.f3557e.a(x);
    }

    public <X> com.bumptech.glide.load.d<X> m(X x) {
        com.bumptech.glide.load.d<X> dVarB = this.f3554b.b(x.getClass());
        if (dVarB != null) {
            return dVarB;
        }
        throw new e(x.getClass());
    }

    public boolean n(v<?> vVar) {
        return this.f3556d.b(vVar.d()) != null;
    }

    public i o(ImageHeaderParser imageHeaderParser) {
        this.f3559g.a(imageHeaderParser);
        return this;
    }

    public i p(e.a<?> aVar) {
        this.f3557e.b(aVar);
        return this;
    }

    public <TResource, Transcode> i q(Class<TResource> cls, Class<Transcode> cls2, com.bumptech.glide.load.p.i.e<TResource, Transcode> eVar) {
        this.f3558f.c(cls, cls2, eVar);
        return this;
    }

    public final i r(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add("legacy_prepend_all");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        arrayList.add("legacy_append");
        this.f3555c.e(arrayList);
        return this;
    }
}