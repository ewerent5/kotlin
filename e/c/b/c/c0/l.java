package e.c.b.c.c0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;

/* compiled from: ShapeAppearancePathProvider.java */
/* loaded from: classes.dex */
public class l {
    private final m[] a = new m[4];

    /* renamed from: b, reason: collision with root package name */
    private final Matrix[] f15145b = new Matrix[4];

    /* renamed from: c, reason: collision with root package name */
    private final Matrix[] f15146c = new Matrix[4];

    /* renamed from: d, reason: collision with root package name */
    private final PointF f15147d = new PointF();

    /* renamed from: e, reason: collision with root package name */
    private final Path f15148e = new Path();

    /* renamed from: f, reason: collision with root package name */
    private final Path f15149f = new Path();

    /* renamed from: g, reason: collision with root package name */
    private final m f15150g = new m();

    /* renamed from: h, reason: collision with root package name */
    private final float[] f15151h = new float[2];

    /* renamed from: i, reason: collision with root package name */
    private final float[] f15152i = new float[2];

    /* renamed from: j, reason: collision with root package name */
    private final Path f15153j = new Path();

    /* renamed from: k, reason: collision with root package name */
    private final Path f15154k = new Path();

    /* renamed from: l, reason: collision with root package name */
    private boolean f15155l = true;

    /* compiled from: ShapeAppearancePathProvider.java */
    private static class a {
        static final l a = new l();
    }

    /* compiled from: ShapeAppearancePathProvider.java */
    public interface b {
        void a(m mVar, Matrix matrix, int i2);

        void b(m mVar, Matrix matrix, int i2);
    }

    /* compiled from: ShapeAppearancePathProvider.java */
    static final class c {
        public final k a;

        /* renamed from: b, reason: collision with root package name */
        public final Path f15156b;

        /* renamed from: c, reason: collision with root package name */
        public final RectF f15157c;

        /* renamed from: d, reason: collision with root package name */
        public final b f15158d;

        /* renamed from: e, reason: collision with root package name */
        public final float f15159e;

        c(k kVar, float f2, RectF rectF, b bVar, Path path) {
            this.f15158d = bVar;
            this.a = kVar;
            this.f15159e = f2;
            this.f15157c = rectF;
            this.f15156b = path;
        }
    }

    public l() {
        for (int i2 = 0; i2 < 4; i2++) {
            this.a[i2] = new m();
            this.f15145b[i2] = new Matrix();
            this.f15146c[i2] = new Matrix();
        }
    }

    private float a(int i2) {
        return (i2 + 1) * 90;
    }

    private void b(c cVar, int i2) {
        this.f15151h[0] = this.a[i2].k();
        this.f15151h[1] = this.a[i2].l();
        this.f15145b[i2].mapPoints(this.f15151h);
        if (i2 == 0) {
            Path path = cVar.f15156b;
            float[] fArr = this.f15151h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.f15156b;
            float[] fArr2 = this.f15151h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.a[i2].d(this.f15145b[i2], cVar.f15156b);
        b bVar = cVar.f15158d;
        if (bVar != null) {
            bVar.a(this.a[i2], this.f15145b[i2], i2);
        }
    }

    private void c(c cVar, int i2) {
        int i3 = (i2 + 1) % 4;
        this.f15151h[0] = this.a[i2].i();
        this.f15151h[1] = this.a[i2].j();
        this.f15145b[i2].mapPoints(this.f15151h);
        this.f15152i[0] = this.a[i3].k();
        this.f15152i[1] = this.a[i3].l();
        this.f15145b[i3].mapPoints(this.f15152i);
        float f2 = this.f15151h[0];
        float[] fArr = this.f15152i;
        float fMax = Math.max(((float) Math.hypot(f2 - fArr[0], r1[1] - fArr[1])) - 0.001f, 0.0f);
        float fI = i(cVar.f15157c, i2);
        this.f15150g.n(0.0f, 0.0f);
        f fVarJ = j(i2, cVar.a);
        fVarJ.b(fMax, fI, cVar.f15159e, this.f15150g);
        this.f15153j.reset();
        this.f15150g.d(this.f15146c[i2], this.f15153j);
        if (this.f15155l && Build.VERSION.SDK_INT >= 19 && (fVarJ.a() || l(this.f15153j, i2) || l(this.f15153j, i3))) {
            Path path = this.f15153j;
            path.op(path, this.f15149f, Path.Op.DIFFERENCE);
            this.f15151h[0] = this.f15150g.k();
            this.f15151h[1] = this.f15150g.l();
            this.f15146c[i2].mapPoints(this.f15151h);
            Path path2 = this.f15148e;
            float[] fArr2 = this.f15151h;
            path2.moveTo(fArr2[0], fArr2[1]);
            this.f15150g.d(this.f15146c[i2], this.f15148e);
        } else {
            this.f15150g.d(this.f15146c[i2], cVar.f15156b);
        }
        b bVar = cVar.f15158d;
        if (bVar != null) {
            bVar.b(this.f15150g, this.f15146c[i2], i2);
        }
    }

    private void f(int i2, RectF rectF, PointF pointF) {
        if (i2 == 1) {
            pointF.set(rectF.right, rectF.bottom);
            return;
        }
        if (i2 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i2 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    private e.c.b.c.c0.c g(int i2, k kVar) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? kVar.t() : kVar.r() : kVar.j() : kVar.l();
    }

    private d h(int i2, k kVar) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? kVar.s() : kVar.q() : kVar.i() : kVar.k();
    }

    private float i(RectF rectF, int i2) {
        float[] fArr = this.f15151h;
        m[] mVarArr = this.a;
        fArr[0] = mVarArr[i2].f15161c;
        fArr[1] = mVarArr[i2].f15162d;
        this.f15145b[i2].mapPoints(fArr);
        return (i2 == 1 || i2 == 3) ? Math.abs(rectF.centerX() - this.f15151h[0]) : Math.abs(rectF.centerY() - this.f15151h[1]);
    }

    private f j(int i2, k kVar) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? kVar.o() : kVar.p() : kVar.n() : kVar.h();
    }

    public static l k() {
        return a.a;
    }

    private boolean l(Path path, int i2) {
        this.f15154k.reset();
        this.a[i2].d(this.f15145b[i2], this.f15154k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f15154k.computeBounds(rectF, true);
        path.op(this.f15154k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    private void m(c cVar, int i2) {
        h(i2, cVar.a).b(this.a[i2], 90.0f, cVar.f15159e, cVar.f15157c, g(i2, cVar.a));
        float fA = a(i2);
        this.f15145b[i2].reset();
        f(i2, cVar.f15157c, this.f15147d);
        Matrix matrix = this.f15145b[i2];
        PointF pointF = this.f15147d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f15145b[i2].preRotate(fA);
    }

    private void n(int i2) {
        this.f15151h[0] = this.a[i2].i();
        this.f15151h[1] = this.a[i2].j();
        this.f15145b[i2].mapPoints(this.f15151h);
        float fA = a(i2);
        this.f15146c[i2].reset();
        Matrix matrix = this.f15146c[i2];
        float[] fArr = this.f15151h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f15146c[i2].preRotate(fA);
    }

    public void d(k kVar, float f2, RectF rectF, Path path) {
        e(kVar, f2, rectF, null, path);
    }

    public void e(k kVar, float f2, RectF rectF, b bVar, Path path) {
        path.rewind();
        this.f15148e.rewind();
        this.f15149f.rewind();
        this.f15149f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(kVar, f2, rectF, bVar, path);
        for (int i2 = 0; i2 < 4; i2++) {
            m(cVar, i2);
            n(i2);
        }
        for (int i3 = 0; i3 < 4; i3++) {
            b(cVar, i3);
            c(cVar, i3);
        }
        path.close();
        this.f15148e.close();
        if (Build.VERSION.SDK_INT < 19 || this.f15148e.isEmpty()) {
            return;
        }
        path.op(this.f15148e, Path.Op.UNION);
    }
}