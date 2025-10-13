package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.j0;
import com.google.android.material.internal.j;
import e.c.b.c.k;
import e.c.b.c.l;

/* compiled from: MaterialAutoCompleteTextView.java */
/* loaded from: classes.dex */
public class g extends androidx.appcompat.widget.d {

    /* renamed from: h, reason: collision with root package name */
    private final j0 f11862h;

    /* renamed from: i, reason: collision with root package name */
    private final AccessibilityManager f11863i;

    /* renamed from: j, reason: collision with root package name */
    private final Rect f11864j;

    /* compiled from: MaterialAutoCompleteTextView.java */
    class a implements AdapterView.OnItemClickListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            g.this.e(i2 < 0 ? g.this.f11862h.v() : g.this.getAdapter().getItem(i2));
            AdapterView.OnItemClickListener onItemClickListener = g.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i2 < 0) {
                    view = g.this.f11862h.y();
                    i2 = g.this.f11862h.x();
                    j2 = g.this.f11862h.w();
                }
                onItemClickListener.onItemClick(g.this.f11862h.j(), view, i2, j2);
            }
            g.this.f11862h.dismiss();
        }
    }

    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.c.b.c.b.a);
    }

    private TextInputLayout c() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private int d() {
        ListAdapter adapter = getAdapter();
        TextInputLayout textInputLayoutC = c();
        int i2 = 0;
        if (adapter == null || textInputLayoutC == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMin = Math.min(adapter.getCount(), Math.max(0, this.f11862h.x()) + 15);
        View view = null;
        int iMax = 0;
        for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
            int itemViewType = adapter.getItemViewType(iMax2);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = adapter.getView(iMax2, view, textInputLayoutC);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax = Math.max(iMax, view.getMeasuredWidth());
        }
        Drawable drawableI = this.f11862h.i();
        if (drawableI != null) {
            drawableI.getPadding(this.f11864j);
            Rect rect = this.f11864j;
            iMax += rect.left + rect.right;
        }
        return iMax + textInputLayoutC.getEndIconView().getMeasuredWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T extends ListAdapter & Filterable> void e(Object obj) {
        if (Build.VERSION.SDK_INT >= 17) {
            setText(convertSelectionToString(obj), false);
            return;
        }
        ListAdapter adapter = getAdapter();
        setAdapter(null);
        setText(convertSelectionToString(obj));
        setAdapter(adapter);
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutC = c();
        return (textInputLayoutC == null || !textInputLayoutC.O()) ? super.getHint() : textInputLayoutC.getHint();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutC = c();
        if (textInputLayoutC != null && textInputLayoutC.O() && super.getHint() == null && com.google.android.material.internal.e.a()) {
            setHint("");
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), d()), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.f11862h.p(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.f11863i;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f11862h.b();
        }
    }

    public g(Context context, AttributeSet attributeSet, int i2) {
        super(com.google.android.material.theme.a.a.c(context, attributeSet, i2, 0), attributeSet, i2);
        this.f11864j = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayH = j.h(context2, attributeSet, l.S1, i2, k.f15242d, new int[0]);
        int i3 = l.T1;
        if (typedArrayH.hasValue(i3) && typedArrayH.getInt(i3, 0) == 0) {
            setKeyListener(null);
        }
        this.f11863i = (AccessibilityManager) context2.getSystemService("accessibility");
        j0 j0Var = new j0(context2);
        this.f11862h = j0Var;
        j0Var.J(true);
        j0Var.D(this);
        j0Var.I(2);
        j0Var.p(getAdapter());
        j0Var.L(new a());
        typedArrayH.recycle();
    }
}