package com.google.android.gms.internal.ads;

import ch.qos.logback.core.net.SyslogConstants;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import okhttp3.internal.ws.WebSocketProtocol;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class ok2<T> implements dl2<T> {
    private static final int[] a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    private static final Unsafe f7954b = cm2.v();

    /* renamed from: c, reason: collision with root package name */
    private final int[] f7955c;

    /* renamed from: d, reason: collision with root package name */
    private final Object[] f7956d;

    /* renamed from: e, reason: collision with root package name */
    private final int f7957e;

    /* renamed from: f, reason: collision with root package name */
    private final int f7958f;

    /* renamed from: g, reason: collision with root package name */
    private final lk2 f7959g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f7960h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f7961i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f7962j;

    /* renamed from: k, reason: collision with root package name */
    private final int[] f7963k;

    /* renamed from: l, reason: collision with root package name */
    private final int f7964l;

    /* renamed from: m, reason: collision with root package name */
    private final int f7965m;
    private final zj2 n;
    private final rl2<?, ?> o;
    private final ri2<?> p;
    private final qk2 q;
    private final gk2 r;

    /* JADX WARN: Multi-variable type inference failed */
    private ok2(int[] iArr, int[] iArr2, Object[] objArr, int i2, int i3, lk2 lk2Var, boolean z, boolean z2, int[] iArr3, int i4, int i5, qk2 qk2Var, zj2 zj2Var, rl2<?, ?> rl2Var, ri2<?> ri2Var, gk2 gk2Var) {
        this.f7955c = iArr;
        this.f7956d = iArr2;
        this.f7957e = objArr;
        this.f7958f = i2;
        this.f7961i = i3 instanceof ej2;
        this.f7962j = lk2Var;
        boolean z3 = false;
        if (rl2Var != 0 && rl2Var.a((lk2) i3)) {
            z3 = true;
        }
        this.f7960h = z3;
        this.f7963k = z2;
        this.f7964l = iArr3;
        this.f7965m = i4;
        this.q = i5;
        this.n = qk2Var;
        this.o = zj2Var;
        this.p = rl2Var;
        this.f7959g = i3;
        this.r = ri2Var;
    }

    private final void A(T t, int i2, int i3) {
        cm2.j(t, n(i3) & 1048575, i2);
    }

    private final int B(int i2) {
        if (i2 < this.f7957e || i2 > this.f7958f) {
            return -1;
        }
        return D(i2, 0);
    }

    private final int C(int i2, int i3) {
        if (i2 < this.f7957e || i2 > this.f7958f) {
            return -1;
        }
        return D(i2, i3);
    }

    private final int D(int i2, int i3) {
        int length = (this.f7955c.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int i6 = this.f7955c[i5];
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

    private final void E(T t, mi2 mi2Var) {
        int i2;
        if (this.f7960h) {
            this.p.b(t);
            throw null;
        }
        int length = this.f7955c.length;
        Unsafe unsafe = f7954b;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i4 < length) {
            int iM = m(i4);
            int i7 = this.f7955c[i4];
            int iO = o(iM);
            if (iO <= 17) {
                int i8 = this.f7955c[i4 + 2];
                int i9 = i8 & i3;
                if (i9 != i6) {
                    i5 = unsafe.getInt(t, i9);
                    i6 = i9;
                }
                i2 = 1 << (i8 >>> 20);
            } else {
                i2 = 0;
            }
            long j2 = iM & i3;
            switch (iO) {
                case 0:
                    if ((i5 & i2) != 0) {
                        mi2Var.q(i7, cm2.q(t, j2));
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 1:
                    if ((i5 & i2) != 0) {
                        mi2Var.p(i7, cm2.o(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 2:
                    if ((i5 & i2) != 0) {
                        mi2Var.n(i7, unsafe.getLong(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 3:
                    if ((i5 & i2) != 0) {
                        mi2Var.s(i7, unsafe.getLong(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 4:
                    if ((i5 & i2) != 0) {
                        mi2Var.t(i7, unsafe.getInt(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 5:
                    if ((i5 & i2) != 0) {
                        mi2Var.u(i7, unsafe.getLong(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 6:
                    if ((i5 & i2) != 0) {
                        mi2Var.v(i7, unsafe.getInt(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 7:
                    if ((i5 & i2) != 0) {
                        mi2Var.w(i7, cm2.m(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 8:
                    if ((i5 & i2) != 0) {
                        G(i7, unsafe.getObject(t, j2), mi2Var);
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 9:
                    if ((i5 & i2) != 0) {
                        mi2Var.C(i7, unsafe.getObject(t, j2), T(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 10:
                    if ((i5 & i2) != 0) {
                        mi2Var.y(i7, (ci2) unsafe.getObject(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 11:
                    if ((i5 & i2) != 0) {
                        mi2Var.z(i7, unsafe.getInt(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 12:
                    if ((i5 & i2) != 0) {
                        mi2Var.r(i7, unsafe.getInt(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 13:
                    if ((i5 & i2) != 0) {
                        mi2Var.m(i7, unsafe.getInt(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 14:
                    if ((i5 & i2) != 0) {
                        mi2Var.o(i7, unsafe.getLong(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                    if ((i5 & i2) != 0) {
                        mi2Var.A(i7, unsafe.getInt(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 16:
                    if ((i5 & i2) != 0) {
                        mi2Var.B(i7, unsafe.getLong(t, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 17:
                    if ((i5 & i2) != 0) {
                        mi2Var.D(i7, unsafe.getObject(t, j2), T(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i3 = 1048575;
                case 18:
                    fl2.j(this.f7955c[i4], (List) unsafe.getObject(t, j2), mi2Var, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 19:
                    fl2.k(this.f7955c[i4], (List) unsafe.getObject(t, j2), mi2Var, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 20:
                    fl2.l(this.f7955c[i4], (List) unsafe.getObject(t, j2), mi2Var, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 21:
                    fl2.m(this.f7955c[i4], (List) unsafe.getObject(t, j2), mi2Var, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 22:
                    fl2.q(this.f7955c[i4], (List) unsafe.getObject(t, j2), mi2Var, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 23:
                    fl2.o(this.f7955c[i4], (List) unsafe.getObject(t, j2), mi2Var, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case SyslogConstants.LOG_DAEMON /* 24 */:
                    fl2.t(this.f7955c[i4], (List) unsafe.getObject(t, j2), mi2Var, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 25:
                    fl2.w(this.f7955c[i4], (List) unsafe.getObject(t, j2), mi2Var, false);
                    continue;
                    i4 += 3;
                    i3 = 1048575;
                case 26:
                    fl2.x(this.f7955c[i4], (List) unsafe.getObject(t, j2), mi2Var);
                    break;
                case 27:
                    fl2.z(this.f7955c[i4], (List) unsafe.getObject(t, j2), mi2Var, T(i4));
                    break;
                case 28:
                    fl2.y(this.f7955c[i4], (List) unsafe.getObject(t, j2), mi2Var);
                    break;
                case 29:
                    fl2.r(this.f7955c[i4], (List) unsafe.getObject(t, j2), mi2Var, false);
                    break;
                case 30:
                    fl2.v(this.f7955c[i4], (List) unsafe.getObject(t, j2), mi2Var, false);
                    break;
                case 31:
                    fl2.u(this.f7955c[i4], (List) unsafe.getObject(t, j2), mi2Var, false);
                    break;
                case 32:
                    fl2.p(this.f7955c[i4], (List) unsafe.getObject(t, j2), mi2Var, false);
                    break;
                case 33:
                    fl2.s(this.f7955c[i4], (List) unsafe.getObject(t, j2), mi2Var, false);
                    break;
                case 34:
                    fl2.n(this.f7955c[i4], (List) unsafe.getObject(t, j2), mi2Var, false);
                    break;
                case 35:
                    fl2.j(this.f7955c[i4], (List) unsafe.getObject(t, j2), mi2Var, true);
                    break;
                case 36:
                    fl2.k(this.f7955c[i4], (List) unsafe.getObject(t, j2), mi2Var, true);
                    break;
                case 37:
                    fl2.l(this.f7955c[i4], (List) unsafe.getObject(t, j2), mi2Var, true);
                    break;
                case 38:
                    fl2.m(this.f7955c[i4], (List) unsafe.getObject(t, j2), mi2Var, true);
                    break;
                case 39:
                    fl2.q(this.f7955c[i4], (List) unsafe.getObject(t, j2), mi2Var, true);
                    break;
                case 40:
                    fl2.o(this.f7955c[i4], (List) unsafe.getObject(t, j2), mi2Var, true);
                    break;
                case 41:
                    fl2.t(this.f7955c[i4], (List) unsafe.getObject(t, j2), mi2Var, true);
                    break;
                case 42:
                    fl2.w(this.f7955c[i4], (List) unsafe.getObject(t, j2), mi2Var, true);
                    break;
                case 43:
                    fl2.r(this.f7955c[i4], (List) unsafe.getObject(t, j2), mi2Var, true);
                    break;
                case 44:
                    fl2.v(this.f7955c[i4], (List) unsafe.getObject(t, j2), mi2Var, true);
                    break;
                case 45:
                    fl2.u(this.f7955c[i4], (List) unsafe.getObject(t, j2), mi2Var, true);
                    break;
                case 46:
                    fl2.p(this.f7955c[i4], (List) unsafe.getObject(t, j2), mi2Var, true);
                    break;
                case 47:
                    fl2.s(this.f7955c[i4], (List) unsafe.getObject(t, j2), mi2Var, true);
                    break;
                case SyslogConstants.LOG_LPR /* 48 */:
                    fl2.n(this.f7955c[i4], (List) unsafe.getObject(t, j2), mi2Var, true);
                    break;
                case 49:
                    fl2.B(this.f7955c[i4], (List) unsafe.getObject(t, j2), mi2Var, T(i4));
                    break;
                case 50:
                    F(mi2Var, i7, unsafe.getObject(t, j2), i4);
                    break;
                case 51:
                    if (z(t, i7, i4)) {
                        mi2Var.q(i7, q(t, j2));
                        break;
                    }
                    break;
                case 52:
                    if (z(t, i7, i4)) {
                        mi2Var.p(i7, r(t, j2));
                        break;
                    }
                    break;
                case 53:
                    if (z(t, i7, i4)) {
                        mi2Var.n(i7, t(t, j2));
                        break;
                    }
                    break;
                case 54:
                    if (z(t, i7, i4)) {
                        mi2Var.s(i7, t(t, j2));
                        break;
                    }
                    break;
                case 55:
                    if (z(t, i7, i4)) {
                        mi2Var.t(i7, s(t, j2));
                        break;
                    }
                    break;
                case SyslogConstants.LOG_NEWS /* 56 */:
                    if (z(t, i7, i4)) {
                        mi2Var.u(i7, t(t, j2));
                        break;
                    }
                    break;
                case 57:
                    if (z(t, i7, i4)) {
                        mi2Var.v(i7, s(t, j2));
                        break;
                    }
                    break;
                case 58:
                    if (z(t, i7, i4)) {
                        mi2Var.w(i7, u(t, j2));
                        break;
                    }
                    break;
                case 59:
                    if (z(t, i7, i4)) {
                        G(i7, unsafe.getObject(t, j2), mi2Var);
                        break;
                    }
                    break;
                case 60:
                    if (z(t, i7, i4)) {
                        mi2Var.C(i7, unsafe.getObject(t, j2), T(i4));
                        break;
                    }
                    break;
                case 61:
                    if (z(t, i7, i4)) {
                        mi2Var.y(i7, (ci2) unsafe.getObject(t, j2));
                        break;
                    }
                    break;
                case 62:
                    if (z(t, i7, i4)) {
                        mi2Var.z(i7, s(t, j2));
                        break;
                    }
                    break;
                case 63:
                    if (z(t, i7, i4)) {
                        mi2Var.r(i7, s(t, j2));
                        break;
                    }
                    break;
                case 64:
                    if (z(t, i7, i4)) {
                        mi2Var.m(i7, s(t, j2));
                        break;
                    }
                    break;
                case 65:
                    if (z(t, i7, i4)) {
                        mi2Var.o(i7, t(t, j2));
                        break;
                    }
                    break;
                case 66:
                    if (z(t, i7, i4)) {
                        mi2Var.A(i7, s(t, j2));
                        break;
                    }
                    break;
                case 67:
                    if (z(t, i7, i4)) {
                        mi2Var.B(i7, t(t, j2));
                        break;
                    }
                    break;
                case 68:
                    if (z(t, i7, i4)) {
                        mi2Var.D(i7, unsafe.getObject(t, j2), T(i4));
                        break;
                    }
                    break;
            }
            i4 += 3;
            i3 = 1048575;
        }
        rl2<?, ?> rl2Var = this.o;
        rl2Var.r(rl2Var.j(t), mi2Var);
    }

    private final <K, V> void F(mi2 mi2Var, int i2, Object obj, int i3) {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private static final void G(int i2, Object obj, mi2 mi2Var) {
        if (obj instanceof String) {
            mi2Var.x(i2, (String) obj);
        } else {
            mi2Var.y(i2, (ci2) obj);
        }
    }

    static sl2 H(Object obj) {
        ej2 ej2Var = (ej2) obj;
        sl2 sl2Var = ej2Var.zzc;
        if (sl2Var != sl2.a()) {
            return sl2Var;
        }
        sl2 sl2VarB = sl2.b();
        ej2Var.zzc = sl2VarB;
        return sl2VarB;
    }

    static <T> ok2<T> J(Class<T> cls, ik2 ik2Var, qk2 qk2Var, zj2 zj2Var, rl2<?, ?> rl2Var, ri2<?> ri2Var, gk2 gk2Var) {
        if (ik2Var instanceof vk2) {
            return K((vk2) ik2Var, qk2Var, zj2Var, rl2Var, ri2Var, gk2Var);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0378  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static <T> com.google.android.gms.internal.ads.ok2<T> K(com.google.android.gms.internal.ads.vk2 r34, com.google.android.gms.internal.ads.qk2 r35, com.google.android.gms.internal.ads.zj2 r36, com.google.android.gms.internal.ads.rl2<?, ?> r37, com.google.android.gms.internal.ads.ri2<?> r38, com.google.android.gms.internal.ads.gk2 r39) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ok2.K(com.google.android.gms.internal.ads.vk2, com.google.android.gms.internal.ads.qk2, com.google.android.gms.internal.ads.zj2, com.google.android.gms.internal.ads.rl2, com.google.android.gms.internal.ads.ri2, com.google.android.gms.internal.ads.gk2):com.google.android.gms.internal.ads.ok2");
    }

    private static Field L(Class<?> cls, String str) {
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

    private final void M(T t, T t2, int i2) {
        long jM = m(i2) & 1048575;
        if (x(t2, i2)) {
            Object objS = cm2.s(t, jM);
            Object objS2 = cm2.s(t2, jM);
            if (objS != null && objS2 != null) {
                cm2.t(t, jM, oj2.i(objS, objS2));
                y(t, i2);
            } else if (objS2 != null) {
                cm2.t(t, jM, objS2);
                y(t, i2);
            }
        }
    }

    private final void N(T t, T t2, int i2) {
        int iM = m(i2);
        int i3 = this.f7955c[i2];
        long j2 = iM & 1048575;
        if (z(t2, i3, i2)) {
            Object objS = z(t, i3, i2) ? cm2.s(t, j2) : null;
            Object objS2 = cm2.s(t2, j2);
            if (objS != null && objS2 != null) {
                cm2.t(t, j2, oj2.i(objS, objS2));
                A(t, i3, i2);
            } else if (objS2 != null) {
                cm2.t(t, j2, objS2);
                A(t, i3, i2);
            }
        }
    }

    private final int O(T t) {
        int i2;
        int iA;
        int iA2;
        int iA3;
        int iB;
        int iA4;
        int iZ;
        int iA5;
        int iA6;
        int iL;
        int iA7;
        int iY;
        int iY2;
        int iA8;
        int i3;
        Unsafe unsafe = f7954b;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        for (int i7 = 0; i7 < this.f7955c.length; i7 += 3) {
            int iM = m(i7);
            int i8 = this.f7955c[i7];
            int iO = o(iM);
            if (iO <= 17) {
                int i9 = this.f7955c[i7 + 2];
                int i10 = i9 & 1048575;
                i2 = 1 << (i9 >>> 20);
                if (i10 != i6) {
                    i5 = unsafe.getInt(t, i10);
                    i6 = i10;
                }
            } else {
                i2 = 0;
            }
            long j2 = iM & 1048575;
            switch (iO) {
                case 0:
                    if ((i5 & i2) != 0) {
                        iA = li2.A(i8 << 3);
                        iY = iA + 8;
                        i4 += iY;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i5 & i2) != 0) {
                        iA2 = li2.A(i8 << 3);
                        iY = iA2 + 4;
                        i4 += iY;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i5 & i2) != 0) {
                        long j3 = unsafe.getLong(t, j2);
                        iA3 = li2.A(i8 << 3);
                        iB = li2.B(j3);
                        iY = iA3 + iB;
                        i4 += iY;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i5 & i2) != 0) {
                        long j4 = unsafe.getLong(t, j2);
                        iA3 = li2.A(i8 << 3);
                        iB = li2.B(j4);
                        iY = iA3 + iB;
                        i4 += iY;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i5 & i2) != 0) {
                        int i11 = unsafe.getInt(t, j2);
                        iA4 = li2.A(i8 << 3);
                        iZ = li2.z(i11);
                        i3 = iA4 + iZ;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i5 & i2) != 0) {
                        iA = li2.A(i8 << 3);
                        iY = iA + 8;
                        i4 += iY;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i5 & i2) != 0) {
                        iA2 = li2.A(i8 << 3);
                        iY = iA2 + 4;
                        i4 += iY;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i5 & i2) != 0) {
                        iA5 = li2.A(i8 << 3);
                        iY = iA5 + 1;
                        i4 += iY;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i5 & i2) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(t, j2);
                        if (object instanceof ci2) {
                            iA6 = li2.A(i8 << 3);
                            iL = ((ci2) object).l();
                            iA7 = li2.A(iL);
                            i3 = iA6 + iA7 + iL;
                            i4 += i3;
                            break;
                        } else {
                            iA4 = li2.A(i8 << 3);
                            iZ = li2.C((String) object);
                            i3 = iA4 + iZ;
                            i4 += i3;
                        }
                    }
                case 9:
                    if ((i5 & i2) != 0) {
                        iY = fl2.Y(i8, unsafe.getObject(t, j2), T(i7));
                        i4 += iY;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i5 & i2) != 0) {
                        ci2 ci2Var = (ci2) unsafe.getObject(t, j2);
                        iA6 = li2.A(i8 << 3);
                        iL = ci2Var.l();
                        iA7 = li2.A(iL);
                        i3 = iA6 + iA7 + iL;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i5 & i2) != 0) {
                        int i12 = unsafe.getInt(t, j2);
                        iA4 = li2.A(i8 << 3);
                        iZ = li2.A(i12);
                        i3 = iA4 + iZ;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i5 & i2) != 0) {
                        int i13 = unsafe.getInt(t, j2);
                        iA4 = li2.A(i8 << 3);
                        iZ = li2.z(i13);
                        i3 = iA4 + iZ;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i5 & i2) != 0) {
                        iA2 = li2.A(i8 << 3);
                        iY = iA2 + 4;
                        i4 += iY;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i5 & i2) != 0) {
                        iA = li2.A(i8 << 3);
                        iY = iA + 8;
                        i4 += iY;
                        break;
                    } else {
                        break;
                    }
                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                    if ((i5 & i2) != 0) {
                        int i14 = unsafe.getInt(t, j2);
                        iA4 = li2.A(i8 << 3);
                        iZ = li2.A((i14 >> 31) ^ (i14 + i14));
                        i3 = iA4 + iZ;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i5 & i2) != 0) {
                        long j5 = unsafe.getLong(t, j2);
                        iA4 = li2.A(i8 << 3);
                        iZ = li2.B((j5 >> 63) ^ (j5 + j5));
                        i3 = iA4 + iZ;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i5 & i2) != 0) {
                        iY = li2.e(i8, (lk2) unsafe.getObject(t, j2), T(i7));
                        i4 += iY;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    iY = fl2.U(i8, (List) unsafe.getObject(t, j2), false);
                    i4 += iY;
                    break;
                case 19:
                    iY = fl2.S(i8, (List) unsafe.getObject(t, j2), false);
                    i4 += iY;
                    break;
                case 20:
                    iY = fl2.E(i8, (List) unsafe.getObject(t, j2), false);
                    i4 += iY;
                    break;
                case 21:
                    iY = fl2.G(i8, (List) unsafe.getObject(t, j2), false);
                    i4 += iY;
                    break;
                case 22:
                    iY = fl2.M(i8, (List) unsafe.getObject(t, j2), false);
                    i4 += iY;
                    break;
                case 23:
                    iY = fl2.U(i8, (List) unsafe.getObject(t, j2), false);
                    i4 += iY;
                    break;
                case SyslogConstants.LOG_DAEMON /* 24 */:
                    iY = fl2.S(i8, (List) unsafe.getObject(t, j2), false);
                    i4 += iY;
                    break;
                case 25:
                    iY = fl2.W(i8, (List) unsafe.getObject(t, j2), false);
                    i4 += iY;
                    break;
                case 26:
                    iY = fl2.X(i8, (List) unsafe.getObject(t, j2));
                    i4 += iY;
                    break;
                case 27:
                    iY = fl2.Z(i8, (List) unsafe.getObject(t, j2), T(i7));
                    i4 += iY;
                    break;
                case 28:
                    iY = fl2.a0(i8, (List) unsafe.getObject(t, j2));
                    i4 += iY;
                    break;
                case 29:
                    iY = fl2.O(i8, (List) unsafe.getObject(t, j2), false);
                    i4 += iY;
                    break;
                case 30:
                    iY = fl2.K(i8, (List) unsafe.getObject(t, j2), false);
                    i4 += iY;
                    break;
                case 31:
                    iY = fl2.S(i8, (List) unsafe.getObject(t, j2), false);
                    i4 += iY;
                    break;
                case 32:
                    iY = fl2.U(i8, (List) unsafe.getObject(t, j2), false);
                    i4 += iY;
                    break;
                case 33:
                    iY = fl2.Q(i8, (List) unsafe.getObject(t, j2), false);
                    i4 += iY;
                    break;
                case 34:
                    iY = fl2.I(i8, (List) unsafe.getObject(t, j2), false);
                    i4 += iY;
                    break;
                case 35:
                    iZ = fl2.T((List) unsafe.getObject(t, j2));
                    if (iZ > 0) {
                        iY2 = li2.y(i8);
                        iA8 = li2.A(iZ);
                        iA4 = iY2 + iA8;
                        i3 = iA4 + iZ;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    iZ = fl2.R((List) unsafe.getObject(t, j2));
                    if (iZ > 0) {
                        iY2 = li2.y(i8);
                        iA8 = li2.A(iZ);
                        iA4 = iY2 + iA8;
                        i3 = iA4 + iZ;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    iZ = fl2.D((List) unsafe.getObject(t, j2));
                    if (iZ > 0) {
                        iY2 = li2.y(i8);
                        iA8 = li2.A(iZ);
                        iA4 = iY2 + iA8;
                        i3 = iA4 + iZ;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    iZ = fl2.F((List) unsafe.getObject(t, j2));
                    if (iZ > 0) {
                        iY2 = li2.y(i8);
                        iA8 = li2.A(iZ);
                        iA4 = iY2 + iA8;
                        i3 = iA4 + iZ;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    iZ = fl2.L((List) unsafe.getObject(t, j2));
                    if (iZ > 0) {
                        iY2 = li2.y(i8);
                        iA8 = li2.A(iZ);
                        iA4 = iY2 + iA8;
                        i3 = iA4 + iZ;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    iZ = fl2.T((List) unsafe.getObject(t, j2));
                    if (iZ > 0) {
                        iY2 = li2.y(i8);
                        iA8 = li2.A(iZ);
                        iA4 = iY2 + iA8;
                        i3 = iA4 + iZ;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    iZ = fl2.R((List) unsafe.getObject(t, j2));
                    if (iZ > 0) {
                        iY2 = li2.y(i8);
                        iA8 = li2.A(iZ);
                        iA4 = iY2 + iA8;
                        i3 = iA4 + iZ;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    iZ = fl2.V((List) unsafe.getObject(t, j2));
                    if (iZ > 0) {
                        iY2 = li2.y(i8);
                        iA8 = li2.A(iZ);
                        iA4 = iY2 + iA8;
                        i3 = iA4 + iZ;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    iZ = fl2.N((List) unsafe.getObject(t, j2));
                    if (iZ > 0) {
                        iY2 = li2.y(i8);
                        iA8 = li2.A(iZ);
                        iA4 = iY2 + iA8;
                        i3 = iA4 + iZ;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    iZ = fl2.J((List) unsafe.getObject(t, j2));
                    if (iZ > 0) {
                        iY2 = li2.y(i8);
                        iA8 = li2.A(iZ);
                        iA4 = iY2 + iA8;
                        i3 = iA4 + iZ;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    iZ = fl2.R((List) unsafe.getObject(t, j2));
                    if (iZ > 0) {
                        iY2 = li2.y(i8);
                        iA8 = li2.A(iZ);
                        iA4 = iY2 + iA8;
                        i3 = iA4 + iZ;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    iZ = fl2.T((List) unsafe.getObject(t, j2));
                    if (iZ > 0) {
                        iY2 = li2.y(i8);
                        iA8 = li2.A(iZ);
                        iA4 = iY2 + iA8;
                        i3 = iA4 + iZ;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    iZ = fl2.P((List) unsafe.getObject(t, j2));
                    if (iZ > 0) {
                        iY2 = li2.y(i8);
                        iA8 = li2.A(iZ);
                        iA4 = iY2 + iA8;
                        i3 = iA4 + iZ;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case SyslogConstants.LOG_LPR /* 48 */:
                    iZ = fl2.H((List) unsafe.getObject(t, j2));
                    if (iZ > 0) {
                        iY2 = li2.y(i8);
                        iA8 = li2.A(iZ);
                        iA4 = iY2 + iA8;
                        i3 = iA4 + iZ;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    iY = fl2.b0(i8, (List) unsafe.getObject(t, j2), T(i7));
                    i4 += iY;
                    break;
                case 50:
                    gk2.a(i8, unsafe.getObject(t, j2), U(i7));
                    break;
                case 51:
                    if (z(t, i8, i7)) {
                        iA = li2.A(i8 << 3);
                        iY = iA + 8;
                        i4 += iY;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (z(t, i8, i7)) {
                        iA2 = li2.A(i8 << 3);
                        iY = iA2 + 4;
                        i4 += iY;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (z(t, i8, i7)) {
                        long jT = t(t, j2);
                        iA3 = li2.A(i8 << 3);
                        iB = li2.B(jT);
                        iY = iA3 + iB;
                        i4 += iY;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (z(t, i8, i7)) {
                        long jT2 = t(t, j2);
                        iA3 = li2.A(i8 << 3);
                        iB = li2.B(jT2);
                        iY = iA3 + iB;
                        i4 += iY;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (z(t, i8, i7)) {
                        int iS = s(t, j2);
                        iA4 = li2.A(i8 << 3);
                        iZ = li2.z(iS);
                        i3 = iA4 + iZ;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case SyslogConstants.LOG_NEWS /* 56 */:
                    if (z(t, i8, i7)) {
                        iA = li2.A(i8 << 3);
                        iY = iA + 8;
                        i4 += iY;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (z(t, i8, i7)) {
                        iA2 = li2.A(i8 << 3);
                        iY = iA2 + 4;
                        i4 += iY;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (z(t, i8, i7)) {
                        iA5 = li2.A(i8 << 3);
                        iY = iA5 + 1;
                        i4 += iY;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!z(t, i8, i7)) {
                        break;
                    } else {
                        Object object2 = unsafe.getObject(t, j2);
                        if (object2 instanceof ci2) {
                            iA6 = li2.A(i8 << 3);
                            iL = ((ci2) object2).l();
                            iA7 = li2.A(iL);
                            i3 = iA6 + iA7 + iL;
                            i4 += i3;
                            break;
                        } else {
                            iA4 = li2.A(i8 << 3);
                            iZ = li2.C((String) object2);
                            i3 = iA4 + iZ;
                            i4 += i3;
                        }
                    }
                case 60:
                    if (z(t, i8, i7)) {
                        iY = fl2.Y(i8, unsafe.getObject(t, j2), T(i7));
                        i4 += iY;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (z(t, i8, i7)) {
                        ci2 ci2Var2 = (ci2) unsafe.getObject(t, j2);
                        iA6 = li2.A(i8 << 3);
                        iL = ci2Var2.l();
                        iA7 = li2.A(iL);
                        i3 = iA6 + iA7 + iL;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (z(t, i8, i7)) {
                        int iS2 = s(t, j2);
                        iA4 = li2.A(i8 << 3);
                        iZ = li2.A(iS2);
                        i3 = iA4 + iZ;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (z(t, i8, i7)) {
                        int iS3 = s(t, j2);
                        iA4 = li2.A(i8 << 3);
                        iZ = li2.z(iS3);
                        i3 = iA4 + iZ;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (z(t, i8, i7)) {
                        iA2 = li2.A(i8 << 3);
                        iY = iA2 + 4;
                        i4 += iY;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (z(t, i8, i7)) {
                        iA = li2.A(i8 << 3);
                        iY = iA + 8;
                        i4 += iY;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (z(t, i8, i7)) {
                        int iS4 = s(t, j2);
                        iA4 = li2.A(i8 << 3);
                        iZ = li2.A((iS4 >> 31) ^ (iS4 + iS4));
                        i3 = iA4 + iZ;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (z(t, i8, i7)) {
                        long jT3 = t(t, j2);
                        iA4 = li2.A(i8 << 3);
                        iZ = li2.B((jT3 >> 63) ^ (jT3 + jT3));
                        i3 = iA4 + iZ;
                        i4 += i3;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (z(t, i8, i7)) {
                        iY = li2.e(i8, (lk2) unsafe.getObject(t, j2), T(i7));
                        i4 += iY;
                        break;
                    } else {
                        break;
                    }
            }
        }
        rl2<?, ?> rl2Var = this.o;
        int iQ = i4 + rl2Var.q(rl2Var.j(t));
        if (!this.f7960h) {
            return iQ;
        }
        this.p.b(t);
        throw null;
    }

    private final int P(T t) {
        int iA;
        int iA2;
        int iA3;
        int iB;
        int iA4;
        int iZ;
        int iA5;
        int iA6;
        int iL;
        int iA7;
        int iY;
        int iY2;
        int iA8;
        int i2;
        Unsafe unsafe = f7954b;
        int i3 = 0;
        for (int i4 = 0; i4 < this.f7955c.length; i4 += 3) {
            int iM = m(i4);
            int iO = o(iM);
            int i5 = this.f7955c[i4];
            long j2 = iM & 1048575;
            if (iO >= wi2.N.zza() && iO <= wi2.a0.zza()) {
                int i6 = this.f7955c[i4 + 2];
            }
            switch (iO) {
                case 0:
                    if (x(t, i4)) {
                        iA = li2.A(i5 << 3);
                        iY = iA + 8;
                        i3 += iY;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (x(t, i4)) {
                        iA2 = li2.A(i5 << 3);
                        iY = iA2 + 4;
                        i3 += iY;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (x(t, i4)) {
                        long jK = cm2.k(t, j2);
                        iA3 = li2.A(i5 << 3);
                        iB = li2.B(jK);
                        i3 += iA3 + iB;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (x(t, i4)) {
                        long jK2 = cm2.k(t, j2);
                        iA3 = li2.A(i5 << 3);
                        iB = li2.B(jK2);
                        i3 += iA3 + iB;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (x(t, i4)) {
                        int i7 = cm2.i(t, j2);
                        iA4 = li2.A(i5 << 3);
                        iZ = li2.z(i7);
                        i2 = iA4 + iZ;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (x(t, i4)) {
                        iA = li2.A(i5 << 3);
                        iY = iA + 8;
                        i3 += iY;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (x(t, i4)) {
                        iA2 = li2.A(i5 << 3);
                        iY = iA2 + 4;
                        i3 += iY;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (x(t, i4)) {
                        iA5 = li2.A(i5 << 3);
                        iY = iA5 + 1;
                        i3 += iY;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!x(t, i4)) {
                        break;
                    } else {
                        Object objS = cm2.s(t, j2);
                        if (objS instanceof ci2) {
                            iA6 = li2.A(i5 << 3);
                            iL = ((ci2) objS).l();
                            iA7 = li2.A(iL);
                            i2 = iA6 + iA7 + iL;
                            i3 += i2;
                            break;
                        } else {
                            iA4 = li2.A(i5 << 3);
                            iZ = li2.C((String) objS);
                            i2 = iA4 + iZ;
                            i3 += i2;
                        }
                    }
                case 9:
                    if (x(t, i4)) {
                        iY = fl2.Y(i5, cm2.s(t, j2), T(i4));
                        i3 += iY;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (x(t, i4)) {
                        ci2 ci2Var = (ci2) cm2.s(t, j2);
                        iA6 = li2.A(i5 << 3);
                        iL = ci2Var.l();
                        iA7 = li2.A(iL);
                        i2 = iA6 + iA7 + iL;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (x(t, i4)) {
                        int i8 = cm2.i(t, j2);
                        iA4 = li2.A(i5 << 3);
                        iZ = li2.A(i8);
                        i2 = iA4 + iZ;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (x(t, i4)) {
                        int i9 = cm2.i(t, j2);
                        iA4 = li2.A(i5 << 3);
                        iZ = li2.z(i9);
                        i2 = iA4 + iZ;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (x(t, i4)) {
                        iA2 = li2.A(i5 << 3);
                        iY = iA2 + 4;
                        i3 += iY;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (x(t, i4)) {
                        iA = li2.A(i5 << 3);
                        iY = iA + 8;
                        i3 += iY;
                        break;
                    } else {
                        break;
                    }
                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                    if (x(t, i4)) {
                        int i10 = cm2.i(t, j2);
                        iA4 = li2.A(i5 << 3);
                        iZ = li2.A((i10 >> 31) ^ (i10 + i10));
                        i2 = iA4 + iZ;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (x(t, i4)) {
                        long jK3 = cm2.k(t, j2);
                        iA4 = li2.A(i5 << 3);
                        iZ = li2.B((jK3 >> 63) ^ (jK3 + jK3));
                        i2 = iA4 + iZ;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (x(t, i4)) {
                        iY = li2.e(i5, (lk2) cm2.s(t, j2), T(i4));
                        i3 += iY;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    iY = fl2.U(i5, (List) cm2.s(t, j2), false);
                    i3 += iY;
                    break;
                case 19:
                    iY = fl2.S(i5, (List) cm2.s(t, j2), false);
                    i3 += iY;
                    break;
                case 20:
                    iY = fl2.E(i5, (List) cm2.s(t, j2), false);
                    i3 += iY;
                    break;
                case 21:
                    iY = fl2.G(i5, (List) cm2.s(t, j2), false);
                    i3 += iY;
                    break;
                case 22:
                    iY = fl2.M(i5, (List) cm2.s(t, j2), false);
                    i3 += iY;
                    break;
                case 23:
                    iY = fl2.U(i5, (List) cm2.s(t, j2), false);
                    i3 += iY;
                    break;
                case SyslogConstants.LOG_DAEMON /* 24 */:
                    iY = fl2.S(i5, (List) cm2.s(t, j2), false);
                    i3 += iY;
                    break;
                case 25:
                    iY = fl2.W(i5, (List) cm2.s(t, j2), false);
                    i3 += iY;
                    break;
                case 26:
                    iY = fl2.X(i5, (List) cm2.s(t, j2));
                    i3 += iY;
                    break;
                case 27:
                    iY = fl2.Z(i5, (List) cm2.s(t, j2), T(i4));
                    i3 += iY;
                    break;
                case 28:
                    iY = fl2.a0(i5, (List) cm2.s(t, j2));
                    i3 += iY;
                    break;
                case 29:
                    iY = fl2.O(i5, (List) cm2.s(t, j2), false);
                    i3 += iY;
                    break;
                case 30:
                    iY = fl2.K(i5, (List) cm2.s(t, j2), false);
                    i3 += iY;
                    break;
                case 31:
                    iY = fl2.S(i5, (List) cm2.s(t, j2), false);
                    i3 += iY;
                    break;
                case 32:
                    iY = fl2.U(i5, (List) cm2.s(t, j2), false);
                    i3 += iY;
                    break;
                case 33:
                    iY = fl2.Q(i5, (List) cm2.s(t, j2), false);
                    i3 += iY;
                    break;
                case 34:
                    iY = fl2.I(i5, (List) cm2.s(t, j2), false);
                    i3 += iY;
                    break;
                case 35:
                    iZ = fl2.T((List) unsafe.getObject(t, j2));
                    if (iZ > 0) {
                        iY2 = li2.y(i5);
                        iA8 = li2.A(iZ);
                        iA4 = iY2 + iA8;
                        i2 = iA4 + iZ;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    iZ = fl2.R((List) unsafe.getObject(t, j2));
                    if (iZ > 0) {
                        iY2 = li2.y(i5);
                        iA8 = li2.A(iZ);
                        iA4 = iY2 + iA8;
                        i2 = iA4 + iZ;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    iZ = fl2.D((List) unsafe.getObject(t, j2));
                    if (iZ > 0) {
                        iY2 = li2.y(i5);
                        iA8 = li2.A(iZ);
                        iA4 = iY2 + iA8;
                        i2 = iA4 + iZ;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    iZ = fl2.F((List) unsafe.getObject(t, j2));
                    if (iZ > 0) {
                        iY2 = li2.y(i5);
                        iA8 = li2.A(iZ);
                        iA4 = iY2 + iA8;
                        i2 = iA4 + iZ;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    iZ = fl2.L((List) unsafe.getObject(t, j2));
                    if (iZ > 0) {
                        iY2 = li2.y(i5);
                        iA8 = li2.A(iZ);
                        iA4 = iY2 + iA8;
                        i2 = iA4 + iZ;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    iZ = fl2.T((List) unsafe.getObject(t, j2));
                    if (iZ > 0) {
                        iY2 = li2.y(i5);
                        iA8 = li2.A(iZ);
                        iA4 = iY2 + iA8;
                        i2 = iA4 + iZ;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    iZ = fl2.R((List) unsafe.getObject(t, j2));
                    if (iZ > 0) {
                        iY2 = li2.y(i5);
                        iA8 = li2.A(iZ);
                        iA4 = iY2 + iA8;
                        i2 = iA4 + iZ;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    iZ = fl2.V((List) unsafe.getObject(t, j2));
                    if (iZ > 0) {
                        iY2 = li2.y(i5);
                        iA8 = li2.A(iZ);
                        iA4 = iY2 + iA8;
                        i2 = iA4 + iZ;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    iZ = fl2.N((List) unsafe.getObject(t, j2));
                    if (iZ > 0) {
                        iY2 = li2.y(i5);
                        iA8 = li2.A(iZ);
                        iA4 = iY2 + iA8;
                        i2 = iA4 + iZ;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    iZ = fl2.J((List) unsafe.getObject(t, j2));
                    if (iZ > 0) {
                        iY2 = li2.y(i5);
                        iA8 = li2.A(iZ);
                        iA4 = iY2 + iA8;
                        i2 = iA4 + iZ;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    iZ = fl2.R((List) unsafe.getObject(t, j2));
                    if (iZ > 0) {
                        iY2 = li2.y(i5);
                        iA8 = li2.A(iZ);
                        iA4 = iY2 + iA8;
                        i2 = iA4 + iZ;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    iZ = fl2.T((List) unsafe.getObject(t, j2));
                    if (iZ > 0) {
                        iY2 = li2.y(i5);
                        iA8 = li2.A(iZ);
                        iA4 = iY2 + iA8;
                        i2 = iA4 + iZ;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    iZ = fl2.P((List) unsafe.getObject(t, j2));
                    if (iZ > 0) {
                        iY2 = li2.y(i5);
                        iA8 = li2.A(iZ);
                        iA4 = iY2 + iA8;
                        i2 = iA4 + iZ;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case SyslogConstants.LOG_LPR /* 48 */:
                    iZ = fl2.H((List) unsafe.getObject(t, j2));
                    if (iZ > 0) {
                        iY2 = li2.y(i5);
                        iA8 = li2.A(iZ);
                        iA4 = iY2 + iA8;
                        i2 = iA4 + iZ;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    iY = fl2.b0(i5, (List) cm2.s(t, j2), T(i4));
                    i3 += iY;
                    break;
                case 50:
                    gk2.a(i5, cm2.s(t, j2), U(i4));
                    break;
                case 51:
                    if (z(t, i5, i4)) {
                        iA = li2.A(i5 << 3);
                        iY = iA + 8;
                        i3 += iY;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (z(t, i5, i4)) {
                        iA2 = li2.A(i5 << 3);
                        iY = iA2 + 4;
                        i3 += iY;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (z(t, i5, i4)) {
                        long jT = t(t, j2);
                        iA3 = li2.A(i5 << 3);
                        iB = li2.B(jT);
                        i3 += iA3 + iB;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (z(t, i5, i4)) {
                        long jT2 = t(t, j2);
                        iA3 = li2.A(i5 << 3);
                        iB = li2.B(jT2);
                        i3 += iA3 + iB;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (z(t, i5, i4)) {
                        int iS = s(t, j2);
                        iA4 = li2.A(i5 << 3);
                        iZ = li2.z(iS);
                        i2 = iA4 + iZ;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case SyslogConstants.LOG_NEWS /* 56 */:
                    if (z(t, i5, i4)) {
                        iA = li2.A(i5 << 3);
                        iY = iA + 8;
                        i3 += iY;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (z(t, i5, i4)) {
                        iA2 = li2.A(i5 << 3);
                        iY = iA2 + 4;
                        i3 += iY;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (z(t, i5, i4)) {
                        iA5 = li2.A(i5 << 3);
                        iY = iA5 + 1;
                        i3 += iY;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!z(t, i5, i4)) {
                        break;
                    } else {
                        Object objS2 = cm2.s(t, j2);
                        if (objS2 instanceof ci2) {
                            iA6 = li2.A(i5 << 3);
                            iL = ((ci2) objS2).l();
                            iA7 = li2.A(iL);
                            i2 = iA6 + iA7 + iL;
                            i3 += i2;
                            break;
                        } else {
                            iA4 = li2.A(i5 << 3);
                            iZ = li2.C((String) objS2);
                            i2 = iA4 + iZ;
                            i3 += i2;
                        }
                    }
                case 60:
                    if (z(t, i5, i4)) {
                        iY = fl2.Y(i5, cm2.s(t, j2), T(i4));
                        i3 += iY;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (z(t, i5, i4)) {
                        ci2 ci2Var2 = (ci2) cm2.s(t, j2);
                        iA6 = li2.A(i5 << 3);
                        iL = ci2Var2.l();
                        iA7 = li2.A(iL);
                        i2 = iA6 + iA7 + iL;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (z(t, i5, i4)) {
                        int iS2 = s(t, j2);
                        iA4 = li2.A(i5 << 3);
                        iZ = li2.A(iS2);
                        i2 = iA4 + iZ;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (z(t, i5, i4)) {
                        int iS3 = s(t, j2);
                        iA4 = li2.A(i5 << 3);
                        iZ = li2.z(iS3);
                        i2 = iA4 + iZ;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (z(t, i5, i4)) {
                        iA2 = li2.A(i5 << 3);
                        iY = iA2 + 4;
                        i3 += iY;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (z(t, i5, i4)) {
                        iA = li2.A(i5 << 3);
                        iY = iA + 8;
                        i3 += iY;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (z(t, i5, i4)) {
                        int iS4 = s(t, j2);
                        iA4 = li2.A(i5 << 3);
                        iZ = li2.A((iS4 >> 31) ^ (iS4 + iS4));
                        i2 = iA4 + iZ;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (z(t, i5, i4)) {
                        long jT3 = t(t, j2);
                        iA4 = li2.A(i5 << 3);
                        iZ = li2.B((jT3 >> 63) ^ (jT3 + jT3));
                        i2 = iA4 + iZ;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (z(t, i5, i4)) {
                        iY = li2.e(i5, (lk2) cm2.s(t, j2), T(i4));
                        i3 += iY;
                        break;
                    } else {
                        break;
                    }
            }
        }
        rl2<?, ?> rl2Var = this.o;
        return i3 + rl2Var.q(rl2Var.j(t));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int Q(T t, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, long j2, int i8, long j3, oh2 oh2Var) throws qj2 {
        int i9;
        int i10;
        int i11;
        int i12;
        int iA;
        int iA2 = i2;
        Unsafe unsafe = f7954b;
        nj2 nj2VarV = (nj2) unsafe.getObject(t, j3);
        if (!nj2VarV.zza()) {
            int size = nj2VarV.size();
            nj2VarV = nj2VarV.v(size == 0 ? 10 : size + size);
            unsafe.putObject(t, j3, nj2VarV);
        }
        switch (i8) {
            case 18:
            case 35:
                if (i6 == 2) {
                    ni2 ni2Var = (ni2) nj2VarV;
                    int iA3 = ph2.a(bArr, iA2, oh2Var);
                    int i13 = oh2Var.a + iA3;
                    while (iA3 < i13) {
                        ni2Var.c(Double.longBitsToDouble(ph2.e(bArr, iA3)));
                        iA3 += 8;
                    }
                    if (iA3 == i13) {
                        return iA3;
                    }
                    throw qj2.b();
                }
                if (i6 == 1) {
                    ni2 ni2Var2 = (ni2) nj2VarV;
                    ni2Var2.c(Double.longBitsToDouble(ph2.e(bArr, i2)));
                    while (true) {
                        i9 = iA2 + 8;
                        if (i9 < i3) {
                            iA2 = ph2.a(bArr, i9, oh2Var);
                            if (i4 == oh2Var.a) {
                                ni2Var2.c(Double.longBitsToDouble(ph2.e(bArr, iA2)));
                            }
                        }
                    }
                    return i9;
                }
                return iA2;
            case 19:
            case 36:
                if (i6 == 2) {
                    yi2 yi2Var = (yi2) nj2VarV;
                    int iA4 = ph2.a(bArr, iA2, oh2Var);
                    int i14 = oh2Var.a + iA4;
                    while (iA4 < i14) {
                        yi2Var.c(Float.intBitsToFloat(ph2.d(bArr, iA4)));
                        iA4 += 4;
                    }
                    if (iA4 == i14) {
                        return iA4;
                    }
                    throw qj2.b();
                }
                if (i6 == 5) {
                    yi2 yi2Var2 = (yi2) nj2VarV;
                    yi2Var2.c(Float.intBitsToFloat(ph2.d(bArr, i2)));
                    while (true) {
                        i10 = iA2 + 4;
                        if (i10 < i3) {
                            iA2 = ph2.a(bArr, i10, oh2Var);
                            if (i4 == oh2Var.a) {
                                yi2Var2.c(Float.intBitsToFloat(ph2.d(bArr, iA2)));
                            }
                        }
                    }
                    return i10;
                }
                return iA2;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i6 == 2) {
                    ak2 ak2Var = (ak2) nj2VarV;
                    int iA5 = ph2.a(bArr, iA2, oh2Var);
                    int i15 = oh2Var.a + iA5;
                    while (iA5 < i15) {
                        iA5 = ph2.c(bArr, iA5, oh2Var);
                        ak2Var.f(oh2Var.f7944b);
                    }
                    if (iA5 == i15) {
                        return iA5;
                    }
                    throw qj2.b();
                }
                if (i6 == 0) {
                    ak2 ak2Var2 = (ak2) nj2VarV;
                    int iC = ph2.c(bArr, iA2, oh2Var);
                    ak2Var2.f(oh2Var.f7944b);
                    while (iC < i3) {
                        int iA6 = ph2.a(bArr, iC, oh2Var);
                        if (i4 != oh2Var.a) {
                            return iC;
                        }
                        iC = ph2.c(bArr, iA6, oh2Var);
                        ak2Var2.f(oh2Var.f7944b);
                    }
                    return iC;
                }
                return iA2;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i6 == 2) {
                    return ph2.l(bArr, iA2, nj2VarV, oh2Var);
                }
                if (i6 == 0) {
                    return ph2.k(i4, bArr, i2, i3, nj2VarV, oh2Var);
                }
                return iA2;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i6 == 2) {
                    ak2 ak2Var3 = (ak2) nj2VarV;
                    int iA7 = ph2.a(bArr, iA2, oh2Var);
                    int i16 = oh2Var.a + iA7;
                    while (iA7 < i16) {
                        ak2Var3.f(ph2.e(bArr, iA7));
                        iA7 += 8;
                    }
                    if (iA7 == i16) {
                        return iA7;
                    }
                    throw qj2.b();
                }
                if (i6 == 1) {
                    ak2 ak2Var4 = (ak2) nj2VarV;
                    ak2Var4.f(ph2.e(bArr, i2));
                    while (true) {
                        i11 = iA2 + 8;
                        if (i11 < i3) {
                            iA2 = ph2.a(bArr, i11, oh2Var);
                            if (i4 == oh2Var.a) {
                                ak2Var4.f(ph2.e(bArr, iA2));
                            }
                        }
                    }
                    return i11;
                }
                return iA2;
            case SyslogConstants.LOG_DAEMON /* 24 */:
            case 31:
            case 41:
            case 45:
                if (i6 == 2) {
                    fj2 fj2Var = (fj2) nj2VarV;
                    int iA8 = ph2.a(bArr, iA2, oh2Var);
                    int i17 = oh2Var.a + iA8;
                    while (iA8 < i17) {
                        fj2Var.Z(ph2.d(bArr, iA8));
                        iA8 += 4;
                    }
                    if (iA8 == i17) {
                        return iA8;
                    }
                    throw qj2.b();
                }
                if (i6 == 5) {
                    fj2 fj2Var2 = (fj2) nj2VarV;
                    fj2Var2.Z(ph2.d(bArr, i2));
                    while (true) {
                        i12 = iA2 + 4;
                        if (i12 < i3) {
                            iA2 = ph2.a(bArr, i12, oh2Var);
                            if (i4 == oh2Var.a) {
                                fj2Var2.Z(ph2.d(bArr, iA2));
                            }
                        }
                    }
                    return i12;
                }
                return iA2;
            case 25:
            case 42:
                if (i6 == 2) {
                    qh2 qh2Var = (qh2) nj2VarV;
                    iA = ph2.a(bArr, iA2, oh2Var);
                    int i18 = oh2Var.a + iA;
                    while (iA < i18) {
                        iA = ph2.c(bArr, iA, oh2Var);
                        qh2Var.c(oh2Var.f7944b != 0);
                    }
                    if (iA != i18) {
                        throw qj2.b();
                    }
                    return iA;
                }
                if (i6 == 0) {
                    qh2 qh2Var2 = (qh2) nj2VarV;
                    int iC2 = ph2.c(bArr, iA2, oh2Var);
                    qh2Var2.c(oh2Var.f7944b != 0);
                    while (iC2 < i3) {
                        int iA9 = ph2.a(bArr, iC2, oh2Var);
                        if (i4 != oh2Var.a) {
                            return iC2;
                        }
                        iC2 = ph2.c(bArr, iA9, oh2Var);
                        qh2Var2.c(oh2Var.f7944b != 0);
                    }
                    return iC2;
                }
                return iA2;
            case 26:
                if (i6 == 2) {
                    if ((j2 & 536870912) == 0) {
                        iA2 = ph2.a(bArr, iA2, oh2Var);
                        int i19 = oh2Var.a;
                        if (i19 < 0) {
                            throw qj2.c();
                        }
                        if (i19 == 0) {
                            nj2VarV.add("");
                        } else {
                            nj2VarV.add(new String(bArr, iA2, i19, oj2.a));
                            iA2 += i19;
                        }
                        while (iA2 < i3) {
                            int iA10 = ph2.a(bArr, iA2, oh2Var);
                            if (i4 == oh2Var.a) {
                                iA2 = ph2.a(bArr, iA10, oh2Var);
                                int i20 = oh2Var.a;
                                if (i20 < 0) {
                                    throw qj2.c();
                                }
                                if (i20 == 0) {
                                    nj2VarV.add("");
                                } else {
                                    nj2VarV.add(new String(bArr, iA2, i20, oj2.a));
                                    iA2 += i20;
                                }
                            }
                        }
                    } else {
                        iA2 = ph2.a(bArr, iA2, oh2Var);
                        int i21 = oh2Var.a;
                        if (i21 < 0) {
                            throw qj2.c();
                        }
                        if (i21 == 0) {
                            nj2VarV.add("");
                        } else {
                            int i22 = iA2 + i21;
                            if (!hm2.b(bArr, iA2, i22)) {
                                throw qj2.j();
                            }
                            nj2VarV.add(new String(bArr, iA2, i21, oj2.a));
                            iA2 = i22;
                        }
                        while (iA2 < i3) {
                            int iA11 = ph2.a(bArr, iA2, oh2Var);
                            if (i4 == oh2Var.a) {
                                iA2 = ph2.a(bArr, iA11, oh2Var);
                                int i23 = oh2Var.a;
                                if (i23 < 0) {
                                    throw qj2.c();
                                }
                                if (i23 == 0) {
                                    nj2VarV.add("");
                                } else {
                                    int i24 = iA2 + i23;
                                    if (!hm2.b(bArr, iA2, i24)) {
                                        throw qj2.j();
                                    }
                                    nj2VarV.add(new String(bArr, iA2, i23, oj2.a));
                                    iA2 = i24;
                                }
                            }
                        }
                    }
                }
                return iA2;
            case 27:
                if (i6 == 2) {
                    return ph2.m(T(i7), i4, bArr, i2, i3, nj2VarV, oh2Var);
                }
                return iA2;
            case 28:
                if (i6 == 2) {
                    int iA12 = ph2.a(bArr, iA2, oh2Var);
                    int i25 = oh2Var.a;
                    if (i25 < 0) {
                        throw qj2.c();
                    }
                    if (i25 > bArr.length - iA12) {
                        throw qj2.b();
                    }
                    if (i25 == 0) {
                        nj2VarV.add(ci2.f5319e);
                    } else {
                        nj2VarV.add(ci2.G(bArr, iA12, i25));
                        iA12 += i25;
                    }
                    while (iA12 < i3) {
                        int iA13 = ph2.a(bArr, iA12, oh2Var);
                        if (i4 != oh2Var.a) {
                            return iA12;
                        }
                        iA12 = ph2.a(bArr, iA13, oh2Var);
                        int i26 = oh2Var.a;
                        if (i26 < 0) {
                            throw qj2.c();
                        }
                        if (i26 > bArr.length - iA12) {
                            throw qj2.b();
                        }
                        if (i26 == 0) {
                            nj2VarV.add(ci2.f5319e);
                        } else {
                            nj2VarV.add(ci2.G(bArr, iA12, i26));
                            iA12 += i26;
                        }
                    }
                    return iA12;
                }
                return iA2;
            case 30:
            case 44:
                if (i6 != 2) {
                    if (i6 == 0) {
                        iA = ph2.k(i4, bArr, i2, i3, nj2VarV, oh2Var);
                    }
                    return iA2;
                }
                iA = ph2.l(bArr, iA2, nj2VarV, oh2Var);
                ej2 ej2Var = (ej2) t;
                sl2 sl2Var = ej2Var.zzc;
                if (sl2Var == sl2.a()) {
                    sl2Var = null;
                }
                Object objG = fl2.g(i5, nj2VarV, V(i7), sl2Var, this.o);
                if (objG != null) {
                    ej2Var.zzc = (sl2) objG;
                    return iA;
                }
                return iA;
            case 33:
            case 47:
                if (i6 == 2) {
                    fj2 fj2Var3 = (fj2) nj2VarV;
                    int iA14 = ph2.a(bArr, iA2, oh2Var);
                    int i27 = oh2Var.a + iA14;
                    while (iA14 < i27) {
                        iA14 = ph2.a(bArr, iA14, oh2Var);
                        fj2Var3.Z(gi2.e(oh2Var.a));
                    }
                    if (iA14 == i27) {
                        return iA14;
                    }
                    throw qj2.b();
                }
                if (i6 == 0) {
                    fj2 fj2Var4 = (fj2) nj2VarV;
                    int iA15 = ph2.a(bArr, iA2, oh2Var);
                    fj2Var4.Z(gi2.e(oh2Var.a));
                    while (iA15 < i3) {
                        int iA16 = ph2.a(bArr, iA15, oh2Var);
                        if (i4 != oh2Var.a) {
                            return iA15;
                        }
                        iA15 = ph2.a(bArr, iA16, oh2Var);
                        fj2Var4.Z(gi2.e(oh2Var.a));
                    }
                    return iA15;
                }
                return iA2;
            case 34:
            case SyslogConstants.LOG_LPR /* 48 */:
                if (i6 == 2) {
                    ak2 ak2Var5 = (ak2) nj2VarV;
                    int iA17 = ph2.a(bArr, iA2, oh2Var);
                    int i28 = oh2Var.a + iA17;
                    while (iA17 < i28) {
                        iA17 = ph2.c(bArr, iA17, oh2Var);
                        ak2Var5.f(gi2.f(oh2Var.f7944b));
                    }
                    if (iA17 == i28) {
                        return iA17;
                    }
                    throw qj2.b();
                }
                if (i6 == 0) {
                    ak2 ak2Var6 = (ak2) nj2VarV;
                    int iC3 = ph2.c(bArr, iA2, oh2Var);
                    ak2Var6.f(gi2.f(oh2Var.f7944b));
                    while (iC3 < i3) {
                        int iA18 = ph2.a(bArr, iC3, oh2Var);
                        if (i4 != oh2Var.a) {
                            return iC3;
                        }
                        iC3 = ph2.c(bArr, iA18, oh2Var);
                        ak2Var6.f(gi2.f(oh2Var.f7944b));
                    }
                    return iC3;
                }
                return iA2;
            default:
                if (i6 == 3) {
                    dl2 dl2VarT = T(i7);
                    int i29 = (i4 & (-8)) | 4;
                    int iJ = ph2.j(dl2VarT, bArr, i2, i3, i29, oh2Var);
                    nj2VarV.add(oh2Var.f7945c);
                    while (iJ < i3) {
                        int iA19 = ph2.a(bArr, iJ, oh2Var);
                        if (i4 != oh2Var.a) {
                            return iJ;
                        }
                        iJ = ph2.j(dl2VarT, bArr, iA19, i3, i29, oh2Var);
                        nj2VarV.add(oh2Var.f7945c);
                    }
                    return iJ;
                }
                return iA2;
        }
    }

    private final <K, V> int R(T t, byte[] bArr, int i2, int i3, int i4, long j2, oh2 oh2Var) {
        Unsafe unsafe = f7954b;
        Object objU = U(i4);
        Object object = unsafe.getObject(t, j2);
        if (gk2.b(object)) {
            fk2<K, V> fk2VarD = fk2.a().d();
            gk2.c(fk2VarD, object);
            unsafe.putObject(t, j2, fk2VarD);
        }
        throw null;
    }

    private final int S(T t, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, int i9, oh2 oh2Var) throws qj2 {
        Unsafe unsafe = f7954b;
        long j3 = this.f7955c[i9 + 2] & 1048575;
        switch (i8) {
            case 51:
                if (i6 == 1) {
                    unsafe.putObject(t, j2, Double.valueOf(Double.longBitsToDouble(ph2.e(bArr, i2))));
                    unsafe.putInt(t, j3, i5);
                    return i2 + 8;
                }
                break;
            case 52:
                if (i6 == 5) {
                    unsafe.putObject(t, j2, Float.valueOf(Float.intBitsToFloat(ph2.d(bArr, i2))));
                    unsafe.putInt(t, j3, i5);
                    return i2 + 4;
                }
                break;
            case 53:
            case 54:
                if (i6 == 0) {
                    int iC = ph2.c(bArr, i2, oh2Var);
                    unsafe.putObject(t, j2, Long.valueOf(oh2Var.f7944b));
                    unsafe.putInt(t, j3, i5);
                    return iC;
                }
                break;
            case 55:
            case 62:
                if (i6 == 0) {
                    int iA = ph2.a(bArr, i2, oh2Var);
                    unsafe.putObject(t, j2, Integer.valueOf(oh2Var.a));
                    unsafe.putInt(t, j3, i5);
                    return iA;
                }
                break;
            case SyslogConstants.LOG_NEWS /* 56 */:
            case 65:
                if (i6 == 1) {
                    unsafe.putObject(t, j2, Long.valueOf(ph2.e(bArr, i2)));
                    unsafe.putInt(t, j3, i5);
                    return i2 + 8;
                }
                break;
            case 57:
            case 64:
                if (i6 == 5) {
                    unsafe.putObject(t, j2, Integer.valueOf(ph2.d(bArr, i2)));
                    unsafe.putInt(t, j3, i5);
                    return i2 + 4;
                }
                break;
            case 58:
                if (i6 == 0) {
                    int iC2 = ph2.c(bArr, i2, oh2Var);
                    unsafe.putObject(t, j2, Boolean.valueOf(oh2Var.f7944b != 0));
                    unsafe.putInt(t, j3, i5);
                    return iC2;
                }
                break;
            case 59:
                if (i6 == 2) {
                    int iA2 = ph2.a(bArr, i2, oh2Var);
                    int i10 = oh2Var.a;
                    if (i10 == 0) {
                        unsafe.putObject(t, j2, "");
                    } else {
                        if ((i7 & 536870912) != 0 && !hm2.b(bArr, iA2, iA2 + i10)) {
                            throw qj2.j();
                        }
                        unsafe.putObject(t, j2, new String(bArr, iA2, i10, oj2.a));
                        iA2 += i10;
                    }
                    unsafe.putInt(t, j3, i5);
                    return iA2;
                }
                break;
            case 60:
                if (i6 == 2) {
                    int i11 = ph2.i(T(i9), bArr, i2, i3, oh2Var);
                    Object object = unsafe.getInt(t, j3) == i5 ? unsafe.getObject(t, j2) : null;
                    if (object == null) {
                        unsafe.putObject(t, j2, oh2Var.f7945c);
                    } else {
                        unsafe.putObject(t, j2, oj2.i(object, oh2Var.f7945c));
                    }
                    unsafe.putInt(t, j3, i5);
                    return i11;
                }
                break;
            case 61:
                if (i6 == 2) {
                    int iH = ph2.h(bArr, i2, oh2Var);
                    unsafe.putObject(t, j2, oh2Var.f7945c);
                    unsafe.putInt(t, j3, i5);
                    return iH;
                }
                break;
            case 63:
                if (i6 == 0) {
                    int iA3 = ph2.a(bArr, i2, oh2Var);
                    int i12 = oh2Var.a;
                    ij2 ij2VarV = V(i9);
                    if (ij2VarV == null || ij2VarV.b(i12)) {
                        unsafe.putObject(t, j2, Integer.valueOf(i12));
                        unsafe.putInt(t, j3, i5);
                    } else {
                        H(t).h(i4, Long.valueOf(i12));
                    }
                    return iA3;
                }
                break;
            case 66:
                if (i6 == 0) {
                    int iA4 = ph2.a(bArr, i2, oh2Var);
                    unsafe.putObject(t, j2, Integer.valueOf(gi2.e(oh2Var.a)));
                    unsafe.putInt(t, j3, i5);
                    return iA4;
                }
                break;
            case 67:
                if (i6 == 0) {
                    int iC3 = ph2.c(bArr, i2, oh2Var);
                    unsafe.putObject(t, j2, Long.valueOf(gi2.f(oh2Var.f7944b)));
                    unsafe.putInt(t, j3, i5);
                    return iC3;
                }
                break;
            case 68:
                if (i6 == 3) {
                    int iJ = ph2.j(T(i9), bArr, i2, i3, (i4 & (-8)) | 4, oh2Var);
                    Object object2 = unsafe.getInt(t, j3) == i5 ? unsafe.getObject(t, j2) : null;
                    if (object2 == null) {
                        unsafe.putObject(t, j2, oh2Var.f7945c);
                    } else {
                        unsafe.putObject(t, j2, oj2.i(object2, oh2Var.f7945c));
                    }
                    unsafe.putInt(t, j3, i5);
                    return iJ;
                }
                break;
        }
        return i2;
    }

    private final dl2 T(int i2) {
        int i3 = i2 / 3;
        int i4 = i3 + i3;
        dl2 dl2Var = (dl2) this.f7956d[i4];
        if (dl2Var != null) {
            return dl2Var;
        }
        dl2<T> dl2VarB = tk2.a().b((Class) this.f7956d[i4 + 1]);
        this.f7956d[i4] = dl2VarB;
        return dl2VarB;
    }

    private final Object U(int i2) {
        int i3 = i2 / 3;
        return this.f7956d[i3 + i3];
    }

    private final ij2 V(int i2) {
        int i3 = i2 / 3;
        return (ij2) this.f7956d[i3 + i3 + 1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x02a8, code lost:
    
        if (r0 != r15) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02aa, code lost:
    
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r2 = r19;
        r1 = r20;
        r6 = r24;
        r7 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02be, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02f1, code lost:
    
        if (r0 != r15) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0314, code lost:
    
        if (r0 != r15) goto L105;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x0097. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int W(T r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.ads.oh2 r35) throws com.google.android.gms.internal.ads.qj2 {
        /*
            Method dump skipped, instructions count: 896
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ok2.W(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.oh2):int");
    }

    private final <UT, UB> UB a(Object obj, int i2, UB ub, rl2<UT, UB> rl2Var) {
        int i3 = this.f7955c[i2];
        Object objS = cm2.s(obj, m(i2) & 1048575);
        if (objS == null || V(i2) == null) {
            return ub;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean d(Object obj, int i2, dl2 dl2Var) {
        return dl2Var.i(cm2.s(obj, i2 & 1048575));
    }

    private final void l(Object obj, int i2, wk2 wk2Var) {
        if (p(i2)) {
            cm2.t(obj, i2 & 1048575, wk2Var.zzn());
        } else if (this.f7961i) {
            cm2.t(obj, i2 & 1048575, wk2Var.zzm());
        } else {
            cm2.t(obj, i2 & 1048575, wk2Var.zzq());
        }
    }

    private final int m(int i2) {
        return this.f7955c[i2 + 1];
    }

    private final int n(int i2) {
        return this.f7955c[i2 + 2];
    }

    private static int o(int i2) {
        return (i2 >>> 20) & 255;
    }

    private static boolean p(int i2) {
        return (i2 & 536870912) != 0;
    }

    private static <T> double q(T t, long j2) {
        return ((Double) cm2.s(t, j2)).doubleValue();
    }

    private static <T> float r(T t, long j2) {
        return ((Float) cm2.s(t, j2)).floatValue();
    }

    private static <T> int s(T t, long j2) {
        return ((Integer) cm2.s(t, j2)).intValue();
    }

    private static <T> long t(T t, long j2) {
        return ((Long) cm2.s(t, j2)).longValue();
    }

    private static <T> boolean u(T t, long j2) {
        return ((Boolean) cm2.s(t, j2)).booleanValue();
    }

    private final boolean v(T t, T t2, int i2) {
        return x(t, i2) == x(t2, i2);
    }

    private final boolean w(T t, int i2, int i3, int i4, int i5) {
        return i3 == 1048575 ? x(t, i2) : (i4 & i5) != 0;
    }

    private final boolean x(T t, int i2) {
        int iN = n(i2);
        long j2 = iN & 1048575;
        if (j2 != 1048575) {
            return (cm2.i(t, j2) & (1 << (iN >>> 20))) != 0;
        }
        int iM = m(i2);
        long j3 = iM & 1048575;
        switch (o(iM)) {
            case 0:
                return cm2.q(t, j3) != 0.0d;
            case 1:
                return cm2.o(t, j3) != 0.0f;
            case 2:
                return cm2.k(t, j3) != 0;
            case 3:
                return cm2.k(t, j3) != 0;
            case 4:
                return cm2.i(t, j3) != 0;
            case 5:
                return cm2.k(t, j3) != 0;
            case 6:
                return cm2.i(t, j3) != 0;
            case 7:
                return cm2.m(t, j3);
            case 8:
                Object objS = cm2.s(t, j3);
                if (objS instanceof String) {
                    return !((String) objS).isEmpty();
                }
                if (objS instanceof ci2) {
                    return !ci2.f5319e.equals(objS);
                }
                throw new IllegalArgumentException();
            case 9:
                return cm2.s(t, j3) != null;
            case 10:
                return !ci2.f5319e.equals(cm2.s(t, j3));
            case 11:
                return cm2.i(t, j3) != 0;
            case 12:
                return cm2.i(t, j3) != 0;
            case 13:
                return cm2.i(t, j3) != 0;
            case 14:
                return cm2.k(t, j3) != 0;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                return cm2.i(t, j3) != 0;
            case 16:
                return cm2.k(t, j3) != 0;
            case 17:
                return cm2.s(t, j3) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final void y(T t, int i2) {
        int iN = n(i2);
        long j2 = 1048575 & iN;
        if (j2 == 1048575) {
            return;
        }
        cm2.j(t, j2, (1 << (iN >>> 20)) | cm2.i(t, j2));
    }

    private final boolean z(T t, int i2, int i3) {
        return cm2.i(t, (long) (n(i3) & 1048575)) == i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x042b, code lost:
    
        if (r6 == r3) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x042d, code lost:
    
        r26.putInt(r12, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0433, code lost:
    
        r3 = r9.f7964l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0437, code lost:
    
        if (r3 >= r9.f7965m) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0439, code lost:
    
        r9.a(r12, r9.f7963k[r3], r2, r9.o);
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0445, code lost:
    
        if (r7 != 0) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0449, code lost:
    
        if (r0 != r32) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0450, code lost:
    
        throw com.google.android.gms.internal.ads.qj2.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0453, code lost:
    
        if (r0 > r32) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0455, code lost:
    
        if (r1 != r7) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0457, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x045c, code lost:
    
        throw com.google.android.gms.internal.ads.qj2.i();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int I(T r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.ads.oh2 r34) throws com.google.android.gms.internal.ads.qj2 {
        /*
            Method dump skipped, instructions count: 1156
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ok2.I(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.oh2):int");
    }

    @Override // com.google.android.gms.internal.ads.dl2
    public final int b(T t) {
        int i2;
        int iE;
        int length = this.f7955c.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iM = m(i4);
            int i5 = this.f7955c[i4];
            long j2 = 1048575 & iM;
            int iHashCode = 37;
            switch (o(iM)) {
                case 0:
                    i2 = i3 * 53;
                    iE = oj2.e(Double.doubleToLongBits(cm2.q(t, j2)));
                    i3 = i2 + iE;
                    break;
                case 1:
                    i2 = i3 * 53;
                    iE = Float.floatToIntBits(cm2.o(t, j2));
                    i3 = i2 + iE;
                    break;
                case 2:
                    i2 = i3 * 53;
                    iE = oj2.e(cm2.k(t, j2));
                    i3 = i2 + iE;
                    break;
                case 3:
                    i2 = i3 * 53;
                    iE = oj2.e(cm2.k(t, j2));
                    i3 = i2 + iE;
                    break;
                case 4:
                    i2 = i3 * 53;
                    iE = cm2.i(t, j2);
                    i3 = i2 + iE;
                    break;
                case 5:
                    i2 = i3 * 53;
                    iE = oj2.e(cm2.k(t, j2));
                    i3 = i2 + iE;
                    break;
                case 6:
                    i2 = i3 * 53;
                    iE = cm2.i(t, j2);
                    i3 = i2 + iE;
                    break;
                case 7:
                    i2 = i3 * 53;
                    iE = oj2.f(cm2.m(t, j2));
                    i3 = i2 + iE;
                    break;
                case 8:
                    i2 = i3 * 53;
                    iE = ((String) cm2.s(t, j2)).hashCode();
                    i3 = i2 + iE;
                    break;
                case 9:
                    Object objS = cm2.s(t, j2);
                    if (objS != null) {
                        iHashCode = objS.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i2 = i3 * 53;
                    iE = cm2.s(t, j2).hashCode();
                    i3 = i2 + iE;
                    break;
                case 11:
                    i2 = i3 * 53;
                    iE = cm2.i(t, j2);
                    i3 = i2 + iE;
                    break;
                case 12:
                    i2 = i3 * 53;
                    iE = cm2.i(t, j2);
                    i3 = i2 + iE;
                    break;
                case 13:
                    i2 = i3 * 53;
                    iE = cm2.i(t, j2);
                    i3 = i2 + iE;
                    break;
                case 14:
                    i2 = i3 * 53;
                    iE = oj2.e(cm2.k(t, j2));
                    i3 = i2 + iE;
                    break;
                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                    i2 = i3 * 53;
                    iE = cm2.i(t, j2);
                    i3 = i2 + iE;
                    break;
                case 16:
                    i2 = i3 * 53;
                    iE = oj2.e(cm2.k(t, j2));
                    i3 = i2 + iE;
                    break;
                case 17:
                    Object objS2 = cm2.s(t, j2);
                    if (objS2 != null) {
                        iHashCode = objS2.hashCode();
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
                    iE = cm2.s(t, j2).hashCode();
                    i3 = i2 + iE;
                    break;
                case 50:
                    i2 = i3 * 53;
                    iE = cm2.s(t, j2).hashCode();
                    i3 = i2 + iE;
                    break;
                case 51:
                    if (z(t, i5, i4)) {
                        i2 = i3 * 53;
                        iE = oj2.e(Double.doubleToLongBits(q(t, j2)));
                        i3 = i2 + iE;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (z(t, i5, i4)) {
                        i2 = i3 * 53;
                        iE = Float.floatToIntBits(r(t, j2));
                        i3 = i2 + iE;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (z(t, i5, i4)) {
                        i2 = i3 * 53;
                        iE = oj2.e(t(t, j2));
                        i3 = i2 + iE;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (z(t, i5, i4)) {
                        i2 = i3 * 53;
                        iE = oj2.e(t(t, j2));
                        i3 = i2 + iE;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (z(t, i5, i4)) {
                        i2 = i3 * 53;
                        iE = s(t, j2);
                        i3 = i2 + iE;
                        break;
                    } else {
                        break;
                    }
                case SyslogConstants.LOG_NEWS /* 56 */:
                    if (z(t, i5, i4)) {
                        i2 = i3 * 53;
                        iE = oj2.e(t(t, j2));
                        i3 = i2 + iE;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (z(t, i5, i4)) {
                        i2 = i3 * 53;
                        iE = s(t, j2);
                        i3 = i2 + iE;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (z(t, i5, i4)) {
                        i2 = i3 * 53;
                        iE = oj2.f(u(t, j2));
                        i3 = i2 + iE;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (z(t, i5, i4)) {
                        i2 = i3 * 53;
                        iE = ((String) cm2.s(t, j2)).hashCode();
                        i3 = i2 + iE;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (z(t, i5, i4)) {
                        i2 = i3 * 53;
                        iE = cm2.s(t, j2).hashCode();
                        i3 = i2 + iE;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (z(t, i5, i4)) {
                        i2 = i3 * 53;
                        iE = cm2.s(t, j2).hashCode();
                        i3 = i2 + iE;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (z(t, i5, i4)) {
                        i2 = i3 * 53;
                        iE = s(t, j2);
                        i3 = i2 + iE;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (z(t, i5, i4)) {
                        i2 = i3 * 53;
                        iE = s(t, j2);
                        i3 = i2 + iE;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (z(t, i5, i4)) {
                        i2 = i3 * 53;
                        iE = s(t, j2);
                        i3 = i2 + iE;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (z(t, i5, i4)) {
                        i2 = i3 * 53;
                        iE = oj2.e(t(t, j2));
                        i3 = i2 + iE;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (z(t, i5, i4)) {
                        i2 = i3 * 53;
                        iE = s(t, j2);
                        i3 = i2 + iE;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (z(t, i5, i4)) {
                        i2 = i3 * 53;
                        iE = oj2.e(t(t, j2));
                        i3 = i2 + iE;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (z(t, i5, i4)) {
                        i2 = i3 * 53;
                        iE = cm2.s(t, j2).hashCode();
                        i3 = i2 + iE;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i3 * 53) + this.o.j(t).hashCode();
        if (!this.f7960h) {
            return iHashCode2;
        }
        this.p.b(t);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.dl2
    public final int c(T t) {
        return this.f7962j ? P(t) : O(t);
    }

    @Override // com.google.android.gms.internal.ads.dl2
    public final boolean e(T t, T t2) {
        boolean zD;
        int length = this.f7955c.length;
        for (int i2 = 0; i2 < length; i2 += 3) {
            int iM = m(i2);
            long j2 = iM & 1048575;
            switch (o(iM)) {
                case 0:
                    if (!v(t, t2, i2) || Double.doubleToLongBits(cm2.q(t, j2)) != Double.doubleToLongBits(cm2.q(t2, j2))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!v(t, t2, i2) || Float.floatToIntBits(cm2.o(t, j2)) != Float.floatToIntBits(cm2.o(t2, j2))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!v(t, t2, i2) || cm2.k(t, j2) != cm2.k(t2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!v(t, t2, i2) || cm2.k(t, j2) != cm2.k(t2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!v(t, t2, i2) || cm2.i(t, j2) != cm2.i(t2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!v(t, t2, i2) || cm2.k(t, j2) != cm2.k(t2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!v(t, t2, i2) || cm2.i(t, j2) != cm2.i(t2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!v(t, t2, i2) || cm2.m(t, j2) != cm2.m(t2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (!v(t, t2, i2) || !fl2.d(cm2.s(t, j2), cm2.s(t2, j2))) {
                        return false;
                    }
                    continue;
                    break;
                case 9:
                    if (!v(t, t2, i2) || !fl2.d(cm2.s(t, j2), cm2.s(t2, j2))) {
                        return false;
                    }
                    continue;
                    break;
                case 10:
                    if (!v(t, t2, i2) || !fl2.d(cm2.s(t, j2), cm2.s(t2, j2))) {
                        return false;
                    }
                    continue;
                    break;
                case 11:
                    if (!v(t, t2, i2) || cm2.i(t, j2) != cm2.i(t2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!v(t, t2, i2) || cm2.i(t, j2) != cm2.i(t2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!v(t, t2, i2) || cm2.i(t, j2) != cm2.i(t2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!v(t, t2, i2) || cm2.k(t, j2) != cm2.k(t2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                    if (!v(t, t2, i2) || cm2.i(t, j2) != cm2.i(t2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!v(t, t2, i2) || cm2.k(t, j2) != cm2.k(t2, j2)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (!v(t, t2, i2) || !fl2.d(cm2.s(t, j2), cm2.s(t2, j2))) {
                        return false;
                    }
                    continue;
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
                    zD = fl2.d(cm2.s(t, j2), cm2.s(t2, j2));
                    break;
                case 50:
                    zD = fl2.d(cm2.s(t, j2), cm2.s(t2, j2));
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
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jN = n(i2) & 1048575;
                    if (cm2.i(t, jN) != cm2.i(t2, jN) || !fl2.d(cm2.s(t, j2), cm2.s(t2, j2))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!zD) {
                return false;
            }
        }
        if (!this.o.j(t).equals(this.o.j(t2))) {
            return false;
        }
        if (!this.f7960h) {
            return true;
        }
        this.p.b(t);
        this.p.b(t2);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.dl2
    public final void f(T t, wk2 wk2Var, qi2 qi2Var) {
        Objects.requireNonNull(qi2Var);
        rl2 rl2Var = this.o;
        ri2<?> ri2Var = this.p;
        Object objC = null;
        Object objE = null;
        while (true) {
            try {
                int iZzb = wk2Var.zzb();
                int iB = B(iZzb);
                if (iB >= 0) {
                    int iM = m(iB);
                    try {
                        switch (o(iM)) {
                            case 0:
                                cm2.r(t, iM & 1048575, wk2Var.zze());
                                y(t, iB);
                                break;
                            case 1:
                                cm2.p(t, iM & 1048575, wk2Var.zzf());
                                y(t, iB);
                                break;
                            case 2:
                                cm2.l(t, iM & 1048575, wk2Var.zzh());
                                y(t, iB);
                                break;
                            case 3:
                                cm2.l(t, iM & 1048575, wk2Var.zzg());
                                y(t, iB);
                                break;
                            case 4:
                                cm2.j(t, iM & 1048575, wk2Var.zzi());
                                y(t, iB);
                                break;
                            case 5:
                                cm2.l(t, iM & 1048575, wk2Var.zzj());
                                y(t, iB);
                                break;
                            case 6:
                                cm2.j(t, iM & 1048575, wk2Var.zzk());
                                y(t, iB);
                                break;
                            case 7:
                                cm2.n(t, iM & 1048575, wk2Var.zzl());
                                y(t, iB);
                                break;
                            case 8:
                                l(t, iM, wk2Var);
                                y(t, iB);
                                break;
                            case 9:
                                if (x(t, iB)) {
                                    long j2 = iM & 1048575;
                                    cm2.t(t, j2, oj2.i(cm2.s(t, j2), wk2Var.k(T(iB), qi2Var)));
                                    break;
                                } else {
                                    cm2.t(t, iM & 1048575, wk2Var.k(T(iB), qi2Var));
                                    y(t, iB);
                                    break;
                                }
                            case 10:
                                cm2.t(t, iM & 1048575, wk2Var.zzq());
                                y(t, iB);
                                break;
                            case 11:
                                cm2.j(t, iM & 1048575, wk2Var.zzr());
                                y(t, iB);
                                break;
                            case 12:
                                int iZzs = wk2Var.zzs();
                                ij2 ij2VarV = V(iB);
                                if (ij2VarV != null && !ij2VarV.b(iZzs)) {
                                    objE = fl2.h(iZzb, iZzs, objE, rl2Var);
                                    break;
                                } else {
                                    cm2.j(t, iM & 1048575, iZzs);
                                    y(t, iB);
                                    break;
                                }
                            case 13:
                                cm2.j(t, iM & 1048575, wk2Var.zzt());
                                y(t, iB);
                                break;
                            case 14:
                                cm2.l(t, iM & 1048575, wk2Var.zzu());
                                y(t, iB);
                                break;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                                cm2.j(t, iM & 1048575, wk2Var.zzv());
                                y(t, iB);
                                break;
                            case 16:
                                cm2.l(t, iM & 1048575, wk2Var.zzw());
                                y(t, iB);
                                break;
                            case 17:
                                if (x(t, iB)) {
                                    long j3 = iM & 1048575;
                                    cm2.t(t, j3, oj2.i(cm2.s(t, j3), wk2Var.n(T(iB), qi2Var)));
                                    break;
                                } else {
                                    cm2.t(t, iM & 1048575, wk2Var.n(T(iB), qi2Var));
                                    y(t, iB);
                                    break;
                                }
                            case 18:
                                wk2Var.f(this.n.a(t, iM & 1048575));
                                break;
                            case 19:
                                wk2Var.b(this.n.a(t, iM & 1048575));
                                break;
                            case 20:
                                wk2Var.m(this.n.a(t, iM & 1048575));
                                break;
                            case 21:
                                wk2Var.j(this.n.a(t, iM & 1048575));
                                break;
                            case 22:
                                wk2Var.s(this.n.a(t, iM & 1048575));
                                break;
                            case 23:
                                wk2Var.q(this.n.a(t, iM & 1048575));
                                break;
                            case SyslogConstants.LOG_DAEMON /* 24 */:
                                wk2Var.g(this.n.a(t, iM & 1048575));
                                break;
                            case 25:
                                wk2Var.c(this.n.a(t, iM & 1048575));
                                break;
                            case 26:
                                if (p(iM)) {
                                    ((hi2) wk2Var).t(this.n.a(t, iM & 1048575), true);
                                    break;
                                } else {
                                    ((hi2) wk2Var).t(this.n.a(t, iM & 1048575), false);
                                    break;
                                }
                            case 27:
                                wk2Var.h(this.n.a(t, iM & 1048575), T(iB), qi2Var);
                                break;
                            case 28:
                                wk2Var.o(this.n.a(t, iM & 1048575));
                                break;
                            case 29:
                                wk2Var.l(this.n.a(t, iM & 1048575));
                                break;
                            case 30:
                                List<Integer> listA = this.n.a(t, iM & 1048575);
                                wk2Var.r(listA);
                                objE = fl2.g(iZzb, listA, V(iB), objE, rl2Var);
                                break;
                            case 31:
                                wk2Var.p(this.n.a(t, iM & 1048575));
                                break;
                            case 32:
                                wk2Var.e(this.n.a(t, iM & 1048575));
                                break;
                            case 33:
                                wk2Var.a(this.n.a(t, iM & 1048575));
                                break;
                            case 34:
                                wk2Var.i(this.n.a(t, iM & 1048575));
                                break;
                            case 35:
                                wk2Var.f(this.n.a(t, iM & 1048575));
                                break;
                            case 36:
                                wk2Var.b(this.n.a(t, iM & 1048575));
                                break;
                            case 37:
                                wk2Var.m(this.n.a(t, iM & 1048575));
                                break;
                            case 38:
                                wk2Var.j(this.n.a(t, iM & 1048575));
                                break;
                            case 39:
                                wk2Var.s(this.n.a(t, iM & 1048575));
                                break;
                            case 40:
                                wk2Var.q(this.n.a(t, iM & 1048575));
                                break;
                            case 41:
                                wk2Var.g(this.n.a(t, iM & 1048575));
                                break;
                            case 42:
                                wk2Var.c(this.n.a(t, iM & 1048575));
                                break;
                            case 43:
                                wk2Var.l(this.n.a(t, iM & 1048575));
                                break;
                            case 44:
                                List<Integer> listA2 = this.n.a(t, iM & 1048575);
                                wk2Var.r(listA2);
                                objE = fl2.g(iZzb, listA2, V(iB), objE, rl2Var);
                                break;
                            case 45:
                                wk2Var.p(this.n.a(t, iM & 1048575));
                                break;
                            case 46:
                                wk2Var.e(this.n.a(t, iM & 1048575));
                                break;
                            case 47:
                                wk2Var.a(this.n.a(t, iM & 1048575));
                                break;
                            case SyslogConstants.LOG_LPR /* 48 */:
                                wk2Var.i(this.n.a(t, iM & 1048575));
                                break;
                            case 49:
                                wk2Var.d(this.n.a(t, iM & 1048575), T(iB), qi2Var);
                                break;
                            case 50:
                                Object objU = U(iB);
                                long jM = m(iB) & 1048575;
                                Object objS = cm2.s(t, jM);
                                if (objS == null) {
                                    objS = fk2.a().d();
                                    cm2.t(t, jM, objS);
                                } else if (gk2.b(objS)) {
                                    Object objD = fk2.a().d();
                                    gk2.c(objD, objS);
                                    cm2.t(t, jM, objD);
                                    objS = objD;
                                }
                                throw null;
                                break;
                            case 51:
                                cm2.t(t, iM & 1048575, Double.valueOf(wk2Var.zze()));
                                A(t, iZzb, iB);
                                break;
                            case 52:
                                cm2.t(t, iM & 1048575, Float.valueOf(wk2Var.zzf()));
                                A(t, iZzb, iB);
                                break;
                            case 53:
                                cm2.t(t, iM & 1048575, Long.valueOf(wk2Var.zzh()));
                                A(t, iZzb, iB);
                                break;
                            case 54:
                                cm2.t(t, iM & 1048575, Long.valueOf(wk2Var.zzg()));
                                A(t, iZzb, iB);
                                break;
                            case 55:
                                cm2.t(t, iM & 1048575, Integer.valueOf(wk2Var.zzi()));
                                A(t, iZzb, iB);
                                break;
                            case SyslogConstants.LOG_NEWS /* 56 */:
                                cm2.t(t, iM & 1048575, Long.valueOf(wk2Var.zzj()));
                                A(t, iZzb, iB);
                                break;
                            case 57:
                                cm2.t(t, iM & 1048575, Integer.valueOf(wk2Var.zzk()));
                                A(t, iZzb, iB);
                                break;
                            case 58:
                                cm2.t(t, iM & 1048575, Boolean.valueOf(wk2Var.zzl()));
                                A(t, iZzb, iB);
                                break;
                            case 59:
                                l(t, iM, wk2Var);
                                A(t, iZzb, iB);
                                break;
                            case 60:
                                if (z(t, iZzb, iB)) {
                                    long j4 = iM & 1048575;
                                    cm2.t(t, j4, oj2.i(cm2.s(t, j4), wk2Var.k(T(iB), qi2Var)));
                                } else {
                                    cm2.t(t, iM & 1048575, wk2Var.k(T(iB), qi2Var));
                                    y(t, iB);
                                }
                                A(t, iZzb, iB);
                                break;
                            case 61:
                                cm2.t(t, iM & 1048575, wk2Var.zzq());
                                A(t, iZzb, iB);
                                break;
                            case 62:
                                cm2.t(t, iM & 1048575, Integer.valueOf(wk2Var.zzr()));
                                A(t, iZzb, iB);
                                break;
                            case 63:
                                int iZzs2 = wk2Var.zzs();
                                ij2 ij2VarV2 = V(iB);
                                if (ij2VarV2 != null && !ij2VarV2.b(iZzs2)) {
                                    objE = fl2.h(iZzb, iZzs2, objE, rl2Var);
                                    break;
                                } else {
                                    cm2.t(t, iM & 1048575, Integer.valueOf(iZzs2));
                                    A(t, iZzb, iB);
                                    break;
                                }
                                break;
                            case 64:
                                cm2.t(t, iM & 1048575, Integer.valueOf(wk2Var.zzt()));
                                A(t, iZzb, iB);
                                break;
                            case 65:
                                cm2.t(t, iM & 1048575, Long.valueOf(wk2Var.zzu()));
                                A(t, iZzb, iB);
                                break;
                            case 66:
                                cm2.t(t, iM & 1048575, Integer.valueOf(wk2Var.zzv()));
                                A(t, iZzb, iB);
                                break;
                            case 67:
                                cm2.t(t, iM & 1048575, Long.valueOf(wk2Var.zzw()));
                                A(t, iZzb, iB);
                                break;
                            case 68:
                                cm2.t(t, iM & 1048575, wk2Var.n(T(iB), qi2Var));
                                A(t, iZzb, iB);
                                break;
                            default:
                                if (objE == null) {
                                    objE = rl2Var.g();
                                }
                                if (!rl2Var.n(objE, wk2Var)) {
                                    for (int i2 = this.f7964l; i2 < this.f7965m; i2++) {
                                        a(t, this.f7963k[i2], objE, rl2Var);
                                    }
                                    rl2Var.l(t, objE);
                                    return;
                                }
                                break;
                        }
                    } catch (pj2 unused) {
                        rl2Var.a(wk2Var);
                        if (objE == null) {
                            objE = rl2Var.k(t);
                        }
                        if (!rl2Var.n(objE, wk2Var)) {
                            for (int i3 = this.f7964l; i3 < this.f7965m; i3++) {
                                a(t, this.f7963k[i3], objE, rl2Var);
                            }
                            if (objE != null) {
                                rl2Var.l(t, objE);
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    if (iZzb == Integer.MAX_VALUE) {
                        for (int i4 = this.f7964l; i4 < this.f7965m; i4++) {
                            a(t, this.f7963k[i4], objE, rl2Var);
                        }
                        if (objE != null) {
                            rl2Var.l(t, objE);
                            return;
                        }
                        return;
                    }
                    Object objF = !this.f7960h ? null : ri2Var.f(qi2Var, this.f7959g, iZzb);
                    if (objF != null) {
                        if (objC == null) {
                            objC = ri2Var.c(t);
                        }
                        vi2<T> vi2Var = objC;
                        objE = ri2Var.e(wk2Var, objF, qi2Var, vi2Var, objE, rl2Var);
                        objC = vi2Var;
                    } else {
                        rl2Var.a(wk2Var);
                        if (objE == null) {
                            objE = rl2Var.k(t);
                        }
                        if (!rl2Var.n(objE, wk2Var)) {
                            for (int i5 = this.f7964l; i5 < this.f7965m; i5++) {
                                a(t, this.f7963k[i5], objE, rl2Var);
                            }
                            if (objE != null) {
                                rl2Var.l(t, objE);
                                return;
                            }
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                for (int i6 = this.f7964l; i6 < this.f7965m; i6++) {
                    a(t, this.f7963k[i6], objE, rl2Var);
                }
                if (objE != null) {
                    rl2Var.l(t, objE);
                }
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.dl2
    public final void g(T t, T t2) {
        Objects.requireNonNull(t2);
        for (int i2 = 0; i2 < this.f7955c.length; i2 += 3) {
            int iM = m(i2);
            long j2 = 1048575 & iM;
            int i3 = this.f7955c[i2];
            switch (o(iM)) {
                case 0:
                    if (x(t2, i2)) {
                        cm2.r(t, j2, cm2.q(t2, j2));
                        y(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (x(t2, i2)) {
                        cm2.p(t, j2, cm2.o(t2, j2));
                        y(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (x(t2, i2)) {
                        cm2.l(t, j2, cm2.k(t2, j2));
                        y(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (x(t2, i2)) {
                        cm2.l(t, j2, cm2.k(t2, j2));
                        y(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (x(t2, i2)) {
                        cm2.j(t, j2, cm2.i(t2, j2));
                        y(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (x(t2, i2)) {
                        cm2.l(t, j2, cm2.k(t2, j2));
                        y(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (x(t2, i2)) {
                        cm2.j(t, j2, cm2.i(t2, j2));
                        y(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (x(t2, i2)) {
                        cm2.n(t, j2, cm2.m(t2, j2));
                        y(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (x(t2, i2)) {
                        cm2.t(t, j2, cm2.s(t2, j2));
                        y(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    M(t, t2, i2);
                    break;
                case 10:
                    if (x(t2, i2)) {
                        cm2.t(t, j2, cm2.s(t2, j2));
                        y(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (x(t2, i2)) {
                        cm2.j(t, j2, cm2.i(t2, j2));
                        y(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (x(t2, i2)) {
                        cm2.j(t, j2, cm2.i(t2, j2));
                        y(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (x(t2, i2)) {
                        cm2.j(t, j2, cm2.i(t2, j2));
                        y(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (x(t2, i2)) {
                        cm2.l(t, j2, cm2.k(t2, j2));
                        y(t, i2);
                        break;
                    } else {
                        break;
                    }
                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                    if (x(t2, i2)) {
                        cm2.j(t, j2, cm2.i(t2, j2));
                        y(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (x(t2, i2)) {
                        cm2.l(t, j2, cm2.k(t2, j2));
                        y(t, i2);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    M(t, t2, i2);
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
                    this.n.c(t, t2, j2);
                    break;
                case 50:
                    fl2.i(this.r, t, t2, j2);
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
                    if (z(t2, i3, i2)) {
                        cm2.t(t, j2, cm2.s(t2, j2));
                        A(t, i3, i2);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    N(t, t2, i2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (z(t2, i3, i2)) {
                        cm2.t(t, j2, cm2.s(t2, j2));
                        A(t, i3, i2);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    N(t, t2, i2);
                    break;
            }
        }
        fl2.f(this.o, t, t2);
        if (this.f7960h) {
            fl2.e(this.p, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.ads.dl2
    public final void h(T t, mi2 mi2Var) {
        if (!this.f7962j) {
            E(t, mi2Var);
            return;
        }
        if (this.f7960h) {
            this.p.b(t);
            throw null;
        }
        int length = this.f7955c.length;
        for (int i2 = 0; i2 < length; i2 += 3) {
            int iM = m(i2);
            int i3 = this.f7955c[i2];
            switch (o(iM)) {
                case 0:
                    if (x(t, i2)) {
                        mi2Var.q(i3, cm2.q(t, iM & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (x(t, i2)) {
                        mi2Var.p(i3, cm2.o(t, iM & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (x(t, i2)) {
                        mi2Var.n(i3, cm2.k(t, iM & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (x(t, i2)) {
                        mi2Var.s(i3, cm2.k(t, iM & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (x(t, i2)) {
                        mi2Var.t(i3, cm2.i(t, iM & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (x(t, i2)) {
                        mi2Var.u(i3, cm2.k(t, iM & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (x(t, i2)) {
                        mi2Var.v(i3, cm2.i(t, iM & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (x(t, i2)) {
                        mi2Var.w(i3, cm2.m(t, iM & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (x(t, i2)) {
                        G(i3, cm2.s(t, iM & 1048575), mi2Var);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (x(t, i2)) {
                        mi2Var.C(i3, cm2.s(t, iM & 1048575), T(i2));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (x(t, i2)) {
                        mi2Var.y(i3, (ci2) cm2.s(t, iM & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (x(t, i2)) {
                        mi2Var.z(i3, cm2.i(t, iM & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (x(t, i2)) {
                        mi2Var.r(i3, cm2.i(t, iM & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (x(t, i2)) {
                        mi2Var.m(i3, cm2.i(t, iM & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (x(t, i2)) {
                        mi2Var.o(i3, cm2.k(t, iM & 1048575));
                        break;
                    } else {
                        break;
                    }
                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                    if (x(t, i2)) {
                        mi2Var.A(i3, cm2.i(t, iM & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (x(t, i2)) {
                        mi2Var.B(i3, cm2.k(t, iM & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (x(t, i2)) {
                        mi2Var.D(i3, cm2.s(t, iM & 1048575), T(i2));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    fl2.j(this.f7955c[i2], (List) cm2.s(t, iM & 1048575), mi2Var, false);
                    break;
                case 19:
                    fl2.k(this.f7955c[i2], (List) cm2.s(t, iM & 1048575), mi2Var, false);
                    break;
                case 20:
                    fl2.l(this.f7955c[i2], (List) cm2.s(t, iM & 1048575), mi2Var, false);
                    break;
                case 21:
                    fl2.m(this.f7955c[i2], (List) cm2.s(t, iM & 1048575), mi2Var, false);
                    break;
                case 22:
                    fl2.q(this.f7955c[i2], (List) cm2.s(t, iM & 1048575), mi2Var, false);
                    break;
                case 23:
                    fl2.o(this.f7955c[i2], (List) cm2.s(t, iM & 1048575), mi2Var, false);
                    break;
                case SyslogConstants.LOG_DAEMON /* 24 */:
                    fl2.t(this.f7955c[i2], (List) cm2.s(t, iM & 1048575), mi2Var, false);
                    break;
                case 25:
                    fl2.w(this.f7955c[i2], (List) cm2.s(t, iM & 1048575), mi2Var, false);
                    break;
                case 26:
                    fl2.x(this.f7955c[i2], (List) cm2.s(t, iM & 1048575), mi2Var);
                    break;
                case 27:
                    fl2.z(this.f7955c[i2], (List) cm2.s(t, iM & 1048575), mi2Var, T(i2));
                    break;
                case 28:
                    fl2.y(this.f7955c[i2], (List) cm2.s(t, iM & 1048575), mi2Var);
                    break;
                case 29:
                    fl2.r(this.f7955c[i2], (List) cm2.s(t, iM & 1048575), mi2Var, false);
                    break;
                case 30:
                    fl2.v(this.f7955c[i2], (List) cm2.s(t, iM & 1048575), mi2Var, false);
                    break;
                case 31:
                    fl2.u(this.f7955c[i2], (List) cm2.s(t, iM & 1048575), mi2Var, false);
                    break;
                case 32:
                    fl2.p(this.f7955c[i2], (List) cm2.s(t, iM & 1048575), mi2Var, false);
                    break;
                case 33:
                    fl2.s(this.f7955c[i2], (List) cm2.s(t, iM & 1048575), mi2Var, false);
                    break;
                case 34:
                    fl2.n(this.f7955c[i2], (List) cm2.s(t, iM & 1048575), mi2Var, false);
                    break;
                case 35:
                    fl2.j(this.f7955c[i2], (List) cm2.s(t, iM & 1048575), mi2Var, true);
                    break;
                case 36:
                    fl2.k(this.f7955c[i2], (List) cm2.s(t, iM & 1048575), mi2Var, true);
                    break;
                case 37:
                    fl2.l(this.f7955c[i2], (List) cm2.s(t, iM & 1048575), mi2Var, true);
                    break;
                case 38:
                    fl2.m(this.f7955c[i2], (List) cm2.s(t, iM & 1048575), mi2Var, true);
                    break;
                case 39:
                    fl2.q(this.f7955c[i2], (List) cm2.s(t, iM & 1048575), mi2Var, true);
                    break;
                case 40:
                    fl2.o(this.f7955c[i2], (List) cm2.s(t, iM & 1048575), mi2Var, true);
                    break;
                case 41:
                    fl2.t(this.f7955c[i2], (List) cm2.s(t, iM & 1048575), mi2Var, true);
                    break;
                case 42:
                    fl2.w(this.f7955c[i2], (List) cm2.s(t, iM & 1048575), mi2Var, true);
                    break;
                case 43:
                    fl2.r(this.f7955c[i2], (List) cm2.s(t, iM & 1048575), mi2Var, true);
                    break;
                case 44:
                    fl2.v(this.f7955c[i2], (List) cm2.s(t, iM & 1048575), mi2Var, true);
                    break;
                case 45:
                    fl2.u(this.f7955c[i2], (List) cm2.s(t, iM & 1048575), mi2Var, true);
                    break;
                case 46:
                    fl2.p(this.f7955c[i2], (List) cm2.s(t, iM & 1048575), mi2Var, true);
                    break;
                case 47:
                    fl2.s(this.f7955c[i2], (List) cm2.s(t, iM & 1048575), mi2Var, true);
                    break;
                case SyslogConstants.LOG_LPR /* 48 */:
                    fl2.n(this.f7955c[i2], (List) cm2.s(t, iM & 1048575), mi2Var, true);
                    break;
                case 49:
                    fl2.B(this.f7955c[i2], (List) cm2.s(t, iM & 1048575), mi2Var, T(i2));
                    break;
                case 50:
                    F(mi2Var, i3, cm2.s(t, iM & 1048575), i2);
                    break;
                case 51:
                    if (z(t, i3, i2)) {
                        mi2Var.q(i3, q(t, iM & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (z(t, i3, i2)) {
                        mi2Var.p(i3, r(t, iM & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (z(t, i3, i2)) {
                        mi2Var.n(i3, t(t, iM & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (z(t, i3, i2)) {
                        mi2Var.s(i3, t(t, iM & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (z(t, i3, i2)) {
                        mi2Var.t(i3, s(t, iM & 1048575));
                        break;
                    } else {
                        break;
                    }
                case SyslogConstants.LOG_NEWS /* 56 */:
                    if (z(t, i3, i2)) {
                        mi2Var.u(i3, t(t, iM & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (z(t, i3, i2)) {
                        mi2Var.v(i3, s(t, iM & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (z(t, i3, i2)) {
                        mi2Var.w(i3, u(t, iM & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (z(t, i3, i2)) {
                        G(i3, cm2.s(t, iM & 1048575), mi2Var);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (z(t, i3, i2)) {
                        mi2Var.C(i3, cm2.s(t, iM & 1048575), T(i2));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (z(t, i3, i2)) {
                        mi2Var.y(i3, (ci2) cm2.s(t, iM & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (z(t, i3, i2)) {
                        mi2Var.z(i3, s(t, iM & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (z(t, i3, i2)) {
                        mi2Var.r(i3, s(t, iM & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (z(t, i3, i2)) {
                        mi2Var.m(i3, s(t, iM & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (z(t, i3, i2)) {
                        mi2Var.o(i3, t(t, iM & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (z(t, i3, i2)) {
                        mi2Var.A(i3, s(t, iM & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (z(t, i3, i2)) {
                        mi2Var.B(i3, t(t, iM & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (z(t, i3, i2)) {
                        mi2Var.D(i3, cm2.s(t, iM & 1048575), T(i2));
                        break;
                    } else {
                        break;
                    }
            }
        }
        rl2<?, ?> rl2Var = this.o;
        rl2Var.r(rl2Var.j(t), mi2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0  */
    @Override // com.google.android.gms.internal.ads.dl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(T r19) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ok2.i(java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.ads.dl2
    public final void j(T t) {
        int i2;
        int i3 = this.f7964l;
        while (true) {
            i2 = this.f7965m;
            if (i3 >= i2) {
                break;
            }
            long jM = m(this.f7963k[i3]) & 1048575;
            Object objS = cm2.s(t, jM);
            if (objS != null) {
                ((fk2) objS).e();
                cm2.t(t, jM, objS);
            }
            i3++;
        }
        int length = this.f7963k.length;
        while (i2 < length) {
            this.n.b(t, this.f7963k[i2]);
            i2++;
        }
        this.o.m(t);
        if (this.f7960h) {
            this.p.d(t);
        }
    }

    @Override // com.google.android.gms.internal.ads.dl2
    public final void k(T t, byte[] bArr, int i2, int i3, oh2 oh2Var) throws qj2 {
        if (this.f7962j) {
            W(t, bArr, i2, i3, oh2Var);
        } else {
            I(t, bArr, i2, i3, 0, oh2Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.dl2
    public final T zza() {
        return (T) ((ej2) this.f7959g).C(4, null, null);
    }
}