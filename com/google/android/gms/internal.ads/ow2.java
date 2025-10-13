package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class ow2 {
    private static final int[] a = {v03.l("isom"), v03.l("iso2"), v03.l("iso3"), v03.l("iso4"), v03.l("iso5"), v03.l("iso6"), v03.l("avc1"), v03.l("hvc1"), v03.l("hev1"), v03.l("mp41"), v03.l("mp42"), v03.l("3g2a"), v03.l("3g2b"), v03.l("3gr6"), v03.l("3gs6"), v03.l("3ge6"), v03.l("3gg6"), v03.l("M4V "), v03.l("M4A "), v03.l("f4v "), v03.l("kddi"), v03.l("M4VP"), v03.l("qt  "), v03.l("MSNV")};

    public static boolean a(zu2 zu2Var) {
        return c(zu2Var, true);
    }

    public static boolean b(zu2 zu2Var) {
        return c(zu2Var, false);
    }

    private static boolean c(zu2 zu2Var, boolean z) throws InterruptedException, EOFException {
        boolean z2;
        long jI = zu2Var.i();
        if (jI == -1 || jI > 4096) {
            jI = 4096;
        }
        int i2 = (int) jI;
        o03 o03Var = new o03(64);
        int i3 = 0;
        boolean z3 = false;
        while (i3 < i2) {
            o03Var.a(8);
            zu2Var.e(o03Var.a, 0, 8, false);
            long jP = o03Var.p();
            int iR = o03Var.r();
            int i4 = 16;
            if (jP == 1) {
                zu2Var.e(o03Var.a, 8, 8, false);
                o03Var.f(16);
                jP = o03Var.v();
            } else {
                i4 = 8;
            }
            long j2 = i4;
            if (jP < j2) {
                return false;
            }
            i3 += i4;
            if (iR != wv2.B) {
                if (iR == wv2.K || iR == wv2.M) {
                    z2 = true;
                    break;
                }
                if ((i3 + jP) - j2 >= i2) {
                    break;
                }
                int i5 = (int) (jP - j2);
                i3 += i5;
                if (iR == wv2.a) {
                    if (i5 < 8) {
                        return false;
                    }
                    o03Var.a(i5);
                    zu2Var.e(o03Var.a, 0, i5, false);
                    int i6 = i5 >> 2;
                    for (int i7 = 0; i7 < i6; i7++) {
                        if (i7 != 1) {
                            int iR2 = o03Var.r();
                            if ((iR2 >>> 8) != v03.l("3gp")) {
                                int[] iArr = a;
                                int length = iArr.length;
                                for (int i8 = 0; i8 < 24; i8++) {
                                    if (iArr[i8] != iR2) {
                                    }
                                }
                            }
                            z3 = true;
                            break;
                        }
                        o03Var.j(4);
                    }
                    if (!z3) {
                        return false;
                    }
                } else if (i5 != 0) {
                    zu2Var.f(i5, false);
                }
            }
        }
        z2 = false;
        return z3 && z == z2;
    }
}