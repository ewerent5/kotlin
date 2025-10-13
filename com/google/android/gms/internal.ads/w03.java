package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class w03 {
    public final List<byte[]> a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9831b;

    /* renamed from: c, reason: collision with root package name */
    public final float f9832c;

    private w03(List<byte[]> list, int i2, int i3, int i4, float f2) {
        this.a = list;
        this.f9831b = i2;
        this.f9832c = f2;
    }

    public static w03 a(o03 o03Var) {
        int i2;
        int i3;
        float f2;
        int iD;
        int i4;
        try {
            o03Var.j(4);
            int iL = (o03Var.l() & 3) + 1;
            if (iL == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iL2 = o03Var.l() & 31;
            for (int i5 = 0; i5 < iL2; i5++) {
                arrayList.add(b(o03Var));
            }
            int iL3 = o03Var.l();
            for (int i6 = 0; i6 < iL3; i6++) {
                arrayList.add(b(o03Var));
            }
            float f3 = 1.0f;
            if (iL2 > 0) {
                p03 p03Var = new p03((byte[]) arrayList.get(0), iL, ((byte[]) arrayList.get(0)).length);
                p03Var.a(8);
                int iC = p03Var.c(8);
                p03Var.a(16);
                p03Var.d();
                if (iC == 100 || iC == 110 || iC == 122 || iC == 244 || iC == 44 || iC == 83 || iC == 86 || iC == 118 || iC == 128 || iC == 138) {
                    iD = p03Var.d();
                    if (iD == 3) {
                        p03Var.b();
                        i4 = 3;
                    } else {
                        i4 = iD;
                    }
                    p03Var.d();
                    p03Var.d();
                    p03Var.a(1);
                    if (p03Var.b()) {
                        int i7 = i4 != 3 ? 8 : 12;
                        int i8 = 0;
                        while (i8 < i7) {
                            if (p03Var.b()) {
                                int i9 = i8 < 6 ? 16 : 64;
                                int iE = 8;
                                int i10 = 8;
                                for (int i11 = 0; i11 < i9; i11++) {
                                    if (iE != 0) {
                                        iE = ((p03Var.e() + i10) + 256) % 256;
                                    }
                                    if (iE != 0) {
                                        i10 = iE;
                                    }
                                }
                            }
                            i8++;
                        }
                    }
                } else {
                    iD = 1;
                }
                p03Var.d();
                int iD2 = p03Var.d();
                if (iD2 == 0) {
                    p03Var.d();
                } else if (iD2 == 1) {
                    p03Var.b();
                    p03Var.e();
                    p03Var.e();
                    long jD = p03Var.d();
                    for (int i12 = 0; i12 < jD; i12++) {
                        p03Var.d();
                    }
                }
                p03Var.d();
                p03Var.a(1);
                int iD3 = p03Var.d() + 1;
                int iD4 = p03Var.d() + 1;
                boolean zB = p03Var.b();
                int i13 = 2 - (zB ? 1 : 0);
                int i14 = iD4 * i13;
                if (!zB) {
                    p03Var.a(1);
                }
                p03Var.a(1);
                int i15 = iD3 * 16;
                int i16 = i14 * 16;
                if (p03Var.b()) {
                    int iD5 = p03Var.d();
                    int iD6 = p03Var.d();
                    int iD7 = p03Var.d();
                    int iD8 = p03Var.d();
                    if (iD != 0) {
                        int i17 = iD == 3 ? 1 : 2;
                        i13 *= iD == 1 ? 2 : 1;
                        i = i17;
                    }
                    i15 -= (iD5 + iD6) * i;
                    i16 -= (iD7 + iD8) * i13;
                }
                if (p03Var.b() && p03Var.b()) {
                    int iC2 = p03Var.c(8);
                    if (iC2 == 255) {
                        int iC3 = p03Var.c(16);
                        int iC4 = p03Var.c(16);
                        if (iC3 != 0 && iC4 != 0) {
                            f3 = iC3 / iC4;
                        }
                    } else if (iC2 < 17) {
                        f3 = m03.f7393b[iC2];
                    } else {
                        StringBuilder sb = new StringBuilder(46);
                        sb.append("Unexpected aspect_ratio_idc value: ");
                        sb.append(iC2);
                        Log.w("NalUnitUtil", sb.toString());
                    }
                }
                f2 = f3;
                i3 = i16;
                i2 = i15;
            } else {
                i2 = -1;
                i3 = -1;
                f2 = 1.0f;
            }
            return new w03(arrayList, iL, i2, i3, f2);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new at2("Error parsing AVC config", e2);
        }
    }

    private static byte[] b(o03 o03Var) {
        int iM = o03Var.m();
        int iG = o03Var.g();
        o03Var.j(iM);
        return g03.b(o03Var.a, iG, iM);
    }
}