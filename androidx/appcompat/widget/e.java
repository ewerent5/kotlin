package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: AppCompatBackgroundHelper.java */
/* loaded from: classes.dex */
class e {
    private final View a;

    /* renamed from: d, reason: collision with root package name */
    private u0 f437d;

    /* renamed from: e, reason: collision with root package name */
    private u0 f438e;

    /* renamed from: f, reason: collision with root package name */
    private u0 f439f;

    /* renamed from: c, reason: collision with root package name */
    private int f436c = -1;

    /* renamed from: b, reason: collision with root package name */
    private final j f435b = j.b();

    e(View view) {
        this.a = view;
    }

    private boolean a(Drawable drawable) {
        if (this.f439f == null) {
            this.f439f = new u0();
        }
        u0 u0Var = this.f439f;
        u0Var.a();
        ColorStateList colorStateListS = c.h.l.t.s(this.a);
        if (colorStateListS != null) {
            u0Var.f582d = true;
            u0Var.a = colorStateListS;
        }
        PorterDuff.Mode modeT = c.h.l.t.t(this.a);
        if (modeT != null) {
            u0Var.f581c = true;
            u0Var.f580b = modeT;
        }
        if (!u0Var.f582d && !u0Var.f581c) {
            return false;
        }
        j.i(drawable, u0Var, this.a.getDrawableState());
        return true;
    }

    private boolean k() {
        int i2 = Build.VERSION.SDK_INT;
        return i2 > 21 ? this.f437d != null : i2 == 21;
    }

    void b() {
        Drawable background = this.a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            u0 u0Var = this.f438e;
            if (u0Var != null) {
                j.i(background, u0Var, this.a.getDrawableState());
                return;
            }
            u0 u0Var2 = this.f437d;
            if (u0Var2 != null) {
                j.i(background, u0Var2, this.a.getDrawableState());
            }
        }
    }

    ColorStateList c() {
        u0 u0Var = this.f438e;
        if (u0Var != null) {
            return u0Var.a;
        }
        return null;
    }

    PorterDuff.Mode d() {
        u0 u0Var = this.f438e;
        if (u0Var != null) {
            return u0Var.f580b;
        }
        return null;
    }

    void e(AttributeSet attributeSet, int i2) {
        Context context = this.a.getContext();
        int[] iArr = c.a.j.R3;
        w0 w0VarV = w0.v(context, attributeSet, iArr, i2, 0);
        View view = this.a;
        c.h.l.t.i0(view, view.getContext(), iArr, attributeSet, w0VarV.r(), i2, 0);
        try {
            int i3 = c.a.j.S3;
            if (w0VarV.s(i3)) {
                this.f436c = w0VarV.n(i3, -1);
                ColorStateList colorStateListF = this.f435b.f(this.a.getContext(), this.f436c);
                if (colorStateListF != null) {
                    h(colorStateListF);
                }
            }
            int i4 = c.a.j.T3;
            if (w0VarV.s(i4)) {
                c.h.l.t.o0(this.a, w0VarV.c(i4));
            }
            int i5 = c.a.j.U3;
            if (w0VarV.s(i5)) {
                c.h.l.t.p0(this.a, e0.e(w0VarV.k(i5, -1), null));
            }
        } finally {
            w0VarV.w();
        }
    }

    void f(Drawable drawable) {
        this.f436c = -1;
        h(null);
        b();
    }

    void g(int i2) {
        this.f436c = i2;
        j jVar = this.f435b;
        h(jVar != null ? jVar.f(this.a.getContext(), i2) : null);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f437d == null) {
                this.f437d = new u0();
            }
            u0 u0Var = this.f437d;
            u0Var.a = colorStateList;
            u0Var.f582d = true;
        } else {
            this.f437d = null;
        }
        b();
    }

    void i(ColorStateList colorStateList) {
        if (this.f438e == null) {
            this.f438e = new u0();
        }
        u0 u0Var = this.f438e;
        u0Var.a = colorStateList;
        u0Var.f582d = true;
        b();
    }

    void j(PorterDuff.Mode mode) {
        if (this.f438e == null) {
            this.f438e = new u0();
        }
        u0 u0Var = this.f438e;
        u0Var.f580b = mode;
        u0Var.f581c = true;
        b();
    }
}