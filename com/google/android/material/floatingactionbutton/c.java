package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;

/* compiled from: FloatingActionButtonImplLollipop.java */
/* loaded from: classes.dex */
class c extends b {
    c(FloatingActionButton floatingActionButton, e.c.b.c.b0.b bVar) {
        super(floatingActionButton, bVar);
    }

    private Animator e0(float f2, float f3) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.F, "elevation", f2).setDuration(0L)).with(ObjectAnimator.ofFloat(this.F, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f3).setDuration(100L));
        animatorSet.setInterpolator(b.a);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.b
    void A() {
        b0();
    }

    @Override // com.google.android.material.floatingactionbutton.b
    void C(int[] iArr) {
        if (Build.VERSION.SDK_INT == 21) {
            if (!this.F.isEnabled()) {
                this.F.setElevation(0.0f);
                this.F.setTranslationZ(0.0f);
                return;
            }
            this.F.setElevation(this.o);
            if (this.F.isPressed()) {
                this.F.setTranslationZ(this.q);
            } else if (this.F.isFocused() || this.F.isHovered()) {
                this.F.setTranslationZ(this.p);
            } else {
                this.F.setTranslationZ(0.0f);
            }
        }
    }

    @Override // com.google.android.material.floatingactionbutton.b
    void D(float f2, float f3, float f4) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 == 21) {
            this.F.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(b.f11639b, e0(f2, f4));
            stateListAnimator.addState(b.f11640c, e0(f2, f3));
            stateListAnimator.addState(b.f11641d, e0(f2, f3));
            stateListAnimator.addState(b.f11642e, e0(f2, f3));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.F, "elevation", f2).setDuration(0L));
            if (i2 >= 22 && i2 <= 24) {
                FloatingActionButton floatingActionButton = this.F;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.F, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(b.a);
            stateListAnimator.addState(b.f11643f, animatorSet);
            stateListAnimator.addState(b.f11644g, e0(0.0f, 0.0f));
            this.F.setStateListAnimator(stateListAnimator);
        }
        if (V()) {
            b0();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.b
    boolean I() {
        return false;
    }

    @Override // com.google.android.material.floatingactionbutton.b
    void R(ColorStateList colorStateList) {
        Drawable drawable = this.f11647j;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(e.c.b.c.a0.b.d(colorStateList));
        } else {
            super.R(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.b
    boolean V() {
        return this.G.b() || !X();
    }

    @Override // com.google.android.material.floatingactionbutton.b
    void Z() {
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public float m() {
        return this.F.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.b
    void r(Rect rect) {
        if (this.G.b()) {
            super.r(rect);
        } else if (X()) {
            rect.set(0, 0, 0, 0);
        } else {
            int sizeDimension = (this.r - this.F.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.b
    void y() {
    }
}