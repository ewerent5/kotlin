package c.f.b.k.m;

import c.f.b.k.d;
import c.f.b.k.e;
import c.f.b.k.m.f;
import c.f.b.k.m.p;

/* compiled from: HorizontalWidgetRun.java */
/* loaded from: classes.dex */
public class l extends p {

    /* renamed from: k, reason: collision with root package name */
    private static int[] f2921k = new int[2];

    /* compiled from: HorizontalWidgetRun.java */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[p.b.values().length];
            a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(c.f.b.k.e eVar) {
        super(eVar);
        this.f2950h.f2903e = f.a.LEFT;
        this.f2951i.f2903e = f.a.RIGHT;
        this.f2948f = 0;
    }

    private void q(int[] iArr, int i2, int i3, int i4, int i5, float f2, int i6) {
        int i7 = i3 - i2;
        int i8 = i5 - i4;
        if (i6 != -1) {
            if (i6 == 0) {
                iArr[0] = (int) ((i8 * f2) + 0.5f);
                iArr[1] = i8;
                return;
            } else {
                if (i6 != 1) {
                    return;
                }
                iArr[0] = i7;
                iArr[1] = (int) ((i7 * f2) + 0.5f);
                return;
            }
        }
        int i9 = (int) ((i8 * f2) + 0.5f);
        int i10 = (int) ((i7 / f2) + 0.5f);
        if (i9 <= i7 && i8 <= i8) {
            iArr[0] = i9;
            iArr[1] = i8;
        } else {
            if (i7 > i7 || i10 > i8) {
                return;
            }
            iArr[0] = i7;
            iArr[1] = i10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x02e2  */
    @Override // c.f.b.k.m.p, c.f.b.k.m.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(c.f.b.k.m.d r17) {
        /*
            Method dump skipped, instructions count: 1095
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.b.k.m.l.a(c.f.b.k.m.d):void");
    }

    @Override // c.f.b.k.m.p
    void d() {
        c.f.b.k.e eVarI;
        c.f.b.k.e eVarI2;
        c.f.b.k.e eVar = this.f2944b;
        if (eVar.f2858b) {
            this.f2947e.d(eVar.R());
        }
        if (this.f2947e.f2908j) {
            e.b bVar = this.f2946d;
            e.b bVar2 = e.b.MATCH_PARENT;
            if (bVar == bVar2 && (((eVarI = this.f2944b.I()) != null && eVarI.y() == e.b.FIXED) || eVarI.y() == bVar2)) {
                b(this.f2950h, eVarI.f2862f.f2950h, this.f2944b.I.e());
                b(this.f2951i, eVarI.f2862f.f2951i, -this.f2944b.K.e());
                return;
            }
        } else {
            e.b bVarY = this.f2944b.y();
            this.f2946d = bVarY;
            if (bVarY != e.b.MATCH_CONSTRAINT) {
                e.b bVar3 = e.b.MATCH_PARENT;
                if (bVarY == bVar3 && (((eVarI2 = this.f2944b.I()) != null && eVarI2.y() == e.b.FIXED) || eVarI2.y() == bVar3)) {
                    int iR = (eVarI2.R() - this.f2944b.I.e()) - this.f2944b.K.e();
                    b(this.f2950h, eVarI2.f2862f.f2950h, this.f2944b.I.e());
                    b(this.f2951i, eVarI2.f2862f.f2951i, -this.f2944b.K.e());
                    this.f2947e.d(iR);
                    return;
                }
                if (this.f2946d == e.b.FIXED) {
                    this.f2947e.d(this.f2944b.R());
                }
            }
        }
        g gVar = this.f2947e;
        if (gVar.f2908j) {
            c.f.b.k.e eVar2 = this.f2944b;
            if (eVar2.f2858b) {
                c.f.b.k.d[] dVarArr = eVar2.Q;
                if (dVarArr[0].f2845f != null && dVarArr[1].f2845f != null) {
                    if (eVar2.Z()) {
                        this.f2950h.f2904f = this.f2944b.Q[0].e();
                        this.f2951i.f2904f = -this.f2944b.Q[1].e();
                        return;
                    }
                    f fVarH = h(this.f2944b.Q[0]);
                    if (fVarH != null) {
                        b(this.f2950h, fVarH, this.f2944b.Q[0].e());
                    }
                    f fVarH2 = h(this.f2944b.Q[1]);
                    if (fVarH2 != null) {
                        b(this.f2951i, fVarH2, -this.f2944b.Q[1].e());
                    }
                    this.f2950h.f2900b = true;
                    this.f2951i.f2900b = true;
                    return;
                }
                if (dVarArr[0].f2845f != null) {
                    f fVarH3 = h(dVarArr[0]);
                    if (fVarH3 != null) {
                        b(this.f2950h, fVarH3, this.f2944b.Q[0].e());
                        b(this.f2951i, this.f2950h, this.f2947e.f2905g);
                        return;
                    }
                    return;
                }
                if (dVarArr[1].f2845f != null) {
                    f fVarH4 = h(dVarArr[1]);
                    if (fVarH4 != null) {
                        b(this.f2951i, fVarH4, -this.f2944b.Q[1].e());
                        b(this.f2950h, this.f2951i, -this.f2947e.f2905g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof c.f.b.k.h) || eVar2.I() == null || this.f2944b.m(d.b.CENTER).f2845f != null) {
                    return;
                }
                b(this.f2950h, this.f2944b.I().f2862f.f2950h, this.f2944b.S());
                b(this.f2951i, this.f2950h, this.f2947e.f2905g);
                return;
            }
        }
        if (this.f2946d == e.b.MATCH_CONSTRAINT) {
            c.f.b.k.e eVar3 = this.f2944b;
            int i2 = eVar3.q;
            if (i2 == 2) {
                c.f.b.k.e eVarI3 = eVar3.I();
                if (eVarI3 != null) {
                    g gVar2 = eVarI3.f2863g.f2947e;
                    this.f2947e.f2910l.add(gVar2);
                    gVar2.f2909k.add(this.f2947e);
                    g gVar3 = this.f2947e;
                    gVar3.f2900b = true;
                    gVar3.f2909k.add(this.f2950h);
                    this.f2947e.f2909k.add(this.f2951i);
                }
            } else if (i2 == 3) {
                if (eVar3.r == 3) {
                    this.f2950h.a = this;
                    this.f2951i.a = this;
                    n nVar = eVar3.f2863g;
                    nVar.f2950h.a = this;
                    nVar.f2951i.a = this;
                    gVar.a = this;
                    if (eVar3.b0()) {
                        this.f2947e.f2910l.add(this.f2944b.f2863g.f2947e);
                        this.f2944b.f2863g.f2947e.f2909k.add(this.f2947e);
                        n nVar2 = this.f2944b.f2863g;
                        nVar2.f2947e.a = this;
                        this.f2947e.f2910l.add(nVar2.f2950h);
                        this.f2947e.f2910l.add(this.f2944b.f2863g.f2951i);
                        this.f2944b.f2863g.f2950h.f2909k.add(this.f2947e);
                        this.f2944b.f2863g.f2951i.f2909k.add(this.f2947e);
                    } else if (this.f2944b.Z()) {
                        this.f2944b.f2863g.f2947e.f2910l.add(this.f2947e);
                        this.f2947e.f2909k.add(this.f2944b.f2863g.f2947e);
                    } else {
                        this.f2944b.f2863g.f2947e.f2910l.add(this.f2947e);
                    }
                } else {
                    g gVar4 = eVar3.f2863g.f2947e;
                    gVar.f2910l.add(gVar4);
                    gVar4.f2909k.add(this.f2947e);
                    this.f2944b.f2863g.f2950h.f2909k.add(this.f2947e);
                    this.f2944b.f2863g.f2951i.f2909k.add(this.f2947e);
                    g gVar5 = this.f2947e;
                    gVar5.f2900b = true;
                    gVar5.f2909k.add(this.f2950h);
                    this.f2947e.f2909k.add(this.f2951i);
                    this.f2950h.f2910l.add(this.f2947e);
                    this.f2951i.f2910l.add(this.f2947e);
                }
            }
        }
        c.f.b.k.e eVar4 = this.f2944b;
        c.f.b.k.d[] dVarArr2 = eVar4.Q;
        if (dVarArr2[0].f2845f != null && dVarArr2[1].f2845f != null) {
            if (eVar4.Z()) {
                this.f2950h.f2904f = this.f2944b.Q[0].e();
                this.f2951i.f2904f = -this.f2944b.Q[1].e();
                return;
            }
            f fVarH5 = h(this.f2944b.Q[0]);
            f fVarH6 = h(this.f2944b.Q[1]);
            fVarH5.b(this);
            fVarH6.b(this);
            this.f2952j = p.b.CENTER;
            return;
        }
        if (dVarArr2[0].f2845f != null) {
            f fVarH7 = h(dVarArr2[0]);
            if (fVarH7 != null) {
                b(this.f2950h, fVarH7, this.f2944b.Q[0].e());
                c(this.f2951i, this.f2950h, 1, this.f2947e);
                return;
            }
            return;
        }
        if (dVarArr2[1].f2845f != null) {
            f fVarH8 = h(dVarArr2[1]);
            if (fVarH8 != null) {
                b(this.f2951i, fVarH8, -this.f2944b.Q[1].e());
                c(this.f2950h, this.f2951i, -1, this.f2947e);
                return;
            }
            return;
        }
        if ((eVar4 instanceof c.f.b.k.h) || eVar4.I() == null) {
            return;
        }
        b(this.f2950h, this.f2944b.I().f2862f.f2950h, this.f2944b.S());
        c(this.f2951i, this.f2950h, 1, this.f2947e);
    }

    @Override // c.f.b.k.m.p
    public void e() {
        f fVar = this.f2950h;
        if (fVar.f2908j) {
            this.f2944b.V0(fVar.f2905g);
        }
    }

    @Override // c.f.b.k.m.p
    void f() {
        this.f2945c = null;
        this.f2950h.c();
        this.f2951i.c();
        this.f2947e.c();
        this.f2949g = false;
    }

    @Override // c.f.b.k.m.p
    boolean m() {
        return this.f2946d != e.b.MATCH_CONSTRAINT || this.f2944b.q == 0;
    }

    void r() {
        this.f2949g = false;
        this.f2950h.c();
        this.f2950h.f2908j = false;
        this.f2951i.c();
        this.f2951i.f2908j = false;
        this.f2947e.f2908j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f2944b.r();
    }
}