package e.c.b.c.p;

import android.R;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import e.c.b.c.c0.n;
import e.c.b.c.k;

/* compiled from: MaterialCardView.java */
/* loaded from: classes.dex */
public class a extends c.d.a.a implements Checkable, n {

    /* renamed from: m, reason: collision with root package name */
    private static final int[] f15299m = {R.attr.state_checkable};
    private static final int[] n = {R.attr.state_checked};
    private static final int[] o = {e.c.b.c.b.C};
    private static final int p = k.n;
    private final b q;
    private boolean r;
    private boolean s;
    private boolean t;
    private InterfaceC0182a u;

    /* compiled from: MaterialCardView.java */
    /* renamed from: e.c.b.c.p.a$a, reason: collision with other inner class name */
    public interface InterfaceC0182a {
        void a(a aVar, boolean z);
    }

    private void d() {
        if (Build.VERSION.SDK_INT > 26) {
            throw null;
        }
    }

    private RectF getBoundsAsRectF() {
        new RectF();
        throw null;
    }

    public boolean e() {
        if (this.q == null) {
            return false;
        }
        throw null;
    }

    public boolean f() {
        return this.t;
    }

    @Override // c.d.a.a
    public ColorStateList getCardBackgroundColor() {
        throw null;
    }

    public ColorStateList getCardForegroundColor() {
        throw null;
    }

    float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        throw null;
    }

    public int getCheckedIconMargin() {
        throw null;
    }

    public int getCheckedIconSize() {
        throw null;
    }

    public ColorStateList getCheckedIconTint() {
        throw null;
    }

    @Override // c.d.a.a
    public int getContentPaddingBottom() {
        throw null;
    }

    @Override // c.d.a.a
    public int getContentPaddingLeft() {
        throw null;
    }

    @Override // c.d.a.a
    public int getContentPaddingRight() {
        throw null;
    }

    @Override // c.d.a.a
    public int getContentPaddingTop() {
        throw null;
    }

    public float getProgress() {
        throw null;
    }

    @Override // c.d.a.a
    public float getRadius() {
        throw null;
    }

    public ColorStateList getRippleColor() {
        throw null;
    }

    public e.c.b.c.c0.k getShapeAppearanceModel() {
        throw null;
    }

    @Deprecated
    public int getStrokeColor() {
        throw null;
    }

    public ColorStateList getStrokeColorStateList() {
        throw null;
    }

    public int getStrokeWidth() {
        throw null;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.s;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 3);
        if (e()) {
            FrameLayout.mergeDrawableStates(iArrOnCreateDrawableState, f15299m);
        }
        if (isChecked()) {
            FrameLayout.mergeDrawableStates(iArrOnCreateDrawableState, n);
        }
        if (f()) {
            FrameLayout.mergeDrawableStates(iArrOnCreateDrawableState, o);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(e());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // c.d.a.a, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        getMeasuredWidth();
        getMeasuredHeight();
        throw null;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.r) {
            throw null;
        }
    }

    void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // c.d.a.a
    public void setCardBackgroundColor(int i2) {
        ColorStateList.valueOf(i2);
        throw null;
    }

    @Override // c.d.a.a
    public void setCardElevation(float f2) {
        super.setCardElevation(f2);
        throw null;
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setCheckable(boolean z) {
        throw null;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.s != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        throw null;
    }

    public void setCheckedIconMargin(int i2) {
        throw null;
    }

    public void setCheckedIconMarginResource(int i2) throws Resources.NotFoundException {
        if (i2 == -1) {
            return;
        }
        getResources().getDimensionPixelSize(i2);
        throw null;
    }

    public void setCheckedIconResource(int i2) {
        c.a.k.a.a.d(getContext(), i2);
        throw null;
    }

    public void setCheckedIconSize(int i2) {
        throw null;
    }

    public void setCheckedIconSizeResource(int i2) throws Resources.NotFoundException {
        if (i2 == 0) {
            return;
        }
        getResources().getDimensionPixelSize(i2);
        throw null;
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        throw null;
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        if (this.q != null) {
            throw null;
        }
    }

    public void setDragged(boolean z) {
        if (this.t != z) {
            this.t = z;
            refreshDrawableState();
            d();
            invalidate();
        }
    }

    @Override // c.d.a.a
    public void setMaxCardElevation(float f2) {
        super.setMaxCardElevation(f2);
        throw null;
    }

    public void setOnCheckedChangeListener(InterfaceC0182a interfaceC0182a) {
        this.u = interfaceC0182a;
    }

    @Override // c.d.a.a
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        throw null;
    }

    public void setProgress(float f2) {
        throw null;
    }

    @Override // c.d.a.a
    public void setRadius(float f2) {
        super.setRadius(f2);
        throw null;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setRippleColorResource(int i2) throws Resources.NotFoundException {
        c.a.k.a.a.c(getContext(), i2);
        throw null;
    }

    @Override // e.c.b.c.c0.n
    public void setShapeAppearanceModel(e.c.b.c.c0.k kVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(kVar.u(getBoundsAsRectF()));
        }
        throw null;
    }

    public void setStrokeColor(int i2) {
        ColorStateList.valueOf(i2);
        throw null;
    }

    public void setStrokeWidth(int i2) {
        throw null;
    }

    @Override // c.d.a.a
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        throw null;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (e() && isEnabled()) {
            this.s = !this.s;
            refreshDrawableState();
            d();
            InterfaceC0182a interfaceC0182a = this.u;
            if (interfaceC0182a != null) {
                interfaceC0182a.a(this, this.s);
            }
        }
    }

    @Override // c.d.a.a
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        throw null;
    }
}