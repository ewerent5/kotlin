package com.bumptech.glide.load.n;

import android.util.Log;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.n.f;
import com.bumptech.glide.load.o.n;
import java.util.Collections;
import java.util.List;

/* compiled from: SourceGenerator.java */
/* loaded from: classes.dex */
class z implements f, f.a {

    /* renamed from: e, reason: collision with root package name */
    private final g<?> f3867e;

    /* renamed from: f, reason: collision with root package name */
    private final f.a f3868f;

    /* renamed from: g, reason: collision with root package name */
    private int f3869g;

    /* renamed from: h, reason: collision with root package name */
    private c f3870h;

    /* renamed from: i, reason: collision with root package name */
    private Object f3871i;

    /* renamed from: j, reason: collision with root package name */
    private volatile n.a<?> f3872j;

    /* renamed from: k, reason: collision with root package name */
    private d f3873k;

    /* compiled from: SourceGenerator.java */
    class a implements d.a<Object> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ n.a f3874e;

        a(n.a aVar) {
            this.f3874e = aVar;
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void c(Exception exc) {
            if (z.this.g(this.f3874e)) {
                z.this.i(this.f3874e, exc);
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void f(Object obj) {
            if (z.this.g(this.f3874e)) {
                z.this.h(this.f3874e, obj);
            }
        }
    }

    z(g<?> gVar, f.a aVar) {
        this.f3867e = gVar;
        this.f3868f = aVar;
    }

    private void e(Object obj) {
        long jB = com.bumptech.glide.t.f.b();
        try {
            com.bumptech.glide.load.d<X> dVarP = this.f3867e.p(obj);
            e eVar = new e(dVarP, obj, this.f3867e.k());
            this.f3873k = new d(this.f3872j.a, this.f3867e.o());
            this.f3867e.d().a(this.f3873k, eVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + this.f3873k + ", data: " + obj + ", encoder: " + dVarP + ", duration: " + com.bumptech.glide.t.f.a(jB));
            }
            this.f3872j.f3909c.b();
            this.f3870h = new c(Collections.singletonList(this.f3872j.a), this.f3867e, this);
        } catch (Throwable th) {
            this.f3872j.f3909c.b();
            throw th;
        }
    }

    private boolean f() {
        return this.f3869g < this.f3867e.g().size();
    }

    private void j(n.a<?> aVar) {
        this.f3872j.f3909c.e(this.f3867e.l(), new a(aVar));
    }

    @Override // com.bumptech.glide.load.n.f.a
    public void a(com.bumptech.glide.load.g gVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, com.bumptech.glide.load.a aVar) {
        this.f3868f.a(gVar, exc, dVar, this.f3872j.f3909c.d());
    }

    @Override // com.bumptech.glide.load.n.f
    public boolean b() {
        Object obj = this.f3871i;
        if (obj != null) {
            this.f3871i = null;
            e(obj);
        }
        c cVar = this.f3870h;
        if (cVar != null && cVar.b()) {
            return true;
        }
        this.f3870h = null;
        this.f3872j = null;
        boolean z = false;
        while (!z && f()) {
            List<n.a<?>> listG = this.f3867e.g();
            int i2 = this.f3869g;
            this.f3869g = i2 + 1;
            this.f3872j = listG.get(i2);
            if (this.f3872j != null && (this.f3867e.e().c(this.f3872j.f3909c.d()) || this.f3867e.t(this.f3872j.f3909c.a()))) {
                j(this.f3872j);
                z = true;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.load.n.f.a
    public void c() {
        throw new UnsupportedOperationException();
    }

    @Override // com.bumptech.glide.load.n.f
    public void cancel() {
        n.a<?> aVar = this.f3872j;
        if (aVar != null) {
            aVar.f3909c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.n.f.a
    public void d(com.bumptech.glide.load.g gVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, com.bumptech.glide.load.a aVar, com.bumptech.glide.load.g gVar2) {
        this.f3868f.d(gVar, obj, dVar, this.f3872j.f3909c.d(), gVar);
    }

    boolean g(n.a<?> aVar) {
        n.a<?> aVar2 = this.f3872j;
        return aVar2 != null && aVar2 == aVar;
    }

    void h(n.a<?> aVar, Object obj) {
        j jVarE = this.f3867e.e();
        if (obj != null && jVarE.c(aVar.f3909c.d())) {
            this.f3871i = obj;
            this.f3868f.c();
        } else {
            f.a aVar2 = this.f3868f;
            com.bumptech.glide.load.g gVar = aVar.a;
            com.bumptech.glide.load.data.d<?> dVar = aVar.f3909c;
            aVar2.d(gVar, obj, dVar, dVar.d(), this.f3873k);
        }
    }

    void i(n.a<?> aVar, Exception exc) {
        f.a aVar2 = this.f3868f;
        d dVar = this.f3873k;
        com.bumptech.glide.load.data.d<?> dVar2 = aVar.f3909c;
        aVar2.a(dVar, exc, dVar2, dVar2.d());
    }
}