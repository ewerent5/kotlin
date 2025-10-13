package k.c.e;

import android.content.Context;
import android.os.Build;
import k.c.e.m.n;
import k.c.e.m.o;
import k.c.e.m.p;
import k.c.e.m.q;
import k.c.e.m.r;
import k.c.e.m.s;
import k.c.e.m.u;
import k.c.f.m;

/* compiled from: MapTileProviderBasic.java */
/* loaded from: classes3.dex */
public class i extends g implements c {
    protected k.c.e.m.g n;
    private final k.c.e.m.h o;
    private final k.c.e.m.l p;
    private final k.c.e.m.j q;

    public i(Context context, k.c.e.n.d dVar) {
        this(context, dVar, null);
    }

    public static n C(d dVar, k.c.e.n.d dVar2, k.c.e.m.g gVar) {
        return gVar instanceof u ? new o(dVar, dVar2) : new q(dVar, dVar2);
    }

    public boolean D(boolean z) {
        int i2 = -1;
        int i3 = -1;
        int i4 = 0;
        for (p pVar : this.f16597m) {
            if (i2 == -1 && pVar == this.p) {
                i2 = i4;
            }
            if (i3 == -1 && pVar == this.q) {
                i3 = i4;
            }
            i4++;
        }
        if (i2 == -1 || i3 == -1) {
            return false;
        }
        if (i3 < i2 && z) {
            return true;
        }
        if (i3 > i2 && !z) {
            return true;
        }
        this.f16597m.set(i2, this.q);
        this.f16597m.set(i3, this.p);
        return true;
    }

    @Override // k.c.e.g, k.c.e.h
    public void i() {
        k.c.e.m.g gVar = this.n;
        if (gVar != null) {
            gVar.a();
        }
        this.n = null;
        super.i();
    }

    @Override // k.c.e.g
    protected boolean z(long j2) {
        int iE;
        k.c.e.m.h hVar = this.o;
        if ((hVar != null && !hVar.a()) || !w()) {
            return true;
        }
        int i2 = -1;
        int i3 = -1;
        for (p pVar : this.f16597m) {
            if (pVar.i()) {
                int iE2 = pVar.e();
                if (i2 == -1 || i2 > iE2) {
                    i2 = iE2;
                }
                int iD = pVar.d();
                if (i3 == -1 || i3 < iD) {
                    i3 = iD;
                }
            }
        }
        return i2 == -1 || i3 == -1 || (iE = m.e(j2)) < i2 || iE > i3;
    }

    public i(Context context, k.c.e.n.d dVar, k.c.e.m.g gVar) {
        this(new k.c.e.o.d(context), new r(context), dVar, context, gVar);
    }

    public i(d dVar, k.c.e.m.h hVar, k.c.e.n.d dVar2, Context context, k.c.e.m.g gVar) {
        super(dVar2, dVar);
        this.o = hVar;
        if (gVar != null) {
            this.n = gVar;
        } else if (Build.VERSION.SDK_INT < 10) {
            this.n = new u();
        } else {
            this.n = new s();
        }
        k.c.e.m.k kVar = new k.c.e.m.k(dVar, context.getAssets(), dVar2);
        this.f16597m.add(kVar);
        n nVarC = C(dVar, dVar2, this.n);
        this.f16597m.add(nVarC);
        k.c.e.m.m mVar = new k.c.e.m.m(dVar, dVar2);
        this.f16597m.add(mVar);
        k.c.e.m.j jVar = new k.c.e.m.j();
        this.q = jVar;
        this.f16597m.add(jVar);
        jVar.n(kVar);
        jVar.n(nVarC);
        jVar.n(mVar);
        k.c.e.m.l lVar = new k.c.e.m.l(dVar2, this.n, hVar);
        this.p = lVar;
        this.f16597m.add(lVar);
        n().h().add(new k.c.f.k(-1));
        n().h().add(new k.c.f.h(1));
        n().p(false);
        n().q(false);
        n().g().c(kVar);
        n().g().c(nVarC);
        n().g().c(mVar);
        n().g().c(lVar);
        n().i().add(this);
        D(true);
    }
}