package com.bumptech.glide.load.n;

import android.os.Build;
import android.util.Log;
import com.bumptech.glide.i;
import com.bumptech.glide.load.n.f;
import com.bumptech.glide.load.n.i;
import com.bumptech.glide.t.l.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: DecodeJob.java */
/* loaded from: classes.dex */
class h<R> implements f.a, Runnable, Comparable<h<?>>, a.f {
    private Thread A;
    private com.bumptech.glide.load.g B;
    private com.bumptech.glide.load.g C;
    private Object D;
    private com.bumptech.glide.load.a E;
    private com.bumptech.glide.load.data.d<?> F;
    private volatile com.bumptech.glide.load.n.f G;
    private volatile boolean H;
    private volatile boolean I;
    private boolean J;

    /* renamed from: h */
    private final e f3748h;

    /* renamed from: i */
    private final c.h.k.e<h<?>> f3749i;

    /* renamed from: l */
    private com.bumptech.glide.d f3752l;

    /* renamed from: m */
    private com.bumptech.glide.load.g f3753m;
    private com.bumptech.glide.g n;
    private n o;
    private int p;
    private int q;
    private j r;
    private com.bumptech.glide.load.i s;
    private b<R> t;
    private int u;
    private EnumC0086h v;
    private g w;
    private long x;
    private boolean y;
    private Object z;

    /* renamed from: e */
    private final com.bumptech.glide.load.n.g<R> f3745e = new com.bumptech.glide.load.n.g<>();

    /* renamed from: f */
    private final List<Throwable> f3746f = new ArrayList();

    /* renamed from: g */
    private final com.bumptech.glide.t.l.c f3747g = com.bumptech.glide.t.l.c.a();

    /* renamed from: j */
    private final d<?> f3750j = new d<>();

    /* renamed from: k */
    private final f f3751k = new f();

    /* compiled from: DecodeJob.java */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* renamed from: b */
        static final /* synthetic */ int[] f3754b;

        /* renamed from: c */
        static final /* synthetic */ int[] f3755c;

        static {
            int[] iArr = new int[com.bumptech.glide.load.c.values().length];
            f3755c = iArr;
            try {
                iArr[com.bumptech.glide.load.c.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3755c[com.bumptech.glide.load.c.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC0086h.values().length];
            f3754b = iArr2;
            try {
                iArr2[EnumC0086h.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3754b[EnumC0086h.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3754b[EnumC0086h.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3754b[EnumC0086h.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3754b[EnumC0086h.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[g.values().length];
            a = iArr3;
            try {
                iArr3[g.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[g.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[g.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* compiled from: DecodeJob.java */
    interface b<R> {
        void a(q qVar);

        void c(v<R> vVar, com.bumptech.glide.load.a aVar, boolean z);

        void d(h<?> hVar);
    }

    /* compiled from: DecodeJob.java */
    private final class c<Z> implements i.a<Z> {
        private final com.bumptech.glide.load.a a;

        c(com.bumptech.glide.load.a aVar) {
            this.a = aVar;
        }

        @Override // com.bumptech.glide.load.n.i.a
        public v<Z> a(v<Z> vVar) {
            return h.this.x(this.a, vVar);
        }
    }

    /* compiled from: DecodeJob.java */
    private static class d<Z> {
        private com.bumptech.glide.load.g a;

        /* renamed from: b */
        private com.bumptech.glide.load.l<Z> f3757b;

        /* renamed from: c */
        private u<Z> f3758c;

        d() {
        }

        void a() {
            this.a = null;
            this.f3757b = null;
            this.f3758c = null;
        }

        void b(e eVar, com.bumptech.glide.load.i iVar) {
            com.bumptech.glide.t.l.b.a("DecodeJob.encode");
            try {
                eVar.a().a(this.a, new com.bumptech.glide.load.n.e(this.f3757b, this.f3758c, iVar));
            } finally {
                this.f3758c.h();
                com.bumptech.glide.t.l.b.d();
            }
        }

        boolean c() {
            return this.f3758c != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        <X> void d(com.bumptech.glide.load.g gVar, com.bumptech.glide.load.l<X> lVar, u<X> uVar) {
            this.a = gVar;
            this.f3757b = lVar;
            this.f3758c = uVar;
        }
    }

    /* compiled from: DecodeJob.java */
    interface e {
        com.bumptech.glide.load.n.b0.a a();
    }

    /* compiled from: DecodeJob.java */
    private static class f {
        private boolean a;

        /* renamed from: b */
        private boolean f3759b;

        /* renamed from: c */
        private boolean f3760c;

        f() {
        }

        private boolean a(boolean z) {
            return (this.f3760c || z || this.f3759b) && this.a;
        }

        synchronized boolean b() {
            this.f3759b = true;
            return a(false);
        }

        synchronized boolean c() {
            this.f3760c = true;
            return a(false);
        }

        synchronized boolean d(boolean z) {
            this.a = true;
            return a(z);
        }

        synchronized void e() {
            this.f3759b = false;
            this.a = false;
            this.f3760c = false;
        }
    }

    /* compiled from: DecodeJob.java */
    private enum g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* compiled from: DecodeJob.java */
    /* renamed from: com.bumptech.glide.load.n.h$h */
    private enum EnumC0086h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    h(e eVar, c.h.k.e<h<?>> eVar2) {
        this.f3748h = eVar;
        this.f3749i = eVar2;
    }

    private void A() {
        this.A = Thread.currentThread();
        this.x = com.bumptech.glide.t.f.b();
        boolean zB = false;
        while (!this.I && this.G != null && !(zB = this.G.b())) {
            this.v = m(this.v);
            this.G = l();
            if (this.v == EnumC0086h.SOURCE) {
                c();
                return;
            }
        }
        if ((this.v == EnumC0086h.FINISHED || this.I) && !zB) {
            u();
        }
    }

    private <Data, ResourceType> v<R> B(Data data, com.bumptech.glide.load.a aVar, t<Data, ResourceType, R> tVar) {
        com.bumptech.glide.load.i iVarN = n(aVar);
        com.bumptech.glide.load.data.e<Data> eVarL = this.f3752l.i().l(data);
        try {
            return tVar.a(eVarL, iVarN, this.p, this.q, new c(aVar));
        } finally {
            eVarL.b();
        }
    }

    private void C() {
        int i2 = a.a[this.w.ordinal()];
        if (i2 == 1) {
            this.v = m(EnumC0086h.INITIALIZE);
            this.G = l();
            A();
        } else if (i2 == 2) {
            A();
        } else {
            if (i2 == 3) {
                k();
                return;
            }
            throw new IllegalStateException("Unrecognized run reason: " + this.w);
        }
    }

    private void D() {
        Throwable th;
        this.f3747g.c();
        if (!this.H) {
            this.H = true;
            return;
        }
        if (this.f3746f.isEmpty()) {
            th = null;
        } else {
            List<Throwable> list = this.f3746f;
            th = list.get(list.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    private <Data> v<R> h(com.bumptech.glide.load.data.d<?> dVar, Data data, com.bumptech.glide.load.a aVar) {
        if (data == null) {
            return null;
        }
        try {
            long jB = com.bumptech.glide.t.f.b();
            v<R> vVarJ = j(data, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                q("Decoded result " + vVarJ, jB);
            }
            return vVarJ;
        } finally {
            dVar.b();
        }
    }

    private <Data> v<R> j(Data data, com.bumptech.glide.load.a aVar) {
        return B(data, aVar, this.f3745e.h(data.getClass()));
    }

    private void k() {
        if (Log.isLoggable("DecodeJob", 2)) {
            r("Retrieved data", this.x, "data: " + this.D + ", cache key: " + this.B + ", fetcher: " + this.F);
        }
        v<R> vVarH = null;
        try {
            vVarH = h(this.F, this.D, this.E);
        } catch (q e2) {
            e2.i(this.C, this.E);
            this.f3746f.add(e2);
        }
        if (vVarH != null) {
            t(vVarH, this.E, this.J);
        } else {
            A();
        }
    }

    private com.bumptech.glide.load.n.f l() {
        int i2 = a.f3754b[this.v.ordinal()];
        if (i2 == 1) {
            return new w(this.f3745e, this);
        }
        if (i2 == 2) {
            return new com.bumptech.glide.load.n.c(this.f3745e, this);
        }
        if (i2 == 3) {
            return new z(this.f3745e, this);
        }
        if (i2 == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.v);
    }

    private EnumC0086h m(EnumC0086h enumC0086h) {
        int i2 = a.f3754b[enumC0086h.ordinal()];
        if (i2 == 1) {
            return this.r.a() ? EnumC0086h.DATA_CACHE : m(EnumC0086h.DATA_CACHE);
        }
        if (i2 == 2) {
            return this.y ? EnumC0086h.FINISHED : EnumC0086h.SOURCE;
        }
        if (i2 == 3 || i2 == 4) {
            return EnumC0086h.FINISHED;
        }
        if (i2 == 5) {
            return this.r.b() ? EnumC0086h.RESOURCE_CACHE : m(EnumC0086h.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + enumC0086h);
    }

    private com.bumptech.glide.load.i n(com.bumptech.glide.load.a aVar) {
        com.bumptech.glide.load.i iVar = this.s;
        if (Build.VERSION.SDK_INT < 26) {
            return iVar;
        }
        boolean z = aVar == com.bumptech.glide.load.a.RESOURCE_DISK_CACHE || this.f3745e.w();
        com.bumptech.glide.load.h<Boolean> hVar = com.bumptech.glide.load.p.d.m.f3984e;
        Boolean bool = (Boolean) iVar.c(hVar);
        if (bool != null && (!bool.booleanValue() || z)) {
            return iVar;
        }
        com.bumptech.glide.load.i iVar2 = new com.bumptech.glide.load.i();
        iVar2.d(this.s);
        iVar2.e(hVar, Boolean.valueOf(z));
        return iVar2;
    }

    private int o() {
        return this.n.ordinal();
    }

    private void q(String str, long j2) {
        r(str, j2, null);
    }

    private void r(String str, long j2, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(com.bumptech.glide.t.f.a(j2));
        sb.append(", load key: ");
        sb.append(this.o);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb.toString());
    }

    private void s(v<R> vVar, com.bumptech.glide.load.a aVar, boolean z) {
        D();
        this.t.c(vVar, aVar, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void t(v<R> vVar, com.bumptech.glide.load.a aVar, boolean z) {
        if (vVar instanceof r) {
            ((r) vVar).a();
        }
        u uVar = 0;
        if (this.f3750j.c()) {
            vVar = u.f(vVar);
            uVar = vVar;
        }
        s(vVar, aVar, z);
        this.v = EnumC0086h.ENCODE;
        try {
            if (this.f3750j.c()) {
                this.f3750j.b(this.f3748h, this.s);
            }
            v();
        } finally {
            if (uVar != 0) {
                uVar.h();
            }
        }
    }

    private void u() {
        D();
        this.t.a(new q("Failed to load resource", new ArrayList(this.f3746f)));
        w();
    }

    private void v() {
        if (this.f3751k.b()) {
            z();
        }
    }

    private void w() {
        if (this.f3751k.c()) {
            z();
        }
    }

    private void z() {
        this.f3751k.e();
        this.f3750j.a();
        this.f3745e.a();
        this.H = false;
        this.f3752l = null;
        this.f3753m = null;
        this.s = null;
        this.n = null;
        this.o = null;
        this.t = null;
        this.v = null;
        this.G = null;
        this.A = null;
        this.B = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.x = 0L;
        this.I = false;
        this.z = null;
        this.f3746f.clear();
        this.f3749i.a(this);
    }

    boolean E() {
        EnumC0086h enumC0086hM = m(EnumC0086h.INITIALIZE);
        return enumC0086hM == EnumC0086h.RESOURCE_CACHE || enumC0086hM == EnumC0086h.DATA_CACHE;
    }

    @Override // com.bumptech.glide.load.n.f.a
    public void a(com.bumptech.glide.load.g gVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, com.bumptech.glide.load.a aVar) {
        dVar.b();
        q qVar = new q("Fetching data failed", exc);
        qVar.j(gVar, aVar, dVar.a());
        this.f3746f.add(qVar);
        if (Thread.currentThread() == this.A) {
            A();
        } else {
            this.w = g.SWITCH_TO_SOURCE_SERVICE;
            this.t.d(this);
        }
    }

    public void b() {
        this.I = true;
        com.bumptech.glide.load.n.f fVar = this.G;
        if (fVar != null) {
            fVar.cancel();
        }
    }

    @Override // com.bumptech.glide.load.n.f.a
    public void c() {
        this.w = g.SWITCH_TO_SOURCE_SERVICE;
        this.t.d(this);
    }

    @Override // com.bumptech.glide.load.n.f.a
    public void d(com.bumptech.glide.load.g gVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, com.bumptech.glide.load.a aVar, com.bumptech.glide.load.g gVar2) {
        this.B = gVar;
        this.D = obj;
        this.F = dVar;
        this.E = aVar;
        this.C = gVar2;
        this.J = gVar != this.f3745e.c().get(0);
        if (Thread.currentThread() != this.A) {
            this.w = g.DECODE_DATA;
            this.t.d(this);
        } else {
            com.bumptech.glide.t.l.b.a("DecodeJob.decodeFromRetrievedData");
            try {
                k();
            } finally {
                com.bumptech.glide.t.l.b.d();
            }
        }
    }

    @Override // com.bumptech.glide.t.l.a.f
    public com.bumptech.glide.t.l.c e() {
        return this.f3747g;
    }

    @Override // java.lang.Comparable
    /* renamed from: f */
    public int compareTo(h<?> hVar) {
        int iO = o() - hVar.o();
        return iO == 0 ? this.u - hVar.u : iO;
    }

    h<R> p(com.bumptech.glide.d dVar, Object obj, n nVar, com.bumptech.glide.load.g gVar, int i2, int i3, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar2, j jVar, Map<Class<?>, com.bumptech.glide.load.m<?>> map, boolean z, boolean z2, boolean z3, com.bumptech.glide.load.i iVar, b<R> bVar, int i4) {
        this.f3745e.u(dVar, obj, gVar, i2, i3, jVar, cls, cls2, gVar2, iVar, map, z, z2, this.f3748h);
        this.f3752l = dVar;
        this.f3753m = gVar;
        this.n = gVar2;
        this.o = nVar;
        this.p = i2;
        this.q = i3;
        this.r = jVar;
        this.y = z3;
        this.s = iVar;
        this.t = bVar;
        this.u = i4;
        this.w = g.INITIALIZE;
        this.z = obj;
        return this;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.bumptech.glide.t.l.b.b("DecodeJob#run(model=%s)", this.z);
        com.bumptech.glide.load.data.d<?> dVar = this.F;
        try {
            try {
                try {
                    if (this.I) {
                        u();
                        if (dVar != null) {
                            dVar.b();
                        }
                        com.bumptech.glide.t.l.b.d();
                        return;
                    }
                    C();
                    if (dVar != null) {
                        dVar.b();
                    }
                    com.bumptech.glide.t.l.b.d();
                } catch (com.bumptech.glide.load.n.b e2) {
                    throw e2;
                }
            } catch (Throwable th) {
                if (Log.isLoggable("DecodeJob", 3)) {
                    Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.I + ", stage: " + this.v, th);
                }
                if (this.v != EnumC0086h.ENCODE) {
                    this.f3746f.add(th);
                    u();
                }
                if (!this.I) {
                    throw th;
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (dVar != null) {
                dVar.b();
            }
            com.bumptech.glide.t.l.b.d();
            throw th2;
        }
    }

    <Z> v<Z> x(com.bumptech.glide.load.a aVar, v<Z> vVar) {
        v<Z> vVarB;
        com.bumptech.glide.load.m<Z> mVar;
        com.bumptech.glide.load.c cVarB;
        com.bumptech.glide.load.g dVar;
        Class<?> cls = vVar.get().getClass();
        com.bumptech.glide.load.l<Z> lVarN = null;
        if (aVar != com.bumptech.glide.load.a.RESOURCE_DISK_CACHE) {
            com.bumptech.glide.load.m<Z> mVarR = this.f3745e.r(cls);
            mVar = mVarR;
            vVarB = mVarR.b(this.f3752l, vVar, this.p, this.q);
        } else {
            vVarB = vVar;
            mVar = null;
        }
        if (!vVar.equals(vVarB)) {
            vVar.b();
        }
        if (this.f3745e.v(vVarB)) {
            lVarN = this.f3745e.n(vVarB);
            cVarB = lVarN.b(this.s);
        } else {
            cVarB = com.bumptech.glide.load.c.NONE;
        }
        com.bumptech.glide.load.l lVar = lVarN;
        if (!this.r.d(!this.f3745e.x(this.B), aVar, cVarB)) {
            return vVarB;
        }
        if (lVar == null) {
            throw new i.d(vVarB.get().getClass());
        }
        int i2 = a.f3755c[cVarB.ordinal()];
        if (i2 == 1) {
            dVar = new com.bumptech.glide.load.n.d(this.B, this.f3753m);
        } else {
            if (i2 != 2) {
                throw new IllegalArgumentException("Unknown strategy: " + cVarB);
            }
            dVar = new x(this.f3745e.b(), this.B, this.f3753m, this.p, this.q, mVar, cls, this.s);
        }
        u uVarF = u.f(vVarB);
        this.f3750j.d(dVar, lVar, uVarF);
        return uVarF;
    }

    void y(boolean z) {
        if (this.f3751k.d(z)) {
            z();
        }
    }
}