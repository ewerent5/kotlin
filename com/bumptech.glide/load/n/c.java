package com.bumptech.glide.load.n;

import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.n.f;
import com.bumptech.glide.load.o.n;
import java.io.File;
import java.util.List;

/* compiled from: DataCacheGenerator.java */
/* loaded from: classes.dex */
class c implements f, d.a<Object> {

    /* renamed from: e, reason: collision with root package name */
    private final List<com.bumptech.glide.load.g> f3705e;

    /* renamed from: f, reason: collision with root package name */
    private final g<?> f3706f;

    /* renamed from: g, reason: collision with root package name */
    private final f.a f3707g;

    /* renamed from: h, reason: collision with root package name */
    private int f3708h;

    /* renamed from: i, reason: collision with root package name */
    private com.bumptech.glide.load.g f3709i;

    /* renamed from: j, reason: collision with root package name */
    private List<com.bumptech.glide.load.o.n<File, ?>> f3710j;

    /* renamed from: k, reason: collision with root package name */
    private int f3711k;

    /* renamed from: l, reason: collision with root package name */
    private volatile n.a<?> f3712l;

    /* renamed from: m, reason: collision with root package name */
    private File f3713m;

    c(g<?> gVar, f.a aVar) {
        this(gVar.c(), gVar, aVar);
    }

    private boolean a() {
        return this.f3711k < this.f3710j.size();
    }

    @Override // com.bumptech.glide.load.n.f
    public boolean b() {
        while (true) {
            boolean z = false;
            if (this.f3710j != null && a()) {
                this.f3712l = null;
                while (!z && a()) {
                    List<com.bumptech.glide.load.o.n<File, ?>> list = this.f3710j;
                    int i2 = this.f3711k;
                    this.f3711k = i2 + 1;
                    this.f3712l = list.get(i2).b(this.f3713m, this.f3706f.s(), this.f3706f.f(), this.f3706f.k());
                    if (this.f3712l != null && this.f3706f.t(this.f3712l.f3909c.a())) {
                        this.f3712l.f3909c.e(this.f3706f.l(), this);
                        z = true;
                    }
                }
                return z;
            }
            int i3 = this.f3708h + 1;
            this.f3708h = i3;
            if (i3 >= this.f3705e.size()) {
                return false;
            }
            com.bumptech.glide.load.g gVar = this.f3705e.get(this.f3708h);
            File fileB = this.f3706f.d().b(new d(gVar, this.f3706f.o()));
            this.f3713m = fileB;
            if (fileB != null) {
                this.f3709i = gVar;
                this.f3710j = this.f3706f.j(fileB);
                this.f3711k = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void c(Exception exc) {
        this.f3707g.a(this.f3709i, exc, this.f3712l.f3909c, com.bumptech.glide.load.a.DATA_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.n.f
    public void cancel() {
        n.a<?> aVar = this.f3712l;
        if (aVar != null) {
            aVar.f3909c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void f(Object obj) {
        this.f3707g.d(this.f3709i, obj, this.f3712l.f3909c, com.bumptech.glide.load.a.DATA_DISK_CACHE, this.f3709i);
    }

    c(List<com.bumptech.glide.load.g> list, g<?> gVar, f.a aVar) {
        this.f3708h = -1;
        this.f3705e = list;
        this.f3706f = gVar;
        this.f3707g = aVar;
    }
}