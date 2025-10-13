package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.h.l.b0;
import c.h.l.c0.c;
import c.h.l.c0.f;
import c.h.l.j;
import c.h.l.t;
import e.c.b.c.c0.g;
import e.c.b.c.c0.h;
import e.c.b.c.k;
import e.c.b.c.l;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {

    /* renamed from: e */
    private static final int f11388e = k.f15243e;

    /* renamed from: f */
    private int f11389f;

    /* renamed from: g */
    private int f11390g;

    /* renamed from: h */
    private int f11391h;

    /* renamed from: i */
    private int f11392i;

    /* renamed from: j */
    private boolean f11393j;

    /* renamed from: k */
    private int f11394k;

    /* renamed from: l */
    private b0 f11395l;

    /* renamed from: m */
    private List<b> f11396m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private int r;
    private WeakReference<View> s;
    private ValueAnimator t;
    private int[] u;
    private Drawable v;

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        @Override // com.google.android.material.appbar.c
        public /* bridge */ /* synthetic */ int E() {
            return super.E();
        }

        @Override // com.google.android.material.appbar.c
        public /* bridge */ /* synthetic */ boolean G(int i2) {
            return super.G(i2);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: g0 */
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i2) {
            return super.l(coordinatorLayout, appBarLayout, i2);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: h0 */
        public /* bridge */ /* synthetic */ boolean m(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i2, int i3, int i4, int i5) {
            return super.m(coordinatorLayout, appBarLayout, i2, i3, i4, i5);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: i0 */
        public /* bridge */ /* synthetic */ void q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i2, int i3, int[] iArr, int i4) throws Resources.NotFoundException {
            super.q(coordinatorLayout, appBarLayout, view, i2, i3, iArr, i4);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: j0 */
        public /* bridge */ /* synthetic */ void t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
            super.t(coordinatorLayout, appBarLayout, view, i2, i3, i4, i5, i6, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: k0 */
        public /* bridge */ /* synthetic */ void x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.x(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: l0 */
        public /* bridge */ /* synthetic */ Parcelable y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.y(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: m0 */
        public /* bridge */ /* synthetic */ boolean A(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i2, int i3) {
            return super.A(coordinatorLayout, appBarLayout, view, view2, i2, i3);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: n0 */
        public /* bridge */ /* synthetic */ void C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i2) throws Resources.NotFoundException {
            super.C(coordinatorLayout, appBarLayout, view, i2);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends com.google.android.material.appbar.b {
        public ScrollingViewBehavior() {
        }

        private static int R(AppBarLayout appBarLayout) {
            CoordinatorLayout.c cVarF = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f();
            if (cVarF instanceof BaseBehavior) {
                return ((BaseBehavior) cVarF).M();
            }
            return 0;
        }

        private void S(View view, View view2) {
            CoordinatorLayout.c cVarF = ((CoordinatorLayout.f) view2.getLayoutParams()).f();
            if (cVarF instanceof BaseBehavior) {
                t.W(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) cVarF).f11397k) + M()) - I(view2));
            }
        }

        private void T(View view, View view2) throws Resources.NotFoundException {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.j()) {
                    appBarLayout.p(appBarLayout.r(view));
                }
            }
        }

        @Override // com.google.android.material.appbar.b
        float J(View view) throws NoSuchFieldException {
            int i2;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int iR = R(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + iR > downNestedPreScrollRange) && (i2 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (iR / i2) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.b
        int L(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.L(view);
        }

        @Override // com.google.android.material.appbar.b
        /* renamed from: Q */
        public AppBarLayout H(List<View> list) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = list.get(i2);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) throws Resources.NotFoundException {
            S(view, view2);
            T(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                t.e0(coordinatorLayout, c.a.f3142m.b());
                t.e0(coordinatorLayout, c.a.n.b());
            }
        }

        @Override // com.google.android.material.appbar.c, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i2) {
            return super.l(coordinatorLayout, view, i2);
        }

        @Override // com.google.android.material.appbar.b, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean m(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int i5) {
            return super.m(coordinatorLayout, view, i2, i3, i4, i5);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout appBarLayoutH = H(coordinatorLayout.r(view));
            if (appBarLayoutH != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f11423d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    appBarLayoutH.m(false, !z);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.C3);
            O(typedArrayObtainStyledAttributes.getDimensionPixelSize(l.D3, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    class a implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ g a;

        a(g gVar) {
            this.a = gVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.a.W(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public interface b<T extends AppBarLayout> {
        void a(T t, int i2);
    }

    private void a() {
        WeakReference<View> weakReference = this.s;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.s = null;
    }

    private View b(View view) {
        int i2;
        if (this.s == null && (i2 = this.r) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i2) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.r);
            }
            if (viewFindViewById != null) {
                this.s = new WeakReference<>(viewFindViewById);
            }
        }
        WeakReference<View> weakReference = this.s;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private boolean g() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (((c) getChildAt(i2).getLayoutParams()).c()) {
                return true;
            }
        }
        return false;
    }

    private void i() {
        this.f11390g = -1;
        this.f11391h = -1;
        this.f11392i = -1;
    }

    private void n(boolean z, boolean z2, boolean z3) {
        this.f11394k = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    private boolean o(boolean z) {
        if (this.o == z) {
            return false;
        }
        this.o = z;
        refreshDrawableState();
        return true;
    }

    private boolean q() {
        return this.v != null && getTopInset() > 0;
    }

    private boolean s() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        return (childAt.getVisibility() == 8 || t.y(childAt)) ? false : true;
    }

    private void t(g gVar, boolean z) throws Resources.NotFoundException {
        float dimension = getResources().getDimension(e.c.b.c.d.a);
        float f2 = z ? 0.0f : dimension;
        if (!z) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, dimension);
        this.t = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(getResources().getInteger(e.c.b.c.g.a));
        this.t.setInterpolator(e.c.b.c.m.a.a);
        this.t.addUpdateListener(new a(gVar));
        this.t.start();
    }

    private void u() {
        setWillNotDraw(!q());
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: c */
    public c generateDefaultLayoutParams() {
        return new c(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: d */
    public c generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (q()) {
            int iSave = canvas.save();
            canvas.translate(0.0f, -this.f11389f);
            this.v.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.v;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: e */
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (Build.VERSION.SDK_INT < 19 || !(layoutParams instanceof LinearLayout.LayoutParams)) ? layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams) : new c((LinearLayout.LayoutParams) layoutParams);
    }

    boolean f() {
        return this.f11393j;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        return new Behavior();
    }

    int getDownNestedPreScrollRange() throws NoSuchFieldException {
        int iMin;
        int iC;
        int i2 = this.f11391h;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            c cVar = (c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = cVar.a;
            if ((i4 & 5) != 5) {
                if (i3 > 0) {
                    break;
                }
            } else {
                int i5 = ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin;
                if ((i4 & 8) != 0) {
                    iC = t.C(childAt);
                } else if ((i4 & 2) != 0) {
                    iC = measuredHeight - t.C(childAt);
                } else {
                    iMin = i5 + measuredHeight;
                    if (childCount == 0 && t.y(childAt)) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                    i3 += iMin;
                }
                iMin = i5 + iC;
                if (childCount == 0) {
                    iMin = Math.min(iMin, measuredHeight - getTopInset());
                }
                i3 += iMin;
            }
        }
        int iMax = Math.max(0, i3);
        this.f11391h = iMax;
        return iMax;
    }

    int getDownNestedScrollRange() {
        int i2 = this.f11392i;
        if (i2 != -1) {
            return i2;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int iC = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            c cVar = (c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin;
            int i4 = cVar.a;
            if ((i4 & 1) == 0) {
                break;
            }
            iC += measuredHeight;
            if ((i4 & 2) != 0) {
                iC -= t.C(childAt);
                break;
            }
            i3++;
        }
        int iMax = Math.max(0, iC);
        this.f11392i = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.r;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() throws NoSuchFieldException {
        int topInset = getTopInset();
        int iC = t.C(this);
        if (iC == 0) {
            int childCount = getChildCount();
            iC = childCount >= 1 ? t.C(getChildAt(childCount - 1)) : 0;
            if (iC == 0) {
                return getHeight() / 3;
            }
        }
        return (iC * 2) + topInset;
    }

    int getPendingAction() {
        return this.f11394k;
    }

    public Drawable getStatusBarForeground() {
        return this.v;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    final int getTopInset() {
        b0 b0Var = this.f11395l;
        if (b0Var != null) {
            return b0Var.h();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i2 = this.f11390g;
        if (i2 != -1) {
            return i2;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int iC = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            c cVar = (c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = cVar.a;
            if ((i4 & 1) == 0) {
                break;
            }
            iC += measuredHeight + ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin;
            if (i3 == 0 && t.y(childAt)) {
                iC -= getTopInset();
            }
            if ((i4 & 2) != 0) {
                iC -= t.C(childAt);
                break;
            }
            i3++;
        }
        int iMax = Math.max(0, iC);
        this.f11390g = iMax;
        return iMax;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    boolean h() {
        return getTotalScrollRange() != 0;
    }

    public boolean j() {
        return this.q;
    }

    void k(int i2) {
        this.f11389f = i2;
        if (!willNotDraw()) {
            t.b0(this);
        }
        List<b> list = this.f11396m;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                b bVar = this.f11396m.get(i3);
                if (bVar != null) {
                    bVar.a(this, i2);
                }
            }
        }
    }

    void l() {
        this.f11394k = 0;
    }

    public void m(boolean z, boolean z2) {
        n(z, z2, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i2) {
        if (this.u == null) {
            this.u = new int[4];
        }
        int[] iArr = this.u;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + iArr.length);
        boolean z = this.o;
        int i3 = e.c.b.c.b.D;
        if (!z) {
            i3 = -i3;
        }
        iArr[0] = i3;
        iArr[1] = (z && this.p) ? e.c.b.c.b.E : -e.c.b.c.b.E;
        int i4 = e.c.b.c.b.B;
        if (!z) {
            i4 = -i4;
        }
        iArr[2] = i4;
        iArr[3] = (z && this.p) ? e.c.b.c.b.A : -e.c.b.c.b.A;
        return LinearLayout.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        boolean z2 = true;
        if (t.y(this) && s()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                t.W(getChildAt(childCount), topInset);
            }
        }
        i();
        this.f11393j = false;
        int childCount2 = getChildCount();
        int i6 = 0;
        while (true) {
            if (i6 >= childCount2) {
                break;
            }
            if (((c) getChildAt(i6).getLayoutParams()).b() != null) {
                this.f11393j = true;
                break;
            }
            i6++;
        }
        Drawable drawable = this.v;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.n) {
            return;
        }
        if (!this.q && !g()) {
            z2 = false;
        }
        o(z2);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i3);
        if (mode != 1073741824 && t.y(this) && s()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = c.h.f.a.b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i3));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        i();
    }

    boolean p(boolean z) throws Resources.NotFoundException {
        if (this.p == z) {
            return false;
        }
        this.p = z;
        refreshDrawableState();
        if (!this.q || !(getBackground() instanceof g)) {
            return true;
        }
        t((g) getBackground(), z);
        return true;
    }

    boolean r(View view) {
        View viewB = b(view);
        if (viewB != null) {
            view = viewB;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        h.d(this, f2);
    }

    public void setExpanded(boolean z) {
        m(z, t.Q(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.q = z;
    }

    public void setLiftOnScrollTargetViewId(int i2) {
        this.r = i2;
        a();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i2) {
        if (i2 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i2);
    }

    public void setStatusBarForeground(Drawable drawable) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Drawable drawable2 = this.v;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.v = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.v.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.a.m(this.v, t.B(this));
                this.v.setVisible(getVisibility() == 0, false);
                this.v.setCallback(this);
            }
            u();
            t.b0(this);
        }
    }

    public void setStatusBarForegroundColor(int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        setStatusBarForeground(new ColorDrawable(i2));
    }

    public void setStatusBarForegroundResource(int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        setStatusBarForeground(c.a.k.a.a.d(getContext(), i2));
    }

    @Deprecated
    public void setTargetElevation(float f2) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 21) {
            e.a(this, f2);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.v;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.v;
    }

    protected static class BaseBehavior<T extends AppBarLayout> extends com.google.android.material.appbar.a<T> {

        /* renamed from: k */
        private int f11397k;

        /* renamed from: l */
        private int f11398l;

        /* renamed from: m */
        private ValueAnimator f11399m;
        private int n;
        private boolean o;
        private float p;
        private WeakReference<View> q;
        private d r;

        class a implements ValueAnimator.AnimatorUpdateListener {
            final /* synthetic */ CoordinatorLayout a;

            /* renamed from: b */
            final /* synthetic */ AppBarLayout f11400b;

            a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.a = coordinatorLayout;
                this.f11400b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.P(this.a, this.f11400b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        class b implements f {
            final /* synthetic */ CoordinatorLayout a;

            /* renamed from: b */
            final /* synthetic */ AppBarLayout f11402b;

            /* renamed from: c */
            final /* synthetic */ View f11403c;

            /* renamed from: d */
            final /* synthetic */ int f11404d;

            b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i2) {
                this.a = coordinatorLayout;
                this.f11402b = appBarLayout;
                this.f11403c = view;
                this.f11404d = i2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // c.h.l.c0.f
            public boolean a(View view, f.a aVar) throws Resources.NotFoundException {
                BaseBehavior.this.q(this.a, this.f11402b, this.f11403c, 0, this.f11404d, new int[]{0, 0}, 1);
                return true;
            }
        }

        class c implements f {
            final /* synthetic */ AppBarLayout a;

            /* renamed from: b */
            final /* synthetic */ boolean f11406b;

            c(AppBarLayout appBarLayout, boolean z) {
                this.a = appBarLayout;
                this.f11406b = z;
            }

            @Override // c.h.l.c0.f
            public boolean a(View view, f.a aVar) {
                this.a.setExpanded(this.f11406b);
                return true;
            }
        }

        public static abstract class d<T extends AppBarLayout> {
        }

        public BaseBehavior() {
            this.n = -1;
        }

        private void S(CoordinatorLayout coordinatorLayout, T t, View view) {
            if (M() != (-t.getTotalScrollRange()) && view.canScrollVertically(1)) {
                T(coordinatorLayout, t, c.a.f3142m, false);
            }
            if (M() != 0) {
                if (!view.canScrollVertically(-1)) {
                    T(coordinatorLayout, t, c.a.n, true);
                    return;
                }
                int i2 = -t.getDownNestedPreScrollRange();
                if (i2 != 0) {
                    t.g0(coordinatorLayout, c.a.n, null, new b(coordinatorLayout, t, view, i2));
                }
            }
        }

        private void T(CoordinatorLayout coordinatorLayout, T t, c.a aVar, boolean z) {
            t.g0(coordinatorLayout, aVar, null, new c(t, z));
        }

        private void U(CoordinatorLayout coordinatorLayout, T t, int i2, float f2) {
            int iAbs = Math.abs(M() - i2);
            float fAbs = Math.abs(f2);
            V(coordinatorLayout, t, i2, fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / t.getHeight()) + 1.0f) * 150.0f));
        }

        private void V(CoordinatorLayout coordinatorLayout, T t, int i2, int i3) {
            int iM = M();
            if (iM == i2) {
                ValueAnimator valueAnimator = this.f11399m;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f11399m.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f11399m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f11399m = valueAnimator3;
                valueAnimator3.setInterpolator(e.c.b.c.m.a.f15267e);
                this.f11399m.addUpdateListener(new a(coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.f11399m.setDuration(Math.min(i3, 600));
            this.f11399m.setIntValues(iM, i2);
            this.f11399m.start();
        }

        private boolean X(CoordinatorLayout coordinatorLayout, T t, View view) {
            return t.h() && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight();
        }

        private static boolean Y(int i2, int i3) {
            return (i2 & i3) == i3;
        }

        private View Z(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                if ((childAt instanceof j) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        private static View a0(AppBarLayout appBarLayout, int i2) {
            int iAbs = Math.abs(i2);
            int childCount = appBarLayout.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = appBarLayout.getChildAt(i3);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private int b0(T t, int i2) {
            int childCount = t.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = t.getChildAt(i3);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                c cVar = (c) childAt.getLayoutParams();
                if (Y(cVar.a(), 32)) {
                    top -= ((LinearLayout.LayoutParams) cVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) cVar).bottomMargin;
                }
                int i4 = -i2;
                if (top <= i4 && bottom >= i4) {
                    return i3;
                }
            }
            return -1;
        }

        private int e0(T t, int i2) {
            int iAbs = Math.abs(i2);
            int childCount = t.getChildCount();
            int topInset = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = t.getChildAt(i3);
                c cVar = (c) childAt.getLayoutParams();
                Interpolator interpolatorB = cVar.b();
                if (iAbs < childAt.getTop() || iAbs > childAt.getBottom()) {
                    i3++;
                } else if (interpolatorB != null) {
                    int iA = cVar.a();
                    if ((iA & 1) != 0) {
                        topInset = 0 + childAt.getHeight() + ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin;
                        if ((iA & 2) != 0) {
                            topInset -= t.C(childAt);
                        }
                    }
                    if (t.y(childAt)) {
                        topInset -= t.getTopInset();
                    }
                    if (topInset > 0) {
                        float f2 = topInset;
                        return Integer.signum(i2) * (childAt.getTop() + Math.round(f2 * interpolatorB.getInterpolation((iAbs - childAt.getTop()) / f2)));
                    }
                }
            }
            return i2;
        }

        private boolean p0(CoordinatorLayout coordinatorLayout, T t) {
            List<View> listS = coordinatorLayout.s(t);
            int size = listS.size();
            for (int i2 = 0; i2 < size; i2++) {
                CoordinatorLayout.c cVarF = ((CoordinatorLayout.f) listS.get(i2).getLayoutParams()).f();
                if (cVarF instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) cVarF).K() != 0;
                }
            }
            return false;
        }

        private void q0(CoordinatorLayout coordinatorLayout, T t) {
            int iM = M();
            int iB0 = b0(t, iM);
            if (iB0 >= 0) {
                View childAt = t.getChildAt(iB0);
                c cVar = (c) childAt.getLayoutParams();
                int iA = cVar.a();
                if ((iA & 17) == 17) {
                    int i2 = -childAt.getTop();
                    int iC = -childAt.getBottom();
                    if (iB0 == t.getChildCount() - 1) {
                        iC += t.getTopInset();
                    }
                    if (Y(iA, 2)) {
                        iC += t.C(childAt);
                    } else if (Y(iA, 5)) {
                        int iC2 = t.C(childAt) + iC;
                        if (iM < iC2) {
                            i2 = iC2;
                        } else {
                            iC = iC2;
                        }
                    }
                    if (Y(iA, 32)) {
                        i2 += ((LinearLayout.LayoutParams) cVar).topMargin;
                        iC -= ((LinearLayout.LayoutParams) cVar).bottomMargin;
                    }
                    if (iM < (iC + i2) / 2) {
                        i2 = iC;
                    }
                    U(coordinatorLayout, t, c.h.f.a.b(i2, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        private void r0(CoordinatorLayout coordinatorLayout, T t) {
            t.e0(coordinatorLayout, c.a.f3142m.b());
            t.e0(coordinatorLayout, c.a.n.b());
            View viewZ = Z(coordinatorLayout);
            if (viewZ == null || t.getTotalScrollRange() == 0 || !(((CoordinatorLayout.f) viewZ.getLayoutParams()).f() instanceof ScrollingViewBehavior)) {
                return;
            }
            S(coordinatorLayout, t, viewZ);
        }

        private void s0(CoordinatorLayout coordinatorLayout, T t, int i2, int i3, boolean z) throws NoSuchFieldException, Resources.NotFoundException {
            View viewA0 = a0(t, i2);
            if (viewA0 != null) {
                int iA = ((c) viewA0.getLayoutParams()).a();
                boolean zR = false;
                if ((iA & 1) != 0) {
                    int iC = t.C(viewA0);
                    if (i3 <= 0 || (iA & 12) == 0 ? !((iA & 2) == 0 || (-i2) < (viewA0.getBottom() - iC) - t.getTopInset()) : (-i2) >= (viewA0.getBottom() - iC) - t.getTopInset()) {
                        zR = true;
                    }
                }
                if (t.j()) {
                    zR = t.r(Z(coordinatorLayout));
                }
                boolean zP = t.p(zR);
                if (z || (zP && p0(coordinatorLayout, t))) {
                    t.jumpDrawablesToCurrentState();
                }
            }
        }

        @Override // com.google.android.material.appbar.a
        int M() {
            return E() + this.f11397k;
        }

        @Override // com.google.android.material.appbar.a
        /* renamed from: W */
        public boolean H(T t) {
            if (this.r != null) {
                throw null;
            }
            WeakReference<View> weakReference = this.q;
            if (weakReference == null) {
                return true;
            }
            View view = weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        @Override // com.google.android.material.appbar.a
        /* renamed from: c0 */
        public int K(T t) {
            return -t.getDownNestedScrollRange();
        }

        @Override // com.google.android.material.appbar.a
        /* renamed from: d0 */
        public int L(T t) {
            return t.getTotalScrollRange();
        }

        @Override // com.google.android.material.appbar.a
        /* renamed from: f0 */
        public void N(CoordinatorLayout coordinatorLayout, T t) throws Resources.NotFoundException {
            q0(coordinatorLayout, t);
            if (t.j()) {
                t.p(t.r(Z(coordinatorLayout)));
            }
        }

        @Override // com.google.android.material.appbar.c, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: g0 */
        public boolean l(CoordinatorLayout coordinatorLayout, T t, int i2) throws NoSuchFieldException, Resources.NotFoundException {
            boolean zL = super.l(coordinatorLayout, t, i2);
            int pendingAction = t.getPendingAction();
            int i3 = this.n;
            if (i3 >= 0 && (pendingAction & 8) == 0) {
                View childAt = t.getChildAt(i3);
                P(coordinatorLayout, t, (-childAt.getBottom()) + (this.o ? t.C(childAt) + t.getTopInset() : Math.round(childAt.getHeight() * this.p)));
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i4 = -t.getUpNestedPreScrollRange();
                    if (z) {
                        U(coordinatorLayout, t, i4, 0.0f);
                    } else {
                        P(coordinatorLayout, t, i4);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        U(coordinatorLayout, t, 0, 0.0f);
                    } else {
                        P(coordinatorLayout, t, 0);
                    }
                }
            }
            t.l();
            this.n = -1;
            G(c.h.f.a.b(E(), -t.getTotalScrollRange(), 0));
            s0(coordinatorLayout, t, E(), 0, true);
            t.k(E());
            r0(coordinatorLayout, t);
            return zL;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: h0 */
        public boolean m(CoordinatorLayout coordinatorLayout, T t, int i2, int i3, int i4, int i5) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) t.getLayoutParams())).height != -2) {
                return super.m(coordinatorLayout, t, i2, i3, i4, i5);
            }
            coordinatorLayout.J(t, i2, i3, View.MeasureSpec.makeMeasureSpec(0, 0), i5);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: i0 */
        public void q(CoordinatorLayout coordinatorLayout, T t, View view, int i2, int i3, int[] iArr, int i4) throws Resources.NotFoundException {
            int i5;
            int downNestedPreScrollRange;
            if (i3 != 0) {
                if (i3 < 0) {
                    int i6 = -t.getTotalScrollRange();
                    i5 = i6;
                    downNestedPreScrollRange = t.getDownNestedPreScrollRange() + i6;
                } else {
                    i5 = -t.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                if (i5 != downNestedPreScrollRange) {
                    iArr[1] = O(coordinatorLayout, t, i3, i5, downNestedPreScrollRange);
                }
            }
            if (t.j()) {
                t.p(t.r(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: j0 */
        public void t(CoordinatorLayout coordinatorLayout, T t, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
            if (i5 < 0) {
                iArr[1] = O(coordinatorLayout, t, i5, -t.getDownNestedScrollRange(), 0);
            }
            if (i5 == 0) {
                r0(coordinatorLayout, t);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: k0 */
        public void x(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (!(parcelable instanceof e)) {
                super.x(coordinatorLayout, t, parcelable);
                this.n = -1;
                return;
            }
            e eVar = (e) parcelable;
            super.x(coordinatorLayout, t, eVar.a());
            this.n = eVar.f11408g;
            this.p = eVar.f11409h;
            this.o = eVar.f11410i;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: l0 */
        public Parcelable y(CoordinatorLayout coordinatorLayout, T t) {
            Parcelable parcelableY = super.y(coordinatorLayout, t);
            int iE = E();
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int bottom = childAt.getBottom() + iE;
                if (childAt.getTop() + iE <= 0 && bottom >= 0) {
                    e eVar = new e(parcelableY);
                    eVar.f11408g = i2;
                    eVar.f11410i = bottom == t.C(childAt) + t.getTopInset();
                    eVar.f11409h = bottom / childAt.getHeight();
                    return eVar;
                }
            }
            return parcelableY;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: m0 */
        public boolean A(CoordinatorLayout coordinatorLayout, T t, View view, View view2, int i2, int i3) {
            ValueAnimator valueAnimator;
            boolean z = (i2 & 2) != 0 && (t.j() || X(coordinatorLayout, t, view));
            if (z && (valueAnimator = this.f11399m) != null) {
                valueAnimator.cancel();
            }
            this.q = null;
            this.f11398l = i3;
            return z;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: n0 */
        public void C(CoordinatorLayout coordinatorLayout, T t, View view, int i2) throws Resources.NotFoundException {
            if (this.f11398l == 0 || i2 == 1) {
                q0(coordinatorLayout, t);
                if (t.j()) {
                    t.p(t.r(view));
                }
            }
            this.q = new WeakReference<>(view);
        }

        @Override // com.google.android.material.appbar.a
        /* renamed from: o0 */
        public int Q(CoordinatorLayout coordinatorLayout, T t, int i2, int i3, int i4) throws NoSuchFieldException, Resources.NotFoundException {
            int iM = M();
            int i5 = 0;
            if (i3 == 0 || iM < i3 || iM > i4) {
                this.f11397k = 0;
            } else {
                int iB = c.h.f.a.b(i2, i3, i4);
                if (iM != iB) {
                    int iE0 = t.f() ? e0(t, iB) : iB;
                    boolean zG = G(iE0);
                    i5 = iM - iB;
                    this.f11397k = iB - iE0;
                    if (!zG && t.f()) {
                        coordinatorLayout.f(t);
                    }
                    t.k(E());
                    s0(coordinatorLayout, t, iB, iB < iM ? -1 : 1, false);
                }
            }
            r0(coordinatorLayout, t);
            return i5;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.n = -1;
        }

        protected static class e extends c.j.a.a {
            public static final Parcelable.Creator<e> CREATOR = new a();

            /* renamed from: g */
            int f11408g;

            /* renamed from: h */
            float f11409h;

            /* renamed from: i */
            boolean f11410i;

            static class a implements Parcelable.ClassLoaderCreator<e> {
                a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public e createFromParcel(Parcel parcel) {
                    return new e(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* renamed from: b */
                public e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new e(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: c */
                public e[] newArray(int i2) {
                    return new e[i2];
                }
            }

            public e(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f11408g = parcel.readInt();
                this.f11409h = parcel.readFloat();
                this.f11410i = parcel.readByte() != 0;
            }

            @Override // c.j.a.a, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i2) {
                super.writeToParcel(parcel, i2);
                parcel.writeInt(this.f11408g);
                parcel.writeFloat(this.f11409h);
                parcel.writeByte(this.f11410i ? (byte) 1 : (byte) 0);
            }

            public e(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public static class c extends LinearLayout.LayoutParams {
        int a;

        /* renamed from: b */
        Interpolator f11412b;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f15263m);
            this.a = typedArrayObtainStyledAttributes.getInt(l.n, 0);
            int i2 = l.o;
            if (typedArrayObtainStyledAttributes.hasValue(i2)) {
                this.f11412b = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(i2, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public int a() {
            return this.a;
        }

        public Interpolator b() {
            return this.f11412b;
        }

        boolean c() {
            int i2 = this.a;
            return (i2 & 1) == 1 && (i2 & 10) != 0;
        }

        public c(int i2, int i3) {
            super(i2, i3);
            this.a = 1;
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 1;
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.a = 1;
        }

        public c(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 1;
        }
    }
}