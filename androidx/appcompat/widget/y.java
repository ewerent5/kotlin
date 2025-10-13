package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.TextView;
import androidx.core.content.c.f;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;

/* compiled from: AppCompatTextHelper.java */
/* loaded from: classes.dex */
class y {
    private final TextView a;

    /* renamed from: b, reason: collision with root package name */
    private u0 f631b;

    /* renamed from: c, reason: collision with root package name */
    private u0 f632c;

    /* renamed from: d, reason: collision with root package name */
    private u0 f633d;

    /* renamed from: e, reason: collision with root package name */
    private u0 f634e;

    /* renamed from: f, reason: collision with root package name */
    private u0 f635f;

    /* renamed from: g, reason: collision with root package name */
    private u0 f636g;

    /* renamed from: h, reason: collision with root package name */
    private u0 f637h;

    /* renamed from: i, reason: collision with root package name */
    private final a0 f638i;

    /* renamed from: j, reason: collision with root package name */
    private int f639j = 0;

    /* renamed from: k, reason: collision with root package name */
    private int f640k = -1;

    /* renamed from: l, reason: collision with root package name */
    private Typeface f641l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f642m;

    /* compiled from: AppCompatTextHelper.java */
    class a extends f.a {
        final /* synthetic */ int a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f643b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeakReference f644c;

        a(int i2, int i3, WeakReference weakReference) {
            this.a = i2;
            this.f643b = i3;
            this.f644c = weakReference;
        }

        @Override // androidx.core.content.c.f.a
        public void c(int i2) {
        }

        @Override // androidx.core.content.c.f.a
        public void d(Typeface typeface) {
            int i2;
            if (Build.VERSION.SDK_INT >= 28 && (i2 = this.a) != -1) {
                typeface = Typeface.create(typeface, i2, (this.f643b & 2) != 0);
            }
            y.this.n(this.f644c, typeface);
        }
    }

    y(TextView textView) {
        this.a = textView;
        this.f638i = new a0(textView);
    }

    private void A(int i2, float f2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f638i.y(i2, f2);
    }

    private void B(Context context, w0 w0Var) {
        String strO;
        this.f639j = w0Var.k(c.a.j.a3, this.f639j);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int iK = w0Var.k(c.a.j.f3, -1);
            this.f640k = iK;
            if (iK != -1) {
                this.f639j = (this.f639j & 2) | 0;
            }
        }
        int i3 = c.a.j.e3;
        if (!w0Var.s(i3) && !w0Var.s(c.a.j.g3)) {
            int i4 = c.a.j.Z2;
            if (w0Var.s(i4)) {
                this.f642m = false;
                int iK2 = w0Var.k(i4, 1);
                if (iK2 == 1) {
                    this.f641l = Typeface.SANS_SERIF;
                    return;
                } else if (iK2 == 2) {
                    this.f641l = Typeface.SERIF;
                    return;
                } else {
                    if (iK2 != 3) {
                        return;
                    }
                    this.f641l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f641l = null;
        int i5 = c.a.j.g3;
        if (w0Var.s(i5)) {
            i3 = i5;
        }
        int i6 = this.f640k;
        int i7 = this.f639j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceJ = w0Var.j(i3, this.f639j, new a(i6, i7, new WeakReference(this.a)));
                if (typefaceJ != null) {
                    if (i2 < 28 || this.f640k == -1) {
                        this.f641l = typefaceJ;
                    } else {
                        this.f641l = Typeface.create(Typeface.create(typefaceJ, 0), this.f640k, (this.f639j & 2) != 0);
                    }
                }
                this.f642m = this.f641l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f641l != null || (strO = w0Var.o(i3)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f640k == -1) {
            this.f641l = Typeface.create(strO, this.f639j);
        } else {
            this.f641l = Typeface.create(Typeface.create(strO, 0), this.f640k, (this.f639j & 2) != 0);
        }
    }

    private void a(Drawable drawable, u0 u0Var) {
        if (drawable == null || u0Var == null) {
            return;
        }
        j.i(drawable, u0Var, this.a.getDrawableState());
    }

    private static u0 d(Context context, j jVar, int i2) {
        ColorStateList colorStateListF = jVar.f(context, i2);
        if (colorStateListF == null) {
            return null;
        }
        u0 u0Var = new u0();
        u0Var.f582d = true;
        u0Var.a = colorStateListF;
        return u0Var;
    }

    private void x(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 17 && (drawable5 != null || drawable6 != null)) {
            Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
            TextView textView = this.a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        if (i2 >= 17) {
            Drawable[] compoundDrawablesRelative2 = this.a.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative2[0] != null || compoundDrawablesRelative2[2] != null) {
                TextView textView2 = this.a;
                Drawable drawable7 = compoundDrawablesRelative2[0];
                if (drawable2 == null) {
                    drawable2 = compoundDrawablesRelative2[1];
                }
                Drawable drawable8 = compoundDrawablesRelative2[2];
                if (drawable4 == null) {
                    drawable4 = compoundDrawablesRelative2[3];
                }
                textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
                return;
            }
        }
        Drawable[] compoundDrawables = this.a.getCompoundDrawables();
        TextView textView3 = this.a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    private void y() {
        u0 u0Var = this.f637h;
        this.f631b = u0Var;
        this.f632c = u0Var;
        this.f633d = u0Var;
        this.f634e = u0Var;
        this.f635f = u0Var;
        this.f636g = u0Var;
    }

    void b() {
        if (this.f631b != null || this.f632c != null || this.f633d != null || this.f634e != null) {
            Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            a(compoundDrawables[0], this.f631b);
            a(compoundDrawables[1], this.f632c);
            a(compoundDrawables[2], this.f633d);
            a(compoundDrawables[3], this.f634e);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (this.f635f == null && this.f636g == null) {
                return;
            }
            Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f635f);
            a(compoundDrawablesRelative[2], this.f636g);
        }
    }

    void c() {
        this.f638i.b();
    }

    int e() {
        return this.f638i.j();
    }

    int f() {
        return this.f638i.k();
    }

    int g() {
        return this.f638i.l();
    }

    int[] h() {
        return this.f638i.m();
    }

    int i() {
        return this.f638i.n();
    }

    ColorStateList j() {
        u0 u0Var = this.f637h;
        if (u0Var != null) {
            return u0Var.a;
        }
        return null;
    }

    PorterDuff.Mode k() {
        u0 u0Var = this.f637h;
        if (u0Var != null) {
            return u0Var.f580b;
        }
        return null;
    }

    boolean l() {
        return this.f638i.s();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a6  */
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m(android.util.AttributeSet r24, int r25) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.y.m(android.util.AttributeSet, int):void");
    }

    void n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f642m) {
            this.f641l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, this.f639j);
            }
        }
    }

    void o(boolean z, int i2, int i3, int i4, int i5) {
        if (androidx.core.widget.b.a) {
            return;
        }
        c();
    }

    void p() {
        b();
    }

    void q(Context context, int i2) {
        String strO;
        ColorStateList colorStateListC;
        w0 w0VarT = w0.t(context, i2, c.a.j.X2);
        int i3 = c.a.j.i3;
        if (w0VarT.s(i3)) {
            r(w0VarT.a(i3, false));
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 23) {
            int i5 = c.a.j.b3;
            if (w0VarT.s(i5) && (colorStateListC = w0VarT.c(i5)) != null) {
                this.a.setTextColor(colorStateListC);
            }
        }
        int i6 = c.a.j.Y2;
        if (w0VarT.s(i6) && w0VarT.f(i6, -1) == 0) {
            this.a.setTextSize(0, 0.0f);
        }
        B(context, w0VarT);
        if (i4 >= 26) {
            int i7 = c.a.j.h3;
            if (w0VarT.s(i7) && (strO = w0VarT.o(i7)) != null) {
                this.a.setFontVariationSettings(strO);
            }
        }
        w0VarT.w();
        Typeface typeface = this.f641l;
        if (typeface != null) {
            this.a.setTypeface(typeface, this.f639j);
        }
    }

    void r(boolean z) {
        this.a.setAllCaps(z);
    }

    void s(int i2, int i3, int i4, int i5) {
        this.f638i.u(i2, i3, i4, i5);
    }

    void t(int[] iArr, int i2) {
        this.f638i.v(iArr, i2);
    }

    void u(int i2) {
        this.f638i.w(i2);
    }

    void v(ColorStateList colorStateList) {
        if (this.f637h == null) {
            this.f637h = new u0();
        }
        u0 u0Var = this.f637h;
        u0Var.a = colorStateList;
        u0Var.f582d = colorStateList != null;
        y();
    }

    void w(PorterDuff.Mode mode) {
        if (this.f637h == null) {
            this.f637h = new u0();
        }
        u0 u0Var = this.f637h;
        u0Var.f580b = mode;
        u0Var.f581c = mode != null;
        y();
    }

    void z(int i2, float f2) {
        if (androidx.core.widget.b.a || l()) {
            return;
        }
        A(i2, f2);
    }
}