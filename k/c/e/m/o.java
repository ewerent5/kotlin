package k.c.e.m;

import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;
import k.c.e.m.p;
import k.c.e.n.a;

/* compiled from: MapTileFilesystemProvider.java */
/* loaded from: classes3.dex */
public class o extends n {

    /* renamed from: g, reason: collision with root package name */
    private final u f16649g;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicReference<k.c.e.n.d> f16650h;

    /* compiled from: MapTileFilesystemProvider.java */
    protected class a extends p.b {
        protected a() {
            super();
        }

        @Override // k.c.e.m.p.b
        public Drawable a(long j2) throws b {
            k.c.e.n.d dVar = (k.c.e.n.d) o.this.f16650h.get();
            if (dVar == null) {
                return null;
            }
            try {
                Drawable drawableM = o.this.f16649g.m(dVar, j2);
                if (drawableM == null) {
                    k.c.e.o.b.f16710d++;
                } else {
                    k.c.e.o.b.f16712f++;
                }
                return drawableM;
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

    public o(k.c.e.d dVar, k.c.e.n.d dVar2) {
        this(dVar, dVar2, k.c.b.a.a().B() + 604800000);
    }

    @Override // k.c.e.m.p
    public int d() {
        k.c.e.n.d dVar = this.f16650h.get();
        return dVar != null ? dVar.d() : k.c.f.t.r();
    }

    @Override // k.c.e.m.p
    public int e() {
        k.c.e.n.d dVar = this.f16650h.get();
        if (dVar != null) {
            return dVar.c();
        }
        return 0;
    }

    @Override // k.c.e.m.p
    protected String f() {
        return "File System Cache Provider";
    }

    @Override // k.c.e.m.p
    protected String g() {
        return "filesystem";
    }

    @Override // k.c.e.m.p
    public boolean i() {
        return false;
    }

    @Override // k.c.e.m.p
    public void m(k.c.e.n.d dVar) {
        this.f16650h.set(dVar);
    }

    @Override // k.c.e.m.p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public a h() {
        return new a();
    }

    public o(k.c.e.d dVar, k.c.e.n.d dVar2, long j2) {
        this(dVar, dVar2, j2, k.c.b.a.a().C(), k.c.b.a.a().g());
    }

    public o(k.c.e.d dVar, k.c.e.n.d dVar2, long j2, int i2, int i3) {
        super(dVar, i2, i3);
        u uVar = new u();
        this.f16649g = uVar;
        this.f16650h = new AtomicReference<>();
        m(dVar2);
        uVar.n(j2);
    }
}