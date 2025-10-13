package com.google.android.material.appbar;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.Resources;
import android.view.View;
import e.c.b.c.g;

/* compiled from: ViewUtilsLollipop.java */
/* loaded from: classes.dex */
class e {
    private static final int[] a = {R.attr.stateListAnimator};

    static void a(View view, float f2) throws Resources.NotFoundException {
        int integer = view.getResources().getInteger(g.a);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j2 = integer;
        stateListAnimator.addState(new int[]{R.attr.enabled, e.c.b.c.b.D, -e.c.b.c.b.E}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j2));
        stateListAnimator.addState(new int[]{R.attr.enabled}, ObjectAnimator.ofFloat(view, "elevation", f2).setDuration(j2));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }
}