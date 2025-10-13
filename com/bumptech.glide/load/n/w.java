package com.bumptech.glide.load.n;

import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.n.f;
import com.bumptech.glide.load.o.n;
import java.io.File;
import java.util.List;

/* compiled from: ResourceCacheGenerator.java */
/* loaded from: classes.dex */
class w implements f, d.a<Object> {

    /* renamed from: e, reason: collision with root package name */
    private final f.a f3848e;

    /* renamed from: f, reason: collision with root package name */
    private final g<?> f3849f;

    /* renamed from: g, reason: collision with root package name */
    private int f3850g;

    /* renamed from: h, reason: collision with root package name */
    private int f3851h = -1;

    /* renamed from: i, reason: collision with root package name */
    private com.bumptech.glide.load.g f3852i;

    /* renamed from: j, reason: collision with root package name */
    private List<com.bumptech.glide.load.o.n<File, ?>> f3853j;

    /* renamed from: k, reason: collision with root package name */
    private int f3854k;

    /* renamed from: l, reason: collision with root package name */
    private volatile n.a<?> f3855l;

    /* renamed from: m, reason: collision with root package name */
    private File f3856m;
    private x n;

    w(g<?> gVar, f.a aVar) {
        this.f3849f = gVar;
        this.f3848e = aVar;
    }

    private boolean a() {
        return this.f3854k < this.f3853j.size();
    }

    @Override // com.bumptech.glide.load.n.f
    public boolean b() {
        List<com.bumptech.glide.load.g> listC = this.f3849f.c();
        boolean z = false;
        if (listC.isEmpty()) {
            return false;
        }
        List<Class<?>> listM = this.f3849f.m();
        if (listM.isEmpty()) {
            if (File.class.equals(this.f3849f.q())) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.f3849f.i() + " to " + this.f3849f.q());
        }
        while (true) {
            if (this.f3853j != null && a()) {
                this.f3855l = null;
                while (!z && a()) {
                    List<com.bumptech.glide.load.o.n<File, ?>> list = this.f3853j;
                    int i2 = this.f3854k;
                    this.f3854k = i2 + 1;
                    this.f3855l = list.get(i2).b(this.f3856m, this.f3849f.s(), this.f3849f.f(), this.f3849f.k());
                    if (this.f3855l != null && this.f3849f.t(this.f3855l.f3909c.a())) {
                        this.f3855l.f3909c.e(this.f3849f.l(), this);
                        z = true;
                    }
                }
                return z;
            }
            int i3 = this.f3851h + 1;
            this.f3851h = i3;
            if (i3 >= listM.size()) {
                int i4 = this.f3850g + 1;
                this.f3850g = i4;
                if (i4 >= listC.size()) {
                    return false;
                }
                this.f3851h = 0;
            }
            com.bumptech.glide.load.g gVar = listC.get(this.f3850g);
            Class<?> cls = listM.get(this.f3851h);
            this.n = new x(this.f3849f.b(), gVar, this.f3849f.o(), this.f3849f.s(), this.f3849f.f(), this.f3849f.r(cls), cls, this.f3849f.k());
            File fileB = this.f3849f.d().b(this.n);
            this.f3856m = fileB;
            if (fileB != null) {
                this.f3852i = gVar;
                this.f3853j = this.f3849f.j(fileB);
                this.f3854k = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void c(Exception exc) {
        this.f3848e.a(this.n, exc, this.f3855l.f3909c, com.bumptech.glide.load.a.RESOURCE_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.n.f
    public void cancel() {
        n.a<?> aVar = this.f3855l;
        if (aVar != null) {
            aVar.f3909c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void f(Object obj) {
        this.f3848e.d(this.f3852i, obj, this.f3855l.f3909c, com.bumptech.glide.load.a.RESOURCE_DISK_CACHE, this.n);
    }
}