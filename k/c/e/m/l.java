package k.c.e.m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;
import k.c.e.m.p;

/* compiled from: MapTileDownloader.java */
/* loaded from: classes3.dex */
public class l extends p {

    /* renamed from: e, reason: collision with root package name */
    private final g f16635e;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicReference<k.c.e.n.e> f16636f;

    /* renamed from: g, reason: collision with root package name */
    private final h f16637g;

    /* renamed from: h, reason: collision with root package name */
    private final a f16638h;

    /* renamed from: i, reason: collision with root package name */
    private final k.c.f.v f16639i;

    /* renamed from: j, reason: collision with root package name */
    private t f16640j;

    /* compiled from: MapTileDownloader.java */
    protected class a extends p.b {
        protected a() {
            super();
        }

        @Override // k.c.e.m.p.b
        public Drawable a(long j2) {
            k.c.e.n.e eVar = (k.c.e.n.e) l.this.f16636f.get();
            if (eVar == null) {
                return null;
            }
            if (l.this.f16637g != null && !l.this.f16637g.a()) {
                if (k.c.b.a.a().c()) {
                    Log.d("OsmDroid", "Skipping " + l.this.f() + " due to NetworkAvailabliltyCheck.");
                }
                return null;
            }
            String strM = eVar.m(j2);
            if (TextUtils.isEmpty(strM) || l.this.f16639i.c(strM)) {
                return null;
            }
            Drawable drawableJ = j(j2, 0, strM);
            if (drawableJ == null) {
                l.this.f16639i.a(strM);
            } else {
                l.this.f16639i.b(strM);
            }
            return drawableJ;
        }

        @Override // k.c.e.m.p.b
        protected void f(k.c.e.j jVar, Drawable drawable) {
            l.this.l(jVar.b());
            jVar.a().d(jVar, null);
            k.c.e.a.d().c(drawable);
        }

        protected Drawable j(long j2, int i2, String str) {
            k.c.e.n.e eVar = (k.c.e.n.e) l.this.f16636f.get();
            if (eVar == null) {
                return null;
            }
            try {
                eVar.j();
                try {
                    return l.this.f16640j.a(j2, i2, str, l.this.f16635e, eVar);
                } finally {
                    eVar.n();
                }
            } catch (InterruptedException unused) {
                return null;
            }
        }
    }

    public l(k.c.e.n.d dVar, g gVar, h hVar) {
        this(dVar, gVar, hVar, k.c.b.a.a().b(), k.c.b.a.a().e());
    }

    @Override // k.c.e.m.p
    public void c() {
        super.c();
        g gVar = this.f16635e;
        if (gVar != null) {
            gVar.a();
        }
    }

    @Override // k.c.e.m.p
    public int d() {
        k.c.e.n.e eVar = this.f16636f.get();
        return eVar != null ? eVar.d() : k.c.f.t.r();
    }

    @Override // k.c.e.m.p
    public int e() {
        k.c.e.n.e eVar = this.f16636f.get();
        if (eVar != null) {
            return eVar.c();
        }
        return 0;
    }

    @Override // k.c.e.m.p
    protected String f() {
        return "Online Tile Download Provider";
    }

    @Override // k.c.e.m.p
    protected String g() {
        return "downloader";
    }

    @Override // k.c.e.m.p
    public boolean i() {
        return true;
    }

    @Override // k.c.e.m.p
    public void m(k.c.e.n.d dVar) {
        if (dVar instanceof k.c.e.n.e) {
            this.f16636f.set((k.c.e.n.e) dVar);
        } else {
            this.f16636f.set(null);
        }
    }

    @Override // k.c.e.m.p
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public a h() {
        return this.f16638h;
    }

    public k.c.e.n.d t() {
        return this.f16636f.get();
    }

    public l(k.c.e.n.d dVar, g gVar, h hVar, int i2, int i3) {
        super(i2, i3);
        this.f16636f = new AtomicReference<>();
        this.f16638h = new a();
        this.f16639i = new k.c.f.v();
        this.f16640j = new t();
        this.f16635e = gVar;
        this.f16637g = hVar;
        m(dVar);
    }
}