package e.c.b.c.c0;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import e.c.b.c.c0.k;
import e.c.b.c.c0.l;
import e.c.b.c.c0.m;
import java.util.BitSet;

/* compiled from: MaterialShapeDrawable.java */
/* loaded from: classes.dex */
public class g extends Drawable implements androidx.core.graphics.drawable.b, n {

    /* renamed from: e, reason: collision with root package name */
    private static final String f15100e = g.class.getSimpleName();

    /* renamed from: f, reason: collision with root package name */
    private static final Paint f15101f = new Paint(1);
    private final RectF A;
    private boolean B;

    /* renamed from: g, reason: collision with root package name */
    private c f15102g;

    /* renamed from: h, reason: collision with root package name */
    private final m.g[] f15103h;

    /* renamed from: i, reason: collision with root package name */
    private final m.g[] f15104i;

    /* renamed from: j, reason: collision with root package name */
    private final BitSet f15105j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f15106k;

    /* renamed from: l, reason: collision with root package name */
    private final Matrix f15107l;

    /* renamed from: m, reason: collision with root package name */
    private final Path f15108m;
    private final Path n;
    private final RectF o;
    private final RectF p;
    private final Region q;
    private final Region r;
    private k s;
    private final Paint t;
    private final Paint u;
    private final e.c.b.c.b0.a v;
    private final l.b w;
    private final l x;
    private PorterDuffColorFilter y;
    private PorterDuffColorFilter z;

    /* compiled from: MaterialShapeDrawable.java */
    class a implements l.b {
        a() {
        }

        @Override // e.c.b.c.c0.l.b
        public void a(m mVar, Matrix matrix, int i2) {
            g.this.f15105j.set(i2, mVar.e());
            g.this.f15103h[i2] = mVar.f(matrix);
        }

        @Override // e.c.b.c.c0.l.b
        public void b(m mVar, Matrix matrix, int i2) {
            g.this.f15105j.set(i2 + 4, mVar.e());
            g.this.f15104i[i2] = mVar.f(matrix);
        }
    }

    /* compiled from: MaterialShapeDrawable.java */
    class b implements k.c {
        final /* synthetic */ float a;

        b(float f2) {
            this.a = f2;
        }

        @Override // e.c.b.c.c0.k.c
        public e.c.b.c.c0.c a(e.c.b.c.c0.c cVar) {
            return cVar instanceof i ? cVar : new e.c.b.c.c0.b(this.a, cVar);
        }
    }

    /* synthetic */ g(c cVar, a aVar) {
        this(cVar);
    }

    private float D() {
        if (L()) {
            return this.u.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private boolean J() {
        c cVar = this.f15102g;
        int i2 = cVar.q;
        return i2 != 1 && cVar.r > 0 && (i2 == 2 || T());
    }

    private boolean K() {
        Paint.Style style = this.f15102g.v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean L() {
        Paint.Style style = this.f15102g.v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.u.getStrokeWidth() > 0.0f;
    }

    private void N() {
        super.invalidateSelf();
    }

    private void Q(Canvas canvas) {
        if (J()) {
            canvas.save();
            S(canvas);
            if (!this.B) {
                n(canvas);
                canvas.restore();
                return;
            }
            int iWidth = (int) (this.A.width() - getBounds().width());
            int iHeight = (int) (this.A.height() - getBounds().height());
            if (iWidth < 0 || iHeight < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) this.A.width()) + (this.f15102g.r * 2) + iWidth, ((int) this.A.height()) + (this.f15102g.r * 2) + iHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            float f2 = (getBounds().left - this.f15102g.r) - iWidth;
            float f3 = (getBounds().top - this.f15102g.r) - iHeight;
            canvas2.translate(-f2, -f3);
            n(canvas2);
            canvas.drawBitmap(bitmapCreateBitmap, f2, f3, (Paint) null);
            bitmapCreateBitmap.recycle();
            canvas.restore();
        }
    }

    private static int R(int i2, int i3) {
        return (i2 * (i3 + (i3 >>> 7))) >>> 8;
    }

    private void S(Canvas canvas) {
        int iZ = z();
        int iA = A();
        if (Build.VERSION.SDK_INT < 21 && this.B) {
            Rect clipBounds = canvas.getClipBounds();
            int i2 = this.f15102g.r;
            clipBounds.inset(-i2, -i2);
            clipBounds.offset(iZ, iA);
            canvas.clipRect(clipBounds, Region.Op.REPLACE);
        }
        canvas.translate(iZ, iA);
    }

    private PorterDuffColorFilter f(Paint paint, boolean z) {
        int color;
        int iL;
        if (!z || (iL = l((color = paint.getColor()))) == color) {
            return null;
        }
        return new PorterDuffColorFilter(iL, PorterDuff.Mode.SRC_IN);
    }

    private void g(RectF rectF, Path path) {
        h(rectF, path);
        if (this.f15102g.f15118j != 1.0f) {
            this.f15107l.reset();
            Matrix matrix = this.f15107l;
            float f2 = this.f15102g.f15118j;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f15107l);
        }
        path.computeBounds(this.A, true);
    }

    private boolean g0(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f15102g.f15112d == null || color2 == (colorForState2 = this.f15102g.f15112d.getColorForState(iArr, (color2 = this.t.getColor())))) {
            z = false;
        } else {
            this.t.setColor(colorForState2);
            z = true;
        }
        if (this.f15102g.f15113e == null || color == (colorForState = this.f15102g.f15113e.getColorForState(iArr, (color = this.u.getColor())))) {
            return z;
        }
        this.u.setColor(colorForState);
        return true;
    }

    private boolean h0() {
        PorterDuffColorFilter porterDuffColorFilter = this.y;
        PorterDuffColorFilter porterDuffColorFilter2 = this.z;
        c cVar = this.f15102g;
        this.y = k(cVar.f15115g, cVar.f15116h, this.t, true);
        c cVar2 = this.f15102g;
        this.z = k(cVar2.f15114f, cVar2.f15116h, this.u, false);
        c cVar3 = this.f15102g;
        if (cVar3.u) {
            this.v.d(cVar3.f15115g.getColorForState(getState(), 0));
        }
        return (c.h.k.c.a(porterDuffColorFilter, this.y) && c.h.k.c.a(porterDuffColorFilter2, this.z)) ? false : true;
    }

    private void i() {
        k kVarY = C().y(new b(-D()));
        this.s = kVarY;
        this.x.d(kVarY, this.f15102g.f15119k, v(), this.n);
    }

    private void i0() {
        float fI = I();
        this.f15102g.r = (int) Math.ceil(0.75f * fI);
        this.f15102g.s = (int) Math.ceil(fI * 0.25f);
        h0();
        N();
    }

    private PorterDuffColorFilter j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = l(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    private PorterDuffColorFilter k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        return (colorStateList == null || mode == null) ? f(paint, z) : j(colorStateList, mode, z);
    }

    public static g m(Context context, float f2) {
        int iB = e.c.b.c.s.a.b(context, e.c.b.c.b.f15081l, g.class.getSimpleName());
        g gVar = new g();
        gVar.M(context);
        gVar.X(ColorStateList.valueOf(iB));
        gVar.W(f2);
        return gVar;
    }

    private void n(Canvas canvas) {
        if (this.f15105j.cardinality() > 0) {
            Log.w(f15100e, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f15102g.s != 0) {
            canvas.drawPath(this.f15108m, this.v.c());
        }
        for (int i2 = 0; i2 < 4; i2++) {
            this.f15103h[i2].b(this.v, this.f15102g.r, canvas);
            this.f15104i[i2].b(this.v, this.f15102g.r, canvas);
        }
        if (this.B) {
            int iZ = z();
            int iA = A();
            canvas.translate(-iZ, -iA);
            canvas.drawPath(this.f15108m, f15101f);
            canvas.translate(iZ, iA);
        }
    }

    private void o(Canvas canvas) {
        q(canvas, this.t, this.f15108m, this.f15102g.a, u());
    }

    private void q(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (!kVar.u(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = kVar.t().a(rectF) * this.f15102g.f15119k;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    private void r(Canvas canvas) {
        q(canvas, this.u, this.n, this.s, v());
    }

    private RectF v() {
        this.p.set(u());
        float fD = D();
        this.p.inset(fD, fD);
        return this.p;
    }

    public int A() {
        c cVar = this.f15102g;
        return (int) (cVar.s * Math.cos(Math.toRadians(cVar.t)));
    }

    public int B() {
        return this.f15102g.r;
    }

    public k C() {
        return this.f15102g.a;
    }

    public ColorStateList E() {
        return this.f15102g.f15115g;
    }

    public float F() {
        return this.f15102g.a.r().a(u());
    }

    public float G() {
        return this.f15102g.a.t().a(u());
    }

    public float H() {
        return this.f15102g.p;
    }

    public float I() {
        return w() + H();
    }

    public void M(Context context) {
        this.f15102g.f15110b = new e.c.b.c.v.a(context);
        i0();
    }

    public boolean O() {
        e.c.b.c.v.a aVar = this.f15102g.f15110b;
        return aVar != null && aVar.d();
    }

    public boolean P() {
        return this.f15102g.a.u(u());
    }

    public boolean T() {
        int i2 = Build.VERSION.SDK_INT;
        return i2 < 21 || !(P() || this.f15108m.isConvex() || i2 >= 29);
    }

    public void U(float f2) {
        setShapeAppearanceModel(this.f15102g.a.w(f2));
    }

    public void V(e.c.b.c.c0.c cVar) {
        setShapeAppearanceModel(this.f15102g.a.x(cVar));
    }

    public void W(float f2) {
        c cVar = this.f15102g;
        if (cVar.o != f2) {
            cVar.o = f2;
            i0();
        }
    }

    public void X(ColorStateList colorStateList) {
        c cVar = this.f15102g;
        if (cVar.f15112d != colorStateList) {
            cVar.f15112d = colorStateList;
            onStateChange(getState());
        }
    }

    public void Y(float f2) {
        c cVar = this.f15102g;
        if (cVar.f15119k != f2) {
            cVar.f15119k = f2;
            this.f15106k = true;
            invalidateSelf();
        }
    }

    public void Z(int i2, int i3, int i4, int i5) {
        c cVar = this.f15102g;
        if (cVar.f15117i == null) {
            cVar.f15117i = new Rect();
        }
        this.f15102g.f15117i.set(i2, i3, i4, i5);
        invalidateSelf();
    }

    public void a0(float f2) {
        c cVar = this.f15102g;
        if (cVar.n != f2) {
            cVar.n = f2;
            i0();
        }
    }

    public void b0(int i2) {
        c cVar = this.f15102g;
        if (cVar.t != i2) {
            cVar.t = i2;
            N();
        }
    }

    public void c0(float f2, int i2) {
        f0(f2);
        e0(ColorStateList.valueOf(i2));
    }

    public void d0(float f2, ColorStateList colorStateList) {
        f0(f2);
        e0(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.t.setColorFilter(this.y);
        int alpha = this.t.getAlpha();
        this.t.setAlpha(R(alpha, this.f15102g.f15121m));
        this.u.setColorFilter(this.z);
        this.u.setStrokeWidth(this.f15102g.f15120l);
        int alpha2 = this.u.getAlpha();
        this.u.setAlpha(R(alpha2, this.f15102g.f15121m));
        if (this.f15106k) {
            i();
            g(u(), this.f15108m);
            this.f15106k = false;
        }
        Q(canvas);
        if (K()) {
            o(canvas);
        }
        if (L()) {
            r(canvas);
        }
        this.t.setAlpha(alpha);
        this.u.setAlpha(alpha2);
    }

    public void e0(ColorStateList colorStateList) {
        c cVar = this.f15102g;
        if (cVar.f15113e != colorStateList) {
            cVar.f15113e = colorStateList;
            onStateChange(getState());
        }
    }

    public void f0(float f2) {
        this.f15102g.f15120l = f2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f15102g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f15102g.q == 2) {
            return;
        }
        if (P()) {
            outline.setRoundRect(getBounds(), F() * this.f15102g.f15119k);
            return;
        }
        g(u(), this.f15108m);
        if (this.f15108m.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(this.f15108m);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f15102g.f15117i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.q.set(getBounds());
        g(u(), this.f15108m);
        this.r.setPath(this.f15108m, this.q);
        this.q.op(this.r, Region.Op.DIFFERENCE);
        return this.q;
    }

    protected final void h(RectF rectF, Path path) {
        l lVar = this.x;
        c cVar = this.f15102g;
        lVar.e(cVar.a, cVar.f15119k, rectF, this.w, path);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f15106k = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f15102g.f15115g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f15102g.f15114f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f15102g.f15113e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f15102g.f15112d) != null && colorStateList4.isStateful())));
    }

    protected int l(int i2) {
        float fI = I() + y();
        e.c.b.c.v.a aVar = this.f15102g.f15110b;
        return aVar != null ? aVar.c(i2, fI) : i2;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f15102g = new c(this.f15102g);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f15106k = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.h.b
    protected boolean onStateChange(int[] iArr) {
        boolean z = g0(iArr) || h0();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    protected void p(Canvas canvas, Paint paint, Path path, RectF rectF) {
        q(canvas, paint, path, this.f15102g.a, rectF);
    }

    public float s() {
        return this.f15102g.a.j().a(u());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        c cVar = this.f15102g;
        if (cVar.f15121m != i2) {
            cVar.f15121m = i2;
            N();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f15102g.f15111c = colorFilter;
        N();
    }

    @Override // e.c.b.c.c0.n
    public void setShapeAppearanceModel(k kVar) {
        this.f15102g.a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        this.f15102g.f15115g = colorStateList;
        h0();
        N();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f15102g;
        if (cVar.f15116h != mode) {
            cVar.f15116h = mode;
            h0();
            N();
        }
    }

    public float t() {
        return this.f15102g.a.l().a(u());
    }

    protected RectF u() {
        this.o.set(getBounds());
        return this.o;
    }

    public float w() {
        return this.f15102g.o;
    }

    public ColorStateList x() {
        return this.f15102g.f15112d;
    }

    public float y() {
        return this.f15102g.n;
    }

    public int z() {
        c cVar = this.f15102g;
        return (int) (cVar.s * Math.sin(Math.toRadians(cVar.t)));
    }

    public g() {
        this(new k());
    }

    public g(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(k.e(context, attributeSet, i2, i3).m());
    }

    public g(k kVar) {
        this(new c(kVar, null));
    }

    private g(c cVar) {
        this.f15103h = new m.g[4];
        this.f15104i = new m.g[4];
        this.f15105j = new BitSet(8);
        this.f15107l = new Matrix();
        this.f15108m = new Path();
        this.n = new Path();
        this.o = new RectF();
        this.p = new RectF();
        this.q = new Region();
        this.r = new Region();
        Paint paint = new Paint(1);
        this.t = paint;
        Paint paint2 = new Paint(1);
        this.u = paint2;
        this.v = new e.c.b.c.b0.a();
        this.x = Looper.getMainLooper().getThread() == Thread.currentThread() ? l.k() : new l();
        this.A = new RectF();
        this.B = true;
        this.f15102g = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = f15101f;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        h0();
        g0(getState());
        this.w = new a();
    }

    /* compiled from: MaterialShapeDrawable.java */
    static final class c extends Drawable.ConstantState {
        public k a;

        /* renamed from: b, reason: collision with root package name */
        public e.c.b.c.v.a f15110b;

        /* renamed from: c, reason: collision with root package name */
        public ColorFilter f15111c;

        /* renamed from: d, reason: collision with root package name */
        public ColorStateList f15112d;

        /* renamed from: e, reason: collision with root package name */
        public ColorStateList f15113e;

        /* renamed from: f, reason: collision with root package name */
        public ColorStateList f15114f;

        /* renamed from: g, reason: collision with root package name */
        public ColorStateList f15115g;

        /* renamed from: h, reason: collision with root package name */
        public PorterDuff.Mode f15116h;

        /* renamed from: i, reason: collision with root package name */
        public Rect f15117i;

        /* renamed from: j, reason: collision with root package name */
        public float f15118j;

        /* renamed from: k, reason: collision with root package name */
        public float f15119k;

        /* renamed from: l, reason: collision with root package name */
        public float f15120l;

        /* renamed from: m, reason: collision with root package name */
        public int f15121m;
        public float n;
        public float o;
        public float p;
        public int q;
        public int r;
        public int s;
        public int t;
        public boolean u;
        public Paint.Style v;

        public c(k kVar, e.c.b.c.v.a aVar) {
            this.f15112d = null;
            this.f15113e = null;
            this.f15114f = null;
            this.f15115g = null;
            this.f15116h = PorterDuff.Mode.SRC_IN;
            this.f15117i = null;
            this.f15118j = 1.0f;
            this.f15119k = 1.0f;
            this.f15121m = 255;
            this.n = 0.0f;
            this.o = 0.0f;
            this.p = 0.0f;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = false;
            this.v = Paint.Style.FILL_AND_STROKE;
            this.a = kVar;
            this.f15110b = aVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            g gVar = new g(this, null);
            gVar.f15106k = true;
            return gVar;
        }

        public c(c cVar) {
            this.f15112d = null;
            this.f15113e = null;
            this.f15114f = null;
            this.f15115g = null;
            this.f15116h = PorterDuff.Mode.SRC_IN;
            this.f15117i = null;
            this.f15118j = 1.0f;
            this.f15119k = 1.0f;
            this.f15121m = 255;
            this.n = 0.0f;
            this.o = 0.0f;
            this.p = 0.0f;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = false;
            this.v = Paint.Style.FILL_AND_STROKE;
            this.a = cVar.a;
            this.f15110b = cVar.f15110b;
            this.f15120l = cVar.f15120l;
            this.f15111c = cVar.f15111c;
            this.f15112d = cVar.f15112d;
            this.f15113e = cVar.f15113e;
            this.f15116h = cVar.f15116h;
            this.f15115g = cVar.f15115g;
            this.f15121m = cVar.f15121m;
            this.f15118j = cVar.f15118j;
            this.s = cVar.s;
            this.q = cVar.q;
            this.u = cVar.u;
            this.f15119k = cVar.f15119k;
            this.n = cVar.n;
            this.o = cVar.o;
            this.p = cVar.p;
            this.r = cVar.r;
            this.t = cVar.t;
            this.f15114f = cVar.f15114f;
            this.v = cVar.v;
            if (cVar.f15117i != null) {
                this.f15117i = new Rect(cVar.f15117i);
            }
        }
    }
}