package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.k;
import com.google.android.material.tabs.TabLayout;

/* compiled from: TabIndicatorInterpolator.java */
/* loaded from: classes.dex */
class b {
    b() {
    }

    static RectF a(TabLayout tabLayout, View view) {
        return view == null ? new RectF() : (tabLayout.x() || !(view instanceof TabLayout.h)) ? new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) : b((TabLayout.h) view, 24);
    }

    static RectF b(TabLayout.h hVar, int i2) {
        int contentWidth = hVar.getContentWidth();
        int contentHeight = hVar.getContentHeight();
        int iB = (int) k.b(hVar.getContext(), i2);
        if (contentWidth < iB) {
            contentWidth = iB;
        }
        int left = (hVar.getLeft() + hVar.getRight()) / 2;
        int top = (hVar.getTop() + hVar.getBottom()) / 2;
        int i3 = contentWidth / 2;
        return new RectF(left - i3, top - (contentHeight / 2), i3 + left, top + (left / 2));
    }

    void c(TabLayout tabLayout, View view, View view2, float f2, Drawable drawable) {
        RectF rectFA = a(tabLayout, view);
        RectF rectFA2 = a(tabLayout, view2);
        drawable.setBounds(e.c.b.c.m.a.b((int) rectFA.left, (int) rectFA2.left, f2), drawable.getBounds().top, e.c.b.c.m.a.b((int) rectFA.right, (int) rectFA2.right, f2), drawable.getBounds().bottom);
    }

    void d(TabLayout tabLayout, View view, Drawable drawable) {
        RectF rectFA = a(tabLayout, view);
        drawable.setBounds((int) rectFA.left, drawable.getBounds().top, (int) rectFA.right, drawable.getBounds().bottom);
    }
}