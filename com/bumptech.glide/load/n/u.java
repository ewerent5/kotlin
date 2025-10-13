package com.bumptech.glide.load.n;

import com.bumptech.glide.t.l.a;

/* compiled from: LockedResource.java */
/* loaded from: classes.dex */
final class u<Z> implements v<Z>, a.f {

    /* renamed from: e, reason: collision with root package name */
    private static final c.h.k.e<u<?>> f3843e = com.bumptech.glide.t.l.a.d(20, new a());

    /* renamed from: f, reason: collision with root package name */
    private final com.bumptech.glide.t.l.c f3844f = com.bumptech.glide.t.l.c.a();

    /* renamed from: g, reason: collision with root package name */
    private v<Z> f3845g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f3846h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f3847i;

    /* compiled from: LockedResource.java */
    class a implements a.d<u<?>> {
        a() {
        }

        @Override // com.bumptech.glide.t.l.a.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public u<?> a() {
            return new u<>();
        }
    }

    u() {
    }

    private void a(v<Z> vVar) {
        this.f3847i = false;
        this.f3846h = true;
        this.f3845g = vVar;
    }

    static <Z> u<Z> f(v<Z> vVar) {
        u<Z> uVar = (u) com.bumptech.glide.t.j.d(f3843e.b());
        uVar.a(vVar);
        return uVar;
    }

    private void g() {
        this.f3845g = null;
        f3843e.a(this);
    }

    @Override // com.bumptech.glide.load.n.v
    public synchronized void b() {
        this.f3844f.c();
        this.f3847i = true;
        if (!this.f3846h) {
            this.f3845g.b();
            g();
        }
    }

    @Override // com.bumptech.glide.load.n.v
    public int c() {
        return this.f3845g.c();
    }

    @Override // com.bumptech.glide.load.n.v
    public Class<Z> d() {
        return this.f3845g.d();
    }

    @Override // com.bumptech.glide.t.l.a.f
    public com.bumptech.glide.t.l.c e() {
        return this.f3844f;
    }

    @Override // com.bumptech.glide.load.n.v
    public Z get() {
        return this.f3845g.get();
    }

    synchronized void h() {
        this.f3844f.c();
        if (!this.f3846h) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f3846h = false;
        if (this.f3847i) {
            b();
        }
    }
}