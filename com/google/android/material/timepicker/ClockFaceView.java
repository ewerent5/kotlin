package com.google.android.material.timepicker;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import c.h.l.c0.c;
import c.h.l.t;
import com.google.android.material.timepicker.ClockHandView;
import e.c.b.c.d;
import e.c.b.c.f;
import e.c.b.c.h;
import e.c.b.c.k;
import e.c.b.c.l;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* loaded from: classes.dex */
class ClockFaceView extends com.google.android.material.timepicker.b implements ClockHandView.d {
    private final ClockHandView E;
    private final Rect F;
    private final RectF G;
    private final SparseArray<TextView> H;
    private final c.h.l.a I;
    private final int[] J;
    private final float[] K;
    private final int L;
    private String[] M;
    private float N;
    private final ColorStateList O;

    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.w(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.E.g()) - ClockFaceView.this.L);
            return true;
        }
    }

    class b extends c.h.l.a {
        b() {
        }

        @Override // c.h.l.a
        public void g(View view, c.h.l.c0.c cVar) {
            super.g(view, cVar);
            int iIntValue = ((Integer) view.getTag(f.n)).intValue();
            if (iIntValue > 0) {
                cVar.v0((View) ClockFaceView.this.H.get(iIntValue - 1));
            }
            cVar.b0(c.C0058c.f(0, 1, iIntValue, 1, false, view.isSelected()));
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.c.b.c.b.t);
    }

    private void D() {
        RectF rectFD = this.E.d();
        for (int i2 = 0; i2 < this.H.size(); i2++) {
            TextView textView = this.H.get(i2);
            if (textView != null) {
                textView.getDrawingRect(this.F);
                this.F.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                offsetDescendantRectToMyCoords(textView, this.F);
                this.G.set(this.F);
                textView.getPaint().setShader(E(rectFD, this.G));
                textView.invalidate();
            }
        }
    }

    private RadialGradient E(RectF rectF, RectF rectF2) {
        if (RectF.intersects(rectF, rectF2)) {
            return new RadialGradient(rectF.centerX() - this.G.left, rectF.centerY() - this.G.top, rectF.width() * 0.5f, this.J, this.K, Shader.TileMode.CLAMP);
        }
        return null;
    }

    private void G(int i2) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = this.H.size();
        for (int i3 = 0; i3 < Math.max(this.M.length, size); i3++) {
            TextView textView = this.H.get(i3);
            if (i3 >= this.M.length) {
                removeView(textView);
                this.H.remove(i3);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(h.f15222h, (ViewGroup) this, false);
                    this.H.put(i3, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.M[i3]);
                textView.setTag(f.n, Integer.valueOf(i3));
                t.k0(textView, this.I);
                textView.setTextColor(this.O);
                if (i2 != 0) {
                    textView.setContentDescription(getResources().getString(i2, this.M[i3]));
                }
            }
        }
    }

    public void F(String[] strArr, int i2) {
        this.M = strArr;
        G(i2);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.d
    public void a(float f2, boolean z) {
        if (Math.abs(this.N - f2) > 0.001f) {
            this.N = f2;
            D();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        c.h.l.c0.c.y0(accessibilityNodeInfo).a0(c.b.a(1, this.M.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        D();
    }

    @Override // com.google.android.material.timepicker.b
    public void w(int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (i2 != v()) {
            super.w(i2);
            this.E.j(v());
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.F = new Rect();
        this.G = new RectF();
        this.H = new SparseArray<>();
        this.K = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.T0, i2, k.w);
        Resources resources = getResources();
        ColorStateList colorStateListA = e.c.b.c.z.c.a(context, typedArrayObtainStyledAttributes, l.V0);
        this.O = colorStateListA;
        LayoutInflater.from(context).inflate(h.f15223i, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(f.f15209h);
        this.E = clockHandView;
        this.L = resources.getDimensionPixelSize(d.f15194l);
        int colorForState = colorStateListA.getColorForState(new int[]{R.attr.state_selected}, colorStateListA.getDefaultColor());
        this.J = new int[]{colorForState, colorForState, colorStateListA.getDefaultColor()};
        clockHandView.b(this);
        int defaultColor = c.a.k.a.a.c(context, e.c.b.c.c.f15094b).getDefaultColor();
        ColorStateList colorStateListA2 = e.c.b.c.z.c.a(context, typedArrayObtainStyledAttributes, l.U0);
        setBackgroundColor(colorStateListA2 != null ? colorStateListA2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.I = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        F(strArr, 0);
    }
}