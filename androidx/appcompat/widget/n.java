package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;

/* compiled from: AppCompatImageHelper.java */
/* loaded from: classes.dex */
public class n {
    private final ImageView a;

    /* renamed from: b, reason: collision with root package name */
    private u0 f522b;

    /* renamed from: c, reason: collision with root package name */
    private u0 f523c;

    /* renamed from: d, reason: collision with root package name */
    private u0 f524d;

    public n(ImageView imageView) {
        this.a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.f524d == null) {
            this.f524d = new u0();
        }
        u0 u0Var = this.f524d;
        u0Var.a();
        ColorStateList colorStateListA = androidx.core.widget.e.a(this.a);
        if (colorStateListA != null) {
            u0Var.f582d = true;
            u0Var.a = colorStateListA;
        }
        PorterDuff.Mode modeB = androidx.core.widget.e.b(this.a);
        if (modeB != null) {
            u0Var.f581c = true;
            u0Var.f580b = modeB;
        }
        if (!u0Var.f582d && !u0Var.f581c) {
            return false;
        }
        j.i(drawable, u0Var, this.a.getDrawableState());
        return true;
    }

    private boolean j() {
        int i2 = Build.VERSION.SDK_INT;
        return i2 > 21 ? this.f522b != null : i2 == 21;
    }

    void b() {
        Drawable drawable = this.a.getDrawable();
        if (drawable != null) {
            e0.b(drawable);
        }
        if (drawable != null) {
            if (j() && a(drawable)) {
                return;
            }
            u0 u0Var = this.f523c;
            if (u0Var != null) {
                j.i(drawable, u0Var, this.a.getDrawableState());
                return;
            }
            u0 u0Var2 = this.f522b;
            if (u0Var2 != null) {
                j.i(drawable, u0Var2, this.a.getDrawableState());
            }
        }
    }

    ColorStateList c() {
        u0 u0Var = this.f523c;
        if (u0Var != null) {
            return u0Var.a;
        }
        return null;
    }

    PorterDuff.Mode d() {
        u0 u0Var = this.f523c;
        if (u0Var != null) {
            return u0Var.f580b;
        }
        return null;
    }

    boolean e() {
        return Build.VERSION.SDK_INT < 21 || !(this.a.getBackground() instanceof RippleDrawable);
    }

    public void f(AttributeSet attributeSet, int i2) {
        int iN;
        Context context = this.a.getContext();
        int[] iArr = c.a.j.R;
        w0 w0VarV = w0.v(context, attributeSet, iArr, i2, 0);
        ImageView imageView = this.a;
        c.h.l.t.i0(imageView, imageView.getContext(), iArr, attributeSet, w0VarV.r(), i2, 0);
        try {
            Drawable drawable = this.a.getDrawable();
            if (drawable == null && (iN = w0VarV.n(c.a.j.S, -1)) != -1 && (drawable = c.a.k.a.a.d(this.a.getContext(), iN)) != null) {
                this.a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                e0.b(drawable);
            }
            int i3 = c.a.j.T;
            if (w0VarV.s(i3)) {
                androidx.core.widget.e.c(this.a, w0VarV.c(i3));
            }
            int i4 = c.a.j.U;
            if (w0VarV.s(i4)) {
                androidx.core.widget.e.d(this.a, e0.e(w0VarV.k(i4, -1), null));
            }
        } finally {
            w0VarV.w();
        }
    }

    public void g(int i2) {
        if (i2 != 0) {
            Drawable drawableD = c.a.k.a.a.d(this.a.getContext(), i2);
            if (drawableD != null) {
                e0.b(drawableD);
            }
            this.a.setImageDrawable(drawableD);
        } else {
            this.a.setImageDrawable(null);
        }
        b();
    }

    void h(ColorStateList colorStateList) {
        if (this.f523c == null) {
            this.f523c = new u0();
        }
        u0 u0Var = this.f523c;
        u0Var.a = colorStateList;
        u0Var.f582d = true;
        b();
    }

    void i(PorterDuff.Mode mode) {
        if (this.f523c == null) {
            this.f523c = new u0();
        }
        u0 u0Var = this.f523c;
        u0Var.f580b = mode;
        u0Var.f581c = true;
        b();
    }
}