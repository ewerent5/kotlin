package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* compiled from: AppCompatCheckBox.java */
/* loaded from: classes.dex */
public class g extends CheckBox implements androidx.core.widget.j, c.h.l.s {

    /* renamed from: e */
    private final i f456e;

    /* renamed from: f */
    private final e f457f;

    /* renamed from: g */
    private final y f458g;

    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.a.a.r);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f457f;
        if (eVar != null) {
            eVar.b();
        }
        y yVar = this.f458g;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        i iVar = this.f456e;
        return iVar != null ? iVar.b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    @Override // c.h.l.s
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f457f;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // c.h.l.s
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f457f;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.j
    public ColorStateList getSupportButtonTintList() {
        i iVar = this.f456e;
        if (iVar != null) {
            return iVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        i iVar = this.f456e;
        if (iVar != null) {
            return iVar.d();
        }
        return null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f457f;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f457f;
        if (eVar != null) {
            eVar.g(i2);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        i iVar = this.f456e;
        if (iVar != null) {
            iVar.f();
        }
    }

    @Override // c.h.l.s
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f457f;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // c.h.l.s
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f457f;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // androidx.core.widget.j
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        i iVar = this.f456e;
        if (iVar != null) {
            iVar.g(colorStateList);
        }
    }

    @Override // androidx.core.widget.j
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        i iVar = this.f456e;
        if (iVar != null) {
            iVar.h(mode);
        }
    }

    public g(Context context, AttributeSet attributeSet, int i2) {
        super(t0.b(context), attributeSet, i2);
        r0.a(this, getContext());
        i iVar = new i(this);
        this.f456e = iVar;
        iVar.e(attributeSet, i2);
        e eVar = new e(this);
        this.f457f = eVar;
        eVar.e(attributeSet, i2);
        y yVar = new y(this);
        this.f458g = yVar;
        yVar.m(attributeSet, i2);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i2) {
        setButtonDrawable(c.a.k.a.a.d(getContext(), i2));
    }
}