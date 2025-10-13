package k.c.g;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import k.c.f.q;
import k.c.f.r;
import k.c.f.t;

/* compiled from: Projection.java */
/* loaded from: classes3.dex */
public class f implements k.c.a.d {
    private long a;

    /* renamed from: b, reason: collision with root package name */
    private long f16851b;

    /* renamed from: c, reason: collision with root package name */
    private long f16852c;

    /* renamed from: d, reason: collision with root package name */
    private long f16853d;

    /* renamed from: e, reason: collision with root package name */
    private final Matrix f16854e;

    /* renamed from: f, reason: collision with root package name */
    private final Matrix f16855f;

    /* renamed from: g, reason: collision with root package name */
    private final float[] f16856g;

    /* renamed from: h, reason: collision with root package name */
    private final k.c.f.a f16857h;

    /* renamed from: i, reason: collision with root package name */
    private final double f16858i;

    /* renamed from: j, reason: collision with root package name */
    private final Rect f16859j;

    /* renamed from: k, reason: collision with root package name */
    private final Rect f16860k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f16861l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f16862m;
    private final double n;
    private final double o;
    private final float p;
    private final k.c.f.e q;
    private final t r;
    private final int s;
    private final int t;

    f(d dVar) {
        this(dVar.getZoomLevelDouble(), dVar.r(null), dVar.getExpectedCenter(), dVar.getMapScrollX(), dVar.getMapScrollY(), dVar.getMapOrientation(), dVar.w(), dVar.z(), d.getTileSystem(), dVar.getMapCenterOffsetX(), dVar.getMapCenterOffsetY());
    }

    public static long B(long j2, long j3, double d2, int i2, int i3) {
        long j4;
        while (true) {
            j4 = j3 - j2;
            if (j4 >= 0) {
                break;
            }
            j3 = (long) (j3 + d2);
        }
        if (j4 >= i2 - (i3 * 2)) {
            long j5 = i3 - j2;
            if (j5 < 0) {
                return j5;
            }
            long j6 = (i2 - i3) - j3;
            if (j6 > 0) {
                return j6;
            }
            return 0L;
        }
        long j7 = j4 / 2;
        long j8 = i2 / 2;
        long j9 = (j8 - j7) - j2;
        if (j9 > 0) {
            return j9;
        }
        long j10 = (j8 + j7) - j3;
        if (j10 < 0) {
            return j10;
        }
        return 0L;
    }

    private void D() {
        f(z(), A(), this.q);
        float f2 = this.p;
        if (f2 == 0.0f || f2 == 180.0f) {
            Rect rect = this.f16859j;
            Rect rect2 = this.f16860k;
            rect.left = rect2.left;
            rect.top = rect2.top;
            rect.right = rect2.right;
            rect.bottom = rect2.bottom;
        } else {
            k.c.f.f.c(this.f16860k, z(), A(), this.p, this.f16859j);
        }
        Rect rect3 = this.f16859j;
        k.c.a.a aVarG = g(rect3.right, rect3.top, null, true);
        t tileSystem = d.getTileSystem();
        if (aVarG.b() > tileSystem.p()) {
            aVarG = new k.c.f.e(tileSystem.p(), aVarG.a());
        }
        if (aVarG.b() < tileSystem.w()) {
            aVarG = new k.c.f.e(tileSystem.w(), aVarG.a());
        }
        Rect rect4 = this.f16859j;
        k.c.a.a aVarG2 = g(rect4.left, rect4.bottom, null, true);
        if (aVarG2.b() > tileSystem.p()) {
            aVarG2 = new k.c.f.e(tileSystem.p(), aVarG2.a());
        }
        if (aVarG2.b() < tileSystem.w()) {
            aVarG2 = new k.c.f.e(tileSystem.w(), aVarG2.a());
        }
        this.f16857h.B(aVarG.b(), aVarG.a(), aVarG2.b(), aVarG2.a());
    }

    private Point d(int i2, int i3, Point point, Matrix matrix, boolean z) {
        if (point == null) {
            point = new Point();
        }
        if (z) {
            float[] fArr = this.f16856g;
            fArr[0] = i2;
            fArr[1] = i3;
            matrix.mapPoints(fArr);
            float[] fArr2 = this.f16856g;
            point.x = (int) fArr2[0];
            point.y = (int) fArr2[1];
        } else {
            point.x = i2;
            point.y = i3;
        }
        return point;
    }

    private long j(long j2, int i2, int i3, double d2) {
        long j3 = (i2 + i3) / 2;
        long j4 = i2;
        long j5 = 0;
        if (j2 < j4) {
            while (j2 < j4) {
                long j6 = j2;
                j2 = (long) (j2 + d2);
                j5 = j6;
            }
            return (j2 >= ((long) i3) && Math.abs(j3 - j2) >= Math.abs(j3 - j5)) ? j5 : j2;
        }
        while (j2 >= j4) {
            long j7 = j2;
            j2 = (long) (j2 - d2);
            j5 = j7;
        }
        return (j5 >= ((long) i3) && Math.abs(j3 - j2) < Math.abs(j3 - j5)) ? j2 : j5;
    }

    private long m(long j2, boolean z, long j3, int i2, int i3) {
        long j4 = j2 + j3;
        return z ? j(j4, i2, i3, this.n) : j4;
    }

    private long p(long j2, boolean z) {
        long j3 = this.a;
        Rect rect = this.f16860k;
        return m(j2, z, j3, rect.left, rect.right);
    }

    private long s(long j2, boolean z) {
        long j3 = this.f16851b;
        Rect rect = this.f16860k;
        return m(j2, z, j3, rect.top, rect.bottom);
    }

    public int A() {
        Rect rect = this.f16860k;
        return ((rect.bottom + rect.top) / 2) + this.t;
    }

    public double C() {
        return this.f16858i;
    }

    public void E(Canvas canvas, boolean z) {
        if (this.p != 0.0f || z) {
            canvas.restore();
        }
    }

    public Point F(int i2, int i3, Point point) {
        return d(i2, i3, point, this.f16854e, this.p != 0.0f);
    }

    public void G(Canvas canvas, boolean z, boolean z2) {
        if (this.p != 0.0f || z2) {
            canvas.save();
            canvas.concat(z ? this.f16854e : this.f16855f);
        }
    }

    boolean H(d dVar) {
        if (dVar.getMapScrollX() == this.f16852c && dVar.getMapScrollY() == this.f16853d) {
            return false;
        }
        dVar.K(this.f16852c, this.f16853d);
        return true;
    }

    public q I(int i2, int i3, q qVar) {
        if (qVar == null) {
            qVar = new q();
        }
        qVar.a = i(v(i2), this.f16861l);
        qVar.f16763b = i(w(i3), this.f16862m);
        return qVar;
    }

    public Point J(k.c.a.a aVar, Point point) {
        return K(aVar, point, false);
    }

    public Point K(k.c.a.a aVar, Point point, boolean z) {
        if (point == null) {
            point = new Point();
        }
        point.x = t.M(o(aVar.a(), z));
        point.y = t.M(r(aVar.b(), z));
        return point;
    }

    public Point L(int i2, int i3, Point point) {
        return d(i2, i3, point, this.f16855f, this.p != 0.0f);
    }

    void a(double d2, double d3, boolean z, int i2) {
        long jB;
        long jB2 = 0;
        if (z) {
            jB = B(q(d2), q(d3), this.n, this.f16860k.height(), i2);
        } else {
            jB = 0;
            jB2 = B(n(d2), n(d3), this.n, this.f16860k.width(), i2);
        }
        b(jB2, jB);
    }

    void b(long j2, long j3) {
        if (j2 == 0 && j3 == 0) {
            return;
        }
        this.a += j2;
        this.f16851b += j3;
        this.f16852c -= j2;
        this.f16853d -= j3;
        D();
    }

    public void c(k.c.a.a aVar, PointF pointF) {
        if (pointF == null || aVar == null) {
            return;
        }
        Point pointL = L((int) pointF.x, (int) pointF.y, null);
        Point pointJ = J(aVar, null);
        b(pointL.x - pointJ.x, pointL.y - pointJ.y);
    }

    public void e() {
    }

    public k.c.a.a f(int i2, int i3, k.c.f.e eVar) {
        return g(i2, i3, eVar, false);
    }

    public k.c.a.a g(int i2, int i3, k.c.f.e eVar, boolean z) {
        return this.r.j(i(v(i2), this.f16861l), i(w(i3), this.f16862m), this.n, eVar, this.f16861l || z, this.f16862m || z);
    }

    public k.c.f.a h() {
        return this.f16857h;
    }

    public long i(long j2, boolean z) {
        return this.r.h(j2, this.n, z);
    }

    public k.c.f.e k() {
        return this.q;
    }

    public Matrix l() {
        return this.f16855f;
    }

    public long n(double d2) {
        return p(this.r.u(d2, this.n, false), false);
    }

    public long o(double d2, boolean z) {
        return p(this.r.u(d2, this.n, this.f16861l || z), this.f16861l);
    }

    public long q(double d2) {
        return s(this.r.v(d2, this.n, false), false);
    }

    public long r(double d2, boolean z) {
        return s(this.r.v(d2, this.n, this.f16862m || z), this.f16862m);
    }

    public long t(int i2) {
        return t.s(i2, this.o);
    }

    public r u(r rVar) {
        if (rVar == null) {
            rVar = new r();
        }
        Rect rect = this.f16860k;
        int i2 = rect.left;
        float f2 = i2;
        int i3 = rect.right;
        float f3 = i3;
        int i4 = rect.top;
        float f4 = i4;
        int i5 = rect.bottom;
        float f5 = i5;
        if (this.p != 0.0f) {
            float[] fArr = {i2, i4, i3, i5, i2, i5, i3, i4};
            this.f16855f.mapPoints(fArr);
            for (int i6 = 0; i6 < 8; i6 += 2) {
                if (f2 > fArr[i6]) {
                    f2 = fArr[i6];
                }
                if (f3 < fArr[i6]) {
                    f3 = fArr[i6];
                }
                int i7 = i6 + 1;
                if (f4 > fArr[i7]) {
                    f4 = fArr[i7];
                }
                if (f5 < fArr[i7]) {
                    f5 = fArr[i7];
                }
            }
        }
        rVar.a = v((int) f2);
        rVar.f16764b = w((int) f4);
        rVar.f16765c = v((int) f3);
        rVar.f16766d = w((int) f5);
        return rVar;
    }

    public long v(int i2) {
        return i2 - this.a;
    }

    public long w(int i2) {
        return i2 - this.f16851b;
    }

    public float x() {
        return this.p;
    }

    public Rect y(int i2, int i3, Rect rect) {
        if (rect == null) {
            rect = new Rect();
        }
        rect.left = t.M(p(t(i2), false));
        rect.top = t.M(s(t(i3), false));
        rect.right = t.M(p(t(i2 + 1), false));
        rect.bottom = t.M(s(t(i3 + 1), false));
        return rect;
    }

    public int z() {
        Rect rect = this.f16860k;
        return ((rect.right + rect.left) / 2) + this.s;
    }

    public f(double d2, Rect rect, k.c.f.e eVar, long j2, long j3, float f2, boolean z, boolean z2, t tVar, int i2, int i3) {
        Matrix matrix = new Matrix();
        this.f16854e = matrix;
        Matrix matrix2 = new Matrix();
        this.f16855f = matrix2;
        this.f16856g = new float[2];
        this.f16857h = new k.c.f.a();
        this.f16859j = new Rect();
        this.q = new k.c.f.e(0.0d, 0.0d);
        this.s = i2;
        this.t = i3;
        this.f16858i = d2;
        this.f16861l = z;
        this.f16862m = z2;
        this.r = tVar;
        double dE = t.e(d2);
        this.n = dE;
        this.o = t.A(d2);
        this.f16860k = rect;
        k.c.f.e eVar2 = eVar != null ? eVar : new k.c.f.e(0.0d, 0.0d);
        this.f16852c = j2;
        this.f16853d = j3;
        this.a = (z() - this.f16852c) - tVar.u(eVar2.a(), dE, this.f16861l);
        this.f16851b = (A() - this.f16853d) - tVar.v(eVar2.b(), dE, this.f16862m);
        this.p = f2;
        matrix.preRotate(f2, z(), A());
        matrix.invert(matrix2);
        D();
    }
}