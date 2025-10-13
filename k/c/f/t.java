package k.c.f;

import android.graphics.Rect;

/* compiled from: TileSystem.java */
/* loaded from: classes3.dex */
public abstract class t {
    private static int a = 256;

    /* renamed from: b, reason: collision with root package name */
    private static int f16770b = 29;

    public static double A(double d2) {
        return e(d2 - k(d2));
    }

    public static int B() {
        return a;
    }

    public static void J(int i2) {
        f16770b = Math.min(29, (63 - ((int) ((Math.log(i2) / Math.log(2.0d)) + 0.5d))) - 1);
        a = i2;
    }

    public static int M(long j2) {
        return (int) Math.max(Math.min(j2, 2147483647L), -2147483648L);
    }

    private static double N(double d2, double d3, double d4, double d5) {
        if (d3 > d4) {
            throw new IllegalArgumentException("minValue must be smaller than maxValue: " + d3 + ">" + d4);
        }
        if (d5 <= (d4 - d3) + 1.0d) {
            while (d2 < d3) {
                d2 += d5;
            }
            while (d2 > d4) {
                d2 -= d5;
            }
            return d2;
        }
        throw new IllegalArgumentException("interval must be equal or smaller than maxValue-minValue: min: " + d3 + " max:" + d4 + " int:" + d5);
    }

    public static double a(double d2, double d3, double d4) {
        return Math.min(Math.max(d2, d3), d4);
    }

    public static long b(double d2, double d3, boolean z) {
        long jC = o.c(d2);
        if (!z) {
            return jC;
        }
        if (jC <= 0) {
            return 0L;
        }
        return ((double) jC) >= d3 ? o.c(d3 - 1.0d) : jC;
    }

    public static double c(double d2, double d3) {
        return d(N(d2, -90.0d, 90.0d, 180.0d), e(d3));
    }

    public static double d(double d2, double d3) {
        return (((Math.cos((a(d2, -90.0d, 90.0d) * 3.141592653589793d) / 180.0d) * 2.0d) * 3.141592653589793d) * 6378137.0d) / d3;
    }

    public static double e(double d2) {
        return B() * i(d2);
    }

    public static double i(double d2) {
        return Math.pow(2.0d, d2);
    }

    public static int k(double d2) {
        return o.b(d2);
    }

    public static int r() {
        return f16770b;
    }

    public static long s(int i2, double d2) {
        return Math.round(i2 * d2);
    }

    public static int y(long j2, double d2) {
        return o.b(j2 / d2);
    }

    public static Rect z(r rVar, double d2, Rect rect) {
        if (rect == null) {
            rect = new Rect();
        }
        rect.left = y(rVar.a, d2);
        rect.top = y(rVar.f16764b, d2);
        rect.right = y(rVar.f16765c, d2);
        rect.bottom = y(rVar.f16766d, d2);
        return rect;
    }

    public abstract double C(double d2);

    public double D(double d2, boolean z) {
        if (z) {
            d2 = a(d2, x(), q());
        }
        double dC = C(d2);
        return z ? a(dC, 0.0d, 1.0d) : dC;
    }

    public double E(long j2, double d2, boolean z) {
        double d3 = j2;
        return z ? a(d3 / d2, 0.0d, 1.0d) : d3 / d2;
    }

    public abstract double F(double d2);

    public double G(double d2, boolean z) {
        if (z) {
            d2 = a(d2, w(), p());
        }
        double dF = F(d2);
        return z ? a(dF, 0.0d, 1.0d) : dF;
    }

    public boolean H(double d2) {
        return d2 >= w() && d2 <= p();
    }

    public boolean I(double d2) {
        return d2 >= x() && d2 <= q();
    }

    public String K() {
        return "[" + w() + "," + p() + "]";
    }

    public String L() {
        return "[" + x() + "," + q() + "]";
    }

    public double f(double d2) {
        return a(d2, w(), p());
    }

    public double g(double d2) {
        while (d2 < -180.0d) {
            d2 += 360.0d;
        }
        double d3 = d2;
        while (d3 > 180.0d) {
            d3 -= 360.0d;
        }
        return a(d3, x(), q());
    }

    public long h(long j2, double d2, boolean z) {
        return b(z ? N(j2, 0.0d, d2, d2) : j2, d2, z);
    }

    public e j(long j2, long j3, double d2, e eVar, boolean z, boolean z2) {
        if (eVar == null) {
            eVar = new e(0.0d, 0.0d);
        }
        eVar.i(m(E(j3, d2, z2), z2));
        eVar.j(o(E(j2, d2, z), z));
        return eVar;
    }

    public abstract double l(double d2);

    public double m(double d2, boolean z) {
        if (z) {
            d2 = a(d2, 0.0d, 1.0d);
        }
        double dL = l(d2);
        return z ? a(dL, w(), p()) : dL;
    }

    public abstract double n(double d2);

    public double o(double d2, boolean z) {
        if (z) {
            d2 = a(d2, 0.0d, 1.0d);
        }
        double dN = n(d2);
        return z ? a(dN, x(), q()) : dN;
    }

    public abstract double p();

    public abstract double q();

    public long t(double d2, double d3, boolean z) {
        return b(d2 * d3, d3, z);
    }

    public long u(double d2, double d3, boolean z) {
        return t(D(d2, z), d3, z);
    }

    public long v(double d2, double d3, boolean z) {
        return t(G(d2, z), d3, z);
    }

    public abstract double w();

    public abstract double x();
}