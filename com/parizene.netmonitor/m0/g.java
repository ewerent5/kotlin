package com.parizene.netmonitor.m0;

import com.parizene.netmonitor.m0.d0.f.a0;
import com.parizene.netmonitor.p;
import okhttp3.internal.http2.Settings;

/* compiled from: CellInfoMapper.java */
/* loaded from: classes.dex */
public class g {
    private final l a;

    public g(l lVar) {
        this.a = lVar;
    }

    private com.parizene.netmonitor.m0.b0.k l(com.parizene.netmonitor.m0.b0.y yVar, com.parizene.netmonitor.m0.d0.f.l lVar) {
        int iA = lVar.f13430d.a();
        int iB = lVar.f13430d.b();
        c.h.k.d<String, String> dVar = (iA == Integer.MAX_VALUE || iB == Integer.MAX_VALUE) ? new c.h.k.d<>(yVar.d(), yVar.f()) : this.a.a(iA, iB);
        String str = dVar.a;
        String str2 = dVar.f3105b;
        com.parizene.netmonitor.m0.d0.f.e eVar = lVar.f13430d;
        return new com.parizene.netmonitor.m0.b0.o(lVar.a, new com.parizene.netmonitor.m0.b0.h(str, str2, eVar.f13408c, eVar.f13409d, eVar.f13410e, eVar.f13411f), new com.parizene.netmonitor.m0.b0.v(lVar.f13431e.f13469c));
    }

    private com.parizene.netmonitor.m0.b0.k m(String str, String str2, com.parizene.netmonitor.m0.d0.f.x xVar, a0 a0Var) {
        return new com.parizene.netmonitor.m0.b0.o(true, new com.parizene.netmonitor.m0.b0.h(str, str2, xVar.a, xVar.f13470b, xVar.f13471c, Integer.MAX_VALUE), new com.parizene.netmonitor.m0.b0.v(a0Var != null ? a0Var.q : Integer.MAX_VALUE));
    }

    private com.parizene.netmonitor.m0.b0.k n(String str, String str2, com.parizene.netmonitor.m0.d0.f.x xVar, a0 a0Var) {
        int i2;
        int i3 = xVar.a;
        int i4 = xVar.f13470b;
        int i5 = xVar.f13471c;
        int i6 = Integer.MAX_VALUE;
        if (a0Var != null) {
            i6 = a0Var.q;
            i2 = a0Var.n;
        } else {
            i2 = Integer.MAX_VALUE;
        }
        return new com.parizene.netmonitor.m0.b0.p(true, new com.parizene.netmonitor.m0.b0.i(str, str2, i3, i4, i5, Integer.MAX_VALUE), new com.parizene.netmonitor.m0.b0.w(i6, i2));
    }

    private com.parizene.netmonitor.m0.b0.p o(com.parizene.netmonitor.m0.b0.y yVar, com.parizene.netmonitor.m0.d0.f.m mVar) {
        int iA = mVar.f13432d.a();
        int iB = mVar.f13432d.b();
        c.h.k.d<String, String> dVar = (iA == Integer.MAX_VALUE || iB == Integer.MAX_VALUE) ? new c.h.k.d<>(yVar.d(), yVar.f()) : this.a.a(iA, iB);
        String str = dVar.a;
        String str2 = dVar.f3105b;
        com.parizene.netmonitor.m0.d0.f.f fVar = mVar.f13432d;
        com.parizene.netmonitor.m0.b0.i iVar = new com.parizene.netmonitor.m0.b0.i(str, str2, fVar.f13413c, fVar.f13414d, fVar.f13415e, fVar.f13416f);
        com.parizene.netmonitor.m0.d0.f.u uVar = mVar.f13433e;
        return new com.parizene.netmonitor.m0.b0.p(mVar.a, iVar, new com.parizene.netmonitor.m0.b0.w(uVar.f13469c, uVar.f13462d));
    }

    public com.parizene.netmonitor.m0.b0.l a(com.parizene.netmonitor.m0.b0.y yVar, com.parizene.netmonitor.m0.d0.f.i iVar) {
        com.parizene.netmonitor.m0.d0.f.b bVar = iVar.f13424d;
        int i2 = bVar.f13389d;
        int i3 = bVar.f13388c;
        int i4 = bVar.f13390e;
        int i5 = bVar.f13391f;
        int i6 = bVar.f13392g;
        if (i5 == 0 || i6 == 0) {
            i6 = Integer.MAX_VALUE;
            i5 = Integer.MAX_VALUE;
        }
        if (i5 < -1296000 || i5 > 1296000 || i6 < -2592000 || i6 > 2592000) {
            i6 = Integer.MAX_VALUE;
            i5 = Integer.MAX_VALUE;
        }
        if (i5 != Integer.MAX_VALUE && i6 != Integer.MAX_VALUE) {
            i5 = (int) (i5 / 0.0144f);
            i6 = (int) (i6 / 0.0144f);
        }
        int i7 = i6;
        com.parizene.netmonitor.m0.d0.f.q qVar = iVar.f13425e;
        return new com.parizene.netmonitor.m0.b0.l(iVar.a, new com.parizene.netmonitor.m0.b0.e(yVar.d(), i2, i3, i4, i5, i7), new com.parizene.netmonitor.m0.b0.s(k.a(qVar.f13439e, qVar.f13442h)));
    }

    public com.parizene.netmonitor.m0.b0.l b(String str, com.parizene.netmonitor.m0.d0.f.a aVar, a0 a0Var) {
        int i2;
        int i3;
        int i4 = aVar.f13375e;
        int i5 = aVar.f13374d;
        int i6 = aVar.a;
        int i7 = aVar.f13372b;
        int i8 = aVar.f13373c;
        int i9 = i4 == -1 ? Integer.MAX_VALUE : i4;
        int i10 = i5 == -1 ? Integer.MAX_VALUE : i5;
        int i11 = i6 == -1 ? Integer.MAX_VALUE : i6;
        if (i7 < -1296000 || i7 > 1296000 || i8 < -2592000 || i8 > 2592000) {
            i8 = Integer.MAX_VALUE;
            i7 = Integer.MAX_VALUE;
        }
        if (i7 == Integer.MAX_VALUE || i8 == Integer.MAX_VALUE) {
            i2 = i8;
            i3 = i7;
        } else {
            i2 = (int) (i8 / 0.0144f);
            i3 = (int) (i7 / 0.0144f);
        }
        if (a0Var != null) {
            int i12 = a0Var.f13377c;
            int i13 = a0Var.f13379e;
            if (i12 == -1) {
                i12 = Integer.MAX_VALUE;
            }
            iA = k.a(i12, i13 != -1 ? i13 : Integer.MAX_VALUE);
        }
        return new com.parizene.netmonitor.m0.b0.l(true, new com.parizene.netmonitor.m0.b0.e(str, i9, i10, i11, i3, i2), new com.parizene.netmonitor.m0.b0.s(iA));
    }

    public com.parizene.netmonitor.m0.b0.k c(com.parizene.netmonitor.m0.b0.y yVar, com.parizene.netmonitor.m0.d0.f.o oVar, d dVar) {
        if (oVar instanceof com.parizene.netmonitor.m0.d0.f.i) {
            return a(yVar, (com.parizene.netmonitor.m0.d0.f.i) oVar);
        }
        if (oVar instanceof com.parizene.netmonitor.m0.d0.f.j) {
            return f(yVar, (com.parizene.netmonitor.m0.d0.f.j) oVar, dVar.f13352g);
        }
        if (oVar instanceof com.parizene.netmonitor.m0.d0.f.n) {
            return p(yVar, (com.parizene.netmonitor.m0.d0.f.n) oVar, dVar.f13354i);
        }
        if (oVar instanceof com.parizene.netmonitor.m0.d0.f.k) {
            return i(yVar, (com.parizene.netmonitor.m0.d0.f.k) oVar, dVar.f13356k);
        }
        if (oVar instanceof com.parizene.netmonitor.m0.d0.f.m) {
            return o(yVar, (com.parizene.netmonitor.m0.d0.f.m) oVar);
        }
        if (oVar instanceof com.parizene.netmonitor.m0.d0.f.l) {
            return l(yVar, (com.parizene.netmonitor.m0.d0.f.l) oVar);
        }
        return null;
    }

    public com.parizene.netmonitor.m0.b0.k d(com.parizene.netmonitor.m0.b0.y yVar, com.parizene.netmonitor.m0.d0.f.p pVar, a0 a0Var, d dVar) {
        if (pVar instanceof com.parizene.netmonitor.m0.d0.f.a) {
            return b(yVar.d(), (com.parizene.netmonitor.m0.d0.f.a) pVar, a0Var);
        }
        if (!(pVar instanceof com.parizene.netmonitor.m0.d0.f.x)) {
            return null;
        }
        com.parizene.netmonitor.m0.d0.f.x xVar = (com.parizene.netmonitor.m0.d0.f.x) pVar;
        if (w.b(yVar.i()) || (w.f(yVar.i()) && xVar.f13470b <= 65535)) {
            return g(yVar.d(), yVar.f(), xVar, a0Var, dVar.a);
        }
        if (w.g(yVar.i()) || (w.f(yVar.i()) && xVar.f13470b > 65535)) {
            return q(yVar.d(), yVar.f(), xVar, a0Var, dVar.f13348c);
        }
        if (w.c(yVar.i())) {
            return j(yVar.d(), yVar.f(), xVar, a0Var);
        }
        if (w.e(yVar.i())) {
            return n(yVar.d(), yVar.f(), xVar, a0Var);
        }
        if (w.d(yVar.i())) {
            return m(yVar.d(), yVar.f(), xVar, a0Var);
        }
        return null;
    }

    public com.parizene.netmonitor.m0.b0.k e(com.parizene.netmonitor.m0.b0.y yVar, com.parizene.netmonitor.m0.d0.f.y yVar2, d dVar) {
        int i2 = yVar2.f13475e;
        if (w.f(i2)) {
            i2 = yVar.i();
        }
        if (w.b(i2)) {
            return h(yVar.d(), yVar.f(), yVar2);
        }
        if (w.g(i2)) {
            return r(yVar.d(), yVar.f(), yVar2, dVar.f13350e);
        }
        if (w.c(i2)) {
            return k(yVar.d(), yVar.f(), yVar2);
        }
        return null;
    }

    public com.parizene.netmonitor.m0.b0.m f(com.parizene.netmonitor.m0.b0.y yVar, com.parizene.netmonitor.m0.d0.f.j jVar, com.parizene.netmonitor.m0.b0.c cVar) {
        int iC;
        com.parizene.netmonitor.m0.d0.f.c cVar2 = jVar.f13426d;
        int i2 = cVar2.f13393c;
        int i3 = cVar2.f13394d;
        int i4 = cVar2.f13395e;
        int i5 = cVar2.f13396f;
        int i6 = cVar2.f13398h;
        int i7 = cVar2.f13399i;
        if (i2 == 0 && i3 == 0) {
            i2 = Integer.MAX_VALUE;
            i3 = Integer.MAX_VALUE;
        }
        int i8 = (i4 == 0 || i4 == 65535) ? Integer.MAX_VALUE : i4;
        int i9 = (i5 == -1 || i5 == 65535) ? Integer.MAX_VALUE : i5;
        int i10 = i6 == 0 ? Integer.MAX_VALUE : i6;
        int i11 = i7 == 0 ? Integer.MAX_VALUE : i7;
        com.parizene.netmonitor.m0.d0.f.r rVar = jVar.f13427e;
        int i12 = rVar.f13445d;
        int i13 = rVar.f13448g;
        if (i12 == 99) {
            i12 = Integer.MAX_VALUE;
        }
        if (i13 == 0) {
            i13 = Integer.MAX_VALUE;
        }
        c.h.k.d<String, String> dVar = (i2 == Integer.MAX_VALUE || i3 == Integer.MAX_VALUE) ? new c.h.k.d<>(yVar.d(), yVar.f()) : this.a.a(i2, i3);
        int iB = k.b(i12, cVar);
        if (iB == Integer.MAX_VALUE && (iB = jVar.f13427e.f13469c) == -51 && jVar.a && (iC = yVar.c()) != Integer.MAX_VALUE) {
            iB = iC;
        }
        return new com.parizene.netmonitor.m0.b0.m(jVar.a, new com.parizene.netmonitor.m0.b0.f(dVar.a, dVar.f3105b, i8, i9, i10, i11), new com.parizene.netmonitor.m0.b0.t(iB, i13));
    }

    public com.parizene.netmonitor.m0.b0.m g(String str, String str2, com.parizene.netmonitor.m0.d0.f.x xVar, a0 a0Var, com.parizene.netmonitor.m0.b0.c cVar) {
        int iE;
        int i2 = xVar.a;
        int i3 = xVar.f13470b;
        int i4 = (i2 == -1 || i2 == 0) ? Integer.MAX_VALUE : i2;
        int i5 = (i3 == -1 || i3 == 0) ? Integer.MAX_VALUE : i3;
        if (a0Var != null) {
            int i6 = a0Var.a;
            if (i6 == 99) {
                i6 = Integer.MAX_VALUE;
            }
            iE = k.e(i6, a0Var.r, cVar);
            if (iE == Integer.MAX_VALUE) {
                iE = a0Var.q;
            }
        } else {
            iE = Integer.MAX_VALUE;
        }
        return new com.parizene.netmonitor.m0.b0.m(true, new com.parizene.netmonitor.m0.b0.f(str, str2, i4, i5, Integer.MAX_VALUE, Integer.MAX_VALUE), new com.parizene.netmonitor.m0.b0.t(iE, Integer.MAX_VALUE));
    }

    public com.parizene.netmonitor.m0.b0.m h(String str, String str2, com.parizene.netmonitor.m0.d0.f.y yVar) {
        int i2 = yVar.f13473c;
        int i3 = yVar.f13472b;
        int i4 = (i2 == -1 || i2 == 0) ? Integer.MAX_VALUE : i2;
        int i5 = (i3 == -1 || i3 == 65535 || i3 == 0) ? Integer.MAX_VALUE : i3;
        int i6 = yVar.a;
        if (i6 == 99) {
            i6 = Integer.MAX_VALUE;
        }
        return new com.parizene.netmonitor.m0.b0.m(false, new com.parizene.netmonitor.m0.b0.f(str, str2, i4, i5, Integer.MAX_VALUE, Integer.MAX_VALUE), new com.parizene.netmonitor.m0.b0.t(k.e(i6, Integer.MAX_VALUE, com.parizene.netmonitor.m0.b0.c.DEFAULT), Integer.MAX_VALUE));
    }

    public com.parizene.netmonitor.m0.b0.n i(com.parizene.netmonitor.m0.b0.y yVar, com.parizene.netmonitor.m0.d0.f.k kVar, com.parizene.netmonitor.m0.b0.c cVar) {
        int i2;
        int i3;
        int i4;
        com.parizene.netmonitor.m0.d0.f.d dVar = kVar.f13428d;
        int i5 = dVar.f13400c;
        int i6 = dVar.f13401d;
        int i7 = dVar.f13402e;
        int i8 = dVar.f13403f;
        int i9 = dVar.f13404g;
        int i10 = dVar.f13405h;
        int i11 = dVar.f13406i;
        if (i5 == 0 && i6 == 0) {
            i5 = Integer.MAX_VALUE;
            i6 = Integer.MAX_VALUE;
        }
        int i12 = (i7 == 65535 || i7 == 0) ? Integer.MAX_VALUE : i7;
        int i13 = (i8 == 268435455 || i8 == -1 || i8 == 0) ? Integer.MAX_VALUE : i8;
        int i14 = i10 == 0 ? Integer.MAX_VALUE : i10;
        com.parizene.netmonitor.m0.d0.f.s sVar = kVar.f13429e;
        int iAbs = sVar.f13449d;
        int i15 = sVar.f13450e;
        int i16 = sVar.f13451f;
        int i17 = sVar.f13452g;
        int i18 = sVar.f13453h;
        int i19 = sVar.f13454i;
        int i20 = sVar.f13455j;
        if (p.b.g()) {
            iAbs = Math.abs(i16);
            if (iAbs == 255) {
                iAbs = Integer.MAX_VALUE;
            }
            if (i17 == -255) {
                i17 = Integer.MAX_VALUE;
            }
            i2 = i17;
            if (i19 == 255) {
                i19 = Integer.MAX_VALUE;
            }
            i16 = Integer.MAX_VALUE;
        } else {
            i2 = i17;
        }
        if (iAbs == 99) {
            iAbs = Integer.MAX_VALUE;
        }
        int i21 = (i18 == 268435455 || i18 == 0) ? Integer.MAX_VALUE : i18;
        int i22 = (i19 == 268435455 || i19 == 0) ? Integer.MAX_VALUE : i19;
        if (i20 == 268435455 || i20 == 0) {
            i3 = Integer.MAX_VALUE;
            i4 = Integer.MAX_VALUE;
        } else {
            i4 = i20;
            i3 = Integer.MAX_VALUE;
        }
        c.h.k.d<String, String> dVar2 = (i5 == i3 || i6 == i3) ? new c.h.k.d<>(yVar.d(), yVar.f()) : this.a.a(i5, i6);
        int iC = k.c(iAbs, i16, cVar);
        if (iC == Integer.MAX_VALUE) {
            iC = kVar.f13429e.f13469c;
        }
        return new com.parizene.netmonitor.m0.b0.n(kVar.a, new com.parizene.netmonitor.m0.b0.g(dVar2.a, dVar2.f3105b, i12, i13, i9, i14, i11), new com.parizene.netmonitor.m0.b0.u(iC, i15, i2, i21, i22, i4));
    }

    public com.parizene.netmonitor.m0.b0.n j(String str, String str2, com.parizene.netmonitor.m0.d0.f.x xVar, a0 a0Var) {
        int i2;
        int i3;
        int i4;
        int i5 = xVar.a;
        int i6 = xVar.f13470b;
        int i7 = xVar.f13471c;
        int iF = Integer.MAX_VALUE;
        int i8 = (i5 == -1 || i5 == 65535) ? Integer.MAX_VALUE : i5;
        int i9 = i6 == -1 ? Integer.MAX_VALUE : i6;
        int i10 = (i7 == -1 || i7 == 0) ? Integer.MAX_VALUE : i7;
        if (a0Var != null) {
            int i11 = a0Var.a;
            int i12 = a0Var.f13382h;
            int i13 = a0Var.f13383i;
            int i14 = a0Var.f13384j;
            int i15 = a0Var.f13385k;
            int i16 = a0Var.f13386l;
            if (i13 == 0) {
                i13 = Integer.MAX_VALUE;
            }
            if (i14 == 0) {
                i14 = Integer.MAX_VALUE;
            }
            if (i15 == 0) {
                i15 = Integer.MAX_VALUE;
            }
            if (i16 == 0 || i16 == -1) {
                i16 = Integer.MAX_VALUE;
            }
            if (i12 == 99 || i12 == 0 || i12 == -1) {
                i12 = Integer.MAX_VALUE;
            }
            if (i11 != 99 && i11 != 0) {
                iF = i11;
            }
            iF = k.f(i12, iF, i13);
            i4 = i16;
            i2 = i14;
            i3 = i15;
        } else {
            i2 = Integer.MAX_VALUE;
            i3 = Integer.MAX_VALUE;
            i4 = Integer.MAX_VALUE;
        }
        return new com.parizene.netmonitor.m0.b0.n(true, new com.parizene.netmonitor.m0.b0.g(str, str2, i8, i9, i10, Integer.MAX_VALUE, Integer.MAX_VALUE), new com.parizene.netmonitor.m0.b0.u(iF, Integer.MAX_VALUE, i2, i3, i4, Integer.MAX_VALUE));
    }

    public com.parizene.netmonitor.m0.b0.n k(String str, String str2, com.parizene.netmonitor.m0.d0.f.y yVar) {
        int i2 = yVar.f13473c;
        int i3 = yVar.f13472b;
        int i4 = yVar.f13474d;
        int i5 = i2 == -1 ? Integer.MAX_VALUE : i2;
        int i6 = i3 == -1 ? Integer.MAX_VALUE : i3;
        int i7 = i4 == -1 ? Integer.MAX_VALUE : i4;
        int i8 = yVar.a;
        if (i8 == 99) {
            i8 = Integer.MAX_VALUE;
        }
        return new com.parizene.netmonitor.m0.b0.n(false, new com.parizene.netmonitor.m0.b0.g(str, str2, i5, i6, i7, Integer.MAX_VALUE, Integer.MAX_VALUE), new com.parizene.netmonitor.m0.b0.u(k.f(i8, Integer.MAX_VALUE, Integer.MAX_VALUE), Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE));
    }

    public com.parizene.netmonitor.m0.b0.q p(com.parizene.netmonitor.m0.b0.y yVar, com.parizene.netmonitor.m0.d0.f.n nVar, com.parizene.netmonitor.m0.b0.c cVar) {
        com.parizene.netmonitor.m0.d0.f.g gVar = nVar.f13434d;
        int i2 = gVar.f13417c;
        int i3 = gVar.f13418d;
        int i4 = gVar.f13419e;
        int i5 = gVar.f13420f;
        int i6 = gVar.f13421g;
        int i7 = gVar.f13422h;
        if (i2 == 0 && i3 == 0) {
            i2 = Integer.MAX_VALUE;
            i3 = Integer.MAX_VALUE;
        }
        int i8 = (i4 == 65535 || i4 == 0) ? Integer.MAX_VALUE : i4;
        if (i5 == -1 || i5 == 0) {
            i5 = Integer.MAX_VALUE;
        }
        int i9 = i7 == 0 ? Integer.MAX_VALUE : i7;
        int i10 = ((p.b.c() || p.b.a() || p.b.b() || p.b.f()) && i5 >= 1 && i5 <= 32) ? Integer.MAX_VALUE : i5;
        com.parizene.netmonitor.m0.d0.f.v vVar = nVar.f13435e;
        int i11 = vVar.f13463d;
        int i12 = vVar.f13467h;
        if (i11 == 99) {
            i11 = Integer.MAX_VALUE;
        }
        c.h.k.d<String, String> dVar = (i2 == Integer.MAX_VALUE || i3 == Integer.MAX_VALUE) ? new c.h.k.d<>(yVar.d(), yVar.f()) : this.a.a(i2, i3);
        int iD = k.d(i11, cVar);
        if (iD == Integer.MAX_VALUE) {
            iD = nVar.f13435e.f13464e;
        }
        if (iD == Integer.MAX_VALUE) {
            iD = nVar.f13435e.f13469c;
        }
        return new com.parizene.netmonitor.m0.b0.q(nVar.a, new com.parizene.netmonitor.m0.b0.j(dVar.a, dVar.f3105b, i8, i10, i6, i9), new com.parizene.netmonitor.m0.b0.x(iD, i12));
    }

    public com.parizene.netmonitor.m0.b0.q q(String str, String str2, com.parizene.netmonitor.m0.d0.f.x xVar, a0 a0Var, com.parizene.netmonitor.m0.b0.c cVar) {
        int iG;
        int i2 = xVar.a;
        int i3 = xVar.f13470b;
        int i4 = xVar.f13471c;
        int i5 = i2 == -1 ? Integer.MAX_VALUE : i2;
        int i6 = i3 == -1 ? Integer.MAX_VALUE : i3;
        int i7 = i4 == -1 ? Integer.MAX_VALUE : i4;
        if (a0Var != null) {
            int i8 = a0Var.a;
            if (i8 == 99) {
                i8 = Integer.MAX_VALUE;
            }
            iG = k.g(i8, a0Var.r, cVar);
            if (iG == Integer.MAX_VALUE) {
                iG = a0Var.q;
            }
        } else {
            iG = Integer.MAX_VALUE;
        }
        return new com.parizene.netmonitor.m0.b0.q(true, new com.parizene.netmonitor.m0.b0.j(str, str2, i5, i6, i7, Integer.MAX_VALUE), new com.parizene.netmonitor.m0.b0.x(iG, Integer.MAX_VALUE));
    }

    public com.parizene.netmonitor.m0.b0.q r(String str, String str2, com.parizene.netmonitor.m0.d0.f.y yVar, com.parizene.netmonitor.m0.b0.c cVar) {
        com.parizene.netmonitor.m0.b0.c cVar2;
        int i2 = yVar.f13473c;
        int i3 = yVar.f13472b;
        int i4 = yVar.f13474d;
        if ((p.a.a() || p.a.b()) && i4 > 65535) {
            i2 = i4 >> 16;
            i3 = i4 & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
            if (i3 == 65535) {
                i3 = Integer.MAX_VALUE;
            }
            i4 = Integer.MAX_VALUE;
        }
        int i5 = i2 == -1 ? Integer.MAX_VALUE : i2;
        int i6 = (i3 == -1 || i3 == 0) ? Integer.MAX_VALUE : i3;
        int i7 = i4 == -1 ? Integer.MAX_VALUE : i4;
        int i8 = yVar.a;
        if (i8 == 99) {
            cVar2 = cVar;
            i8 = Integer.MAX_VALUE;
        } else {
            cVar2 = cVar;
        }
        return new com.parizene.netmonitor.m0.b0.q(false, new com.parizene.netmonitor.m0.b0.j(str, str2, i5, i6, i7, Integer.MAX_VALUE), new com.parizene.netmonitor.m0.b0.x(k.g(i8, Integer.MAX_VALUE, cVar2), Integer.MAX_VALUE));
    }
}