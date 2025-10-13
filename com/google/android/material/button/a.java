package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import c.h.l.t;
import e.c.b.c.b;
import e.c.b.c.c0.g;
import e.c.b.c.c0.k;
import e.c.b.c.c0.n;
import e.c.b.c.l;
import e.c.b.c.z.c;

/* compiled from: MaterialButtonHelper.java */
/* loaded from: classes.dex */
class a {
    private static final boolean a;

    /* renamed from: b, reason: collision with root package name */
    private final MaterialButton f11520b;

    /* renamed from: c, reason: collision with root package name */
    private k f11521c;

    /* renamed from: d, reason: collision with root package name */
    private int f11522d;

    /* renamed from: e, reason: collision with root package name */
    private int f11523e;

    /* renamed from: f, reason: collision with root package name */
    private int f11524f;

    /* renamed from: g, reason: collision with root package name */
    private int f11525g;

    /* renamed from: h, reason: collision with root package name */
    private int f11526h;

    /* renamed from: i, reason: collision with root package name */
    private int f11527i;

    /* renamed from: j, reason: collision with root package name */
    private PorterDuff.Mode f11528j;

    /* renamed from: k, reason: collision with root package name */
    private ColorStateList f11529k;

    /* renamed from: l, reason: collision with root package name */
    private ColorStateList f11530l;

    /* renamed from: m, reason: collision with root package name */
    private ColorStateList f11531m;
    private Drawable n;
    private boolean o = false;
    private boolean p = false;
    private boolean q = false;
    private boolean r;
    private LayerDrawable s;
    private int t;

    static {
        a = Build.VERSION.SDK_INT >= 21;
    }

    a(MaterialButton materialButton, k kVar) {
        this.f11520b = materialButton;
        this.f11521c = kVar;
    }

    private void E(int i2, int i3) {
        int iG = t.G(this.f11520b);
        int paddingTop = this.f11520b.getPaddingTop();
        int iF = t.F(this.f11520b);
        int paddingBottom = this.f11520b.getPaddingBottom();
        int i4 = this.f11524f;
        int i5 = this.f11525g;
        this.f11525g = i3;
        this.f11524f = i2;
        if (!this.p) {
            F();
        }
        t.x0(this.f11520b, iG, (paddingTop + i2) - i4, iF, (paddingBottom + i3) - i5);
    }

    private void F() {
        this.f11520b.setInternalBackground(a());
        g gVarF = f();
        if (gVarF != null) {
            gVarF.W(this.t);
        }
    }

    private void G(k kVar) {
        if (f() != null) {
            f().setShapeAppearanceModel(kVar);
        }
        if (n() != null) {
            n().setShapeAppearanceModel(kVar);
        }
        if (e() != null) {
            e().setShapeAppearanceModel(kVar);
        }
    }

    private void I() {
        g gVarF = f();
        g gVarN = n();
        if (gVarF != null) {
            gVarF.d0(this.f11527i, this.f11530l);
            if (gVarN != null) {
                gVarN.c0(this.f11527i, this.o ? e.c.b.c.s.a.c(this.f11520b, b.f15081l) : 0);
            }
        }
    }

    private InsetDrawable J(Drawable drawable) {
        return new InsetDrawable(drawable, this.f11522d, this.f11524f, this.f11523e, this.f11525g);
    }

    private Drawable a() {
        g gVar = new g(this.f11521c);
        gVar.M(this.f11520b.getContext());
        androidx.core.graphics.drawable.a.o(gVar, this.f11529k);
        PorterDuff.Mode mode = this.f11528j;
        if (mode != null) {
            androidx.core.graphics.drawable.a.p(gVar, mode);
        }
        gVar.d0(this.f11527i, this.f11530l);
        g gVar2 = new g(this.f11521c);
        gVar2.setTint(0);
        gVar2.c0(this.f11527i, this.o ? e.c.b.c.s.a.c(this.f11520b, b.f15081l) : 0);
        if (a) {
            g gVar3 = new g(this.f11521c);
            this.n = gVar3;
            androidx.core.graphics.drawable.a.n(gVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(e.c.b.c.a0.b.d(this.f11531m), J(new LayerDrawable(new Drawable[]{gVar2, gVar})), this.n);
            this.s = rippleDrawable;
            return rippleDrawable;
        }
        e.c.b.c.a0.a aVar = new e.c.b.c.a0.a(this.f11521c);
        this.n = aVar;
        androidx.core.graphics.drawable.a.o(aVar, e.c.b.c.a0.b.d(this.f11531m));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar, this.n});
        this.s = layerDrawable;
        return J(layerDrawable);
    }

    private g g(boolean z) {
        LayerDrawable layerDrawable = this.s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return a ? (g) ((LayerDrawable) ((InsetDrawable) this.s.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0) : (g) this.s.getDrawable(!z ? 1 : 0);
    }

    private g n() {
        return g(true);
    }

    void A(ColorStateList colorStateList) {
        if (this.f11530l != colorStateList) {
            this.f11530l = colorStateList;
            I();
        }
    }

    void B(int i2) {
        if (this.f11527i != i2) {
            this.f11527i = i2;
            I();
        }
    }

    void C(ColorStateList colorStateList) {
        if (this.f11529k != colorStateList) {
            this.f11529k = colorStateList;
            if (f() != null) {
                androidx.core.graphics.drawable.a.o(f(), this.f11529k);
            }
        }
    }

    void D(PorterDuff.Mode mode) {
        if (this.f11528j != mode) {
            this.f11528j = mode;
            if (f() == null || this.f11528j == null) {
                return;
            }
            androidx.core.graphics.drawable.a.p(f(), this.f11528j);
        }
    }

    void H(int i2, int i3) {
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.setBounds(this.f11522d, this.f11524f, i3 - this.f11523e, i2 - this.f11525g);
        }
    }

    int b() {
        return this.f11526h;
    }

    public int c() {
        return this.f11525g;
    }

    public int d() {
        return this.f11524f;
    }

    public n e() {
        LayerDrawable layerDrawable = this.s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.s.getNumberOfLayers() > 2 ? (n) this.s.getDrawable(2) : (n) this.s.getDrawable(1);
    }

    g f() {
        return g(false);
    }

    ColorStateList h() {
        return this.f11531m;
    }

    k i() {
        return this.f11521c;
    }

    ColorStateList j() {
        return this.f11530l;
    }

    int k() {
        return this.f11527i;
    }

    ColorStateList l() {
        return this.f11529k;
    }

    PorterDuff.Mode m() {
        return this.f11528j;
    }

    boolean o() {
        return this.p;
    }

    boolean p() {
        return this.r;
    }

    void q(TypedArray typedArray) {
        this.f11522d = typedArray.getDimensionPixelOffset(l.W1, 0);
        this.f11523e = typedArray.getDimensionPixelOffset(l.X1, 0);
        this.f11524f = typedArray.getDimensionPixelOffset(l.Y1, 0);
        this.f11525g = typedArray.getDimensionPixelOffset(l.Z1, 0);
        int i2 = l.d2;
        if (typedArray.hasValue(i2)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i2, -1);
            this.f11526h = dimensionPixelSize;
            y(this.f11521c.w(dimensionPixelSize));
            this.q = true;
        }
        this.f11527i = typedArray.getDimensionPixelSize(l.n2, 0);
        this.f11528j = com.google.android.material.internal.k.e(typedArray.getInt(l.c2, -1), PorterDuff.Mode.SRC_IN);
        this.f11529k = c.a(this.f11520b.getContext(), typedArray, l.b2);
        this.f11530l = c.a(this.f11520b.getContext(), typedArray, l.m2);
        this.f11531m = c.a(this.f11520b.getContext(), typedArray, l.l2);
        this.r = typedArray.getBoolean(l.a2, false);
        this.t = typedArray.getDimensionPixelSize(l.e2, 0);
        int iG = t.G(this.f11520b);
        int paddingTop = this.f11520b.getPaddingTop();
        int iF = t.F(this.f11520b);
        int paddingBottom = this.f11520b.getPaddingBottom();
        if (typedArray.hasValue(l.V1)) {
            s();
        } else {
            F();
        }
        t.x0(this.f11520b, iG + this.f11522d, paddingTop + this.f11524f, iF + this.f11523e, paddingBottom + this.f11525g);
    }

    void r(int i2) {
        if (f() != null) {
            f().setTint(i2);
        }
    }

    void s() {
        this.p = true;
        this.f11520b.setSupportBackgroundTintList(this.f11529k);
        this.f11520b.setSupportBackgroundTintMode(this.f11528j);
    }

    void t(boolean z) {
        this.r = z;
    }

    void u(int i2) {
        if (this.q && this.f11526h == i2) {
            return;
        }
        this.f11526h = i2;
        this.q = true;
        y(this.f11521c.w(i2));
    }

    public void v(int i2) {
        E(this.f11524f, i2);
    }

    public void w(int i2) {
        E(i2, this.f11525g);
    }

    void x(ColorStateList colorStateList) {
        if (this.f11531m != colorStateList) {
            this.f11531m = colorStateList;
            boolean z = a;
            if (z && (this.f11520b.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f11520b.getBackground()).setColor(e.c.b.c.a0.b.d(colorStateList));
            } else {
                if (z || !(this.f11520b.getBackground() instanceof e.c.b.c.a0.a)) {
                    return;
                }
                ((e.c.b.c.a0.a) this.f11520b.getBackground()).setTintList(e.c.b.c.a0.b.d(colorStateList));
            }
        }
    }

    void y(k kVar) {
        this.f11521c = kVar;
        G(kVar);
    }

    void z(boolean z) {
        this.o = z;
        I();
    }
}