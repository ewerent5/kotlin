package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b, reason: collision with root package name */
    private AnimatorSet f11906b;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ExpandableTransformationBehavior.this.f11906b = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    protected boolean H(View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = this.f11906b;
        boolean z3 = animatorSet != null;
        if (z3) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSetJ = J(view, view2, z, z3);
        this.f11906b = animatorSetJ;
        animatorSetJ.addListener(new a());
        this.f11906b.start();
        if (!z2) {
            this.f11906b.end();
        }
        return true;
    }

    protected abstract AnimatorSet J(View view, View view2, boolean z, boolean z2);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}