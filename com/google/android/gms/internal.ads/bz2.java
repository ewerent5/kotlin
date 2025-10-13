package com.google.android.gms.internal.ads;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class bz2 extends fz2 {

    /* renamed from: e, reason: collision with root package name */
    private final AtomicReference<az2> f5227e = new AtomicReference<>(new az2());

    public bz2(gz2 gz2Var) {
    }

    protected static boolean g(int i2, boolean z) {
        int i3 = i2 & 3;
        return i3 == 3 || (z && i3 == 2);
    }

    private static int h(int i2, int i3) {
        if (i2 == -1) {
            return i3 != -1 ? -1 : 0;
        }
        if (i3 == -1) {
            return 1;
        }
        return i2 - i3;
    }

    @Override // com.google.android.gms.internal.ads.fz2
    protected final zy2[] e(dt2[] dt2VarArr, vy2[] vy2VarArr, int[][][] iArr) {
        uy2 uy2Var;
        int[] iArr2;
        ArrayList arrayList;
        boolean z;
        int i2;
        int i3 = 2;
        zy2[] zy2VarArr = new zy2[2];
        az2 az2Var = this.f5227e.get();
        int i4 = 0;
        boolean z2 = false;
        while (i4 < i3) {
            if (dt2VarArr[i4].zza() == i3) {
                if (!z2) {
                    dt2 dt2Var = dt2VarArr[i4];
                    vy2 vy2Var = vy2VarArr[i4];
                    int[][] iArr3 = iArr[i4];
                    int i5 = az2Var.f5029d;
                    int i6 = 0;
                    uy2 uy2Var2 = null;
                    int i7 = 0;
                    int i8 = 0;
                    int i9 = -1;
                    int i10 = -1;
                    while (i6 < vy2Var.f9815b) {
                        uy2 uy2VarA = vy2Var.a(i6);
                        ArrayList arrayList2 = new ArrayList(uy2VarA.a);
                        for (int i11 = 0; i11 < uy2VarA.a; i11++) {
                            arrayList2.add(Integer.valueOf(i11));
                        }
                        int[] iArr4 = iArr3[i6];
                        int iA = i10;
                        int i12 = 0;
                        while (i12 < uy2VarA.a) {
                            vy2 vy2Var2 = vy2Var;
                            if (g(iArr4[i12], true)) {
                                xs2 xs2VarA = uy2VarA.a(i12);
                                if (arrayList2.contains(Integer.valueOf(i12))) {
                                    int i13 = xs2VarA.n;
                                    int i14 = xs2VarA.f10246f;
                                    uy2Var = uy2VarA;
                                    z = true;
                                } else {
                                    uy2Var = uy2VarA;
                                    z = false;
                                }
                                if (true != z) {
                                    arrayList = arrayList2;
                                    i2 = 1;
                                } else {
                                    arrayList = arrayList2;
                                    i2 = 2;
                                }
                                iArr2 = iArr4;
                                boolean zG = g(iArr4[i12], false);
                                if (zG) {
                                    i2 += CoreConstants.MILLIS_IN_ONE_SECOND;
                                }
                                boolean z3 = i2 > i8;
                                if (i2 == i8) {
                                    int iH = xs2VarA.A() != iA ? h(xs2VarA.A(), iA) : h(xs2VarA.f10246f, i9);
                                    z3 = !(zG && z) ? iH >= 0 : iH <= 0;
                                }
                                if (z3) {
                                    i9 = xs2VarA.f10246f;
                                    iA = xs2VarA.A();
                                    i8 = i2;
                                    i7 = i12;
                                    uy2Var2 = uy2Var;
                                }
                            } else {
                                uy2Var = uy2VarA;
                                iArr2 = iArr4;
                                arrayList = arrayList2;
                            }
                            i12++;
                            vy2Var = vy2Var2;
                            uy2VarA = uy2Var;
                            arrayList2 = arrayList;
                            iArr4 = iArr2;
                        }
                        i6++;
                        i10 = iA;
                    }
                    cz2 cz2Var = uy2Var2 == null ? null : new cz2(uy2Var2, i7, 0, null);
                    zy2VarArr[i4] = cz2Var;
                    z2 = cz2Var != null;
                }
                int i15 = vy2VarArr[i4].f9815b;
            }
            i4++;
            i3 = 2;
        }
        int i16 = 0;
        boolean z4 = false;
        while (i16 < i3) {
            if (dt2VarArr[i16].zza() == 1 && !z4) {
                vy2 vy2Var3 = vy2VarArr[i16];
                int[][] iArr5 = iArr[i16];
                String str = az2Var.a;
                int i17 = -1;
                int i18 = -1;
                int i19 = 0;
                int i20 = 0;
                while (i19 < vy2Var3.f9815b) {
                    uy2 uy2VarA2 = vy2Var3.a(i19);
                    int[] iArr6 = iArr5[i19];
                    int i21 = i20;
                    int i22 = i18;
                    int i23 = i17;
                    for (int i24 = 0; i24 < uy2VarA2.a; i24++) {
                        if (g(iArr6[i24], true)) {
                            xs2 xs2VarA2 = uy2VarA2.a(i24);
                            int i25 = iArr6[i24];
                            int i26 = 1 != (xs2VarA2.B & 1) ? 1 : 2;
                            if (g(i25, false)) {
                                i26 += CoreConstants.MILLIS_IN_ONE_SECOND;
                            }
                            if (i26 > i21) {
                                i22 = i24;
                                i23 = i19;
                                i21 = i26;
                            }
                        }
                    }
                    i19++;
                    i17 = i23;
                    i18 = i22;
                    i20 = i21;
                }
                cz2 cz2Var2 = i17 == -1 ? null : new cz2(vy2Var3.a(i17), i18, 0, null);
                zy2VarArr[i16] = cz2Var2;
                z4 = cz2Var2 != null;
            }
            i16++;
            i3 = 2;
        }
        return zy2VarArr;
    }
}