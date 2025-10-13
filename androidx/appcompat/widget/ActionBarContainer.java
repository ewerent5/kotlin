package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ch.qos.logback.classic.Level;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: e, reason: collision with root package name */
    private boolean f301e;

    /* renamed from: f, reason: collision with root package name */
    private View f302f;

    /* renamed from: g, reason: collision with root package name */
    private View f303g;

    /* renamed from: h, reason: collision with root package name */
    private View f304h;

    /* renamed from: i, reason: collision with root package name */
    Drawable f305i;

    /* renamed from: j, reason: collision with root package name */
    Drawable f306j;

    /* renamed from: k, reason: collision with root package name */
    Drawable f307k;

    /* renamed from: l, reason: collision with root package name */
    boolean f308l;

    /* renamed from: m, reason: collision with root package name */
    boolean f309m;
    private int n;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c.h.l.t.n0(this, new b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.a.j.a);
        this.f305i = typedArrayObtainStyledAttributes.getDrawable(c.a.j.f2521b);
        this.f306j = typedArrayObtainStyledAttributes.getDrawable(c.a.j.f2523d);
        this.n = typedArrayObtainStyledAttributes.getDimensionPixelSize(c.a.j.f2529j, -1);
        boolean z = true;
        if (getId() == c.a.f.H) {
            this.f308l = true;
            this.f307k = typedArrayObtainStyledAttributes.getDrawable(c.a.j.f2522c);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f308l ? this.f305i != null || this.f306j != null : this.f307k != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f305i;
        if (drawable != null && drawable.isStateful()) {
            this.f305i.setState(getDrawableState());
        }
        Drawable drawable2 = this.f306j;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f306j.setState(getDrawableState());
        }
        Drawable drawable3 = this.f307k;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f307k.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f302f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f305i;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f306j;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f307k;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f303g = findViewById(c.a.f.a);
        this.f304h = findViewById(c.a.f.f2487f);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f301e || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        Drawable drawable;
        super.onLayout(z, i2, i3, i4, i5);
        View view = this.f302f;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int measuredHeight2 = measuredHeight - view.getMeasuredHeight();
            int i6 = layoutParams.bottomMargin;
            view.layout(i2, measuredHeight2 - i6, i4, measuredHeight - i6);
        }
        if (this.f308l) {
            Drawable drawable2 = this.f307k;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f305i != null) {
                if (this.f303g.getVisibility() == 0) {
                    this.f305i.setBounds(this.f303g.getLeft(), this.f303g.getTop(), this.f303g.getRight(), this.f303g.getBottom());
                } else {
                    View view2 = this.f304h;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f305i.setBounds(0, 0, 0, 0);
                    } else {
                        this.f305i.setBounds(this.f304h.getLeft(), this.f304h.getTop(), this.f304h.getRight(), this.f304h.getBottom());
                    }
                }
                z3 = true;
            }
            this.f309m = z4;
            if (!z4 || (drawable = this.f306j) == null) {
                z2 = z3;
            } else {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        int i4;
        if (this.f303g == null && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE && (i4 = this.n) >= 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(i4, View.MeasureSpec.getSize(i3)), Level.ALL_INT);
        }
        super.onMeasure(i2, i3);
        if (this.f303g == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i3);
        View view = this.f302f;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min((!b(this.f303g) ? a(this.f303g) : !b(this.f304h) ? a(this.f304h) : 0) + a(this.f302f), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i3) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f305i;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f305i);
        }
        this.f305i = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f303g;
            if (view != null) {
                this.f305i.setBounds(view.getLeft(), this.f303g.getTop(), this.f303g.getRight(), this.f303g.getBottom());
            }
        }
        boolean z = true;
        if (!this.f308l ? this.f305i != null || this.f306j != null : this.f307k != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f307k;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f307k);
        }
        this.f307k = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f308l && (drawable2 = this.f307k) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f308l ? !(this.f305i != null || this.f306j != null) : this.f307k == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f306j;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f306j);
        }
        this.f306j = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f309m && (drawable2 = this.f306j) != null) {
                drawable2.setBounds(this.f302f.getLeft(), this.f302f.getTop(), this.f302f.getRight(), this.f302f.getBottom());
            }
        }
        boolean z = true;
        if (!this.f308l ? this.f305i != null || this.f306j != null : this.f307k != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setTabContainer(p0 p0Var) {
        View view = this.f302f;
        if (view != null) {
            removeView(view);
        }
        this.f302f = p0Var;
        if (p0Var != null) {
            addView(p0Var);
            ViewGroup.LayoutParams layoutParams = p0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            p0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f301e = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.f305i;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f306j;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f307k;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f305i && !this.f308l) || (drawable == this.f306j && this.f309m) || ((drawable == this.f307k && this.f308l) || super.verifyDrawable(drawable));
    }
}