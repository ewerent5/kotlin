package c.d.a;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: CardView.java */
/* loaded from: classes.dex */
public class a extends FrameLayout {

    /* renamed from: e */
    private static final int[] f2672e = {R.attr.colorBackground};

    /* renamed from: f */
    private static final f f2673f;

    /* renamed from: g */
    private boolean f2674g;

    /* renamed from: h */
    private boolean f2675h;

    /* renamed from: i */
    int f2676i;

    /* renamed from: j */
    int f2677j;

    /* renamed from: k */
    final Rect f2678k;

    /* renamed from: l */
    private final e f2679l;

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            f2673f = new c();
        } else if (i2 >= 17) {
            f2673f = new b();
        } else {
            f2673f = new d();
        }
        f2673f.h();
    }

    public ColorStateList getCardBackgroundColor() {
        return f2673f.g(this.f2679l);
    }

    public float getCardElevation() {
        return f2673f.b(this.f2679l);
    }

    public int getContentPaddingBottom() {
        return this.f2678k.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f2678k.left;
    }

    public int getContentPaddingRight() {
        return this.f2678k.right;
    }

    public int getContentPaddingTop() {
        return this.f2678k.top;
    }

    public float getMaxCardElevation() {
        return f2673f.f(this.f2679l);
    }

    public boolean getPreventCornerOverlap() {
        return this.f2675h;
    }

    public float getRadius() {
        return f2673f.c(this.f2679l);
    }

    public boolean getUseCompatPadding() {
        return this.f2674g;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        if (f2673f instanceof c) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.j(this.f2679l)), View.MeasureSpec.getSize(i2)), mode);
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.i(this.f2679l)), View.MeasureSpec.getSize(i3)), mode2);
        }
        super.onMeasure(i2, i3);
    }

    public void setCardBackgroundColor(int i2) {
        f2673f.l(this.f2679l, ColorStateList.valueOf(i2));
    }

    public void setCardElevation(float f2) {
        f2673f.e(this.f2679l, f2);
    }

    public void setMaxCardElevation(float f2) {
        f2673f.m(this.f2679l, f2);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i2) {
        this.f2677j = i2;
        super.setMinimumHeight(i2);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i2) {
        this.f2676i = i2;
        super.setMinimumWidth(i2);
    }

    @Override // android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i2, int i3, int i4, int i5) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f2675h) {
            this.f2675h = z;
            f2673f.k(this.f2679l);
        }
    }

    public void setRadius(float f2) {
        f2673f.a(this.f2679l, f2);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f2674g != z) {
            this.f2674g = z;
            f2673f.d(this.f2679l);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f2673f.l(this.f2679l, colorStateList);
    }
}