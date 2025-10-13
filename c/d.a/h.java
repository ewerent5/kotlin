package c.d.a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* compiled from: RoundRectDrawableWithShadow.java */
/* loaded from: classes.dex */
class h extends Drawable {
    private static final double a = Math.cos(Math.toRadians(45.0d));

    /* renamed from: b, reason: collision with root package name */
    static a f2690b;

    /* renamed from: c, reason: collision with root package name */
    private final int f2691c;

    /* renamed from: d, reason: collision with root package name */
    private Paint f2692d;

    /* renamed from: e, reason: collision with root package name */
    private Paint f2693e;

    /* renamed from: f, reason: collision with root package name */
    private Paint f2694f;

    /* renamed from: g, reason: collision with root package name */
    private final RectF f2695g;

    /* renamed from: h, reason: collision with root package name */
    private float f2696h;

    /* renamed from: i, reason: collision with root package name */
    private Path f2697i;

    /* renamed from: j, reason: collision with root package name */
    private float f2698j;

    /* renamed from: k, reason: collision with root package name */
    private float f2699k;

    /* renamed from: l, reason: collision with root package name */
    private float f2700l;

    /* renamed from: m, reason: collision with root package name */
    private ColorStateList f2701m;
    private boolean n;
    private final int o;
    private final int p;
    private boolean q;
    private boolean r;

    /* compiled from: RoundRectDrawableWithShadow.java */
    interface a {
        void a(Canvas canvas, RectF rectF, float f2, Paint paint);
    }

    private void a(Rect rect) {
        float f2 = this.f2698j;
        float f3 = 1.5f * f2;
        this.f2695g.set(rect.left + f2, rect.top + f3, rect.right - f2, rect.bottom - f3);
        b();
    }

    private void b() {
        float f2 = this.f2696h;
        RectF rectF = new RectF(-f2, -f2, f2, f2);
        RectF rectF2 = new RectF(rectF);
        float f3 = this.f2699k;
        rectF2.inset(-f3, -f3);
        Path path = this.f2697i;
        if (path == null) {
            this.f2697i = new Path();
        } else {
            path.reset();
        }
        this.f2697i.setFillType(Path.FillType.EVEN_ODD);
        this.f2697i.moveTo(-this.f2696h, 0.0f);
        this.f2697i.rLineTo(-this.f2699k, 0.0f);
        this.f2697i.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f2697i.arcTo(rectF, 270.0f, -90.0f, false);
        this.f2697i.close();
        float f4 = this.f2696h;
        float f5 = f4 / (this.f2699k + f4);
        Paint paint = this.f2693e;
        float f6 = this.f2696h + this.f2699k;
        int i2 = this.o;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f6, new int[]{i2, i2, this.p}, new float[]{0.0f, f5, 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.f2694f;
        float f7 = this.f2696h;
        float f8 = this.f2699k;
        int i3 = this.o;
        paint2.setShader(new LinearGradient(0.0f, (-f7) + f8, 0.0f, (-f7) - f8, new int[]{i3, i3, this.p}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f2694f.setAntiAlias(false);
    }

    static float c(float f2, float f3, boolean z) {
        return z ? (float) (f2 + ((1.0d - a) * f3)) : f2;
    }

    static float d(float f2, float f3, boolean z) {
        return z ? (float) ((f2 * 1.5f) + ((1.0d - a) * f3)) : f2 * 1.5f;
    }

    private void e(Canvas canvas) {
        float f2 = this.f2696h;
        float f3 = (-f2) - this.f2699k;
        float f4 = f2 + this.f2691c + (this.f2700l / 2.0f);
        float f5 = f4 * 2.0f;
        boolean z = this.f2695g.width() - f5 > 0.0f;
        boolean z2 = this.f2695g.height() - f5 > 0.0f;
        int iSave = canvas.save();
        RectF rectF = this.f2695g;
        canvas.translate(rectF.left + f4, rectF.top + f4);
        canvas.drawPath(this.f2697i, this.f2693e);
        if (z) {
            canvas.drawRect(0.0f, f3, this.f2695g.width() - f5, -this.f2696h, this.f2694f);
        }
        canvas.restoreToCount(iSave);
        int iSave2 = canvas.save();
        RectF rectF2 = this.f2695g;
        canvas.translate(rectF2.right - f4, rectF2.bottom - f4);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f2697i, this.f2693e);
        if (z) {
            canvas.drawRect(0.0f, f3, this.f2695g.width() - f5, (-this.f2696h) + this.f2699k, this.f2694f);
        }
        canvas.restoreToCount(iSave2);
        int iSave3 = canvas.save();
        RectF rectF3 = this.f2695g;
        canvas.translate(rectF3.left + f4, rectF3.bottom - f4);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f2697i, this.f2693e);
        if (z2) {
            canvas.drawRect(0.0f, f3, this.f2695g.height() - f5, -this.f2696h, this.f2694f);
        }
        canvas.restoreToCount(iSave3);
        int iSave4 = canvas.save();
        RectF rectF4 = this.f2695g;
        canvas.translate(rectF4.right - f4, rectF4.top + f4);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f2697i, this.f2693e);
        if (z2) {
            canvas.drawRect(0.0f, f3, this.f2695g.height() - f5, -this.f2696h, this.f2694f);
        }
        canvas.restoreToCount(iSave4);
    }

    private void n(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f2701m = colorStateList;
        this.f2692d.setColor(colorStateList.getColorForState(getState(), this.f2701m.getDefaultColor()));
    }

    private void s(float f2, float f3) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f2 + ". Must be >= 0");
        }
        if (f3 < 0.0f) {
            throw new IllegalArgumentException("Invalid max shadow size " + f3 + ". Must be >= 0");
        }
        float fT = t(f2);
        float fT2 = t(f3);
        if (fT > fT2) {
            if (!this.r) {
                this.r = true;
            }
            fT = fT2;
        }
        if (this.f2700l == fT && this.f2698j == fT2) {
            return;
        }
        this.f2700l = fT;
        this.f2698j = fT2;
        this.f2699k = (int) ((fT * 1.5f) + this.f2691c + 0.5f);
        this.n = true;
        invalidateSelf();
    }

    private int t(float f2) {
        int i2 = (int) (f2 + 0.5f);
        return i2 % 2 == 1 ? i2 - 1 : i2;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.n) {
            a(getBounds());
            this.n = false;
        }
        canvas.translate(0.0f, this.f2700l / 2.0f);
        e(canvas);
        canvas.translate(0.0f, (-this.f2700l) / 2.0f);
        f2690b.a(canvas, this.f2695g, this.f2696h, this.f2692d);
    }

    ColorStateList f() {
        return this.f2701m;
    }

    float g() {
        return this.f2696h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int iCeil = (int) Math.ceil(d(this.f2698j, this.f2696h, this.q));
        int iCeil2 = (int) Math.ceil(c(this.f2698j, this.f2696h, this.q));
        rect.set(iCeil2, iCeil, iCeil2, iCeil);
        return true;
    }

    void h(Rect rect) {
        getPadding(rect);
    }

    float i() {
        return this.f2698j;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f2701m;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    float j() {
        float f2 = this.f2698j;
        return (Math.max(f2, this.f2696h + this.f2691c + ((f2 * 1.5f) / 2.0f)) * 2.0f) + (((this.f2698j * 1.5f) + this.f2691c) * 2.0f);
    }

    float k() {
        float f2 = this.f2698j;
        return (Math.max(f2, this.f2696h + this.f2691c + (f2 / 2.0f)) * 2.0f) + ((this.f2698j + this.f2691c) * 2.0f);
    }

    float l() {
        return this.f2700l;
    }

    void m(boolean z) {
        this.q = z;
        invalidateSelf();
    }

    void o(ColorStateList colorStateList) {
        n(colorStateList);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.n = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f2701m;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f2692d.getColor() == colorForState) {
            return false;
        }
        this.f2692d.setColor(colorForState);
        this.n = true;
        invalidateSelf();
        return true;
    }

    void p(float f2) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Invalid radius " + f2 + ". Must be >= 0");
        }
        float f3 = (int) (f2 + 0.5f);
        if (this.f2696h == f3) {
            return;
        }
        this.f2696h = f3;
        this.n = true;
        invalidateSelf();
    }

    void q(float f2) {
        s(this.f2700l, f2);
    }

    void r(float f2) {
        s(f2, this.f2698j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f2692d.setAlpha(i2);
        this.f2693e.setAlpha(i2);
        this.f2694f.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f2692d.setColorFilter(colorFilter);
    }
}