package com.bumptech.glide.load.n;

import ch.qos.logback.core.CoreConstants;

/* compiled from: EngineResource.java */
/* loaded from: classes.dex */
class p<Z> implements v<Z> {

    /* renamed from: e, reason: collision with root package name */
    private final boolean f3823e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f3824f;

    /* renamed from: g, reason: collision with root package name */
    private final v<Z> f3825g;

    /* renamed from: h, reason: collision with root package name */
    private final a f3826h;

    /* renamed from: i, reason: collision with root package name */
    private final com.bumptech.glide.load.g f3827i;

    /* renamed from: j, reason: collision with root package name */
    private int f3828j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f3829k;

    /* compiled from: EngineResource.java */
    interface a {
        void d(com.bumptech.glide.load.g gVar, p<?> pVar);
    }

    p(v<Z> vVar, boolean z, boolean z2, com.bumptech.glide.load.g gVar, a aVar) {
        this.f3825g = (v) com.bumptech.glide.t.j.d(vVar);
        this.f3823e = z;
        this.f3824f = z2;
        this.f3827i = gVar;
        this.f3826h = (a) com.bumptech.glide.t.j.d(aVar);
    }

    synchronized void a() {
        if (this.f3829k) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f3828j++;
    }

    @Override // com.bumptech.glide.load.n.v
    public synchronized void b() {
        if (this.f3828j > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f3829k) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f3829k = true;
        if (this.f3824f) {
            this.f3825g.b();
        }
    }

    @Override // com.bumptech.glide.load.n.v
    public int c() {
        return this.f3825g.c();
    }

    @Override // com.bumptech.glide.load.n.v
    public Class<Z> d() {
        return this.f3825g.d();
    }

    v<Z> e() {
        return this.f3825g;
    }

    boolean f() {
        return this.f3823e;
    }

    void g() {
        boolean z;
        synchronized (this) {
            int i2 = this.f3828j;
            if (i2 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i3 = i2 - 1;
            this.f3828j = i3;
            if (i3 != 0) {
                z = false;
            }
        }
        if (z) {
            this.f3826h.d(this.f3827i, this);
        }
    }

    @Override // com.bumptech.glide.load.n.v
    public Z get() {
        return this.f3825g.get();
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f3823e + ", listener=" + this.f3826h + ", key=" + this.f3827i + ", acquired=" + this.f3828j + ", isRecycled=" + this.f3829k + ", resource=" + this.f3825g + CoreConstants.CURLY_RIGHT;
    }
}