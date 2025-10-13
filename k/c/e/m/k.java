package k.c.e.m;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import k.c.e.m.p;
import k.c.e.n.a;

/* compiled from: MapTileAssetsProvider.java */
/* loaded from: classes3.dex */
public class k extends n {

    /* renamed from: g, reason: collision with root package name */
    private final AssetManager f16631g;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicReference<k.c.e.n.d> f16632h;

    /* compiled from: MapTileAssetsProvider.java */
    protected class a extends p.b {

        /* renamed from: f, reason: collision with root package name */
        private AssetManager f16633f;

        public a(AssetManager assetManager) {
            super();
            this.f16633f = null;
            this.f16633f = assetManager;
        }

        @Override // k.c.e.m.p.b
        public Drawable a(long j2) throws b {
            k.c.e.n.d dVar = (k.c.e.n.d) k.this.f16632h.get();
            if (dVar == null) {
                return null;
            }
            try {
                return dVar.e(this.f16633f.open(dVar.b(j2)));
            } catch (IOException unused) {
                return null;
            } catch (a.C0213a e2) {
                throw new b(e2);
            }
        }
    }

    public k(k.c.e.d dVar, AssetManager assetManager, k.c.e.n.d dVar2) {
        this(dVar, assetManager, dVar2, k.c.b.a.a().b(), k.c.b.a.a().e());
    }

    @Override // k.c.e.m.p
    public int d() {
        k.c.e.n.d dVar = this.f16632h.get();
        return dVar != null ? dVar.d() : k.c.f.t.r();
    }

    @Override // k.c.e.m.p
    public int e() {
        k.c.e.n.d dVar = this.f16632h.get();
        if (dVar != null) {
            return dVar.c();
        }
        return 0;
    }

    @Override // k.c.e.m.p
    protected String f() {
        return "Assets Cache Provider";
    }

    @Override // k.c.e.m.p
    protected String g() {
        return "assets";
    }

    @Override // k.c.e.m.p
    public boolean i() {
        return false;
    }

    @Override // k.c.e.m.p
    public void m(k.c.e.n.d dVar) {
        this.f16632h.set(dVar);
    }

    @Override // k.c.e.m.p
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public a h() {
        return new a(this.f16631g);
    }

    public k(k.c.e.d dVar, AssetManager assetManager, k.c.e.n.d dVar2, int i2, int i3) {
        super(dVar, i2, i3);
        this.f16632h = new AtomicReference<>();
        m(dVar2);
        this.f16631g = assetManager;
    }
}