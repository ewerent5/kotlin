package k.c.e;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k.c.e.m.p;
import k.c.f.m;
import k.c.f.t;

/* compiled from: MapTileProviderArray.java */
/* loaded from: classes3.dex */
public class g extends h implements k.c.f.l {

    /* renamed from: k, reason: collision with root package name */
    private final Map<Long, Integer> f16595k;

    /* renamed from: l, reason: collision with root package name */
    private d f16596l;

    /* renamed from: m, reason: collision with root package name */
    protected final List<p> f16597m;

    protected g(k.c.e.n.d dVar, d dVar2) {
        this(dVar, dVar2, new p[0]);
    }

    private void A(long j2) {
        synchronized (this.f16595k) {
            this.f16595k.remove(Long.valueOf(j2));
        }
    }

    private void B(j jVar) {
        Integer num;
        p pVarX = x(jVar);
        if (pVarX != null) {
            pVarX.k(jVar);
            return;
        }
        synchronized (this.f16595k) {
            num = this.f16595k.get(Long.valueOf(jVar.b()));
        }
        if (num != null && num.intValue() == 0) {
            super.a(jVar);
        }
        A(jVar.b());
    }

    @Override // k.c.e.h, k.c.e.c
    public void a(j jVar) {
        B(jVar);
    }

    @Override // k.c.e.c
    public void b(j jVar) {
        super.a(jVar);
        A(jVar.b());
    }

    @Override // k.c.e.h, k.c.e.c
    public void c(j jVar, Drawable drawable) {
        super.c(jVar, drawable);
        synchronized (this.f16595k) {
            this.f16595k.put(Long.valueOf(jVar.b()), 1);
        }
        B(jVar);
    }

    @Override // k.c.e.h, k.c.e.c
    public void d(j jVar, Drawable drawable) {
        super.d(jVar, drawable);
        A(jVar.b());
    }

    @Override // k.c.f.l
    public boolean e(long j2) {
        boolean zContainsKey;
        synchronized (this.f16595k) {
            zContainsKey = this.f16595k.containsKey(Long.valueOf(j2));
        }
        return zContainsKey;
    }

    @Override // k.c.e.h
    public void i() {
        synchronized (this.f16597m) {
            Iterator<p> it = this.f16597m.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
        }
        synchronized (this.f16595k) {
            this.f16595k.clear();
        }
        d dVar = this.f16596l;
        if (dVar != null) {
            dVar.destroy();
            this.f16596l = null;
        }
        super.i();
    }

    @Override // k.c.e.h
    public Drawable k(long j2) {
        Drawable drawableE = this.f16599f.e(j2);
        if (drawableE != null && (b.a(drawableE) == -1 || z(j2))) {
            return drawableE;
        }
        synchronized (this.f16595k) {
            if (this.f16595k.containsKey(Long.valueOf(j2))) {
                return drawableE;
            }
            this.f16595k.put(Long.valueOf(j2), 0);
            B(new j(j2, this.f16597m, this));
            return drawableE;
        }
    }

    @Override // k.c.e.h
    public int l() {
        int iD;
        synchronized (this.f16597m) {
            iD = 0;
            for (p pVar : this.f16597m) {
                if (pVar.d() > iD) {
                    iD = pVar.d();
                }
            }
        }
        return iD;
    }

    @Override // k.c.e.h
    public int m() {
        int iR = t.r();
        synchronized (this.f16597m) {
            for (p pVar : this.f16597m) {
                if (pVar.e() < iR) {
                    iR = pVar.e();
                }
            }
        }
        return iR;
    }

    @Override // k.c.e.h
    public void u(k.c.e.n.d dVar) {
        super.u(dVar);
        synchronized (this.f16597m) {
            Iterator<p> it = this.f16597m.iterator();
            while (it.hasNext()) {
                it.next().m(dVar);
                g();
            }
        }
    }

    protected p x(j jVar) {
        p pVarC;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            pVarC = jVar.c();
            if (pVarC != null) {
                boolean z4 = true;
                z = !y(pVarC);
                boolean z5 = !w() && pVarC.i();
                int iE = m.e(jVar.b());
                if (iE <= pVarC.d() && iE >= pVarC.e()) {
                    z4 = false;
                }
                boolean z6 = z5;
                z3 = z4;
                z2 = z6;
            }
            if (pVarC == null || (!z && !z2 && !z3)) {
                break;
            }
        }
        return pVarC;
    }

    public boolean y(p pVar) {
        return this.f16597m.contains(pVar);
    }

    protected boolean z(long j2) {
        throw null;
    }

    public g(k.c.e.n.d dVar, d dVar2, p[] pVarArr) {
        super(dVar);
        this.f16595k = new HashMap();
        this.f16596l = null;
        this.f16596l = dVar2;
        ArrayList arrayList = new ArrayList();
        this.f16597m = arrayList;
        Collections.addAll(arrayList, pVarArr);
    }
}