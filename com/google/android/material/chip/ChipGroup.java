package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import c.h.l.c0.c;
import c.h.l.t;
import com.google.android.material.internal.j;
import e.c.b.c.k;
import e.c.b.c.l;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ChipGroup extends com.google.android.material.internal.c {

    /* renamed from: i, reason: collision with root package name */
    private static final int f11538i = k.o;

    /* renamed from: j, reason: collision with root package name */
    private int f11539j;

    /* renamed from: k, reason: collision with root package name */
    private int f11540k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f11541l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f11542m;
    private d n;
    private final b o;
    private e p;
    private int q;
    private boolean r;

    private class b implements CompoundButton.OnCheckedChangeListener {
        private b() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (ChipGroup.this.r) {
                return;
            }
            if (ChipGroup.this.getCheckedChipIds().isEmpty() && ChipGroup.this.f11542m) {
                ChipGroup.this.r(compoundButton.getId(), true);
                ChipGroup.this.q(compoundButton.getId(), false);
                return;
            }
            int id = compoundButton.getId();
            if (!z) {
                if (ChipGroup.this.q == id) {
                    ChipGroup.this.setCheckedId(-1);
                }
            } else {
                if (ChipGroup.this.q != -1 && ChipGroup.this.q != id && ChipGroup.this.f11541l) {
                    ChipGroup chipGroup = ChipGroup.this;
                    chipGroup.r(chipGroup.q, false);
                }
                ChipGroup.this.setCheckedId(id);
            }
        }
    }

    public static class c extends ViewGroup.MarginLayoutParams {
        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(int i2, int i3) {
            super(i2, i3);
        }
    }

    public interface d {
        void a(ChipGroup chipGroup, int i2);
    }

    private class e implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: e, reason: collision with root package name */
        private ViewGroup.OnHierarchyChangeListener f11543e;

        private e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(t.k());
                }
                Chip chip = (Chip) view2;
                if (chip.isChecked()) {
                    ((ChipGroup) view).m(chip.getId());
                }
                chip.setOnCheckedChangeListenerInternal(ChipGroup.this.o);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f11543e;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal(null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f11543e;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.c.b.c.b.f15074e);
    }

    private int getChipCount() {
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) instanceof Chip) {
                i2++;
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(int i2, boolean z) {
        this.q = i2;
        d dVar = this.n;
        if (dVar != null && this.f11541l && z) {
            dVar.a(this, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(int i2, boolean z) {
        View viewFindViewById = findViewById(i2);
        if (viewFindViewById instanceof Chip) {
            this.r = true;
            ((Chip) viewFindViewById).setChecked(z);
            this.r = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckedId(int i2) {
        q(i2, true);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i3 = this.q;
                if (i3 != -1 && this.f11541l) {
                    r(i3, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i2, layoutParams);
    }

    @Override // com.google.android.material.internal.c
    public boolean c() {
        return super.c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof c);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        if (this.f11541l) {
            return this.q;
        }
        return -1;
    }

    public List<Integer> getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.f11541l) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    public int getChipSpacingHorizontal() {
        return this.f11539j;
    }

    public int getChipSpacingVertical() {
        return this.f11540k;
    }

    public void m(int i2) {
        int i3 = this.q;
        if (i2 == i3) {
            return;
        }
        if (i3 != -1 && this.f11541l) {
            r(i3, false);
        }
        if (i2 != -1) {
            r(i2, true);
        }
        setCheckedId(i2);
    }

    public void n() {
        this.r = true;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof Chip) {
                ((Chip) childAt).setChecked(false);
            }
        }
        this.r = false;
        setCheckedId(-1);
    }

    int o(View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) instanceof Chip) {
                if (((Chip) getChildAt(i3)) == view) {
                    return i2;
                }
                i2++;
            }
        }
        return -1;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i2 = this.q;
        if (i2 != -1) {
            r(i2, true);
            setCheckedId(this.q);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        c.h.l.c0.c.y0(accessibilityNodeInfo).a0(c.b.a(getRowCount(), c() ? getChipCount() : -1, false, p() ? 1 : 2));
    }

    public boolean p() {
        return this.f11541l;
    }

    public void setChipSpacing(int i2) {
        setChipSpacingHorizontal(i2);
        setChipSpacingVertical(i2);
    }

    public void setChipSpacingHorizontal(int i2) {
        if (this.f11539j != i2) {
            this.f11539j = i2;
            setItemSpacing(i2);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i2) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i2));
    }

    public void setChipSpacingResource(int i2) {
        setChipSpacing(getResources().getDimensionPixelOffset(i2));
    }

    public void setChipSpacingVertical(int i2) {
        if (this.f11540k != i2) {
            this.f11540k = i2;
            setLineSpacing(i2);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i2) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i2));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i2) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(d dVar) {
        this.n = dVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.p.f11543e = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.f11542m = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i2) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i2) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // com.google.android.material.internal.c
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(boolean z) {
        if (this.f11541l != z) {
            this.f11541l = z;
            n();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ChipGroup(Context context, AttributeSet attributeSet, int i2) {
        int i3 = f11538i;
        super(com.google.android.material.theme.a.a.c(context, attributeSet, i2, i3), attributeSet, i2);
        this.o = new b();
        this.p = new e();
        this.q = -1;
        this.r = false;
        TypedArray typedArrayH = j.h(getContext(), attributeSet, l.K0, i2, i3, new int[0]);
        int dimensionPixelOffset = typedArrayH.getDimensionPixelOffset(l.M0, 0);
        setChipSpacingHorizontal(typedArrayH.getDimensionPixelOffset(l.N0, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayH.getDimensionPixelOffset(l.O0, dimensionPixelOffset));
        setSingleLine(typedArrayH.getBoolean(l.Q0, false));
        setSingleSelection(typedArrayH.getBoolean(l.R0, false));
        setSelectionRequired(typedArrayH.getBoolean(l.P0, false));
        int resourceId = typedArrayH.getResourceId(l.L0, -1);
        if (resourceId != -1) {
            this.q = resourceId;
        }
        typedArrayH.recycle();
        super.setOnHierarchyChangeListener(this.p);
        t.u0(this, 1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    public void setSingleLine(int i2) {
        setSingleLine(getResources().getBoolean(i2));
    }

    public void setSingleSelection(int i2) {
        setSingleSelection(getResources().getBoolean(i2));
    }
}