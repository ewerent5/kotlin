package c.f.b.k.m;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ChainRun.java */
/* loaded from: classes.dex */
public class c extends p {

    /* renamed from: k */
    ArrayList<p> f2890k;

    /* renamed from: l */
    private int f2891l;

    public c(c.f.b.k.e eVar, int i2) {
        super(eVar);
        this.f2890k = new ArrayList<>();
        this.f2948f = i2;
        q();
    }

    private void q() {
        c.f.b.k.e eVar;
        c.f.b.k.e eVar2 = this.f2944b;
        c.f.b.k.e eVarJ = eVar2.J(this.f2948f);
        while (true) {
            c.f.b.k.e eVar3 = eVarJ;
            eVar = eVar2;
            eVar2 = eVar3;
            if (eVar2 == null) {
                break;
            } else {
                eVarJ = eVar2.J(this.f2948f);
            }
        }
        this.f2944b = eVar;
        this.f2890k.add(eVar.L(this.f2948f));
        c.f.b.k.e eVarH = eVar.H(this.f2948f);
        while (eVarH != null) {
            this.f2890k.add(eVarH.L(this.f2948f));
            eVarH = eVarH.H(this.f2948f);
        }
        Iterator<p> it = this.f2890k.iterator();
        while (it.hasNext()) {
            p next = it.next();
            int i2 = this.f2948f;
            if (i2 == 0) {
                next.f2944b.f2860d = this;
            } else if (i2 == 1) {
                next.f2944b.f2861e = this;
            }
        }
        if ((this.f2948f == 0 && ((c.f.b.k.f) this.f2944b.I()).x1()) && this.f2890k.size() > 1) {
            ArrayList<p> arrayList = this.f2890k;
            this.f2944b = arrayList.get(arrayList.size() - 1).f2944b;
        }
        this.f2891l = this.f2948f == 0 ? this.f2944b.x() : this.f2944b.N();
    }

    private c.f.b.k.e r() {
        for (int i2 = 0; i2 < this.f2890k.size(); i2++) {
            p pVar = this.f2890k.get(i2);
            if (pVar.f2944b.Q() != 8) {
                return pVar.f2944b;
            }
        }
        return null;
    }

    private c.f.b.k.e s() {
        for (int size = this.f2890k.size() - 1; size >= 0; size--) {
            p pVar = this.f2890k.get(size);
            if (pVar.f2944b.Q() != 8) {
                return pVar.f2944b;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:401:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x01ce A[PHI: r1 r22 r23 r24
  0x01ce: PHI (r1v61 int) = (r1v59 int), (r1v67 int) binds: [B:456:0x01cc, B:447:0x01a6] A[DONT_GENERATE, DONT_INLINE]
  0x01ce: PHI (r22v3 float) = (r22v2 float), (r22v5 float) binds: [B:456:0x01cc, B:447:0x01a6] A[DONT_GENERATE, DONT_INLINE]
  0x01ce: PHI (r23v6 boolean) = (r23v5 boolean), (r23v8 boolean) binds: [B:456:0x01cc, B:447:0x01a6] A[DONT_GENERATE, DONT_INLINE]
  0x01ce: PHI (r24v6 int) = (r24v5 int), (r24v8 int) binds: [B:456:0x01cc, B:447:0x01a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:459:0x01d7  */
    @Override // c.f.b.k.m.p, c.f.b.k.m.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(c.f.b.k.m.d r26) {
        /*
            Method dump skipped, instructions count: 1090
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.b.k.m.c.a(c.f.b.k.m.d):void");
    }

    @Override // c.f.b.k.m.p
    void d() {
        Iterator<p> it = this.f2890k.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = this.f2890k.size();
        if (size < 1) {
            return;
        }
        c.f.b.k.e eVar = this.f2890k.get(0).f2944b;
        c.f.b.k.e eVar2 = this.f2890k.get(size - 1).f2944b;
        if (this.f2948f == 0) {
            c.f.b.k.d dVar = eVar.I;
            c.f.b.k.d dVar2 = eVar2.K;
            f fVarI = i(dVar, 0);
            int iE = dVar.e();
            c.f.b.k.e eVarR = r();
            if (eVarR != null) {
                iE = eVarR.I.e();
            }
            if (fVarI != null) {
                b(this.f2950h, fVarI, iE);
            }
            f fVarI2 = i(dVar2, 0);
            int iE2 = dVar2.e();
            c.f.b.k.e eVarS = s();
            if (eVarS != null) {
                iE2 = eVarS.K.e();
            }
            if (fVarI2 != null) {
                b(this.f2951i, fVarI2, -iE2);
            }
        } else {
            c.f.b.k.d dVar3 = eVar.J;
            c.f.b.k.d dVar4 = eVar2.L;
            f fVarI3 = i(dVar3, 1);
            int iE3 = dVar3.e();
            c.f.b.k.e eVarR2 = r();
            if (eVarR2 != null) {
                iE3 = eVarR2.J.e();
            }
            if (fVarI3 != null) {
                b(this.f2950h, fVarI3, iE3);
            }
            f fVarI4 = i(dVar4, 1);
            int iE4 = dVar4.e();
            c.f.b.k.e eVarS2 = s();
            if (eVarS2 != null) {
                iE4 = eVarS2.L.e();
            }
            if (fVarI4 != null) {
                b(this.f2951i, fVarI4, -iE4);
            }
        }
        this.f2950h.a = this;
        this.f2951i.a = this;
    }

    @Override // c.f.b.k.m.p
    public void e() {
        for (int i2 = 0; i2 < this.f2890k.size(); i2++) {
            this.f2890k.get(i2).e();
        }
    }

    @Override // c.f.b.k.m.p
    void f() {
        this.f2945c = null;
        Iterator<p> it = this.f2890k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // c.f.b.k.m.p
    public long j() {
        int size = this.f2890k.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j2 = j2 + r4.f2950h.f2904f + this.f2890k.get(i2).j() + r4.f2951i.f2904f;
        }
        return j2;
    }

    @Override // c.f.b.k.m.p
    boolean m() {
        int size = this.f2890k.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!this.f2890k.get(i2).m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChainRun ");
        sb.append(this.f2948f == 0 ? "horizontal : " : "vertical : ");
        String string = sb.toString();
        Iterator<p> it = this.f2890k.iterator();
        while (it.hasNext()) {
            String str = string + "<";
            string = (str + it.next()) + "> ";
        }
        return string;
    }
}