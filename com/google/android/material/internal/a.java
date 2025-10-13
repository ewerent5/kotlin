package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import c.h.l.t;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.material.internal.g;
import e.c.b.c.z.a;

/* compiled from: CollapsingTextHelper.java */
/* loaded from: classes.dex */
public final class a {
    private static final boolean a;

    /* renamed from: b, reason: collision with root package name */
    private static final Paint f11674b;
    private CharSequence A;
    private boolean B;
    private boolean C;
    private Bitmap D;
    private Paint E;
    private float F;
    private float G;
    private int[] H;
    private boolean I;
    private final TextPaint J;
    private final TextPaint K;
    private TimeInterpolator L;
    private TimeInterpolator M;
    private float N;
    private float O;
    private float P;
    private ColorStateList Q;
    private float R;
    private float S;
    private float T;
    private ColorStateList U;
    private float V;
    private float W;
    private StaticLayout X;
    private float Y;
    private float Z;
    private float a0;
    private CharSequence b0;

    /* renamed from: c, reason: collision with root package name */
    private final View f11675c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f11676d;

    /* renamed from: e, reason: collision with root package name */
    private float f11677e;

    /* renamed from: f, reason: collision with root package name */
    private final Rect f11678f;

    /* renamed from: g, reason: collision with root package name */
    private final Rect f11679g;

    /* renamed from: h, reason: collision with root package name */
    private final RectF f11680h;

    /* renamed from: m, reason: collision with root package name */
    private ColorStateList f11685m;
    private ColorStateList n;
    private float o;
    private float p;
    private float q;
    private float r;
    private float s;
    private float t;
    private Typeface u;
    private Typeface v;
    private Typeface w;
    private e.c.b.c.z.a x;
    private e.c.b.c.z.a y;
    private CharSequence z;

    /* renamed from: i, reason: collision with root package name */
    private int f11681i = 16;

    /* renamed from: j, reason: collision with root package name */
    private int f11682j = 16;

    /* renamed from: k, reason: collision with root package name */
    private float f11683k = 15.0f;

    /* renamed from: l, reason: collision with root package name */
    private float f11684l = 15.0f;
    private int c0 = 1;

    /* compiled from: CollapsingTextHelper.java */
    /* renamed from: com.google.android.material.internal.a$a, reason: collision with other inner class name */
    class C0121a implements a.InterfaceC0185a {
        C0121a() {
        }

        @Override // e.c.b.c.z.a.InterfaceC0185a
        public void a(Typeface typeface) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
            a.this.M(typeface);
        }
    }

    static {
        a = Build.VERSION.SDK_INT < 18;
        Paint paint = null;
        f11674b = null;
        if (0 != 0) {
            paint.setAntiAlias(true);
            paint.setColor(-65281);
        }
    }

    public a(View view) {
        this.f11675c = view;
        TextPaint textPaint = new TextPaint(129);
        this.J = textPaint;
        this.K = new TextPaint(textPaint);
        this.f11679g = new Rect();
        this.f11678f = new Rect();
        this.f11680h = new RectF();
    }

    private boolean A() {
        return t.B(this.f11675c) == 1;
    }

    private static float C(float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f4 = timeInterpolator.getInterpolation(f4);
        }
        return e.c.b.c.m.a.a(f2, f3, f4);
    }

    private static boolean F(Rect rect, int i2, int i3, int i4, int i5) {
        return rect.left == i2 && rect.top == i3 && rect.right == i4 && rect.bottom == i5;
    }

    private void J(float f2) {
        this.Y = f2;
        t.b0(this.f11675c);
    }

    private boolean N(Typeface typeface) {
        e.c.b.c.z.a aVar = this.y;
        if (aVar != null) {
            aVar.c();
        }
        if (this.u == typeface) {
            return false;
        }
        this.u = typeface;
        return true;
    }

    private void Q(float f2) {
        this.Z = f2;
        t.b0(this.f11675c);
    }

    private boolean U(Typeface typeface) {
        e.c.b.c.z.a aVar = this.x;
        if (aVar != null) {
            aVar.c();
        }
        if (this.v == typeface) {
            return false;
        }
        this.v = typeface;
        return true;
    }

    private void W(float f2) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        g(f2);
        boolean z = a && this.F != 1.0f;
        this.C = z;
        if (z) {
            l();
        }
        t.b0(this.f11675c);
    }

    private static int a(int i2, int i3, float f2) {
        float f3 = 1.0f - f2;
        return Color.argb((int) ((Color.alpha(i2) * f3) + (Color.alpha(i3) * f2)), (int) ((Color.red(i2) * f3) + (Color.red(i3) * f2)), (int) ((Color.green(i2) * f3) + (Color.green(i3) * f2)), (int) ((Color.blue(i2) * f3) + (Color.blue(i3) * f2)));
    }

    private void b() throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        StaticLayout staticLayout;
        float f2 = this.G;
        g(this.f11684l);
        CharSequence charSequence = this.A;
        if (charSequence != null && (staticLayout = this.X) != null) {
            this.b0 = TextUtils.ellipsize(charSequence, this.J, staticLayout.getWidth(), TextUtils.TruncateAt.END);
        }
        CharSequence charSequence2 = this.b0;
        float fMeasureText = charSequence2 != null ? this.J.measureText(charSequence2, 0, charSequence2.length()) : 0.0f;
        int iB = c.h.l.d.b(this.f11682j, this.B ? 1 : 0);
        int i2 = iB & SyslogConstants.LOG_ALERT;
        if (i2 == 48) {
            this.p = this.f11679g.top;
        } else if (i2 != 80) {
            this.p = this.f11679g.centerY() - ((this.J.descent() - this.J.ascent()) / 2.0f);
        } else {
            this.p = this.f11679g.bottom + this.J.ascent();
        }
        int i3 = iB & 8388615;
        if (i3 == 1) {
            this.r = this.f11679g.centerX() - (fMeasureText / 2.0f);
        } else if (i3 != 5) {
            this.r = this.f11679g.left;
        } else {
            this.r = this.f11679g.right - fMeasureText;
        }
        g(this.f11683k);
        float height = this.X != null ? r1.getHeight() : 0.0f;
        CharSequence charSequence3 = this.A;
        float fMeasureText2 = charSequence3 != null ? this.J.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        StaticLayout staticLayout2 = this.X;
        if (staticLayout2 != null && this.c0 > 1 && !this.B) {
            fMeasureText2 = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.X;
        this.a0 = staticLayout3 != null ? staticLayout3.getLineLeft(0) : 0.0f;
        int iB2 = c.h.l.d.b(this.f11681i, this.B ? 1 : 0);
        int i4 = iB2 & SyslogConstants.LOG_ALERT;
        if (i4 == 48) {
            this.o = this.f11678f.top;
        } else if (i4 != 80) {
            this.o = this.f11678f.centerY() - (height / 2.0f);
        } else {
            this.o = (this.f11678f.bottom - height) + this.J.descent();
        }
        int i5 = iB2 & 8388615;
        if (i5 == 1) {
            this.q = this.f11678f.centerX() - (fMeasureText2 / 2.0f);
        } else if (i5 != 5) {
            this.q = this.f11678f.left;
        } else {
            this.q = this.f11678f.right - fMeasureText2;
        }
        h();
        W(f2);
    }

    private boolean c0() {
        return (this.c0 <= 1 || this.B || this.C) ? false : true;
    }

    private void d() throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        f(this.f11677e);
    }

    private boolean e(CharSequence charSequence) {
        return (A() ? c.h.j.e.f3097d : c.h.j.e.f3096c).a(charSequence, 0, charSequence.length());
    }

    private void f(float f2) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        y(f2);
        this.s = C(this.q, this.r, f2, this.L);
        this.t = C(this.o, this.p, f2, this.L);
        W(C(this.f11683k, this.f11684l, f2, this.M));
        TimeInterpolator timeInterpolator = e.c.b.c.m.a.f15264b;
        J(1.0f - C(0.0f, 1.0f, 1.0f - f2, timeInterpolator));
        Q(C(1.0f, 0.0f, f2, timeInterpolator));
        if (this.n != this.f11685m) {
            this.J.setColor(a(t(), r(), f2));
        } else {
            this.J.setColor(r());
        }
        if (Build.VERSION.SDK_INT >= 21) {
            float f3 = this.V;
            float f4 = this.W;
            if (f3 != f4) {
                this.J.setLetterSpacing(C(f4, f3, f2, timeInterpolator));
            } else {
                this.J.setLetterSpacing(f3);
            }
        }
        this.J.setShadowLayer(C(this.R, this.N, f2, null), C(this.S, this.O, f2, null), C(this.T, this.P, f2, null), a(s(this.U), s(this.Q), f2));
        t.b0(this.f11675c);
    }

    private void g(float f2) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        boolean z;
        float f3;
        boolean z2;
        if (this.z == null) {
            return;
        }
        float fWidth = this.f11679g.width();
        float fWidth2 = this.f11678f.width();
        if (z(f2, this.f11684l)) {
            f3 = this.f11684l;
            this.F = 1.0f;
            Typeface typeface = this.w;
            Typeface typeface2 = this.u;
            if (typeface != typeface2) {
                this.w = typeface2;
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            float f4 = this.f11683k;
            Typeface typeface3 = this.w;
            Typeface typeface4 = this.v;
            if (typeface3 != typeface4) {
                this.w = typeface4;
                z = true;
            } else {
                z = false;
            }
            if (z(f2, f4)) {
                this.F = 1.0f;
            } else {
                this.F = f2 / this.f11683k;
            }
            float f5 = this.f11684l / this.f11683k;
            fWidth = fWidth2 * f5 > fWidth ? Math.min(fWidth / f5, fWidth2) : fWidth2;
            f3 = f4;
            z2 = z;
        }
        if (fWidth > 0.0f) {
            z2 = this.G != f3 || this.I || z2;
            this.G = f3;
            this.I = false;
        }
        if (this.A == null || z2) {
            this.J.setTextSize(this.G);
            this.J.setTypeface(this.w);
            this.J.setLinearText(this.F != 1.0f);
            this.B = e(this.z);
            StaticLayout staticLayoutI = i(c0() ? this.c0 : 1, fWidth, this.B);
            this.X = staticLayoutI;
            this.A = staticLayoutI.getText();
        }
    }

    private void h() {
        Bitmap bitmap = this.D;
        if (bitmap != null) {
            bitmap.recycle();
            this.D = null;
        }
    }

    private StaticLayout i(int i2, float f2, boolean z) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        StaticLayout staticLayoutA;
        try {
            staticLayoutA = g.c(this.z, this.J, (int) f2).e(TextUtils.TruncateAt.END).g(z).d(Layout.Alignment.ALIGN_NORMAL).f(false).h(i2).a();
        } catch (g.a e2) {
            Log.e("CollapsingTextHelper", e2.getCause().getMessage(), e2);
            staticLayoutA = null;
        }
        return (StaticLayout) c.h.k.h.c(staticLayoutA);
    }

    private void k(Canvas canvas, float f2, float f3) {
        int alpha = this.J.getAlpha();
        canvas.translate(f2, f3);
        float f4 = alpha;
        this.J.setAlpha((int) (this.Z * f4));
        this.X.draw(canvas);
        this.J.setAlpha((int) (this.Y * f4));
        int lineBaseline = this.X.getLineBaseline(0);
        CharSequence charSequence = this.b0;
        float f5 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f5, this.J);
        String strTrim = this.b0.toString().trim();
        if (strTrim.endsWith("…")) {
            strTrim = strTrim.substring(0, strTrim.length() - 1);
        }
        String str = strTrim;
        this.J.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.X.getLineEnd(0), str.length()), 0.0f, f5, (Paint) this.J);
    }

    private void l() throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        if (this.D != null || this.f11678f.isEmpty() || TextUtils.isEmpty(this.A)) {
            return;
        }
        f(0.0f);
        int width = this.X.getWidth();
        int height = this.X.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.D = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.X.draw(new Canvas(this.D));
        if (this.E == null) {
            this.E = new Paint(3);
        }
    }

    private float p(int i2, int i3) {
        return (i3 == 17 || (i3 & 7) == 1) ? (i2 / 2.0f) - (c() / 2.0f) : ((i3 & 8388613) == 8388613 || (i3 & 5) == 5) ? this.B ? this.f11679g.left : this.f11679g.right - c() : this.B ? this.f11679g.right - c() : this.f11679g.left;
    }

    private float q(RectF rectF, int i2, int i3) {
        return (i3 == 17 || (i3 & 7) == 1) ? (i2 / 2.0f) + (c() / 2.0f) : ((i3 & 8388613) == 8388613 || (i3 & 5) == 5) ? this.B ? rectF.left + c() : this.f11679g.right : this.B ? this.f11679g.right : rectF.left + c();
    }

    private int s(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.H;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    private int t() {
        return s(this.f11685m);
    }

    private void w(TextPaint textPaint) {
        textPaint.setTextSize(this.f11684l);
        textPaint.setTypeface(this.u);
        if (Build.VERSION.SDK_INT >= 21) {
            textPaint.setLetterSpacing(this.V);
        }
    }

    private void x(TextPaint textPaint) {
        textPaint.setTextSize(this.f11683k);
        textPaint.setTypeface(this.v);
        if (Build.VERSION.SDK_INT >= 21) {
            textPaint.setLetterSpacing(this.W);
        }
    }

    private void y(float f2) {
        this.f11680h.left = C(this.f11678f.left, this.f11679g.left, f2, this.L);
        this.f11680h.top = C(this.o, this.p, f2, this.L);
        this.f11680h.right = C(this.f11678f.right, this.f11679g.right, f2, this.L);
        this.f11680h.bottom = C(this.f11678f.bottom, this.f11679g.bottom, f2, this.L);
    }

    private static boolean z(float f2, float f3) {
        return Math.abs(f2 - f3) < 0.001f;
    }

    public final boolean B() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.n;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f11685m) != null && colorStateList.isStateful());
    }

    void D() {
        this.f11676d = this.f11679g.width() > 0 && this.f11679g.height() > 0 && this.f11678f.width() > 0 && this.f11678f.height() > 0;
    }

    public void E() throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        if (this.f11675c.getHeight() <= 0 || this.f11675c.getWidth() <= 0) {
            return;
        }
        b();
        d();
    }

    public void G(int i2, int i3, int i4, int i5) {
        if (F(this.f11679g, i2, i3, i4, i5)) {
            return;
        }
        this.f11679g.set(i2, i3, i4, i5);
        this.I = true;
        D();
    }

    public void H(Rect rect) {
        G(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void I(int i2) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        e.c.b.c.z.d dVar = new e.c.b.c.z.d(this.f11675c.getContext(), i2);
        ColorStateList colorStateList = dVar.a;
        if (colorStateList != null) {
            this.n = colorStateList;
        }
        float f2 = dVar.n;
        if (f2 != 0.0f) {
            this.f11684l = f2;
        }
        ColorStateList colorStateList2 = dVar.f15323d;
        if (colorStateList2 != null) {
            this.Q = colorStateList2;
        }
        this.O = dVar.f15328i;
        this.P = dVar.f15329j;
        this.N = dVar.f15330k;
        this.V = dVar.f15332m;
        e.c.b.c.z.a aVar = this.y;
        if (aVar != null) {
            aVar.c();
        }
        this.y = new e.c.b.c.z.a(new C0121a(), dVar.e());
        dVar.h(this.f11675c.getContext(), this.y);
        E();
    }

    public void K(ColorStateList colorStateList) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        if (this.n != colorStateList) {
            this.n = colorStateList;
            E();
        }
    }

    public void L(int i2) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        if (this.f11682j != i2) {
            this.f11682j = i2;
            E();
        }
    }

    public void M(Typeface typeface) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        if (N(typeface)) {
            E();
        }
    }

    public void O(int i2, int i3, int i4, int i5) {
        if (F(this.f11678f, i2, i3, i4, i5)) {
            return;
        }
        this.f11678f.set(i2, i3, i4, i5);
        this.I = true;
        D();
    }

    public void P(Rect rect) {
        O(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void R(ColorStateList colorStateList) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        if (this.f11685m != colorStateList) {
            this.f11685m = colorStateList;
            E();
        }
    }

    public void S(int i2) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        if (this.f11681i != i2) {
            this.f11681i = i2;
            E();
        }
    }

    public void T(float f2) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        if (this.f11683k != f2) {
            this.f11683k = f2;
            E();
        }
    }

    public void V(float f2) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        float fA = c.h.f.a.a(f2, 0.0f, 1.0f);
        if (fA != this.f11677e) {
            this.f11677e = fA;
            d();
        }
    }

    public void X(TimeInterpolator timeInterpolator) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        this.L = timeInterpolator;
        E();
    }

    public final boolean Y(int[] iArr) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        this.H = iArr;
        if (!B()) {
            return false;
        }
        E();
        return true;
    }

    public void Z(CharSequence charSequence) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        if (charSequence == null || !TextUtils.equals(this.z, charSequence)) {
            this.z = charSequence;
            this.A = null;
            h();
            E();
        }
    }

    public void a0(TimeInterpolator timeInterpolator) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        this.M = timeInterpolator;
        E();
    }

    public void b0(Typeface typeface) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        boolean zN = N(typeface);
        boolean zU = U(typeface);
        if (zN || zU) {
            E();
        }
    }

    public float c() {
        if (this.z == null) {
            return 0.0f;
        }
        w(this.K);
        TextPaint textPaint = this.K;
        CharSequence charSequence = this.z;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public void j(Canvas canvas) {
        int iSave = canvas.save();
        if (this.A == null || !this.f11676d) {
            return;
        }
        boolean z = false;
        float lineLeft = (this.s + this.X.getLineLeft(0)) - (this.a0 * 2.0f);
        this.J.setTextSize(this.G);
        float f2 = this.s;
        float f3 = this.t;
        if (this.C && this.D != null) {
            z = true;
        }
        float f4 = this.F;
        if (f4 != 1.0f) {
            canvas.scale(f4, f4, f2, f3);
        }
        if (z) {
            canvas.drawBitmap(this.D, f2, f3, this.E);
            canvas.restoreToCount(iSave);
            return;
        }
        if (c0()) {
            k(canvas, lineLeft, f3);
        } else {
            canvas.translate(f2, f3);
            this.X.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    public void m(RectF rectF, int i2, int i3) {
        this.B = e(this.z);
        rectF.left = p(i2, i3);
        rectF.top = this.f11679g.top;
        rectF.right = q(rectF, i2, i3);
        rectF.bottom = this.f11679g.top + o();
    }

    public ColorStateList n() {
        return this.n;
    }

    public float o() {
        w(this.K);
        return -this.K.ascent();
    }

    public int r() {
        return s(this.n);
    }

    public float u() {
        x(this.K);
        return -this.K.ascent();
    }

    public float v() {
        return this.f11677e;
    }
}