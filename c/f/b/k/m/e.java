package c.f.b.k.m;

import c.f.b.k.e;
import c.f.b.k.m.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: DependencyGraph.java */
/* loaded from: classes.dex */
public class e {
    private c.f.b.k.f a;

    /* renamed from: d */
    private c.f.b.k.f f2894d;

    /* renamed from: b */
    private boolean f2892b = true;

    /* renamed from: c */
    private boolean f2893c = true;

    /* renamed from: e */
    private ArrayList<p> f2895e = new ArrayList<>();

    /* renamed from: f */
    private ArrayList<m> f2896f = new ArrayList<>();

    /* renamed from: g */
    private b.InterfaceC0049b f2897g = null;

    /* renamed from: h */
    private b.a f2898h = new b.a();

    /* renamed from: i */
    ArrayList<m> f2899i = new ArrayList<>();

    public e(c.f.b.k.f fVar) {
        this.a = fVar;
        this.f2894d = fVar;
    }

    private void a(f fVar, int i2, int i3, f fVar2, ArrayList<m> arrayList, m mVar) {
        p pVar = fVar.f2902d;
        if (pVar.f2945c == null) {
            c.f.b.k.f fVar3 = this.a;
            if (pVar == fVar3.f2862f || pVar == fVar3.f2863g) {
                return;
            }
            if (mVar == null) {
                mVar = new m(pVar, i3);
                arrayList.add(mVar);
            }
            pVar.f2945c = mVar;
            mVar.a(pVar);
            for (d dVar : pVar.f2950h.f2909k) {
                if (dVar instanceof f) {
                    a((f) dVar, i2, 0, fVar2, arrayList, mVar);
                }
            }
            for (d dVar2 : pVar.f2951i.f2909k) {
                if (dVar2 instanceof f) {
                    a((f) dVar2, i2, 1, fVar2, arrayList, mVar);
                }
            }
            if (i2 == 1 && (pVar instanceof n)) {
                for (d dVar3 : ((n) pVar).f2929k.f2909k) {
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i2, 2, fVar2, arrayList, mVar);
                    }
                }
            }
            for (f fVar4 : pVar.f2950h.f2910l) {
                if (fVar4 == fVar2) {
                    mVar.f2923c = true;
                }
                a(fVar4, i2, 0, fVar2, arrayList, mVar);
            }
            for (f fVar5 : pVar.f2951i.f2910l) {
                if (fVar5 == fVar2) {
                    mVar.f2923c = true;
                }
                a(fVar5, i2, 1, fVar2, arrayList, mVar);
            }
            if (i2 == 1 && (pVar instanceof n)) {
                Iterator<f> it = ((n) pVar).f2929k.f2910l.iterator();
                while (it.hasNext()) {
                    a(it.next(), i2, 2, fVar2, arrayList, mVar);
                }
            }
        }
    }

    private boolean b(c.f.b.k.f fVar) {
        int iR;
        e.b bVar;
        int iV;
        e.b bVar2;
        e.b bVar3;
        e.b bVar4;
        Iterator<c.f.b.k.e> it = fVar.D0.iterator();
        while (it.hasNext()) {
            c.f.b.k.e next = it.next();
            e.b[] bVarArr = next.T;
            e.b bVar5 = bVarArr[0];
            e.b bVar6 = bVarArr[1];
            if (next.Q() == 8) {
                next.f2858b = true;
            } else {
                if (next.v < 1.0f && bVar5 == e.b.MATCH_CONSTRAINT) {
                    next.q = 2;
                }
                if (next.y < 1.0f && bVar6 == e.b.MATCH_CONSTRAINT) {
                    next.r = 2;
                }
                if (next.t() > 0.0f) {
                    e.b bVar7 = e.b.MATCH_CONSTRAINT;
                    if (bVar5 == bVar7 && (bVar6 == e.b.WRAP_CONTENT || bVar6 == e.b.FIXED)) {
                        next.q = 3;
                    } else if (bVar6 == bVar7 && (bVar5 == e.b.WRAP_CONTENT || bVar5 == e.b.FIXED)) {
                        next.r = 3;
                    } else if (bVar5 == bVar7 && bVar6 == bVar7) {
                        if (next.q == 0) {
                            next.q = 3;
                        }
                        if (next.r == 0) {
                            next.r = 3;
                        }
                    }
                }
                e.b bVar8 = e.b.MATCH_CONSTRAINT;
                if (bVar5 == bVar8 && next.q == 1 && (next.I.f2845f == null || next.K.f2845f == null)) {
                    bVar5 = e.b.WRAP_CONTENT;
                }
                e.b bVar9 = bVar5;
                if (bVar6 == bVar8 && next.r == 1 && (next.J.f2845f == null || next.L.f2845f == null)) {
                    bVar6 = e.b.WRAP_CONTENT;
                }
                e.b bVar10 = bVar6;
                l lVar = next.f2862f;
                lVar.f2946d = bVar9;
                int i2 = next.q;
                lVar.a = i2;
                n nVar = next.f2863g;
                nVar.f2946d = bVar10;
                int i3 = next.r;
                nVar.a = i3;
                e.b bVar11 = e.b.MATCH_PARENT;
                if ((bVar9 == bVar11 || bVar9 == e.b.FIXED || bVar9 == e.b.WRAP_CONTENT) && (bVar10 == bVar11 || bVar10 == e.b.FIXED || bVar10 == e.b.WRAP_CONTENT)) {
                    int iR2 = next.R();
                    if (bVar9 == bVar11) {
                        iR = (fVar.R() - next.I.f2846g) - next.K.f2846g;
                        bVar = e.b.FIXED;
                    } else {
                        iR = iR2;
                        bVar = bVar9;
                    }
                    int iV2 = next.v();
                    if (bVar10 == bVar11) {
                        iV = (fVar.v() - next.J.f2846g) - next.L.f2846g;
                        bVar2 = e.b.FIXED;
                    } else {
                        iV = iV2;
                        bVar2 = bVar10;
                    }
                    l(next, bVar, iR, bVar2, iV);
                    next.f2862f.f2947e.d(next.R());
                    next.f2863g.f2947e.d(next.v());
                    next.f2858b = true;
                } else {
                    if (bVar9 == bVar8 && (bVar10 == (bVar4 = e.b.WRAP_CONTENT) || bVar10 == e.b.FIXED)) {
                        if (i2 == 3) {
                            if (bVar10 == bVar4) {
                                l(next, bVar4, 0, bVar4, 0);
                            }
                            int iV3 = next.v();
                            int i4 = (int) ((iV3 * next.X) + 0.5f);
                            e.b bVar12 = e.b.FIXED;
                            l(next, bVar12, i4, bVar12, iV3);
                            next.f2862f.f2947e.d(next.R());
                            next.f2863g.f2947e.d(next.v());
                            next.f2858b = true;
                        } else if (i2 == 1) {
                            l(next, bVar4, 0, bVar10, 0);
                            next.f2862f.f2947e.f2920m = next.R();
                        } else if (i2 == 2) {
                            e.b[] bVarArr2 = fVar.T;
                            e.b bVar13 = bVarArr2[0];
                            e.b bVar14 = e.b.FIXED;
                            if (bVar13 == bVar14 || bVarArr2[0] == bVar11) {
                                l(next, bVar14, (int) ((next.v * fVar.R()) + 0.5f), bVar10, next.v());
                                next.f2862f.f2947e.d(next.R());
                                next.f2863g.f2947e.d(next.v());
                                next.f2858b = true;
                            }
                        } else {
                            c.f.b.k.d[] dVarArr = next.Q;
                            if (dVarArr[0].f2845f == null || dVarArr[1].f2845f == null) {
                                l(next, bVar4, 0, bVar10, 0);
                                next.f2862f.f2947e.d(next.R());
                                next.f2863g.f2947e.d(next.v());
                                next.f2858b = true;
                            }
                        }
                    }
                    if (bVar10 == bVar8 && (bVar9 == (bVar3 = e.b.WRAP_CONTENT) || bVar9 == e.b.FIXED)) {
                        if (i3 == 3) {
                            if (bVar9 == bVar3) {
                                l(next, bVar3, 0, bVar3, 0);
                            }
                            int iR3 = next.R();
                            float f2 = next.X;
                            if (next.u() == -1) {
                                f2 = 1.0f / f2;
                            }
                            e.b bVar15 = e.b.FIXED;
                            l(next, bVar15, iR3, bVar15, (int) ((iR3 * f2) + 0.5f));
                            next.f2862f.f2947e.d(next.R());
                            next.f2863g.f2947e.d(next.v());
                            next.f2858b = true;
                        } else if (i3 == 1) {
                            l(next, bVar9, 0, bVar3, 0);
                            next.f2863g.f2947e.f2920m = next.v();
                        } else if (i3 == 2) {
                            e.b[] bVarArr3 = fVar.T;
                            e.b bVar16 = bVarArr3[1];
                            e.b bVar17 = e.b.FIXED;
                            if (bVar16 == bVar17 || bVarArr3[1] == bVar11) {
                                l(next, bVar9, next.R(), bVar17, (int) ((next.y * fVar.v()) + 0.5f));
                                next.f2862f.f2947e.d(next.R());
                                next.f2863g.f2947e.d(next.v());
                                next.f2858b = true;
                            }
                        } else {
                            c.f.b.k.d[] dVarArr2 = next.Q;
                            if (dVarArr2[2].f2845f == null || dVarArr2[3].f2845f == null) {
                                l(next, bVar3, 0, bVar10, 0);
                                next.f2862f.f2947e.d(next.R());
                                next.f2863g.f2947e.d(next.v());
                                next.f2858b = true;
                            }
                        }
                    }
                    if (bVar9 == bVar8 && bVar10 == bVar8) {
                        if (i2 == 1 || i3 == 1) {
                            e.b bVar18 = e.b.WRAP_CONTENT;
                            l(next, bVar18, 0, bVar18, 0);
                            next.f2862f.f2947e.f2920m = next.R();
                            next.f2863g.f2947e.f2920m = next.v();
                        } else if (i3 == 2 && i2 == 2) {
                            e.b[] bVarArr4 = fVar.T;
                            e.b bVar19 = bVarArr4[0];
                            e.b bVar20 = e.b.FIXED;
                            if (bVar19 == bVar20 || bVarArr4[0] == bVar20) {
                                if (bVarArr4[1] == bVar20 || bVarArr4[1] == bVar20) {
                                    l(next, bVar20, (int) ((next.v * fVar.R()) + 0.5f), bVar20, (int) ((next.y * fVar.v()) + 0.5f));
                                    next.f2862f.f2947e.d(next.R());
                                    next.f2863g.f2947e.d(next.v());
                                    next.f2858b = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private int e(c.f.b.k.f fVar, int i2) {
        int size = this.f2899i.size();
        long jMax = 0;
        for (int i3 = 0; i3 < size; i3++) {
            jMax = Math.max(jMax, this.f2899i.get(i3).b(fVar, i2));
        }
        return (int) jMax;
    }

    private void i(p pVar, int i2, ArrayList<m> arrayList) {
        for (d dVar : pVar.f2950h.f2909k) {
            if (dVar instanceof f) {
                a((f) dVar, i2, 0, pVar.f2951i, arrayList, null);
            } else if (dVar instanceof p) {
                a(((p) dVar).f2950h, i2, 0, pVar.f2951i, arrayList, null);
            }
        }
        for (d dVar2 : pVar.f2951i.f2909k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i2, 1, pVar.f2950h, arrayList, null);
            } else if (dVar2 instanceof p) {
                a(((p) dVar2).f2951i, i2, 1, pVar.f2950h, arrayList, null);
            }
        }
        if (i2 == 1) {
            for (d dVar3 : ((n) pVar).f2929k.f2909k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i2, 2, null, arrayList, null);
                }
            }
        }
    }

    private void l(c.f.b.k.e eVar, e.b bVar, int i2, e.b bVar2, int i3) {
        b.a aVar = this.f2898h;
        aVar.f2880d = bVar;
        aVar.f2881e = bVar2;
        aVar.f2882f = i2;
        aVar.f2883g = i3;
        this.f2897g.b(eVar, aVar);
        eVar.U0(this.f2898h.f2884h);
        eVar.v0(this.f2898h.f2885i);
        eVar.u0(this.f2898h.f2887k);
        eVar.k0(this.f2898h.f2886j);
    }

    public void c() {
        d(this.f2895e);
        this.f2899i.clear();
        m.a = 0;
        i(this.a.f2862f, 0, this.f2899i);
        i(this.a.f2863g, 1, this.f2899i);
        this.f2892b = false;
    }

    public void d(ArrayList<p> arrayList) {
        arrayList.clear();
        this.f2894d.f2862f.f();
        this.f2894d.f2863g.f();
        arrayList.add(this.f2894d.f2862f);
        arrayList.add(this.f2894d.f2863g);
        Iterator<c.f.b.k.e> it = this.f2894d.D0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            c.f.b.k.e next = it.next();
            if (next instanceof c.f.b.k.g) {
                arrayList.add(new j(next));
            } else {
                if (next.Z()) {
                    if (next.f2860d == null) {
                        next.f2860d = new c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f2860d);
                } else {
                    arrayList.add(next.f2862f);
                }
                if (next.b0()) {
                    if (next.f2861e == null) {
                        next.f2861e = new c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f2861e);
                } else {
                    arrayList.add(next.f2863g);
                }
                if (next instanceof c.f.b.k.i) {
                    arrayList.add(new k(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<p> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<p> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f2944b != this.f2894d) {
                next2.d();
            }
        }
    }

    public boolean f(boolean z) {
        boolean z2;
        boolean z3 = true;
        boolean z4 = z & true;
        if (this.f2892b || this.f2893c) {
            Iterator<c.f.b.k.e> it = this.a.D0.iterator();
            while (it.hasNext()) {
                c.f.b.k.e next = it.next();
                next.l();
                next.f2858b = false;
                next.f2862f.r();
                next.f2863g.q();
            }
            this.a.l();
            c.f.b.k.f fVar = this.a;
            fVar.f2858b = false;
            fVar.f2862f.r();
            this.a.f2863g.q();
            this.f2893c = false;
        }
        if (b(this.f2894d)) {
            return false;
        }
        this.a.V0(0);
        this.a.W0(0);
        e.b bVarS = this.a.s(0);
        e.b bVarS2 = this.a.s(1);
        if (this.f2892b) {
            c();
        }
        int iS = this.a.S();
        int iT = this.a.T();
        this.a.f2862f.f2950h.d(iS);
        this.a.f2863g.f2950h.d(iT);
        m();
        e.b bVar = e.b.WRAP_CONTENT;
        if (bVarS == bVar || bVarS2 == bVar) {
            if (z4) {
                Iterator<p> it2 = this.f2895e.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!it2.next().m()) {
                        z4 = false;
                        break;
                    }
                }
            }
            if (z4 && bVarS == e.b.WRAP_CONTENT) {
                this.a.z0(e.b.FIXED);
                c.f.b.k.f fVar2 = this.a;
                fVar2.U0(e(fVar2, 0));
                c.f.b.k.f fVar3 = this.a;
                fVar3.f2862f.f2947e.d(fVar3.R());
            }
            if (z4 && bVarS2 == e.b.WRAP_CONTENT) {
                this.a.Q0(e.b.FIXED);
                c.f.b.k.f fVar4 = this.a;
                fVar4.v0(e(fVar4, 1));
                c.f.b.k.f fVar5 = this.a;
                fVar5.f2863g.f2947e.d(fVar5.v());
            }
        }
        c.f.b.k.f fVar6 = this.a;
        e.b[] bVarArr = fVar6.T;
        e.b bVar2 = bVarArr[0];
        e.b bVar3 = e.b.FIXED;
        if (bVar2 == bVar3 || bVarArr[0] == e.b.MATCH_PARENT) {
            int iR = fVar6.R() + iS;
            this.a.f2862f.f2951i.d(iR);
            this.a.f2862f.f2947e.d(iR - iS);
            m();
            c.f.b.k.f fVar7 = this.a;
            e.b[] bVarArr2 = fVar7.T;
            if (bVarArr2[1] == bVar3 || bVarArr2[1] == e.b.MATCH_PARENT) {
                int iV = fVar7.v() + iT;
                this.a.f2863g.f2951i.d(iV);
                this.a.f2863g.f2947e.d(iV - iT);
            }
            m();
            z2 = true;
        } else {
            z2 = false;
        }
        Iterator<p> it3 = this.f2895e.iterator();
        while (it3.hasNext()) {
            p next2 = it3.next();
            if (next2.f2944b != this.a || next2.f2949g) {
                next2.e();
            }
        }
        Iterator<p> it4 = this.f2895e.iterator();
        while (it4.hasNext()) {
            p next3 = it4.next();
            if (z2 || next3.f2944b != this.a) {
                if (!next3.f2950h.f2908j || ((!next3.f2951i.f2908j && !(next3 instanceof j)) || (!next3.f2947e.f2908j && !(next3 instanceof c) && !(next3 instanceof j)))) {
                    z3 = false;
                    break;
                }
            }
        }
        this.a.z0(bVarS);
        this.a.Q0(bVarS2);
        return z3;
    }

    public boolean g(boolean z) {
        if (this.f2892b) {
            Iterator<c.f.b.k.e> it = this.a.D0.iterator();
            while (it.hasNext()) {
                c.f.b.k.e next = it.next();
                next.l();
                next.f2858b = false;
                l lVar = next.f2862f;
                lVar.f2947e.f2908j = false;
                lVar.f2949g = false;
                lVar.r();
                n nVar = next.f2863g;
                nVar.f2947e.f2908j = false;
                nVar.f2949g = false;
                nVar.q();
            }
            this.a.l();
            c.f.b.k.f fVar = this.a;
            fVar.f2858b = false;
            l lVar2 = fVar.f2862f;
            lVar2.f2947e.f2908j = false;
            lVar2.f2949g = false;
            lVar2.r();
            n nVar2 = this.a.f2863g;
            nVar2.f2947e.f2908j = false;
            nVar2.f2949g = false;
            nVar2.q();
            c();
        }
        if (b(this.f2894d)) {
            return false;
        }
        this.a.V0(0);
        this.a.W0(0);
        this.a.f2862f.f2950h.d(0);
        this.a.f2863g.f2950h.d(0);
        return true;
    }

    public boolean h(boolean z, int i2) {
        boolean z2;
        e.b bVar;
        boolean z3 = true;
        boolean z4 = z & true;
        e.b bVarS = this.a.s(0);
        e.b bVarS2 = this.a.s(1);
        int iS = this.a.S();
        int iT = this.a.T();
        if (z4 && (bVarS == (bVar = e.b.WRAP_CONTENT) || bVarS2 == bVar)) {
            Iterator<p> it = this.f2895e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p next = it.next();
                if (next.f2948f == i2 && !next.m()) {
                    z4 = false;
                    break;
                }
            }
            if (i2 == 0) {
                if (z4 && bVarS == e.b.WRAP_CONTENT) {
                    this.a.z0(e.b.FIXED);
                    c.f.b.k.f fVar = this.a;
                    fVar.U0(e(fVar, 0));
                    c.f.b.k.f fVar2 = this.a;
                    fVar2.f2862f.f2947e.d(fVar2.R());
                }
            } else if (z4 && bVarS2 == e.b.WRAP_CONTENT) {
                this.a.Q0(e.b.FIXED);
                c.f.b.k.f fVar3 = this.a;
                fVar3.v0(e(fVar3, 1));
                c.f.b.k.f fVar4 = this.a;
                fVar4.f2863g.f2947e.d(fVar4.v());
            }
        }
        if (i2 == 0) {
            c.f.b.k.f fVar5 = this.a;
            e.b[] bVarArr = fVar5.T;
            if (bVarArr[0] == e.b.FIXED || bVarArr[0] == e.b.MATCH_PARENT) {
                int iR = fVar5.R() + iS;
                this.a.f2862f.f2951i.d(iR);
                this.a.f2862f.f2947e.d(iR - iS);
                z2 = true;
            }
            z2 = false;
        } else {
            c.f.b.k.f fVar6 = this.a;
            e.b[] bVarArr2 = fVar6.T;
            if (bVarArr2[1] == e.b.FIXED || bVarArr2[1] == e.b.MATCH_PARENT) {
                int iV = fVar6.v() + iT;
                this.a.f2863g.f2951i.d(iV);
                this.a.f2863g.f2947e.d(iV - iT);
                z2 = true;
            }
            z2 = false;
        }
        m();
        Iterator<p> it2 = this.f2895e.iterator();
        while (it2.hasNext()) {
            p next2 = it2.next();
            if (next2.f2948f == i2 && (next2.f2944b != this.a || next2.f2949g)) {
                next2.e();
            }
        }
        Iterator<p> it3 = this.f2895e.iterator();
        while (it3.hasNext()) {
            p next3 = it3.next();
            if (next3.f2948f == i2 && (z2 || next3.f2944b != this.a)) {
                if (!next3.f2950h.f2908j || !next3.f2951i.f2908j || (!(next3 instanceof c) && !next3.f2947e.f2908j)) {
                    z3 = false;
                    break;
                }
            }
        }
        this.a.z0(bVarS);
        this.a.Q0(bVarS2);
        return z3;
    }

    public void j() {
        this.f2892b = true;
    }

    public void k() {
        this.f2893c = true;
    }

    public void m() {
        g gVar;
        Iterator<c.f.b.k.e> it = this.a.D0.iterator();
        while (it.hasNext()) {
            c.f.b.k.e next = it.next();
            if (!next.f2858b) {
                e.b[] bVarArr = next.T;
                boolean z = false;
                e.b bVar = bVarArr[0];
                e.b bVar2 = bVarArr[1];
                int i2 = next.q;
                int i3 = next.r;
                e.b bVar3 = e.b.WRAP_CONTENT;
                boolean z2 = bVar == bVar3 || (bVar == e.b.MATCH_CONSTRAINT && i2 == 1);
                if (bVar2 == bVar3 || (bVar2 == e.b.MATCH_CONSTRAINT && i3 == 1)) {
                    z = true;
                }
                g gVar2 = next.f2862f.f2947e;
                boolean z3 = gVar2.f2908j;
                g gVar3 = next.f2863g.f2947e;
                boolean z4 = gVar3.f2908j;
                if (z3 && z4) {
                    e.b bVar4 = e.b.FIXED;
                    l(next, bVar4, gVar2.f2905g, bVar4, gVar3.f2905g);
                    next.f2858b = true;
                } else if (z3 && z) {
                    l(next, e.b.FIXED, gVar2.f2905g, bVar3, gVar3.f2905g);
                    if (bVar2 == e.b.MATCH_CONSTRAINT) {
                        next.f2863g.f2947e.f2920m = next.v();
                    } else {
                        next.f2863g.f2947e.d(next.v());
                        next.f2858b = true;
                    }
                } else if (z4 && z2) {
                    l(next, bVar3, gVar2.f2905g, e.b.FIXED, gVar3.f2905g);
                    if (bVar == e.b.MATCH_CONSTRAINT) {
                        next.f2862f.f2947e.f2920m = next.R();
                    } else {
                        next.f2862f.f2947e.d(next.R());
                        next.f2858b = true;
                    }
                }
                if (next.f2858b && (gVar = next.f2863g.f2930l) != null) {
                    gVar.d(next.n());
                }
            }
        }
    }

    public void n(b.InterfaceC0049b interfaceC0049b) {
        this.f2897g = interfaceC0049b;
    }
}