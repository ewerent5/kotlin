package i.y.d;

import java.util.Arrays;

/* compiled from: Intrinsics.java */
/* loaded from: classes3.dex */
public class l {
    private l() {
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void b(Object obj) {
        if (obj == null) {
            j();
        }
    }

    public static void c(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) g(new NullPointerException(str + " must not be null")));
    }

    public static void d(Object obj, String str) {
        if (obj == null) {
            k(str);
        }
    }

    public static int e(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }

    private static String f(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    private static <T extends Throwable> T g(T t) {
        return (T) h(t, l.class.getName());
    }

    static <T extends Throwable> T h(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
        return t;
    }

    public static String i(String str, Object obj) {
        return str + obj;
    }

    public static void j() {
        throw ((NullPointerException) g(new NullPointerException()));
    }

    private static void k(String str) {
        throw ((NullPointerException) g(new NullPointerException(f(str))));
    }

    public static void l(String str) {
        throw ((i.r) g(new i.r(str)));
    }

    public static void m(String str) {
        l("lateinit property " + str + " has not been initialized");
    }
}