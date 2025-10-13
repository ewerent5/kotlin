package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import c.h.l.t;
import e.c.b.c.c0.g;
import e.c.b.c.c0.i;
import e.c.b.c.f;
import e.c.b.c.h;
import e.c.b.c.l;
import java.lang.reflect.InvocationTargetException;

/* compiled from: RadialViewGroup.java */
/* loaded from: classes.dex */
class b extends ConstraintLayout {
    private final Runnable B;
    private int C;
    private g D;

    /* compiled from: RadialViewGroup.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            b.this.y();
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private Drawable u() {
        g gVar = new g();
        this.D = gVar;
        gVar.V(new i(0.5f));
        this.D.X(ColorStateList.valueOf(-1));
        return this.D;
    }

    private static boolean x(View view) {
        return "skip".equals(view.getTag());
    }

    private void z() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.B);
            handler.post(this.B);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        if (view.getId() == -1) {
            view.setId(t.k());
        }
        z();
    }

    @Override // android.view.View
    protected void onFinishInflate() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onFinishInflate();
        y();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        z();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        this.D.X(ColorStateList.valueOf(i2));
    }

    public int v() {
        return this.C;
    }

    public void w(int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        this.C = i2;
        y();
    }

    protected void y() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int childCount = getChildCount();
        int i2 = 1;
        for (int i3 = 0; i3 < childCount; i3++) {
            if (x(getChildAt(i3))) {
                i2++;
            }
        }
        d dVar = new d();
        dVar.g(this);
        float f2 = 0.0f;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            int id = childAt.getId();
            int i5 = f.f15203b;
            if (id != i5 && !x(childAt)) {
                dVar.i(childAt.getId(), i5, this.C, f2);
                f2 += 360.0f / (childCount - i2);
            }
        }
        dVar.c(this);
    }

    public b(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        LayoutInflater.from(context).inflate(h.f15224j, this);
        t.n0(this, u());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.w3, i2, 0);
        this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.x3, 0);
        this.B = new a();
        typedArrayObtainStyledAttributes.recycle();
    }
}