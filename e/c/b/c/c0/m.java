package e.c.b.c.c0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: ShapePath.java */
/* loaded from: classes.dex */
public class m {

    @Deprecated
    public float a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public float f15160b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public float f15161c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public float f15162d;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public float f15163e;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public float f15164f;

    /* renamed from: g, reason: collision with root package name */
    private final List<f> f15165g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private final List<g> f15166h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private boolean f15167i;

    /* compiled from: ShapePath.java */
    class a extends g {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f15168b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Matrix f15169c;

        a(List list, Matrix matrix) {
            this.f15168b = list;
            this.f15169c = matrix;
        }

        @Override // e.c.b.c.c0.m.g
        public void a(Matrix matrix, e.c.b.c.b0.a aVar, int i2, Canvas canvas) {
            Iterator it = this.f15168b.iterator();
            while (it.hasNext()) {
                ((g) it.next()).a(this.f15169c, aVar, i2, canvas);
            }
        }
    }

    /* compiled from: ShapePath.java */
    static class b extends g {

        /* renamed from: b, reason: collision with root package name */
        private final d f15171b;

        public b(d dVar) {
            this.f15171b = dVar;
        }

        @Override // e.c.b.c.c0.m.g
        public void a(Matrix matrix, e.c.b.c.b0.a aVar, int i2, Canvas canvas) {
            aVar.a(canvas, matrix, new RectF(this.f15171b.k(), this.f15171b.o(), this.f15171b.l(), this.f15171b.j()), i2, this.f15171b.m(), this.f15171b.n());
        }
    }

    /* compiled from: ShapePath.java */
    static class c extends g {

        /* renamed from: b, reason: collision with root package name */
        private final e f15172b;

        /* renamed from: c, reason: collision with root package name */
        private final float f15173c;

        /* renamed from: d, reason: collision with root package name */
        private final float f15174d;

        public c(e eVar, float f2, float f3) {
            this.f15172b = eVar;
            this.f15173c = f2;
            this.f15174d = f3;
        }

        @Override // e.c.b.c.c0.m.g
        public void a(Matrix matrix, e.c.b.c.b0.a aVar, int i2, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f15172b.f15183c - this.f15174d, this.f15172b.f15182b - this.f15173c), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f15173c, this.f15174d);
            matrix2.preRotate(c());
            aVar.b(canvas, matrix2, rectF, i2);
        }

        float c() {
            return (float) Math.toDegrees(Math.atan((this.f15172b.f15183c - this.f15174d) / (this.f15172b.f15182b - this.f15173c)));
        }
    }

    /* compiled from: ShapePath.java */
    public static class d extends f {

        /* renamed from: b, reason: collision with root package name */
        private static final RectF f15175b = new RectF();

        /* renamed from: c, reason: collision with root package name */
        @Deprecated
        public float f15176c;

        /* renamed from: d, reason: collision with root package name */
        @Deprecated
        public float f15177d;

        /* renamed from: e, reason: collision with root package name */
        @Deprecated
        public float f15178e;

        /* renamed from: f, reason: collision with root package name */
        @Deprecated
        public float f15179f;

        /* renamed from: g, reason: collision with root package name */
        @Deprecated
        public float f15180g;

        /* renamed from: h, reason: collision with root package name */
        @Deprecated
        public float f15181h;

        public d(float f2, float f3, float f4, float f5) {
            q(f2);
            u(f3);
            r(f4);
            p(f5);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float j() {
            return this.f15179f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float k() {
            return this.f15176c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float l() {
            return this.f15178e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float m() {
            return this.f15180g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float n() {
            return this.f15181h;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float o() {
            return this.f15177d;
        }

        private void p(float f2) {
            this.f15179f = f2;
        }

        private void q(float f2) {
            this.f15176c = f2;
        }

        private void r(float f2) {
            this.f15178e = f2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(float f2) {
            this.f15180g = f2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t(float f2) {
            this.f15181h = f2;
        }

        private void u(float f2) {
            this.f15177d = f2;
        }

        @Override // e.c.b.c.c0.m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f15175b;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath.java */
    public static class e extends f {

        /* renamed from: b, reason: collision with root package name */
        private float f15182b;

        /* renamed from: c, reason: collision with root package name */
        private float f15183c;

        @Override // e.c.b.c.c0.m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f15182b, this.f15183c);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath.java */
    public static abstract class f {
        protected final Matrix a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* compiled from: ShapePath.java */
    static abstract class g {
        static final Matrix a = new Matrix();

        g() {
        }

        public abstract void a(Matrix matrix, e.c.b.c.b0.a aVar, int i2, Canvas canvas);

        public final void b(e.c.b.c.b0.a aVar, int i2, Canvas canvas) {
            a(a, aVar, i2, canvas);
        }
    }

    public m() {
        n(0.0f, 0.0f);
    }

    private void b(float f2) {
        if (g() == f2) {
            return;
        }
        float fG = ((f2 - g()) + 360.0f) % 360.0f;
        if (fG > 180.0f) {
            return;
        }
        d dVar = new d(i(), j(), i(), j());
        dVar.s(g());
        dVar.t(fG);
        this.f15166h.add(new b(dVar));
        p(f2);
    }

    private void c(g gVar, float f2, float f3) {
        b(f2);
        this.f15166h.add(gVar);
        p(f3);
    }

    private float g() {
        return this.f15163e;
    }

    private float h() {
        return this.f15164f;
    }

    private void p(float f2) {
        this.f15163e = f2;
    }

    private void q(float f2) {
        this.f15164f = f2;
    }

    private void r(float f2) {
        this.f15161c = f2;
    }

    private void s(float f2) {
        this.f15162d = f2;
    }

    private void t(float f2) {
        this.a = f2;
    }

    private void u(float f2) {
        this.f15160b = f2;
    }

    public void a(float f2, float f3, float f4, float f5, float f6, float f7) {
        d dVar = new d(f2, f3, f4, f5);
        dVar.s(f6);
        dVar.t(f7);
        this.f15165g.add(dVar);
        b bVar = new b(dVar);
        float f8 = f6 + f7;
        boolean z = f7 < 0.0f;
        if (z) {
            f6 = (f6 + 180.0f) % 360.0f;
        }
        c(bVar, f6, z ? (180.0f + f8) % 360.0f : f8);
        double d2 = f8;
        r(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.cos(Math.toRadians(d2)))));
        s(((f3 + f5) * 0.5f) + (((f5 - f3) / 2.0f) * ((float) Math.sin(Math.toRadians(d2)))));
    }

    public void d(Matrix matrix, Path path) {
        int size = this.f15165g.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f15165g.get(i2).a(matrix, path);
        }
    }

    boolean e() {
        return this.f15167i;
    }

    g f(Matrix matrix) {
        b(h());
        return new a(new ArrayList(this.f15166h), new Matrix(matrix));
    }

    float i() {
        return this.f15161c;
    }

    float j() {
        return this.f15162d;
    }

    float k() {
        return this.a;
    }

    float l() {
        return this.f15160b;
    }

    public void m(float f2, float f3) {
        e eVar = new e();
        eVar.f15182b = f2;
        eVar.f15183c = f3;
        this.f15165g.add(eVar);
        c cVar = new c(eVar, i(), j());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        r(f2);
        s(f3);
    }

    public void n(float f2, float f3) {
        o(f2, f3, 270.0f, 0.0f);
    }

    public void o(float f2, float f3, float f4, float f5) {
        t(f2);
        u(f3);
        r(f2);
        s(f3);
        p(f4);
        q((f4 + f5) % 360.0f);
        this.f15165g.clear();
        this.f15166h.clear();
        this.f15167i = false;
    }
}