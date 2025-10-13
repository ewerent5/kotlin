package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.h.l.b0;
import c.h.l.t;
import ch.qos.logback.classic.Level;
import java.util.List;

/* compiled from: HeaderScrollingViewBehavior.java */
/* loaded from: classes.dex */
abstract class b extends c<View> {

    /* renamed from: d, reason: collision with root package name */
    final Rect f11423d;

    /* renamed from: e, reason: collision with root package name */
    final Rect f11424e;

    /* renamed from: f, reason: collision with root package name */
    private int f11425f;

    /* renamed from: g, reason: collision with root package name */
    private int f11426g;

    public b() {
        this.f11423d = new Rect();
        this.f11424e = new Rect();
        this.f11425f = 0;
    }

    private static int N(int i2) {
        if (i2 == 0) {
            return 8388659;
        }
        return i2;
    }

    @Override // com.google.android.material.appbar.c
    protected void F(CoordinatorLayout coordinatorLayout, View view, int i2) {
        View viewH = H(coordinatorLayout.r(view));
        if (viewH == null) {
            super.F(coordinatorLayout, view, i2);
            this.f11425f = 0;
            return;
        }
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
        Rect rect = this.f11423d;
        rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, viewH.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((coordinatorLayout.getHeight() + viewH.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        b0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && t.y(coordinatorLayout) && !t.y(view)) {
            rect.left += lastWindowInsets.f();
            rect.right -= lastWindowInsets.g();
        }
        Rect rect2 = this.f11424e;
        c.h.l.d.a(N(fVar.f797c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i2);
        int I = I(viewH);
        view.layout(rect2.left, rect2.top - I, rect2.right, rect2.bottom - I);
        this.f11425f = rect2.top - viewH.getBottom();
    }

    abstract View H(List<View> list);

    final int I(View view) {
        if (this.f11426g == 0) {
            return 0;
        }
        float fJ = J(view);
        int i2 = this.f11426g;
        return c.h.f.a.b((int) (fJ * i2), 0, i2);
    }

    abstract float J(View view);

    public final int K() {
        return this.f11426g;
    }

    int L(View view) {
        return view.getMeasuredHeight();
    }

    final int M() {
        return this.f11425f;
    }

    public final void O(int i2) {
        this.f11426g = i2;
    }

    protected boolean P() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int i5) {
        View viewH;
        b0 lastWindowInsets;
        int i6 = view.getLayoutParams().height;
        if ((i6 != -1 && i6 != -2) || (viewH = H(coordinatorLayout.r(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i4);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (t.y(viewH) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.h() + lastWindowInsets.e();
        }
        int iL = size + L(viewH);
        int measuredHeight = viewH.getMeasuredHeight();
        if (P()) {
            view.setTranslationY(-measuredHeight);
        } else {
            iL -= measuredHeight;
        }
        coordinatorLayout.J(view, i2, i3, View.MeasureSpec.makeMeasureSpec(iL, i6 == -1 ? 1073741824 : Level.ALL_INT), i5);
        return true;
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11423d = new Rect();
        this.f11424e = new Rect();
        this.f11425f = 0;
    }
}