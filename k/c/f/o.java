package k.c.f;

/* compiled from: MyMath.java */
/* loaded from: classes3.dex */
public class o {
    public static double a(double d2) {
        while (d2 < 0.0d) {
            d2 += 360.0d;
        }
        while (d2 >= 360.0d) {
            d2 -= 360.0d;
        }
        return d2;
    }

    public static int b(double d2) {
        int i2 = (int) d2;
        return ((double) i2) <= d2 ? i2 : i2 - 1;
    }

    public static long c(double d2) {
        long j2 = (long) d2;
        return ((double) j2) <= d2 ? j2 : j2 - 1;
    }

    public static double d(double d2, double d3, Boolean bool) {
        double dA = a(d3 - d2);
        return bool != null ? bool.booleanValue() ? dA : dA - 360.0d : dA < 180.0d ? dA : dA - 360.0d;
    }

    public static int e(float f2) {
        int i2 = 1;
        int i3 = 1;
        int i4 = 0;
        while (i2 <= f2) {
            i2 *= 2;
            i4 = i3;
            i3++;
        }
        return i4;
    }

    public static int f(int i2, int i3) {
        if (i2 > 0) {
            return i2 % i3;
        }
        while (i2 < 0) {
            i2 += i3;
        }
        return i2;
    }
}