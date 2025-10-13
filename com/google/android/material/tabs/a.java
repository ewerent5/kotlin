package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: ElasticTabIndicatorInterpolator.java */
/* loaded from: classes.dex */
class a extends b {
    a() {
    }

    private static float e(float f2) {
        return (float) (1.0d - Math.cos((f2 * 3.141592653589793d) / 2.0d));
    }

    private static float f(float f2) {
        return (float) Math.sin((f2 * 3.141592653589793d) / 2.0d);
    }

    @Override // com.google.android.material.tabs.b
    void c(TabLayout tabLayout, View view, View view2, float f2, Drawable drawable) {
        float f3;
        float fE;
        RectF rectFA = b.a(tabLayout, view);
        RectF rectFA2 = b.a(tabLayout, view2);
        if (rectFA.left < rectFA2.left) {
            f3 = e(f2);
            fE = f(f2);
        } else {
            f3 = f(f2);
            fE = e(f2);
        }
        drawable.setBounds(e.c.b.c.m.a.b((int) rectFA.left, (int) rectFA2.left, f3), drawable.getBounds().top, e.c.b.c.m.a.b((int) rectFA.right, (int) rectFA2.right, fE), drawable.getBounds().bottom);
    }
}