package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class fl2 {
    private static final Class<?> a;

    /* renamed from: b, reason: collision with root package name */
    private static final rl2<?, ?> f5891b;

    /* renamed from: c, reason: collision with root package name */
    private static final rl2<?, ?> f5892c;

    /* renamed from: d, reason: collision with root package name */
    private static final rl2<?, ?> f5893d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        f5891b = C(false);
        f5892c = C(true);
        f5893d = new tl2();
    }

    public static void A(Class<?> cls) {
        Class<?> cls2;
        if (!ej2.class.isAssignableFrom(cls) && (cls2 = a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void B(int i2, List<?> list, mi2 mi2Var, dl2 dl2Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            mi2Var.D(i2, list.get(i3), dl2Var);
        }
    }

    private static rl2<?, ?> C(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (rl2) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    static int D(List<Long> list) {
        int iB;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ak2) {
            ak2 ak2Var = (ak2) list;
            iB = 0;
            while (i2 < size) {
                iB += li2.B(ak2Var.e(i2));
                i2++;
            }
        } else {
            iB = 0;
            while (i2 < size) {
                iB += li2.B(list.get(i2).longValue());
                i2++;
            }
        }
        return iB;
    }

    static int E(int i2, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return D(list) + (list.size() * li2.y(i2));
    }

    static int F(List<Long> list) {
        int iB;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ak2) {
            ak2 ak2Var = (ak2) list;
            iB = 0;
            while (i2 < size) {
                iB += li2.B(ak2Var.e(i2));
                i2++;
            }
        } else {
            iB = 0;
            while (i2 < size) {
                iB += li2.B(list.get(i2).longValue());
                i2++;
            }
        }
        return iB;
    }

    static int G(int i2, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return F(list) + (size * li2.y(i2));
    }

    static int H(List<Long> list) {
        int iB;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ak2) {
            ak2 ak2Var = (ak2) list;
            iB = 0;
            while (i2 < size) {
                long jE = ak2Var.e(i2);
                iB += li2.B((jE >> 63) ^ (jE + jE));
                i2++;
            }
        } else {
            iB = 0;
            while (i2 < size) {
                long jLongValue = list.get(i2).longValue();
                iB += li2.B((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i2++;
            }
        }
        return iB;
    }

    static int I(int i2, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return H(list) + (size * li2.y(i2));
    }

    static int J(List<Integer> list) {
        int iZ;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof fj2) {
            fj2 fj2Var = (fj2) list;
            iZ = 0;
            while (i2 < size) {
                iZ += li2.z(fj2Var.e(i2));
                i2++;
            }
        } else {
            iZ = 0;
            while (i2 < size) {
                iZ += li2.z(list.get(i2).intValue());
                i2++;
            }
        }
        return iZ;
    }

    static int K(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return J(list) + (size * li2.y(i2));
    }

    static int L(List<Integer> list) {
        int iZ;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof fj2) {
            fj2 fj2Var = (fj2) list;
            iZ = 0;
            while (i2 < size) {
                iZ += li2.z(fj2Var.e(i2));
                i2++;
            }
        } else {
            iZ = 0;
            while (i2 < size) {
                iZ += li2.z(list.get(i2).intValue());
                i2++;
            }
        }
        return iZ;
    }

    static int M(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return L(list) + (size * li2.y(i2));
    }

    static int N(List<Integer> list) {
        int iA;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof fj2) {
            fj2 fj2Var = (fj2) list;
            iA = 0;
            while (i2 < size) {
                iA += li2.A(fj2Var.e(i2));
                i2++;
            }
        } else {
            iA = 0;
            while (i2 < size) {
                iA += li2.A(list.get(i2).intValue());
                i2++;
            }
        }
        return iA;
    }

    static int O(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return N(list) + (size * li2.y(i2));
    }

    static int P(List<Integer> list) {
        int iA;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof fj2) {
            fj2 fj2Var = (fj2) list;
            iA = 0;
            while (i2 < size) {
                int iE = fj2Var.e(i2);
                iA += li2.A((iE >> 31) ^ (iE + iE));
                i2++;
            }
        } else {
            iA = 0;
            while (i2 < size) {
                int iIntValue = list.get(i2).intValue();
                iA += li2.A((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i2++;
            }
        }
        return iA;
    }

    static int Q(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return P(list) + (size * li2.y(i2));
    }

    static int R(List<?> list) {
        return list.size() * 4;
    }

    static int S(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (li2.A(i2 << 3) + 4);
    }

    static int T(List<?> list) {
        return list.size() * 8;
    }

    static int U(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (li2.A(i2 << 3) + 8);
    }

    static int V(List<?> list) {
        return list.size();
    }

    static int W(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (li2.A(i2 << 3) + 1);
    }

    static int X(int i2, List<?> list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        int iY = li2.y(i2) * size;
        if (list instanceof uj2) {
            uj2 uj2Var = (uj2) list;
            while (i3 < size) {
                Object objW = uj2Var.W(i3);
                iY += objW instanceof ci2 ? li2.a((ci2) objW) : li2.C((String) objW);
                i3++;
            }
        } else {
            while (i3 < size) {
                Object obj = list.get(i3);
                iY += obj instanceof ci2 ? li2.a((ci2) obj) : li2.C((String) obj);
                i3++;
            }
        }
        return iY;
    }

    static int Y(int i2, Object obj, dl2 dl2Var) {
        if (!(obj instanceof sj2)) {
            return li2.A(i2 << 3) + li2.b((lk2) obj, dl2Var);
        }
        int iA = li2.A(i2 << 3);
        int iA2 = ((sj2) obj).a();
        return iA + li2.A(iA2) + iA2;
    }

    static int Z(int i2, List<?> list, dl2 dl2Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = li2.y(i2) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            iY += obj instanceof sj2 ? li2.D((sj2) obj) : li2.b((lk2) obj, dl2Var);
        }
        return iY;
    }

    public static rl2<?, ?> a() {
        return f5891b;
    }

    static int a0(int i2, List<ci2> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = size * li2.y(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            iY += li2.a(list.get(i3));
        }
        return iY;
    }

    public static rl2<?, ?> b() {
        return f5892c;
    }

    static int b0(int i2, List<lk2> list, dl2 dl2Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iE += li2.e(i2, list.get(i3), dl2Var);
        }
        return iE;
    }

    public static rl2<?, ?> c() {
        return f5893d;
    }

    static boolean d(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static <T, FT extends ui2<FT>> void e(ri2<FT> ri2Var, T t, T t2) {
        ri2Var.b(t2);
        throw null;
    }

    static <T, UT, UB> void f(rl2<UT, UB> rl2Var, T t, T t2) {
        rl2Var.i(t, rl2Var.o(rl2Var.j(t), rl2Var.j(t2)));
    }

    static <UT, UB> UB g(int i2, List<Integer> list, ij2 ij2Var, UB ub, rl2<UT, UB> rl2Var) {
        if (ij2Var == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                int iIntValue = list.get(i4).intValue();
                if (ij2Var.b(iIntValue)) {
                    if (i4 != i3) {
                        list.set(i3, Integer.valueOf(iIntValue));
                    }
                    i3++;
                } else {
                    ub = (UB) h(i2, iIntValue, ub, rl2Var);
                }
            }
            if (i3 != size) {
                list.subList(i3, size).clear();
                return ub;
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (!ij2Var.b(iIntValue2)) {
                    ub = (UB) h(i2, iIntValue2, ub, rl2Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    static <UT, UB> UB h(int i2, int i3, UB ub, rl2<UT, UB> rl2Var) {
        if (ub == null) {
            ub = rl2Var.g();
        }
        rl2Var.b(ub, i2, i3);
        return ub;
    }

    static <T> void i(gk2 gk2Var, T t, T t2, long j2) {
        cm2.t(t, j2, gk2.c(cm2.s(t, j2), cm2.s(t2, j2)));
    }

    public static void j(int i2, List<Double> list, mi2 mi2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        mi2Var.b(i2, list, z);
    }

    public static void k(int i2, List<Float> list, mi2 mi2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        mi2Var.a(i2, list, z);
    }

    public static void l(int i2, List<Long> list, mi2 mi2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        mi2Var.I(i2, list, z);
    }

    public static void m(int i2, List<Long> list, mi2 mi2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        mi2Var.J(i2, list, z);
    }

    public static void n(int i2, List<Long> list, mi2 mi2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        mi2Var.k(i2, list, z);
    }

    public static void o(int i2, List<Long> list, mi2 mi2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        mi2Var.K(i2, list, z);
    }

    public static void p(int i2, List<Long> list, mi2 mi2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        mi2Var.i(i2, list, z);
    }

    public static void q(int i2, List<Integer> list, mi2 mi2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        mi2Var.G(i2, list, z);
    }

    public static void r(int i2, List<Integer> list, mi2 mi2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        mi2Var.g(i2, list, z);
    }

    public static void s(int i2, List<Integer> list, mi2 mi2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        mi2Var.j(i2, list, z);
    }

    public static void t(int i2, List<Integer> list, mi2 mi2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        mi2Var.H(i2, list, z);
    }

    public static void u(int i2, List<Integer> list, mi2 mi2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        mi2Var.h(i2, list, z);
    }

    public static void v(int i2, List<Integer> list, mi2 mi2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        mi2Var.c(i2, list, z);
    }

    public static void w(int i2, List<Boolean> list, mi2 mi2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        mi2Var.d(i2, list, z);
    }

    public static void x(int i2, List<String> list, mi2 mi2Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        mi2Var.e(i2, list);
    }

    public static void y(int i2, List<ci2> list, mi2 mi2Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        mi2Var.f(i2, list);
    }

    public static void z(int i2, List<?> list, mi2 mi2Var, dl2 dl2Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            mi2Var.C(i2, list.get(i3), dl2Var);
        }
    }
}