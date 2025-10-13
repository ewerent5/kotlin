package c.f.b.k.m;

import c.f.b.k.d;
import c.f.b.k.e;
import java.util.ArrayList;

/* compiled from: BasicMeasure.java */
/* loaded from: classes.dex */
public class b {
    private final ArrayList<c.f.b.k.e> a = new ArrayList<>();

    /* renamed from: b */
    private a f2876b = new a();

    /* renamed from: c */
    private c.f.b.k.f f2877c;

    /* compiled from: BasicMeasure.java */
    public static class a {
        public static int a = 0;

        /* renamed from: b */
        public static int f2878b = 1;

        /* renamed from: c */
        public static int f2879c = 2;

        /* renamed from: d */
        public e.b f2880d;

        /* renamed from: e */
        public e.b f2881e;

        /* renamed from: f */
        public int f2882f;

        /* renamed from: g */
        public int f2883g;

        /* renamed from: h */
        public int f2884h;

        /* renamed from: i */
        public int f2885i;

        /* renamed from: j */
        public int f2886j;

        /* renamed from: k */
        public boolean f2887k;

        /* renamed from: l */
        public boolean f2888l;

        /* renamed from: m */
        public int f2889m;
    }

    /* compiled from: BasicMeasure.java */
    /* renamed from: c.f.b.k.m.b$b */
    public interface InterfaceC0049b {
        void a();

        void b(c.f.b.k.e eVar, a aVar);
    }

    public b(c.f.b.k.f fVar) {
        this.f2877c = fVar;
    }

    private boolean a(InterfaceC0049b interfaceC0049b, c.f.b.k.e eVar, int i2) {
        this.f2876b.f2880d = eVar.y();
        this.f2876b.f2881e = eVar.O();
        this.f2876b.f2882f = eVar.R();
        this.f2876b.f2883g = eVar.v();
        a aVar = this.f2876b;
        aVar.f2888l = false;
        aVar.f2889m = i2;
        e.b bVar = aVar.f2880d;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z = bVar == bVar2;
        boolean z2 = aVar.f2881e == bVar2;
        boolean z3 = z && eVar.X > 0.0f;
        boolean z4 = z2 && eVar.X > 0.0f;
        if (z3 && eVar.s[0] == 4) {
            aVar.f2880d = e.b.FIXED;
        }
        if (z4 && eVar.s[1] == 4) {
            aVar.f2881e = e.b.FIXED;
        }
        interfaceC0049b.b(eVar, aVar);
        eVar.U0(this.f2876b.f2884h);
        eVar.v0(this.f2876b.f2885i);
        eVar.u0(this.f2876b.f2887k);
        eVar.k0(this.f2876b.f2886j);
        a aVar2 = this.f2876b;
        aVar2.f2889m = a.a;
        return aVar2.f2888l;
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x0097 A[PHI: r10
  0x0097: PHI (r10v2 boolean) = (r10v1 boolean), (r10v1 boolean), (r10v1 boolean), (r10v4 boolean), (r10v4 boolean) binds: [B:106:0x0061, B:108:0x0067, B:110:0x006b, B:128:0x0094, B:126:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00a4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(c.f.b.k.f r13) {
        /*
            r12 = this;
            java.util.ArrayList<c.f.b.k.e> r0 = r13.D0
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.B1(r1)
            c.f.b.k.m.b$b r2 = r13.r1()
            r3 = 0
            r4 = 0
        L12:
            if (r4 >= r0) goto Laa
            java.util.ArrayList<c.f.b.k.e> r5 = r13.D0
            java.lang.Object r5 = r5.get(r4)
            c.f.b.k.e r5 = (c.f.b.k.e) r5
            boolean r6 = r5 instanceof c.f.b.k.g
            if (r6 == 0) goto L22
            goto La4
        L22:
            boolean r6 = r5 instanceof c.f.b.k.a
            if (r6 == 0) goto L28
            goto La4
        L28:
            boolean r6 = r5.c0()
            if (r6 == 0) goto L30
            goto La4
        L30:
            if (r1 == 0) goto L47
            c.f.b.k.m.l r6 = r5.f2862f
            if (r6 == 0) goto L47
            c.f.b.k.m.n r7 = r5.f2863g
            if (r7 == 0) goto L47
            c.f.b.k.m.g r6 = r6.f2947e
            boolean r6 = r6.f2908j
            if (r6 == 0) goto L47
            c.f.b.k.m.g r6 = r7.f2947e
            boolean r6 = r6.f2908j
            if (r6 == 0) goto L47
            goto La4
        L47:
            c.f.b.k.e$b r6 = r5.s(r3)
            r7 = 1
            c.f.b.k.e$b r8 = r5.s(r7)
            c.f.b.k.e$b r9 = c.f.b.k.e.b.MATCH_CONSTRAINT
            if (r6 != r9) goto L60
            int r10 = r5.q
            if (r10 == r7) goto L60
            if (r8 != r9) goto L60
            int r10 = r5.r
            if (r10 == r7) goto L60
            r10 = 1
            goto L61
        L60:
            r10 = 0
        L61:
            if (r10 != 0) goto L97
            boolean r11 = r13.B1(r7)
            if (r11 == 0) goto L97
            boolean r11 = r5 instanceof c.f.b.k.k
            if (r11 != 0) goto L97
            if (r6 != r9) goto L7c
            int r11 = r5.q
            if (r11 != 0) goto L7c
            if (r8 == r9) goto L7c
            boolean r11 = r5.Z()
            if (r11 != 0) goto L7c
            r10 = 1
        L7c:
            if (r8 != r9) goto L8b
            int r11 = r5.r
            if (r11 != 0) goto L8b
            if (r6 == r9) goto L8b
            boolean r11 = r5.Z()
            if (r11 != 0) goto L8b
            r10 = 1
        L8b:
            if (r6 == r9) goto L8f
            if (r8 != r9) goto L97
        L8f:
            float r6 = r5.X
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L97
            goto L98
        L97:
            r7 = r10
        L98:
            if (r7 == 0) goto L9b
            goto La4
        L9b:
            int r6 = c.f.b.k.m.b.a.a
            r12.a(r2, r5, r6)
            c.f.b.e r5 = r13.I0
            if (r5 != 0) goto La8
        La4:
            int r4 = r4 + 1
            goto L12
        La8:
            r13 = 0
            throw r13
        Laa:
            r2.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.b.k.m.b.b(c.f.b.k.f):void");
    }

    private void c(c.f.b.k.f fVar, String str, int i2, int i3) {
        int iG = fVar.G();
        int iF = fVar.F();
        fVar.K0(0);
        fVar.J0(0);
        fVar.U0(i2);
        fVar.v0(i3);
        fVar.K0(iG);
        fVar.J0(iF);
        this.f2877c.b1();
    }

    public long d(c.f.b.k.f fVar, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        boolean zQ1;
        int i11;
        int i12;
        boolean z;
        boolean z2;
        boolean z3;
        int i13;
        boolean z4;
        int i14;
        int i15;
        boolean z5;
        InterfaceC0049b interfaceC0049bR1 = fVar.r1();
        int size = fVar.D0.size();
        int iR = fVar.R();
        int iV = fVar.v();
        boolean zB = c.f.b.k.j.b(i2, 128);
        boolean z6 = zB || c.f.b.k.j.b(i2, 64);
        if (z6) {
            for (int i16 = 0; i16 < size; i16++) {
                c.f.b.k.e eVar = fVar.D0.get(i16);
                e.b bVarY = eVar.y();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                boolean z7 = (bVarY == bVar) && (eVar.O() == bVar) && eVar.t() > 0.0f;
                if ((eVar.Z() && z7) || ((eVar.b0() && z7) || (eVar instanceof c.f.b.k.k) || eVar.Z() || eVar.b0())) {
                    z6 = false;
                    break;
                }
            }
        }
        if (z6 && c.f.b.d.f2780g != null) {
            throw null;
        }
        boolean z8 = z6 & ((i5 == 1073741824 && i7 == 1073741824) || zB);
        if (z8) {
            int iMin = Math.min(fVar.E(), i6);
            int iMin2 = Math.min(fVar.D(), i8);
            if (i5 == 1073741824 && fVar.R() != iMin) {
                fVar.U0(iMin);
                fVar.u1();
            }
            if (i7 == 1073741824 && fVar.v() != iMin2) {
                fVar.v0(iMin2);
                fVar.u1();
            }
            if (i5 == 1073741824 && i7 == 1073741824) {
                zQ1 = fVar.o1(zB);
                i11 = 2;
            } else {
                boolean zP1 = fVar.p1(zB);
                if (i5 == 1073741824) {
                    zP1 &= fVar.q1(zB, 0);
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                if (i7 == 1073741824) {
                    zQ1 = fVar.q1(zB, 1) & zP1;
                    i11++;
                } else {
                    zQ1 = zP1;
                }
            }
            if (zQ1) {
                fVar.Y0(i5 == 1073741824, i7 == 1073741824);
            }
        } else {
            zQ1 = false;
            i11 = 0;
        }
        if (zQ1 && i11 == 2) {
            return 0L;
        }
        int iS1 = fVar.s1();
        if (size > 0) {
            b(fVar);
        }
        e(fVar);
        int size2 = this.a.size();
        if (size > 0) {
            c(fVar, "First pass", iR, iV);
        }
        if (size2 > 0) {
            e.b bVarY2 = fVar.y();
            e.b bVar2 = e.b.WRAP_CONTENT;
            boolean z9 = bVarY2 == bVar2;
            boolean z10 = fVar.O() == bVar2;
            int iMax = Math.max(fVar.R(), this.f2877c.G());
            int iMax2 = Math.max(fVar.v(), this.f2877c.F());
            int i17 = 0;
            boolean zD1 = false;
            while (i17 < size2) {
                c.f.b.k.e eVar2 = this.a.get(i17);
                if (eVar2 instanceof c.f.b.k.k) {
                    int iR2 = eVar2.R();
                    i14 = iS1;
                    int iV2 = eVar2.v();
                    i15 = iR;
                    boolean zA = a(interfaceC0049bR1, eVar2, a.f2878b) | zD1;
                    if (fVar.I0 != null) {
                        throw null;
                    }
                    int iR3 = eVar2.R();
                    int iV3 = eVar2.v();
                    if (iR3 != iR2) {
                        eVar2.U0(iR3);
                        if (z9 && eVar2.K() > iMax) {
                            iMax = Math.max(iMax, eVar2.K() + eVar2.m(d.b.RIGHT).e());
                        }
                        z5 = true;
                    } else {
                        z5 = zA;
                    }
                    if (iV3 != iV2) {
                        eVar2.v0(iV3);
                        if (z10 && eVar2.p() > iMax2) {
                            iMax2 = Math.max(iMax2, eVar2.p() + eVar2.m(d.b.BOTTOM).e());
                        }
                        z5 = true;
                    }
                    zD1 = z5 | ((c.f.b.k.k) eVar2).d1();
                } else {
                    i14 = iS1;
                    i15 = iR;
                }
                i17++;
                iS1 = i14;
                iR = i15;
            }
            int i18 = iS1;
            int i19 = iR;
            int i20 = 0;
            int i21 = 2;
            while (i20 < i21) {
                int i22 = 0;
                while (i22 < size2) {
                    c.f.b.k.e eVar3 = this.a.get(i22);
                    if (((eVar3 instanceof c.f.b.k.h) && !(eVar3 instanceof c.f.b.k.k)) || (eVar3 instanceof c.f.b.k.g) || eVar3.Q() == 8 || ((z8 && eVar3.f2862f.f2947e.f2908j && eVar3.f2863g.f2947e.f2908j) || (eVar3 instanceof c.f.b.k.k))) {
                        z3 = z8;
                        i13 = size2;
                    } else {
                        int iR4 = eVar3.R();
                        int iV4 = eVar3.v();
                        z3 = z8;
                        int iN = eVar3.n();
                        int i23 = a.f2878b;
                        i13 = size2;
                        if (i20 == 1) {
                            i23 = a.f2879c;
                        }
                        boolean zA2 = a(interfaceC0049bR1, eVar3, i23) | zD1;
                        if (fVar.I0 != null) {
                            throw null;
                        }
                        int iR5 = eVar3.R();
                        int iV5 = eVar3.v();
                        if (iR5 != iR4) {
                            eVar3.U0(iR5);
                            if (z9 && eVar3.K() > iMax) {
                                iMax = Math.max(iMax, eVar3.K() + eVar3.m(d.b.RIGHT).e());
                            }
                            z4 = true;
                        } else {
                            z4 = zA2;
                        }
                        if (iV5 != iV4) {
                            eVar3.v0(iV5);
                            if (z10 && eVar3.p() > iMax2) {
                                iMax2 = Math.max(iMax2, eVar3.p() + eVar3.m(d.b.BOTTOM).e());
                            }
                            z4 = true;
                        }
                        zD1 = (!eVar3.U() || iN == eVar3.n()) ? z4 : true;
                    }
                    i22++;
                    size2 = i13;
                    z8 = z3;
                }
                boolean z11 = z8;
                int i24 = size2;
                if (!zD1) {
                    break;
                }
                c(fVar, "intermediate pass", i19, iV);
                i20++;
                size2 = i24;
                z8 = z11;
                i21 = 2;
                zD1 = false;
            }
            if (zD1) {
                c(fVar, "2nd pass", i19, iV);
                if (fVar.R() < iMax) {
                    fVar.U0(iMax);
                    z = true;
                } else {
                    z = false;
                }
                if (fVar.v() < iMax2) {
                    fVar.v0(iMax2);
                    z2 = true;
                } else {
                    z2 = z;
                }
                if (z2) {
                    c(fVar, "3rd pass", i19, iV);
                }
            }
            i12 = i18;
        } else {
            i12 = iS1;
        }
        fVar.E1(i12);
        return 0L;
    }

    public void e(c.f.b.k.f fVar) {
        this.a.clear();
        int size = fVar.D0.size();
        for (int i2 = 0; i2 < size; i2++) {
            c.f.b.k.e eVar = fVar.D0.get(i2);
            e.b bVarY = eVar.y();
            e.b bVar = e.b.MATCH_CONSTRAINT;
            if (bVarY == bVar || eVar.O() == bVar) {
                this.a.add(eVar);
            }
        }
        fVar.u1();
    }
}