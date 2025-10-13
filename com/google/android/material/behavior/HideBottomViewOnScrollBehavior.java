package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private int f11435b;

    /* renamed from: c, reason: collision with root package name */
    private int f11436c;

    /* renamed from: d, reason: collision with root package name */
    private ViewPropertyAnimator f11437d;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f11437d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.a = 0;
        this.f11435b = 2;
        this.f11436c = 0;
    }

    private void F(V v, int i2, long j2, TimeInterpolator timeInterpolator) {
        this.f11437d = v.animate().translationY(i2).setInterpolator(timeInterpolator).setDuration(j2).setListener(new a());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i2, int i3) {
        return i2 == 2;
    }

    public void G(V v, int i2) {
        this.f11436c = i2;
        if (this.f11435b == 1) {
            v.setTranslationY(this.a + i2);
        }
    }

    public void H(V v) {
        if (this.f11435b == 1) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f11437d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.f11435b = 1;
        F(v, this.a + this.f11436c, 175L, e.c.b.c.m.a.f15265c);
    }

    public void I(V v) {
        if (this.f11435b == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f11437d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.f11435b = 2;
        F(v, 0, 225L, e.c.b.c.m.a.f15266d);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v, int i2) {
        this.a = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return super.l(coordinatorLayout, v, i2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void t(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        if (i3 > 0) {
            H(v);
        } else if (i3 < 0) {
            I(v);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        this.f11435b = 2;
        this.f11436c = 0;
    }
}