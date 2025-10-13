package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import e.c.b.c.h;

/* loaded from: classes.dex */
public class Snackbar extends BaseTransientBottomBar<Snackbar> {
    private static final int[] y;
    private static final int[] z;
    private final AccessibilityManager A;
    private boolean B;

    public static final class SnackbarLayout extends BaseTransientBottomBar.w {
        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i2, int i3) {
            super.onMeasure(i2, i3);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.w, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.w, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.w, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.w, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.w, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }
    }

    class a implements View.OnClickListener {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ View.OnClickListener f11749e;

        a(View.OnClickListener onClickListener) {
            this.f11749e = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f11749e.onClick(view);
            Snackbar.this.w(1);
        }
    }

    static {
        int i2 = e.c.b.c.b.x;
        y = new int[]{i2};
        z = new int[]{i2, e.c.b.c.b.z};
    }

    private Snackbar(Context context, ViewGroup viewGroup, View view, com.google.android.material.snackbar.a aVar) {
        super(context, viewGroup, view, aVar);
        this.A = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    private static ViewGroup Y(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    private static boolean Z(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(z);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        typedArrayObtainStyledAttributes.recycle();
        return (resourceId == -1 || resourceId2 == -1) ? false : true;
    }

    public static Snackbar a0(View view, int i2, int i3) {
        return b0(view, view.getResources().getText(i2), i3);
    }

    public static Snackbar b0(View view, CharSequence charSequence, int i2) {
        return c0(null, view, charSequence, i2);
    }

    private static Snackbar c0(Context context, View view, CharSequence charSequence, int i2) {
        ViewGroup viewGroupY = Y(view);
        if (viewGroupY == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        if (context == null) {
            context = viewGroupY.getContext();
        }
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(context).inflate(Z(context) ? h.u : h.f15216b, viewGroupY, false);
        Snackbar snackbar = new Snackbar(context, viewGroupY, snackbarContentLayout, snackbarContentLayout);
        snackbar.i0(charSequence);
        snackbar.M(i2);
        return snackbar;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void Q() {
        super.Q();
    }

    public Snackbar d0(int i2, View.OnClickListener onClickListener) {
        return e0(y().getText(i2), onClickListener);
    }

    public Snackbar e0(CharSequence charSequence, View.OnClickListener onClickListener) {
        Button actionView = ((SnackbarContentLayout) this.f11723g.getChildAt(0)).getActionView();
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            actionView.setVisibility(8);
            actionView.setOnClickListener(null);
            this.B = false;
        } else {
            this.B = true;
            actionView.setVisibility(0);
            actionView.setText(charSequence);
            actionView.setOnClickListener(new a(onClickListener));
        }
        return this;
    }

    public Snackbar f0(int i2) {
        ((SnackbarContentLayout) this.f11723g.getChildAt(0)).getActionView().setTextColor(i2);
        return this;
    }

    public Snackbar g0(int i2) {
        return h0(ColorStateList.valueOf(i2));
    }

    public Snackbar h0(ColorStateList colorStateList) {
        this.f11723g.setBackgroundTintList(colorStateList);
        return this;
    }

    public Snackbar i0(CharSequence charSequence) {
        ((SnackbarContentLayout) this.f11723g.getChildAt(0)).getMessageView().setText(charSequence);
        return this;
    }

    public Snackbar j0(int i2) {
        ((SnackbarContentLayout) this.f11723g.getChildAt(0)).getMessageView().setTextColor(i2);
        return this;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void v() {
        super.v();
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public int z() {
        int iZ = super.z();
        if (iZ == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return this.A.getRecommendedTimeoutMillis(iZ, (this.B ? 4 : 0) | 1 | 2);
        }
        if (this.B && this.A.isTouchExplorationEnabled()) {
            return -2;
        }
        return iZ;
    }
}