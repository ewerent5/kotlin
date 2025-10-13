package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* compiled from: AppCompatCompoundButtonHelper.java */
/* loaded from: classes.dex */
class i {
    private final CompoundButton a;

    /* renamed from: b, reason: collision with root package name */
    private ColorStateList f472b = null;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f473c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f474d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f475e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f476f;

    i(CompoundButton compoundButton) {
        this.a = compoundButton;
    }

    void a() throws NoSuchFieldException {
        Drawable drawableA = androidx.core.widget.c.a(this.a);
        if (drawableA != null) {
            if (this.f474d || this.f475e) {
                Drawable drawableMutate = androidx.core.graphics.drawable.a.r(drawableA).mutate();
                if (this.f474d) {
                    androidx.core.graphics.drawable.a.o(drawableMutate, this.f472b);
                }
                if (this.f475e) {
                    androidx.core.graphics.drawable.a.p(drawableMutate, this.f473c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.a.getDrawableState());
                }
                this.a.setButtonDrawable(drawableMutate);
            }
        }
    }

    int b(int i2) {
        Drawable drawableA;
        return (Build.VERSION.SDK_INT >= 17 || (drawableA = androidx.core.widget.c.a(this.a)) == null) ? i2 : i2 + drawableA.getIntrinsicWidth();
    }

    ColorStateList c() {
        return this.f472b;
    }

    PorterDuff.Mode d() {
        return this.f473c;
    }

    void e(AttributeSet attributeSet, int i2) {
        boolean z;
        int iN;
        int iN2;
        Context context = this.a.getContext();
        int[] iArr = c.a.j.R0;
        w0 w0VarV = w0.v(context, attributeSet, iArr, i2, 0);
        CompoundButton compoundButton = this.a;
        c.h.l.t.i0(compoundButton, compoundButton.getContext(), iArr, attributeSet, w0VarV.r(), i2, 0);
        try {
            int i3 = c.a.j.T0;
            if (!w0VarV.s(i3) || (iN2 = w0VarV.n(i3, 0)) == 0) {
                z = false;
            } else {
                try {
                    CompoundButton compoundButton2 = this.a;
                    compoundButton2.setButtonDrawable(c.a.k.a.a.d(compoundButton2.getContext(), iN2));
                    z = true;
                } catch (Resources.NotFoundException unused) {
                }
            }
            if (!z) {
                int i4 = c.a.j.S0;
                if (w0VarV.s(i4) && (iN = w0VarV.n(i4, 0)) != 0) {
                    CompoundButton compoundButton3 = this.a;
                    compoundButton3.setButtonDrawable(c.a.k.a.a.d(compoundButton3.getContext(), iN));
                }
            }
            int i5 = c.a.j.U0;
            if (w0VarV.s(i5)) {
                androidx.core.widget.c.c(this.a, w0VarV.c(i5));
            }
            int i6 = c.a.j.V0;
            if (w0VarV.s(i6)) {
                androidx.core.widget.c.d(this.a, e0.e(w0VarV.k(i6, -1), null));
            }
        } finally {
            w0VarV.w();
        }
    }

    void f() {
        if (this.f476f) {
            this.f476f = false;
        } else {
            this.f476f = true;
            a();
        }
    }

    void g(ColorStateList colorStateList) {
        this.f472b = colorStateList;
        this.f474d = true;
        a();
    }

    void h(PorterDuff.Mode mode) {
        this.f473c = mode;
        this.f475e = true;
        a();
    }
}