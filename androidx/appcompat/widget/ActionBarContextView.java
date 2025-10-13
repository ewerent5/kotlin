package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import ch.qos.logback.classic.Level;

/* loaded from: classes.dex */
public class ActionBarContextView extends androidx.appcompat.widget.a {

    /* renamed from: m, reason: collision with root package name */
    private CharSequence f310m;
    private CharSequence n;
    private View o;
    private View p;
    private LinearLayout q;
    private TextView r;
    private TextView s;
    private int t;
    private int u;
    private boolean v;
    private int w;

    class a implements View.OnClickListener {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ c.a.o.b f311e;

        a(c.a.o.b bVar) {
            this.f311e = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f311e.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    private void i() {
        if (this.q == null) {
            LayoutInflater.from(getContext()).inflate(c.a.g.a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.q = linearLayout;
            this.r = (TextView) linearLayout.findViewById(c.a.f.f2486e);
            this.s = (TextView) this.q.findViewById(c.a.f.f2485d);
            if (this.t != 0) {
                this.r.setTextAppearance(getContext(), this.t);
            }
            if (this.u != 0) {
                this.s.setTextAppearance(getContext(), this.u);
            }
        }
        this.r.setText(this.f310m);
        this.s.setText(this.n);
        boolean z = !TextUtils.isEmpty(this.f310m);
        boolean z2 = !TextUtils.isEmpty(this.n);
        int i2 = 0;
        this.s.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.q;
        if (!z && !z2) {
            i2 = 8;
        }
        linearLayout2.setVisibility(i2);
        if (this.q.getParent() == null) {
            addView(this.q);
        }
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ c.h.l.x f(int i2, long j2) {
        return super.f(i2, j2);
    }

    public void g() {
        if (this.o == null) {
            k();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.n;
    }

    public CharSequence getTitle() {
        return this.f310m;
    }

    public void h(c.a.o.b bVar) {
        View view = this.o;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.w, (ViewGroup) this, false);
            this.o = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.o);
        }
        this.o.findViewById(c.a.f.f2490i).setOnClickListener(new a(bVar));
        androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) bVar.e();
        c cVar = this.f399h;
        if (cVar != null) {
            cVar.y();
        }
        c cVar2 = new c(getContext());
        this.f399h = cVar2;
        cVar2.J(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        gVar.c(this.f399h, this.f397f);
        ActionMenuView actionMenuView = (ActionMenuView) this.f399h.o(this);
        this.f398g = actionMenuView;
        c.h.l.t.n0(actionMenuView, null);
        addView(this.f398g, layoutParams);
    }

    public boolean j() {
        return this.v;
    }

    public void k() {
        removeAllViews();
        this.p = null;
        this.f398g = null;
    }

    public boolean l() {
        c cVar = this.f399h;
        if (cVar != null) {
            return cVar.K();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f399h;
        if (cVar != null) {
            cVar.B();
            this.f399h.C();
        }
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            return;
        }
        accessibilityEvent.setSource(this);
        accessibilityEvent.setClassName(getClass().getName());
        accessibilityEvent.setPackageName(getContext().getPackageName());
        accessibilityEvent.setContentDescription(this.f310m);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        boolean zB = c1.b(this);
        int paddingRight = zB ? (i4 - i2) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
        View view = this.o;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.o.getLayoutParams();
            int i6 = zB ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = zB ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iD = androidx.appcompat.widget.a.d(paddingRight, i6, zB);
            paddingRight = androidx.appcompat.widget.a.d(iD + e(this.o, iD, paddingTop, paddingTop2, zB), i7, zB);
        }
        int iE = paddingRight;
        LinearLayout linearLayout = this.q;
        if (linearLayout != null && this.p == null && linearLayout.getVisibility() != 8) {
            iE += e(this.q, iE, paddingTop, paddingTop2, zB);
        }
        int i8 = iE;
        View view2 = this.p;
        if (view2 != null) {
            e(view2, i8, paddingTop, paddingTop2, zB);
        }
        int paddingLeft = zB ? getPaddingLeft() : (i4 - i2) - getPaddingRight();
        ActionMenuView actionMenuView = this.f398g;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zB);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i3) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i2);
        int size2 = this.f400i;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i3);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Level.ALL_INT);
        View view = this.o;
        if (view != null) {
            int iC = c(view, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.o.getLayoutParams();
            paddingLeft = iC - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f398g;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = c(this.f398g, paddingLeft, iMakeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.q;
        if (linearLayout != null && this.p == null) {
            if (this.v) {
                this.q.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.q.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.q.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = c(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        View view2 = this.p;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i4 = layoutParams.width;
            int i5 = i4 != -2 ? 1073741824 : Level.ALL_INT;
            if (i4 >= 0) {
                paddingLeft = Math.min(i4, paddingLeft);
            }
            int i6 = layoutParams.height;
            int i7 = i6 == -2 ? Level.ALL_INT : 1073741824;
            if (i6 >= 0) {
                iMin = Math.min(i6, iMin);
            }
            this.p.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i5), View.MeasureSpec.makeMeasureSpec(iMin, i7));
        }
        if (this.f400i > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            int measuredHeight = getChildAt(i9).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i8) {
                i8 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i8);
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.a
    public void setContentHeight(int i2) {
        this.f400i = i2;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.p;
        if (view2 != null) {
            removeView(view2);
        }
        this.p = view;
        if (view != null && (linearLayout = this.q) != null) {
            removeView(linearLayout);
            this.q = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.n = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f310m = charSequence;
        i();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.v) {
            requestLayout();
        }
        this.v = z;
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i2) {
        super.setVisibility(i2);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.a.a.f2449j);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        w0 w0VarV = w0.v(context, attributeSet, c.a.j.y, i2, 0);
        c.h.l.t.n0(this, w0VarV.g(c.a.j.z));
        this.t = w0VarV.n(c.a.j.D, 0);
        this.u = w0VarV.n(c.a.j.C, 0);
        this.f400i = w0VarV.m(c.a.j.B, 0);
        this.w = w0VarV.n(c.a.j.A, c.a.g.f2497d);
        w0VarV.w();
    }
}