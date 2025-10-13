package e.c.b.b.c.e;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
final class u9 {
    private static final Class<?> a = F();

    /* renamed from: b, reason: collision with root package name */
    private static final ka<?, ?> f14874b = g(false);

    /* renamed from: c, reason: collision with root package name */
    private static final ka<?, ?> f14875c = g(true);

    /* renamed from: d, reason: collision with root package name */
    private static final ka<?, ?> f14876d = new ma();

    static int A(List<Long> list) {
        int iN0;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof o8) {
            o8 o8Var = (o8) list;
            iN0 = 0;
            while (i2 < size) {
                iN0 += y6.n0(o8Var.zzb(i2));
                i2++;
            }
        } else {
            iN0 = 0;
            while (i2 < size) {
                iN0 += y6.n0(list.get(i2).longValue());
                i2++;
            }
        }
        return iN0;
    }

    public static ka<?, ?> B() {
        return f14876d;
    }

    public static void C(int i2, List<Long> list, eb ebVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ebVar.m(i2, list, z);
    }

    static int D(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return E(list) + (size * y6.g0(i2));
    }

    static int E(List<Integer> list) {
        int iB0;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof s7) {
            s7 s7Var = (s7) list;
            iB0 = 0;
            while (i2 < size) {
                iB0 += y6.B0(s7Var.c(i2));
                i2++;
            }
        } else {
            iB0 = 0;
            while (i2 < size) {
                iB0 += y6.B0(list.get(i2).intValue());
                i2++;
            }
        }
        return iB0;
    }

    private static Class<?> F() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void G(int i2, List<Long> list, eb ebVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ebVar.B(i2, list, z);
    }

    static int H(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return I(list) + (size * y6.g0(i2));
    }

    static int I(List<Integer> list) {
        int iK0;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof s7) {
            s7 s7Var = (s7) list;
            iK0 = 0;
            while (i2 < size) {
                iK0 += y6.k0(s7Var.c(i2));
                i2++;
            }
        } else {
            iK0 = 0;
            while (i2 < size) {
                iK0 += y6.k0(list.get(i2).intValue());
                i2++;
            }
        }
        return iK0;
    }

    private static Class<?> J() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void K(int i2, List<Long> list, eb ebVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ebVar.A(i2, list, z);
    }

    static int L(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return M(list) + (size * y6.g0(i2));
    }

    static int M(List<Integer> list) {
        int iO0;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof s7) {
            s7 s7Var = (s7) list;
            iO0 = 0;
            while (i2 < size) {
                iO0 += y6.o0(s7Var.c(i2));
                i2++;
            }
        } else {
            iO0 = 0;
            while (i2 < size) {
                iO0 += y6.o0(list.get(i2).intValue());
                i2++;
            }
        }
        return iO0;
    }

    public static void N(int i2, List<Long> list, eb ebVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ebVar.y(i2, list, z);
    }

    static int O(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return P(list) + (size * y6.g0(i2));
    }

    static int P(List<Integer> list) {
        int iS0;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof s7) {
            s7 s7Var = (s7) list;
            iS0 = 0;
            while (i2 < size) {
                iS0 += y6.s0(s7Var.c(i2));
                i2++;
            }
        } else {
            iS0 = 0;
            while (i2 < size) {
                iS0 += y6.s0(list.get(i2).intValue());
                i2++;
            }
        }
        return iS0;
    }

    public static void Q(int i2, List<Long> list, eb ebVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ebVar.o(i2, list, z);
    }

    static int R(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * y6.x0(i2, 0);
    }

    static int S(List<?> list) {
        return list.size() << 2;
    }

    public static void T(int i2, List<Integer> list, eb ebVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ebVar.h(i2, list, z);
    }

    static int U(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * y6.q0(i2, 0L);
    }

    static int V(List<?> list) {
        return list.size() << 3;
    }

    public static void W(int i2, List<Integer> list, eb ebVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ebVar.s(i2, list, z);
    }

    static int X(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * y6.H(i2, true);
    }

    static int Y(List<?> list) {
        return list.size();
    }

    public static void Z(int i2, List<Integer> list, eb ebVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ebVar.C(i2, list, z);
    }

    static int a(int i2, Object obj, s9 s9Var) {
        return obj instanceof f8 ? y6.c(i2, (f8) obj) : y6.F(i2, (b9) obj, s9Var);
    }

    public static void a0(int i2, List<Integer> list, eb ebVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ebVar.r(i2, list, z);
    }

    static int b(int i2, List<?> list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        int iG0 = y6.g0(i2) * size;
        if (list instanceof h8) {
            h8 h8Var = (h8) list;
            while (i3 < size) {
                Object objZzb = h8Var.zzb(i3);
                iG0 += objZzb instanceof g6 ? y6.I((g6) objZzb) : y6.K((String) objZzb);
                i3++;
            }
        } else {
            while (i3 < size) {
                Object obj = list.get(i3);
                iG0 += obj instanceof g6 ? y6.I((g6) obj) : y6.K((String) obj);
                i3++;
            }
        }
        return iG0;
    }

    public static void b0(int i2, List<Integer> list, eb ebVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ebVar.t(i2, list, z);
    }

    static int c(int i2, List<?> list, s9 s9Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iG0 = y6.g0(i2) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            iG0 += obj instanceof f8 ? y6.d((f8) obj) : y6.e((b9) obj, s9Var);
        }
        return iG0;
    }

    public static void c0(int i2, List<Integer> list, eb ebVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ebVar.i(i2, list, z);
    }

    static int d(int i2, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return e(list) + (list.size() * y6.g0(i2));
    }

    public static void d0(int i2, List<Boolean> list, eb ebVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ebVar.d(i2, list, z);
    }

    static int e(List<Long> list) {
        int iD0;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof o8) {
            o8 o8Var = (o8) list;
            iD0 = 0;
            while (i2 < size) {
                iD0 += y6.d0(o8Var.zzb(i2));
                i2++;
            }
        } else {
            iD0 = 0;
            while (i2 < size) {
                iD0 += y6.d0(list.get(i2).longValue());
                i2++;
            }
        }
        return iD0;
    }

    public static ka<?, ?> f() {
        return f14874b;
    }

    private static ka<?, ?> g(boolean z) {
        try {
            Class<?> clsJ = J();
            if (clsJ == null) {
                return null;
            }
            return (ka) clsJ.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    static <UT, UB> UB h(int i2, int i3, UB ub, ka<UT, UB> kaVar) {
        if (ub == null) {
            ub = kaVar.a();
        }
        kaVar.b(ub, i2, i3);
        return ub;
    }

    static <UT, UB> UB i(int i2, List<Integer> list, w7 w7Var, UB ub, ka<UT, UB> kaVar) {
        if (w7Var == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                int iIntValue = list.get(i4).intValue();
                if (w7Var.b(iIntValue)) {
                    if (i4 != i3) {
                        list.set(i3, Integer.valueOf(iIntValue));
                    }
                    i3++;
                } else {
                    ub = (UB) h(i2, iIntValue, ub, kaVar);
                }
            }
            if (i3 != size) {
                list.subList(i3, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (!w7Var.b(iIntValue2)) {
                    ub = (UB) h(i2, iIntValue2, ub, kaVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    public static void j(int i2, List<String> list, eb ebVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ebVar.L(i2, list);
    }

    public static void k(int i2, List<?> list, eb ebVar, s9 s9Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ebVar.e(i2, list, s9Var);
    }

    public static void l(int i2, List<Double> list, eb ebVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ebVar.D(i2, list, z);
    }

    static <T, FT extends j7<FT>> void m(d7<FT> d7Var, T t, T t2) {
        h7<T> h7VarB = d7Var.b(t2);
        if (h7VarB.f14588b.isEmpty()) {
            return;
        }
        d7Var.f(t).f(h7VarB);
    }

    static <T> void n(u8 u8Var, T t, T t2, long j2) {
        qa.j(t, j2, u8Var.d(qa.F(t, j2), qa.F(t2, j2)));
    }

    static <T, UT, UB> void o(ka<UT, UB> kaVar, T t, T t2) {
        kaVar.e(t, kaVar.i(kaVar.f(t), kaVar.f(t2)));
    }

    public static void p(Class<?> cls) {
        Class<?> cls2;
        if (!o7.class.isAssignableFrom(cls) && (cls2 = a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean q(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int r(int i2, List<g6> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iG0 = size * y6.g0(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            iG0 += y6.I(list.get(i3));
        }
        return iG0;
    }

    static int s(int i2, List<b9> list, s9 s9Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iU = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iU += y6.U(i2, list.get(i3), s9Var);
        }
        return iU;
    }

    static int t(int i2, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return u(list) + (size * y6.g0(i2));
    }

    static int u(List<Long> list) {
        int iI0;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof o8) {
            o8 o8Var = (o8) list;
            iI0 = 0;
            while (i2 < size) {
                iI0 += y6.i0(o8Var.zzb(i2));
                i2++;
            }
        } else {
            iI0 = 0;
            while (i2 < size) {
                iI0 += y6.i0(list.get(i2).longValue());
                i2++;
            }
        }
        return iI0;
    }

    public static ka<?, ?> v() {
        return f14875c;
    }

    public static void w(int i2, List<g6> list, eb ebVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ebVar.E(i2, list);
    }

    public static void x(int i2, List<?> list, eb ebVar, s9 s9Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ebVar.u(i2, list, s9Var);
    }

    public static void y(int i2, List<Float> list, eb ebVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ebVar.H(i2, list, z);
    }

    static int z(int i2, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return A(list) + (size * y6.g0(i2));
    }
}