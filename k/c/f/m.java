package k.c.f;

/* compiled from: MapTileIndex.java */
/* loaded from: classes3.dex */
public class m {
    public static int a = 29;

    /* renamed from: b, reason: collision with root package name */
    private static int f16760b = 1 << 29;

    private static void a(int i2, int i3, int i4) {
        if (i2 < 0 || i2 > a) {
            f(i2, i2, "Zoom");
        }
        long j2 = 1 << i2;
        if (i3 < 0 || i3 >= j2) {
            f(i2, i3, "X");
        }
        if (i4 < 0 || i4 >= j2) {
            f(i2, i4, "Y");
        }
    }

    public static long b(int i2, int i3, int i4) {
        a(i2, i3, i4);
        long j2 = i2;
        int i5 = a;
        return (j2 << (i5 * 2)) + (i3 << i5) + i4;
    }

    public static int c(long j2) {
        return (int) ((j2 >> a) % f16760b);
    }

    public static int d(long j2) {
        return (int) (j2 % f16760b);
    }

    public static int e(long j2) {
        return (int) (j2 >> (a * 2));
    }

    private static void f(int i2, int i3, String str) {
        throw new IllegalArgumentException("MapTileIndex: " + str + " (" + i3 + ") is too big (zoom=" + i2 + ")");
    }

    public static String g(int i2, int i3, int i4) {
        return "/" + i2 + "/" + i3 + "/" + i4;
    }

    public static String h(long j2) {
        return g(e(j2), c(j2), d(j2));
    }
}