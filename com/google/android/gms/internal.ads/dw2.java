package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class dw2 {
    private static final int a = v03.l("vide");

    /* renamed from: b */
    private static final int f5527b = v03.l("soun");

    /* renamed from: c */
    private static final int f5528c = v03.l("text");

    /* renamed from: d */
    private static final int f5529d = v03.l("sbtl");

    /* renamed from: e */
    private static final int f5530e = v03.l("subt");

    /* renamed from: f */
    private static final int f5531f = v03.l("clcp");

    /* renamed from: g */
    private static final int f5532g = v03.l("cenc");

    /* renamed from: h */
    private static final int f5533h = v03.l("meta");

    /* JADX WARN: Removed duplicated region for block: B:507:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.pw2 a(com.google.android.gms.internal.ads.uv2 r51, com.google.android.gms.internal.ads.vv2 r52, long r53, com.google.android.gms.internal.ads.wu2 r55, boolean r56) throws com.google.android.gms.internal.ads.at2 {
        /*
            Method dump skipped, instructions count: 2171
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dw2.a(com.google.android.gms.internal.ads.uv2, com.google.android.gms.internal.ads.vv2, long, com.google.android.gms.internal.ads.wu2, boolean):com.google.android.gms.internal.ads.pw2");
    }

    /* JADX WARN: Removed duplicated region for block: B:304:0x015c A[PHI: r8
  0x015c: PHI (r8v4 int) = (r8v3 int), (r8v3 int), (r8v3 int), (r8v25 int) binds: [B:283:0x00b3, B:285:0x00bf, B:286:0x00c1, B:303:0x015b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0174 A[ADDED_TO_REGION, LOOP:10: B:306:0x0174->B:307:0x0176, LOOP_START, PHI: r14 r15 r22 r25
  0x0174: PHI (r14v3 int) = (r14v1 int), (r14v10 int) binds: [B:305:0x0172, B:307:0x0176] A[DONT_GENERATE, DONT_INLINE]
  0x0174: PHI (r15v3 int) = (r15v1 int), (r15v9 int) binds: [B:305:0x0172, B:307:0x0176] A[DONT_GENERATE, DONT_INLINE]
  0x0174: PHI (r22v2 int) = (r22v1 int), (r22v5 int) binds: [B:305:0x0172, B:307:0x0176] A[DONT_GENERATE, DONT_INLINE]
  0x0174: PHI (r25v2 long) = (r25v1 long), (r25v4 long) binds: [B:305:0x0172, B:307:0x0176] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:338:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0258  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.sw2 b(com.google.android.gms.internal.ads.pw2 r42, com.google.android.gms.internal.ads.uv2 r43, com.google.android.gms.internal.ads.ev2 r44) throws com.google.android.gms.internal.ads.at2 {
        /*
            Method dump skipped, instructions count: 1241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dw2.b(com.google.android.gms.internal.ads.pw2, com.google.android.gms.internal.ads.uv2, com.google.android.gms.internal.ads.ev2):com.google.android.gms.internal.ads.sw2");
    }

    public static hx2 c(vv2 vv2Var, boolean z) {
        if (z) {
            return null;
        }
        o03 o03Var = vv2Var.P0;
        o03Var.i(8);
        while (o03Var.d() >= 8) {
            int iG = o03Var.g();
            int iR = o03Var.r();
            if (o03Var.r() == wv2.A0) {
                o03Var.i(iG);
                int i2 = iG + iR;
                o03Var.j(12);
                while (o03Var.g() < i2) {
                    int iG2 = o03Var.g();
                    int iR2 = o03Var.r();
                    if (o03Var.r() == wv2.B0) {
                        o03Var.i(iG2);
                        int i3 = iG2 + iR2;
                        o03Var.j(8);
                        ArrayList arrayList = new ArrayList();
                        while (o03Var.g() < i3) {
                            gx2 gx2VarA = kw2.a(o03Var);
                            if (gx2VarA != null) {
                                arrayList.add(gx2VarA);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return null;
                        }
                        return new hx2(arrayList);
                    }
                    o03Var.j(iR2 - 8);
                }
                return null;
            }
            o03Var.j(iR - 8);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.util.Pair<java.lang.String, byte[]> d(com.google.android.gms.internal.ads.o03 r4, int r5) {
        /*
            r0 = 12
            int r5 = r5 + r0
            r4.i(r5)
            r5 = 1
            r4.j(r5)
            f(r4)
            r1 = 2
            r4.j(r1)
            int r2 = r4.l()
            r3 = r2 & 128(0x80, float:1.8E-43)
            if (r3 == 0) goto L1c
            r4.j(r1)
        L1c:
            r3 = r2 & 64
            if (r3 == 0) goto L27
            int r3 = r4.m()
            r4.j(r3)
        L27:
            r3 = 32
            r2 = r2 & r3
            if (r2 == 0) goto L2f
            r4.j(r1)
        L2f:
            r4.j(r5)
            f(r4)
            int r1 = r4.l()
            r2 = 0
            if (r1 == r3) goto L7f
            r3 = 33
            if (r1 == r3) goto L7c
            r3 = 35
            if (r1 == r3) goto L79
            r3 = 64
            if (r1 == r3) goto L76
            r3 = 107(0x6b, float:1.5E-43)
            if (r1 == r3) goto L6f
            r3 = 165(0xa5, float:2.31E-43)
            if (r1 == r3) goto L6c
            r3 = 166(0xa6, float:2.33E-43)
            if (r1 == r3) goto L69
            switch(r1) {
                case 102: goto L76;
                case 103: goto L76;
                case 104: goto L76;
                default: goto L57;
            }
        L57:
            switch(r1) {
                case 169: goto L62;
                case 170: goto L5b;
                case 171: goto L5b;
                case 172: goto L62;
                default: goto L5a;
            }
        L5a:
            goto L81
        L5b:
            java.lang.String r4 = "audio/vnd.dts.hd"
            android.util.Pair r4 = android.util.Pair.create(r4, r2)
            return r4
        L62:
            java.lang.String r4 = "audio/vnd.dts"
            android.util.Pair r4 = android.util.Pair.create(r4, r2)
            return r4
        L69:
            java.lang.String r2 = "audio/eac3"
            goto L81
        L6c:
            java.lang.String r2 = "audio/ac3"
            goto L81
        L6f:
            java.lang.String r4 = "audio/mpeg"
            android.util.Pair r4 = android.util.Pair.create(r4, r2)
            return r4
        L76:
            java.lang.String r2 = "audio/mp4a-latm"
            goto L81
        L79:
            java.lang.String r2 = "video/hevc"
            goto L81
        L7c:
            java.lang.String r2 = "video/avc"
            goto L81
        L7f:
            java.lang.String r2 = "video/mp4v-es"
        L81:
            r4.j(r0)
            r4.j(r5)
            int r5 = f(r4)
            byte[] r0 = new byte[r5]
            r1 = 0
            r4.k(r0, r1, r5)
            android.util.Pair r4 = android.util.Pair.create(r2, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dw2.d(com.google.android.gms.internal.ads.o03, int):android.util.Pair");
    }

    private static int e(o03 o03Var, int i2, int i3, zv2 zv2Var, int i4) {
        int iG = o03Var.g();
        while (true) {
            if (iG - i2 >= i3) {
                return 0;
            }
            o03Var.i(iG);
            int iR = o03Var.r();
            f03.b(iR > 0, "childAtomSize should be positive");
            if (o03Var.r() == wv2.V) {
                int i5 = iG + 8;
                Pair pairCreate = null;
                Integer numValueOf = null;
                qw2 qw2Var = null;
                boolean z = false;
                while (i5 - iG < iR) {
                    o03Var.i(i5);
                    int iR2 = o03Var.r();
                    int iR3 = o03Var.r();
                    if (iR3 == wv2.b0) {
                        numValueOf = Integer.valueOf(o03Var.r());
                    } else if (iR3 == wv2.W) {
                        o03Var.j(4);
                        z = o03Var.r() == f5532g;
                    } else if (iR3 == wv2.X) {
                        int i6 = i5 + 8;
                        while (true) {
                            if (i6 - i5 >= iR2) {
                                qw2Var = null;
                                break;
                            }
                            o03Var.i(i6);
                            int iR4 = o03Var.r();
                            if (o03Var.r() == wv2.Y) {
                                o03Var.j(6);
                                boolean z2 = o03Var.l() == 1;
                                int iL = o03Var.l();
                                byte[] bArr = new byte[16];
                                o03Var.k(bArr, 0, 16);
                                qw2Var = new qw2(z2, iL, bArr);
                            } else {
                                i6 += iR4;
                            }
                        }
                    }
                    i5 += iR2;
                }
                if (z) {
                    f03.b(numValueOf != null, "frma atom is mandatory");
                    f03.b(qw2Var != null, "schi->tenc atom is mandatory");
                    pairCreate = Pair.create(numValueOf, qw2Var);
                }
                if (pairCreate != null) {
                    zv2Var.a[i4] = (qw2) pairCreate.second;
                    return ((Integer) pairCreate.first).intValue();
                }
            }
            iG += iR;
        }
    }

    private static int f(o03 o03Var) {
        int iL = o03Var.l();
        int i2 = iL & 127;
        while ((iL & 128) == 128) {
            iL = o03Var.l();
            i2 = (i2 << 7) | (iL & 127);
        }
        return i2;
    }
}