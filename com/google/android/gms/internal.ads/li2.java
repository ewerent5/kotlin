package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public abstract class li2 extends rh2 {
    private static final Logger a = Logger.getLogger(li2.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f7257b = cm2.f();

    /* renamed from: c, reason: collision with root package name */
    mi2 f7258c;

    private li2() {
    }

    /* synthetic */ li2(ii2 ii2Var) {
    }

    public static int A(int i2) {
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

    public static int B(long j2) {
        int i2;
        if (((-128) & j2) == 0) {
            return 1;
        }
        if (j2 < 0) {
            return 10;
        }
        if (((-34359738368L) & j2) != 0) {
            j2 >>>= 28;
            i2 = 6;
        } else {
            i2 = 2;
        }
        if (((-2097152) & j2) != 0) {
            i2 += 2;
            j2 >>>= 14;
        }
        return (j2 & (-16384)) != 0 ? i2 + 1 : i2;
    }

    public static int C(String str) {
        int length;
        try {
            length = hm2.d(str);
        } catch (gm2 unused) {
            length = str.getBytes(oj2.a).length;
        }
        return A(length) + length;
    }

    public static int D(sj2 sj2Var) {
        int iA = sj2Var.a();
        return A(iA) + iA;
    }

    public static int a(ci2 ci2Var) {
        int iL = ci2Var.l();
        return A(iL) + iL;
    }

    static int b(lk2 lk2Var, dl2 dl2Var) {
        lh2 lh2Var = (lh2) lk2Var;
        int iC = lh2Var.c();
        if (iC == -1) {
            iC = dl2Var.c(lh2Var);
            lh2Var.h(iC);
        }
        return A(iC) + iC;
    }

    @Deprecated
    static int e(int i2, lk2 lk2Var, dl2 dl2Var) {
        int iA = A(i2 << 3);
        int i3 = iA + iA;
        lh2 lh2Var = (lh2) lk2Var;
        int iC = lh2Var.c();
        if (iC == -1) {
            iC = dl2Var.c(lh2Var);
            lh2Var.h(iC);
        }
        return i3 + iC;
    }

    public static li2 x(byte[] bArr) {
        return new ji2(bArr, 0, bArr.length);
    }

    public static int y(int i2) {
        return A(i2 << 3);
    }

    public static int z(int i2) {
        if (i2 >= 0) {
            return A(i2);
        }
        return 10;
    }

    public final void c() {
        if (w() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void d(String str, gm2 gm2Var) throws ki2 {
        a.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) gm2Var);
        byte[] bytes = str.getBytes(oj2.a);
        try {
            int length = bytes.length;
            r(length);
            v(bytes, 0, length);
        } catch (ki2 e2) {
            throw e2;
        } catch (IndexOutOfBoundsException e3) {
            throw new ki2(e3);
        }
    }

    public abstract void g(int i2, int i3);

    public abstract void h(int i2, int i3);

    public abstract void i(int i2, int i3);

    public abstract void j(int i2, int i3);

    public abstract void k(int i2, long j2);

    public abstract void l(int i2, long j2);

    public abstract void m(int i2, boolean z);

    public abstract void n(int i2, String str);

    public abstract void o(int i2, ci2 ci2Var);

    public abstract void p(byte b2);

    public abstract void q(int i2);

    public abstract void r(int i2);

    public abstract void s(int i2);

    public abstract void t(long j2);

    public abstract void u(long j2);

    public abstract void v(byte[] bArr, int i2, int i3);

    public abstract int w();
}