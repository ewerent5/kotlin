package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.h.l.t;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import e.c.b.c.k;
import e.c.b.c.l;
import e.c.b.c.m.h;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {
    private int B;
    private final com.google.android.material.floatingactionbutton.d C;
    private final com.google.android.material.floatingactionbutton.d D;
    private final com.google.android.material.floatingactionbutton.d E;
    private final com.google.android.material.floatingactionbutton.d F;
    private final int G;
    private int H;
    private int I;
    private final CoordinatorLayout.c<ExtendedFloatingActionButton> J;
    private boolean K;
    private boolean L;
    private boolean M;
    protected ColorStateList N;
    private static final int w = k.t;
    static final Property<View, Float> x = new b(Float.class, "width");
    static final Property<View, Float> y = new c(Float.class, "height");
    static final Property<View, Float> z = new d(Float.class, "paddingStart");
    static final Property<View, Float> A = new e(Float.class, "paddingEnd");

    class a extends AnimatorListenerAdapter {
        private boolean a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.floatingactionbutton.d f11624b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f11625c;

        a(com.google.android.material.floatingactionbutton.d dVar, f fVar) {
            this.f11624b = dVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a = true;
            this.f11624b.a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f11624b.e();
            if (this.a) {
                return;
            }
            this.f11624b.i(this.f11625c);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f11624b.onAnimationStart(animator);
            this.a = false;
        }
    }

    static class b extends Property<View, Float> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f2) {
            view.getLayoutParams().width = f2.intValue();
            view.requestLayout();
        }
    }

    static class c extends Property<View, Float> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f2) {
            view.getLayoutParams().height = f2.intValue();
            view.requestLayout();
        }
    }

    static class d extends Property<View, Float> {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(t.G(view));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f2) {
            t.x0(view, f2.intValue(), view.getPaddingTop(), t.F(view), view.getPaddingBottom());
        }
    }

    static class e extends Property<View, Float> {
        e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(t.F(view));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f2) {
            t.x0(view, t.G(view), view.getPaddingTop(), f2.intValue(), view.getPaddingBottom());
        }
    }

    public static abstract class f {
    }

    private boolean q() {
        return getVisibility() != 0 ? this.B == 2 : this.B != 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(com.google.android.material.floatingactionbutton.d dVar, f fVar) {
        if (dVar.d()) {
            return;
        }
        if (!t()) {
            dVar.b();
            dVar.i(fVar);
            return;
        }
        measure(0, 0);
        AnimatorSet animatorSetG = dVar.g();
        animatorSetG.addListener(new a(dVar, fVar));
        Iterator<Animator.AnimatorListener> it = dVar.h().iterator();
        while (it.hasNext()) {
            animatorSetG.addListener(it.next());
        }
        animatorSetG.start();
    }

    private void s() {
        this.N = getTextColors();
    }

    private boolean t() {
        return (t.Q(this) || (!q() && this.M)) && !isInEditMode();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
        return this.J;
    }

    int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    int getCollapsedSize() {
        int i2 = this.G;
        return i2 < 0 ? (Math.min(t.G(this), t.F(this)) * 2) + getIconSize() : i2;
    }

    public h getExtendMotionSpec() {
        return this.D.c();
    }

    public h getHideMotionSpec() {
        return this.F.c();
    }

    public h getShowMotionSpec() {
        return this.E.c();
    }

    public h getShrinkMotionSpec() {
        return this.C.c();
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.K && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.K = false;
            this.C.b();
        }
    }

    public void setAnimateShowBeforeLayout(boolean z2) {
        this.M = z2;
    }

    public void setExtendMotionSpec(h hVar) {
        this.D.f(hVar);
    }

    public void setExtendMotionSpecResource(int i2) {
        setExtendMotionSpec(h.c(getContext(), i2));
    }

    public void setExtended(boolean z2) {
        if (this.K == z2) {
            return;
        }
        com.google.android.material.floatingactionbutton.d dVar = z2 ? this.D : this.C;
        if (dVar.d()) {
            return;
        }
        dVar.b();
    }

    public void setHideMotionSpec(h hVar) {
        this.F.f(hVar);
    }

    public void setHideMotionSpecResource(int i2) {
        setHideMotionSpec(h.c(getContext(), i2));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
        super.setPadding(i2, i3, i4, i5);
        if (!this.K || this.L) {
            return;
        }
        this.H = t.G(this);
        this.I = t.F(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i2, int i3, int i4, int i5) {
        super.setPaddingRelative(i2, i3, i4, i5);
        if (!this.K || this.L) {
            return;
        }
        this.H = i2;
        this.I = i4;
    }

    public void setShowMotionSpec(h hVar) {
        this.E.f(hVar);
    }

    public void setShowMotionSpecResource(int i2) {
        setShowMotionSpec(h.c(getContext(), i2));
    }

    public void setShrinkMotionSpec(h hVar) {
        this.C.f(hVar);
    }

    public void setShrinkMotionSpecResource(int i2) {
        setShrinkMotionSpec(h.c(getContext(), i2));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i2) {
        super.setTextColor(i2);
        s();
    }

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T> {
        private Rect a;

        /* renamed from: b, reason: collision with root package name */
        private f f11620b;

        /* renamed from: c, reason: collision with root package name */
        private f f11621c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f11622d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f11623e;

        public ExtendedFloatingActionButtonBehavior() {
            this.f11622d = false;
            this.f11623e = true;
        }

        private static boolean G(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean J(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.f11622d || this.f11623e) && ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams()).e() == view.getId();
        }

        private boolean L(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!J(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            com.google.android.material.internal.b.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                K(extendedFloatingActionButton);
                return true;
            }
            E(extendedFloatingActionButton);
            return true;
        }

        private boolean M(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!J(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                K(extendedFloatingActionButton);
                return true;
            }
            E(extendedFloatingActionButton);
            return true;
        }

        protected void E(ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z = this.f11623e;
            extendedFloatingActionButton.r(z ? extendedFloatingActionButton.D : extendedFloatingActionButton.E, z ? this.f11621c : this.f11620b);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public boolean b(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.b(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public boolean h(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            }
            if (!G(view)) {
                return false;
            }
            M(view, extendedFloatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public boolean l(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i2) {
            List<View> listR = coordinatorLayout.r(extendedFloatingActionButton);
            int size = listR.size();
            for (int i3 = 0; i3 < size; i3++) {
                View view = listR.get(i3);
                if (!(view instanceof AppBarLayout)) {
                    if (G(view) && M(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.I(extendedFloatingActionButton, i2);
            return true;
        }

        protected void K(ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z = this.f11623e;
            extendedFloatingActionButton.r(z ? extendedFloatingActionButton.C : extendedFloatingActionButton.F, z ? this.f11621c : this.f11620b);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void g(CoordinatorLayout.f fVar) {
            if (fVar.f802h == 0) {
                fVar.f802h = 80;
            }
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.n1);
            this.f11622d = typedArrayObtainStyledAttributes.getBoolean(l.o1, false);
            this.f11623e = typedArrayObtainStyledAttributes.getBoolean(l.p1, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        s();
    }
}