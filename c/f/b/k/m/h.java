package c.f.b.k.m;

import c.f.b.k.d;
import c.f.b.k.e;
import c.f.b.k.m.b;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Direct.java */
/* loaded from: classes.dex */
public class h {
    private static b.a a = new b.a();

    private static boolean a(c.f.b.k.e eVar) {
        e.b bVarY = eVar.y();
        e.b bVarO = eVar.O();
        c.f.b.k.f fVar = eVar.I() != null ? (c.f.b.k.f) eVar.I() : null;
        if (fVar != null) {
            fVar.y();
            e.b bVar = e.b.FIXED;
        }
        if (fVar != null) {
            fVar.O();
            e.b bVar2 = e.b.FIXED;
        }
        e.b bVar3 = e.b.FIXED;
        boolean z = bVarY == bVar3 || bVarY == e.b.WRAP_CONTENT || (bVarY == e.b.MATCH_CONSTRAINT && eVar.q == 0 && eVar.X == 0.0f && eVar.V(0)) || eVar.e0();
        boolean z2 = bVarO == bVar3 || bVarO == e.b.WRAP_CONTENT || (bVarO == e.b.MATCH_CONSTRAINT && eVar.r == 0 && eVar.X == 0.0f && eVar.V(1)) || eVar.f0();
        if (eVar.X <= 0.0f || !(z || z2)) {
            return z && z2;
        }
        return true;
    }

    private static void b(c.f.b.k.e eVar, b.InterfaceC0049b interfaceC0049b, boolean z) {
        c.f.b.k.d dVar;
        c.f.b.k.d dVar2;
        c.f.b.k.d dVar3;
        c.f.b.k.d dVar4;
        c.f.b.k.d dVar5;
        if (!(eVar instanceof c.f.b.k.f) && eVar.d0() && a(eVar)) {
            c.f.b.k.f.A1(eVar, interfaceC0049b, new b.a(), b.a.a);
        }
        c.f.b.k.d dVarM = eVar.m(d.b.LEFT);
        c.f.b.k.d dVarM2 = eVar.m(d.b.RIGHT);
        int iD = dVarM.d();
        int iD2 = dVarM2.d();
        if (dVarM.c() != null && dVarM.m()) {
            Iterator<c.f.b.k.d> it = dVarM.c().iterator();
            while (it.hasNext()) {
                c.f.b.k.d next = it.next();
                c.f.b.k.e eVar2 = next.f2843d;
                boolean zA = a(eVar2);
                if (eVar2.d0() && zA) {
                    c.f.b.k.f.A1(eVar2, interfaceC0049b, new b.a(), b.a.a);
                }
                e.b bVarY = eVar2.y();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarY != bVar || zA) {
                    if (!eVar2.d0()) {
                        c.f.b.k.d dVar6 = eVar2.I;
                        if (next == dVar6 && eVar2.K.f2845f == null) {
                            int iE = dVar6.e() + iD;
                            eVar2.p0(iE, eVar2.R() + iE);
                            b(eVar2, interfaceC0049b, z);
                        } else {
                            c.f.b.k.d dVar7 = eVar2.K;
                            if (next == dVar7 && dVar6.f2845f == null) {
                                int iE2 = iD - dVar7.e();
                                eVar2.p0(iE2 - eVar2.R(), iE2);
                                b(eVar2, interfaceC0049b, z);
                            } else if (next == dVar6 && (dVar3 = dVar7.f2845f) != null && dVar3.m() && !eVar2.Z()) {
                                d(interfaceC0049b, eVar2, z);
                            }
                        }
                    }
                } else if (eVar2.y() == bVar && eVar2.u >= 0 && eVar2.t >= 0 && (eVar2.Q() == 8 || (eVar2.q == 0 && eVar2.t() == 0.0f))) {
                    if (!eVar2.Z() && !eVar2.c0()) {
                        if (((next == eVar2.I && (dVar5 = eVar2.K.f2845f) != null && dVar5.m()) || (next == eVar2.K && (dVar4 = eVar2.I.f2845f) != null && dVar4.m())) && !eVar2.Z()) {
                            e(eVar, interfaceC0049b, eVar2, z);
                        }
                    }
                }
            }
        }
        if ((eVar instanceof c.f.b.k.g) || dVarM2.c() == null || !dVarM2.m()) {
            return;
        }
        Iterator<c.f.b.k.d> it2 = dVarM2.c().iterator();
        while (it2.hasNext()) {
            c.f.b.k.d next2 = it2.next();
            c.f.b.k.e eVar3 = next2.f2843d;
            boolean zA2 = a(eVar3);
            if (eVar3.d0() && zA2) {
                c.f.b.k.f.A1(eVar3, interfaceC0049b, new b.a(), b.a.a);
            }
            boolean z2 = (next2 == eVar3.I && (dVar2 = eVar3.K.f2845f) != null && dVar2.m()) || (next2 == eVar3.K && (dVar = eVar3.I.f2845f) != null && dVar.m());
            e.b bVarY2 = eVar3.y();
            e.b bVar2 = e.b.MATCH_CONSTRAINT;
            if (bVarY2 != bVar2 || zA2) {
                if (!eVar3.d0()) {
                    c.f.b.k.d dVar8 = eVar3.I;
                    if (next2 == dVar8 && eVar3.K.f2845f == null) {
                        int iE3 = dVar8.e() + iD2;
                        eVar3.p0(iE3, eVar3.R() + iE3);
                        b(eVar3, interfaceC0049b, z);
                    } else {
                        c.f.b.k.d dVar9 = eVar3.K;
                        if (next2 == dVar9 && dVar8.f2845f == null) {
                            int iE4 = iD2 - dVar9.e();
                            eVar3.p0(iE4 - eVar3.R(), iE4);
                            b(eVar3, interfaceC0049b, z);
                        } else if (z2 && !eVar3.Z()) {
                            d(interfaceC0049b, eVar3, z);
                        }
                    }
                }
            } else if (eVar3.y() == bVar2 && eVar3.u >= 0 && eVar3.t >= 0 && (eVar3.Q() == 8 || (eVar3.q == 0 && eVar3.t() == 0.0f))) {
                if (!eVar3.Z() && !eVar3.c0() && z2 && !eVar3.Z()) {
                    e(eVar, interfaceC0049b, eVar3, z);
                }
            }
        }
    }

    private static void c(c.f.b.k.a aVar, b.InterfaceC0049b interfaceC0049b, int i2, boolean z) {
        if (aVar.c1()) {
            if (i2 == 0) {
                b(aVar, interfaceC0049b, z);
            } else {
                i(aVar, interfaceC0049b);
            }
        }
    }

    private static void d(b.InterfaceC0049b interfaceC0049b, c.f.b.k.e eVar, boolean z) {
        float fW = eVar.w();
        int iD = eVar.I.f2845f.d();
        int iD2 = eVar.K.f2845f.d();
        int iE = eVar.I.e() + iD;
        int iE2 = iD2 - eVar.K.e();
        if (iD == iD2) {
            fW = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iR = eVar.R();
        int i2 = (iD2 - iD) - iR;
        if (iD > iD2) {
            i2 = (iD - iD2) - iR;
        }
        int i3 = ((int) ((fW * i2) + 0.5f)) + iD;
        int i4 = i3 + iR;
        if (iD > iD2) {
            i4 = i3 - iR;
        }
        eVar.p0(i3, i4);
        b(eVar, interfaceC0049b, z);
    }

    private static void e(c.f.b.k.e eVar, b.InterfaceC0049b interfaceC0049b, c.f.b.k.e eVar2, boolean z) {
        float fW = eVar2.w();
        int iD = eVar2.I.f2845f.d() + eVar2.I.e();
        int iD2 = eVar2.K.f2845f.d() - eVar2.K.e();
        if (iD2 >= iD) {
            int iR = eVar2.R();
            if (eVar2.Q() != 8) {
                int i2 = eVar2.q;
                if (i2 == 2) {
                    iR = (int) (eVar2.w() * 0.5f * (eVar instanceof c.f.b.k.f ? eVar.R() : eVar.I().R()));
                } else if (i2 == 0) {
                    iR = iD2 - iD;
                }
                iR = Math.max(eVar2.t, iR);
                int i3 = eVar2.u;
                if (i3 > 0) {
                    iR = Math.min(i3, iR);
                }
            }
            int i4 = iD + ((int) ((fW * ((iD2 - iD) - iR)) + 0.5f));
            eVar2.p0(i4, iR + i4);
            b(eVar2, interfaceC0049b, z);
        }
    }

    private static void f(b.InterfaceC0049b interfaceC0049b, c.f.b.k.e eVar) {
        float fM = eVar.M();
        int iD = eVar.J.f2845f.d();
        int iD2 = eVar.L.f2845f.d();
        int iE = eVar.J.e() + iD;
        int iE2 = iD2 - eVar.L.e();
        if (iD == iD2) {
            fM = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iV = eVar.v();
        int i2 = (iD2 - iD) - iV;
        if (iD > iD2) {
            i2 = (iD - iD2) - iV;
        }
        int i3 = (int) ((fM * i2) + 0.5f);
        int i4 = iD + i3;
        int i5 = i4 + iV;
        if (iD > iD2) {
            i4 = iD - i3;
            i5 = i4 - iV;
        }
        eVar.s0(i4, i5);
        i(eVar, interfaceC0049b);
    }

    private static void g(c.f.b.k.e eVar, b.InterfaceC0049b interfaceC0049b, c.f.b.k.e eVar2) {
        float fM = eVar2.M();
        int iD = eVar2.J.f2845f.d() + eVar2.J.e();
        int iD2 = eVar2.L.f2845f.d() - eVar2.L.e();
        if (iD2 >= iD) {
            int iV = eVar2.v();
            if (eVar2.Q() != 8) {
                int i2 = eVar2.r;
                if (i2 == 2) {
                    iV = (int) (fM * 0.5f * (eVar instanceof c.f.b.k.f ? eVar.v() : eVar.I().v()));
                } else if (i2 == 0) {
                    iV = iD2 - iD;
                }
                iV = Math.max(eVar2.w, iV);
                int i3 = eVar2.x;
                if (i3 > 0) {
                    iV = Math.min(i3, iV);
                }
            }
            int i4 = iD + ((int) ((fM * ((iD2 - iD) - iV)) + 0.5f));
            eVar2.s0(i4, iV + i4);
            i(eVar2, interfaceC0049b);
        }
    }

    public static void h(c.f.b.k.f fVar, b.InterfaceC0049b interfaceC0049b) {
        e.b bVarY = fVar.y();
        e.b bVarO = fVar.O();
        fVar.i0();
        ArrayList<c.f.b.k.e> arrayListA1 = fVar.a1();
        int size = arrayListA1.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayListA1.get(i2).i0();
        }
        boolean zX1 = fVar.x1();
        if (bVarY == e.b.FIXED) {
            fVar.p0(0, fVar.R());
        } else {
            fVar.q0(0);
        }
        boolean z = false;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            c.f.b.k.e eVar = arrayListA1.get(i3);
            if (eVar instanceof c.f.b.k.g) {
                c.f.b.k.g gVar = (c.f.b.k.g) eVar;
                if (gVar.b1() == 1) {
                    if (gVar.c1() != -1) {
                        gVar.f1(gVar.c1());
                    } else if (gVar.d1() != -1 && fVar.e0()) {
                        gVar.f1(fVar.R() - gVar.d1());
                    } else if (fVar.e0()) {
                        gVar.f1((int) ((gVar.e1() * fVar.R()) + 0.5f));
                    }
                    z = true;
                }
            } else if ((eVar instanceof c.f.b.k.a) && ((c.f.b.k.a) eVar).g1() == 0) {
                z2 = true;
            }
        }
        if (z) {
            for (int i4 = 0; i4 < size; i4++) {
                c.f.b.k.e eVar2 = arrayListA1.get(i4);
                if (eVar2 instanceof c.f.b.k.g) {
                    c.f.b.k.g gVar2 = (c.f.b.k.g) eVar2;
                    if (gVar2.b1() == 1) {
                        b(gVar2, interfaceC0049b, zX1);
                    }
                }
            }
        }
        b(fVar, interfaceC0049b, zX1);
        if (z2) {
            for (int i5 = 0; i5 < size; i5++) {
                c.f.b.k.e eVar3 = arrayListA1.get(i5);
                if (eVar3 instanceof c.f.b.k.a) {
                    c.f.b.k.a aVar = (c.f.b.k.a) eVar3;
                    if (aVar.g1() == 0) {
                        c(aVar, interfaceC0049b, 0, zX1);
                    }
                }
            }
        }
        if (bVarO == e.b.FIXED) {
            fVar.s0(0, fVar.v());
        } else {
            fVar.r0(0);
        }
        boolean z3 = false;
        boolean z4 = false;
        for (int i6 = 0; i6 < size; i6++) {
            c.f.b.k.e eVar4 = arrayListA1.get(i6);
            if (eVar4 instanceof c.f.b.k.g) {
                c.f.b.k.g gVar3 = (c.f.b.k.g) eVar4;
                if (gVar3.b1() == 0) {
                    if (gVar3.c1() != -1) {
                        gVar3.f1(gVar3.c1());
                    } else if (gVar3.d1() != -1 && fVar.f0()) {
                        gVar3.f1(fVar.v() - gVar3.d1());
                    } else if (fVar.f0()) {
                        gVar3.f1((int) ((gVar3.e1() * fVar.v()) + 0.5f));
                    }
                    z3 = true;
                }
            } else if ((eVar4 instanceof c.f.b.k.a) && ((c.f.b.k.a) eVar4).g1() == 1) {
                z4 = true;
            }
        }
        if (z3) {
            for (int i7 = 0; i7 < size; i7++) {
                c.f.b.k.e eVar5 = arrayListA1.get(i7);
                if (eVar5 instanceof c.f.b.k.g) {
                    c.f.b.k.g gVar4 = (c.f.b.k.g) eVar5;
                    if (gVar4.b1() == 0) {
                        i(gVar4, interfaceC0049b);
                    }
                }
            }
        }
        i(fVar, interfaceC0049b);
        if (z4) {
            for (int i8 = 0; i8 < size; i8++) {
                c.f.b.k.e eVar6 = arrayListA1.get(i8);
                if (eVar6 instanceof c.f.b.k.a) {
                    c.f.b.k.a aVar2 = (c.f.b.k.a) eVar6;
                    if (aVar2.g1() == 1) {
                        c(aVar2, interfaceC0049b, 1, zX1);
                    }
                }
            }
        }
        for (int i9 = 0; i9 < size; i9++) {
            c.f.b.k.e eVar7 = arrayListA1.get(i9);
            if (eVar7.d0() && a(eVar7)) {
                c.f.b.k.f.A1(eVar7, interfaceC0049b, a, b.a.a);
                b(eVar7, interfaceC0049b, zX1);
                i(eVar7, interfaceC0049b);
            }
        }
    }

    private static void i(c.f.b.k.e eVar, b.InterfaceC0049b interfaceC0049b) {
        c.f.b.k.d dVar;
        c.f.b.k.d dVar2;
        c.f.b.k.d dVar3;
        c.f.b.k.d dVar4;
        c.f.b.k.d dVar5;
        if (!(eVar instanceof c.f.b.k.f) && eVar.d0() && a(eVar)) {
            c.f.b.k.f.A1(eVar, interfaceC0049b, new b.a(), b.a.a);
        }
        c.f.b.k.d dVarM = eVar.m(d.b.TOP);
        c.f.b.k.d dVarM2 = eVar.m(d.b.BOTTOM);
        int iD = dVarM.d();
        int iD2 = dVarM2.d();
        if (dVarM.c() != null && dVarM.m()) {
            Iterator<c.f.b.k.d> it = dVarM.c().iterator();
            while (it.hasNext()) {
                c.f.b.k.d next = it.next();
                c.f.b.k.e eVar2 = next.f2843d;
                boolean zA = a(eVar2);
                if (eVar2.d0() && zA) {
                    c.f.b.k.f.A1(eVar2, interfaceC0049b, new b.a(), b.a.a);
                }
                e.b bVarO = eVar2.O();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarO != bVar || zA) {
                    if (!eVar2.d0()) {
                        c.f.b.k.d dVar6 = eVar2.J;
                        if (next == dVar6 && eVar2.L.f2845f == null) {
                            int iE = dVar6.e() + iD;
                            eVar2.s0(iE, eVar2.v() + iE);
                            i(eVar2, interfaceC0049b);
                        } else {
                            c.f.b.k.d dVar7 = eVar2.L;
                            if (next == dVar7 && dVar7.f2845f == null) {
                                int iE2 = iD - dVar7.e();
                                eVar2.s0(iE2 - eVar2.v(), iE2);
                                i(eVar2, interfaceC0049b);
                            } else if (next == dVar6 && (dVar3 = dVar7.f2845f) != null && dVar3.m()) {
                                f(interfaceC0049b, eVar2);
                            }
                        }
                    }
                } else if (eVar2.O() == bVar && eVar2.x >= 0 && eVar2.w >= 0 && (eVar2.Q() == 8 || (eVar2.r == 0 && eVar2.t() == 0.0f))) {
                    if (!eVar2.b0() && !eVar2.c0()) {
                        if (((next == eVar2.J && (dVar5 = eVar2.L.f2845f) != null && dVar5.m()) || (next == eVar2.L && (dVar4 = eVar2.J.f2845f) != null && dVar4.m())) && !eVar2.b0()) {
                            g(eVar, interfaceC0049b, eVar2);
                        }
                    }
                }
            }
        }
        if (eVar instanceof c.f.b.k.g) {
            return;
        }
        if (dVarM2.c() != null && dVarM2.m()) {
            Iterator<c.f.b.k.d> it2 = dVarM2.c().iterator();
            while (it2.hasNext()) {
                c.f.b.k.d next2 = it2.next();
                c.f.b.k.e eVar3 = next2.f2843d;
                boolean zA2 = a(eVar3);
                if (eVar3.d0() && zA2) {
                    c.f.b.k.f.A1(eVar3, interfaceC0049b, new b.a(), b.a.a);
                }
                boolean z = (next2 == eVar3.J && (dVar2 = eVar3.L.f2845f) != null && dVar2.m()) || (next2 == eVar3.L && (dVar = eVar3.J.f2845f) != null && dVar.m());
                e.b bVarO2 = eVar3.O();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (bVarO2 != bVar2 || zA2) {
                    if (!eVar3.d0()) {
                        c.f.b.k.d dVar8 = eVar3.J;
                        if (next2 == dVar8 && eVar3.L.f2845f == null) {
                            int iE3 = dVar8.e() + iD2;
                            eVar3.s0(iE3, eVar3.v() + iE3);
                            i(eVar3, interfaceC0049b);
                        } else {
                            c.f.b.k.d dVar9 = eVar3.L;
                            if (next2 == dVar9 && dVar8.f2845f == null) {
                                int iE4 = iD2 - dVar9.e();
                                eVar3.s0(iE4 - eVar3.v(), iE4);
                                i(eVar3, interfaceC0049b);
                            } else if (z && !eVar3.b0()) {
                                f(interfaceC0049b, eVar3);
                            }
                        }
                    }
                } else if (eVar3.O() == bVar2 && eVar3.x >= 0 && eVar3.w >= 0 && (eVar3.Q() == 8 || (eVar3.r == 0 && eVar3.t() == 0.0f))) {
                    if (!eVar3.b0() && !eVar3.c0() && z && !eVar3.b0()) {
                        g(eVar, interfaceC0049b, eVar3);
                    }
                }
            }
        }
        c.f.b.k.d dVarM3 = eVar.m(d.b.BASELINE);
        if (dVarM3.c() == null || !dVarM3.m()) {
            return;
        }
        int iD3 = dVarM3.d();
        Iterator<c.f.b.k.d> it3 = dVarM3.c().iterator();
        while (it3.hasNext()) {
            c.f.b.k.d next3 = it3.next();
            c.f.b.k.e eVar4 = next3.f2843d;
            boolean zA3 = a(eVar4);
            if (eVar4.d0() && zA3) {
                c.f.b.k.f.A1(eVar4, interfaceC0049b, new b.a(), b.a.a);
            }
            if (eVar4.O() != e.b.MATCH_CONSTRAINT || zA3) {
                if (!eVar4.d0() && next3 == eVar4.M) {
                    eVar4.o0(iD3);
                    i(eVar4, interfaceC0049b);
                }
            }
        }
    }
}