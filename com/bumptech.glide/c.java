package com.bumptech.glide;

import android.content.Context;
import com.bumptech.glide.b;
import com.bumptech.glide.e;
import com.bumptech.glide.load.n.b0.a;
import com.bumptech.glide.load.n.b0.i;
import com.bumptech.glide.o.p;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: GlideBuilder.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    private com.bumptech.glide.load.n.k f3523c;

    /* renamed from: d, reason: collision with root package name */
    private com.bumptech.glide.load.n.a0.e f3524d;

    /* renamed from: e, reason: collision with root package name */
    private com.bumptech.glide.load.n.a0.b f3525e;

    /* renamed from: f, reason: collision with root package name */
    private com.bumptech.glide.load.n.b0.h f3526f;

    /* renamed from: g, reason: collision with root package name */
    private com.bumptech.glide.load.n.c0.a f3527g;

    /* renamed from: h, reason: collision with root package name */
    private com.bumptech.glide.load.n.c0.a f3528h;

    /* renamed from: i, reason: collision with root package name */
    private a.InterfaceC0081a f3529i;

    /* renamed from: j, reason: collision with root package name */
    private com.bumptech.glide.load.n.b0.i f3530j;

    /* renamed from: k, reason: collision with root package name */
    private com.bumptech.glide.o.d f3531k;
    private p.b n;
    private com.bumptech.glide.load.n.c0.a o;
    private boolean p;
    private List<com.bumptech.glide.r.e<Object>> q;
    private final Map<Class<?>, l<?, ?>> a = new c.e.a();

    /* renamed from: b, reason: collision with root package name */
    private final e.a f3522b = new e.a();

    /* renamed from: l, reason: collision with root package name */
    private int f3532l = 4;

    /* renamed from: m, reason: collision with root package name */
    private b.a f3533m = new a();

    /* compiled from: GlideBuilder.java */
    class a implements b.a {
        a() {
        }

        @Override // com.bumptech.glide.b.a
        public com.bumptech.glide.r.f a() {
            return new com.bumptech.glide.r.f();
        }
    }

    /* compiled from: GlideBuilder.java */
    static final class b {
        b() {
        }
    }

    /* compiled from: GlideBuilder.java */
    /* renamed from: com.bumptech.glide.c$c, reason: collision with other inner class name */
    public static final class C0077c {
    }

    /* compiled from: GlideBuilder.java */
    public static final class d {
        private d() {
        }
    }

    com.bumptech.glide.b a(Context context) {
        if (this.f3527g == null) {
            this.f3527g = com.bumptech.glide.load.n.c0.a.h();
        }
        if (this.f3528h == null) {
            this.f3528h = com.bumptech.glide.load.n.c0.a.f();
        }
        if (this.o == null) {
            this.o = com.bumptech.glide.load.n.c0.a.d();
        }
        if (this.f3530j == null) {
            this.f3530j = new i.a(context).a();
        }
        if (this.f3531k == null) {
            this.f3531k = new com.bumptech.glide.o.f();
        }
        if (this.f3524d == null) {
            int iB = this.f3530j.b();
            if (iB > 0) {
                this.f3524d = new com.bumptech.glide.load.n.a0.k(iB);
            } else {
                this.f3524d = new com.bumptech.glide.load.n.a0.f();
            }
        }
        if (this.f3525e == null) {
            this.f3525e = new com.bumptech.glide.load.n.a0.j(this.f3530j.a());
        }
        if (this.f3526f == null) {
            this.f3526f = new com.bumptech.glide.load.n.b0.g(this.f3530j.d());
        }
        if (this.f3529i == null) {
            this.f3529i = new com.bumptech.glide.load.n.b0.f(context);
        }
        if (this.f3523c == null) {
            this.f3523c = new com.bumptech.glide.load.n.k(this.f3526f, this.f3529i, this.f3528h, this.f3527g, com.bumptech.glide.load.n.c0.a.i(), this.o, this.p);
        }
        List<com.bumptech.glide.r.e<Object>> list = this.q;
        if (list == null) {
            this.q = Collections.emptyList();
        } else {
            this.q = Collections.unmodifiableList(list);
        }
        e eVarB = this.f3522b.b();
        return new com.bumptech.glide.b(context, this.f3523c, this.f3526f, this.f3524d, this.f3525e, new p(this.n, eVarB), this.f3531k, this.f3532l, this.f3533m, this.a, this.q, eVarB);
    }

    void b(p.b bVar) {
        this.n = bVar;
    }
}