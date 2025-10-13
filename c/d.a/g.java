package c.d.a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: RoundRectDrawable.java */
/* loaded from: classes.dex */
class g extends Drawable {
    private float a;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f2680b;

    /* renamed from: c, reason: collision with root package name */
    private final RectF f2681c;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f2682d;

    /* renamed from: e, reason: collision with root package name */
    private float f2683e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f2684f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f2685g;

    /* renamed from: h, reason: collision with root package name */
    private ColorStateList f2686h;

    /* renamed from: i, reason: collision with root package name */
    private PorterDuffColorFilter f2687i;

    /* renamed from: j, reason: collision with root package name */
    private ColorStateList f2688j;

    /* renamed from: k, reason: collision with root package name */
    private PorterDuff.Mode f2689k;

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    private void e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f2686h = colorStateList;
        this.f2680b.setColor(colorStateList.getColorForState(getState(), this.f2686h.getDefaultColor()));
    }

    private void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f2681c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f2682d.set(rect);
        if (this.f2684f) {
            this.f2682d.inset((int) Math.ceil(h.c(this.f2683e, this.a, this.f2685g)), (int) Math.ceil(h.d(this.f2683e, this.a, this.f2685g)));
            this.f2681c.set(this.f2682d);
        }
    }

    public ColorStateList b() {
        return this.f2686h;
    }

    float c() {
        return this.f2683e;
    }

    public float d() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f2680b;
        if (this.f2687i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f2687i);
            z = true;
        }
        RectF rectF = this.f2681c;
        float f2 = this.a;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    public void f(ColorStateList colorStateList) {
        e(colorStateList);
        invalidateSelf();
    }

    void g(float f2, boolean z, boolean z2) {
        if (f2 == this.f2683e && this.f2684f == z && this.f2685g == z2) {
            return;
        }
        this.f2683e = f2;
        this.f2684f = z;
        this.f2685g = z2;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f2682d, this.a);
    }

    void h(float f2) {
        if (f2 == this.a) {
            return;
        }
        this.a = f2;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f2688j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f2686h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f2686h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f2680b.getColor();
        if (z) {
            this.f2680b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f2688j;
        if (colorStateList2 == null || (mode = this.f2689k) == null) {
            return z;
        }
        this.f2687i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f2680b.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f2680b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f2688j = colorStateList;
        this.f2687i = a(colorStateList, this.f2689k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f2689k = mode;
        this.f2687i = a(this.f2688j, mode);
        invalidateSelf();
    }
}