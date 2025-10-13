package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class ph2 {
    static int a(byte[] bArr, int i2, oh2 oh2Var) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            return b(b2, bArr, i3, oh2Var);
        }
        oh2Var.a = b2;
        return i3;
    }

    static int b(int i2, byte[] bArr, int i3, oh2 oh2Var) {
        int i4 = i2 & 127;
        int i5 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            oh2Var.a = i4 | (b2 << 7);
            return i5;
        }
        int i6 = i4 | ((b2 & 127) << 7);
        int i7 = i5 + 1;
        byte b3 = bArr[i5];
        if (b3 >= 0) {
            oh2Var.a = i6 | (b3 << 14);
            return i7;
        }
        int i8 = i6 | ((b3 & 127) << 14);
        int i9 = i7 + 1;
        byte b4 = bArr[i7];
        if (b4 >= 0) {
            oh2Var.a = i8 | (b4 << 21);
            return i9;
        }
        int i10 = i8 | ((b4 & 127) << 21);
        int i11 = i9 + 1;
        byte b5 = bArr[i9];
        if (b5 >= 0) {
            oh2Var.a = i10 | (b5 << 28);
            return i11;
        }
        int i12 = i10 | ((b5 & 127) << 28);
        while (true) {
            int i13 = i11 + 1;
            if (bArr[i11] >= 0) {
                oh2Var.a = i12;
                return i13;
            }
            i11 = i13;
        }
    }

    static int c(byte[] bArr, int i2, oh2 oh2Var) {
        int i3 = i2 + 1;
        long j2 = bArr[i2];
        if (j2 >= 0) {
            oh2Var.f7944b = j2;
            return i3;
        }
        int i4 = i3 + 1;
        byte b2 = bArr[i3];
        long j3 = (j2 & 127) | ((b2 & 127) << 7);
        int i5 = 7;
        while (b2 < 0) {
            int i6 = i4 + 1;
            i5 += 7;
            j3 |= (r10 & 127) << i5;
            b2 = bArr[i4];
            i4 = i6;
        }
        oh2Var.f7944b = j3;
        return i4;
    }

    static int d(byte[] bArr, int i2) {
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    static long e(byte[] bArr, int i2) {
        return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
    }

    static int f(byte[] bArr, int i2, oh2 oh2Var) throws qj2 {
        int iA = a(bArr, i2, oh2Var);
        int i3 = oh2Var.a;
        if (i3 < 0) {
            throw qj2.c();
        }
        if (i3 == 0) {
            oh2Var.f7945c = "";
            return iA;
        }
        oh2Var.f7945c = new String(bArr, iA, i3, oj2.a);
        return iA + i3;
    }

    static int g(byte[] bArr, int i2, oh2 oh2Var) throws qj2 {
        int iA = a(bArr, i2, oh2Var);
        int i3 = oh2Var.a;
        if (i3 < 0) {
            throw qj2.c();
        }
        if (i3 == 0) {
            oh2Var.f7945c = "";
            return iA;
        }
        oh2Var.f7945c = hm2.f(bArr, iA, i3);
        return iA + i3;
    }

    static int h(byte[] bArr, int i2, oh2 oh2Var) {
        int iA = a(bArr, i2, oh2Var);
        int i3 = oh2Var.a;
        if (i3 < 0) {
            throw qj2.c();
        }
        if (i3 > bArr.length - iA) {
            throw qj2.b();
        }
        if (i3 == 0) {
            oh2Var.f7945c = ci2.f5319e;
            return iA;
        }
        oh2Var.f7945c = ci2.G(bArr, iA, i3);
        return iA + i3;
    }

    static int i(dl2 dl2Var, byte[] bArr, int i2, int i3, oh2 oh2Var) {
        int iB = i2 + 1;
        int i4 = bArr[i2];
        if (i4 < 0) {
            iB = b(i4, bArr, iB, oh2Var);
            i4 = oh2Var.a;
        }
        int i5 = iB;
        if (i4 < 0 || i4 > i3 - i5) {
            throw qj2.b();
        }
        Object objZza = dl2Var.zza();
        int i6 = i4 + i5;
        dl2Var.k(objZza, bArr, i5, i6, oh2Var);
        dl2Var.j(objZza);
        oh2Var.f7945c = objZza;
        return i6;
    }

    static int j(dl2 dl2Var, byte[] bArr, int i2, int i3, int i4, oh2 oh2Var) {
        ok2 ok2Var = (ok2) dl2Var;
        Object objZza = ok2Var.zza();
        int I = ok2Var.I(objZza, bArr, i2, i3, i4, oh2Var);
        ok2Var.j(objZza);
        oh2Var.f7945c = objZza;
        return I;
    }

    static int k(int i2, byte[] bArr, int i3, int i4, nj2<?> nj2Var, oh2 oh2Var) {
        fj2 fj2Var = (fj2) nj2Var;
        int iA = a(bArr, i3, oh2Var);
        fj2Var.Z(oh2Var.a);
        while (iA < i4) {
            int iA2 = a(bArr, iA, oh2Var);
            if (i2 != oh2Var.a) {
                break;
            }
            iA = a(bArr, iA2, oh2Var);
            fj2Var.Z(oh2Var.a);
        }
        return iA;
    }

    static int l(byte[] bArr, int i2, nj2<?> nj2Var, oh2 oh2Var) {
        fj2 fj2Var = (fj2) nj2Var;
        int iA = a(bArr, i2, oh2Var);
        int i3 = oh2Var.a + iA;
        while (iA < i3) {
            iA = a(bArr, iA, oh2Var);
            fj2Var.Z(oh2Var.a);
        }
        if (iA == i3) {
            return iA;
        }
        throw qj2.b();
    }

    static int m(dl2<?> dl2Var, int i2, byte[] bArr, int i3, int i4, nj2<?> nj2Var, oh2 oh2Var) {
        int i5 = i(dl2Var, bArr, i3, i4, oh2Var);
        nj2Var.add(oh2Var.f7945c);
        while (i5 < i4) {
            int iA = a(bArr, i5, oh2Var);
            if (i2 != oh2Var.a) {
                break;
            }
            i5 = i(dl2Var, bArr, iA, i4, oh2Var);
            nj2Var.add(oh2Var.f7945c);
        }
        return i5;
    }

    static int n(int i2, byte[] bArr, int i3, int i4, sl2 sl2Var, oh2 oh2Var) {
        if ((i2 >>> 3) == 0) {
            throw qj2.e();
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            int iC = c(bArr, i3, oh2Var);
            sl2Var.h(i2, Long.valueOf(oh2Var.f7944b));
            return iC;
        }
        if (i5 == 1) {
            sl2Var.h(i2, Long.valueOf(e(bArr, i3)));
            return i3 + 8;
        }
        if (i5 == 2) {
            int iA = a(bArr, i3, oh2Var);
            int i6 = oh2Var.a;
            if (i6 < 0) {
                throw qj2.c();
            }
            if (i6 > bArr.length - iA) {
                throw qj2.b();
            }
            if (i6 == 0) {
                sl2Var.h(i2, ci2.f5319e);
            } else {
                sl2Var.h(i2, ci2.G(bArr, iA, i6));
            }
            return iA + i6;
        }
        if (i5 != 3) {
            if (i5 != 5) {
                throw qj2.e();
            }
            sl2Var.h(i2, Integer.valueOf(d(bArr, i3)));
            return i3 + 4;
        }
        int i7 = (i2 & (-8)) | 4;
        sl2 sl2VarB = sl2.b();
        int i8 = 0;
        while (true) {
            if (i3 >= i4) {
                break;
            }
            int iA2 = a(bArr, i3, oh2Var);
            int i9 = oh2Var.a;
            if (i9 == i7) {
                i8 = i9;
                i3 = iA2;
                break;
            }
            i8 = i9;
            i3 = n(i9, bArr, iA2, i4, sl2VarB, oh2Var);
        }
        if (i3 > i4 || i8 != i7) {
            throw qj2.i();
        }
        sl2Var.h(i2, sl2VarB);
        return i3;
    }
}