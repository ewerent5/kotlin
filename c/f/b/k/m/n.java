package c.f.b.k.m;

import c.f.b.k.d;
import c.f.b.k.e;
import c.f.b.k.m.f;
import c.f.b.k.m.p;

/* compiled from: VerticalWidgetRun.java */
/* loaded from: classes.dex */
public class n extends p {

    /* renamed from: k, reason: collision with root package name */
    public f f2929k;

    /* renamed from: l, reason: collision with root package name */
    g f2930l;

    /* compiled from: VerticalWidgetRun.java */
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

    public n(c.f.b.k.e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f2929k = fVar;
        this.f2930l = null;
        this.f2950h.f2903e = f.a.TOP;
        this.f2951i.f2903e = f.a.BOTTOM;
        fVar.f2903e = f.a.BASELINE;
        this.f2948f = 1;
    }

    @Override // c.f.b.k.m.p, c.f.b.k.m.d
    public void a(d dVar) {
        float f2;
        float fT;
        float fT2;
        int i2;
        int i3 = a.a[this.f2952j.ordinal()];
        if (i3 == 1) {
            p(dVar);
        } else if (i3 == 2) {
            o(dVar);
        } else if (i3 == 3) {
            c.f.b.k.e eVar = this.f2944b;
            n(dVar, eVar.J, eVar.L, 1);
            return;
        }
        g gVar = this.f2947e;
        if (gVar.f2901c && !gVar.f2908j && this.f2946d == e.b.MATCH_CONSTRAINT) {
            c.f.b.k.e eVar2 = this.f2944b;
            int i4 = eVar2.r;
            if (i4 == 2) {
                c.f.b.k.e eVarI = eVar2.I();
                if (eVarI != null) {
                    if (eVarI.f2863g.f2947e.f2908j) {
                        this.f2947e.d((int) ((r7.f2905g * this.f2944b.y) + 0.5f));
                    }
                }
            } else if (i4 == 3 && eVar2.f2862f.f2947e.f2908j) {
                int iU = eVar2.u();
                if (iU == -1) {
                    c.f.b.k.e eVar3 = this.f2944b;
                    f2 = eVar3.f2862f.f2947e.f2905g;
                    fT = eVar3.t();
                } else if (iU == 0) {
                    fT2 = r7.f2862f.f2947e.f2905g * this.f2944b.t();
                    i2 = (int) (fT2 + 0.5f);
                    this.f2947e.d(i2);
                } else if (iU != 1) {
                    i2 = 0;
                    this.f2947e.d(i2);
                } else {
                    c.f.b.k.e eVar4 = this.f2944b;
                    f2 = eVar4.f2862f.f2947e.f2905g;
                    fT = eVar4.t();
                }
                fT2 = f2 / fT;
                i2 = (int) (fT2 + 0.5f);
                this.f2947e.d(i2);
            }
        }
        f fVar = this.f2950h;
        if (fVar.f2901c) {
            f fVar2 = this.f2951i;
            if (fVar2.f2901c) {
                if (fVar.f2908j && fVar2.f2908j && this.f2947e.f2908j) {
                    return;
                }
                if (!this.f2947e.f2908j && this.f2946d == e.b.MATCH_CONSTRAINT) {
                    c.f.b.k.e eVar5 = this.f2944b;
                    if (eVar5.q == 0 && !eVar5.b0()) {
                        f fVar3 = this.f2950h.f2910l.get(0);
                        f fVar4 = this.f2951i.f2910l.get(0);
                        int i5 = fVar3.f2905g;
                        f fVar5 = this.f2950h;
                        int i6 = i5 + fVar5.f2904f;
                        int i7 = fVar4.f2905g + this.f2951i.f2904f;
                        fVar5.d(i6);
                        this.f2951i.d(i7);
                        this.f2947e.d(i7 - i6);
                        return;
                    }
                }
                if (!this.f2947e.f2908j && this.f2946d == e.b.MATCH_CONSTRAINT && this.a == 1 && this.f2950h.f2910l.size() > 0 && this.f2951i.f2910l.size() > 0) {
                    f fVar6 = this.f2950h.f2910l.get(0);
                    int i8 = (this.f2951i.f2910l.get(0).f2905g + this.f2951i.f2904f) - (fVar6.f2905g + this.f2950h.f2904f);
                    g gVar2 = this.f2947e;
                    int i9 = gVar2.f2920m;
                    if (i8 < i9) {
                        gVar2.d(i8);
                    } else {
                        gVar2.d(i9);
                    }
                }
                if (this.f2947e.f2908j && this.f2950h.f2910l.size() > 0 && this.f2951i.f2910l.size() > 0) {
                    f fVar7 = this.f2950h.f2910l.get(0);
                    f fVar8 = this.f2951i.f2910l.get(0);
                    int i10 = fVar7.f2905g + this.f2950h.f2904f;
                    int i11 = fVar8.f2905g + this.f2951i.f2904f;
                    float fM = this.f2944b.M();
                    if (fVar7 == fVar8) {
                        i10 = fVar7.f2905g;
                        i11 = fVar8.f2905g;
                        fM = 0.5f;
                    }
                    this.f2950h.d((int) (i10 + 0.5f + (((i11 - i10) - this.f2947e.f2905g) * fM)));
                    this.f2951i.d(this.f2950h.f2905g + this.f2947e.f2905g);
                }
            }
        }
    }

    @Override // c.f.b.k.m.p
    void d() {
        c.f.b.k.e eVarI;
        c.f.b.k.e eVarI2;
        c.f.b.k.e eVar = this.f2944b;
        if (eVar.f2858b) {
            this.f2947e.d(eVar.v());
        }
        if (!this.f2947e.f2908j) {
            this.f2946d = this.f2944b.O();
            if (this.f2944b.U()) {
                this.f2930l = new c.f.b.k.m.a(this);
            }
            e.b bVar = this.f2946d;
            if (bVar != e.b.MATCH_CONSTRAINT) {
                if (bVar == e.b.MATCH_PARENT && (eVarI2 = this.f2944b.I()) != null && eVarI2.O() == e.b.FIXED) {
                    int iV = (eVarI2.v() - this.f2944b.J.e()) - this.f2944b.L.e();
                    b(this.f2950h, eVarI2.f2863g.f2950h, this.f2944b.J.e());
                    b(this.f2951i, eVarI2.f2863g.f2951i, -this.f2944b.L.e());
                    this.f2947e.d(iV);
                    return;
                }
                if (this.f2946d == e.b.FIXED) {
                    this.f2947e.d(this.f2944b.v());
                }
            }
        } else if (this.f2946d == e.b.MATCH_PARENT && (eVarI = this.f2944b.I()) != null && eVarI.O() == e.b.FIXED) {
            b(this.f2950h, eVarI.f2863g.f2950h, this.f2944b.J.e());
            b(this.f2951i, eVarI.f2863g.f2951i, -this.f2944b.L.e());
            return;
        }
        g gVar = this.f2947e;
        boolean z = gVar.f2908j;
        if (z) {
            c.f.b.k.e eVar2 = this.f2944b;
            if (eVar2.f2858b) {
                c.f.b.k.d[] dVarArr = eVar2.Q;
                if (dVarArr[2].f2845f != null && dVarArr[3].f2845f != null) {
                    if (eVar2.b0()) {
                        this.f2950h.f2904f = this.f2944b.Q[2].e();
                        this.f2951i.f2904f = -this.f2944b.Q[3].e();
                    } else {
                        f fVarH = h(this.f2944b.Q[2]);
                        if (fVarH != null) {
                            b(this.f2950h, fVarH, this.f2944b.Q[2].e());
                        }
                        f fVarH2 = h(this.f2944b.Q[3]);
                        if (fVarH2 != null) {
                            b(this.f2951i, fVarH2, -this.f2944b.Q[3].e());
                        }
                        this.f2950h.f2900b = true;
                        this.f2951i.f2900b = true;
                    }
                    if (this.f2944b.U()) {
                        b(this.f2929k, this.f2950h, this.f2944b.n());
                        return;
                    }
                    return;
                }
                if (dVarArr[2].f2845f != null) {
                    f fVarH3 = h(dVarArr[2]);
                    if (fVarH3 != null) {
                        b(this.f2950h, fVarH3, this.f2944b.Q[2].e());
                        b(this.f2951i, this.f2950h, this.f2947e.f2905g);
                        if (this.f2944b.U()) {
                            b(this.f2929k, this.f2950h, this.f2944b.n());
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (dVarArr[3].f2845f != null) {
                    f fVarH4 = h(dVarArr[3]);
                    if (fVarH4 != null) {
                        b(this.f2951i, fVarH4, -this.f2944b.Q[3].e());
                        b(this.f2950h, this.f2951i, -this.f2947e.f2905g);
                    }
                    if (this.f2944b.U()) {
                        b(this.f2929k, this.f2950h, this.f2944b.n());
                        return;
                    }
                    return;
                }
                if (dVarArr[4].f2845f != null) {
                    f fVarH5 = h(dVarArr[4]);
                    if (fVarH5 != null) {
                        b(this.f2929k, fVarH5, 0);
                        b(this.f2950h, this.f2929k, -this.f2944b.n());
                        b(this.f2951i, this.f2950h, this.f2947e.f2905g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof c.f.b.k.h) || eVar2.I() == null || this.f2944b.m(d.b.CENTER).f2845f != null) {
                    return;
                }
                b(this.f2950h, this.f2944b.I().f2863g.f2950h, this.f2944b.T());
                b(this.f2951i, this.f2950h, this.f2947e.f2905g);
                if (this.f2944b.U()) {
                    b(this.f2929k, this.f2950h, this.f2944b.n());
                    return;
                }
                return;
            }
        }
        if (z || this.f2946d != e.b.MATCH_CONSTRAINT) {
            gVar.b(this);
        } else {
            c.f.b.k.e eVar3 = this.f2944b;
            int i2 = eVar3.r;
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
            } else if (i2 == 3 && !eVar3.b0()) {
                c.f.b.k.e eVar4 = this.f2944b;
                if (eVar4.q != 3) {
                    g gVar4 = eVar4.f2862f.f2947e;
                    this.f2947e.f2910l.add(gVar4);
                    gVar4.f2909k.add(this.f2947e);
                    g gVar5 = this.f2947e;
                    gVar5.f2900b = true;
                    gVar5.f2909k.add(this.f2950h);
                    this.f2947e.f2909k.add(this.f2951i);
                }
            }
        }
        c.f.b.k.e eVar5 = this.f2944b;
        c.f.b.k.d[] dVarArr2 = eVar5.Q;
        if (dVarArr2[2].f2845f != null && dVarArr2[3].f2845f != null) {
            if (eVar5.b0()) {
                this.f2950h.f2904f = this.f2944b.Q[2].e();
                this.f2951i.f2904f = -this.f2944b.Q[3].e();
            } else {
                f fVarH6 = h(this.f2944b.Q[2]);
                f fVarH7 = h(this.f2944b.Q[3]);
                fVarH6.b(this);
                fVarH7.b(this);
                this.f2952j = p.b.CENTER;
            }
            if (this.f2944b.U()) {
                c(this.f2929k, this.f2950h, 1, this.f2930l);
            }
        } else if (dVarArr2[2].f2845f != null) {
            f fVarH8 = h(dVarArr2[2]);
            if (fVarH8 != null) {
                b(this.f2950h, fVarH8, this.f2944b.Q[2].e());
                c(this.f2951i, this.f2950h, 1, this.f2947e);
                if (this.f2944b.U()) {
                    c(this.f2929k, this.f2950h, 1, this.f2930l);
                }
                e.b bVar2 = this.f2946d;
                e.b bVar3 = e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.f2944b.t() > 0.0f) {
                    l lVar = this.f2944b.f2862f;
                    if (lVar.f2946d == bVar3) {
                        lVar.f2947e.f2909k.add(this.f2947e);
                        this.f2947e.f2910l.add(this.f2944b.f2862f.f2947e);
                        this.f2947e.a = this;
                    }
                }
            }
        } else if (dVarArr2[3].f2845f != null) {
            f fVarH9 = h(dVarArr2[3]);
            if (fVarH9 != null) {
                b(this.f2951i, fVarH9, -this.f2944b.Q[3].e());
                c(this.f2950h, this.f2951i, -1, this.f2947e);
                if (this.f2944b.U()) {
                    c(this.f2929k, this.f2950h, 1, this.f2930l);
                }
            }
        } else if (dVarArr2[4].f2845f != null) {
            f fVarH10 = h(dVarArr2[4]);
            if (fVarH10 != null) {
                b(this.f2929k, fVarH10, 0);
                c(this.f2950h, this.f2929k, -1, this.f2930l);
                c(this.f2951i, this.f2950h, 1, this.f2947e);
            }
        } else if (!(eVar5 instanceof c.f.b.k.h) && eVar5.I() != null) {
            b(this.f2950h, this.f2944b.I().f2863g.f2950h, this.f2944b.T());
            c(this.f2951i, this.f2950h, 1, this.f2947e);
            if (this.f2944b.U()) {
                c(this.f2929k, this.f2950h, 1, this.f2930l);
            }
            e.b bVar4 = this.f2946d;
            e.b bVar5 = e.b.MATCH_CONSTRAINT;
            if (bVar4 == bVar5 && this.f2944b.t() > 0.0f) {
                l lVar2 = this.f2944b.f2862f;
                if (lVar2.f2946d == bVar5) {
                    lVar2.f2947e.f2909k.add(this.f2947e);
                    this.f2947e.f2910l.add(this.f2944b.f2862f.f2947e);
                    this.f2947e.a = this;
                }
            }
        }
        if (this.f2947e.f2910l.size() == 0) {
            this.f2947e.f2901c = true;
        }
    }

    @Override // c.f.b.k.m.p
    public void e() {
        f fVar = this.f2950h;
        if (fVar.f2908j) {
            this.f2944b.W0(fVar.f2905g);
        }
    }

    @Override // c.f.b.k.m.p
    void f() {
        this.f2945c = null;
        this.f2950h.c();
        this.f2951i.c();
        this.f2929k.c();
        this.f2947e.c();
        this.f2949g = false;
    }

    @Override // c.f.b.k.m.p
    boolean m() {
        return this.f2946d != e.b.MATCH_CONSTRAINT || this.f2944b.r == 0;
    }

    void q() {
        this.f2949g = false;
        this.f2950h.c();
        this.f2950h.f2908j = false;
        this.f2951i.c();
        this.f2951i.f2908j = false;
        this.f2929k.c();
        this.f2929k.f2908j = false;
        this.f2947e.f2908j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f2944b.r();
    }
}