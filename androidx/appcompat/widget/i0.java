package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import ch.qos.logback.core.net.SyslogConstants;

/* compiled from: LinearLayoutCompat.java */
/* loaded from: classes.dex */
public class i0 extends ViewGroup {

    /* renamed from: e, reason: collision with root package name */
    private boolean f477e;

    /* renamed from: f, reason: collision with root package name */
    private int f478f;

    /* renamed from: g, reason: collision with root package name */
    private int f479g;

    /* renamed from: h, reason: collision with root package name */
    private int f480h;

    /* renamed from: i, reason: collision with root package name */
    private int f481i;

    /* renamed from: j, reason: collision with root package name */
    private int f482j;

    /* renamed from: k, reason: collision with root package name */
    private float f483k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f484l;

    /* renamed from: m, reason: collision with root package name */
    private int[] f485m;
    private int[] n;
    private Drawable o;
    private int p;
    private int q;
    private int r;
    private int s;

    public i0(Context context) {
        this(context, null);
    }

    private void A(View view, int i2, int i3, int i4, int i5) {
        view.layout(i2, i3, i4 + i2, i5 + i3);
    }

    private void k(int i2, int i3) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i4 = 0; i4 < i2; i4++) {
            View viewS = s(i4);
            if (viewS.getVisibility() != 8) {
                a aVar = (a) viewS.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) aVar).height == -1) {
                    int i5 = ((ViewGroup.MarginLayoutParams) aVar).width;
                    ((ViewGroup.MarginLayoutParams) aVar).width = viewS.getMeasuredWidth();
                    measureChildWithMargins(viewS, i3, 0, iMakeMeasureSpec, 0);
                    ((ViewGroup.MarginLayoutParams) aVar).width = i5;
                }
            }
        }
    }

    private void l(int i2, int i3) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i4 = 0; i4 < i2; i4++) {
            View viewS = s(i4);
            if (viewS.getVisibility() != 8) {
                a aVar = (a) viewS.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) aVar).width == -1) {
                    int i5 = ((ViewGroup.MarginLayoutParams) aVar).height;
                    ((ViewGroup.MarginLayoutParams) aVar).height = viewS.getMeasuredHeight();
                    measureChildWithMargins(viewS, iMakeMeasureSpec, 0, i3, 0);
                    ((ViewGroup.MarginLayoutParams) aVar).height = i5;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    void g(Canvas canvas) {
        int right;
        int left;
        int i2;
        int virtualChildCount = getVirtualChildCount();
        boolean zB = c1.b(this);
        for (int i3 = 0; i3 < virtualChildCount; i3++) {
            View viewS = s(i3);
            if (viewS != null && viewS.getVisibility() != 8 && t(i3)) {
                a aVar = (a) viewS.getLayoutParams();
                j(canvas, zB ? viewS.getRight() + ((ViewGroup.MarginLayoutParams) aVar).rightMargin : (viewS.getLeft() - ((ViewGroup.MarginLayoutParams) aVar).leftMargin) - this.p);
            }
        }
        if (t(virtualChildCount)) {
            View viewS2 = s(virtualChildCount - 1);
            if (viewS2 != null) {
                a aVar2 = (a) viewS2.getLayoutParams();
                if (zB) {
                    left = viewS2.getLeft() - ((ViewGroup.MarginLayoutParams) aVar2).leftMargin;
                    i2 = this.p;
                    right = left - i2;
                } else {
                    right = viewS2.getRight() + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin;
                }
            } else if (zB) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i2 = this.p;
                right = left - i2;
            }
            j(canvas, right);
        }
    }

    @Override // android.view.View
    public int getBaseline() {
        int i2;
        if (this.f478f < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i3 = this.f478f;
        if (childCount <= i3) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i3);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f478f == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f479g;
        if (this.f480h == 1 && (i2 = this.f481i & SyslogConstants.LOG_ALERT) != 48) {
            if (i2 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f482j) / 2;
            } else if (i2 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f482j;
            }
        }
        return bottom + ((ViewGroup.MarginLayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f478f;
    }

    public Drawable getDividerDrawable() {
        return this.o;
    }

    public int getDividerPadding() {
        return this.s;
    }

    public int getDividerWidth() {
        return this.p;
    }

    public int getGravity() {
        return this.f481i;
    }

    public int getOrientation() {
        return this.f480h;
    }

    public int getShowDividers() {
        return this.r;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f483k;
    }

    void h(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View viewS = s(i2);
            if (viewS != null && viewS.getVisibility() != 8 && t(i2)) {
                i(canvas, (viewS.getTop() - ((ViewGroup.MarginLayoutParams) ((a) viewS.getLayoutParams())).topMargin) - this.q);
            }
        }
        if (t(virtualChildCount)) {
            View viewS2 = s(virtualChildCount - 1);
            i(canvas, viewS2 == null ? (getHeight() - getPaddingBottom()) - this.q : viewS2.getBottom() + ((ViewGroup.MarginLayoutParams) ((a) viewS2.getLayoutParams())).bottomMargin);
        }
    }

    void i(Canvas canvas, int i2) {
        this.o.setBounds(getPaddingLeft() + this.s, i2, (getWidth() - getPaddingRight()) - this.s, this.q + i2);
        this.o.draw(canvas);
    }

    void j(Canvas canvas, int i2) {
        this.o.setBounds(i2, getPaddingTop() + this.s, this.p + i2, (getHeight() - getPaddingBottom()) - this.s);
        this.o.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        int i2 = this.f480h;
        if (i2 == 0) {
            return new a(-2, -2);
        }
        if (i2 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.o == null) {
            return;
        }
        if (this.f480h == 1) {
            h(canvas);
        } else {
            g(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        if (this.f480h == 1) {
            v(i2, i3, i4, i5);
        } else {
            u(i2, i3, i4, i5);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        if (this.f480h == 1) {
            z(i2, i3);
        } else {
            x(i2, i3);
        }
    }

    int p(View view, int i2) {
        return 0;
    }

    int q(View view) {
        return 0;
    }

    int r(View view) {
        return 0;
    }

    View s(int i2) {
        return getChildAt(i2);
    }

    public void setBaselineAligned(boolean z) {
        this.f477e = z;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 >= 0 && i2 < getChildCount()) {
            this.f478f = i2;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.o) {
            return;
        }
        this.o = drawable;
        if (drawable != null) {
            this.p = drawable.getIntrinsicWidth();
            this.q = drawable.getIntrinsicHeight();
        } else {
            this.p = 0;
            this.q = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i2) {
        this.s = i2;
    }

    public void setGravity(int i2) {
        if (this.f481i != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & SyslogConstants.LOG_ALERT) == 0) {
                i2 |= 48;
            }
            this.f481i = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i2) {
        int i3 = i2 & 8388615;
        int i4 = this.f481i;
        if ((8388615 & i4) != i3) {
            this.f481i = i3 | ((-8388616) & i4);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f484l = z;
    }

    public void setOrientation(int i2) {
        if (this.f480h != i2) {
            this.f480h = i2;
            requestLayout();
        }
    }

    public void setShowDividers(int i2) {
        if (i2 != this.r) {
            requestLayout();
        }
        this.r = i2;
    }

    public void setVerticalGravity(int i2) {
        int i3 = i2 & SyslogConstants.LOG_ALERT;
        int i4 = this.f481i;
        if ((i4 & SyslogConstants.LOG_ALERT) != i3) {
            this.f481i = i3 | (i4 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f2) {
        this.f483k = Math.max(0.0f, f2);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    protected boolean t(int i2) {
        if (i2 == 0) {
            return (this.r & 1) != 0;
        }
        if (i2 == getChildCount()) {
            return (this.r & 4) != 0;
        }
        if ((this.r & 2) == 0) {
            return false;
        }
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            if (getChildAt(i3).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void u(int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.i0.u(int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void v(int r18, int r19, int r20, int r21) {
        /*
            r17 = this;
            r6 = r17
            int r7 = r17.getPaddingLeft()
            int r0 = r20 - r18
            int r1 = r17.getPaddingRight()
            int r8 = r0 - r1
            int r0 = r0 - r7
            int r1 = r17.getPaddingRight()
            int r9 = r0 - r1
            int r10 = r17.getVirtualChildCount()
            int r0 = r6.f481i
            r1 = r0 & 112(0x70, float:1.57E-43)
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r11 = r0 & r2
            r0 = 16
            if (r1 == r0) goto L3b
            r0 = 80
            if (r1 == r0) goto L2f
            int r0 = r17.getPaddingTop()
            goto L47
        L2f:
            int r0 = r17.getPaddingTop()
            int r0 = r0 + r21
            int r0 = r0 - r19
            int r1 = r6.f482j
            int r0 = r0 - r1
            goto L47
        L3b:
            int r0 = r17.getPaddingTop()
            int r1 = r21 - r19
            int r2 = r6.f482j
            int r1 = r1 - r2
            int r1 = r1 / 2
            int r0 = r0 + r1
        L47:
            r1 = 0
            r12 = 0
        L49:
            if (r12 >= r10) goto Lc8
            android.view.View r13 = r6.s(r12)
            r14 = 1
            if (r13 != 0) goto L59
            int r1 = r6.y(r12)
            int r0 = r0 + r1
            goto Lc5
        L59:
            int r1 = r13.getVisibility()
            r2 = 8
            if (r1 == r2) goto Lc5
            int r4 = r13.getMeasuredWidth()
            int r15 = r13.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            r5 = r1
            androidx.appcompat.widget.i0$a r5 = (androidx.appcompat.widget.i0.a) r5
            int r1 = r5.f486b
            if (r1 >= 0) goto L75
            r1 = r11
        L75:
            int r2 = c.h.l.t.B(r17)
            int r1 = c.h.l.d.b(r1, r2)
            r1 = r1 & 7
            if (r1 == r14) goto L8d
            r2 = 5
            if (r1 == r2) goto L88
            int r1 = r5.leftMargin
            int r1 = r1 + r7
            goto L98
        L88:
            int r1 = r8 - r4
            int r2 = r5.rightMargin
            goto L97
        L8d:
            int r1 = r9 - r4
            int r1 = r1 / 2
            int r1 = r1 + r7
            int r2 = r5.leftMargin
            int r1 = r1 + r2
            int r2 = r5.rightMargin
        L97:
            int r1 = r1 - r2
        L98:
            r2 = r1
            boolean r1 = r6.t(r12)
            if (r1 == 0) goto La2
            int r1 = r6.q
            int r0 = r0 + r1
        La2:
            int r1 = r5.topMargin
            int r16 = r0 + r1
            int r0 = r6.q(r13)
            int r3 = r16 + r0
            r0 = r17
            r1 = r13
            r14 = r5
            r5 = r15
            r0.A(r1, r2, r3, r4, r5)
            int r0 = r14.bottomMargin
            int r15 = r15 + r0
            int r0 = r6.r(r13)
            int r15 = r15 + r0
            int r16 = r16 + r15
            int r0 = r6.p(r13, r12)
            int r12 = r12 + r0
            r0 = r16
        Lc5:
            r1 = 1
            int r12 = r12 + r1
            goto L49
        Lc8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.i0.v(int, int, int, int):void");
    }

    void w(View view, int i2, int i3, int i4, int i5, int i6) {
        measureChildWithMargins(view, i3, i4, i5, i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:197:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void x(int r38, int r39) {
        /*
            Method dump skipped, instructions count: 1288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.i0.x(int, int):void");
    }

    int y(int i2) {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0330  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void z(int r34, int r35) {
        /*
            Method dump skipped, instructions count: 911
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.i0.z(int, int):void");
    }

    public i0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public i0(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f477e = true;
        this.f478f = -1;
        this.f479g = 0;
        this.f481i = 8388659;
        int[] iArr = c.a.j.b1;
        w0 w0VarV = w0.v(context, attributeSet, iArr, i2, 0);
        c.h.l.t.i0(this, context, iArr, attributeSet, w0VarV.r(), i2, 0);
        int iK = w0VarV.k(c.a.j.d1, -1);
        if (iK >= 0) {
            setOrientation(iK);
        }
        int iK2 = w0VarV.k(c.a.j.c1, -1);
        if (iK2 >= 0) {
            setGravity(iK2);
        }
        boolean zA = w0VarV.a(c.a.j.e1, true);
        if (!zA) {
            setBaselineAligned(zA);
        }
        this.f483k = w0VarV.i(c.a.j.g1, -1.0f);
        this.f478f = w0VarV.k(c.a.j.f1, -1);
        this.f484l = w0VarV.a(c.a.j.j1, false);
        setDividerDrawable(w0VarV.g(c.a.j.h1));
        this.r = w0VarV.k(c.a.j.k1, 0);
        this.s = w0VarV.f(c.a.j.i1, 0);
        w0VarV.w();
    }

    /* compiled from: LinearLayoutCompat.java */
    public static class a extends ViewGroup.MarginLayoutParams {
        public float a;

        /* renamed from: b, reason: collision with root package name */
        public int f486b;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f486b = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.a.j.l1);
            this.a = typedArrayObtainStyledAttributes.getFloat(c.a.j.n1, 0.0f);
            this.f486b = typedArrayObtainStyledAttributes.getInt(c.a.j.m1, -1);
            typedArrayObtainStyledAttributes.recycle();
        }

        public a(int i2, int i3) {
            super(i2, i3);
            this.f486b = -1;
            this.a = 0.0f;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f486b = -1;
        }
    }
}