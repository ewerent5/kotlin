package k.c.f;

import android.graphics.Rect;

/* compiled from: RectL.java */
/* loaded from: classes3.dex */
public class r {
    public long a;

    /* renamed from: b, reason: collision with root package name */
    public long f16764b;

    /* renamed from: c, reason: collision with root package name */
    public long f16765c;

    /* renamed from: d, reason: collision with root package name */
    public long f16766d;

    public r() {
    }

    public static Rect a(Rect rect, int i2, int i3, double d2, Rect rect2) {
        Rect rect3 = rect2 != null ? rect2 : new Rect();
        if (d2 == 0.0d) {
            rect3.top = rect.top;
            rect3.left = rect.left;
            rect3.bottom = rect.bottom;
            rect3.right = rect.right;
            return rect3;
        }
        double d3 = (3.141592653589793d * d2) / 180.0d;
        double dCos = Math.cos(d3);
        double dSin = Math.sin(d3);
        long j2 = rect.left;
        long j3 = rect.top;
        long j4 = i2;
        long j5 = i3;
        int iB = (int) b(j2, j3, j4, j5, dCos, dSin);
        int iC = (int) c(j2, j3, j4, j5, dCos, dSin);
        rect3.bottom = iC;
        rect3.top = iC;
        rect3.right = iB;
        rect3.left = iB;
        long j6 = rect.right;
        long j7 = rect.top;
        int iB2 = (int) b(j6, j7, j4, j5, dCos, dSin);
        int iC2 = (int) c(j6, j7, j4, j5, dCos, dSin);
        if (rect3.top > iC2) {
            rect3.top = iC2;
        }
        if (rect3.bottom < iC2) {
            rect3.bottom = iC2;
        }
        if (rect3.left > iB2) {
            rect3.left = iB2;
        }
        if (rect3.right < iB2) {
            rect3.right = iB2;
        }
        long j8 = rect.right;
        long j9 = rect.bottom;
        int iB3 = (int) b(j8, j9, j4, j5, dCos, dSin);
        int iC3 = (int) c(j8, j9, j4, j5, dCos, dSin);
        if (rect3.top > iC3) {
            rect3.top = iC3;
        }
        if (rect3.bottom < iC3) {
            rect3.bottom = iC3;
        }
        if (rect3.left > iB3) {
            rect3.left = iB3;
        }
        if (rect3.right < iB3) {
            rect3.right = iB3;
        }
        long j10 = rect.left;
        long j11 = rect.bottom;
        int iB4 = (int) b(j10, j11, j4, j5, dCos, dSin);
        int iC4 = (int) c(j10, j11, j4, j5, dCos, dSin);
        if (rect3.top > iC4) {
            rect3.top = iC4;
        }
        if (rect3.bottom < iC4) {
            rect3.bottom = iC4;
        }
        if (rect3.left > iB4) {
            rect3.left = iB4;
        }
        if (rect3.right < iB4) {
            rect3.right = iB4;
        }
        return rect3;
    }

    public static long b(long j2, long j3, long j4, long j5, double d2, double d3) {
        return j4 + Math.round(((j2 - j4) * d2) - ((j3 - j5) * d3));
    }

    public static long c(long j2, long j3, long j4, long j5, double d2, double d3) {
        return j5 + Math.round(((j2 - j4) * d3) + ((j3 - j5) * d2));
    }

    public void d(long j2, long j3, long j4, long j5) {
        this.a = j2;
        this.f16764b = j3;
        this.f16765c = j4;
        this.f16766d = j5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        return this.a == rVar.a && this.f16764b == rVar.f16764b && this.f16765c == rVar.f16765c && this.f16766d == rVar.f16766d;
    }

    public int hashCode() {
        return (int) (((((((this.a * 31) + this.f16764b) * 31) + this.f16765c) * 31) + this.f16766d) % 2147483647L);
    }

    public String toString() {
        return "RectL(" + this.a + ", " + this.f16764b + " - " + this.f16765c + ", " + this.f16766d + ")";
    }

    public r(long j2, long j3, long j4, long j5) {
        d(j2, j3, j4, j5);
    }
}