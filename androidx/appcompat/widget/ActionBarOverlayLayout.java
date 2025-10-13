package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.m;
import c.h.l.b0;
import ch.qos.logback.classic.Level;
import java.lang.reflect.InvocationTargetException;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements c0, c.h.l.n, c.h.l.l, c.h.l.m {

    /* renamed from: e, reason: collision with root package name */
    static final int[] f313e = {c.a.a.f2441b, R.attr.windowContentOverlay};
    private c.h.l.b0 A;
    private c.h.l.b0 B;
    private c.h.l.b0 C;
    private d D;
    private OverScroller E;
    ViewPropertyAnimator F;
    final AnimatorListenerAdapter G;
    private final Runnable H;
    private final Runnable I;
    private final c.h.l.o J;

    /* renamed from: f, reason: collision with root package name */
    private int f314f;

    /* renamed from: g, reason: collision with root package name */
    private int f315g;

    /* renamed from: h, reason: collision with root package name */
    private ContentFrameLayout f316h;

    /* renamed from: i, reason: collision with root package name */
    ActionBarContainer f317i;

    /* renamed from: j, reason: collision with root package name */
    private d0 f318j;

    /* renamed from: k, reason: collision with root package name */
    private Drawable f319k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f320l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f321m;
    private boolean n;
    private boolean o;
    boolean p;
    private int q;
    private int r;
    private final Rect s;
    private final Rect t;
    private final Rect u;
    private final Rect v;
    private final Rect w;
    private final Rect x;
    private final Rect y;
    private c.h.l.b0 z;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.F = null;
            actionBarOverlayLayout.p = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.F = null;
            actionBarOverlayLayout.p = false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.F = actionBarOverlayLayout.f317i.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.G);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.F = actionBarOverlayLayout.f317i.animate().translationY(-ActionBarOverlayLayout.this.f317i.getHeight()).setListener(ActionBarOverlayLayout.this.G);
        }
    }

    public interface d {
        void a();

        void b();

        void c(boolean z);

        void d();

        void e();

        void onWindowVisibilityChanged(int i2);
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(int i2, int i3) {
            super(i2, i3);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f315g = 0;
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        this.v = new Rect();
        this.w = new Rect();
        this.x = new Rect();
        this.y = new Rect();
        c.h.l.b0 b0Var = c.h.l.b0.a;
        this.z = b0Var;
        this.A = b0Var;
        this.B = b0Var;
        this.C = b0Var;
        this.G = new a();
        this.H = new b();
        this.I = new c();
        v(context);
        this.J = new c.h.l.o(this);
    }

    private void A() {
        u();
        this.H.run();
    }

    private boolean B(float f2) {
        this.E.fling(0, 0, 0, (int) f2, 0, 0, Level.ALL_INT, Integer.MAX_VALUE);
        return this.E.getFinalY() > this.f317i.getHeight();
    }

    private void p() {
        u();
        this.I.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean q(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = 1
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = 1
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = 1
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.q(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private d0 t(View view) {
        if (view instanceof d0) {
            return (d0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void v(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f313e);
        this.f314f = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f319k = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f320l = context.getApplicationInfo().targetSdkVersion < 19;
        this.E = new OverScroller(context);
    }

    private void x() {
        u();
        postDelayed(this.I, 600L);
    }

    private void y() {
        u();
        postDelayed(this.H, 600L);
    }

    @Override // androidx.appcompat.widget.c0
    public void a(Menu menu, m.a aVar) {
        z();
        this.f318j.a(menu, aVar);
    }

    @Override // androidx.appcompat.widget.c0
    public boolean b() {
        z();
        return this.f318j.b();
    }

    @Override // androidx.appcompat.widget.c0
    public void c() {
        z();
        this.f318j.c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // androidx.appcompat.widget.c0
    public boolean d() {
        z();
        return this.f318j.d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f319k == null || this.f320l) {
            return;
        }
        int bottom = this.f317i.getVisibility() == 0 ? (int) (this.f317i.getBottom() + this.f317i.getTranslationY() + 0.5f) : 0;
        this.f319k.setBounds(0, bottom, getWidth(), this.f319k.getIntrinsicHeight() + bottom);
        this.f319k.draw(canvas);
    }

    @Override // androidx.appcompat.widget.c0
    public boolean e() {
        z();
        return this.f318j.e();
    }

    @Override // androidx.appcompat.widget.c0
    public boolean f() {
        z();
        return this.f318j.f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 21) {
            return super.fitSystemWindows(rect);
        }
        z();
        boolean zQ = q(this.f317i, rect, true, true, false, true);
        this.v.set(rect);
        c1.a(this, this.v, this.s);
        if (!this.w.equals(this.v)) {
            this.w.set(this.v);
            zQ = true;
        }
        if (!this.t.equals(this.s)) {
            this.t.set(this.s);
            zQ = true;
        }
        if (zQ) {
            requestLayout();
        }
        return true;
    }

    @Override // androidx.appcompat.widget.c0
    public boolean g() {
        z();
        return this.f318j.g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f317i;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.J.a();
    }

    public CharSequence getTitle() {
        z();
        return this.f318j.getTitle();
    }

    @Override // androidx.appcompat.widget.c0
    public void h(int i2) {
        z();
        if (i2 == 2) {
            this.f318j.u();
        } else if (i2 == 5) {
            this.f318j.v();
        } else {
            if (i2 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.c0
    public void i() {
        z();
        this.f318j.h();
    }

    @Override // c.h.l.m
    public void j(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        k(view, i2, i3, i4, i5, i6);
    }

    @Override // c.h.l.l
    public void k(View view, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            onNestedScroll(view, i2, i3, i4, i5);
        }
    }

    @Override // c.h.l.l
    public boolean l(View view, View view2, int i2, int i3) {
        return i3 == 0 && onStartNestedScroll(view, view2, i2);
    }

    @Override // c.h.l.l
    public void m(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    @Override // c.h.l.l
    public void n(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // c.h.l.l
    public void o(View view, int i2, int i3, int[] iArr, int i4) {
        if (i4 == 0) {
            onNestedPreScroll(view, i2, i3, iArr);
        }
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        z();
        c.h.l.b0 b0VarO = c.h.l.b0.o(windowInsets);
        boolean zQ = q(this.f317i, new Rect(b0VarO.f(), b0VarO.h(), b0VarO.g(), b0VarO.e()), true, true, false, true);
        c.h.l.t.g(this, b0VarO, this.s);
        Rect rect = this.s;
        c.h.l.b0 b0VarJ = b0VarO.j(rect.left, rect.top, rect.right, rect.bottom);
        this.z = b0VarJ;
        boolean z = true;
        if (!this.A.equals(b0VarJ)) {
            this.A = this.z;
            zQ = true;
        }
        if (this.t.equals(this.s)) {
            z = zQ;
        } else {
            this.t.set(this.s);
        }
        if (z) {
            requestLayout();
        }
        return b0VarO.a().c().b().n();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v(getContext());
        c.h.l.t.h0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i8 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        int measuredHeight;
        z();
        measureChildWithMargins(this.f317i, i2, 0, i3, 0);
        e eVar = (e) this.f317i.getLayoutParams();
        int iMax = Math.max(0, this.f317i.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int iMax2 = Math.max(0, this.f317i.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f317i.getMeasuredState());
        boolean z = (c.h.l.t.J(this) & 256) != 0;
        if (z) {
            measuredHeight = this.f314f;
            if (this.n && this.f317i.getTabContainer() != null) {
                measuredHeight += this.f314f;
            }
        } else {
            measuredHeight = this.f317i.getVisibility() != 8 ? this.f317i.getMeasuredHeight() : 0;
        }
        this.u.set(this.s);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 21) {
            this.B = this.z;
        } else {
            this.x.set(this.v);
        }
        if (!this.f321m && !z) {
            Rect rect = this.u;
            rect.top += measuredHeight;
            rect.bottom += 0;
            if (i4 >= 21) {
                this.B = this.B.j(0, measuredHeight, 0, 0);
            }
        } else if (i4 >= 21) {
            this.B = new b0.a(this.B).c(c.h.d.b.a(this.B.f(), this.B.h() + measuredHeight, this.B.g(), this.B.e() + 0)).a();
        } else {
            Rect rect2 = this.x;
            rect2.top += measuredHeight;
            rect2.bottom += 0;
        }
        q(this.f316h, this.u, true, true, true, true);
        if (i4 >= 21 && !this.C.equals(this.B)) {
            c.h.l.b0 b0Var = this.B;
            this.C = b0Var;
            c.h.l.t.h(this.f316h, b0Var);
        } else if (i4 < 21 && !this.y.equals(this.x)) {
            this.y.set(this.x);
            this.f316h.a(this.x);
        }
        measureChildWithMargins(this.f316h, i2, 0, i3, 0);
        e eVar2 = (e) this.f316h.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f316h.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f316h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f316h.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i2, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i3, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, c.h.l.n
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        if (!this.o || !z) {
            return false;
        }
        if (B(f3)) {
            p();
        } else {
            A();
        }
        this.p = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, c.h.l.n
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, c.h.l.n
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, c.h.l.n
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        int i6 = this.q + i3;
        this.q = i6;
        setActionBarHideOffset(i6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, c.h.l.n
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.J.b(view, view2, i2);
        this.q = getActionBarHideOffset();
        u();
        d dVar = this.D;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, c.h.l.n
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.f317i.getVisibility() != 0) {
            return false;
        }
        return this.o;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, c.h.l.n
    public void onStopNestedScroll(View view) {
        if (this.o && !this.p) {
            if (this.q <= this.f317i.getHeight()) {
                y();
            } else {
                x();
            }
        }
        d dVar = this.D;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i2) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i2);
        }
        z();
        int i3 = this.r ^ i2;
        this.r = i2;
        boolean z = (i2 & 4) == 0;
        boolean z2 = (i2 & 256) != 0;
        d dVar = this.D;
        if (dVar != null) {
            dVar.c(!z2);
            if (z || !z2) {
                this.D.a();
            } else {
                this.D.d();
            }
        }
        if ((i3 & 256) == 0 || this.D == null) {
            return;
        }
        c.h.l.t.h0(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        this.f315g = i2;
        d dVar = this.D;
        if (dVar != null) {
            dVar.onWindowVisibilityChanged(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public void setActionBarHideOffset(int i2) {
        u();
        this.f317i.setTranslationY(-Math.max(0, Math.min(i2, this.f317i.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.D = dVar;
        if (getWindowToken() != null) {
            this.D.onWindowVisibilityChanged(this.f315g);
            int i2 = this.r;
            if (i2 != 0) {
                onWindowSystemUiVisibilityChanged(i2);
                c.h.l.t.h0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.n = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.o) {
            this.o = z;
            if (z) {
                return;
            }
            u();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i2) {
        z();
        this.f318j.setIcon(i2);
    }

    public void setLogo(int i2) {
        z();
        this.f318j.m(i2);
    }

    public void setOverlayMode(boolean z) {
        this.f321m = z;
        this.f320l = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i2) {
    }

    @Override // androidx.appcompat.widget.c0
    public void setWindowCallback(Window.Callback callback) {
        z();
        this.f318j.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.c0
    public void setWindowTitle(CharSequence charSequence) {
        z();
        this.f318j.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    void u() {
        removeCallbacks(this.H);
        removeCallbacks(this.I);
        ViewPropertyAnimator viewPropertyAnimator = this.F;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean w() {
        return this.f321m;
    }

    void z() {
        if (this.f316h == null) {
            this.f316h = (ContentFrameLayout) findViewById(c.a.f.f2483b);
            this.f317i = (ActionBarContainer) findViewById(c.a.f.f2484c);
            this.f318j = t(findViewById(c.a.f.a));
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        z();
        this.f318j.setIcon(drawable);
    }
}