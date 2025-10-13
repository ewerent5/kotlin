package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import c.h.l.c0.c;
import c.h.l.m;
import c.h.l.o;
import c.h.l.t;
import ch.qos.logback.classic.Level;
import ch.qos.logback.core.CoreConstants;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements m, c.h.l.j {

    /* renamed from: e, reason: collision with root package name */
    private static final a f930e = new a();

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f931f = {R.attr.fillViewport};
    private int A;
    private c B;
    private final o C;
    private final c.h.l.k D;
    private float E;
    private b F;

    /* renamed from: g, reason: collision with root package name */
    private long f932g;

    /* renamed from: h, reason: collision with root package name */
    private final Rect f933h;

    /* renamed from: i, reason: collision with root package name */
    private OverScroller f934i;

    /* renamed from: j, reason: collision with root package name */
    private EdgeEffect f935j;

    /* renamed from: k, reason: collision with root package name */
    private EdgeEffect f936k;

    /* renamed from: l, reason: collision with root package name */
    private int f937l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f938m;
    private boolean n;
    private View o;
    private boolean p;
    private VelocityTracker q;
    private boolean r;
    private boolean s;
    private int t;
    private int u;
    private int v;
    private int w;
    private final int[] x;
    private final int[] y;
    private int z;

    static class a extends c.h.l.a {
        a() {
        }

        @Override // c.h.l.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            c.h.l.c0.e.a(accessibilityEvent, nestedScrollView.getScrollX());
            c.h.l.c0.e.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // c.h.l.a
        public void g(View view, c.h.l.c0.c cVar) {
            int scrollRange;
            super.g(view, cVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            cVar.Y(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            cVar.r0(true);
            if (nestedScrollView.getScrollY() > 0) {
                cVar.b(c.a.n);
                cVar.b(c.a.y);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                cVar.b(c.a.f3142m);
                cVar.b(c.a.A);
            }
        }

        @Override // c.h.l.a
        public boolean j(View view, int i2, Bundle bundle) {
            if (super.j(view, i2, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i2 != 4096) {
                if (i2 == 8192 || i2 == 16908344) {
                    int iMax = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (iMax == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.O(0, iMax, true);
                    return true;
                }
                if (i2 != 16908346) {
                    return false;
                }
            }
            int iMin = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (iMin == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.O(0, iMin, true);
            return true;
        }
    }

    public interface b {
        void a(NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5);
    }

    static class c extends View.BaseSavedState {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name */
        public int f939e;

        class a implements Parcelable.Creator<c> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public c[] newArray(int i2) {
                return new c[i2];
            }
        }

        c(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f939e + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f939e);
        }

        c(Parcel parcel) {
            super(parcel);
            this.f939e = parcel.readInt();
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private static boolean A(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && A((View) parent, view2);
    }

    private boolean B(View view, int i2, int i3) {
        view.getDrawingRect(this.f933h);
        offsetDescendantRectToMyCoords(view, this.f933h);
        return this.f933h.bottom + i2 >= getScrollY() && this.f933h.top - i2 <= getScrollY() + i3;
    }

    private void C(int i2, int i3, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i2);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.D.e(0, scrollY2, 0, i2 - scrollY2, null, i3, iArr);
    }

    private void D(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.w) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.f937l = (int) motionEvent.getY(i2);
            this.w = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.q;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void G() {
        VelocityTracker velocityTracker = this.q;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.q = null;
        }
    }

    private void H(boolean z) {
        if (z) {
            P(2, 1);
        } else {
            Q(1);
        }
        this.A = getScrollY();
        t.b0(this);
    }

    private boolean I(int i2, int i3, int i4) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = height + scrollY;
        boolean z = false;
        boolean z2 = i2 == 33;
        View viewR = r(z2, i3, i4);
        if (viewR == null) {
            viewR = this;
        }
        if (i3 < scrollY || i4 > i5) {
            h(z2 ? i3 - scrollY : i4 - i5);
            z = true;
        }
        if (viewR != findFocus()) {
            viewR.requestFocus(i2);
        }
        return z;
    }

    private void J(View view) {
        view.getDrawingRect(this.f933h);
        offsetDescendantRectToMyCoords(view, this.f933h);
        int iE = e(this.f933h);
        if (iE != 0) {
            scrollBy(0, iE);
        }
    }

    private boolean K(Rect rect, boolean z) {
        int iE = e(rect);
        boolean z2 = iE != 0;
        if (z2) {
            if (z) {
                scrollBy(0, iE);
            } else {
                L(0, iE);
            }
        }
        return z2;
    }

    private void M(int i2, int i3, int i4, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f932g > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f934i.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i3 + scrollY, Math.max(0, height - height2))) - scrollY, i4);
            H(z);
        } else {
            if (!this.f934i.isFinished()) {
                a();
            }
            scrollBy(i2, i3);
        }
        this.f932g = AnimationUtils.currentAnimationTimeMillis();
    }

    private void a() {
        this.f934i.abortAnimation();
        Q(1);
    }

    private boolean c() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private static int d(int i2, int i3, int i4) {
        if (i3 >= i4 || i2 < 0) {
            return 0;
        }
        return i3 + i2 > i4 ? i4 - i3 : i2;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.E == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.E = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.E;
    }

    private void h(int i2) {
        if (i2 != 0) {
            if (this.s) {
                L(0, i2);
            } else {
                scrollBy(0, i2);
            }
        }
    }

    private void i() {
        this.p = false;
        G();
        Q(0);
        EdgeEffect edgeEffect = this.f935j;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f936k.onRelease();
        }
    }

    private void p() {
        if (getOverScrollMode() == 2) {
            this.f935j = null;
            this.f936k = null;
        } else if (this.f935j == null) {
            Context context = getContext();
            this.f935j = new EdgeEffect(context);
            this.f936k = new EdgeEffect(context);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.view.View r(boolean r13, int r14, int r15) {
        /*
            r12 = this;
            r0 = 2
            java.util.ArrayList r0 = r12.getFocusables(r0)
            int r1 = r0.size()
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
        Ld:
            if (r4 >= r1) goto L53
            java.lang.Object r6 = r0.get(r4)
            android.view.View r6 = (android.view.View) r6
            int r7 = r6.getTop()
            int r8 = r6.getBottom()
            r9 = 1
            if (r14 >= r8) goto L50
            if (r7 >= r15) goto L50
            if (r14 >= r7) goto L28
            if (r8 >= r15) goto L28
            r10 = 1
            goto L29
        L28:
            r10 = 0
        L29:
            if (r3 != 0) goto L2e
            r3 = r6
            r5 = r10
            goto L50
        L2e:
            if (r13 == 0) goto L36
            int r11 = r3.getTop()
            if (r7 < r11) goto L3e
        L36:
            if (r13 != 0) goto L40
            int r7 = r3.getBottom()
            if (r8 <= r7) goto L40
        L3e:
            r7 = 1
            goto L41
        L40:
            r7 = 0
        L41:
            if (r5 == 0) goto L48
            if (r10 == 0) goto L50
            if (r7 == 0) goto L50
            goto L4f
        L48:
            if (r10 == 0) goto L4d
            r3 = r6
            r5 = 1
            goto L50
        L4d:
            if (r7 == 0) goto L50
        L4f:
            r3 = r6
        L50:
            int r4 = r4 + 1
            goto Ld
        L53:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.r(boolean, int, int):android.view.View");
    }

    private boolean v(int i2, int i3) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i3 >= childAt.getTop() - scrollY && i3 < childAt.getBottom() - scrollY && i2 >= childAt.getLeft() && i2 < childAt.getRight();
    }

    private void w() {
        VelocityTracker velocityTracker = this.q;
        if (velocityTracker == null) {
            this.q = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void x() {
        this.f934i = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.t = viewConfiguration.getScaledTouchSlop();
        this.u = viewConfiguration.getScaledMinimumFlingVelocity();
        this.v = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void y() {
        if (this.q == null) {
            this.q = VelocityTracker.obtain();
        }
    }

    private boolean z(View view) {
        return !B(view, 0, getHeight());
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    boolean E(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = 0
        L21:
            if (r1 == 0) goto L2a
            if (r1 != r5) goto L28
            if (r2 == 0) goto L28
            goto L2a
        L28:
            r2 = 0
            goto L2b
        L2a:
            r2 = 1
        L2b:
            if (r1 == 0) goto L34
            if (r1 != r5) goto L32
            if (r3 == 0) goto L32
            goto L34
        L32:
            r1 = 0
            goto L35
        L34:
            r1 = 1
        L35:
            int r3 = r15 + r13
            if (r2 != 0) goto L3b
            r2 = 0
            goto L3d
        L3b:
            r2 = r19
        L3d:
            int r6 = r16 + r14
            if (r1 != 0) goto L43
            r1 = 0
            goto L45
        L43:
            r1 = r20
        L45:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L50
            r3 = r2
        L4e:
            r2 = 1
            goto L55
        L50:
            if (r3 >= r7) goto L54
            r3 = r7
            goto L4e
        L54:
            r2 = 0
        L55:
            if (r6 <= r1) goto L5a
            r6 = r1
        L58:
            r1 = 1
            goto L5f
        L5a:
            if (r6 >= r8) goto L5e
            r6 = r8
            goto L58
        L5e:
            r1 = 0
        L5f:
            if (r1 == 0) goto L7e
            boolean r7 = r12.u(r5)
            if (r7 != 0) goto L7e
            android.widget.OverScroller r7 = r0.f934i
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r7
            r14 = r3
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L7e:
            r12.onOverScrolled(r3, r6, r2, r1)
            if (r2 != 0) goto L85
            if (r1 == 0) goto L86
        L85:
            r4 = 1
        L86:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.E(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    public boolean F(int i2) {
        boolean z = i2 == 130;
        int height = getHeight();
        if (z) {
            this.f933h.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f933h;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f933h.top = getScrollY() - height;
            Rect rect2 = this.f933h;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f933h;
        int i3 = rect3.top;
        int i4 = height + i3;
        rect3.bottom = i4;
        return I(i2, i3, i4);
    }

    public final void L(int i2, int i3) {
        M(i2, i3, 250, false);
    }

    void N(int i2, int i3, int i4, boolean z) {
        M(i2 - getScrollX(), i3 - getScrollY(), i4, z);
    }

    void O(int i2, int i3, boolean z) {
        N(i2, i3, 250, z);
    }

    public boolean P(int i2, int i3) {
        return this.D.p(i2, i3);
    }

    public void Q(int i2) {
        this.D.r(i2);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    public boolean b(int i2) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i2);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !B(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i2 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i2 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i2 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            h(maxScrollAmount);
        } else {
            viewFindNextFocus.getDrawingRect(this.f933h);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.f933h);
            h(e(this.f933h));
            viewFindNextFocus.requestFocus(i2);
        }
        if (viewFindFocus == null || !viewFindFocus.isFocused() || !z(viewFindFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f934i.isFinished()) {
            return;
        }
        this.f934i.computeScrollOffset();
        int currY = this.f934i.getCurrY();
        int i2 = currY - this.A;
        this.A = currY;
        int[] iArr = this.y;
        boolean z = false;
        iArr[1] = 0;
        f(0, i2, iArr, null, 1);
        int i3 = i2 - this.y[1];
        int scrollRange = getScrollRange();
        if (i3 != 0) {
            int scrollY = getScrollY();
            E(0, i3, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i4 = i3 - scrollY2;
            int[] iArr2 = this.y;
            iArr2[1] = 0;
            g(0, scrollY2, 0, i4, this.x, 1, iArr2);
            i3 = i4 - this.y[1];
        }
        if (i3 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                z = true;
            }
            if (z) {
                p();
                if (i3 < 0) {
                    if (this.f935j.isFinished()) {
                        this.f935j.onAbsorb((int) this.f934i.getCurrVelocity());
                    }
                } else if (this.f936k.isFinished()) {
                    this.f936k.onAbsorb((int) this.f934i.getCurrVelocity());
                }
            }
            a();
        }
        if (this.f934i.isFinished()) {
            Q(1);
        } else {
            t.b0(this);
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || q(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f2, float f3, boolean z) {
        return this.D.a(f2, f3, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f2, float f3) {
        return this.D.b(f2, f3);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return f(i2, i3, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.D.f(i2, i3, i4, i5, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        if (this.f935j != null) {
            int scrollY = getScrollY();
            int paddingLeft2 = 0;
            if (!this.f935j.isFinished()) {
                int iSave = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int iMin = Math.min(0, scrollY);
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 21 || getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    paddingLeft = getPaddingLeft() + 0;
                } else {
                    paddingLeft = 0;
                }
                if (i2 >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    iMin += getPaddingTop();
                }
                canvas.translate(paddingLeft, iMin);
                this.f935j.setSize(width, height);
                if (this.f935j.draw(canvas)) {
                    t.b0(this);
                }
                canvas.restoreToCount(iSave);
            }
            if (this.f936k.isFinished()) {
                return;
            }
            int iSave2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int iMax = Math.max(getScrollRange(), scrollY) + height2;
            int i3 = Build.VERSION.SDK_INT;
            if (i3 < 21 || getClipToPadding()) {
                width2 -= getPaddingLeft() + getPaddingRight();
                paddingLeft2 = 0 + getPaddingLeft();
            }
            if (i3 >= 21 && getClipToPadding()) {
                height2 -= getPaddingTop() + getPaddingBottom();
                iMax -= getPaddingBottom();
            }
            canvas.translate(paddingLeft2 - width2, iMax);
            canvas.rotate(180.0f, width2, 0.0f);
            this.f936k.setSize(width2, height2);
            if (this.f936k.draw(canvas)) {
                t.b0(this);
            }
            canvas.restoreToCount(iSave2);
        }
    }

    protected int e(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i2 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i3 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i2 - verticalFadingEdgeLength : i2;
        int i4 = rect.bottom;
        if (i4 > i3 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i3) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i2);
        }
        if (rect.top >= scrollY || i4 >= i3) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i3 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    public boolean f(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return this.D.d(i2, i3, iArr, iArr2, i4);
    }

    public void g(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        this.D.e(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.C.a();
    }

    int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return u(0);
    }

    @Override // android.view.View, c.h.l.j
    public boolean isNestedScrollingEnabled() {
        return this.D.l();
    }

    @Override // c.h.l.m
    public void j(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        C(i5, i6, iArr);
    }

    @Override // c.h.l.l
    public void k(View view, int i2, int i3, int i4, int i5, int i6) {
        C(i5, i6, null);
    }

    @Override // c.h.l.l
    public boolean l(View view, View view2, int i2, int i3) {
        return (i2 & 2) != 0;
    }

    @Override // c.h.l.l
    public void m(View view, View view2, int i2, int i3) {
        this.C.c(view, view2, i2, i3);
        P(2, i3);
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i2, int i3) {
        view.measure(FrameLayout.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // c.h.l.l
    public void n(View view, int i2) {
        this.C.d(view, i2);
        Q(i2);
    }

    @Override // c.h.l.l
    public void o(View view, int i2, int i3, int[] iArr, int i4) {
        f(i2, i3, iArr, null, i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.p) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i2 = scrollY - verticalScrollFactorCompat;
                if (i2 < 0) {
                    scrollRange = 0;
                } else if (i2 <= scrollRange) {
                    scrollRange = i2;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto Ld
            boolean r3 = r11.p
            if (r3 == 0) goto Ld
            return r2
        Ld:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3 = 0
            if (r0 == 0) goto La2
            r4 = -1
            if (r0 == r2) goto L7d
            if (r0 == r1) goto L24
            r1 = 3
            if (r0 == r1) goto L7d
            r1 = 6
            if (r0 == r1) goto L1f
            goto Ld9
        L1f:
            r11.D(r12)
            goto Ld9
        L24:
            int r0 = r11.w
            if (r0 != r4) goto L2a
            goto Ld9
        L2a:
            int r5 = r12.findPointerIndex(r0)
            if (r5 != r4) goto L4d
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r1 = "Invalid pointerId="
            r12.append(r1)
            r12.append(r0)
            java.lang.String r0 = " in onInterceptTouchEvent"
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            java.lang.String r0 = "NestedScrollView"
            android.util.Log.e(r0, r12)
            goto Ld9
        L4d:
            float r0 = r12.getY(r5)
            int r0 = (int) r0
            int r4 = r11.f937l
            int r4 = r0 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r11.t
            if (r4 <= r5) goto Ld9
            int r4 = r11.getNestedScrollAxes()
            r1 = r1 & r4
            if (r1 != 0) goto Ld9
            r11.p = r2
            r11.f937l = r0
            r11.y()
            android.view.VelocityTracker r0 = r11.q
            r0.addMovement(r12)
            r11.z = r3
            android.view.ViewParent r12 = r11.getParent()
            if (r12 == 0) goto Ld9
            r12.requestDisallowInterceptTouchEvent(r2)
            goto Ld9
        L7d:
            r11.p = r3
            r11.w = r4
            r11.G()
            android.widget.OverScroller r4 = r11.f934i
            int r5 = r11.getScrollX()
            int r6 = r11.getScrollY()
            r7 = 0
            r8 = 0
            r9 = 0
            int r10 = r11.getScrollRange()
            boolean r12 = r4.springBack(r5, r6, r7, r8, r9, r10)
            if (r12 == 0) goto L9e
            c.h.l.t.b0(r11)
        L9e:
            r11.Q(r3)
            goto Ld9
        La2:
            float r0 = r12.getY()
            int r0 = (int) r0
            float r4 = r12.getX()
            int r4 = (int) r4
            boolean r4 = r11.v(r4, r0)
            if (r4 != 0) goto Lb8
            r11.p = r3
            r11.G()
            goto Ld9
        Lb8:
            r11.f937l = r0
            int r0 = r12.getPointerId(r3)
            r11.w = r0
            r11.w()
            android.view.VelocityTracker r0 = r11.q
            r0.addMovement(r12)
            android.widget.OverScroller r12 = r11.f934i
            r12.computeScrollOffset()
            android.widget.OverScroller r12 = r11.f934i
            boolean r12 = r12.isFinished()
            r12 = r12 ^ r2
            r11.p = r12
            r11.P(r1, r3)
        Ld9:
            boolean r12 = r11.p
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        int measuredHeight = 0;
        this.f938m = false;
        View view = this.o;
        if (view != null && A(view, this)) {
            J(this.o);
        }
        this.o = null;
        if (!this.n) {
            if (this.B != null) {
                scrollTo(getScrollX(), this.B.f939e);
                this.B = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iD = d(scrollY, paddingTop, measuredHeight);
            if (iD != scrollY) {
                scrollTo(getScrollX(), iD);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.n = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.r && View.MeasureSpec.getMode(i3) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, c.h.l.n
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f3, true);
        s((int) f3);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, c.h.l.n
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return dispatchNestedPreFling(f2, f3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, c.h.l.n
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        o(view, i2, i3, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, c.h.l.n
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        C(i5, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, c.h.l.n
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        m(view, view2, i2, 0);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i2, int i3, boolean z, boolean z2) {
        super.scrollTo(i2, i3);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (i2 == 2) {
            i2 = 130;
        } else if (i2 == 1) {
            i2 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i2) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i2);
        if (viewFindNextFocus == null || z(viewFindNextFocus)) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i2, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        this.B = cVar;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f939e = getScrollY();
        return cVar;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        b bVar = this.F;
        if (bVar != null) {
            bVar.a(this, i2, i3, i4, i5);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !B(viewFindFocus, 0, i5)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.f933h);
        offsetDescendantRectToMyCoords(viewFindFocus, this.f933h);
        h(e(this.f933h));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, c.h.l.n
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return l(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, c.h.l.n
    public void onStopNestedScroll(View view) {
        n(view, 0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        y();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.z = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(0.0f, this.z);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.q;
                velocityTracker.computeCurrentVelocity(CoreConstants.MILLIS_IN_ONE_SECOND, this.v);
                int yVelocity = (int) velocityTracker.getYVelocity(this.w);
                if (Math.abs(yVelocity) >= this.u) {
                    int i2 = -yVelocity;
                    float f2 = i2;
                    if (!dispatchNestedPreFling(0.0f, f2)) {
                        dispatchNestedFling(0.0f, f2, true);
                        s(i2);
                    }
                } else if (this.f934i.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    t.b0(this);
                }
                this.w = -1;
                i();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.w);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.w + " in onTouchEvent");
                } else {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i3 = this.f937l - y;
                    if (!this.p && Math.abs(i3) > this.t) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.p = true;
                        i3 = i3 > 0 ? i3 - this.t : i3 + this.t;
                    }
                    int i4 = i3;
                    if (this.p) {
                        if (f(0, i4, this.y, this.x, 0)) {
                            i4 -= this.y[1];
                            this.z += this.x[1];
                        }
                        int i5 = i4;
                        this.f937l = y - this.x[1];
                        int scrollY = getScrollY();
                        int scrollRange = getScrollRange();
                        int overScrollMode = getOverScrollMode();
                        boolean z = overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0);
                        if (E(0, i5, 0, getScrollY(), 0, scrollRange, 0, 0, true) && !u(0)) {
                            this.q.clear();
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        int[] iArr = this.y;
                        iArr[1] = 0;
                        g(0, scrollY2, 0, i5 - scrollY2, this.x, 0, iArr);
                        int i6 = this.f937l;
                        int[] iArr2 = this.x;
                        this.f937l = i6 - iArr2[1];
                        this.z += iArr2[1];
                        if (z) {
                            int i7 = i5 - this.y[1];
                            p();
                            int i8 = scrollY + i7;
                            if (i8 < 0) {
                                d.a(this.f935j, i7 / getHeight(), motionEvent.getX(iFindPointerIndex) / getWidth());
                                if (!this.f936k.isFinished()) {
                                    this.f936k.onRelease();
                                }
                            } else if (i8 > scrollRange) {
                                d.a(this.f936k, i7 / getHeight(), 1.0f - (motionEvent.getX(iFindPointerIndex) / getWidth()));
                                if (!this.f935j.isFinished()) {
                                    this.f935j.onRelease();
                                }
                            }
                            EdgeEffect edgeEffect = this.f935j;
                            if (edgeEffect != null && (!edgeEffect.isFinished() || !this.f936k.isFinished())) {
                                t.b0(this);
                            }
                        }
                    }
                }
            } else if (actionMasked == 3) {
                if (this.p && getChildCount() > 0 && this.f934i.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    t.b0(this);
                }
                this.w = -1;
                i();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f937l = (int) motionEvent.getY(actionIndex);
                this.w = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                D(motionEvent);
                this.f937l = (int) motionEvent.getY(motionEvent.findPointerIndex(this.w));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            boolean z2 = !this.f934i.isFinished();
            this.p = z2;
            if (z2 && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f934i.isFinished()) {
                a();
            }
            this.f937l = (int) motionEvent.getY();
            this.w = motionEvent.getPointerId(0);
            P(2, 0);
        }
        VelocityTracker velocityTracker2 = this.q;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public boolean q(KeyEvent keyEvent) {
        this.f933h.setEmpty();
        if (!c()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            return (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) ? false : true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19) {
            return !keyEvent.isAltPressed() ? b(33) : t(33);
        }
        if (keyCode == 20) {
            return !keyEvent.isAltPressed() ? b(130) : t(130);
        }
        if (keyCode != 62) {
            return false;
        }
        F(keyEvent.isShiftPressed() ? 33 : 130);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f938m) {
            this.o = view2;
        } else {
            J(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return K(rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            G();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f938m = true;
        super.requestLayout();
    }

    public void s(int i2) {
        if (getChildCount() > 0) {
            this.f934i.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, Level.ALL_INT, Integer.MAX_VALUE, 0, 0);
            H(true);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i3) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int iD = d(i2, width, width2);
            int iD2 = d(i3, height, height2);
            if (iD == getScrollX() && iD2 == getScrollY()) {
                return;
            }
            super.scrollTo(iD, iD2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.r) {
            this.r = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.D.m(z);
    }

    public void setOnScrollChangeListener(b bVar) {
        this.F = bVar;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.s = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i2) {
        return P(i2, 0);
    }

    @Override // android.view.View, c.h.l.j
    public void stopNestedScroll() {
        Q(0);
    }

    public boolean t(int i2) {
        int childCount;
        boolean z = i2 == 130;
        int height = getHeight();
        Rect rect = this.f933h;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f933h.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f933h;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f933h;
        return I(i2, rect3.top, rect3.bottom);
    }

    public boolean u(int i2) {
        return this.D.k(i2);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f933h = new Rect();
        this.f938m = true;
        this.n = false;
        this.o = null;
        this.p = false;
        this.s = true;
        this.w = -1;
        this.x = new int[2];
        this.y = new int[2];
        x();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f931f, i2, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.C = new o(this);
        this.D = new c.h.l.k(this);
        setNestedScrollingEnabled(true);
        t.k0(this, f930e);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2) {
        if (getChildCount() <= 0) {
            super.addView(view, i2);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}