package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.i0;
import androidx.appcompat.widget.y0;
import c.h.l.t;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends d implements n.a {
    private static final int[] z = {R.attr.state_checked};
    private int A;
    private boolean B;
    boolean C;
    private final CheckedTextView D;
    private FrameLayout E;
    private androidx.appcompat.view.menu.i F;
    private ColorStateList G;
    private boolean H;
    private Drawable I;
    private final c.h.l.a J;

    class a extends c.h.l.a {
        a() {
        }

        @Override // c.h.l.a
        public void g(View view, c.h.l.c0.c cVar) {
            super.g(view, cVar);
            cVar.W(NavigationMenuItemView.this.C);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void B() {
        if (D()) {
            this.D.setVisibility(8);
            FrameLayout frameLayout = this.E;
            if (frameLayout != null) {
                i0.a aVar = (i0.a) frameLayout.getLayoutParams();
                ((ViewGroup.MarginLayoutParams) aVar).width = -1;
                this.E.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.D.setVisibility(0);
        FrameLayout frameLayout2 = this.E;
        if (frameLayout2 != null) {
            i0.a aVar2 = (i0.a) frameLayout2.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) aVar2).width = -2;
            this.E.setLayoutParams(aVar2);
        }
    }

    private StateListDrawable C() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(c.a.a.v, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(z, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    private boolean D() {
        return this.F.getTitle() == null && this.F.getIcon() == null && this.F.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.E == null) {
                this.E = (FrameLayout) ((ViewStub) findViewById(e.c.b.c.f.f15205d)).inflate();
            }
            this.E.removeAllViews();
            this.E.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void e(androidx.appcompat.view.menu.i iVar, int i2) {
        this.F = iVar;
        if (iVar.getItemId() > 0) {
            setId(iVar.getItemId());
        }
        setVisibility(iVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            t.n0(this, C());
        }
        setCheckable(iVar.isCheckable());
        setChecked(iVar.isChecked());
        setEnabled(iVar.isEnabled());
        setTitle(iVar.getTitle());
        setIcon(iVar.getIcon());
        setActionView(iVar.getActionView());
        setContentDescription(iVar.getContentDescription());
        y0.a(this, iVar.getTooltipText());
        B();
    }

    @Override // androidx.appcompat.view.menu.n.a
    public androidx.appcompat.view.menu.i getItemData() {
        return this.F;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        androidx.appcompat.view.menu.i iVar = this.F;
        if (iVar != null && iVar.isCheckable() && this.F.isChecked()) {
            ViewGroup.mergeDrawableStates(iArrOnCreateDrawableState, z);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z2) {
        refreshDrawableState();
        if (this.C != z2) {
            this.C = z2;
            this.J.l(this.D, 2048);
        }
    }

    public void setChecked(boolean z2) {
        refreshDrawableState();
        this.D.setChecked(z2);
    }

    public void setHorizontalPadding(int i2) {
        setPadding(i2, 0, i2, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.H) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
                androidx.core.graphics.drawable.a.o(drawable, this.G);
            }
            int i2 = this.A;
            drawable.setBounds(0, 0, i2, i2);
        } else if (this.B) {
            if (this.I == null) {
                Drawable drawableA = androidx.core.content.c.f.a(getResources(), e.c.b.c.e.f15202g, getContext().getTheme());
                this.I = drawableA;
                if (drawableA != null) {
                    int i3 = this.A;
                    drawableA.setBounds(0, 0, i3, i3);
                }
            }
            drawable = this.I;
        }
        androidx.core.widget.i.l(this.D, drawable, null, null, null);
    }

    public void setIconPadding(int i2) {
        this.D.setCompoundDrawablePadding(i2);
    }

    public void setIconSize(int i2) {
        this.A = i2;
    }

    void setIconTintList(ColorStateList colorStateList) {
        this.G = colorStateList;
        this.H = colorStateList != null;
        androidx.appcompat.view.menu.i iVar = this.F;
        if (iVar != null) {
            setIcon(iVar.getIcon());
        }
    }

    public void setMaxLines(int i2) {
        this.D.setMaxLines(i2);
    }

    public void setNeedsEmptyIcon(boolean z2) {
        this.B = z2;
    }

    public void setTextAppearance(int i2) {
        androidx.core.widget.i.q(this.D, i2);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.D.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.D.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a aVar = new a();
        this.J = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(e.c.b.c.h.f15219e, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(e.c.b.c.d.f15187e));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(e.c.b.c.f.f15206e);
        this.D = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        t.k0(checkedTextView, aVar);
    }
}