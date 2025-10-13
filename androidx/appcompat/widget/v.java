package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import java.lang.reflect.InvocationTargetException;

/* compiled from: AppCompatSeekBarHelper.java */
/* loaded from: classes.dex */
class v extends r {

    /* renamed from: d, reason: collision with root package name */
    private final SeekBar f583d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f584e;

    /* renamed from: f, reason: collision with root package name */
    private ColorStateList f585f;

    /* renamed from: g, reason: collision with root package name */
    private PorterDuff.Mode f586g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f587h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f588i;

    v(SeekBar seekBar) {
        super(seekBar);
        this.f585f = null;
        this.f586g = null;
        this.f587h = false;
        this.f588i = false;
        this.f583d = seekBar;
    }

    private void f() {
        Drawable drawable = this.f584e;
        if (drawable != null) {
            if (this.f587h || this.f588i) {
                Drawable drawableR = androidx.core.graphics.drawable.a.r(drawable.mutate());
                this.f584e = drawableR;
                if (this.f587h) {
                    androidx.core.graphics.drawable.a.o(drawableR, this.f585f);
                }
                if (this.f588i) {
                    androidx.core.graphics.drawable.a.p(this.f584e, this.f586g);
                }
                if (this.f584e.isStateful()) {
                    this.f584e.setState(this.f583d.getDrawableState());
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.r
    void c(AttributeSet attributeSet, int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.c(attributeSet, i2);
        Context context = this.f583d.getContext();
        int[] iArr = c.a.j.V;
        w0 w0VarV = w0.v(context, attributeSet, iArr, i2, 0);
        SeekBar seekBar = this.f583d;
        c.h.l.t.i0(seekBar, seekBar.getContext(), iArr, attributeSet, w0VarV.r(), i2, 0);
        Drawable drawableH = w0VarV.h(c.a.j.W);
        if (drawableH != null) {
            this.f583d.setThumb(drawableH);
        }
        j(w0VarV.g(c.a.j.X));
        int i3 = c.a.j.Z;
        if (w0VarV.s(i3)) {
            this.f586g = e0.e(w0VarV.k(i3, -1), this.f586g);
            this.f588i = true;
        }
        int i4 = c.a.j.Y;
        if (w0VarV.s(i4)) {
            this.f585f = w0VarV.c(i4);
            this.f587h = true;
        }
        w0VarV.w();
        f();
    }

    void g(Canvas canvas) {
        if (this.f584e != null) {
            int max = this.f583d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f584e.getIntrinsicWidth();
                int intrinsicHeight = this.f584e.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i3 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f584e.setBounds(-i2, -i3, i2, i3);
                float width = ((this.f583d.getWidth() - this.f583d.getPaddingLeft()) - this.f583d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f583d.getPaddingLeft(), this.f583d.getHeight() / 2);
                for (int i4 = 0; i4 <= max; i4++) {
                    this.f584e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    void h() {
        Drawable drawable = this.f584e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f583d.getDrawableState())) {
            this.f583d.invalidateDrawable(drawable);
        }
    }

    void i() {
        Drawable drawable = this.f584e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void j(Drawable drawable) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Drawable drawable2 = this.f584e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f584e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f583d);
            androidx.core.graphics.drawable.a.m(drawable, c.h.l.t.B(this.f583d));
            if (drawable.isStateful()) {
                drawable.setState(this.f583d.getDrawableState());
            }
            f();
        }
        this.f583d.invalidate();
    }
}