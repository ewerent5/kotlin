package com.google.android.material.chip;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.b;
import com.google.android.material.internal.h;
import com.google.android.material.internal.j;
import com.google.android.material.internal.k;
import e.c.b.c.c0.g;
import e.c.b.c.l;
import e.c.b.c.z.c;
import e.c.b.c.z.d;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* compiled from: ChipDrawable.java */
/* loaded from: classes.dex */
public class a extends g implements b, Drawable.Callback, h.b {
    private static final int[] C = {R.attr.state_enabled};
    private static final ShapeDrawable D = new ShapeDrawable(new OvalShape());
    private int A0;
    private int B0;
    private ColorFilter C0;
    private PorterDuffColorFilter D0;
    private ColorStateList E;
    private ColorStateList E0;
    private ColorStateList F;
    private PorterDuff.Mode F0;
    private float G;
    private int[] G0;
    private float H;
    private boolean H0;
    private ColorStateList I;
    private ColorStateList I0;
    private float J;
    private WeakReference<InterfaceC0117a> J0;
    private ColorStateList K;
    private TextUtils.TruncateAt K0;
    private CharSequence L;
    private boolean L0;
    private boolean M;
    private int M0;
    private Drawable N;
    private boolean N0;
    private ColorStateList O;
    private float P;
    private boolean Q;
    private boolean R;
    private Drawable S;
    private Drawable T;
    private ColorStateList U;
    private float V;
    private CharSequence W;
    private boolean X;
    private boolean Y;
    private Drawable Z;
    private ColorStateList a0;
    private e.c.b.c.m.h b0;
    private e.c.b.c.m.h c0;
    private float d0;
    private float e0;
    private float f0;
    private float g0;
    private float h0;
    private float i0;
    private float j0;
    private float k0;
    private final Context l0;
    private final Paint m0;
    private final Paint n0;
    private final Paint.FontMetrics o0;
    private final RectF p0;
    private final PointF q0;
    private final Path r0;
    private final h s0;
    private int t0;
    private int u0;
    private int v0;
    private int w0;
    private int x0;
    private int y0;
    private boolean z0;

    /* compiled from: ChipDrawable.java */
    /* renamed from: com.google.android.material.chip.a$a */
    public interface InterfaceC0117a {
        void a();
    }

    private a(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.H = -1.0f;
        this.m0 = new Paint(1);
        this.o0 = new Paint.FontMetrics();
        this.p0 = new RectF();
        this.q0 = new PointF();
        this.r0 = new Path();
        this.B0 = 255;
        this.F0 = PorterDuff.Mode.SRC_IN;
        this.J0 = new WeakReference<>(null);
        M(context);
        this.l0 = context;
        h hVar = new h(this);
        this.s0 = hVar;
        this.L = "";
        hVar.e().density = context.getResources().getDisplayMetrics().density;
        this.n0 = null;
        int[] iArr = C;
        setState(iArr);
        k2(iArr);
        this.L0 = true;
        if (e.c.b.c.a0.b.a) {
            D.setTint(-1);
        }
    }

    private void A0(Canvas canvas, Rect rect) {
        if (N2()) {
            n0(rect, this.p0);
            RectF rectF = this.p0;
            float f2 = rectF.left;
            float f3 = rectF.top;
            canvas.translate(f2, f3);
            this.S.setBounds(0, 0, (int) this.p0.width(), (int) this.p0.height());
            if (e.c.b.c.a0.b.a) {
                this.T.setBounds(this.S.getBounds());
                this.T.jumpToCurrentState();
                this.T.draw(canvas);
            } else {
                this.S.draw(canvas);
            }
            canvas.translate(-f2, -f3);
        }
    }

    private void B0(Canvas canvas, Rect rect) {
        this.m0.setColor(this.x0);
        this.m0.setStyle(Paint.Style.FILL);
        this.p0.set(rect);
        if (!this.N0) {
            canvas.drawRoundRect(this.p0, H0(), H0(), this.m0);
        } else {
            h(new RectF(rect), this.r0);
            super.p(canvas, this.m0, this.r0, u());
        }
    }

    private void C0(Canvas canvas, Rect rect) {
        Paint paint = this.n0;
        if (paint != null) {
            paint.setColor(c.h.d.a.d(-16777216, 127));
            canvas.drawRect(rect, this.n0);
            if (M2() || L2()) {
                k0(rect, this.p0);
                canvas.drawRect(this.p0, this.n0);
            }
            if (this.L != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.n0);
            }
            if (N2()) {
                n0(rect, this.p0);
                canvas.drawRect(this.p0, this.n0);
            }
            this.n0.setColor(c.h.d.a.d(-65536, 127));
            m0(rect, this.p0);
            canvas.drawRect(this.p0, this.n0);
            this.n0.setColor(c.h.d.a.d(-16711936, 127));
            o0(rect, this.p0);
            canvas.drawRect(this.p0, this.n0);
        }
    }

    private void D0(Canvas canvas, Rect rect) {
        if (this.L != null) {
            Paint.Align alignS0 = s0(rect, this.q0);
            q0(rect, this.p0);
            if (this.s0.d() != null) {
                this.s0.e().drawableState = getState();
                this.s0.j(this.l0);
            }
            this.s0.e().setTextAlign(alignS0);
            int iSave = 0;
            boolean z = Math.round(this.s0.f(g1().toString())) > Math.round(this.p0.width());
            if (z) {
                iSave = canvas.save();
                canvas.clipRect(this.p0);
            }
            CharSequence charSequenceEllipsize = this.L;
            if (z && this.K0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.s0.e(), this.p0.width(), this.K0);
            }
            CharSequence charSequence = charSequenceEllipsize;
            int length = charSequence.length();
            PointF pointF = this.q0;
            canvas.drawText(charSequence, 0, length, pointF.x, pointF.y, this.s0.e());
            if (z) {
                canvas.restoreToCount(iSave);
            }
        }
    }

    private boolean L2() {
        return this.Y && this.Z != null && this.z0;
    }

    private boolean M2() {
        return this.M && this.N != null;
    }

    private boolean N2() {
        return this.R && this.S != null;
    }

    private void O2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    private void P2() {
        this.I0 = this.H0 ? e.c.b.c.a0.b.d(this.K) : null;
    }

    @TargetApi(21)
    private void Q2() {
        this.T = new RippleDrawable(e.c.b.c.a0.b.d(e1()), this.S, D);
    }

    private float Y0() {
        Drawable drawable = this.z0 ? this.Z : this.N;
        float fCeil = this.P;
        if (fCeil <= 0.0f && drawable != null) {
            fCeil = (float) Math.ceil(k.b(this.l0, 24));
            if (drawable.getIntrinsicHeight() <= fCeil) {
                return drawable.getIntrinsicHeight();
            }
        }
        return fCeil;
    }

    private float Z0() {
        Drawable drawable = this.z0 ? this.Z : this.N;
        float f2 = this.P;
        return (f2 > 0.0f || drawable == null) ? f2 : drawable.getIntrinsicWidth();
    }

    private void a2(ColorStateList colorStateList) {
        if (this.E != colorStateList) {
            this.E = colorStateList;
            onStateChange(getState());
        }
    }

    private void j0(Drawable drawable) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        androidx.core.graphics.drawable.a.m(drawable, androidx.core.graphics.drawable.a.f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.S) {
            if (drawable.isStateful()) {
                drawable.setState(V0());
            }
            androidx.core.graphics.drawable.a.o(drawable, this.U);
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
        Drawable drawable2 = this.N;
        if (drawable == drawable2 && this.Q) {
            androidx.core.graphics.drawable.a.o(drawable2, this.O);
        }
    }

    private void k0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (M2() || L2()) {
            float f2 = this.d0 + this.e0;
            float fZ0 = Z0();
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f3 = rect.left + f2;
                rectF.left = f3;
                rectF.right = f3 + fZ0;
            } else {
                float f4 = rect.right - f2;
                rectF.right = f4;
                rectF.left = f4 - fZ0;
            }
            float fY0 = Y0();
            float fExactCenterY = rect.exactCenterY() - (fY0 / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fY0;
        }
    }

    private ColorFilter k1() {
        ColorFilter colorFilter = this.C0;
        return colorFilter != null ? colorFilter : this.D0;
    }

    private void m0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (N2()) {
            float f2 = this.k0 + this.j0 + this.V + this.i0 + this.h0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                rectF.right = rect.right - f2;
            } else {
                rectF.left = rect.left + f2;
            }
        }
    }

    private static boolean m1(int[] iArr, int i2) {
        if (iArr == null) {
            return false;
        }
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    private void n0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (N2()) {
            float f2 = this.k0 + this.j0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f3 = rect.right - f2;
                rectF.right = f3;
                rectF.left = f3 - this.V;
            } else {
                float f4 = rect.left + f2;
                rectF.left = f4;
                rectF.right = f4 + this.V;
            }
            float fExactCenterY = rect.exactCenterY();
            float f5 = this.V;
            float f6 = fExactCenterY - (f5 / 2.0f);
            rectF.top = f6;
            rectF.bottom = f6 + f5;
        }
    }

    private void o0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (N2()) {
            float f2 = this.k0 + this.j0 + this.V + this.i0 + this.h0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f3 = rect.right;
                rectF.right = f3;
                rectF.left = f3 - f2;
            } else {
                int i2 = rect.left;
                rectF.left = i2;
                rectF.right = i2 + f2;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private void q0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.L != null) {
            float fL0 = this.d0 + l0() + this.g0;
            float fP0 = this.k0 + p0() + this.h0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                rectF.left = rect.left + fL0;
                rectF.right = rect.right - fP0;
            } else {
                rectF.left = rect.left + fP0;
                rectF.right = rect.right - fL0;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private static boolean q1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private float r0() {
        this.s0.e().getFontMetrics(this.o0);
        Paint.FontMetrics fontMetrics = this.o0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private static boolean r1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    private static boolean s1(d dVar) {
        ColorStateList colorStateList;
        return (dVar == null || (colorStateList = dVar.a) == null || !colorStateList.isStateful()) ? false : true;
    }

    private boolean t0() {
        return this.Y && this.Z != null && this.X;
    }

    private void t1(AttributeSet attributeSet, int i2, int i3) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        TypedArray typedArrayH = j.h(this.l0, attributeSet, l.U, i2, i3, new int[0]);
        this.N0 = typedArrayH.hasValue(l.G0);
        a2(c.a(this.l0, typedArrayH, l.t0));
        E1(c.a(this.l0, typedArrayH, l.g0));
        S1(typedArrayH.getDimension(l.o0, 0.0f));
        int i4 = l.h0;
        if (typedArrayH.hasValue(i4)) {
            G1(typedArrayH.getDimension(i4, 0.0f));
        }
        W1(c.a(this.l0, typedArrayH, l.r0));
        Y1(typedArrayH.getDimension(l.s0, 0.0f));
        x2(c.a(this.l0, typedArrayH, l.F0));
        C2(typedArrayH.getText(l.a0));
        d dVarF = c.f(this.l0, typedArrayH, l.V);
        dVarF.n = typedArrayH.getDimension(l.W, dVarF.n);
        D2(dVarF);
        int i5 = typedArrayH.getInt(l.Y, 0);
        if (i5 == 1) {
            p2(TextUtils.TruncateAt.START);
        } else if (i5 == 2) {
            p2(TextUtils.TruncateAt.MIDDLE);
        } else if (i5 == 3) {
            p2(TextUtils.TruncateAt.END);
        }
        R1(typedArrayH.getBoolean(l.n0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            R1(typedArrayH.getBoolean(l.k0, false));
        }
        K1(c.d(this.l0, typedArrayH, l.j0));
        int i6 = l.m0;
        if (typedArrayH.hasValue(i6)) {
            O1(c.a(this.l0, typedArrayH, i6));
        }
        M1(typedArrayH.getDimension(l.l0, -1.0f));
        n2(typedArrayH.getBoolean(l.A0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            n2(typedArrayH.getBoolean(l.v0, false));
        }
        b2(c.d(this.l0, typedArrayH, l.u0));
        l2(c.a(this.l0, typedArrayH, l.z0));
        g2(typedArrayH.getDimension(l.x0, 0.0f));
        w1(typedArrayH.getBoolean(l.b0, false));
        D1(typedArrayH.getBoolean(l.f0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            D1(typedArrayH.getBoolean(l.d0, false));
        }
        y1(c.d(this.l0, typedArrayH, l.c0));
        int i7 = l.e0;
        if (typedArrayH.hasValue(i7)) {
            A1(c.a(this.l0, typedArrayH, i7));
        }
        A2(e.c.b.c.m.h.b(this.l0, typedArrayH, l.H0));
        q2(e.c.b.c.m.h.b(this.l0, typedArrayH, l.C0));
        U1(typedArrayH.getDimension(l.q0, 0.0f));
        u2(typedArrayH.getDimension(l.E0, 0.0f));
        s2(typedArrayH.getDimension(l.D0, 0.0f));
        H2(typedArrayH.getDimension(l.J0, 0.0f));
        F2(typedArrayH.getDimension(l.I0, 0.0f));
        i2(typedArrayH.getDimension(l.y0, 0.0f));
        d2(typedArrayH.getDimension(l.w0, 0.0f));
        I1(typedArrayH.getDimension(l.i0, 0.0f));
        w2(typedArrayH.getDimensionPixelSize(l.Z, Integer.MAX_VALUE));
        typedArrayH.recycle();
    }

    public static a u0(Context context, AttributeSet attributeSet, int i2, int i3) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        a aVar = new a(context, attributeSet, i2, i3);
        aVar.t1(attributeSet, i2, i3);
        return aVar;
    }

    private void v0(Canvas canvas, Rect rect) {
        if (L2()) {
            k0(rect, this.p0);
            RectF rectF = this.p0;
            float f2 = rectF.left;
            float f3 = rectF.top;
            canvas.translate(f2, f3);
            this.Z.setBounds(0, 0, (int) this.p0.width(), (int) this.p0.height());
            this.Z.draw(canvas);
            canvas.translate(-f2, -f3);
        }
    }

    private boolean v1(int[] iArr, int[] iArr2) {
        boolean z;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.E;
        int iL = l(colorStateList != null ? colorStateList.getColorForState(iArr, this.t0) : 0);
        boolean state = true;
        if (this.t0 != iL) {
            this.t0 = iL;
            zOnStateChange = true;
        }
        ColorStateList colorStateList2 = this.F;
        int iL2 = l(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.u0) : 0);
        if (this.u0 != iL2) {
            this.u0 = iL2;
            zOnStateChange = true;
        }
        int iE = e.c.b.c.s.a.e(iL, iL2);
        if ((this.v0 != iE) | (x() == null)) {
            this.v0 = iE;
            X(ColorStateList.valueOf(iE));
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.I;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.w0) : 0;
        if (this.w0 != colorForState) {
            this.w0 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.I0 == null || !e.c.b.c.a0.b.e(iArr)) ? 0 : this.I0.getColorForState(iArr, this.x0);
        if (this.x0 != colorForState2) {
            this.x0 = colorForState2;
            if (this.H0) {
                zOnStateChange = true;
            }
        }
        int colorForState3 = (this.s0.d() == null || this.s0.d().a == null) ? 0 : this.s0.d().a.getColorForState(iArr, this.y0);
        if (this.y0 != colorForState3) {
            this.y0 = colorForState3;
            zOnStateChange = true;
        }
        boolean z2 = m1(getState(), R.attr.state_checked) && this.X;
        if (this.z0 == z2 || this.Z == null) {
            z = false;
        } else {
            float fL0 = l0();
            this.z0 = z2;
            if (fL0 != l0()) {
                zOnStateChange = true;
                z = true;
            } else {
                zOnStateChange = true;
                z = false;
            }
        }
        ColorStateList colorStateList4 = this.E0;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.A0) : 0;
        if (this.A0 != colorForState4) {
            this.A0 = colorForState4;
            this.D0 = e.c.b.c.u.a.a(this, this.E0, this.F0);
        } else {
            state = zOnStateChange;
        }
        if (r1(this.N)) {
            state |= this.N.setState(iArr);
        }
        if (r1(this.Z)) {
            state |= this.Z.setState(iArr);
        }
        if (r1(this.S)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.S.setState(iArr3);
        }
        if (e.c.b.c.a0.b.a && r1(this.T)) {
            state |= this.T.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z) {
            u1();
        }
        return state;
    }

    private void w0(Canvas canvas, Rect rect) {
        if (this.N0) {
            return;
        }
        this.m0.setColor(this.u0);
        this.m0.setStyle(Paint.Style.FILL);
        this.m0.setColorFilter(k1());
        this.p0.set(rect);
        canvas.drawRoundRect(this.p0, H0(), H0(), this.m0);
    }

    private void x0(Canvas canvas, Rect rect) {
        if (M2()) {
            k0(rect, this.p0);
            RectF rectF = this.p0;
            float f2 = rectF.left;
            float f3 = rectF.top;
            canvas.translate(f2, f3);
            this.N.setBounds(0, 0, (int) this.p0.width(), (int) this.p0.height());
            this.N.draw(canvas);
            canvas.translate(-f2, -f3);
        }
    }

    private void y0(Canvas canvas, Rect rect) {
        if (this.J <= 0.0f || this.N0) {
            return;
        }
        this.m0.setColor(this.w0);
        this.m0.setStyle(Paint.Style.STROKE);
        if (!this.N0) {
            this.m0.setColorFilter(k1());
        }
        RectF rectF = this.p0;
        float f2 = rect.left;
        float f3 = this.J;
        rectF.set(f2 + (f3 / 2.0f), rect.top + (f3 / 2.0f), rect.right - (f3 / 2.0f), rect.bottom - (f3 / 2.0f));
        float f4 = this.H - (this.J / 2.0f);
        canvas.drawRoundRect(this.p0, f4, f4, this.m0);
    }

    private void z0(Canvas canvas, Rect rect) {
        if (this.N0) {
            return;
        }
        this.m0.setColor(this.t0);
        this.m0.setStyle(Paint.Style.FILL);
        this.p0.set(rect);
        canvas.drawRoundRect(this.p0, H0(), H0(), this.m0);
    }

    public void A1(ColorStateList colorStateList) {
        if (this.a0 != colorStateList) {
            this.a0 = colorStateList;
            if (t0()) {
                androidx.core.graphics.drawable.a.o(this.Z, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void A2(e.c.b.c.m.h hVar) {
        this.b0 = hVar;
    }

    public void B1(int i2) {
        A1(c.a.k.a.a.c(this.l0, i2));
    }

    public void B2(int i2) {
        A2(e.c.b.c.m.h.c(this.l0, i2));
    }

    public void C1(int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        D1(this.l0.getResources().getBoolean(i2));
    }

    public void C2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.L, charSequence)) {
            return;
        }
        this.L = charSequence;
        this.s0.i(true);
        invalidateSelf();
        u1();
    }

    public void D1(boolean z) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.Y != z) {
            boolean zL2 = L2();
            this.Y = z;
            boolean zL22 = L2();
            if (zL2 != zL22) {
                if (zL22) {
                    j0(this.Z);
                } else {
                    O2(this.Z);
                }
                invalidateSelf();
                u1();
            }
        }
    }

    public void D2(d dVar) {
        this.s0.h(dVar, this.l0);
    }

    public Drawable E0() {
        return this.Z;
    }

    public void E1(ColorStateList colorStateList) {
        if (this.F != colorStateList) {
            this.F = colorStateList;
            onStateChange(getState());
        }
    }

    public void E2(int i2) {
        D2(new d(this.l0, i2));
    }

    public ColorStateList F0() {
        return this.a0;
    }

    public void F1(int i2) {
        E1(c.a.k.a.a.c(this.l0, i2));
    }

    public void F2(float f2) {
        if (this.h0 != f2) {
            this.h0 = f2;
            invalidateSelf();
            u1();
        }
    }

    public ColorStateList G0() {
        return this.F;
    }

    @Deprecated
    public void G1(float f2) {
        if (this.H != f2) {
            this.H = f2;
            setShapeAppearanceModel(C().w(f2));
        }
    }

    public void G2(int i2) {
        F2(this.l0.getResources().getDimension(i2));
    }

    public float H0() {
        return this.N0 ? F() : this.H;
    }

    @Deprecated
    public void H1(int i2) {
        G1(this.l0.getResources().getDimension(i2));
    }

    public void H2(float f2) {
        if (this.g0 != f2) {
            this.g0 = f2;
            invalidateSelf();
            u1();
        }
    }

    public float I0() {
        return this.k0;
    }

    public void I1(float f2) {
        if (this.k0 != f2) {
            this.k0 = f2;
            invalidateSelf();
            u1();
        }
    }

    public void I2(int i2) {
        H2(this.l0.getResources().getDimension(i2));
    }

    public Drawable J0() {
        Drawable drawable = this.N;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.q(drawable);
        }
        return null;
    }

    public void J1(int i2) {
        I1(this.l0.getResources().getDimension(i2));
    }

    public void J2(boolean z) {
        if (this.H0 != z) {
            this.H0 = z;
            P2();
            onStateChange(getState());
        }
    }

    public float K0() {
        return this.P;
    }

    public void K1(Drawable drawable) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Drawable drawableJ0 = J0();
        if (drawableJ0 != drawable) {
            float fL0 = l0();
            this.N = drawable != null ? androidx.core.graphics.drawable.a.r(drawable).mutate() : null;
            float fL02 = l0();
            O2(drawableJ0);
            if (M2()) {
                j0(this.N);
            }
            invalidateSelf();
            if (fL0 != fL02) {
                u1();
            }
        }
    }

    boolean K2() {
        return this.L0;
    }

    public ColorStateList L0() {
        return this.O;
    }

    public void L1(int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        K1(c.a.k.a.a.d(this.l0, i2));
    }

    public float M0() {
        return this.G;
    }

    public void M1(float f2) {
        if (this.P != f2) {
            float fL0 = l0();
            this.P = f2;
            float fL02 = l0();
            invalidateSelf();
            if (fL0 != fL02) {
                u1();
            }
        }
    }

    public float N0() {
        return this.d0;
    }

    public void N1(int i2) {
        M1(this.l0.getResources().getDimension(i2));
    }

    public ColorStateList O0() {
        return this.I;
    }

    public void O1(ColorStateList colorStateList) {
        this.Q = true;
        if (this.O != colorStateList) {
            this.O = colorStateList;
            if (M2()) {
                androidx.core.graphics.drawable.a.o(this.N, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public float P0() {
        return this.J;
    }

    public void P1(int i2) {
        O1(c.a.k.a.a.c(this.l0, i2));
    }

    public Drawable Q0() {
        Drawable drawable = this.S;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.q(drawable);
        }
        return null;
    }

    public void Q1(int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        R1(this.l0.getResources().getBoolean(i2));
    }

    public CharSequence R0() {
        return this.W;
    }

    public void R1(boolean z) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.M != z) {
            boolean zM2 = M2();
            this.M = z;
            boolean zM22 = M2();
            if (zM2 != zM22) {
                if (zM22) {
                    j0(this.N);
                } else {
                    O2(this.N);
                }
                invalidateSelf();
                u1();
            }
        }
    }

    public float S0() {
        return this.j0;
    }

    public void S1(float f2) {
        if (this.G != f2) {
            this.G = f2;
            invalidateSelf();
            u1();
        }
    }

    public float T0() {
        return this.V;
    }

    public void T1(int i2) {
        S1(this.l0.getResources().getDimension(i2));
    }

    public float U0() {
        return this.i0;
    }

    public void U1(float f2) {
        if (this.d0 != f2) {
            this.d0 = f2;
            invalidateSelf();
            u1();
        }
    }

    public int[] V0() {
        return this.G0;
    }

    public void V1(int i2) {
        U1(this.l0.getResources().getDimension(i2));
    }

    public ColorStateList W0() {
        return this.U;
    }

    public void W1(ColorStateList colorStateList) {
        if (this.I != colorStateList) {
            this.I = colorStateList;
            if (this.N0) {
                e0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void X0(RectF rectF) {
        o0(getBounds(), rectF);
    }

    public void X1(int i2) {
        W1(c.a.k.a.a.c(this.l0, i2));
    }

    public void Y1(float f2) {
        if (this.J != f2) {
            this.J = f2;
            this.m0.setStrokeWidth(f2);
            if (this.N0) {
                super.f0(f2);
            }
            invalidateSelf();
        }
    }

    public void Z1(int i2) {
        Y1(this.l0.getResources().getDimension(i2));
    }

    @Override // com.google.android.material.internal.h.b
    public void a() {
        u1();
        invalidateSelf();
    }

    public TextUtils.TruncateAt a1() {
        return this.K0;
    }

    public e.c.b.c.m.h b1() {
        return this.c0;
    }

    public void b2(Drawable drawable) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Drawable drawableQ0 = Q0();
        if (drawableQ0 != drawable) {
            float fP0 = p0();
            this.S = drawable != null ? androidx.core.graphics.drawable.a.r(drawable).mutate() : null;
            if (e.c.b.c.a0.b.a) {
                Q2();
            }
            float fP02 = p0();
            O2(drawableQ0);
            if (N2()) {
                j0(this.S);
            }
            invalidateSelf();
            if (fP0 != fP02) {
                u1();
            }
        }
    }

    public float c1() {
        return this.f0;
    }

    public void c2(CharSequence charSequence) {
        if (this.W != charSequence) {
            this.W = c.h.j.a.c().h(charSequence);
            invalidateSelf();
        }
    }

    public float d1() {
        return this.e0;
    }

    public void d2(float f2) {
        if (this.j0 != f2) {
            this.j0 = f2;
            invalidateSelf();
            if (N2()) {
                u1();
            }
        }
    }

    @Override // e.c.b.c.c0.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i2 = this.B0;
        int iA = i2 < 255 ? e.c.b.c.o.a.a(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i2) : 0;
        z0(canvas, bounds);
        w0(canvas, bounds);
        if (this.N0) {
            super.draw(canvas);
        }
        y0(canvas, bounds);
        B0(canvas, bounds);
        x0(canvas, bounds);
        v0(canvas, bounds);
        if (this.L0) {
            D0(canvas, bounds);
        }
        A0(canvas, bounds);
        C0(canvas, bounds);
        if (this.B0 < 255) {
            canvas.restoreToCount(iA);
        }
    }

    public ColorStateList e1() {
        return this.K;
    }

    public void e2(int i2) {
        d2(this.l0.getResources().getDimension(i2));
    }

    public e.c.b.c.m.h f1() {
        return this.b0;
    }

    public void f2(int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        b2(c.a.k.a.a.d(this.l0, i2));
    }

    public CharSequence g1() {
        return this.L;
    }

    public void g2(float f2) {
        if (this.V != f2) {
            this.V = f2;
            invalidateSelf();
            if (N2()) {
                u1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.B0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.C0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.G;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.d0 + l0() + this.g0 + this.s0.f(g1().toString()) + this.h0 + p0() + this.k0), this.M0);
    }

    @Override // e.c.b.c.c0.g, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // e.c.b.c.c0.g, android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.N0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.H);
        } else {
            outline.setRoundRect(bounds, this.H);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    public d h1() {
        return this.s0.d();
    }

    public void h2(int i2) {
        g2(this.l0.getResources().getDimension(i2));
    }

    public float i1() {
        return this.h0;
    }

    public void i2(float f2) {
        if (this.i0 != f2) {
            this.i0 = f2;
            invalidateSelf();
            if (N2()) {
                u1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // e.c.b.c.c0.g, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return q1(this.E) || q1(this.F) || q1(this.I) || (this.H0 && q1(this.I0)) || s1(this.s0.d()) || t0() || r1(this.N) || r1(this.Z) || q1(this.E0);
    }

    public float j1() {
        return this.g0;
    }

    public void j2(int i2) {
        i2(this.l0.getResources().getDimension(i2));
    }

    public boolean k2(int[] iArr) {
        if (Arrays.equals(this.G0, iArr)) {
            return false;
        }
        this.G0 = iArr;
        if (N2()) {
            return v1(getState(), iArr);
        }
        return false;
    }

    float l0() {
        if (M2() || L2()) {
            return this.e0 + Z0() + this.f0;
        }
        return 0.0f;
    }

    public boolean l1() {
        return this.H0;
    }

    public void l2(ColorStateList colorStateList) {
        if (this.U != colorStateList) {
            this.U = colorStateList;
            if (N2()) {
                androidx.core.graphics.drawable.a.o(this.S, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void m2(int i2) {
        l2(c.a.k.a.a.c(this.l0, i2));
    }

    public boolean n1() {
        return this.X;
    }

    public void n2(boolean z) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.R != z) {
            boolean zN2 = N2();
            this.R = z;
            boolean zN22 = N2();
            if (zN2 != zN22) {
                if (zN22) {
                    j0(this.S);
                } else {
                    O2(this.S);
                }
                invalidateSelf();
                u1();
            }
        }
    }

    public boolean o1() {
        return r1(this.S);
    }

    public void o2(InterfaceC0117a interfaceC0117a) {
        this.J0 = new WeakReference<>(interfaceC0117a);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i2) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i2);
        if (M2()) {
            zOnLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.N, i2);
        }
        if (L2()) {
            zOnLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.Z, i2);
        }
        if (N2()) {
            zOnLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.S, i2);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i2) {
        boolean zOnLevelChange = super.onLevelChange(i2);
        if (M2()) {
            zOnLevelChange |= this.N.setLevel(i2);
        }
        if (L2()) {
            zOnLevelChange |= this.Z.setLevel(i2);
        }
        if (N2()) {
            zOnLevelChange |= this.S.setLevel(i2);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // e.c.b.c.c0.g, android.graphics.drawable.Drawable, com.google.android.material.internal.h.b
    public boolean onStateChange(int[] iArr) {
        if (this.N0) {
            super.onStateChange(iArr);
        }
        return v1(iArr, V0());
    }

    float p0() {
        if (N2()) {
            return this.i0 + this.V + this.j0;
        }
        return 0.0f;
    }

    public boolean p1() {
        return this.R;
    }

    public void p2(TextUtils.TruncateAt truncateAt) {
        this.K0 = truncateAt;
    }

    public void q2(e.c.b.c.m.h hVar) {
        this.c0 = hVar;
    }

    public void r2(int i2) {
        q2(e.c.b.c.m.h.c(this.l0, i2));
    }

    Paint.Align s0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.L != null) {
            float fL0 = this.d0 + l0() + this.g0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                pointF.x = rect.left + fL0;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = rect.right - fL0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - r0();
        }
        return align;
    }

    public void s2(float f2) {
        if (this.f0 != f2) {
            float fL0 = l0();
            this.f0 = f2;
            float fL02 = l0();
            invalidateSelf();
            if (fL0 != fL02) {
                u1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    @Override // e.c.b.c.c0.g, android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        if (this.B0 != i2) {
            this.B0 = i2;
            invalidateSelf();
        }
    }

    @Override // e.c.b.c.c0.g, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.C0 != colorFilter) {
            this.C0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // e.c.b.c.c0.g, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        if (this.E0 != colorStateList) {
            this.E0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // e.c.b.c.c0.g, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.F0 != mode) {
            this.F0 = mode;
            this.D0 = e.c.b.c.u.a.a(this, this.E0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (M2()) {
            visible |= this.N.setVisible(z, z2);
        }
        if (L2()) {
            visible |= this.Z.setVisible(z, z2);
        }
        if (N2()) {
            visible |= this.S.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public void t2(int i2) {
        s2(this.l0.getResources().getDimension(i2));
    }

    protected void u1() {
        InterfaceC0117a interfaceC0117a = this.J0.get();
        if (interfaceC0117a != null) {
            interfaceC0117a.a();
        }
    }

    public void u2(float f2) {
        if (this.e0 != f2) {
            float fL0 = l0();
            this.e0 = f2;
            float fL02 = l0();
            invalidateSelf();
            if (fL0 != fL02) {
                u1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public void v2(int i2) {
        u2(this.l0.getResources().getDimension(i2));
    }

    public void w1(boolean z) {
        if (this.X != z) {
            this.X = z;
            float fL0 = l0();
            if (!z && this.z0) {
                this.z0 = false;
            }
            float fL02 = l0();
            invalidateSelf();
            if (fL0 != fL02) {
                u1();
            }
        }
    }

    public void w2(int i2) {
        this.M0 = i2;
    }

    public void x1(int i2) {
        w1(this.l0.getResources().getBoolean(i2));
    }

    public void x2(ColorStateList colorStateList) {
        if (this.K != colorStateList) {
            this.K = colorStateList;
            P2();
            onStateChange(getState());
        }
    }

    public void y1(Drawable drawable) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.Z != drawable) {
            float fL0 = l0();
            this.Z = drawable;
            float fL02 = l0();
            O2(this.Z);
            j0(this.Z);
            invalidateSelf();
            if (fL0 != fL02) {
                u1();
            }
        }
    }

    public void y2(int i2) {
        x2(c.a.k.a.a.c(this.l0, i2));
    }

    public void z1(int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        y1(c.a.k.a.a.d(this.l0, i2));
    }

    void z2(boolean z) {
        this.L0 = z;
    }
}