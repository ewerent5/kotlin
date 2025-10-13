package com.bumptech.glide.r;

import com.bumptech.glide.r.d;

/* compiled from: ErrorRequestCoordinator.java */
/* loaded from: classes.dex */
public final class b implements d, c {
    private final Object a;

    /* renamed from: b, reason: collision with root package name */
    private final d f4178b;

    /* renamed from: c, reason: collision with root package name */
    private volatile c f4179c;

    /* renamed from: d, reason: collision with root package name */
    private volatile c f4180d;

    /* renamed from: e, reason: collision with root package name */
    private d.a f4181e;

    /* renamed from: f, reason: collision with root package name */
    private d.a f4182f;

    public b(Object obj, d dVar) {
        d.a aVar = d.a.CLEARED;
        this.f4181e = aVar;
        this.f4182f = aVar;
        this.a = obj;
        this.f4178b = dVar;
    }

    private boolean m(c cVar) {
        return cVar.equals(this.f4179c) || (this.f4181e == d.a.FAILED && cVar.equals(this.f4180d));
    }

    private boolean n() {
        d dVar = this.f4178b;
        return dVar == null || dVar.l(this);
    }

    private boolean o() {
        d dVar = this.f4178b;
        return dVar == null || dVar.f(this);
    }

    private boolean p() {
        d dVar = this.f4178b;
        return dVar == null || dVar.h(this);
    }

    @Override // com.bumptech.glide.r.d
    public void a(c cVar) {
        synchronized (this.a) {
            if (cVar.equals(this.f4180d)) {
                this.f4182f = d.a.FAILED;
                d dVar = this.f4178b;
                if (dVar != null) {
                    dVar.a(this);
                }
                return;
            }
            this.f4181e = d.a.FAILED;
            d.a aVar = this.f4182f;
            d.a aVar2 = d.a.RUNNING;
            if (aVar != aVar2) {
                this.f4182f = aVar2;
                this.f4180d.i();
            }
        }
    }

    @Override // com.bumptech.glide.r.d, com.bumptech.glide.r.c
    public boolean b() {
        boolean z;
        synchronized (this.a) {
            z = this.f4179c.b() || this.f4180d.b();
        }
        return z;
    }

    @Override // com.bumptech.glide.r.d
    public d c() {
        d dVarC;
        synchronized (this.a) {
            d dVar = this.f4178b;
            dVarC = dVar != null ? dVar.c() : this;
        }
        return dVarC;
    }

    @Override // com.bumptech.glide.r.c
    public void clear() {
        synchronized (this.a) {
            d.a aVar = d.a.CLEARED;
            this.f4181e = aVar;
            this.f4179c.clear();
            if (this.f4182f != aVar) {
                this.f4182f = aVar;
                this.f4180d.clear();
            }
        }
    }

    @Override // com.bumptech.glide.r.c
    public boolean d(c cVar) {
        if (!(cVar instanceof b)) {
            return false;
        }
        b bVar = (b) cVar;
        return this.f4179c.d(bVar.f4179c) && this.f4180d.d(bVar.f4180d);
    }

    @Override // com.bumptech.glide.r.c
    public void e() {
        synchronized (this.a) {
            d.a aVar = this.f4181e;
            d.a aVar2 = d.a.RUNNING;
            if (aVar == aVar2) {
                this.f4181e = d.a.PAUSED;
                this.f4179c.e();
            }
            if (this.f4182f == aVar2) {
                this.f4182f = d.a.PAUSED;
                this.f4180d.e();
            }
        }
    }

    @Override // com.bumptech.glide.r.d
    public boolean f(c cVar) {
        boolean z;
        synchronized (this.a) {
            z = o() && m(cVar);
        }
        return z;
    }

    @Override // com.bumptech.glide.r.c
    public boolean g() {
        boolean z;
        synchronized (this.a) {
            d.a aVar = this.f4181e;
            d.a aVar2 = d.a.CLEARED;
            z = aVar == aVar2 && this.f4182f == aVar2;
        }
        return z;
    }

    @Override // com.bumptech.glide.r.d
    public boolean h(c cVar) {
        boolean z;
        synchronized (this.a) {
            z = p() && m(cVar);
        }
        return z;
    }

    @Override // com.bumptech.glide.r.c
    public void i() {
        synchronized (this.a) {
            d.a aVar = this.f4181e;
            d.a aVar2 = d.a.RUNNING;
            if (aVar != aVar2) {
                this.f4181e = aVar2;
                this.f4179c.i();
            }
        }
    }

    @Override // com.bumptech.glide.r.c
    public boolean isRunning() {
        boolean z;
        synchronized (this.a) {
            d.a aVar = this.f4181e;
            d.a aVar2 = d.a.RUNNING;
            z = aVar == aVar2 || this.f4182f == aVar2;
        }
        return z;
    }

    @Override // com.bumptech.glide.r.d
    public void j(c cVar) {
        synchronized (this.a) {
            if (cVar.equals(this.f4179c)) {
                this.f4181e = d.a.SUCCESS;
            } else if (cVar.equals(this.f4180d)) {
                this.f4182f = d.a.SUCCESS;
            }
            d dVar = this.f4178b;
            if (dVar != null) {
                dVar.j(this);
            }
        }
    }

    @Override // com.bumptech.glide.r.c
    public boolean k() {
        boolean z;
        synchronized (this.a) {
            d.a aVar = this.f4181e;
            d.a aVar2 = d.a.SUCCESS;
            z = aVar == aVar2 || this.f4182f == aVar2;
        }
        return z;
    }

    @Override // com.bumptech.glide.r.d
    public boolean l(c cVar) {
        boolean z;
        synchronized (this.a) {
            z = n() && m(cVar);
        }
        return z;
    }

    public void q(c cVar, c cVar2) {
        this.f4179c = cVar;
        this.f4180d = cVar2;
    }
}