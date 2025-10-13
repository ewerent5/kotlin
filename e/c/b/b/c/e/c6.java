package e.c.b.b.c.e;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
final class c6 {
    static int a(int i2, byte[] bArr, int i3, int i4, f6 f6Var) throws a8 {
        if ((i2 >>> 3) == 0) {
            throw a8.c();
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            return k(bArr, i3, f6Var);
        }
        if (i5 == 1) {
            return i3 + 8;
        }
        if (i5 == 2) {
            return i(bArr, i3, f6Var) + f6Var.a;
        }
        if (i5 != 3) {
            if (i5 == 5) {
                return i3 + 4;
            }
            throw a8.c();
        }
        int i6 = (i2 & (-8)) | 4;
        int i7 = 0;
        while (i3 < i4) {
            i3 = i(bArr, i3, f6Var);
            i7 = f6Var.a;
            if (i7 == i6) {
                break;
            }
            i3 = a(i7, bArr, i3, i4, f6Var);
        }
        if (i3 > i4 || i7 != i6) {
            throw a8.e();
        }
        return i3;
    }

    static int b(int i2, byte[] bArr, int i3, int i4, x7<?> x7Var, f6 f6Var) {
        s7 s7Var = (s7) x7Var;
        int i5 = i(bArr, i3, f6Var);
        s7Var.f(f6Var.a);
        while (i5 < i4) {
            int i6 = i(bArr, i5, f6Var);
            if (i2 != f6Var.a) {
                break;
            }
            i5 = i(bArr, i6, f6Var);
            s7Var.f(f6Var.a);
        }
        return i5;
    }

    static int c(int i2, byte[] bArr, int i3, int i4, ja jaVar, f6 f6Var) throws a8 {
        if ((i2 >>> 3) == 0) {
            throw a8.c();
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            int iK = k(bArr, i3, f6Var);
            jaVar.c(i2, Long.valueOf(f6Var.f14515b));
            return iK;
        }
        if (i5 == 1) {
            jaVar.c(i2, Long.valueOf(l(bArr, i3)));
            return i3 + 8;
        }
        if (i5 == 2) {
            int i6 = i(bArr, i3, f6Var);
            int i7 = f6Var.a;
            if (i7 < 0) {
                throw a8.b();
            }
            if (i7 > bArr.length - i6) {
                throw a8.a();
            }
            if (i7 == 0) {
                jaVar.c(i2, g6.f14544e);
            } else {
                jaVar.c(i2, g6.l(bArr, i6, i7));
            }
            return i6 + i7;
        }
        if (i5 != 3) {
            if (i5 != 5) {
                throw a8.c();
            }
            jaVar.c(i2, Integer.valueOf(h(bArr, i3)));
            return i3 + 4;
        }
        ja jaVarG = ja.g();
        int i8 = (i2 & (-8)) | 4;
        int i9 = 0;
        while (true) {
            if (i3 >= i4) {
                break;
            }
            int i10 = i(bArr, i3, f6Var);
            int i11 = f6Var.a;
            i9 = i11;
            if (i11 == i8) {
                i3 = i10;
                break;
            }
            int iC = c(i9, bArr, i10, i4, jaVarG, f6Var);
            i9 = i11;
            i3 = iC;
        }
        if (i3 > i4 || i9 != i8) {
            throw a8.e();
        }
        jaVar.c(i2, jaVarG);
        return i3;
    }

    static int d(int i2, byte[] bArr, int i3, f6 f6Var) {
        int i4 = i2 & 127;
        int i5 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            f6Var.a = i4 | (b2 << 7);
            return i5;
        }
        int i6 = i4 | ((b2 & 127) << 7);
        int i7 = i5 + 1;
        byte b3 = bArr[i5];
        if (b3 >= 0) {
            f6Var.a = i6 | (b3 << 14);
            return i7;
        }
        int i8 = i6 | ((b3 & 127) << 14);
        int i9 = i7 + 1;
        byte b4 = bArr[i7];
        if (b4 >= 0) {
            f6Var.a = i8 | (b4 << 21);
            return i9;
        }
        int i10 = i8 | ((b4 & 127) << 21);
        int i11 = i9 + 1;
        byte b5 = bArr[i9];
        if (b5 >= 0) {
            f6Var.a = i10 | (b5 << 28);
            return i11;
        }
        int i12 = i10 | ((b5 & 127) << 28);
        while (true) {
            int i13 = i11 + 1;
            if (bArr[i11] >= 0) {
                f6Var.a = i12;
                return i13;
            }
            i11 = i13;
        }
    }

    static int e(s9<?> s9Var, int i2, byte[] bArr, int i3, int i4, x7<?> x7Var, f6 f6Var) throws a8 {
        int iG = g(s9Var, bArr, i3, i4, f6Var);
        x7Var.add(f6Var.f14516c);
        while (iG < i4) {
            int i5 = i(bArr, iG, f6Var);
            if (i2 != f6Var.a) {
                break;
            }
            iG = g(s9Var, bArr, i5, i4, f6Var);
            x7Var.add(f6Var.f14516c);
        }
        return iG;
    }

    static int f(s9 s9Var, byte[] bArr, int i2, int i3, int i4, f6 f6Var) throws a8 {
        e9 e9Var = (e9) s9Var;
        Object objZza = e9Var.zza();
        int iL = e9Var.l(objZza, bArr, i2, i3, i4, f6Var);
        e9Var.b(objZza);
        f6Var.f14516c = objZza;
        return iL;
    }

    static int g(s9 s9Var, byte[] bArr, int i2, int i3, f6 f6Var) throws a8 {
        int iD = i2 + 1;
        int i4 = bArr[i2];
        if (i4 < 0) {
            iD = d(i4, bArr, iD, f6Var);
            i4 = f6Var.a;
        }
        int i5 = iD;
        if (i4 < 0 || i4 > i3 - i5) {
            throw a8.a();
        }
        Object objZza = s9Var.zza();
        int i6 = i4 + i5;
        s9Var.f(objZza, bArr, i5, i6, f6Var);
        s9Var.b(objZza);
        f6Var.f14516c = objZza;
        return i6;
    }

    static int h(byte[] bArr, int i2) {
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    static int i(byte[] bArr, int i2, f6 f6Var) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            return d(b2, bArr, i3, f6Var);
        }
        f6Var.a = b2;
        return i3;
    }

    static int j(byte[] bArr, int i2, x7<?> x7Var, f6 f6Var) throws a8 {
        s7 s7Var = (s7) x7Var;
        int i3 = i(bArr, i2, f6Var);
        int i4 = f6Var.a + i3;
        while (i3 < i4) {
            i3 = i(bArr, i3, f6Var);
            s7Var.f(f6Var.a);
        }
        if (i3 == i4) {
            return i3;
        }
        throw a8.a();
    }

    static int k(byte[] bArr, int i2, f6 f6Var) {
        int i3 = i2 + 1;
        long j2 = bArr[i2];
        if (j2 >= 0) {
            f6Var.f14515b = j2;
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
        f6Var.f14515b = j3;
        return i4;
    }

    static long l(byte[] bArr, int i2) {
        return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
    }

    static double m(byte[] bArr, int i2) {
        return Double.longBitsToDouble(l(bArr, i2));
    }

    static int n(byte[] bArr, int i2, f6 f6Var) throws a8 {
        int i3 = i(bArr, i2, f6Var);
        int i4 = f6Var.a;
        if (i4 < 0) {
            throw a8.b();
        }
        if (i4 == 0) {
            f6Var.f14516c = "";
            return i3;
        }
        f6Var.f14516c = new String(bArr, i3, i4, r7.a);
        return i3 + i4;
    }

    static float o(byte[] bArr, int i2) {
        return Float.intBitsToFloat(h(bArr, i2));
    }

    static int p(byte[] bArr, int i2, f6 f6Var) throws a8 {
        int i3 = i(bArr, i2, f6Var);
        int i4 = f6Var.a;
        if (i4 < 0) {
            throw a8.b();
        }
        if (i4 == 0) {
            f6Var.f14516c = "";
            return i3;
        }
        f6Var.f14516c = ta.k(bArr, i3, i4);
        return i3 + i4;
    }

    static int q(byte[] bArr, int i2, f6 f6Var) throws a8 {
        int i3 = i(bArr, i2, f6Var);
        int i4 = f6Var.a;
        if (i4 < 0) {
            throw a8.b();
        }
        if (i4 > bArr.length - i3) {
            throw a8.a();
        }
        if (i4 == 0) {
            f6Var.f14516c = g6.f14544e;
            return i3;
        }
        f6Var.f14516c = g6.l(bArr, i3, i4);
        return i3 + i4;
    }
}