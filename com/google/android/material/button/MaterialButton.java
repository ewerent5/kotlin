package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.f;
import androidx.core.widget.i;
import c.h.l.t;
import com.google.android.material.internal.j;
import e.c.b.c.c0.h;
import e.c.b.c.c0.n;
import e.c.b.c.k;
import e.c.b.c.l;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public class MaterialButton extends f implements Checkable, n {

    /* renamed from: g */
    private static final int[] f11497g = {R.attr.state_checkable};

    /* renamed from: h */
    private static final int[] f11498h = {R.attr.state_checked};

    /* renamed from: i */
    private static final int f11499i = k.f15251m;

    /* renamed from: j */
    private final com.google.android.material.button.a f11500j;

    /* renamed from: k */
    private final LinkedHashSet<a> f11501k;

    /* renamed from: l */
    private b f11502l;

    /* renamed from: m */
    private PorterDuff.Mode f11503m;
    private ColorStateList n;
    private Drawable o;
    private int p;
    private int q;
    private int r;
    private int s;
    private boolean t;
    private boolean u;
    private int v;

    public interface a {
        void a(MaterialButton materialButton, boolean z);
    }

    interface b {
        void a(MaterialButton materialButton, boolean z);
    }

    static class c extends c.j.a.a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: g */
        boolean f11504g;

        static class a implements Parcelable.ClassLoaderCreator<c> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public c[] newArray(int i2) {
                return new c[i2];
            }
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(Parcel parcel) {
            this.f11504g = parcel.readInt() == 1;
        }

        @Override // c.j.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f11504g ? 1 : 0);
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                c.class.getClassLoader();
            }
            b(parcel);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.c.b.c.b.q);
    }

    private boolean c() {
        int i2 = this.v;
        return i2 == 3 || i2 == 4;
    }

    private boolean d() {
        int i2 = this.v;
        return i2 == 1 || i2 == 2;
    }

    private boolean e() {
        int i2 = this.v;
        return i2 == 16 || i2 == 32;
    }

    private boolean f() {
        return t.B(this) == 1;
    }

    private boolean g() {
        com.google.android.material.button.a aVar = this.f11500j;
        return (aVar == null || aVar.o()) ? false : true;
    }

    private String getA11yClassName() {
        return (b() ? CompoundButton.class : Button.class).getName();
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        return Math.min((int) paint.measureText(string), getLayout().getEllipsizedWidth());
    }

    private void i() {
        if (d()) {
            i.l(this, this.o, null, null, null);
        } else if (c()) {
            i.l(this, null, null, this.o, null);
        } else if (e()) {
            i.l(this, null, this.o, null, null);
        }
    }

    private void j(boolean z) {
        Drawable drawable = this.o;
        if (drawable != null) {
            Drawable drawableMutate = androidx.core.graphics.drawable.a.r(drawable).mutate();
            this.o = drawableMutate;
            androidx.core.graphics.drawable.a.o(drawableMutate, this.n);
            PorterDuff.Mode mode = this.f11503m;
            if (mode != null) {
                androidx.core.graphics.drawable.a.p(this.o, mode);
            }
            int intrinsicWidth = this.p;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.o.getIntrinsicWidth();
            }
            int intrinsicHeight = this.p;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.o.getIntrinsicHeight();
            }
            Drawable drawable2 = this.o;
            int i2 = this.q;
            int i3 = this.r;
            drawable2.setBounds(i2, i3, intrinsicWidth + i2, intrinsicHeight + i3);
        }
        if (z) {
            i();
            return;
        }
        Drawable[] drawableArrA = i.a(this);
        boolean z2 = false;
        Drawable drawable3 = drawableArrA[0];
        Drawable drawable4 = drawableArrA[1];
        Drawable drawable5 = drawableArrA[2];
        if ((d() && drawable3 != this.o) || ((c() && drawable5 != this.o) || (e() && drawable4 != this.o))) {
            z2 = true;
        }
        if (z2) {
            i();
        }
    }

    private void k(int i2, int i3) {
        if (this.o == null || getLayout() == null) {
            return;
        }
        if (!d() && !c()) {
            if (e()) {
                this.q = 0;
                if (this.v == 16) {
                    this.r = 0;
                    j(false);
                    return;
                }
                int intrinsicHeight = this.p;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.o.getIntrinsicHeight();
                }
                int textHeight = (((((i3 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.s) - getPaddingBottom()) / 2;
                if (this.r != textHeight) {
                    this.r = textHeight;
                    j(false);
                    return;
                }
                return;
            }
            return;
        }
        this.r = 0;
        int i4 = this.v;
        if (i4 == 1 || i4 == 3) {
            this.q = 0;
            j(false);
            return;
        }
        int intrinsicWidth = this.p;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.o.getIntrinsicWidth();
        }
        int textWidth = (((((i2 - getTextWidth()) - t.F(this)) - intrinsicWidth) - this.s) - t.G(this)) / 2;
        if (f() != (this.v == 4)) {
            textWidth = -textWidth;
        }
        if (this.q != textWidth) {
            this.q = textWidth;
            j(false);
        }
    }

    public void a(a aVar) {
        this.f11501k.add(aVar);
    }

    public boolean b() {
        com.google.android.material.button.a aVar = this.f11500j;
        return aVar != null && aVar.p();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (g()) {
            return this.f11500j.b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.o;
    }

    public int getIconGravity() {
        return this.v;
    }

    public int getIconPadding() {
        return this.s;
    }

    public int getIconSize() {
        return this.p;
    }

    public ColorStateList getIconTint() {
        return this.n;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f11503m;
    }

    public int getInsetBottom() {
        return this.f11500j.c();
    }

    public int getInsetTop() {
        return this.f11500j.d();
    }

    public ColorStateList getRippleColor() {
        if (g()) {
            return this.f11500j.h();
        }
        return null;
    }

    public e.c.b.c.c0.k getShapeAppearanceModel() {
        if (g()) {
            return this.f11500j.i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (g()) {
            return this.f11500j.j();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (g()) {
            return this.f11500j.k();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.f, c.h.l.s
    public ColorStateList getSupportBackgroundTintList() {
        return g() ? this.f11500j.l() : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.f, c.h.l.s
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return g() ? this.f11500j.m() : super.getSupportBackgroundTintMode();
    }

    public void h(a aVar) {
        this.f11501k.remove(aVar);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.t;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (g()) {
            h.f(this, this.f11500j.f());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (b()) {
            Button.mergeDrawableStates(iArrOnCreateDrawableState, f11497g);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(iArrOnCreateDrawableState, f11498h);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.f, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.f, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(b());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.f, android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        com.google.android.material.button.a aVar;
        super.onLayout(z, i2, i3, i4, i5);
        if (Build.VERSION.SDK_INT != 21 || (aVar = this.f11500j) == null) {
            return;
        }
        aVar.H(i5 - i3, i4 - i2);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.a());
        setChecked(cVar.f11504g);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f11504g = this.t;
        return cVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        k(i2, i3);
    }

    @Override // androidx.appcompat.widget.f, android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        k(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        if (g()) {
            this.f11500j.r(i2);
        } else {
            super.setBackgroundColor(i2);
        }
    }

    @Override // androidx.appcompat.widget.f, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!g()) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.f11500j.s();
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.f, android.view.View
    public void setBackgroundResource(int i2) {
        setBackgroundDrawable(i2 != 0 ? c.a.k.a.a.d(getContext(), i2) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (g()) {
            this.f11500j.t(z);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (b() && isEnabled() && this.t != z) {
            this.t = z;
            refreshDrawableState();
            if (this.u) {
                return;
            }
            this.u = true;
            Iterator<a> it = this.f11501k.iterator();
            while (it.hasNext()) {
                it.next().a(this, this.t);
            }
            this.u = false;
        }
    }

    public void setCornerRadius(int i2) {
        if (g()) {
            this.f11500j.u(i2);
        }
    }

    public void setCornerRadiusResource(int i2) {
        if (g()) {
            setCornerRadius(getResources().getDimensionPixelSize(i2));
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        if (g()) {
            this.f11500j.f().W(f2);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.o != drawable) {
            this.o = drawable;
            j(true);
            k(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i2) {
        if (this.v != i2) {
            this.v = i2;
            k(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i2) {
        if (this.s != i2) {
            this.s = i2;
            setCompoundDrawablePadding(i2);
        }
    }

    public void setIconResource(int i2) {
        setIcon(i2 != 0 ? c.a.k.a.a.d(getContext(), i2) : null);
    }

    public void setIconSize(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.p != i2) {
            this.p = i2;
            j(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.n != colorStateList) {
            this.n = colorStateList;
            j(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f11503m != mode) {
            this.f11503m = mode;
            j(false);
        }
    }

    public void setIconTintResource(int i2) {
        setIconTint(c.a.k.a.a.c(getContext(), i2));
    }

    public void setInsetBottom(int i2) {
        this.f11500j.v(i2);
    }

    public void setInsetTop(int i2) {
        this.f11500j.w(i2);
    }

    void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    void setOnPressedChangeListenerInternal(b bVar) {
        this.f11502l = bVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        b bVar = this.f11502l;
        if (bVar != null) {
            bVar.a(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (g()) {
            this.f11500j.x(colorStateList);
        }
    }

    public void setRippleColorResource(int i2) {
        if (g()) {
            setRippleColor(c.a.k.a.a.c(getContext(), i2));
        }
    }

    @Override // e.c.b.c.c0.n
    public void setShapeAppearanceModel(e.c.b.c.c0.k kVar) {
        if (!g()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f11500j.y(kVar);
    }

    void setShouldDrawSurfaceColorStroke(boolean z) {
        if (g()) {
            this.f11500j.z(z);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (g()) {
            this.f11500j.A(colorStateList);
        }
    }

    public void setStrokeColorResource(int i2) {
        if (g()) {
            setStrokeColor(c.a.k.a.a.c(getContext(), i2));
        }
    }

    public void setStrokeWidth(int i2) {
        if (g()) {
            this.f11500j.B(i2);
        }
    }

    public void setStrokeWidthResource(int i2) {
        if (g()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i2));
        }
    }

    @Override // androidx.appcompat.widget.f, c.h.l.s
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (g()) {
            this.f11500j.C(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.f, c.h.l.s
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (g()) {
            this.f11500j.D(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.t);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(Context context, AttributeSet attributeSet, int i2) {
        int i3 = f11499i;
        super(com.google.android.material.theme.a.a.c(context, attributeSet, i2, i3), attributeSet, i2);
        this.f11501k = new LinkedHashSet<>();
        this.t = false;
        this.u = false;
        Context context2 = getContext();
        TypedArray typedArrayH = j.h(context2, attributeSet, l.U1, i2, i3, new int[0]);
        this.s = typedArrayH.getDimensionPixelSize(l.h2, 0);
        this.f11503m = com.google.android.material.internal.k.e(typedArrayH.getInt(l.k2, -1), PorterDuff.Mode.SRC_IN);
        this.n = e.c.b.c.z.c.a(getContext(), typedArrayH, l.j2);
        this.o = e.c.b.c.z.c.d(getContext(), typedArrayH, l.f2);
        this.v = typedArrayH.getInteger(l.g2, 1);
        this.p = typedArrayH.getDimensionPixelSize(l.i2, 0);
        com.google.android.material.button.a aVar = new com.google.android.material.button.a(this, e.c.b.c.c0.k.e(context2, attributeSet, i2, i3).m());
        this.f11500j = aVar;
        aVar.q(typedArrayH);
        typedArrayH.recycle();
        setCompoundDrawablePadding(this.s);
        j(this.o != null);
    }
}