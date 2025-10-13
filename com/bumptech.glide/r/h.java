package com.bumptech.glide.r;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.c;
import com.bumptech.glide.load.n.k;
import com.bumptech.glide.load.n.q;
import com.bumptech.glide.load.n.v;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: SingleRequest.java */
/* loaded from: classes.dex */
public final class h<R> implements c, com.bumptech.glide.r.j.g, g {
    private static final boolean a = Log.isLoggable("Request", 2);
    private int A;
    private int B;
    private boolean C;
    private RuntimeException D;

    /* renamed from: b, reason: collision with root package name */
    private final String f4190b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.t.l.c f4191c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f4192d;

    /* renamed from: e, reason: collision with root package name */
    private final e<R> f4193e;

    /* renamed from: f, reason: collision with root package name */
    private final d f4194f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f4195g;

    /* renamed from: h, reason: collision with root package name */
    private final com.bumptech.glide.d f4196h;

    /* renamed from: i, reason: collision with root package name */
    private final Object f4197i;

    /* renamed from: j, reason: collision with root package name */
    private final Class<R> f4198j;

    /* renamed from: k, reason: collision with root package name */
    private final com.bumptech.glide.r.a<?> f4199k;

    /* renamed from: l, reason: collision with root package name */
    private final int f4200l;

    /* renamed from: m, reason: collision with root package name */
    private final int f4201m;
    private final com.bumptech.glide.g n;
    private final com.bumptech.glide.r.j.h<R> o;
    private final List<e<R>> p;
    private final com.bumptech.glide.r.k.c<? super R> q;
    private final Executor r;
    private v<R> s;
    private k.d t;
    private long u;
    private volatile k v;
    private a w;
    private Drawable x;
    private Drawable y;
    private Drawable z;

    /* compiled from: SingleRequest.java */
    private enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    private h(Context context, com.bumptech.glide.d dVar, Object obj, Object obj2, Class<R> cls, com.bumptech.glide.r.a<?> aVar, int i2, int i3, com.bumptech.glide.g gVar, com.bumptech.glide.r.j.h<R> hVar, e<R> eVar, List<e<R>> list, d dVar2, k kVar, com.bumptech.glide.r.k.c<? super R> cVar, Executor executor) {
        this.f4190b = a ? String.valueOf(super.hashCode()) : null;
        this.f4191c = com.bumptech.glide.t.l.c.a();
        this.f4192d = obj;
        this.f4195g = context;
        this.f4196h = dVar;
        this.f4197i = obj2;
        this.f4198j = cls;
        this.f4199k = aVar;
        this.f4200l = i2;
        this.f4201m = i3;
        this.n = gVar;
        this.o = hVar;
        this.f4193e = eVar;
        this.p = list;
        this.f4194f = dVar2;
        this.v = kVar;
        this.q = cVar;
        this.r = executor;
        this.w = a.PENDING;
        if (this.D == null && dVar.g().a(c.C0077c.class)) {
            this.D = new RuntimeException("Glide request origin trace");
        }
    }

    private void A(v<R> vVar, R r, com.bumptech.glide.load.a aVar, boolean z) {
        boolean zB;
        boolean zS = s();
        this.w = a.COMPLETE;
        this.s = vVar;
        if (this.f4196h.h() <= 3) {
            Log.d("Glide", "Finished loading " + r.getClass().getSimpleName() + " from " + aVar + " for " + this.f4197i + " with size [" + this.A + "x" + this.B + "] in " + com.bumptech.glide.t.f.a(this.u) + " ms");
        }
        boolean z2 = true;
        this.C = true;
        try {
            List<e<R>> list = this.p;
            if (list != null) {
                Iterator<e<R>> it = list.iterator();
                zB = false;
                while (it.hasNext()) {
                    zB |= it.next().b(r, this.f4197i, this.o, aVar, zS);
                }
            } else {
                zB = false;
            }
            e<R> eVar = this.f4193e;
            if (eVar == null || !eVar.b(r, this.f4197i, this.o, aVar, zS)) {
                z2 = false;
            }
            if (!(z2 | zB)) {
                this.o.b(r, this.q.a(aVar, zS));
            }
            this.C = false;
            x();
        } catch (Throwable th) {
            this.C = false;
            throw th;
        }
    }

    private void B() {
        if (m()) {
            Drawable drawableQ = this.f4197i == null ? q() : null;
            if (drawableQ == null) {
                drawableQ = p();
            }
            if (drawableQ == null) {
                drawableQ = r();
            }
            this.o.d(drawableQ);
        }
    }

    private void j() {
        if (this.C) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    private boolean l() {
        d dVar = this.f4194f;
        return dVar == null || dVar.l(this);
    }

    private boolean m() {
        d dVar = this.f4194f;
        return dVar == null || dVar.f(this);
    }

    private boolean n() {
        d dVar = this.f4194f;
        return dVar == null || dVar.h(this);
    }

    private void o() {
        j();
        this.f4191c.c();
        this.o.a(this);
        k.d dVar = this.t;
        if (dVar != null) {
            dVar.a();
            this.t = null;
        }
    }

    private Drawable p() {
        if (this.x == null) {
            Drawable drawableJ = this.f4199k.j();
            this.x = drawableJ;
            if (drawableJ == null && this.f4199k.i() > 0) {
                this.x = t(this.f4199k.i());
            }
        }
        return this.x;
    }

    private Drawable q() {
        if (this.z == null) {
            Drawable drawableK = this.f4199k.k();
            this.z = drawableK;
            if (drawableK == null && this.f4199k.l() > 0) {
                this.z = t(this.f4199k.l());
            }
        }
        return this.z;
    }

    private Drawable r() {
        if (this.y == null) {
            Drawable drawableQ = this.f4199k.q();
            this.y = drawableQ;
            if (drawableQ == null && this.f4199k.r() > 0) {
                this.y = t(this.f4199k.r());
            }
        }
        return this.y;
    }

    private boolean s() {
        d dVar = this.f4194f;
        return dVar == null || !dVar.c().b();
    }

    private Drawable t(int i2) {
        return com.bumptech.glide.load.p.f.a.a(this.f4196h, i2, this.f4199k.w() != null ? this.f4199k.w() : this.f4195g.getTheme());
    }

    private void u(String str) {
        Log.v("Request", str + " this: " + this.f4190b);
    }

    private static int v(int i2, float f2) {
        return i2 == Integer.MIN_VALUE ? i2 : Math.round(f2 * i2);
    }

    private void w() {
        d dVar = this.f4194f;
        if (dVar != null) {
            dVar.a(this);
        }
    }

    private void x() {
        d dVar = this.f4194f;
        if (dVar != null) {
            dVar.j(this);
        }
    }

    public static <R> h<R> y(Context context, com.bumptech.glide.d dVar, Object obj, Object obj2, Class<R> cls, com.bumptech.glide.r.a<?> aVar, int i2, int i3, com.bumptech.glide.g gVar, com.bumptech.glide.r.j.h<R> hVar, e<R> eVar, List<e<R>> list, d dVar2, k kVar, com.bumptech.glide.r.k.c<? super R> cVar, Executor executor) {
        return new h<>(context, dVar, obj, obj2, cls, aVar, i2, i3, gVar, hVar, eVar, list, dVar2, kVar, cVar, executor);
    }

    private void z(q qVar, int i2) {
        boolean zA;
        this.f4191c.c();
        synchronized (this.f4192d) {
            qVar.k(this.D);
            int iH = this.f4196h.h();
            if (iH <= i2) {
                Log.w("Glide", "Load failed for " + this.f4197i + " with size [" + this.A + "x" + this.B + "]", qVar);
                if (iH <= 4) {
                    qVar.g("Glide");
                }
            }
            this.t = null;
            this.w = a.FAILED;
            boolean z = true;
            this.C = true;
            try {
                List<e<R>> list = this.p;
                if (list != null) {
                    Iterator<e<R>> it = list.iterator();
                    zA = false;
                    while (it.hasNext()) {
                        zA |= it.next().a(qVar, this.f4197i, this.o, s());
                    }
                } else {
                    zA = false;
                }
                e<R> eVar = this.f4193e;
                if (eVar == null || !eVar.a(qVar, this.f4197i, this.o, s())) {
                    z = false;
                }
                if (!(zA | z)) {
                    B();
                }
                this.C = false;
                w();
            } catch (Throwable th) {
                this.C = false;
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.r.g
    public void a(q qVar) {
        z(qVar, 5);
    }

    @Override // com.bumptech.glide.r.c
    public boolean b() {
        boolean z;
        synchronized (this.f4192d) {
            z = this.w == a.COMPLETE;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.r.g
    public void c(v<?> vVar, com.bumptech.glide.load.a aVar, boolean z) {
        this.f4191c.c();
        v<?> vVar2 = null;
        try {
            synchronized (this.f4192d) {
                try {
                    this.t = null;
                    if (vVar == null) {
                        a(new q("Expected to receive a Resource<R> with an object of " + this.f4198j + " inside, but instead got null."));
                        return;
                    }
                    Object obj = vVar.get();
                    try {
                        if (obj != null && this.f4198j.isAssignableFrom(obj.getClass())) {
                            if (n()) {
                                A(vVar, obj, aVar, z);
                                return;
                            }
                            this.s = null;
                            this.w = a.COMPLETE;
                            this.v.k(vVar);
                            return;
                        }
                        this.s = null;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected to receive an object of ");
                        sb.append(this.f4198j);
                        sb.append(" but instead got ");
                        sb.append(obj != null ? obj.getClass() : "");
                        sb.append("{");
                        sb.append(obj);
                        sb.append("} inside Resource{");
                        sb.append(vVar);
                        sb.append("}.");
                        sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        a(new q(sb.toString()));
                        this.v.k(vVar);
                    } catch (Throwable th) {
                        vVar2 = vVar;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (vVar2 != null) {
                this.v.k(vVar2);
            }
            throw th3;
        }
    }

    @Override // com.bumptech.glide.r.c
    public void clear() {
        synchronized (this.f4192d) {
            j();
            this.f4191c.c();
            a aVar = this.w;
            a aVar2 = a.CLEARED;
            if (aVar == aVar2) {
                return;
            }
            o();
            v<R> vVar = this.s;
            if (vVar != null) {
                this.s = null;
            } else {
                vVar = null;
            }
            if (l()) {
                this.o.g(r());
            }
            this.w = aVar2;
            if (vVar != null) {
                this.v.k(vVar);
            }
        }
    }

    @Override // com.bumptech.glide.r.c
    public boolean d(c cVar) {
        int i2;
        int i3;
        Object obj;
        Class<R> cls;
        com.bumptech.glide.r.a<?> aVar;
        com.bumptech.glide.g gVar;
        int size;
        int i4;
        int i5;
        Object obj2;
        Class<R> cls2;
        com.bumptech.glide.r.a<?> aVar2;
        com.bumptech.glide.g gVar2;
        int size2;
        if (!(cVar instanceof h)) {
            return false;
        }
        synchronized (this.f4192d) {
            i2 = this.f4200l;
            i3 = this.f4201m;
            obj = this.f4197i;
            cls = this.f4198j;
            aVar = this.f4199k;
            gVar = this.n;
            List<e<R>> list = this.p;
            size = list != null ? list.size() : 0;
        }
        h hVar = (h) cVar;
        synchronized (hVar.f4192d) {
            i4 = hVar.f4200l;
            i5 = hVar.f4201m;
            obj2 = hVar.f4197i;
            cls2 = hVar.f4198j;
            aVar2 = hVar.f4199k;
            gVar2 = hVar.n;
            List<e<R>> list2 = hVar.p;
            size2 = list2 != null ? list2.size() : 0;
        }
        return i2 == i4 && i3 == i5 && com.bumptech.glide.t.k.b(obj, obj2) && cls.equals(cls2) && aVar.equals(aVar2) && gVar == gVar2 && size == size2;
    }

    @Override // com.bumptech.glide.r.c
    public void e() {
        synchronized (this.f4192d) {
            if (isRunning()) {
                clear();
            }
        }
    }

    @Override // com.bumptech.glide.r.j.g
    public void f(int i2, int i3) throws Throwable {
        Object obj;
        this.f4191c.c();
        Object obj2 = this.f4192d;
        synchronized (obj2) {
            try {
                try {
                    boolean z = a;
                    if (z) {
                        u("Got onSizeReady in " + com.bumptech.glide.t.f.a(this.u));
                    }
                    if (this.w == a.WAITING_FOR_SIZE) {
                        a aVar = a.RUNNING;
                        this.w = aVar;
                        float fV = this.f4199k.v();
                        this.A = v(i2, fV);
                        this.B = v(i3, fV);
                        if (z) {
                            u("finished setup for calling load in " + com.bumptech.glide.t.f.a(this.u));
                        }
                        obj = obj2;
                        try {
                            this.t = this.v.f(this.f4196h, this.f4197i, this.f4199k.u(), this.A, this.B, this.f4199k.t(), this.f4198j, this.n, this.f4199k.h(), this.f4199k.x(), this.f4199k.H(), this.f4199k.D(), this.f4199k.n(), this.f4199k.B(), this.f4199k.z(), this.f4199k.y(), this.f4199k.m(), this, this.r);
                            if (this.w != aVar) {
                                this.t = null;
                            }
                            if (z) {
                                u("finished onSizeReady in " + com.bumptech.glide.t.f.a(this.u));
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obj = obj2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @Override // com.bumptech.glide.r.c
    public boolean g() {
        boolean z;
        synchronized (this.f4192d) {
            z = this.w == a.CLEARED;
        }
        return z;
    }

    @Override // com.bumptech.glide.r.g
    public Object h() {
        this.f4191c.c();
        return this.f4192d;
    }

    @Override // com.bumptech.glide.r.c
    public void i() {
        synchronized (this.f4192d) {
            j();
            this.f4191c.c();
            this.u = com.bumptech.glide.t.f.b();
            if (this.f4197i == null) {
                if (com.bumptech.glide.t.k.s(this.f4200l, this.f4201m)) {
                    this.A = this.f4200l;
                    this.B = this.f4201m;
                }
                z(new q("Received null model"), q() == null ? 5 : 3);
                return;
            }
            a aVar = this.w;
            a aVar2 = a.RUNNING;
            if (aVar == aVar2) {
                throw new IllegalArgumentException("Cannot restart a running request");
            }
            if (aVar == a.COMPLETE) {
                c(this.s, com.bumptech.glide.load.a.MEMORY_CACHE, false);
                return;
            }
            a aVar3 = a.WAITING_FOR_SIZE;
            this.w = aVar3;
            if (com.bumptech.glide.t.k.s(this.f4200l, this.f4201m)) {
                f(this.f4200l, this.f4201m);
            } else {
                this.o.i(this);
            }
            a aVar4 = this.w;
            if ((aVar4 == aVar2 || aVar4 == aVar3) && m()) {
                this.o.e(r());
            }
            if (a) {
                u("finished run method in " + com.bumptech.glide.t.f.a(this.u));
            }
        }
    }

    @Override // com.bumptech.glide.r.c
    public boolean isRunning() {
        boolean z;
        synchronized (this.f4192d) {
            a aVar = this.w;
            z = aVar == a.RUNNING || aVar == a.WAITING_FOR_SIZE;
        }
        return z;
    }

    @Override // com.bumptech.glide.r.c
    public boolean k() {
        boolean z;
        synchronized (this.f4192d) {
            z = this.w == a.COMPLETE;
        }
        return z;
    }
}