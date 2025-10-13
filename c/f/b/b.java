package c.f.b;

import c.f.b.d;
import c.f.b.i;
import java.util.ArrayList;

/* compiled from: ArrayRow.java */
/* loaded from: classes.dex */
public class b implements d.a {

    /* renamed from: e, reason: collision with root package name */
    public a f2770e;
    i a = null;

    /* renamed from: b, reason: collision with root package name */
    float f2767b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    boolean f2768c = false;

    /* renamed from: d, reason: collision with root package name */
    ArrayList<i> f2769d = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    boolean f2771f = false;

    /* compiled from: ArrayRow.java */
    public interface a {
        int a();

        i b(int i2);

        void c();

        void clear();

        float d(int i2);

        void e(i iVar, float f2, boolean z);

        float f(i iVar);

        boolean g(i iVar);

        float h(b bVar, boolean z);

        void i(i iVar, float f2);

        float j(i iVar, boolean z);

        void k(float f2);
    }

    public b() {
    }

    private boolean u(i iVar, d dVar) {
        return iVar.n <= 1;
    }

    private i w(boolean[] zArr, i iVar) {
        i.a aVar;
        int iA = this.f2770e.a();
        i iVar2 = null;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < iA; i2++) {
            float fD = this.f2770e.d(i2);
            if (fD < 0.0f) {
                i iVarB = this.f2770e.b(i2);
                if ((zArr == null || !zArr[iVarB.f2801d]) && iVarB != iVar && (((aVar = iVarB.f2808k) == i.a.SLACK || aVar == i.a.ERROR) && fD < f2)) {
                    f2 = fD;
                    iVar2 = iVarB;
                }
            }
        }
        return iVar2;
    }

    public void A(d dVar, i iVar, boolean z) {
        if (iVar.f2805h) {
            this.f2767b += iVar.f2804g * this.f2770e.f(iVar);
            this.f2770e.j(iVar, z);
            if (z) {
                iVar.c(this);
            }
            if (d.f2776c && this.f2770e.a() == 0) {
                this.f2771f = true;
                dVar.f2783j = true;
            }
        }
    }

    public void B(d dVar, b bVar, boolean z) {
        this.f2767b += bVar.f2767b * this.f2770e.h(bVar, z);
        if (z) {
            bVar.a.c(this);
        }
        if (d.f2776c && this.a != null && this.f2770e.a() == 0) {
            this.f2771f = true;
            dVar.f2783j = true;
        }
    }

    public void C(d dVar, i iVar, boolean z) {
        if (iVar.o) {
            float f2 = this.f2770e.f(iVar);
            this.f2767b += iVar.q * f2;
            this.f2770e.j(iVar, z);
            if (z) {
                iVar.c(this);
            }
            this.f2770e.e(dVar.w.f2774d[iVar.p], f2, z);
            if (d.f2776c && this.f2770e.a() == 0) {
                this.f2771f = true;
                dVar.f2783j = true;
            }
        }
    }

    public void D(d dVar) {
        if (dVar.p.length == 0) {
            return;
        }
        boolean z = false;
        while (!z) {
            int iA = this.f2770e.a();
            for (int i2 = 0; i2 < iA; i2++) {
                i iVarB = this.f2770e.b(i2);
                if (iVarB.f2802e != -1 || iVarB.f2805h || iVarB.o) {
                    this.f2769d.add(iVarB);
                }
            }
            int size = this.f2769d.size();
            if (size > 0) {
                for (int i3 = 0; i3 < size; i3++) {
                    i iVar = this.f2769d.get(i3);
                    if (iVar.f2805h) {
                        A(dVar, iVar, true);
                    } else if (iVar.o) {
                        C(dVar, iVar, true);
                    } else {
                        B(dVar, dVar.p[iVar.f2802e], true);
                    }
                }
                this.f2769d.clear();
            } else {
                z = true;
            }
        }
        if (d.f2776c && this.a != null && this.f2770e.a() == 0) {
            this.f2771f = true;
            dVar.f2783j = true;
        }
    }

    @Override // c.f.b.d.a
    public void a(i iVar) {
        int i2 = iVar.f2803f;
        float f2 = 1.0f;
        if (i2 != 1) {
            if (i2 == 2) {
                f2 = 1000.0f;
            } else if (i2 == 3) {
                f2 = 1000000.0f;
            } else if (i2 == 4) {
                f2 = 1.0E9f;
            } else if (i2 == 5) {
                f2 = 1.0E12f;
            }
        }
        this.f2770e.i(iVar, f2);
    }

    @Override // c.f.b.d.a
    public i b(d dVar, boolean[] zArr) {
        return w(zArr, null);
    }

    @Override // c.f.b.d.a
    public void c(d.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.a = null;
            this.f2770e.clear();
            for (int i2 = 0; i2 < bVar.f2770e.a(); i2++) {
                this.f2770e.e(bVar.f2770e.b(i2), bVar.f2770e.d(i2), true);
            }
        }
    }

    @Override // c.f.b.d.a
    public void clear() {
        this.f2770e.clear();
        this.a = null;
        this.f2767b = 0.0f;
    }

    public b d(d dVar, int i2) {
        this.f2770e.i(dVar.o(i2, "ep"), 1.0f);
        this.f2770e.i(dVar.o(i2, "em"), -1.0f);
        return this;
    }

    b e(i iVar, int i2) {
        this.f2770e.i(iVar, i2);
        return this;
    }

    boolean f(d dVar) {
        boolean z;
        i iVarG = g(dVar);
        if (iVarG == null) {
            z = true;
        } else {
            x(iVarG);
            z = false;
        }
        if (this.f2770e.a() == 0) {
            this.f2771f = true;
        }
        return z;
    }

    i g(d dVar) {
        int iA = this.f2770e.a();
        i iVar = null;
        i iVar2 = null;
        boolean z = false;
        boolean z2 = false;
        float f2 = 0.0f;
        float f3 = 0.0f;
        for (int i2 = 0; i2 < iA; i2++) {
            float fD = this.f2770e.d(i2);
            i iVarB = this.f2770e.b(i2);
            if (iVarB.f2808k == i.a.UNRESTRICTED) {
                if (iVar == null || f2 > fD) {
                    boolean zU = u(iVarB, dVar);
                    z = zU;
                    f2 = fD;
                    iVar = iVarB;
                } else if (!z && u(iVarB, dVar)) {
                    f2 = fD;
                    iVar = iVarB;
                    z = true;
                }
            } else if (iVar == null && fD < 0.0f) {
                if (iVar2 == null || f3 > fD) {
                    boolean zU2 = u(iVarB, dVar);
                    z2 = zU2;
                    f3 = fD;
                    iVar2 = iVarB;
                } else if (!z2 && u(iVarB, dVar)) {
                    f3 = fD;
                    iVar2 = iVarB;
                    z2 = true;
                }
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    @Override // c.f.b.d.a
    public i getKey() {
        return this.a;
    }

    b h(i iVar, i iVar2, int i2, float f2, i iVar3, i iVar4, int i3) {
        if (iVar2 == iVar3) {
            this.f2770e.i(iVar, 1.0f);
            this.f2770e.i(iVar4, 1.0f);
            this.f2770e.i(iVar2, -2.0f);
            return this;
        }
        if (f2 == 0.5f) {
            this.f2770e.i(iVar, 1.0f);
            this.f2770e.i(iVar2, -1.0f);
            this.f2770e.i(iVar3, -1.0f);
            this.f2770e.i(iVar4, 1.0f);
            if (i2 > 0 || i3 > 0) {
                this.f2767b = (-i2) + i3;
            }
        } else if (f2 <= 0.0f) {
            this.f2770e.i(iVar, -1.0f);
            this.f2770e.i(iVar2, 1.0f);
            this.f2767b = i2;
        } else if (f2 >= 1.0f) {
            this.f2770e.i(iVar4, -1.0f);
            this.f2770e.i(iVar3, 1.0f);
            this.f2767b = -i3;
        } else {
            float f3 = 1.0f - f2;
            this.f2770e.i(iVar, f3 * 1.0f);
            this.f2770e.i(iVar2, f3 * (-1.0f));
            this.f2770e.i(iVar3, (-1.0f) * f2);
            this.f2770e.i(iVar4, 1.0f * f2);
            if (i2 > 0 || i3 > 0) {
                this.f2767b = ((-i2) * f3) + (i3 * f2);
            }
        }
        return this;
    }

    b i(i iVar, int i2) {
        this.a = iVar;
        float f2 = i2;
        iVar.f2804g = f2;
        this.f2767b = f2;
        this.f2771f = true;
        return this;
    }

    @Override // c.f.b.d.a
    public boolean isEmpty() {
        return this.a == null && this.f2767b == 0.0f && this.f2770e.a() == 0;
    }

    b j(i iVar, i iVar2, float f2) {
        this.f2770e.i(iVar, -1.0f);
        this.f2770e.i(iVar2, f2);
        return this;
    }

    public b k(i iVar, i iVar2, i iVar3, i iVar4, float f2) {
        this.f2770e.i(iVar, -1.0f);
        this.f2770e.i(iVar2, 1.0f);
        this.f2770e.i(iVar3, f2);
        this.f2770e.i(iVar4, -f2);
        return this;
    }

    public b l(float f2, float f3, float f4, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f2767b = 0.0f;
        if (f3 == 0.0f || f2 == f4) {
            this.f2770e.i(iVar, 1.0f);
            this.f2770e.i(iVar2, -1.0f);
            this.f2770e.i(iVar4, 1.0f);
            this.f2770e.i(iVar3, -1.0f);
        } else if (f2 == 0.0f) {
            this.f2770e.i(iVar, 1.0f);
            this.f2770e.i(iVar2, -1.0f);
        } else if (f4 == 0.0f) {
            this.f2770e.i(iVar3, 1.0f);
            this.f2770e.i(iVar4, -1.0f);
        } else {
            float f5 = (f2 / f3) / (f4 / f3);
            this.f2770e.i(iVar, 1.0f);
            this.f2770e.i(iVar2, -1.0f);
            this.f2770e.i(iVar4, f5);
            this.f2770e.i(iVar3, -f5);
        }
        return this;
    }

    public b m(i iVar, int i2) {
        if (i2 < 0) {
            this.f2767b = i2 * (-1);
            this.f2770e.i(iVar, 1.0f);
        } else {
            this.f2767b = i2;
            this.f2770e.i(iVar, -1.0f);
        }
        return this;
    }

    public b n(i iVar, i iVar2, int i2) {
        boolean z = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z = true;
            }
            this.f2767b = i2;
        }
        if (z) {
            this.f2770e.i(iVar, 1.0f);
            this.f2770e.i(iVar2, -1.0f);
        } else {
            this.f2770e.i(iVar, -1.0f);
            this.f2770e.i(iVar2, 1.0f);
        }
        return this;
    }

    public b o(i iVar, i iVar2, i iVar3, int i2) {
        boolean z = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z = true;
            }
            this.f2767b = i2;
        }
        if (z) {
            this.f2770e.i(iVar, 1.0f);
            this.f2770e.i(iVar2, -1.0f);
            this.f2770e.i(iVar3, -1.0f);
        } else {
            this.f2770e.i(iVar, -1.0f);
            this.f2770e.i(iVar2, 1.0f);
            this.f2770e.i(iVar3, 1.0f);
        }
        return this;
    }

    public b p(i iVar, i iVar2, i iVar3, int i2) {
        boolean z = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z = true;
            }
            this.f2767b = i2;
        }
        if (z) {
            this.f2770e.i(iVar, 1.0f);
            this.f2770e.i(iVar2, -1.0f);
            this.f2770e.i(iVar3, 1.0f);
        } else {
            this.f2770e.i(iVar, -1.0f);
            this.f2770e.i(iVar2, 1.0f);
            this.f2770e.i(iVar3, -1.0f);
        }
        return this;
    }

    public b q(i iVar, i iVar2, i iVar3, i iVar4, float f2) {
        this.f2770e.i(iVar3, 0.5f);
        this.f2770e.i(iVar4, 0.5f);
        this.f2770e.i(iVar, -0.5f);
        this.f2770e.i(iVar2, -0.5f);
        this.f2767b = -f2;
        return this;
    }

    void r() {
        float f2 = this.f2767b;
        if (f2 < 0.0f) {
            this.f2767b = f2 * (-1.0f);
            this.f2770e.c();
        }
    }

    boolean s() {
        i iVar = this.a;
        return iVar != null && (iVar.f2808k == i.a.UNRESTRICTED || this.f2767b >= 0.0f);
    }

    boolean t(i iVar) {
        return this.f2770e.g(iVar);
    }

    public String toString() {
        return z();
    }

    public i v(i iVar) {
        return w(null, iVar);
    }

    void x(i iVar) {
        i iVar2 = this.a;
        if (iVar2 != null) {
            this.f2770e.i(iVar2, -1.0f);
            this.a.f2802e = -1;
            this.a = null;
        }
        float fJ = this.f2770e.j(iVar, true) * (-1.0f);
        this.a = iVar;
        if (fJ == 1.0f) {
            return;
        }
        this.f2767b /= fJ;
        this.f2770e.k(fJ);
    }

    public void y() {
        this.a = null;
        this.f2770e.clear();
        this.f2767b = 0.0f;
        this.f2771f = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    java.lang.String z() {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.b.b.z():java.lang.String");
    }

    public b(c cVar) {
        this.f2770e = new c.f.b.a(this, cVar);
    }
}