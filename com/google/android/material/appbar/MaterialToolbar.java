package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.Toolbar;
import c.h.l.t;
import com.google.android.material.internal.j;
import e.c.b.c.c0.g;
import e.c.b.c.c0.h;
import e.c.b.c.k;
import e.c.b.c.l;

/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {
    private static final int T = k.x;
    private Integer U;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.c.b.c.b.K);
    }

    private void P(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            g gVar = new g();
            gVar.X(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            gVar.M(context);
            gVar.W(t.w(this));
            t.n0(this, gVar);
        }
    }

    private Drawable Q(Drawable drawable) {
        if (drawable == null || this.U == null) {
            return drawable;
        }
        Drawable drawableR = androidx.core.graphics.drawable.a.r(drawable);
        androidx.core.graphics.drawable.a.n(drawableR, this.U.intValue());
        return drawableR;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        h.d(this, f2);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(Q(drawable));
    }

    public void setNavigationIconTint(int i2) {
        this.U = Integer.valueOf(i2);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialToolbar(Context context, AttributeSet attributeSet, int i2) {
        int i3 = T;
        super(com.google.android.material.theme.a.a.c(context, attributeSet, i2, i3), attributeSet, i2);
        Context context2 = getContext();
        TypedArray typedArrayH = j.h(context2, attributeSet, l.f3, i2, i3, new int[0]);
        int i4 = l.g3;
        if (typedArrayH.hasValue(i4)) {
            setNavigationIconTint(typedArrayH.getColor(i4, -1));
        }
        typedArrayH.recycle();
        P(context2);
    }
}