package com.bumptech.glide.r;

import com.bumptech.glide.r.d;

/* compiled from: ThumbnailRequestCoordinator.java */
/* loaded from: classes.dex */
public class i implements d, c {
    private final d a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f4209b;

    /* renamed from: c, reason: collision with root package name */
    private volatile c f4210c;

    /* renamed from: d, reason: collision with root package name */
    private volatile c f4211d;

    /* renamed from: e, reason: collision with root package name */
    private d.a f4212e;

    /* renamed from: f, reason: collision with root package name */
    private d.a f4213f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f4214g;

    public i(Object obj, d dVar) {
        d.a aVar = d.a.CLEARED;
        this.f4212e = aVar;
        this.f4213f = aVar;
        this.f4209b = obj;
        this.a = dVar;
    }

    private boolean m() {
        d dVar = this.a;
        return dVar == null || dVar.l(this);
    }

    private boolean n() {
        d dVar = this.a;
        return dVar == null || dVar.f(this);
    }

    private boolean o() {
        d dVar = this.a;
        return dVar == null || dVar.h(this);
    }

    @Override // com.bumptech.glide.r.d
    public void a(c cVar) {
        synchronized (this.f4209b) {
            if (!cVar.equals(this.f4210c)) {
                this.f4213f = d.a.FAILED;
                return;
            }
            this.f4212e = d.a.FAILED;
            d dVar = this.a;
            if (dVar != null) {
                dVar.a(this);
            }
        }
    }

    @Override // com.bumptech.glide.r.d, com.bumptech.glide.r.c
    public boolean b() {
        boolean z;
        synchronized (this.f4209b) {
            z = this.f4211d.b() || this.f4210c.b();
        }
        return z;
    }

    @Override // com.bumptech.glide.r.d
    public d c() {
        d dVarC;
        synchronized (this.f4209b) {
            d dVar = this.a;
            dVarC = dVar != null ? dVar.c() : this;
        }
        return dVarC;
    }

    @Override // com.bumptech.glide.r.c
    public void clear() {
        synchronized (this.f4209b) {
            this.f4214g = false;
            d.a aVar = d.a.CLEARED;
            this.f4212e = aVar;
            this.f4213f = aVar;
            this.f4211d.clear();
            this.f4210c.clear();
        }
    }

    @Override // com.bumptech.glide.r.c
    public boolean d(c cVar) {
        if (!(cVar instanceof i)) {
            return false;
        }
        i iVar = (i) cVar;
        if (this.f4210c == null) {
            if (iVar.f4210c != null) {
                return false;
            }
        } else if (!this.f4210c.d(iVar.f4210c)) {
            return false;
        }
        if (this.f4211d == null) {
            if (iVar.f4211d != null) {
                return false;
            }
        } else if (!this.f4211d.d(iVar.f4211d)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.r.c
    public void e() {
        synchronized (this.f4209b) {
            if (!this.f4213f.a()) {
                this.f4213f = d.a.PAUSED;
                this.f4211d.e();
            }
            if (!this.f4212e.a()) {
                this.f4212e = d.a.PAUSED;
                this.f4210c.e();
            }
        }
    }

    @Override // com.bumptech.glide.r.d
    public boolean f(c cVar) {
        boolean z;
        synchronized (this.f4209b) {
            z = n() && cVar.equals(this.f4210c) && !b();
        }
        return z;
    }

    @Override // com.bumptech.glide.r.c
    public boolean g() {
        boolean z;
        synchronized (this.f4209b) {
            z = this.f4212e == d.a.CLEARED;
        }
        return z;
    }

    @Override // com.bumptech.glide.r.d
    public boolean h(c cVar) {
        boolean z;
        synchronized (this.f4209b) {
            z = o() && (cVar.equals(this.f4210c) || this.f4212e != d.a.SUCCESS);
        }
        return z;
    }

    @Override // com.bumptech.glide.r.c
    public void i() {
        synchronized (this.f4209b) {
            this.f4214g = true;
            try {
                if (this.f4212e != d.a.SUCCESS) {
                    d.a aVar = this.f4213f;
                    d.a aVar2 = d.a.RUNNING;
                    if (aVar != aVar2) {
                        this.f4213f = aVar2;
                        this.f4211d.i();
                    }
                }
                if (this.f4214g) {
                    d.a aVar3 = this.f4212e;
                    d.a aVar4 = d.a.RUNNING;
                    if (aVar3 != aVar4) {
                        this.f4212e = aVar4;
                        this.f4210c.i();
                    }
                }
            } finally {
                this.f4214g = false;
            }
        }
    }

    @Override // com.bumptech.glide.r.c
    public boolean isRunning() {
        boolean z;
        synchronized (this.f4209b) {
            z = this.f4212e == d.a.RUNNING;
        }
        return z;
    }

    @Override // com.bumptech.glide.r.d
    public void j(c cVar) {
        synchronized (this.f4209b) {
            if (cVar.equals(this.f4211d)) {
                this.f4213f = d.a.SUCCESS;
                return;
            }
            this.f4212e = d.a.SUCCESS;
            d dVar = this.a;
            if (dVar != null) {
                dVar.j(this);
            }
            if (!this.f4213f.a()) {
                this.f4211d.clear();
            }
        }
    }

    @Override // com.bumptech.glide.r.c
    public boolean k() {
        boolean z;
        synchronized (this.f4209b) {
            z = this.f4212e == d.a.SUCCESS;
        }
        return z;
    }

    @Override // com.bumptech.glide.r.d
    public boolean l(c cVar) {
        boolean z;
        synchronized (this.f4209b) {
            z = m() && cVar.equals(this.f4210c) && this.f4212e != d.a.PAUSED;
        }
        return z;
    }

    public void p(c cVar, c cVar2) {
        this.f4210c = cVar;
        this.f4211d = cVar2;
    }
}