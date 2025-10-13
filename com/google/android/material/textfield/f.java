package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.z;
import c.h.l.t;
import java.util.ArrayList;
import java.util.List;

/* compiled from: IndicatorViewController.java */
/* loaded from: classes.dex */
final class f {
    private final Context a;

    /* renamed from: b */
    private final TextInputLayout f11846b;

    /* renamed from: c */
    private LinearLayout f11847c;

    /* renamed from: d */
    private int f11848d;

    /* renamed from: e */
    private FrameLayout f11849e;

    /* renamed from: f */
    private Animator f11850f;

    /* renamed from: g */
    private final float f11851g;

    /* renamed from: h */
    private int f11852h;

    /* renamed from: i */
    private int f11853i;

    /* renamed from: j */
    private CharSequence f11854j;

    /* renamed from: k */
    private boolean f11855k;

    /* renamed from: l */
    private TextView f11856l;

    /* renamed from: m */
    private CharSequence f11857m;
    private int n;
    private ColorStateList o;
    private CharSequence p;
    private boolean q;
    private TextView r;
    private int s;
    private ColorStateList t;
    private Typeface u;

    /* compiled from: IndicatorViewController.java */
    class a extends AnimatorListenerAdapter {
        final /* synthetic */ int a;

        /* renamed from: b */
        final /* synthetic */ TextView f11858b;

        /* renamed from: c */
        final /* synthetic */ int f11859c;

        /* renamed from: d */
        final /* synthetic */ TextView f11860d;

        a(int i2, TextView textView, int i3, TextView textView2) {
            this.a = i2;
            this.f11858b = textView;
            this.f11859c = i3;
            this.f11860d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f.this.f11852h = this.a;
            f.this.f11850f = null;
            TextView textView = this.f11858b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f11859c == 1 && f.this.f11856l != null) {
                    f.this.f11856l.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f11860d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f11860d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f11860d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public f(TextInputLayout textInputLayout) {
        this.a = textInputLayout.getContext();
        this.f11846b = textInputLayout;
        this.f11851g = r0.getResources().getDimensionPixelSize(e.c.b.c.d.f15192j);
    }

    private void A(int i2, int i3) {
        TextView textViewL;
        TextView textViewL2;
        if (i2 == i3) {
            return;
        }
        if (i3 != 0 && (textViewL2 = l(i3)) != null) {
            textViewL2.setVisibility(0);
            textViewL2.setAlpha(1.0f);
        }
        if (i2 != 0 && (textViewL = l(i2)) != null) {
            textViewL.setVisibility(4);
            if (i2 == 1) {
                textViewL.setText((CharSequence) null);
            }
        }
        this.f11852h = i3;
    }

    private void I(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void K(ViewGroup viewGroup, int i2) {
        if (i2 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean L(TextView textView, CharSequence charSequence) {
        return t.Q(this.f11846b) && this.f11846b.isEnabled() && !(this.f11853i == this.f11852h && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    private void O(int i2, int i3, boolean z) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        if (i2 == i3) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f11850f = animatorSet;
            ArrayList arrayList = new ArrayList();
            h(arrayList, this.q, this.r, 2, i2, i3);
            h(arrayList, this.f11855k, this.f11856l, 1, i2, i3);
            e.c.b.c.m.b.a(animatorSet, arrayList);
            animatorSet.addListener(new a(i3, l(i2), i2, l(i3)));
            animatorSet.start();
        } else {
            A(i2, i3);
        }
        this.f11846b.r0();
        this.f11846b.u0(z);
        this.f11846b.E0();
    }

    private boolean f() {
        return (this.f11847c == null || this.f11846b.getEditText() == null) ? false : true;
    }

    private void h(List<Animator> list, boolean z, TextView textView, int i2, int i3, int i4) {
        if (textView == null || !z) {
            return;
        }
        if (i2 == i4 || i2 == i3) {
            list.add(i(textView, i4 == i2));
            if (i4 == i2) {
                list.add(j(textView));
            }
        }
    }

    private ObjectAnimator i(TextView textView, boolean z) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z ? 1.0f : 0.0f);
        objectAnimatorOfFloat.setDuration(167L);
        objectAnimatorOfFloat.setInterpolator(e.c.b.c.m.a.a);
        return objectAnimatorOfFloat;
    }

    private ObjectAnimator j(TextView textView) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f11851g, 0.0f);
        objectAnimatorOfFloat.setDuration(217L);
        objectAnimatorOfFloat.setInterpolator(e.c.b.c.m.a.f15266d);
        return objectAnimatorOfFloat;
    }

    private TextView l(int i2) {
        if (i2 == 1) {
            return this.f11856l;
        }
        if (i2 != 2) {
            return null;
        }
        return this.r;
    }

    private int s(boolean z, int i2, int i3) {
        return z ? this.a.getResources().getDimensionPixelSize(i2) : i3;
    }

    private boolean v(int i2) {
        return (i2 != 1 || this.f11856l == null || TextUtils.isEmpty(this.f11854j)) ? false : true;
    }

    void B(CharSequence charSequence) {
        this.f11857m = charSequence;
        TextView textView = this.f11856l;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    void C(boolean z) {
        if (this.f11855k == z) {
            return;
        }
        g();
        if (z) {
            z zVar = new z(this.a);
            this.f11856l = zVar;
            zVar.setId(e.c.b.c.f.L);
            if (Build.VERSION.SDK_INT >= 17) {
                this.f11856l.setTextAlignment(5);
            }
            Typeface typeface = this.u;
            if (typeface != null) {
                this.f11856l.setTypeface(typeface);
            }
            D(this.n);
            E(this.o);
            B(this.f11857m);
            this.f11856l.setVisibility(4);
            t.m0(this.f11856l, 1);
            d(this.f11856l, 0);
        } else {
            t();
            z(this.f11856l, 0);
            this.f11856l = null;
            this.f11846b.r0();
            this.f11846b.E0();
        }
        this.f11855k = z;
    }

    void D(int i2) {
        this.n = i2;
        TextView textView = this.f11856l;
        if (textView != null) {
            this.f11846b.e0(textView, i2);
        }
    }

    void E(ColorStateList colorStateList) {
        this.o = colorStateList;
        TextView textView = this.f11856l;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void F(int i2) {
        this.s = i2;
        TextView textView = this.r;
        if (textView != null) {
            androidx.core.widget.i.q(textView, i2);
        }
    }

    void G(boolean z) {
        if (this.q == z) {
            return;
        }
        g();
        if (z) {
            z zVar = new z(this.a);
            this.r = zVar;
            zVar.setId(e.c.b.c.f.M);
            if (Build.VERSION.SDK_INT >= 17) {
                this.r.setTextAlignment(5);
            }
            Typeface typeface = this.u;
            if (typeface != null) {
                this.r.setTypeface(typeface);
            }
            this.r.setVisibility(4);
            t.m0(this.r, 1);
            F(this.s);
            H(this.t);
            d(this.r, 1);
        } else {
            u();
            z(this.r, 1);
            this.r = null;
            this.f11846b.r0();
            this.f11846b.E0();
        }
        this.q = z;
    }

    void H(ColorStateList colorStateList) {
        this.t = colorStateList;
        TextView textView = this.r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void J(Typeface typeface) {
        if (typeface != this.u) {
            this.u = typeface;
            I(this.f11856l, typeface);
            I(this.r, typeface);
        }
    }

    void M(CharSequence charSequence) {
        g();
        this.f11854j = charSequence;
        this.f11856l.setText(charSequence);
        int i2 = this.f11852h;
        if (i2 != 1) {
            this.f11853i = 1;
        }
        O(i2, this.f11853i, L(this.f11856l, charSequence));
    }

    void N(CharSequence charSequence) {
        g();
        this.p = charSequence;
        this.r.setText(charSequence);
        int i2 = this.f11852h;
        if (i2 != 2) {
            this.f11853i = 2;
        }
        O(i2, this.f11853i, L(this.r, charSequence));
    }

    void d(TextView textView, int i2) {
        if (this.f11847c == null && this.f11849e == null) {
            LinearLayout linearLayout = new LinearLayout(this.a);
            this.f11847c = linearLayout;
            linearLayout.setOrientation(0);
            this.f11846b.addView(this.f11847c, -1, -2);
            this.f11849e = new FrameLayout(this.a);
            this.f11847c.addView(this.f11849e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f11846b.getEditText() != null) {
                e();
            }
        }
        if (w(i2)) {
            this.f11849e.setVisibility(0);
            this.f11849e.addView(textView);
        } else {
            this.f11847c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f11847c.setVisibility(0);
        this.f11848d++;
    }

    void e() {
        if (f()) {
            EditText editText = this.f11846b.getEditText();
            boolean zG = e.c.b.c.z.c.g(this.a);
            LinearLayout linearLayout = this.f11847c;
            int i2 = e.c.b.c.d.u;
            t.x0(linearLayout, s(zG, i2, t.G(editText)), s(zG, e.c.b.c.d.v, this.a.getResources().getDimensionPixelSize(e.c.b.c.d.t)), s(zG, i2, t.F(editText)), 0);
        }
    }

    void g() {
        Animator animator = this.f11850f;
        if (animator != null) {
            animator.cancel();
        }
    }

    boolean k() {
        return v(this.f11853i);
    }

    CharSequence m() {
        return this.f11857m;
    }

    CharSequence n() {
        return this.f11854j;
    }

    int o() {
        TextView textView = this.f11856l;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    ColorStateList p() {
        TextView textView = this.f11856l;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    CharSequence q() {
        return this.p;
    }

    int r() {
        TextView textView = this.r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    void t() {
        this.f11854j = null;
        g();
        if (this.f11852h == 1) {
            if (!this.q || TextUtils.isEmpty(this.p)) {
                this.f11853i = 0;
            } else {
                this.f11853i = 2;
            }
        }
        O(this.f11852h, this.f11853i, L(this.f11856l, null));
    }

    void u() throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        g();
        int i2 = this.f11852h;
        if (i2 == 2) {
            this.f11853i = 0;
        }
        O(i2, this.f11853i, L(this.r, null));
    }

    boolean w(int i2) {
        return i2 == 0 || i2 == 1;
    }

    boolean x() {
        return this.f11855k;
    }

    boolean y() {
        return this.q;
    }

    void z(TextView textView, int i2) {
        FrameLayout frameLayout;
        if (this.f11847c == null) {
            return;
        }
        if (!w(i2) || (frameLayout = this.f11849e) == null) {
            this.f11847c.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i3 = this.f11848d - 1;
        this.f11848d = i3;
        K(this.f11847c, i3);
    }
}