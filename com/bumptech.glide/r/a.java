package com.bumptech.glide.r;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.m;
import com.bumptech.glide.load.n.j;
import com.bumptech.glide.load.p.d.l;
import com.bumptech.glide.load.p.d.o;
import com.bumptech.glide.load.p.d.q;
import com.bumptech.glide.r.a;
import com.bumptech.glide.t.k;
import com.google.android.gms.ads.AdRequest;
import j$.util.Spliterator;
import java.util.Map;

/* compiled from: BaseRequestOptions.java */
/* loaded from: classes.dex */
public abstract class a<T extends a<T>> implements Cloneable {
    private boolean A;
    private boolean B;
    private boolean D;

    /* renamed from: e, reason: collision with root package name */
    private int f4169e;

    /* renamed from: i, reason: collision with root package name */
    private Drawable f4173i;

    /* renamed from: j, reason: collision with root package name */
    private int f4174j;

    /* renamed from: k, reason: collision with root package name */
    private Drawable f4175k;

    /* renamed from: l, reason: collision with root package name */
    private int f4176l;
    private boolean q;
    private Drawable s;
    private int t;
    private boolean x;
    private Resources.Theme y;
    private boolean z;

    /* renamed from: f, reason: collision with root package name */
    private float f4170f = 1.0f;

    /* renamed from: g, reason: collision with root package name */
    private j f4171g = j.f3779e;

    /* renamed from: h, reason: collision with root package name */
    private com.bumptech.glide.g f4172h = com.bumptech.glide.g.NORMAL;

    /* renamed from: m, reason: collision with root package name */
    private boolean f4177m = true;
    private int n = -1;
    private int o = -1;
    private com.bumptech.glide.load.g p = com.bumptech.glide.s.a.c();
    private boolean r = true;
    private com.bumptech.glide.load.i u = new com.bumptech.glide.load.i();
    private Map<Class<?>, m<?>> v = new com.bumptech.glide.t.b();
    private Class<?> w = Object.class;
    private boolean C = true;

    private boolean E(int i2) {
        return F(this.f4169e, i2);
    }

    private static boolean F(int i2, int i3) {
        return (i2 & i3) != 0;
    }

    private T P(l lVar, m<Bitmap> mVar) {
        return (T) T(lVar, mVar, false);
    }

    private T T(l lVar, m<Bitmap> mVar, boolean z) {
        T t = z ? (T) d0(lVar, mVar) : (T) Q(lVar, mVar);
        t.C = true;
        return t;
    }

    private T U() {
        return this;
    }

    protected final boolean A() {
        return this.z;
    }

    public final boolean B() {
        return this.f4177m;
    }

    public final boolean C() {
        return E(8);
    }

    boolean D() {
        return this.C;
    }

    public final boolean G() {
        return this.r;
    }

    public final boolean H() {
        return this.q;
    }

    public final boolean I() {
        return E(2048);
    }

    public final boolean J() {
        return k.s(this.o, this.n);
    }

    public T L() {
        this.x = true;
        return (T) U();
    }

    public T M() {
        return (T) Q(l.f3973e, new com.bumptech.glide.load.p.d.i());
    }

    public T N() {
        return (T) P(l.f3972d, new com.bumptech.glide.load.p.d.j());
    }

    public T O() {
        return (T) P(l.f3971c, new q());
    }

    final T Q(l lVar, m<Bitmap> mVar) {
        if (this.z) {
            return (T) d().Q(lVar, mVar);
        }
        g(lVar);
        return (T) c0(mVar, false);
    }

    public T R(int i2, int i3) {
        if (this.z) {
            return (T) d().R(i2, i3);
        }
        this.o = i2;
        this.n = i3;
        this.f4169e |= AdRequest.MAX_CONTENT_URL_LENGTH;
        return (T) V();
    }

    public T S(com.bumptech.glide.g gVar) {
        if (this.z) {
            return (T) d().S(gVar);
        }
        this.f4172h = (com.bumptech.glide.g) com.bumptech.glide.t.j.d(gVar);
        this.f4169e |= 8;
        return (T) V();
    }

    protected final T V() {
        if (this.x) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return (T) U();
    }

    public <Y> T W(com.bumptech.glide.load.h<Y> hVar, Y y) {
        if (this.z) {
            return (T) d().W(hVar, y);
        }
        com.bumptech.glide.t.j.d(hVar);
        com.bumptech.glide.t.j.d(y);
        this.u.e(hVar, y);
        return (T) V();
    }

    public T X(com.bumptech.glide.load.g gVar) {
        if (this.z) {
            return (T) d().X(gVar);
        }
        this.p = (com.bumptech.glide.load.g) com.bumptech.glide.t.j.d(gVar);
        this.f4169e |= Spliterator.IMMUTABLE;
        return (T) V();
    }

    public T Y(float f2) {
        if (this.z) {
            return (T) d().Y(f2);
        }
        if (f2 < 0.0f || f2 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f4170f = f2;
        this.f4169e |= 2;
        return (T) V();
    }

    public T Z(boolean z) {
        if (this.z) {
            return (T) d().Z(true);
        }
        this.f4177m = !z;
        this.f4169e |= 256;
        return (T) V();
    }

    public T a(a<?> aVar) {
        if (this.z) {
            return (T) d().a(aVar);
        }
        if (F(aVar.f4169e, 2)) {
            this.f4170f = aVar.f4170f;
        }
        if (F(aVar.f4169e, 262144)) {
            this.A = aVar.A;
        }
        if (F(aVar.f4169e, 1048576)) {
            this.D = aVar.D;
        }
        if (F(aVar.f4169e, 4)) {
            this.f4171g = aVar.f4171g;
        }
        if (F(aVar.f4169e, 8)) {
            this.f4172h = aVar.f4172h;
        }
        if (F(aVar.f4169e, 16)) {
            this.f4173i = aVar.f4173i;
            this.f4174j = 0;
            this.f4169e &= -33;
        }
        if (F(aVar.f4169e, 32)) {
            this.f4174j = aVar.f4174j;
            this.f4173i = null;
            this.f4169e &= -17;
        }
        if (F(aVar.f4169e, 64)) {
            this.f4175k = aVar.f4175k;
            this.f4176l = 0;
            this.f4169e &= -129;
        }
        if (F(aVar.f4169e, 128)) {
            this.f4176l = aVar.f4176l;
            this.f4175k = null;
            this.f4169e &= -65;
        }
        if (F(aVar.f4169e, 256)) {
            this.f4177m = aVar.f4177m;
        }
        if (F(aVar.f4169e, AdRequest.MAX_CONTENT_URL_LENGTH)) {
            this.o = aVar.o;
            this.n = aVar.n;
        }
        if (F(aVar.f4169e, Spliterator.IMMUTABLE)) {
            this.p = aVar.p;
        }
        if (F(aVar.f4169e, Spliterator.CONCURRENT)) {
            this.w = aVar.w;
        }
        if (F(aVar.f4169e, 8192)) {
            this.s = aVar.s;
            this.t = 0;
            this.f4169e &= -16385;
        }
        if (F(aVar.f4169e, 16384)) {
            this.t = aVar.t;
            this.s = null;
            this.f4169e &= -8193;
        }
        if (F(aVar.f4169e, 32768)) {
            this.y = aVar.y;
        }
        if (F(aVar.f4169e, 65536)) {
            this.r = aVar.r;
        }
        if (F(aVar.f4169e, 131072)) {
            this.q = aVar.q;
        }
        if (F(aVar.f4169e, 2048)) {
            this.v.putAll(aVar.v);
            this.C = aVar.C;
        }
        if (F(aVar.f4169e, 524288)) {
            this.B = aVar.B;
        }
        if (!this.r) {
            this.v.clear();
            int i2 = this.f4169e & (-2049);
            this.f4169e = i2;
            this.q = false;
            this.f4169e = i2 & (-131073);
            this.C = true;
        }
        this.f4169e |= aVar.f4169e;
        this.u.d(aVar.u);
        return (T) V();
    }

    public T a0(m<Bitmap> mVar) {
        return (T) c0(mVar, true);
    }

    public T b() {
        if (this.x && !this.z) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.z = true;
        return (T) L();
    }

    /* JADX WARN: Multi-variable type inference failed */
    T c0(m<Bitmap> mVar, boolean z) {
        if (this.z) {
            return (T) d().c0(mVar, z);
        }
        o oVar = new o(mVar, z);
        e0(Bitmap.class, mVar, z);
        e0(Drawable.class, oVar, z);
        e0(BitmapDrawable.class, oVar.c(), z);
        e0(com.bumptech.glide.load.p.h.c.class, new com.bumptech.glide.load.p.h.f(mVar), z);
        return (T) V();
    }

    @Override // 
    public T d() {
        try {
            T t = (T) super.clone();
            com.bumptech.glide.load.i iVar = new com.bumptech.glide.load.i();
            t.u = iVar;
            iVar.d(this.u);
            com.bumptech.glide.t.b bVar = new com.bumptech.glide.t.b();
            t.v = bVar;
            bVar.putAll(this.v);
            t.x = false;
            t.z = false;
            return t;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    final T d0(l lVar, m<Bitmap> mVar) {
        if (this.z) {
            return (T) d().d0(lVar, mVar);
        }
        g(lVar);
        return (T) a0(mVar);
    }

    public T e(Class<?> cls) {
        if (this.z) {
            return (T) d().e(cls);
        }
        this.w = (Class) com.bumptech.glide.t.j.d(cls);
        this.f4169e |= Spliterator.CONCURRENT;
        return (T) V();
    }

    <Y> T e0(Class<Y> cls, m<Y> mVar, boolean z) {
        if (this.z) {
            return (T) d().e0(cls, mVar, z);
        }
        com.bumptech.glide.t.j.d(cls);
        com.bumptech.glide.t.j.d(mVar);
        this.v.put(cls, mVar);
        int i2 = this.f4169e | 2048;
        this.f4169e = i2;
        this.r = true;
        int i3 = i2 | 65536;
        this.f4169e = i3;
        this.C = false;
        if (z) {
            this.f4169e = i3 | 131072;
            this.q = true;
        }
        return (T) V();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(aVar.f4170f, this.f4170f) == 0 && this.f4174j == aVar.f4174j && k.c(this.f4173i, aVar.f4173i) && this.f4176l == aVar.f4176l && k.c(this.f4175k, aVar.f4175k) && this.t == aVar.t && k.c(this.s, aVar.s) && this.f4177m == aVar.f4177m && this.n == aVar.n && this.o == aVar.o && this.q == aVar.q && this.r == aVar.r && this.A == aVar.A && this.B == aVar.B && this.f4171g.equals(aVar.f4171g) && this.f4172h == aVar.f4172h && this.u.equals(aVar.u) && this.v.equals(aVar.v) && this.w.equals(aVar.w) && k.c(this.p, aVar.p) && k.c(this.y, aVar.y);
    }

    public T f(j jVar) {
        if (this.z) {
            return (T) d().f(jVar);
        }
        this.f4171g = (j) com.bumptech.glide.t.j.d(jVar);
        this.f4169e |= 4;
        return (T) V();
    }

    public T f0(boolean z) {
        if (this.z) {
            return (T) d().f0(z);
        }
        this.D = z;
        this.f4169e |= 1048576;
        return (T) V();
    }

    public T g(l lVar) {
        return (T) W(l.f3976h, com.bumptech.glide.t.j.d(lVar));
    }

    public final j h() {
        return this.f4171g;
    }

    public int hashCode() {
        return k.n(this.y, k.n(this.p, k.n(this.w, k.n(this.v, k.n(this.u, k.n(this.f4172h, k.n(this.f4171g, k.o(this.B, k.o(this.A, k.o(this.r, k.o(this.q, k.m(this.o, k.m(this.n, k.o(this.f4177m, k.n(this.s, k.m(this.t, k.n(this.f4175k, k.m(this.f4176l, k.n(this.f4173i, k.m(this.f4174j, k.k(this.f4170f)))))))))))))))))))));
    }

    public final int i() {
        return this.f4174j;
    }

    public final Drawable j() {
        return this.f4173i;
    }

    public final Drawable k() {
        return this.s;
    }

    public final int l() {
        return this.t;
    }

    public final boolean m() {
        return this.B;
    }

    public final com.bumptech.glide.load.i n() {
        return this.u;
    }

    public final int o() {
        return this.n;
    }

    public final int p() {
        return this.o;
    }

    public final Drawable q() {
        return this.f4175k;
    }

    public final int r() {
        return this.f4176l;
    }

    public final com.bumptech.glide.g s() {
        return this.f4172h;
    }

    public final Class<?> t() {
        return this.w;
    }

    public final com.bumptech.glide.load.g u() {
        return this.p;
    }

    public final float v() {
        return this.f4170f;
    }

    public final Resources.Theme w() {
        return this.y;
    }

    public final Map<Class<?>, m<?>> x() {
        return this.v;
    }

    public final boolean y() {
        return this.D;
    }

    public final boolean z() {
        return this.A;
    }
}