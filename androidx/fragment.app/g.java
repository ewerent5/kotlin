package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: FragmentContainerView.java */
/* loaded from: classes.dex */
public final class g extends FrameLayout {

    /* renamed from: e */
    private ArrayList<View> f1025e;

    /* renamed from: f */
    private ArrayList<View> f1026f;

    /* renamed from: g */
    private boolean f1027g;

    public g(Context context) {
        super(context);
        this.f1027g = true;
    }

    private void a(View view) {
        ArrayList<View> arrayList;
        if (view.getAnimation() != null || ((arrayList = this.f1026f) != null && arrayList.contains(view))) {
            if (this.f1025e == null) {
                this.f1025e = new ArrayList<>();
            }
            this.f1025e.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (m.k0(view) != null) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z) {
        if (m.k0(view) != null) {
            return super.addViewInLayout(view, i2, layoutParams, z);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (this.f1027g && this.f1025e != null) {
            for (int i2 = 0; i2 < this.f1025e.size(); i2++) {
                super.drawChild(canvas, this.f1025e.get(i2), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j2) {
        ArrayList<View> arrayList;
        if (!this.f1027g || (arrayList = this.f1025e) == null || arrayList.size() <= 0 || !this.f1025e.contains(view)) {
            return super.drawChild(canvas, view, j2);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        ArrayList<View> arrayList = this.f1026f;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.f1025e;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f1027g = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            getChildAt(i2).dispatchApplyWindowInsets(new WindowInsets(windowInsets));
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z) {
        if (z) {
            a(view);
        }
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i2) {
        a(getChildAt(i2));
        super.removeViewAt(i2);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            a(getChildAt(i4));
        }
        super.removeViews(i2, i3);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            a(getChildAt(i4));
        }
        super.removeViewsInLayout(i2, i3);
    }

    void setDrawDisappearingViewsLast(boolean z) {
        this.f1027g = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT >= 18) {
            throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
        }
        super.setLayoutTransition(layoutTransition);
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f1026f == null) {
                this.f1026f = new ArrayList<>();
            }
            this.f1026f.add(view);
        }
        super.startViewTransition(view);
    }

    g(Context context, AttributeSet attributeSet, m mVar) {
        String str;
        super(context, attributeSet);
        this.f1027g = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.l.c.f3259h);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(c.l.c.f3260i) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(c.l.c.f3261j);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        Fragment fragmentW = mVar.W(id);
        if (classAttribute == null || fragmentW != null) {
            return;
        }
        if (id <= 0) {
            if (string != null) {
                str = " with tag " + string;
            } else {
                str = "";
            }
            throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
        }
        Fragment fragmentA = mVar.e0().a(context.getClassLoader(), classAttribute);
        fragmentA.x1(context, attributeSet, null);
        mVar.i().w(true).d(this, fragmentA, string).m();
    }
}