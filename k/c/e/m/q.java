package k.c.e.m;

import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;
import k.c.e.m.p;
import k.c.e.n.a;

/* compiled from: MapTileSqlCacheProvider.java */
/* loaded from: classes3.dex */
public class q extends n {

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f16658g = {"tile", "expires"};

    /* renamed from: h, reason: collision with root package name */
    private final AtomicReference<k.c.e.n.d> f16659h;

    /* renamed from: i, reason: collision with root package name */
    private s f16660i;

    /* compiled from: MapTileSqlCacheProvider.java */
    protected class a extends p.b {
        protected a() {
            super();
        }

        @Override // k.c.e.m.p.b
        public Drawable a(long j2) throws b {
            k.c.e.n.d dVar = (k.c.e.n.d) q.this.f16659h.get();
            if (dVar == null) {
                return null;
            }
            if (q.this.f16660i == null) {
                Log.d("OsmDroid", "TileLoader failed to load tile due to mWriter being null (map shutdown?)");
                return null;
            }
            try {
                Drawable drawableL = q.this.f16660i.l(dVar, j2);
                if (drawableL == null) {
                    k.c.e.o.b.f16710d++;
                } else {
                    k.c.e.o.b.f16712f++;
                }
                return drawableL;
            } catch (a.C0213a e2) {
                Log.w("OsmDroid", "LowMemoryException downloading MapTile: " + k.c.f.m.h(j2) + " : " + e2);
                k.c.e.o.b.f16711e = k.c.e.o.b.f16711e + 1;
                throw new b(e2);
            } catch (Throwable th) {
                Log.e("OsmDroid", "Error loading tile", th);
                return null;
            }
        }
    }

    public q(k.c.e.d dVar, k.c.e.n.d dVar2) {
        super(dVar, k.c.b.a.a().C(), k.c.b.a.a().g());
        this.f16659h = new AtomicReference<>();
        m(dVar2);
        this.f16660i = new s();
    }

    @Override // k.c.e.m.n, k.c.e.m.p
    public void c() {
        s sVar = this.f16660i;
        if (sVar != null) {
            sVar.a();
        }
        this.f16660i = null;
        super.c();
    }

    @Override // k.c.e.m.p
    public int d() {
        k.c.e.n.d dVar = this.f16659h.get();
        return dVar != null ? dVar.d() : k.c.f.t.r();
    }

    @Override // k.c.e.m.p
    public int e() {
        k.c.e.n.d dVar = this.f16659h.get();
        if (dVar != null) {
            return dVar.c();
        }
        return 0;
    }

    @Override // k.c.e.m.p
    protected String f() {
        return "SQL Cache Archive Provider";
    }

    @Override // k.c.e.m.p
    protected String g() {
        return "sqlcache";
    }

    @Override // k.c.e.m.p
    public boolean i() {
        return false;
    }

    @Override // k.c.e.m.p
    public void m(k.c.e.n.d dVar) {
        this.f16659h.set(dVar);
    }

    @Override // k.c.e.m.n
    protected void n() {
    }

    @Override // k.c.e.m.n
    protected void o() {
        s sVar = this.f16660i;
        if (sVar != null) {
            sVar.a();
        }
        this.f16660i = new s();
    }

    @Override // k.c.e.m.p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public a h() {
        return new a();
    }
}