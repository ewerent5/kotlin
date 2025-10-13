package e.c.b.c.a0;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import e.c.b.c.c0.g;
import e.c.b.c.c0.k;
import e.c.b.c.c0.n;

/* compiled from: RippleDrawableCompat.java */
/* loaded from: classes.dex */
public class a extends Drawable implements n, androidx.core.graphics.drawable.b {

    /* renamed from: e, reason: collision with root package name */
    private b f15058e;

    @Override // android.graphics.drawable.Drawable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public a mutate() {
        this.f15058e = new b(this.f15058e);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.f15058e;
        if (bVar.f15059b) {
            bVar.a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f15058e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f15058e.a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f15058e.a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        if (this.f15058e.a.setState(iArr)) {
            zOnStateChange = true;
        }
        boolean zE = e.c.b.c.a0.b.e(iArr);
        b bVar = this.f15058e;
        if (bVar.f15059b == zE) {
            return zOnStateChange;
        }
        bVar.f15059b = zE;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f15058e.a.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f15058e.a.setColorFilter(colorFilter);
    }

    @Override // e.c.b.c.c0.n
    public void setShapeAppearanceModel(k kVar) {
        this.f15058e.a.setShapeAppearanceModel(kVar);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTint(int i2) {
        this.f15058e.a.setTint(i2);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        this.f15058e.a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        this.f15058e.a.setTintMode(mode);
    }

    public a(k kVar) {
        this(new b(new g(kVar)));
    }

    /* compiled from: RippleDrawableCompat.java */
    static final class b extends Drawable.ConstantState {
        g a;

        /* renamed from: b, reason: collision with root package name */
        boolean f15059b;

        public b(g gVar) {
            this.a = gVar;
            this.f15059b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a newDrawable() {
            return new a(new b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        public b(b bVar) {
            this.a = (g) bVar.a.getConstantState().newDrawable();
            this.f15059b = bVar.f15059b;
        }
    }

    private a(b bVar) {
        this.f15058e = bVar;
    }
}