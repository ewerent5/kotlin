package k.c.f;

import android.graphics.Rect;

/* compiled from: GeometryMath.java */
/* loaded from: classes3.dex */
public class f {
    private static double a(double d2, double d3, double d4, double d5) {
        return Math.ceil(Math.max(Math.max(d2, d3), Math.max(d4, d5)));
    }

    private static double b(double d2, double d3, double d4, double d5) {
        return Math.floor(Math.min(Math.min(d2, d3), Math.min(d4, d5)));
    }

    public static final Rect c(Rect rect, int i2, int i3, float f2, Rect rect2) {
        float f3;
        Rect rect3;
        if (rect2 == null) {
            rect3 = new Rect();
            f3 = f2;
        } else {
            f3 = f2;
            rect3 = rect2;
        }
        double d2 = f3 * 0.017453292519943295d;
        double dSin = Math.sin(d2);
        double dCos = Math.cos(d2);
        int i4 = rect.left;
        double d3 = i4 - i2;
        int i5 = rect.top;
        double d4 = i5 - i3;
        double d5 = i2;
        double d6 = (d5 - (d3 * dCos)) + (d4 * dSin);
        double d7 = i3;
        double d8 = (d7 - (d3 * dSin)) - (d4 * dCos);
        int i6 = rect.right;
        double d9 = i6 - i2;
        double d10 = i5 - i3;
        double d11 = (d5 - (d9 * dCos)) + (d10 * dSin);
        double d12 = (d7 - (d9 * dSin)) - (d10 * dCos);
        double d13 = i4 - i2;
        int i7 = rect.bottom;
        double d14 = i7 - i3;
        double d15 = (d5 - (d13 * dCos)) + (d14 * dSin);
        double d16 = (d7 - (d13 * dSin)) - (d14 * dCos);
        double d17 = i6 - i2;
        double d18 = i7 - i3;
        double d19 = (d5 - (d17 * dCos)) + (d18 * dSin);
        double d20 = (d7 - (d17 * dSin)) - (d18 * dCos);
        rect3.left = o.b(b(d6, d11, d15, d19));
        rect3.top = o.b(b(d8, d12, d16, d20));
        rect3.right = o.b(a(d6, d11, d15, d19));
        rect3.bottom = o.b(a(d8, d12, d16, d20));
        return rect3;
    }
}