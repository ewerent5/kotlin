package e.c.b.b.c.e;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
final class d6 {
    private static final Class<?> a = a("libcore.io.Memory");

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f14461b;

    static {
        f14461b = a("org.robolectric.Robolectric") != null;
    }

    private static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean b() {
        return (a == null || f14461b) ? false : true;
    }

    static Class<?> c() {
        return a;
    }
}