package e.c.b.b.c.e;

import java.io.IOException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
public abstract class y6 extends h6 {
    private static final Logger a = Logger.getLogger(y6.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f14946b = qa.m();

    /* renamed from: c, reason: collision with root package name */
    a7 f14947c;

    /* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
    public static class a extends IOException {
        a(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        a(String str, Throwable th) {
            String strValueOf = String.valueOf(str);
            super(strValueOf.length() != 0 ? "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(strValueOf) : new String("CodedOutputStream was writing to a flat byte array and ran out of space.: "), th);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
    private static class b extends y6 {

        /* renamed from: d, reason: collision with root package name */
        private final byte[] f14948d;

        /* renamed from: e, reason: collision with root package name */
        private final int f14949e;

        /* renamed from: f, reason: collision with root package name */
        private final int f14950f;

        /* renamed from: g, reason: collision with root package name */
        private int f14951g;

        b(byte[] bArr, int i2, int i3) {
            super();
            Objects.requireNonNull(bArr, "buffer");
            if ((i3 | 0 | (bArr.length - i3)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i3)));
            }
            this.f14948d = bArr;
            this.f14949e = 0;
            this.f14951g = 0;
            this.f14950f = i3;
        }

        private final void F0(byte[] bArr, int i2, int i3) throws a {
            try {
                System.arraycopy(bArr, i2, this.f14948d, this.f14951g, i3);
                this.f14951g += i3;
            } catch (IndexOutOfBoundsException e2) {
                throw new a(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f14951g), Integer.valueOf(this.f14950f), Integer.valueOf(i3)), e2);
            }
        }

        @Override // e.c.b.b.c.e.y6
        public final void O(int i2) throws a {
            if (!y6.f14946b || d6.b() || b() < 5) {
                while ((i2 & (-128)) != 0) {
                    try {
                        byte[] bArr = this.f14948d;
                        int i3 = this.f14951g;
                        this.f14951g = i3 + 1;
                        bArr[i3] = (byte) ((i2 & 127) | 128);
                        i2 >>>= 7;
                    } catch (IndexOutOfBoundsException e2) {
                        throw new a(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f14951g), Integer.valueOf(this.f14950f), 1), e2);
                    }
                }
                byte[] bArr2 = this.f14948d;
                int i4 = this.f14951g;
                this.f14951g = i4 + 1;
                bArr2[i4] = (byte) i2;
                return;
            }
            if ((i2 & (-128)) == 0) {
                byte[] bArr3 = this.f14948d;
                int i5 = this.f14951g;
                this.f14951g = i5 + 1;
                qa.l(bArr3, i5, (byte) i2);
                return;
            }
            byte[] bArr4 = this.f14948d;
            int i6 = this.f14951g;
            this.f14951g = i6 + 1;
            qa.l(bArr4, i6, (byte) (i2 | 128));
            int i7 = i2 >>> 7;
            if ((i7 & (-128)) == 0) {
                byte[] bArr5 = this.f14948d;
                int i8 = this.f14951g;
                this.f14951g = i8 + 1;
                qa.l(bArr5, i8, (byte) i7);
                return;
            }
            byte[] bArr6 = this.f14948d;
            int i9 = this.f14951g;
            this.f14951g = i9 + 1;
            qa.l(bArr6, i9, (byte) (i7 | 128));
            int i10 = i7 >>> 7;
            if ((i10 & (-128)) == 0) {
                byte[] bArr7 = this.f14948d;
                int i11 = this.f14951g;
                this.f14951g = i11 + 1;
                qa.l(bArr7, i11, (byte) i10);
                return;
            }
            byte[] bArr8 = this.f14948d;
            int i12 = this.f14951g;
            this.f14951g = i12 + 1;
            qa.l(bArr8, i12, (byte) (i10 | 128));
            int i13 = i10 >>> 7;
            if ((i13 & (-128)) == 0) {
                byte[] bArr9 = this.f14948d;
                int i14 = this.f14951g;
                this.f14951g = i14 + 1;
                qa.l(bArr9, i14, (byte) i13);
                return;
            }
            byte[] bArr10 = this.f14948d;
            int i15 = this.f14951g;
            this.f14951g = i15 + 1;
            qa.l(bArr10, i15, (byte) (i13 | 128));
            byte[] bArr11 = this.f14948d;
            int i16 = this.f14951g;
            this.f14951g = i16 + 1;
            qa.l(bArr11, i16, (byte) (i13 >>> 7));
        }

        @Override // e.c.b.b.c.e.y6
        public final void P(int i2, int i3) {
            m(i2, 0);
            j(i3);
        }

        @Override // e.c.b.b.c.e.y6
        public final void R(int i2, g6 g6Var) {
            m(1, 3);
            X(2, i2);
            o(3, g6Var);
            m(1, 4);
        }

        @Override // e.c.b.b.c.e.y6
        public final void X(int i2, int i3) {
            m(i2, 0);
            O(i3);
        }

        @Override // e.c.b.b.c.e.y6
        public final void Y(int i2, long j2) {
            m(i2, 1);
            Z(j2);
        }

        @Override // e.c.b.b.c.e.y6
        public final void Z(long j2) throws a {
            try {
                byte[] bArr = this.f14948d;
                int i2 = this.f14951g;
                int i3 = i2 + 1;
                this.f14951g = i3;
                bArr[i2] = (byte) j2;
                int i4 = i3 + 1;
                this.f14951g = i4;
                bArr[i3] = (byte) (j2 >> 8);
                int i5 = i4 + 1;
                this.f14951g = i5;
                bArr[i4] = (byte) (j2 >> 16);
                int i6 = i5 + 1;
                this.f14951g = i6;
                bArr[i5] = (byte) (j2 >> 24);
                int i7 = i6 + 1;
                this.f14951g = i7;
                bArr[i6] = (byte) (j2 >> 32);
                int i8 = i7 + 1;
                this.f14951g = i8;
                bArr[i7] = (byte) (j2 >> 40);
                int i9 = i8 + 1;
                this.f14951g = i9;
                bArr[i8] = (byte) (j2 >> 48);
                this.f14951g = i9 + 1;
                bArr[i9] = (byte) (j2 >> 56);
            } catch (IndexOutOfBoundsException e2) {
                throw new a(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f14951g), Integer.valueOf(this.f14950f), 1), e2);
            }
        }

        @Override // e.c.b.b.c.e.h6
        public final void a(byte[] bArr, int i2, int i3) throws a {
            F0(bArr, i2, i3);
        }

        @Override // e.c.b.b.c.e.y6
        public final int b() {
            return this.f14950f - this.f14951g;
        }

        @Override // e.c.b.b.c.e.y6
        public final void e0(int i2) throws a {
            try {
                byte[] bArr = this.f14948d;
                int i3 = this.f14951g;
                int i4 = i3 + 1;
                this.f14951g = i4;
                bArr[i3] = (byte) i2;
                int i5 = i4 + 1;
                this.f14951g = i5;
                bArr[i4] = (byte) (i2 >> 8);
                int i6 = i5 + 1;
                this.f14951g = i6;
                bArr[i5] = (byte) (i2 >> 16);
                this.f14951g = i6 + 1;
                bArr[i6] = (byte) (i2 >>> 24);
            } catch (IndexOutOfBoundsException e2) {
                throw new a(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f14951g), Integer.valueOf(this.f14950f), 1), e2);
            }
        }

        @Override // e.c.b.b.c.e.y6
        public final void g(byte b2) throws a {
            try {
                byte[] bArr = this.f14948d;
                int i2 = this.f14951g;
                this.f14951g = i2 + 1;
                bArr[i2] = b2;
            } catch (IndexOutOfBoundsException e2) {
                throw new a(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f14951g), Integer.valueOf(this.f14950f), 1), e2);
            }
        }

        @Override // e.c.b.b.c.e.y6
        public final void j(int i2) {
            if (i2 >= 0) {
                O(i2);
            } else {
                t(i2);
            }
        }

        @Override // e.c.b.b.c.e.y6
        public final void j0(int i2, int i3) {
            m(i2, 5);
            e0(i3);
        }

        @Override // e.c.b.b.c.e.y6
        public final void m(int i2, int i3) {
            O((i2 << 3) | i3);
        }

        @Override // e.c.b.b.c.e.y6
        public final void n(int i2, long j2) {
            m(i2, 0);
            t(j2);
        }

        @Override // e.c.b.b.c.e.y6
        public final void o(int i2, g6 g6Var) {
            m(i2, 2);
            u(g6Var);
        }

        @Override // e.c.b.b.c.e.y6
        public final void p(int i2, b9 b9Var) {
            m(1, 3);
            X(2, i2);
            m(3, 2);
            v(b9Var);
            m(1, 4);
        }

        @Override // e.c.b.b.c.e.y6
        final void q(int i2, b9 b9Var, s9 s9Var) {
            m(i2, 2);
            x5 x5Var = (x5) b9Var;
            int iJ = x5Var.j();
            if (iJ == -1) {
                iJ = s9Var.zzb(x5Var);
                x5Var.k(iJ);
            }
            O(iJ);
            s9Var.c(b9Var, this.f14947c);
        }

        @Override // e.c.b.b.c.e.y6
        public final void r(int i2, String str) {
            m(i2, 2);
            w(str);
        }

        @Override // e.c.b.b.c.e.y6
        public final void s(int i2, boolean z) {
            m(i2, 0);
            g(z ? (byte) 1 : (byte) 0);
        }

        @Override // e.c.b.b.c.e.y6
        public final void t(long j2) throws a {
            if (y6.f14946b && b() >= 10) {
                while ((j2 & (-128)) != 0) {
                    byte[] bArr = this.f14948d;
                    int i2 = this.f14951g;
                    this.f14951g = i2 + 1;
                    qa.l(bArr, i2, (byte) ((((int) j2) & 127) | 128));
                    j2 >>>= 7;
                }
                byte[] bArr2 = this.f14948d;
                int i3 = this.f14951g;
                this.f14951g = i3 + 1;
                qa.l(bArr2, i3, (byte) j2);
                return;
            }
            while ((j2 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f14948d;
                    int i4 = this.f14951g;
                    this.f14951g = i4 + 1;
                    bArr3[i4] = (byte) ((((int) j2) & 127) | 128);
                    j2 >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new a(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f14951g), Integer.valueOf(this.f14950f), 1), e2);
                }
            }
            byte[] bArr4 = this.f14948d;
            int i5 = this.f14951g;
            this.f14951g = i5 + 1;
            bArr4[i5] = (byte) j2;
        }

        @Override // e.c.b.b.c.e.y6
        public final void u(g6 g6Var) {
            O(g6Var.c());
            g6Var.n(this);
        }

        @Override // e.c.b.b.c.e.y6
        public final void v(b9 b9Var) {
            O(b9Var.b());
            b9Var.e(this);
        }

        @Override // e.c.b.b.c.e.y6
        public final void w(String str) throws a {
            int i2 = this.f14951g;
            try {
                int iO0 = y6.o0(str.length() * 3);
                int iO02 = y6.o0(str.length());
                if (iO02 != iO0) {
                    O(ta.d(str));
                    this.f14951g = ta.e(str, this.f14948d, this.f14951g, b());
                    return;
                }
                int i3 = i2 + iO02;
                this.f14951g = i3;
                int iE = ta.e(str, this.f14948d, i3, b());
                this.f14951g = i2;
                O((iE - i2) - iO02);
                this.f14951g = iE;
            } catch (xa e2) {
                this.f14951g = i2;
                x(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new a(e3);
            }
        }
    }

    private y6() {
    }

    public static int A(float f2) {
        return 4;
    }

    public static int A0(int i2, int i3) {
        return o0(i2 << 3) + 4;
    }

    public static int B(int i2, double d2) {
        return o0(i2 << 3) + 8;
    }

    public static int B0(int i2) {
        return k0(i2);
    }

    public static int C(int i2, float f2) {
        return o0(i2 << 3) + 4;
    }

    public static int C0(int i2, int i3) {
        return o0(i2 << 3) + k0(i3);
    }

    public static int D(int i2, f8 f8Var) {
        return (o0(8) << 1) + p0(2, i2) + c(3, f8Var);
    }

    @Deprecated
    public static int D0(int i2) {
        return o0(i2);
    }

    public static int E(int i2, b9 b9Var) {
        return (o0(8) << 1) + p0(2, i2) + o0(24) + J(b9Var);
    }

    private static int E0(int i2) {
        return (i2 >> 31) ^ (i2 << 1);
    }

    static int F(int i2, b9 b9Var, s9 s9Var) {
        return o0(i2 << 3) + e(b9Var, s9Var);
    }

    public static int G(int i2, String str) {
        return o0(i2 << 3) + K(str);
    }

    public static int H(int i2, boolean z) {
        return o0(i2 << 3) + 1;
    }

    public static int I(g6 g6Var) {
        int iC = g6Var.c();
        return o0(iC) + iC;
    }

    public static int J(b9 b9Var) {
        int iB = b9Var.b();
        return o0(iB) + iB;
    }

    public static int K(String str) {
        int length;
        try {
            length = ta.d(str);
        } catch (xa unused) {
            length = str.getBytes(r7.a).length;
        }
        return o0(length) + length;
    }

    public static int L(boolean z) {
        return 1;
    }

    public static int M(byte[] bArr) {
        int length = bArr.length;
        return o0(length) + length;
    }

    public static int T(int i2, g6 g6Var) {
        int iO0 = o0(i2 << 3);
        int iC = g6Var.c();
        return iO0 + o0(iC) + iC;
    }

    @Deprecated
    static int U(int i2, b9 b9Var, s9 s9Var) {
        int iO0 = o0(i2 << 3) << 1;
        x5 x5Var = (x5) b9Var;
        int iJ = x5Var.j();
        if (iJ == -1) {
            iJ = s9Var.zzb(x5Var);
            x5Var.k(iJ);
        }
        return iO0 + iJ;
    }

    @Deprecated
    public static int V(b9 b9Var) {
        return b9Var.b();
    }

    public static int b0(int i2, long j2) {
        return o0(i2 << 3) + i0(j2);
    }

    public static int c(int i2, f8 f8Var) {
        int iO0 = o0(i2 << 3);
        int iB = f8Var.b();
        return iO0 + o0(iB) + iB;
    }

    public static int c0(int i2, g6 g6Var) {
        return (o0(8) << 1) + p0(2, i2) + T(3, g6Var);
    }

    public static int d(f8 f8Var) {
        int iB = f8Var.b();
        return o0(iB) + iB;
    }

    public static int d0(long j2) {
        return i0(j2);
    }

    static int e(b9 b9Var, s9 s9Var) {
        x5 x5Var = (x5) b9Var;
        int iJ = x5Var.j();
        if (iJ == -1) {
            iJ = s9Var.zzb(x5Var);
            x5Var.k(iJ);
        }
        return o0(iJ) + iJ;
    }

    public static y6 f(byte[] bArr) {
        return new b(bArr, 0, bArr.length);
    }

    public static int g0(int i2) {
        return o0(i2 << 3);
    }

    public static int h0(int i2, long j2) {
        return o0(i2 << 3) + i0(j2);
    }

    public static int i0(long j2) {
        int i2;
        if (((-128) & j2) == 0) {
            return 1;
        }
        if (j2 < 0) {
            return 10;
        }
        if (((-34359738368L) & j2) != 0) {
            i2 = 6;
            j2 >>>= 28;
        } else {
            i2 = 2;
        }
        if (((-2097152) & j2) != 0) {
            i2 += 2;
            j2 >>>= 14;
        }
        return (j2 & (-16384)) != 0 ? i2 + 1 : i2;
    }

    public static int k0(int i2) {
        if (i2 >= 0) {
            return o0(i2);
        }
        return 10;
    }

    public static int l0(int i2, int i3) {
        return o0(i2 << 3) + k0(i3);
    }

    public static int m0(int i2, long j2) {
        return o0(i2 << 3) + i0(y0(j2));
    }

    public static int n0(long j2) {
        return i0(y0(j2));
    }

    public static int o0(int i2) {
        if ((i2 & (-128)) == 0) {
            return 1;
        }
        if ((i2 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i2) == 0) {
            return 3;
        }
        return (i2 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int p0(int i2, int i3) {
        return o0(i2 << 3) + o0(i3);
    }

    public static int q0(int i2, long j2) {
        return o0(i2 << 3) + 8;
    }

    public static int r0(long j2) {
        return 8;
    }

    public static int s0(int i2) {
        return o0(E0(i2));
    }

    public static int t0(int i2, int i3) {
        return o0(i2 << 3) + o0(E0(i3));
    }

    public static int u0(int i2, long j2) {
        return o0(i2 << 3) + 8;
    }

    public static int v0(long j2) {
        return 8;
    }

    public static int w0(int i2) {
        return 4;
    }

    public static int x0(int i2, int i3) {
        return o0(i2 << 3) + 4;
    }

    private static long y0(long j2) {
        return (j2 >> 63) ^ (j2 << 1);
    }

    public static int z(double d2) {
        return 8;
    }

    public static int z0(int i2) {
        return 4;
    }

    public final void N() {
        if (b() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void O(int i2);

    public abstract void P(int i2, int i3);

    public final void Q(int i2, long j2) {
        n(i2, y0(j2));
    }

    public abstract void R(int i2, g6 g6Var);

    public final void S(long j2) {
        t(y0(j2));
    }

    public final void W(int i2) {
        O(E0(i2));
    }

    public abstract void X(int i2, int i3);

    public abstract void Y(int i2, long j2);

    public abstract void Z(long j2);

    public abstract int b();

    public abstract void e0(int i2);

    public final void f0(int i2, int i3) {
        X(i2, E0(i3));
    }

    public abstract void g(byte b2);

    public final void h(double d2) {
        Z(Double.doubleToRawLongBits(d2));
    }

    public final void i(float f2) {
        e0(Float.floatToRawIntBits(f2));
    }

    public abstract void j(int i2);

    public abstract void j0(int i2, int i3);

    public final void k(int i2, double d2) {
        Y(i2, Double.doubleToRawLongBits(d2));
    }

    public final void l(int i2, float f2) {
        j0(i2, Float.floatToRawIntBits(f2));
    }

    public abstract void m(int i2, int i3);

    public abstract void n(int i2, long j2);

    public abstract void o(int i2, g6 g6Var);

    public abstract void p(int i2, b9 b9Var);

    abstract void q(int i2, b9 b9Var, s9 s9Var);

    public abstract void r(int i2, String str);

    public abstract void s(int i2, boolean z);

    public abstract void t(long j2);

    public abstract void u(g6 g6Var);

    public abstract void v(b9 b9Var);

    public abstract void w(String str);

    final void x(String str, xa xaVar) throws a {
        a.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) xaVar);
        byte[] bytes = str.getBytes(r7.a);
        try {
            O(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (a e2) {
            throw e2;
        } catch (IndexOutOfBoundsException e3) {
            throw new a(e3);
        }
    }

    public final void y(boolean z) {
        g(z ? (byte) 1 : (byte) 0);
    }
}