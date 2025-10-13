package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.j;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.h.l.s;
import c.h.l.t;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.b;
import com.google.android.material.internal.l;
import e.c.b.c.c0.n;
import e.c.b.c.k;
import e.c.b.c.m.h;
import java.util.List;

/* loaded from: classes.dex */
public class FloatingActionButton extends l implements s, androidx.core.widget.l, e.c.b.c.w.a, n, CoordinatorLayout.b {

    /* renamed from: f, reason: collision with root package name */
    private static final int f11627f = k.f15245g;

    /* renamed from: g, reason: collision with root package name */
    private ColorStateList f11628g;

    /* renamed from: h, reason: collision with root package name */
    private PorterDuff.Mode f11629h;

    /* renamed from: i, reason: collision with root package name */
    private ColorStateList f11630i;

    /* renamed from: j, reason: collision with root package name */
    private PorterDuff.Mode f11631j;

    /* renamed from: k, reason: collision with root package name */
    private ColorStateList f11632k;

    /* renamed from: l, reason: collision with root package name */
    private int f11633l;

    /* renamed from: m, reason: collision with root package name */
    private int f11634m;
    private int n;
    private int o;
    boolean p;
    final Rect q;
    private final Rect r;
    private final androidx.appcompat.widget.n s;
    private com.google.android.material.floatingactionbutton.b t;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: E */
        public /* bridge */ /* synthetic */ boolean b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.b(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: H */
        public /* bridge */ /* synthetic */ boolean h(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.h(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: I */
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i2) {
            return super.l(coordinatorLayout, floatingActionButton, i2);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ void g(CoordinatorLayout.f fVar) {
            super.g(fVar);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    class a implements b.j {
        final /* synthetic */ b a;

        a(b bVar) {
            this.a = bVar;
        }

        @Override // com.google.android.material.floatingactionbutton.b.j
        public void a() {
            this.a.b(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.b.j
        public void b() {
            this.a.a(FloatingActionButton.this);
        }
    }

    public static abstract class b {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b(FloatingActionButton floatingActionButton) {
        }
    }

    private class c implements e.c.b.c.b0.b {
        c() {
        }

        @Override // e.c.b.c.b0.b
        public void a(int i2, int i3, int i4, int i5) {
            FloatingActionButton.this.q.set(i2, i3, i4, i5);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i2 + floatingActionButton.n, i3 + FloatingActionButton.this.n, i4 + FloatingActionButton.this.n, i5 + FloatingActionButton.this.n);
        }

        @Override // e.c.b.c.b0.b
        public boolean b() {
            return FloatingActionButton.this.p;
        }

        @Override // e.c.b.c.b0.b
        public void c(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }
    }

    class d<T extends FloatingActionButton> implements b.i {
        private final e.c.b.c.m.k<T> a;

        d(e.c.b.c.m.k<T> kVar) {
            this.a = kVar;
        }

        @Override // com.google.android.material.floatingactionbutton.b.i
        public void a() {
            this.a.b(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.b.i
        public void b() {
            this.a.a(FloatingActionButton.this);
        }

        public boolean equals(Object obj) {
            return (obj instanceof d) && ((d) obj).a.equals(this.a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    private com.google.android.material.floatingactionbutton.b getImpl() {
        if (this.t == null) {
            this.t = h();
        }
        return this.t;
    }

    private com.google.android.material.floatingactionbutton.b h() {
        return Build.VERSION.SDK_INT >= 21 ? new com.google.android.material.floatingactionbutton.c(this, new c()) : new com.google.android.material.floatingactionbutton.b(this, new c());
    }

    private int k(int i2) {
        int i3 = this.f11634m;
        if (i3 != 0) {
            return i3;
        }
        Resources resources = getResources();
        return i2 != -1 ? i2 != 1 ? resources.getDimensionPixelSize(e.c.b.c.d.f15186d) : resources.getDimensionPixelSize(e.c.b.c.d.f15185c) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? k(1) : k(0);
    }

    private void p(Rect rect) {
        int i2 = rect.left;
        Rect rect2 = this.q;
        rect.left = i2 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    private void q() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f11630i;
        if (colorStateList == null) {
            androidx.core.graphics.drawable.a.c(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f11631j;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(j.e(colorForState, mode));
    }

    private static int r(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i2, size);
        }
        if (mode == 0) {
            return i2;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    private b.j u(b bVar) {
        if (bVar == null) {
            return null;
        }
        return new a(bVar);
    }

    @Override // e.c.b.c.w.a
    public boolean a() {
        throw null;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().C(getDrawableState());
    }

    public void e(Animator.AnimatorListener animatorListener) {
        getImpl().d(animatorListener);
    }

    public void f(Animator.AnimatorListener animatorListener) {
        getImpl().e(animatorListener);
    }

    public void g(e.c.b.c.m.k<? extends FloatingActionButton> kVar) {
        getImpl().f(new d(kVar));
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f11628g;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f11629h;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().m();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().p();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().s();
    }

    public Drawable getContentBackground() {
        return getImpl().j();
    }

    public int getCustomSize() {
        return this.f11634m;
    }

    public int getExpandedComponentIdHint() {
        throw null;
    }

    public h getHideMotionSpec() {
        return getImpl().o();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f11632k;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f11632k;
    }

    public e.c.b.c.c0.k getShapeAppearanceModel() {
        return (e.c.b.c.c0.k) c.h.k.h.c(getImpl().t());
    }

    public h getShowMotionSpec() {
        return getImpl().u();
    }

    public int getSize() {
        return this.f11633l;
    }

    int getSizeDimension() {
        return k(this.f11633l);
    }

    @Override // c.h.l.s
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Override // c.h.l.s
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Override // androidx.core.widget.l
    public ColorStateList getSupportImageTintList() {
        return this.f11630i;
    }

    @Override // androidx.core.widget.l
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f11631j;
    }

    public boolean getUseCompatPadding() {
        return this.p;
    }

    @Deprecated
    public boolean i(Rect rect) {
        if (!t.Q(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        p(rect);
        return true;
    }

    public void j(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        p(rect);
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().y();
    }

    public void l(b bVar) {
        m(bVar, true);
    }

    void m(b bVar, boolean z) {
        getImpl().v(u(bVar), z);
    }

    public boolean n() {
        return getImpl().w();
    }

    public boolean o() {
        return getImpl().x();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().z();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().B();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i2, int i3) {
        int sizeDimension = getSizeDimension();
        this.n = (sizeDimension - this.o) / 2;
        getImpl().b0();
        int iMin = Math.min(r(sizeDimension, i2), r(sizeDimension, i3));
        Rect rect = this.q;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof e.c.b.c.d0.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e.c.b.c.d0.a aVar = (e.c.b.c.d0.a) parcelable;
        super.onRestoreInstanceState(aVar.a());
        throw null;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        new e.c.b.c.d0.a(parcelableOnSaveInstanceState);
        throw null;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && i(this.r) && !this.r.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void s(b bVar) {
        t(bVar, true);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f11628g != colorStateList) {
            this.f11628g = colorStateList;
            getImpl().J(colorStateList);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f11629h != mode) {
            this.f11629h = mode;
            getImpl().K(mode);
        }
    }

    public void setCompatElevation(float f2) {
        getImpl().L(f2);
    }

    public void setCompatElevationResource(int i2) {
        setCompatElevation(getResources().getDimension(i2));
    }

    public void setCompatHoveredFocusedTranslationZ(float f2) {
        getImpl().O(f2);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i2) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i2));
    }

    public void setCompatPressedTranslationZ(float f2) {
        getImpl().Q(f2);
    }

    public void setCompatPressedTranslationZResource(int i2) {
        setCompatPressedTranslationZ(getResources().getDimension(i2));
    }

    public void setCustomSize(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i2 != this.f11634m) {
            this.f11634m = i2;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        getImpl().c0(f2);
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().n()) {
            getImpl().M(z);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i2) {
        throw null;
    }

    public void setHideMotionSpec(h hVar) {
        getImpl().N(hVar);
    }

    public void setHideMotionSpecResource(int i2) {
        setHideMotionSpec(h.c(getContext(), i2));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().a0();
            if (this.f11630i != null) {
                q();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i2) {
        this.s.g(i2);
        q();
    }

    public void setRippleColor(int i2) {
        setRippleColor(ColorStateList.valueOf(i2));
    }

    @Override // android.view.View
    public void setScaleX(float f2) {
        super.setScaleX(f2);
        getImpl().G();
    }

    @Override // android.view.View
    public void setScaleY(float f2) {
        super.setScaleY(f2);
        getImpl().G();
    }

    public void setShadowPaddingEnabled(boolean z) {
        getImpl().S(z);
    }

    @Override // e.c.b.c.c0.n
    public void setShapeAppearanceModel(e.c.b.c.c0.k kVar) {
        getImpl().T(kVar);
    }

    public void setShowMotionSpec(h hVar) {
        getImpl().U(hVar);
    }

    public void setShowMotionSpecResource(int i2) {
        setShowMotionSpec(h.c(getContext(), i2));
    }

    public void setSize(int i2) {
        this.f11634m = 0;
        if (i2 != this.f11633l) {
            this.f11633l = i2;
            requestLayout();
        }
    }

    @Override // c.h.l.s
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    @Override // c.h.l.s
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    @Override // androidx.core.widget.l
    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f11630i != colorStateList) {
            this.f11630i = colorStateList;
            q();
        }
    }

    @Override // androidx.core.widget.l
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f11631j != mode) {
            this.f11631j = mode;
            q();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f2) {
        super.setTranslationX(f2);
        getImpl().H();
    }

    @Override // android.view.View
    public void setTranslationY(float f2) {
        super.setTranslationY(f2);
        getImpl().H();
    }

    @Override // android.view.View
    public void setTranslationZ(float f2) {
        super.setTranslationZ(f2);
        getImpl().H();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.p != z) {
            this.p = z;
            getImpl().A();
        }
    }

    @Override // com.google.android.material.internal.l, android.widget.ImageView, android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
    }

    void t(b bVar, boolean z) {
        getImpl().Y(u(bVar), z);
    }

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {
        private Rect a;

        /* renamed from: b, reason: collision with root package name */
        private b f11635b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f11636c;

        public BaseBehavior() {
            this.f11636c = true;
        }

        private static boolean F(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private void G(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.q;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            int i2 = 0;
            int i3 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) fVar).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) fVar).leftMargin ? -rect.left : 0;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) {
                i2 = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) fVar).topMargin) {
                i2 = -rect.top;
            }
            if (i2 != 0) {
                t.W(floatingActionButton, i2);
            }
            if (i3 != 0) {
                t.V(floatingActionButton, i3);
            }
        }

        private boolean J(View view, FloatingActionButton floatingActionButton) {
            return this.f11636c && ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).e() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        private boolean K(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!J(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            com.google.android.material.internal.b.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.m(this.f11635b, false);
                return true;
            }
            floatingActionButton.t(this.f11635b, false);
            return true;
        }

        private boolean L(View view, FloatingActionButton floatingActionButton) {
            if (!J(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.m(this.f11635b, false);
                return true;
            }
            floatingActionButton.t(this.f11635b, false);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public boolean b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.q;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public boolean h(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                K(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            }
            if (!F(view)) {
                return false;
            }
            L(view, floatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public boolean l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i2) {
            List<View> listR = coordinatorLayout.r(floatingActionButton);
            int size = listR.size();
            for (int i3 = 0; i3 < size; i3++) {
                View view = listR.get(i3);
                if (!(view instanceof AppBarLayout)) {
                    if (F(view) && L(view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (K(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.I(floatingActionButton, i2);
            G(coordinatorLayout, floatingActionButton);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void g(CoordinatorLayout.f fVar) {
            if (fVar.f802h == 0) {
                fVar.f802h = 80;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.c.b.c.l.r1);
            this.f11636c = typedArrayObtainStyledAttributes.getBoolean(e.c.b.c.l.s1, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f11632k != colorStateList) {
            this.f11632k = colorStateList;
            getImpl().R(this.f11632k);
        }
    }
}