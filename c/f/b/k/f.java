package c.f.b.k;

import c.f.b.k.e;
import c.f.b.k.m.b;
import com.google.android.gms.ads.AdRequest;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: ConstraintWidgetContainer.java */
/* loaded from: classes.dex */
public class f extends l {
    public c.f.b.e I0;
    int K0;
    int L0;
    int M0;
    int N0;
    c.f.b.k.m.b E0 = new c.f.b.k.m.b(this);
    public c.f.b.k.m.e F0 = new c.f.b.k.m.e(this);
    protected b.InterfaceC0049b G0 = null;
    private boolean H0 = false;
    protected c.f.b.d J0 = new c.f.b.d();
    public int O0 = 0;
    public int P0 = 0;
    c[] Q0 = new c[4];
    c[] R0 = new c[4];
    public boolean S0 = false;
    public boolean T0 = false;
    public boolean U0 = false;
    public int V0 = 0;
    public int W0 = 0;
    private int X0 = 257;
    public boolean Y0 = false;
    private boolean Z0 = false;
    private boolean a1 = false;
    int b1 = 0;
    private WeakReference<d> c1 = null;
    private WeakReference<d> d1 = null;
    private WeakReference<d> e1 = null;
    private WeakReference<d> f1 = null;
    public b.a g1 = new b.a();

    public static boolean A1(e eVar, b.InterfaceC0049b interfaceC0049b, b.a aVar, int i2) {
        int i3;
        int i4;
        if (interfaceC0049b == null) {
            return false;
        }
        aVar.f2880d = eVar.y();
        aVar.f2881e = eVar.O();
        aVar.f2882f = eVar.R();
        aVar.f2883g = eVar.v();
        aVar.f2888l = false;
        aVar.f2889m = i2;
        e.b bVar = aVar.f2880d;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z = bVar == bVar2;
        boolean z2 = aVar.f2881e == bVar2;
        boolean z3 = z && eVar.X > 0.0f;
        boolean z4 = z2 && eVar.X > 0.0f;
        if (z && eVar.V(0) && eVar.q == 0 && !z3) {
            aVar.f2880d = e.b.WRAP_CONTENT;
            if (z2 && eVar.r == 0) {
                aVar.f2880d = e.b.FIXED;
            }
            z = false;
        }
        if (z2 && eVar.V(1) && eVar.r == 0 && !z4) {
            aVar.f2881e = e.b.WRAP_CONTENT;
            if (z && eVar.q == 0) {
                aVar.f2881e = e.b.FIXED;
            }
            z2 = false;
        }
        if (eVar.e0()) {
            aVar.f2880d = e.b.FIXED;
            z = false;
        }
        if (eVar.f0()) {
            aVar.f2881e = e.b.FIXED;
            z2 = false;
        }
        if (z3) {
            if (eVar.s[0] == 4) {
                aVar.f2880d = e.b.FIXED;
            } else if (!z2) {
                e.b bVar3 = aVar.f2881e;
                e.b bVar4 = e.b.FIXED;
                if (bVar3 == bVar4) {
                    i4 = aVar.f2883g;
                } else {
                    aVar.f2880d = e.b.WRAP_CONTENT;
                    interfaceC0049b.b(eVar, aVar);
                    i4 = aVar.f2885i;
                }
                aVar.f2880d = bVar4;
                int i5 = eVar.Y;
                if (i5 == 0 || i5 == -1) {
                    aVar.f2882f = (int) (eVar.t() * i4);
                } else {
                    aVar.f2882f = (int) (eVar.t() / i4);
                }
            }
        }
        if (z4) {
            if (eVar.s[1] == 4) {
                aVar.f2881e = e.b.FIXED;
            } else if (!z) {
                e.b bVar5 = aVar.f2880d;
                e.b bVar6 = e.b.FIXED;
                if (bVar5 == bVar6) {
                    i3 = aVar.f2882f;
                } else {
                    aVar.f2881e = e.b.WRAP_CONTENT;
                    interfaceC0049b.b(eVar, aVar);
                    i3 = aVar.f2884h;
                }
                aVar.f2881e = bVar6;
                int i6 = eVar.Y;
                if (i6 == 0 || i6 == -1) {
                    aVar.f2883g = (int) (i3 / eVar.t());
                } else {
                    aVar.f2883g = (int) (i3 * eVar.t());
                }
            }
        }
        interfaceC0049b.b(eVar, aVar);
        eVar.U0(aVar.f2884h);
        eVar.v0(aVar.f2885i);
        eVar.u0(aVar.f2887k);
        eVar.k0(aVar.f2886j);
        aVar.f2889m = b.a.a;
        return aVar.f2888l;
    }

    private void C1() {
        this.O0 = 0;
        this.P0 = 0;
    }

    private void g1(e eVar) {
        int i2 = this.O0 + 1;
        c[] cVarArr = this.R0;
        if (i2 >= cVarArr.length) {
            this.R0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.R0[this.O0] = new c(eVar, 0, x1());
        this.O0++;
    }

    private void j1(d dVar, c.f.b.i iVar) {
        this.J0.h(iVar, this.J0.q(dVar), 0, 5);
    }

    private void k1(d dVar, c.f.b.i iVar) {
        this.J0.h(this.J0.q(dVar), iVar, 0, 5);
    }

    private void l1(e eVar) {
        int i2 = this.P0 + 1;
        c[] cVarArr = this.Q0;
        if (i2 >= cVarArr.length) {
            this.Q0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.Q0[this.P0] = new c(eVar, 1, x1());
        this.P0++;
    }

    public boolean B1(int i2) {
        return (this.X0 & i2) == i2;
    }

    public void D1(b.InterfaceC0049b interfaceC0049b) {
        this.G0 = interfaceC0049b;
        this.F0.n(interfaceC0049b);
    }

    public void E1(int i2) {
        this.X0 = i2;
        c.f.b.d.a = B1(AdRequest.MAX_CONTENT_URL_LENGTH);
    }

    public void F1(boolean z) {
        this.H0 = z;
    }

    public void G1(c.f.b.d dVar, boolean[] zArr) {
        zArr[2] = false;
        boolean zB1 = B1(64);
        Z0(dVar, zB1);
        int size = this.D0.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.D0.get(i2).Z0(dVar, zB1);
        }
    }

    public void H1() {
        this.E0.e(this);
    }

    @Override // c.f.b.k.e
    public void Y0(boolean z, boolean z2) {
        super.Y0(z, z2);
        int size = this.D0.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.D0.get(i2).Y0(z, z2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x02fb A[PHI: r0 r6
  0x02fb: PHI (r0v20 boolean) = (r0v19 boolean), (r0v22 boolean), (r0v22 boolean), (r0v22 boolean) binds: [B:139:0x02bf, B:147:0x02e3, B:148:0x02e5, B:150:0x02eb] A[DONT_GENERATE, DONT_INLINE]
  0x02fb: PHI (r6v11 boolean) = (r6v10 boolean), (r6v13 boolean), (r6v13 boolean), (r6v13 boolean) binds: [B:139:0x02bf, B:147:0x02e3, B:148:0x02e5, B:150:0x02eb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v13 */
    @Override // c.f.b.k.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b1() {
        /*
            Method dump skipped, instructions count: 795
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.b.k.f.b1():void");
    }

    void e1(e eVar, int i2) {
        if (i2 == 0) {
            g1(eVar);
        } else if (i2 == 1) {
            l1(eVar);
        }
    }

    public boolean f1(c.f.b.d dVar) {
        boolean zB1 = B1(64);
        g(dVar, zB1);
        int size = this.D0.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            e eVar = this.D0.get(i2);
            eVar.C0(0, false);
            eVar.C0(1, false);
            if (eVar instanceof a) {
                z = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                e eVar2 = this.D0.get(i3);
                if (eVar2 instanceof a) {
                    ((a) eVar2).h1();
                }
            }
        }
        for (int i4 = 0; i4 < size; i4++) {
            e eVar3 = this.D0.get(i4);
            if (eVar3.f()) {
                eVar3.g(dVar, zB1);
            }
        }
        if (c.f.b.d.a) {
            HashSet<e> hashSet = new HashSet<>();
            for (int i5 = 0; i5 < size; i5++) {
                e eVar4 = this.D0.get(i5);
                if (!eVar4.f()) {
                    hashSet.add(eVar4);
                }
            }
            e(this, dVar, hashSet, y() == e.b.WRAP_CONTENT ? 0 : 1, false);
            Iterator<e> it = hashSet.iterator();
            while (it.hasNext()) {
                e next = it.next();
                j.a(this, dVar, next);
                next.g(dVar, zB1);
            }
        } else {
            for (int i6 = 0; i6 < size; i6++) {
                e eVar5 = this.D0.get(i6);
                if (eVar5 instanceof f) {
                    e.b[] bVarArr = eVar5.T;
                    e.b bVar = bVarArr[0];
                    e.b bVar2 = bVarArr[1];
                    e.b bVar3 = e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        eVar5.z0(e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        eVar5.Q0(e.b.FIXED);
                    }
                    eVar5.g(dVar, zB1);
                    if (bVar == bVar3) {
                        eVar5.z0(bVar);
                    }
                    if (bVar2 == bVar3) {
                        eVar5.Q0(bVar2);
                    }
                } else {
                    j.a(this, dVar, eVar5);
                    if (!eVar5.f()) {
                        eVar5.g(dVar, zB1);
                    }
                }
            }
        }
        if (this.O0 > 0) {
            b.b(this, dVar, null, 0);
        }
        if (this.P0 > 0) {
            b.b(this, dVar, null, 1);
        }
        return true;
    }

    @Override // c.f.b.k.l, c.f.b.k.e
    public void h0() {
        this.J0.D();
        this.K0 = 0;
        this.M0 = 0;
        this.L0 = 0;
        this.N0 = 0;
        this.Y0 = false;
        super.h0();
    }

    public void h1(d dVar) {
        WeakReference<d> weakReference = this.f1;
        if (weakReference == null || weakReference.get() == null || dVar.d() > this.f1.get().d()) {
            this.f1 = new WeakReference<>(dVar);
        }
    }

    public void i1(d dVar) {
        WeakReference<d> weakReference = this.d1;
        if (weakReference == null || weakReference.get() == null || dVar.d() > this.d1.get().d()) {
            this.d1 = new WeakReference<>(dVar);
        }
    }

    void m1(d dVar) {
        WeakReference<d> weakReference = this.e1;
        if (weakReference == null || weakReference.get() == null || dVar.d() > this.e1.get().d()) {
            this.e1 = new WeakReference<>(dVar);
        }
    }

    void n1(d dVar) {
        WeakReference<d> weakReference = this.c1;
        if (weakReference == null || weakReference.get() == null || dVar.d() > this.c1.get().d()) {
            this.c1 = new WeakReference<>(dVar);
        }
    }

    public boolean o1(boolean z) {
        return this.F0.f(z);
    }

    public boolean p1(boolean z) {
        return this.F0.g(z);
    }

    public boolean q1(boolean z, int i2) {
        return this.F0.h(z, i2);
    }

    public b.InterfaceC0049b r1() {
        return this.G0;
    }

    public int s1() {
        return this.X0;
    }

    public c.f.b.d t1() {
        return this.J0;
    }

    public void u1() {
        this.F0.j();
    }

    public void v1() {
        this.F0.k();
    }

    public boolean w1() {
        return this.a1;
    }

    public boolean x1() {
        return this.H0;
    }

    public boolean y1() {
        return this.Z0;
    }

    public long z1(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.K0 = i9;
        this.L0 = i10;
        return this.E0.d(this, i2, i9, i10, i3, i4, i5, i6, i7, i8);
    }
}