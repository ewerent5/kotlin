package i.y.d;

import java.util.List;

/* compiled from: TypeIntrinsics.java */
/* loaded from: classes3.dex */
public class y {
    public static List a(Object obj) {
        if (obj instanceof i.y.d.z.a) {
            h(obj, "kotlin.collections.MutableList");
        }
        return c(obj);
    }

    public static Object b(Object obj, int i2) {
        if (obj != null && !e(obj, i2)) {
            h(obj, "kotlin.jvm.functions.Function" + i2);
        }
        return obj;
    }

    public static List c(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e2) {
            throw g(e2);
        }
    }

    public static int d(Object obj) {
        if (obj instanceof h) {
            return ((h) obj).getArity();
        }
        if (obj instanceof i.y.c.a) {
            return 0;
        }
        if (obj instanceof i.y.c.l) {
            return 1;
        }
        if (obj instanceof i.y.c.p) {
            return 2;
        }
        if (obj instanceof i.y.c.q) {
            return 3;
        }
        if (obj instanceof i.y.c.r) {
            return 4;
        }
        if (obj instanceof i.y.c.s) {
            return 5;
        }
        if (obj instanceof i.y.c.t) {
            return 6;
        }
        if (obj instanceof i.y.c.u) {
            return 7;
        }
        if (obj instanceof i.y.c.v) {
            return 8;
        }
        if (obj instanceof i.y.c.w) {
            return 9;
        }
        if (obj instanceof i.y.c.b) {
            return 10;
        }
        if (obj instanceof i.y.c.c) {
            return 11;
        }
        if (obj instanceof i.y.c.d) {
            return 12;
        }
        if (obj instanceof i.y.c.e) {
            return 13;
        }
        if (obj instanceof i.y.c.f) {
            return 14;
        }
        if (obj instanceof i.y.c.g) {
            return 15;
        }
        if (obj instanceof i.y.c.h) {
            return 16;
        }
        if (obj instanceof i.y.c.i) {
            return 17;
        }
        if (obj instanceof i.y.c.j) {
            return 18;
        }
        if (obj instanceof i.y.c.k) {
            return 19;
        }
        if (obj instanceof i.y.c.m) {
            return 20;
        }
        if (obj instanceof i.y.c.n) {
            return 21;
        }
        return obj instanceof i.y.c.o ? 22 : -1;
    }

    public static boolean e(Object obj, int i2) {
        return (obj instanceof i.c) && d(obj) == i2;
    }

    private static <T extends Throwable> T f(T t) {
        return (T) l.h(t, y.class.getName());
    }

    public static ClassCastException g(ClassCastException classCastException) {
        throw ((ClassCastException) f(classCastException));
    }

    public static void h(Object obj, String str) {
        i((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    public static void i(String str) {
        throw g(new ClassCastException(str));
    }
}