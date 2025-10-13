package c.f.b.k;

import c.f.b.k.e;
import java.util.ArrayList;

/* compiled from: ChainHead.java */
/* loaded from: classes.dex */
public class c {
    protected e a;

    /* renamed from: b, reason: collision with root package name */
    protected e f2829b;

    /* renamed from: c, reason: collision with root package name */
    protected e f2830c;

    /* renamed from: d, reason: collision with root package name */
    protected e f2831d;

    /* renamed from: e, reason: collision with root package name */
    protected e f2832e;

    /* renamed from: f, reason: collision with root package name */
    protected e f2833f;

    /* renamed from: g, reason: collision with root package name */
    protected e f2834g;

    /* renamed from: h, reason: collision with root package name */
    protected ArrayList<e> f2835h;

    /* renamed from: i, reason: collision with root package name */
    protected int f2836i;

    /* renamed from: j, reason: collision with root package name */
    protected int f2837j;

    /* renamed from: k, reason: collision with root package name */
    protected float f2838k = 0.0f;

    /* renamed from: l, reason: collision with root package name */
    int f2839l;

    /* renamed from: m, reason: collision with root package name */
    int f2840m;
    int n;
    boolean o;
    private int p;
    private boolean q;
    protected boolean r;
    protected boolean s;
    protected boolean t;
    protected boolean u;
    private boolean v;

    public c(e eVar, int i2, boolean z) {
        this.q = false;
        this.a = eVar;
        this.p = i2;
        this.q = z;
    }

    private void b() {
        int i2 = this.p * 2;
        e eVar = this.a;
        this.o = true;
        e eVar2 = eVar;
        boolean z = false;
        while (!z) {
            this.f2836i++;
            e[] eVarArr = eVar.y0;
            int i3 = this.p;
            e eVar3 = null;
            eVarArr[i3] = null;
            eVar.x0[i3] = null;
            if (eVar.Q() != 8) {
                this.f2839l++;
                e.b bVarS = eVar.s(this.p);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarS != bVar) {
                    this.f2840m += eVar.C(this.p);
                }
                int iE = this.f2840m + eVar.Q[i2].e();
                this.f2840m = iE;
                int i4 = i2 + 1;
                this.f2840m = iE + eVar.Q[i4].e();
                int iE2 = this.n + eVar.Q[i2].e();
                this.n = iE2;
                this.n = iE2 + eVar.Q[i4].e();
                if (this.f2829b == null) {
                    this.f2829b = eVar;
                }
                this.f2831d = eVar;
                e.b[] bVarArr = eVar.T;
                int i5 = this.p;
                if (bVarArr[i5] == bVar) {
                    int[] iArr = eVar.s;
                    if (iArr[i5] == 0 || iArr[i5] == 3 || iArr[i5] == 2) {
                        this.f2837j++;
                        float[] fArr = eVar.w0;
                        float f2 = fArr[i5];
                        if (f2 > 0.0f) {
                            this.f2838k += fArr[i5];
                        }
                        if (c(eVar, i5)) {
                            if (f2 < 0.0f) {
                                this.r = true;
                            } else {
                                this.s = true;
                            }
                            if (this.f2835h == null) {
                                this.f2835h = new ArrayList<>();
                            }
                            this.f2835h.add(eVar);
                        }
                        if (this.f2833f == null) {
                            this.f2833f = eVar;
                        }
                        e eVar4 = this.f2834g;
                        if (eVar4 != null) {
                            eVar4.x0[this.p] = eVar;
                        }
                        this.f2834g = eVar;
                    }
                    if (this.p == 0) {
                        if (eVar.q != 0 || eVar.t != 0 || eVar.u != 0) {
                            this.o = false;
                        }
                    } else if (eVar.r != 0 || eVar.w != 0 || eVar.x != 0) {
                        this.o = false;
                    }
                    if (eVar.X != 0.0f) {
                        this.o = false;
                        this.u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.y0[this.p] = eVar;
            }
            d dVar = eVar.Q[i2 + 1].f2845f;
            if (dVar != null) {
                e eVar5 = dVar.f2843d;
                d[] dVarArr = eVar5.Q;
                if (dVarArr[i2].f2845f != null && dVarArr[i2].f2845f.f2843d == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.f2829b;
        if (eVar6 != null) {
            this.f2840m -= eVar6.Q[i2].e();
        }
        e eVar7 = this.f2831d;
        if (eVar7 != null) {
            this.f2840m -= eVar7.Q[i2 + 1].e();
        }
        this.f2830c = eVar;
        if (this.p == 0 && this.q) {
            this.f2832e = eVar;
        } else {
            this.f2832e = this.a;
        }
        this.t = this.s && this.r;
    }

    private static boolean c(e eVar, int i2) {
        if (eVar.Q() != 8 && eVar.T[i2] == e.b.MATCH_CONSTRAINT) {
            int[] iArr = eVar.s;
            if (iArr[i2] == 0 || iArr[i2] == 3) {
                return true;
            }
        }
        return false;
    }

    public void a() {
        if (!this.v) {
            b();
        }
        this.v = true;
    }
}