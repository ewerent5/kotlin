package e.c.b.b.c.e;

import ch.qos.logback.core.net.SyslogConstants;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import okhttp3.internal.ws.WebSocketProtocol;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
final class e9<T> implements s9<T> {
    private static final int[] a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    private static final Unsafe f14479b = qa.t();

    /* renamed from: c, reason: collision with root package name */
    private final int[] f14480c;

    /* renamed from: d, reason: collision with root package name */
    private final Object[] f14481d;

    /* renamed from: e, reason: collision with root package name */
    private final int f14482e;

    /* renamed from: f, reason: collision with root package name */
    private final int f14483f;

    /* renamed from: g, reason: collision with root package name */
    private final b9 f14484g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f14485h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f14486i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f14487j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f14488k;

    /* renamed from: l, reason: collision with root package name */
    private final int[] f14489l;

    /* renamed from: m, reason: collision with root package name */
    private final int f14490m;
    private final int n;
    private final i9 o;
    private final k8 p;
    private final ka<?, ?> q;
    private final d7<?> r;
    private final u8 s;

    private e9(int[] iArr, Object[] objArr, int i2, int i3, b9 b9Var, boolean z, boolean z2, int[] iArr2, int i4, int i5, i9 i9Var, k8 k8Var, ka<?, ?> kaVar, d7<?> d7Var, u8 u8Var) {
        this.f14480c = iArr;
        this.f14481d = objArr;
        this.f14482e = i2;
        this.f14483f = i3;
        this.f14486i = b9Var instanceof o7;
        this.f14487j = z;
        this.f14485h = d7Var != null && d7Var.e(b9Var);
        this.f14488k = false;
        this.f14489l = iArr2;
        this.f14490m = i4;
        this.n = i5;
        this.o = i9Var;
        this.p = k8Var;
        this.q = kaVar;
        this.r = d7Var;
        this.f14484g = b9Var;
        this.s = u8Var;
    }

    private static <T> double A(T t, long j2) {
        return ((Double) qa.F(t, j2)).doubleValue();
    }

    private final int B(int i2, int i3) {
        int length = (this.f14480c.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int i6 = this.f14480c[i5];
            if (i2 == i6) {
                return i5;
            }
            if (i2 < i6) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }

    private final Object C(int i2) {
        return this.f14481d[(i2 / 3) << 1];
    }

    private final void D(T t, int i2) {
        int iM = M(i2);
        long j2 = 1048575 & iM;
        if (j2 == 1048575) {
            return;
        }
        qa.h(t, j2, (1 << (iM >>> 20)) | qa.b(t, j2));
    }

    private final void E(T t, int i2, int i3) {
        qa.h(t, M(i3) & 1048575, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void F(T r18, e.c.b.b.c.e.eb r19) {
        /*
            Method dump skipped, instructions count: 1338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.c.b.b.c.e.e9.F(java.lang.Object, e.c.b.b.c.e.eb):void");
    }

    private final void G(T t, T t2, int i2) {
        int iK = K(i2);
        int i3 = this.f14480c[i2];
        long j2 = iK & 1048575;
        if (x(t2, i3, i2)) {
            Object objF = x(t, i3, i2) ? qa.F(t, j2) : null;
            Object objF2 = qa.F(t2, j2);
            if (objF != null && objF2 != null) {
                qa.j(t, j2, r7.e(objF, objF2));
                E(t, i3, i2);
            } else if (objF2 != null) {
                qa.j(t, j2, objF2);
                E(t, i3, i2);
            }
        }
    }

    private static <T> float H(T t, long j2) {
        return ((Float) qa.F(t, j2)).floatValue();
    }

    private final w7 I(int i2) {
        return (w7) this.f14481d[((i2 / 3) << 1) + 1];
    }

    private final boolean J(T t, T t2, int i2) {
        return w(t, i2) == w(t2, i2);
    }

    private final int K(int i2) {
        return this.f14480c[i2 + 1];
    }

    private static <T> int L(T t, long j2) {
        return ((Integer) qa.F(t, j2)).intValue();
    }

    private final int M(int i2) {
        return this.f14480c[i2 + 2];
    }

    private static <T> long N(T t, long j2) {
        return ((Long) qa.F(t, j2)).longValue();
    }

    private static ja O(Object obj) {
        o7 o7Var = (o7) obj;
        ja jaVar = o7Var.zzb;
        if (jaVar != ja.a()) {
            return jaVar;
        }
        ja jaVarG = ja.g();
        o7Var.zzb = jaVarG;
        return jaVarG;
    }

    private static <T> boolean P(T t, long j2) {
        return ((Boolean) qa.F(t, j2)).booleanValue();
    }

    private final int Q(int i2) {
        if (i2 < this.f14482e || i2 > this.f14483f) {
            return -1;
        }
        return B(i2, 0);
    }

    private final int g(int i2, int i3) {
        if (i2 < this.f14482e || i2 > this.f14483f) {
            return -1;
        }
        return B(i2, i3);
    }

    private static <UT, UB> int h(ka<UT, UB> kaVar, T t) {
        return kaVar.l(kaVar.f(t));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int i(T t, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, int i9, f6 f6Var) throws a8 {
        int iK;
        Unsafe unsafe = f14479b;
        long j3 = this.f14480c[i9 + 2] & 1048575;
        switch (i8) {
            case 51:
                if (i6 == 1) {
                    unsafe.putObject(t, j2, Double.valueOf(c6.m(bArr, i2)));
                    iK = i2 + 8;
                    unsafe.putInt(t, j3, i5);
                    return iK;
                }
                return i2;
            case 52:
                if (i6 == 5) {
                    unsafe.putObject(t, j2, Float.valueOf(c6.o(bArr, i2)));
                    iK = i2 + 4;
                    unsafe.putInt(t, j3, i5);
                    return iK;
                }
                return i2;
            case 53:
            case 54:
                if (i6 == 0) {
                    iK = c6.k(bArr, i2, f6Var);
                    unsafe.putObject(t, j2, Long.valueOf(f6Var.f14515b));
                    unsafe.putInt(t, j3, i5);
                    return iK;
                }
                return i2;
            case 55:
            case 62:
                if (i6 == 0) {
                    iK = c6.i(bArr, i2, f6Var);
                    unsafe.putObject(t, j2, Integer.valueOf(f6Var.a));
                    unsafe.putInt(t, j3, i5);
                    return iK;
                }
                return i2;
            case SyslogConstants.LOG_NEWS /* 56 */:
            case 65:
                if (i6 == 1) {
                    unsafe.putObject(t, j2, Long.valueOf(c6.l(bArr, i2)));
                    iK = i2 + 8;
                    unsafe.putInt(t, j3, i5);
                    return iK;
                }
                return i2;
            case 57:
            case 64:
                if (i6 == 5) {
                    unsafe.putObject(t, j2, Integer.valueOf(c6.h(bArr, i2)));
                    iK = i2 + 4;
                    unsafe.putInt(t, j3, i5);
                    return iK;
                }
                return i2;
            case 58:
                if (i6 == 0) {
                    iK = c6.k(bArr, i2, f6Var);
                    unsafe.putObject(t, j2, Boolean.valueOf(f6Var.f14515b != 0));
                    unsafe.putInt(t, j3, i5);
                    return iK;
                }
                return i2;
            case 59:
                if (i6 == 2) {
                    int i10 = c6.i(bArr, i2, f6Var);
                    int i11 = f6Var.a;
                    if (i11 == 0) {
                        unsafe.putObject(t, j2, "");
                    } else {
                        if ((i7 & 536870912) != 0 && !ta.g(bArr, i10, i10 + i11)) {
                            throw a8.f();
                        }
                        unsafe.putObject(t, j2, new String(bArr, i10, i11, r7.a));
                        i10 += i11;
                    }
                    unsafe.putInt(t, j3, i5);
                    return i10;
                }
                return i2;
            case 60:
                if (i6 == 2) {
                    int iG = c6.g(n(i9), bArr, i2, i3, f6Var);
                    Object object = unsafe.getInt(t, j3) == i5 ? unsafe.getObject(t, j2) : null;
                    if (object == null) {
                        unsafe.putObject(t, j2, f6Var.f14516c);
                    } else {
                        unsafe.putObject(t, j2, r7.e(object, f6Var.f14516c));
                    }
                    unsafe.putInt(t, j3, i5);
                    return iG;
                }
                return i2;
            case 61:
                if (i6 == 2) {
                    iK = c6.q(bArr, i2, f6Var);
                    unsafe.putObject(t, j2, f6Var.f14516c);
                    unsafe.putInt(t, j3, i5);
                    return iK;
                }
                return i2;
            case 63:
                if (i6 == 0) {
                    int i12 = c6.i(bArr, i2, f6Var);
                    int i13 = f6Var.a;
                    w7 w7VarI = I(i9);
                    if (w7VarI != null && !w7VarI.b(i13)) {
                        O(t).c(i4, Long.valueOf(i13));
                        return i12;
                    }
                    unsafe.putObject(t, j2, Integer.valueOf(i13));
                    iK = i12;
                    unsafe.putInt(t, j3, i5);
                    return iK;
                }
                return i2;
            case 66:
                if (i6 == 0) {
                    iK = c6.i(bArr, i2, f6Var);
                    unsafe.putObject(t, j2, Integer.valueOf(t6.d(f6Var.a)));
                    unsafe.putInt(t, j3, i5);
                    return iK;
                }
                return i2;
            case 67:
                if (i6 == 0) {
                    iK = c6.k(bArr, i2, f6Var);
                    unsafe.putObject(t, j2, Long.valueOf(t6.a(f6Var.f14515b)));
                    unsafe.putInt(t, j3, i5);
                    return iK;
                }
                return i2;
            case 68:
                if (i6 == 3) {
                    iK = c6.f(n(i9), bArr, i2, i3, (i4 & (-8)) | 4, f6Var);
                    Object object2 = unsafe.getInt(t, j3) == i5 ? unsafe.getObject(t, j2) : null;
                    if (object2 == null) {
                        unsafe.putObject(t, j2, f6Var.f14516c);
                    } else {
                        unsafe.putObject(t, j2, r7.e(object2, f6Var.f14516c));
                    }
                    unsafe.putInt(t, j3, i5);
                    return iK;
                }
                return i2;
            default:
                return i2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    private final int j(T t, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, long j2, int i8, long j3, f6 f6Var) throws a8 {
        int i9;
        int i10 = i2;
        Unsafe unsafe = f14479b;
        x7 x7VarB = (x7) unsafe.getObject(t, j3);
        if (!x7VarB.zza()) {
            int size = x7VarB.size();
            x7VarB = x7VarB.b(size == 0 ? 10 : size << 1);
            unsafe.putObject(t, j3, x7VarB);
        }
        switch (i8) {
            case 18:
            case 35:
                if (i6 == 2) {
                    z6 z6Var = (z6) x7VarB;
                    int i11 = c6.i(bArr, i10, f6Var);
                    int i12 = f6Var.a + i11;
                    while (i11 < i12) {
                        z6Var.c(c6.m(bArr, i11));
                        i11 += 8;
                    }
                    if (i11 == i12) {
                        return i11;
                    }
                    throw a8.a();
                }
                if (i6 == 1) {
                    z6 z6Var2 = (z6) x7VarB;
                    z6Var2.c(c6.m(bArr, i2));
                    while (true) {
                        int i13 = i10 + 8;
                        if (i13 >= i3) {
                            return i13;
                        }
                        i10 = c6.i(bArr, i13, f6Var);
                        if (i4 != f6Var.a) {
                            return i13;
                        }
                        z6Var2.c(c6.m(bArr, i10));
                    }
                }
                return i10;
            case 19:
            case 36:
                if (i6 == 2) {
                    n7 n7Var = (n7) x7VarB;
                    int i14 = c6.i(bArr, i10, f6Var);
                    int i15 = f6Var.a + i14;
                    while (i14 < i15) {
                        n7Var.c(c6.o(bArr, i14));
                        i14 += 4;
                    }
                    if (i14 == i15) {
                        return i14;
                    }
                    throw a8.a();
                }
                if (i6 == 5) {
                    n7 n7Var2 = (n7) x7VarB;
                    n7Var2.c(c6.o(bArr, i2));
                    while (true) {
                        int i16 = i10 + 4;
                        if (i16 >= i3) {
                            return i16;
                        }
                        i10 = c6.i(bArr, i16, f6Var);
                        if (i4 != f6Var.a) {
                            return i16;
                        }
                        n7Var2.c(c6.o(bArr, i10));
                    }
                }
                return i10;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i6 == 2) {
                    o8 o8Var = (o8) x7VarB;
                    int i17 = c6.i(bArr, i10, f6Var);
                    int i18 = f6Var.a + i17;
                    while (i17 < i18) {
                        i17 = c6.k(bArr, i17, f6Var);
                        o8Var.c(f6Var.f14515b);
                    }
                    if (i17 == i18) {
                        return i17;
                    }
                    throw a8.a();
                }
                if (i6 == 0) {
                    o8 o8Var2 = (o8) x7VarB;
                    int iK = c6.k(bArr, i10, f6Var);
                    o8Var2.c(f6Var.f14515b);
                    while (iK < i3) {
                        int i19 = c6.i(bArr, iK, f6Var);
                        if (i4 != f6Var.a) {
                            return iK;
                        }
                        iK = c6.k(bArr, i19, f6Var);
                        o8Var2.c(f6Var.f14515b);
                    }
                    return iK;
                }
                return i10;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i6 == 2) {
                    return c6.j(bArr, i10, x7VarB, f6Var);
                }
                if (i6 == 0) {
                    return c6.b(i4, bArr, i2, i3, x7VarB, f6Var);
                }
                return i10;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i6 == 2) {
                    o8 o8Var3 = (o8) x7VarB;
                    int i20 = c6.i(bArr, i10, f6Var);
                    int i21 = f6Var.a + i20;
                    while (i20 < i21) {
                        o8Var3.c(c6.l(bArr, i20));
                        i20 += 8;
                    }
                    if (i20 == i21) {
                        return i20;
                    }
                    throw a8.a();
                }
                if (i6 == 1) {
                    o8 o8Var4 = (o8) x7VarB;
                    o8Var4.c(c6.l(bArr, i2));
                    while (true) {
                        int i22 = i10 + 8;
                        if (i22 >= i3) {
                            return i22;
                        }
                        i10 = c6.i(bArr, i22, f6Var);
                        if (i4 != f6Var.a) {
                            return i22;
                        }
                        o8Var4.c(c6.l(bArr, i10));
                    }
                }
                return i10;
            case SyslogConstants.LOG_DAEMON /* 24 */:
            case 31:
            case 41:
            case 45:
                if (i6 == 2) {
                    s7 s7Var = (s7) x7VarB;
                    int i23 = c6.i(bArr, i10, f6Var);
                    int i24 = f6Var.a + i23;
                    while (i23 < i24) {
                        s7Var.f(c6.h(bArr, i23));
                        i23 += 4;
                    }
                    if (i23 == i24) {
                        return i23;
                    }
                    throw a8.a();
                }
                if (i6 == 5) {
                    s7 s7Var2 = (s7) x7VarB;
                    s7Var2.f(c6.h(bArr, i2));
                    while (true) {
                        int i25 = i10 + 4;
                        if (i25 >= i3) {
                            return i25;
                        }
                        i10 = c6.i(bArr, i25, f6Var);
                        if (i4 != f6Var.a) {
                            return i25;
                        }
                        s7Var2.f(c6.h(bArr, i10));
                    }
                }
                return i10;
            case 25:
            case 42:
                if (i6 == 2) {
                    e6 e6Var = (e6) x7VarB;
                    i9 = c6.i(bArr, i10, f6Var);
                    int i26 = f6Var.a + i9;
                    while (i9 < i26) {
                        i9 = c6.k(bArr, i9, f6Var);
                        e6Var.c(f6Var.f14515b != 0);
                    }
                    if (i9 != i26) {
                        throw a8.a();
                    }
                    return i9;
                }
                if (i6 == 0) {
                    e6 e6Var2 = (e6) x7VarB;
                    i10 = c6.k(bArr, i10, f6Var);
                    e6Var2.c(f6Var.f14515b != 0);
                    while (i10 < i3) {
                        int i27 = c6.i(bArr, i10, f6Var);
                        if (i4 == f6Var.a) {
                            i10 = c6.k(bArr, i27, f6Var);
                            e6Var2.c(f6Var.f14515b != 0);
                        }
                    }
                }
                return i10;
            case 26:
                if (i6 == 2) {
                    if ((j2 & 536870912) == 0) {
                        i10 = c6.i(bArr, i10, f6Var);
                        int i28 = f6Var.a;
                        if (i28 < 0) {
                            throw a8.b();
                        }
                        if (i28 == 0) {
                            x7VarB.add("");
                        } else {
                            x7VarB.add(new String(bArr, i10, i28, r7.a));
                            i10 += i28;
                        }
                        while (i10 < i3) {
                            int i29 = c6.i(bArr, i10, f6Var);
                            if (i4 == f6Var.a) {
                                i10 = c6.i(bArr, i29, f6Var);
                                int i30 = f6Var.a;
                                if (i30 < 0) {
                                    throw a8.b();
                                }
                                if (i30 == 0) {
                                    x7VarB.add("");
                                } else {
                                    x7VarB.add(new String(bArr, i10, i30, r7.a));
                                    i10 += i30;
                                }
                            }
                        }
                    } else {
                        i10 = c6.i(bArr, i10, f6Var);
                        int i31 = f6Var.a;
                        if (i31 < 0) {
                            throw a8.b();
                        }
                        if (i31 == 0) {
                            x7VarB.add("");
                        } else {
                            int i32 = i10 + i31;
                            if (!ta.g(bArr, i10, i32)) {
                                throw a8.f();
                            }
                            x7VarB.add(new String(bArr, i10, i31, r7.a));
                            i10 = i32;
                        }
                        while (i10 < i3) {
                            int i33 = c6.i(bArr, i10, f6Var);
                            if (i4 == f6Var.a) {
                                i10 = c6.i(bArr, i33, f6Var);
                                int i34 = f6Var.a;
                                if (i34 < 0) {
                                    throw a8.b();
                                }
                                if (i34 == 0) {
                                    x7VarB.add("");
                                } else {
                                    int i35 = i10 + i34;
                                    if (!ta.g(bArr, i10, i35)) {
                                        throw a8.f();
                                    }
                                    x7VarB.add(new String(bArr, i10, i34, r7.a));
                                    i10 = i35;
                                }
                            }
                        }
                    }
                }
                return i10;
            case 27:
                if (i6 == 2) {
                    return c6.e(n(i7), i4, bArr, i2, i3, x7VarB, f6Var);
                }
                return i10;
            case 28:
                if (i6 == 2) {
                    int i36 = c6.i(bArr, i10, f6Var);
                    int i37 = f6Var.a;
                    if (i37 < 0) {
                        throw a8.b();
                    }
                    if (i37 > bArr.length - i36) {
                        throw a8.a();
                    }
                    if (i37 == 0) {
                        x7VarB.add(g6.f14544e);
                    } else {
                        x7VarB.add(g6.l(bArr, i36, i37));
                        i36 += i37;
                    }
                    while (i36 < i3) {
                        int i38 = c6.i(bArr, i36, f6Var);
                        if (i4 != f6Var.a) {
                            return i36;
                        }
                        i36 = c6.i(bArr, i38, f6Var);
                        int i39 = f6Var.a;
                        if (i39 < 0) {
                            throw a8.b();
                        }
                        if (i39 > bArr.length - i36) {
                            throw a8.a();
                        }
                        if (i39 == 0) {
                            x7VarB.add(g6.f14544e);
                        } else {
                            x7VarB.add(g6.l(bArr, i36, i39));
                            i36 += i39;
                        }
                    }
                    return i36;
                }
                return i10;
            case 30:
            case 44:
                if (i6 != 2) {
                    if (i6 == 0) {
                        i9 = c6.b(i4, bArr, i2, i3, x7VarB, f6Var);
                    }
                    return i10;
                }
                i9 = c6.j(bArr, i10, x7VarB, f6Var);
                o7 o7Var = (o7) t;
                ja jaVar = o7Var.zzb;
                if (jaVar == ja.a()) {
                    jaVar = null;
                }
                ja jaVar2 = (ja) u9.i(i5, x7VarB, I(i7), jaVar, this.q);
                if (jaVar2 != null) {
                    o7Var.zzb = jaVar2;
                }
                return i9;
            case 33:
            case 47:
                if (i6 == 2) {
                    s7 s7Var3 = (s7) x7VarB;
                    int i40 = c6.i(bArr, i10, f6Var);
                    int i41 = f6Var.a + i40;
                    while (i40 < i41) {
                        i40 = c6.i(bArr, i40, f6Var);
                        s7Var3.f(t6.d(f6Var.a));
                    }
                    if (i40 == i41) {
                        return i40;
                    }
                    throw a8.a();
                }
                if (i6 == 0) {
                    s7 s7Var4 = (s7) x7VarB;
                    int i42 = c6.i(bArr, i10, f6Var);
                    s7Var4.f(t6.d(f6Var.a));
                    while (i42 < i3) {
                        int i43 = c6.i(bArr, i42, f6Var);
                        if (i4 != f6Var.a) {
                            return i42;
                        }
                        i42 = c6.i(bArr, i43, f6Var);
                        s7Var4.f(t6.d(f6Var.a));
                    }
                    return i42;
                }
                return i10;
            case 34:
            case SyslogConstants.LOG_LPR /* 48 */:
                if (i6 == 2) {
                    o8 o8Var5 = (o8) x7VarB;
                    int i44 = c6.i(bArr, i10, f6Var);
                    int i45 = f6Var.a + i44;
                    while (i44 < i45) {
                        i44 = c6.k(bArr, i44, f6Var);
                        o8Var5.c(t6.a(f6Var.f14515b));
                    }
                    if (i44 == i45) {
                        return i44;
                    }
                    throw a8.a();
                }
                if (i6 == 0) {
                    o8 o8Var6 = (o8) x7VarB;
                    int iK2 = c6.k(bArr, i10, f6Var);
                    o8Var6.c(t6.a(f6Var.f14515b));
                    while (iK2 < i3) {
                        int i46 = c6.i(bArr, iK2, f6Var);
                        if (i4 != f6Var.a) {
                            return iK2;
                        }
                        iK2 = c6.k(bArr, i46, f6Var);
                        o8Var6.c(t6.a(f6Var.f14515b));
                    }
                    return iK2;
                }
                return i10;
            case 49:
                if (i6 == 3) {
                    s9 s9VarN = n(i7);
                    int i47 = (i4 & (-8)) | 4;
                    i10 = c6.f(s9VarN, bArr, i2, i3, i47, f6Var);
                    x7VarB.add(f6Var.f14516c);
                    while (i10 < i3) {
                        int i48 = c6.i(bArr, i10, f6Var);
                        if (i4 == f6Var.a) {
                            i10 = c6.f(s9VarN, bArr, i48, i3, i47, f6Var);
                            x7VarB.add(f6Var.f14516c);
                        }
                    }
                }
                return i10;
            default:
                return i10;
        }
    }

    private final <K, V> int k(T t, byte[] bArr, int i2, int i3, int i4, long j2, f6 f6Var) {
        Unsafe unsafe = f14479b;
        Object objC = C(i4);
        Object object = unsafe.getObject(t, j2);
        if (this.s.b(object)) {
            Object objC2 = this.s.c(objC);
            this.s.d(objC2, object);
            unsafe.putObject(t, j2, objC2);
            object = objC2;
        }
        this.s.e(objC);
        this.s.zza(object);
        int i5 = c6.i(bArr, i2, f6Var);
        int i6 = f6Var.a;
        if (i6 < 0 || i6 > i3 - i5) {
            throw a8.a();
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x038c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static <T> e.c.b.b.c.e.e9<T> m(java.lang.Class<T> r33, e.c.b.b.c.e.z8 r34, e.c.b.b.c.e.i9 r35, e.c.b.b.c.e.k8 r36, e.c.b.b.c.e.ka<?, ?> r37, e.c.b.b.c.e.d7<?> r38, e.c.b.b.c.e.u8 r39) {
        /*
            Method dump skipped, instructions count: 1053
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.c.b.b.c.e.e9.m(java.lang.Class, e.c.b.b.c.e.z8, e.c.b.b.c.e.i9, e.c.b.b.c.e.k8, e.c.b.b.c.e.ka, e.c.b.b.c.e.d7, e.c.b.b.c.e.u8):e.c.b.b.c.e.e9");
    }

    private final s9 n(int i2) {
        int i3 = (i2 / 3) << 1;
        s9 s9Var = (s9) this.f14481d[i3];
        if (s9Var != null) {
            return s9Var;
        }
        s9<T> s9VarB = o9.a().b((Class) this.f14481d[i3 + 1]);
        this.f14481d[i3] = s9VarB;
        return s9VarB;
    }

    private final <K, V, UT, UB> UB o(int i2, int i3, Map<K, V> map, w7 w7Var, UB ub, ka<UT, UB> kaVar) {
        s8<?, ?> s8VarE = this.s.e(C(i2));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!w7Var.b(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = kaVar.a();
                }
                o6 o6VarU = g6.u(t8.a(s8VarE, next.getKey(), next.getValue()));
                try {
                    t8.b(o6VarU.b(), s8VarE, next.getKey(), next.getValue());
                    kaVar.c(ub, i3, o6VarU.a());
                    it.remove();
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        return ub;
    }

    private final <UT, UB> UB p(Object obj, int i2, UB ub, ka<UT, UB> kaVar) {
        w7 w7VarI;
        int i3 = this.f14480c[i2];
        Object objF = qa.F(obj, K(i2) & 1048575);
        return (objF == null || (w7VarI = I(i2)) == null) ? ub : (UB) o(i2, i3, this.s.zza(objF), w7VarI, ub, kaVar);
    }

    private static Field q(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(string).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(string);
            throw new RuntimeException(sb.toString());
        }
    }

    private static List<?> r(Object obj, long j2) {
        return (List) qa.F(obj, j2);
    }

    private static void s(int i2, Object obj, eb ebVar) {
        if (obj instanceof String) {
            ebVar.a(i2, (String) obj);
        } else {
            ebVar.p(i2, (g6) obj);
        }
    }

    private static <UT, UB> void t(ka<UT, UB> kaVar, T t, eb ebVar) {
        kaVar.d(kaVar.f(t), ebVar);
    }

    private final <K, V> void u(eb ebVar, int i2, Object obj, int i3) {
        if (obj != null) {
            ebVar.I(i2, this.s.e(C(i3)), this.s.zzb(obj));
        }
    }

    private final void v(T t, T t2, int i2) {
        long jK = K(i2) & 1048575;
        if (w(t2, i2)) {
            Object objF = qa.F(t, jK);
            Object objF2 = qa.F(t2, jK);
            if (objF != null && objF2 != null) {
                qa.j(t, jK, r7.e(objF, objF2));
                D(t, i2);
            } else if (objF2 != null) {
                qa.j(t, jK, objF2);
                D(t, i2);
            }
        }
    }

    private final boolean w(T t, int i2) {
        int iM = M(i2);
        long j2 = iM & 1048575;
        if (j2 != 1048575) {
            return (qa.b(t, j2) & (1 << (iM >>> 20))) != 0;
        }
        int iK = K(i2);
        long j3 = iK & 1048575;
        switch ((iK & 267386880) >>> 20) {
            case 0:
                return qa.C(t, j3) != 0.0d;
            case 1:
                return qa.x(t, j3) != 0.0f;
            case 2:
                return qa.o(t, j3) != 0;
            case 3:
                return qa.o(t, j3) != 0;
            case 4:
                return qa.b(t, j3) != 0;
            case 5:
                return qa.o(t, j3) != 0;
            case 6:
                return qa.b(t, j3) != 0;
            case 7:
                return qa.w(t, j3);
            case 8:
                Object objF = qa.F(t, j3);
                if (objF instanceof String) {
                    return !((String) objF).isEmpty();
                }
                if (objF instanceof g6) {
                    return !g6.f14544e.equals(objF);
                }
                throw new IllegalArgumentException();
            case 9:
                return qa.F(t, j3) != null;
            case 10:
                return !g6.f14544e.equals(qa.F(t, j3));
            case 11:
                return qa.b(t, j3) != 0;
            case 12:
                return qa.b(t, j3) != 0;
            case 13:
                return qa.b(t, j3) != 0;
            case 14:
                return qa.o(t, j3) != 0;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                return qa.b(t, j3) != 0;
            case 16:
                return qa.o(t, j3) != 0;
            case 17:
                return qa.F(t, j3) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean x(T t, int i2, int i3) {
        return qa.b(t, (long) (M(i3) & 1048575)) == i2;
    }

    private final boolean y(T t, int i2, int i3, int i4, int i5) {
        return i3 == 1048575 ? w(t, i2) : (i4 & i5) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean z(Object obj, int i2, s9 s9Var) {
        return s9Var.a(qa.F(obj, i2 & 1048575));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ac  */
    @Override // e.c.b.b.c.e.s9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(T r19) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.c.b.b.c.e.e9.a(java.lang.Object):boolean");
    }

    @Override // e.c.b.b.c.e.s9
    public final void b(T t) {
        int i2;
        int i3 = this.f14490m;
        while (true) {
            i2 = this.n;
            if (i3 >= i2) {
                break;
            }
            long jK = K(this.f14489l[i3]) & 1048575;
            Object objF = qa.F(t, jK);
            if (objF != null) {
                qa.j(t, jK, this.s.a(objF));
            }
            i3++;
        }
        int length = this.f14489l.length;
        while (i2 < length) {
            this.p.d(t, this.f14489l[i2]);
            i2++;
        }
        this.q.j(t);
        if (this.f14485h) {
            this.r.g(t);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    @Override // e.c.b.b.c.e.s9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(T r14, e.c.b.b.c.e.eb r15) {
        /*
            Method dump skipped, instructions count: 2916
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.c.b.b.c.e.e9.c(java.lang.Object, e.c.b.b.c.e.eb):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01c1  */
    @Override // e.c.b.b.c.e.s9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.c.b.b.c.e.e9.d(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // e.c.b.b.c.e.s9
    public final void e(T t, T t2) {
        Objects.requireNonNull(t2);
        for (int i2 = 0; i2 < this.f14480c.length; i2 += 3) {
            int iK = K(i2);
            long j2 = 1048575 & iK;
            int i3 = this.f14480c[i2];
            switch ((iK & 267386880) >>> 20) {
                case 0:
                    if (w(t2, i2)) {
                        qa.f(t, j2, qa.C(t2, j2));
                        D(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (w(t2, i2)) {
                        qa.g(t, j2, qa.x(t2, j2));
                        D(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (w(t2, i2)) {
                        qa.i(t, j2, qa.o(t2, j2));
                        D(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (w(t2, i2)) {
                        qa.i(t, j2, qa.o(t2, j2));
                        D(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (w(t2, i2)) {
                        qa.h(t, j2, qa.b(t2, j2));
                        D(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (w(t2, i2)) {
                        qa.i(t, j2, qa.o(t2, j2));
                        D(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (w(t2, i2)) {
                        qa.h(t, j2, qa.b(t2, j2));
                        D(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (w(t2, i2)) {
                        qa.k(t, j2, qa.w(t2, j2));
                        D(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (w(t2, i2)) {
                        qa.j(t, j2, qa.F(t2, j2));
                        D(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    v(t, t2, i2);
                    break;
                case 10:
                    if (w(t2, i2)) {
                        qa.j(t, j2, qa.F(t2, j2));
                        D(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (w(t2, i2)) {
                        qa.h(t, j2, qa.b(t2, j2));
                        D(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (w(t2, i2)) {
                        qa.h(t, j2, qa.b(t2, j2));
                        D(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (w(t2, i2)) {
                        qa.h(t, j2, qa.b(t2, j2));
                        D(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (w(t2, i2)) {
                        qa.i(t, j2, qa.o(t2, j2));
                        D(t, i2);
                        break;
                    } else {
                        break;
                    }
                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                    if (w(t2, i2)) {
                        qa.h(t, j2, qa.b(t2, j2));
                        D(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (w(t2, i2)) {
                        qa.i(t, j2, qa.o(t2, j2));
                        D(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    v(t, t2, i2);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case SyslogConstants.LOG_DAEMON /* 24 */:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case SyslogConstants.LOG_LPR /* 48 */:
                case 49:
                    this.p.b(t, t2, j2);
                    break;
                case 50:
                    u9.n(this.s, t, t2, j2);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case SyslogConstants.LOG_NEWS /* 56 */:
                case 57:
                case 58:
                case 59:
                    if (x(t2, i3, i2)) {
                        qa.j(t, j2, qa.F(t2, j2));
                        E(t, i3, i2);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    G(t, t2, i2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (x(t2, i3, i2)) {
                        qa.j(t, j2, qa.F(t2, j2));
                        E(t, i3, i2);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    G(t, t2, i2);
                    break;
            }
        }
        u9.o(this.q, t, t2);
        if (this.f14485h) {
            u9.m(this.r, t, t2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x02dc, code lost:
    
        if (r0 == r5) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02e0, code lost:
    
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r2 = r18;
        r1 = r25;
        r6 = r27;
        r7 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0323, code lost:
    
        if (r0 == r15) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0346, code lost:
    
        if (r0 == r15) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0348, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x0095. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [int] */
    @Override // e.c.b.b.c.e.s9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(T r31, byte[] r32, int r33, int r34, e.c.b.b.c.e.f6 r35) throws e.c.b.b.c.e.a8 {
        /*
            Method dump skipped, instructions count: 966
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.c.b.b.c.e.e9.f(java.lang.Object, byte[], int, int, e.c.b.b.c.e.f6):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x04d7, code lost:
    
        if (r6 == 1048575) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x04d9, code lost:
    
        r26.putInt(r12, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x04df, code lost:
    
        r1 = null;
        r2 = r9.f14490m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x04e4, code lost:
    
        if (r2 >= r9.n) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x04e6, code lost:
    
        r1 = (e.c.b.b.c.e.ja) r9.p(r12, r9.f14489l[r2], r1, r9.q);
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x04f5, code lost:
    
        if (r1 == null) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x04f7, code lost:
    
        r9.q.h(r12, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x04fc, code lost:
    
        if (r7 != 0) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0500, code lost:
    
        if (r0 != r31) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0507, code lost:
    
        throw e.c.b.b.c.e.a8.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x050a, code lost:
    
        if (r0 > r31) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x050c, code lost:
    
        if (r3 != r7) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x050e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0513, code lost:
    
        throw e.c.b.b.c.e.a8.e();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int l(T r28, byte[] r29, int r30, int r31, int r32, e.c.b.b.c.e.f6 r33) throws e.c.b.b.c.e.a8 {
        /*
            Method dump skipped, instructions count: 1340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.c.b.b.c.e.e9.l(java.lang.Object, byte[], int, int, int, e.c.b.b.c.e.f6):int");
    }

    @Override // e.c.b.b.c.e.s9
    public final T zza() {
        return (T) this.o.zza(this.f14484g);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:328:0x080b A[PHI: r5
  0x080b: PHI (r5v4 int) = 
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v16 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v1 int)
  (r5v17 int)
  (r5v1 int)
 binds: [B:204:0x04b4, B:366:0x08af, B:360:0x0893, B:357:0x0881, B:354:0x0872, B:351:0x0865, B:348:0x0858, B:344:0x084d, B:341:0x0842, B:338:0x0835, B:335:0x0828, B:332:0x0815, B:305:0x0724, B:302:0x070f, B:299:0x06fa, B:296:0x06e5, B:293:0x06d0, B:290:0x06bb, B:287:0x06a5, B:284:0x068f, B:281:0x0679, B:278:0x0663, B:275:0x064d, B:272:0x0637, B:269:0x0621, B:266:0x060b, B:261:0x05d7, B:258:0x05ca, B:255:0x05ba, B:252:0x05aa, B:249:0x059a, B:246:0x058c, B:243:0x057f, B:240:0x0572, B:234:0x0554, B:231:0x0540, B:228:0x052e, B:225:0x051e, B:222:0x050e, B:346:0x0854, B:219:0x0501, B:216:0x04f3, B:213:0x04e3, B:210:0x04d3, B:327:0x080a, B:207:0x04bd] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // e.c.b.b.c.e.s9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(T r19) {
        /*
            Method dump skipped, instructions count: 2728
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.c.b.b.c.e.e9.zzb(java.lang.Object):int");
    }

    @Override // e.c.b.b.c.e.s9
    public final int zza(T t) {
        int i2;
        int iB;
        int length = this.f14480c.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iK = K(i4);
            int i5 = this.f14480c[i4];
            long j2 = 1048575 & iK;
            int iHashCode = 37;
            switch ((iK & 267386880) >>> 20) {
                case 0:
                    i2 = i3 * 53;
                    iB = r7.b(Double.doubleToLongBits(qa.C(t, j2)));
                    i3 = i2 + iB;
                    break;
                case 1:
                    i2 = i3 * 53;
                    iB = Float.floatToIntBits(qa.x(t, j2));
                    i3 = i2 + iB;
                    break;
                case 2:
                    i2 = i3 * 53;
                    iB = r7.b(qa.o(t, j2));
                    i3 = i2 + iB;
                    break;
                case 3:
                    i2 = i3 * 53;
                    iB = r7.b(qa.o(t, j2));
                    i3 = i2 + iB;
                    break;
                case 4:
                    i2 = i3 * 53;
                    iB = qa.b(t, j2);
                    i3 = i2 + iB;
                    break;
                case 5:
                    i2 = i3 * 53;
                    iB = r7.b(qa.o(t, j2));
                    i3 = i2 + iB;
                    break;
                case 6:
                    i2 = i3 * 53;
                    iB = qa.b(t, j2);
                    i3 = i2 + iB;
                    break;
                case 7:
                    i2 = i3 * 53;
                    iB = r7.c(qa.w(t, j2));
                    i3 = i2 + iB;
                    break;
                case 8:
                    i2 = i3 * 53;
                    iB = ((String) qa.F(t, j2)).hashCode();
                    i3 = i2 + iB;
                    break;
                case 9:
                    Object objF = qa.F(t, j2);
                    if (objF != null) {
                        iHashCode = objF.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i2 = i3 * 53;
                    iB = qa.F(t, j2).hashCode();
                    i3 = i2 + iB;
                    break;
                case 11:
                    i2 = i3 * 53;
                    iB = qa.b(t, j2);
                    i3 = i2 + iB;
                    break;
                case 12:
                    i2 = i3 * 53;
                    iB = qa.b(t, j2);
                    i3 = i2 + iB;
                    break;
                case 13:
                    i2 = i3 * 53;
                    iB = qa.b(t, j2);
                    i3 = i2 + iB;
                    break;
                case 14:
                    i2 = i3 * 53;
                    iB = r7.b(qa.o(t, j2));
                    i3 = i2 + iB;
                    break;
                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                    i2 = i3 * 53;
                    iB = qa.b(t, j2);
                    i3 = i2 + iB;
                    break;
                case 16:
                    i2 = i3 * 53;
                    iB = r7.b(qa.o(t, j2));
                    i3 = i2 + iB;
                    break;
                case 17:
                    Object objF2 = qa.F(t, j2);
                    if (objF2 != null) {
                        iHashCode = objF2.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case SyslogConstants.LOG_DAEMON /* 24 */:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case SyslogConstants.LOG_LPR /* 48 */:
                case 49:
                    i2 = i3 * 53;
                    iB = qa.F(t, j2).hashCode();
                    i3 = i2 + iB;
                    break;
                case 50:
                    i2 = i3 * 53;
                    iB = qa.F(t, j2).hashCode();
                    i3 = i2 + iB;
                    break;
                case 51:
                    if (x(t, i5, i4)) {
                        i2 = i3 * 53;
                        iB = r7.b(Double.doubleToLongBits(A(t, j2)));
                        i3 = i2 + iB;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (x(t, i5, i4)) {
                        i2 = i3 * 53;
                        iB = Float.floatToIntBits(H(t, j2));
                        i3 = i2 + iB;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (x(t, i5, i4)) {
                        i2 = i3 * 53;
                        iB = r7.b(N(t, j2));
                        i3 = i2 + iB;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (x(t, i5, i4)) {
                        i2 = i3 * 53;
                        iB = r7.b(N(t, j2));
                        i3 = i2 + iB;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (x(t, i5, i4)) {
                        i2 = i3 * 53;
                        iB = L(t, j2);
                        i3 = i2 + iB;
                        break;
                    } else {
                        break;
                    }
                case SyslogConstants.LOG_NEWS /* 56 */:
                    if (x(t, i5, i4)) {
                        i2 = i3 * 53;
                        iB = r7.b(N(t, j2));
                        i3 = i2 + iB;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (x(t, i5, i4)) {
                        i2 = i3 * 53;
                        iB = L(t, j2);
                        i3 = i2 + iB;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (x(t, i5, i4)) {
                        i2 = i3 * 53;
                        iB = r7.c(P(t, j2));
                        i3 = i2 + iB;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (x(t, i5, i4)) {
                        i2 = i3 * 53;
                        iB = ((String) qa.F(t, j2)).hashCode();
                        i3 = i2 + iB;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (x(t, i5, i4)) {
                        i2 = i3 * 53;
                        iB = qa.F(t, j2).hashCode();
                        i3 = i2 + iB;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (x(t, i5, i4)) {
                        i2 = i3 * 53;
                        iB = qa.F(t, j2).hashCode();
                        i3 = i2 + iB;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (x(t, i5, i4)) {
                        i2 = i3 * 53;
                        iB = L(t, j2);
                        i3 = i2 + iB;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (x(t, i5, i4)) {
                        i2 = i3 * 53;
                        iB = L(t, j2);
                        i3 = i2 + iB;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (x(t, i5, i4)) {
                        i2 = i3 * 53;
                        iB = L(t, j2);
                        i3 = i2 + iB;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (x(t, i5, i4)) {
                        i2 = i3 * 53;
                        iB = r7.b(N(t, j2));
                        i3 = i2 + iB;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (x(t, i5, i4)) {
                        i2 = i3 * 53;
                        iB = L(t, j2);
                        i3 = i2 + iB;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (x(t, i5, i4)) {
                        i2 = i3 * 53;
                        iB = r7.b(N(t, j2));
                        i3 = i2 + iB;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (x(t, i5, i4)) {
                        i2 = i3 * 53;
                        iB = qa.F(t, j2).hashCode();
                        i3 = i2 + iB;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i3 * 53) + this.q.f(t).hashCode();
        return this.f14485h ? (iHashCode2 * 53) + this.r.b(t).hashCode() : iHashCode2;
    }
}