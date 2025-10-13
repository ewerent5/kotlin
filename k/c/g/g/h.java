package k.c.g.g;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import k.c.e.k;
import k.c.e.l;
import k.c.f.m;
import k.c.f.r;
import k.c.f.s;
import k.c.f.t;

/* compiled from: TilesOverlay.java */
/* loaded from: classes3.dex */
public class h extends e {

    /* renamed from: f, reason: collision with root package name */
    public static final int f16896f = e.e();

    /* renamed from: g, reason: collision with root package name */
    public static final int f16897g = e.f(k.c.e.n.f.b().size());

    /* renamed from: h, reason: collision with root package name */
    public static final int f16898h = e.e();

    /* renamed from: i, reason: collision with root package name */
    public static final int f16899i = e.e();

    /* renamed from: j, reason: collision with root package name */
    public static final int f16900j = e.e();

    /* renamed from: k, reason: collision with root package name */
    static final float[] f16901k;

    /* renamed from: l, reason: collision with root package name */
    public static final ColorFilter f16902l;
    private Rect E;

    /* renamed from: m, reason: collision with root package name */
    private Context f16903m;
    protected final k.c.e.h n;
    protected k.c.g.f s;
    protected Drawable o = null;
    protected final Paint p = new Paint();
    private final Rect q = new Rect();
    protected final r r = new r();
    private boolean t = true;
    private BitmapDrawable u = null;
    private int v = Color.rgb(216, 208, 208);
    private int w = Color.rgb(200, 192, 192);
    private boolean x = true;
    private boolean y = true;
    private ColorFilter z = null;
    private final Rect A = new Rect();
    private final l B = new l();
    private final a C = new a();
    private final Rect D = new Rect();

    /* compiled from: TilesOverlay.java */
    protected class a extends s {

        /* renamed from: e, reason: collision with root package name */
        private Canvas f16904e;

        public a() {
        }

        @Override // k.c.f.s
        public void a() {
            h.this.B.a();
        }

        @Override // k.c.f.s
        public void b(long j2, int i2, int i3) {
            Drawable drawableK = h.this.n.k(j2);
            h.this.B.b(drawableK);
            if (this.f16904e == null) {
                return;
            }
            boolean z = drawableK instanceof k;
            k kVar = z ? (k) drawableK : null;
            if (drawableK == null) {
                drawableK = h.this.B();
            }
            if (drawableK != null) {
                h hVar = h.this;
                hVar.s.y(i2, i3, hVar.q);
                if (z) {
                    kVar.c();
                }
                if (z) {
                    try {
                        if (!kVar.e()) {
                            drawableK = h.this.B();
                            z = false;
                        }
                    } finally {
                        if (z) {
                            kVar.d();
                        }
                    }
                }
                h hVar2 = h.this;
                hVar2.F(this.f16904e, drawableK, hVar2.q);
            }
            if (k.c.b.a.a().l()) {
                h hVar3 = h.this;
                hVar3.s.y(i2, i3, hVar3.q);
                this.f16904e.drawText(m.h(j2), h.this.q.left + 1, h.this.q.top + h.this.p.getTextSize(), h.this.p);
                this.f16904e.drawLine(h.this.q.left, h.this.q.top, h.this.q.right, h.this.q.top, h.this.p);
                this.f16904e.drawLine(h.this.q.left, h.this.q.top, h.this.q.left, h.this.q.bottom, h.this.p);
            }
        }

        @Override // k.c.f.s
        public void c() {
            Rect rect = this.a;
            h.this.n.j((((rect.bottom - rect.top) + 1) * ((rect.right - rect.left) + 1)) + k.c.b.a.a().v());
            h.this.B.c();
            super.c();
        }

        public void g(double d2, r rVar, Canvas canvas) {
            this.f16904e = canvas;
            d(d2, rVar);
        }
    }

    static {
        float[] fArr = {-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        f16901k = fArr;
        f16902l = new ColorMatrixColorFilter(fArr);
    }

    public h(k.c.e.h hVar, Context context, boolean z, boolean z2) {
        this.f16903m = context;
        if (hVar == null) {
            throw new IllegalArgumentException("You must pass a valid tile provider to the tiles overlay.");
        }
        this.n = hVar;
        H(z);
        L(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Drawable B() {
        Drawable drawable = this.o;
        if (drawable != null) {
            return drawable;
        }
        if (this.u == null && this.v != 0) {
            try {
                int iA = this.n.p() != null ? this.n.p().a() : 256;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iA, iA, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                Paint paint = new Paint();
                canvas.drawColor(this.v);
                paint.setColor(this.w);
                paint.setStrokeWidth(0.0f);
                int i2 = iA / 16;
                for (int i3 = 0; i3 < iA; i3 += i2) {
                    float f2 = i3;
                    float f3 = iA;
                    canvas.drawLine(0.0f, f2, f3, f2, paint);
                    canvas.drawLine(f2, 0.0f, f2, f3, paint);
                }
                this.u = new BitmapDrawable(bitmapCreateBitmap);
            } catch (NullPointerException unused) {
                Log.e("OsmDroid", "NullPointerException getting loading tile");
                System.gc();
            } catch (OutOfMemoryError unused2) {
                Log.e("OsmDroid", "OutOfMemoryError getting loading tile");
                System.gc();
            }
        }
        return this.u;
    }

    private void y() {
        BitmapDrawable bitmapDrawable = this.u;
        this.u = null;
        k.c.e.a.d().c(bitmapDrawable);
    }

    protected Rect A() {
        return this.E;
    }

    public int C() {
        return this.n.l();
    }

    public int D() {
        return this.n.m();
    }

    protected k.c.g.f E() {
        return this.s;
    }

    protected void F(Canvas canvas, Drawable drawable, Rect rect) {
        drawable.setColorFilter(this.z);
        drawable.setBounds(rect.left, rect.top, rect.right, rect.bottom);
        Rect rectA = A();
        if (rectA == null) {
            drawable.draw(canvas);
        } else if (this.D.setIntersect(canvas.getClipBounds(), rectA)) {
            canvas.save();
            canvas.clipRect(this.D);
            drawable.draw(canvas);
            canvas.restore();
        }
    }

    public void G(Canvas canvas, k.c.g.f fVar) {
        if (M(canvas, fVar)) {
            t.z(this.r, t.A(this.s.C()), this.A);
            this.n.n().f().E(t.k(this.s.C()), this.A);
            this.n.n().k();
        }
    }

    public void H(boolean z) {
        this.x = z;
        this.C.e(z);
    }

    public void I(int i2) {
        if (this.v != i2) {
            this.v = i2;
            y();
        }
    }

    protected void J(k.c.g.f fVar) {
        this.s = fVar;
    }

    public void K(boolean z) {
        this.n.v(z);
    }

    public void L(boolean z) {
        this.y = z;
        this.C.f(z);
    }

    protected boolean M(Canvas canvas, k.c.g.f fVar) {
        J(fVar);
        E().u(this.r);
        return true;
    }

    @Override // k.c.g.g.e
    public void c(Canvas canvas, k.c.g.f fVar) {
        if (k.c.b.a.a().l()) {
            Log.d("OsmDroid", "onDraw");
        }
        if (M(canvas, fVar)) {
            z(canvas, E(), E().C(), this.r);
        }
    }

    @Override // k.c.g.g.e
    public void h(k.c.g.d dVar) {
        this.n.i();
        this.f16903m = null;
        k.c.e.a.d().c(this.u);
        this.u = null;
        k.c.e.a.d().c(this.o);
        this.o = null;
    }

    public void z(Canvas canvas, k.c.g.f fVar, double d2, r rVar) {
        this.s = fVar;
        this.C.g(d2, rVar, canvas);
    }
}