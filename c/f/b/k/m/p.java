package c.f.b.k.m;

import c.f.b.k.d;
import c.f.b.k.e;

/* compiled from: WidgetRun.java */
/* loaded from: classes.dex */
public abstract class p implements d {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    c.f.b.k.e f2944b;

    /* renamed from: c, reason: collision with root package name */
    m f2945c;

    /* renamed from: d, reason: collision with root package name */
    protected e.b f2946d;

    /* renamed from: e, reason: collision with root package name */
    g f2947e = new g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f2948f = 0;

    /* renamed from: g, reason: collision with root package name */
    boolean f2949g = false;

    /* renamed from: h, reason: collision with root package name */
    public f f2950h = new f(this);

    /* renamed from: i, reason: collision with root package name */
    public f f2951i = new f(this);

    /* renamed from: j, reason: collision with root package name */
    protected b f2952j = b.NONE;

    /* compiled from: WidgetRun.java */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.b.values().length];
            a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[d.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[d.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: WidgetRun.java */
    enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public p(c.f.b.k.e eVar) {
        this.f2944b = eVar;
    }

    private void l(int i2, int i3) {
        int i4 = this.a;
        if (i4 == 0) {
            this.f2947e.d(g(i3, i2));
            return;
        }
        if (i4 == 1) {
            this.f2947e.d(Math.min(g(this.f2947e.f2920m, i2), i3));
            return;
        }
        if (i4 == 2) {
            c.f.b.k.e eVarI = this.f2944b.I();
            if (eVarI != null) {
                if ((i2 == 0 ? eVarI.f2862f : eVarI.f2863g).f2947e.f2908j) {
                    c.f.b.k.e eVar = this.f2944b;
                    this.f2947e.d(g((int) ((r9.f2905g * (i2 == 0 ? eVar.v : eVar.y)) + 0.5f), i2));
                    return;
                }
                return;
            }
            return;
        }
        if (i4 != 3) {
            return;
        }
        c.f.b.k.e eVar2 = this.f2944b;
        p pVar = eVar2.f2862f;
        e.b bVar = pVar.f2946d;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        if (bVar == bVar2 && pVar.a == 3) {
            n nVar = eVar2.f2863g;
            if (nVar.f2946d == bVar2 && nVar.a == 3) {
                return;
            }
        }
        if (i2 == 0) {
            pVar = eVar2.f2863g;
        }
        if (pVar.f2947e.f2908j) {
            float fT = eVar2.t();
            this.f2947e.d(i2 == 1 ? (int) ((pVar.f2947e.f2905g / fT) + 0.5f) : (int) ((fT * pVar.f2947e.f2905g) + 0.5f));
        }
    }

    @Override // c.f.b.k.m.d
    public void a(d dVar) {
    }

    protected final void b(f fVar, f fVar2, int i2) {
        fVar.f2910l.add(fVar2);
        fVar.f2904f = i2;
        fVar2.f2909k.add(fVar);
    }

    protected final void c(f fVar, f fVar2, int i2, g gVar) {
        fVar.f2910l.add(fVar2);
        fVar.f2910l.add(this.f2947e);
        fVar.f2906h = i2;
        fVar.f2907i = gVar;
        fVar2.f2909k.add(fVar);
        gVar.f2909k.add(fVar);
    }

    abstract void d();

    abstract void e();

    abstract void f();

    protected final int g(int i2, int i3) {
        int iMax;
        if (i3 == 0) {
            c.f.b.k.e eVar = this.f2944b;
            int i4 = eVar.u;
            iMax = Math.max(eVar.t, i2);
            if (i4 > 0) {
                iMax = Math.min(i4, i2);
            }
            if (iMax == i2) {
                return i2;
            }
        } else {
            c.f.b.k.e eVar2 = this.f2944b;
            int i5 = eVar2.x;
            iMax = Math.max(eVar2.w, i2);
            if (i5 > 0) {
                iMax = Math.min(i5, i2);
            }
            if (iMax == i2) {
                return i2;
            }
        }
        return iMax;
    }

    protected final f h(c.f.b.k.d dVar) {
        c.f.b.k.d dVar2 = dVar.f2845f;
        if (dVar2 == null) {
            return null;
        }
        c.f.b.k.e eVar = dVar2.f2843d;
        int i2 = a.a[dVar2.f2844e.ordinal()];
        if (i2 == 1) {
            return eVar.f2862f.f2950h;
        }
        if (i2 == 2) {
            return eVar.f2862f.f2951i;
        }
        if (i2 == 3) {
            return eVar.f2863g.f2950h;
        }
        if (i2 == 4) {
            return eVar.f2863g.f2929k;
        }
        if (i2 != 5) {
            return null;
        }
        return eVar.f2863g.f2951i;
    }

    protected final f i(c.f.b.k.d dVar, int i2) {
        c.f.b.k.d dVar2 = dVar.f2845f;
        if (dVar2 == null) {
            return null;
        }
        c.f.b.k.e eVar = dVar2.f2843d;
        p pVar = i2 == 0 ? eVar.f2862f : eVar.f2863g;
        int i3 = a.a[dVar2.f2844e.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 5) {
                        return null;
                    }
                }
            }
            return pVar.f2951i;
        }
        return pVar.f2950h;
    }

    public long j() {
        if (this.f2947e.f2908j) {
            return r0.f2905g;
        }
        return 0L;
    }

    public boolean k() {
        return this.f2949g;
    }

    abstract boolean m();

    protected void n(d dVar, c.f.b.k.d dVar2, c.f.b.k.d dVar3, int i2) {
        f fVarH = h(dVar2);
        f fVarH2 = h(dVar3);
        if (fVarH.f2908j && fVarH2.f2908j) {
            int iE = fVarH.f2905g + dVar2.e();
            int iE2 = fVarH2.f2905g - dVar3.e();
            int i3 = iE2 - iE;
            if (!this.f2947e.f2908j && this.f2946d == e.b.MATCH_CONSTRAINT) {
                l(i2, i3);
            }
            g gVar = this.f2947e;
            if (gVar.f2908j) {
                if (gVar.f2905g == i3) {
                    this.f2950h.d(iE);
                    this.f2951i.d(iE2);
                    return;
                }
                c.f.b.k.e eVar = this.f2944b;
                float fW = i2 == 0 ? eVar.w() : eVar.M();
                if (fVarH == fVarH2) {
                    iE = fVarH.f2905g;
                    iE2 = fVarH2.f2905g;
                    fW = 0.5f;
                }
                this.f2950h.d((int) (iE + 0.5f + (((iE2 - iE) - this.f2947e.f2905g) * fW)));
                this.f2951i.d(this.f2950h.f2905g + this.f2947e.f2905g);
            }
        }
    }

    protected void o(d dVar) {
    }

    protected void p(d dVar) {
    }
}