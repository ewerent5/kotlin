package com.bumptech.glide.load.o;

import ch.qos.logback.core.CoreConstants;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.o.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: MultiModelLoader.java */
/* loaded from: classes.dex */
class q<Model, Data> implements n<Model, Data> {
    private final List<n<Model, Data>> a;

    /* renamed from: b, reason: collision with root package name */
    private final c.h.k.e<List<Throwable>> f3911b;

    /* compiled from: MultiModelLoader.java */
    static class a<Data> implements com.bumptech.glide.load.data.d<Data>, d.a<Data> {

        /* renamed from: e, reason: collision with root package name */
        private final List<com.bumptech.glide.load.data.d<Data>> f3912e;

        /* renamed from: f, reason: collision with root package name */
        private final c.h.k.e<List<Throwable>> f3913f;

        /* renamed from: g, reason: collision with root package name */
        private int f3914g;

        /* renamed from: h, reason: collision with root package name */
        private com.bumptech.glide.g f3915h;

        /* renamed from: i, reason: collision with root package name */
        private d.a<? super Data> f3916i;

        /* renamed from: j, reason: collision with root package name */
        private List<Throwable> f3917j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f3918k;

        a(List<com.bumptech.glide.load.data.d<Data>> list, c.h.k.e<List<Throwable>> eVar) {
            this.f3913f = eVar;
            com.bumptech.glide.t.j.c(list);
            this.f3912e = list;
            this.f3914g = 0;
        }

        private void g() {
            if (this.f3918k) {
                return;
            }
            if (this.f3914g < this.f3912e.size() - 1) {
                this.f3914g++;
                e(this.f3915h, this.f3916i);
            } else {
                com.bumptech.glide.t.j.d(this.f3917j);
                this.f3916i.c(new com.bumptech.glide.load.n.q("Fetch failed", new ArrayList(this.f3917j)));
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<Data> a() {
            return this.f3912e.get(0).a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            List<Throwable> list = this.f3917j;
            if (list != null) {
                this.f3913f.a(list);
            }
            this.f3917j = null;
            Iterator<com.bumptech.glide.load.data.d<Data>> it = this.f3912e.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void c(Exception exc) {
            ((List) com.bumptech.glide.t.j.d(this.f3917j)).add(exc);
            g();
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f3918k = true;
            Iterator<com.bumptech.glide.load.data.d<Data>> it = this.f3912e.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public com.bumptech.glide.load.a d() {
            return this.f3912e.get(0).d();
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a<? super Data> aVar) {
            this.f3915h = gVar;
            this.f3916i = aVar;
            this.f3917j = this.f3913f.b();
            this.f3912e.get(this.f3914g).e(gVar, this);
            if (this.f3918k) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void f(Data data) {
            if (data != null) {
                this.f3916i.f(data);
            } else {
                g();
            }
        }
    }

    q(List<n<Model, Data>> list, c.h.k.e<List<Throwable>> eVar) {
        this.a = list;
        this.f3911b = eVar;
    }

    @Override // com.bumptech.glide.load.o.n
    public boolean a(Model model) {
        Iterator<n<Model, Data>> it = this.a.iterator();
        while (it.hasNext()) {
            if (it.next().a(model)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.load.o.n
    public n.a<Data> b(Model model, int i2, int i3, com.bumptech.glide.load.i iVar) {
        n.a<Data> aVarB;
        int size = this.a.size();
        ArrayList arrayList = new ArrayList(size);
        com.bumptech.glide.load.g gVar = null;
        for (int i4 = 0; i4 < size; i4++) {
            n<Model, Data> nVar = this.a.get(i4);
            if (nVar.a(model) && (aVarB = nVar.b(model, i2, i3, iVar)) != null) {
                gVar = aVarB.a;
                arrayList.add(aVarB.f3909c);
            }
        }
        if (arrayList.isEmpty() || gVar == null) {
            return null;
        }
        return new n.a<>(gVar, new a(arrayList, this.f3911b));
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.a.toArray()) + CoreConstants.CURLY_RIGHT;
    }
}