package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.h.l.t;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import e.c.b.c.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {
    private static final int T = k.f15250l;
    private final int U;
    private final e.c.b.c.c0.g V;
    private Animator W;
    private Animator a0;
    private int b0;
    private int c0;
    private boolean d0;
    private int e0;
    private ArrayList<g> f0;
    private int g0;
    private boolean h0;
    private boolean i0;
    private Behavior j0;
    private int k0;
    private int l0;
    private int m0;
    AnimatorListenerAdapter n0;
    e.c.b.c.m.k<FloatingActionButton> o0;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.l0();
            BottomAppBar.this.W = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m0();
        }
    }

    class b extends FloatingActionButton.b {
        final /* synthetic */ int a;

        class a extends FloatingActionButton.b {
            a() {
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
            public void b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.l0();
            }
        }

        b(int i2) {
            this.a = i2;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
        public void a(FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.q0(this.a));
            floatingActionButton.s(new a());
        }
    }

    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.l0();
            BottomAppBar.this.h0 = false;
            BottomAppBar.this.a0 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m0();
        }
    }

    class d extends AnimatorListenerAdapter {
        public boolean a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ActionMenuView f11457b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f11458c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f11459d;

        d(ActionMenuView actionMenuView, int i2, boolean z) {
            this.f11457b = actionMenuView;
            this.f11458c = i2;
            this.f11459d = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.a) {
                return;
            }
            boolean z = BottomAppBar.this.g0 != 0;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.u0(bottomAppBar.g0);
            BottomAppBar.this.A0(this.f11457b, this.f11458c, this.f11459d, z);
        }
    }

    class e implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ActionMenuView f11461e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f11462f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f11463g;

        e(ActionMenuView actionMenuView, int i2, boolean z) {
            this.f11461e = actionMenuView;
            this.f11462f = i2;
            this.f11463g = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11461e.setTranslationX(BottomAppBar.this.p0(r0, this.f11462f, this.f11463g));
        }
    }

    class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.n0.onAnimationStart(animator);
            FloatingActionButton floatingActionButtonN0 = BottomAppBar.this.n0();
            if (floatingActionButtonN0 != null) {
                floatingActionButtonN0.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    interface g {
        void a(BottomAppBar bottomAppBar);

        void b(BottomAppBar bottomAppBar);
    }

    static class h extends c.j.a.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: g, reason: collision with root package name */
        int f11465g;

        /* renamed from: h, reason: collision with root package name */
        boolean f11466h;

        static class a implements Parcelable.ClassLoaderCreator<h> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public h[] newArray(int i2) {
                return new h[i2];
            }
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // c.j.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f11465g);
            parcel.writeInt(this.f11466h ? 1 : 0);
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f11465g = parcel.readInt();
            this.f11466h = parcel.readInt() != 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0(ActionMenuView actionMenuView, int i2, boolean z, boolean z2) {
        e eVar = new e(actionMenuView, i2, z);
        if (z2) {
            actionMenuView.post(eVar);
        } else {
            eVar.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(FloatingActionButton floatingActionButton) {
        floatingActionButton.e(this.n0);
        floatingActionButton.f(new f());
        floatingActionButton.g(this.o0);
    }

    private ActionMenuView getActionMenuView() {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.k0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return q0(this.b0);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.m0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.l0;
    }

    private com.google.android.material.bottomappbar.a getTopEdgeTreatment() {
        return (com.google.android.material.bottomappbar.a) this.V.C().p();
    }

    private void h0() {
        Animator animator = this.a0;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.W;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    private void j0(int i2, List<Animator> list) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(n0(), "translationX", q0(i2));
        objectAnimatorOfFloat.setDuration(300L);
        list.add(objectAnimatorOfFloat);
    }

    private void k0(int i2, boolean z, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null) {
            return;
        }
        Animator animatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
        if (Math.abs(actionMenuView.getTranslationX() - p0(actionMenuView, i2, z)) <= 1.0f) {
            if (actionMenuView.getAlpha() < 1.0f) {
                list.add(animatorOfFloat);
            }
        } else {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
            objectAnimatorOfFloat.addListener(new d(actionMenuView, i2, z));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(150L);
            animatorSet.playSequentially(objectAnimatorOfFloat, animatorOfFloat);
            list.add(animatorSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0() {
        ArrayList<g> arrayList;
        int i2 = this.e0 - 1;
        this.e0 = i2;
        if (i2 != 0 || (arrayList = this.f0) == null) {
            return;
        }
        Iterator<g> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0() {
        ArrayList<g> arrayList;
        int i2 = this.e0;
        this.e0 = i2 + 1;
        if (i2 != 0 || (arrayList = this.f0) == null) {
            return;
        }
        Iterator<g> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FloatingActionButton n0() {
        View viewO0 = o0();
        if (viewO0 instanceof FloatingActionButton) {
            return (FloatingActionButton) viewO0;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View o0() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).s(this)) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float q0(int i2) {
        boolean zD = com.google.android.material.internal.k.d(this);
        if (i2 == 1) {
            return ((getMeasuredWidth() / 2) - (this.U + (zD ? this.m0 : this.l0))) * (zD ? -1 : 1);
        }
        return 0.0f;
    }

    private boolean r0() {
        FloatingActionButton floatingActionButtonN0 = n0();
        return floatingActionButtonN0 != null && floatingActionButtonN0.o();
    }

    private void s0(int i2, boolean z) {
        if (!t.Q(this)) {
            this.h0 = false;
            u0(this.g0);
            return;
        }
        Animator animator = this.a0;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!r0()) {
            i2 = 0;
            z = false;
        }
        k0(i2, z, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.a0 = animatorSet;
        animatorSet.addListener(new c());
        this.a0.start();
    }

    private void t0(int i2) {
        if (this.b0 == i2 || !t.Q(this)) {
            return;
        }
        Animator animator = this.W;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (this.c0 == 1) {
            j0(i2, arrayList);
        } else {
            i0(i2, arrayList);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.W = animatorSet;
        animatorSet.addListener(new a());
        this.W.start();
    }

    private void v0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.a0 != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (r0()) {
            z0(actionMenuView, this.b0, this.i0);
        } else {
            z0(actionMenuView, 0, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w0() {
        getTopEdgeTreatment().l(getFabTranslationX());
        View viewO0 = o0();
        this.V.Y((this.i0 && r0()) ? 1.0f : 0.0f);
        if (viewO0 != null) {
            viewO0.setTranslationY(getFabTranslationY());
            viewO0.setTranslationX(getFabTranslationX());
        }
    }

    private void z0(ActionMenuView actionMenuView, int i2, boolean z) {
        A0(actionMenuView, i2, z, false);
    }

    public ColorStateList getBackgroundTint() {
        return this.V.E();
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().d();
    }

    public int getFabAlignmentMode() {
        return this.b0;
    }

    public int getFabAnimationMode() {
        return this.c0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().e();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f();
    }

    public boolean getHideOnScroll() {
        return this.d0;
    }

    protected void i0(int i2, List<Animator> list) {
        FloatingActionButton floatingActionButtonN0 = n0();
        if (floatingActionButtonN0 == null || floatingActionButtonN0.n()) {
            return;
        }
        m0();
        floatingActionButtonN0.l(new b(i2));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        e.c.b.c.c0.h.f(this, this.V);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) throws NoSuchFieldException {
        super.onLayout(z, i2, i3, i4, i5);
        if (z) {
            h0();
            w0();
        }
        v0();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        this.b0 = hVar.f11465g;
        this.i0 = hVar.f11466h;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        hVar.f11465g = this.b0;
        hVar.f11466h = this.i0;
        return hVar;
    }

    protected int p0(ActionMenuView actionMenuView, int i2, boolean z) {
        if (i2 != 1 || !z) {
            return 0;
        }
        boolean zD = com.google.android.material.internal.k.d(this);
        int measuredWidth = zD ? getMeasuredWidth() : 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if ((childAt.getLayoutParams() instanceof Toolbar.e) && (((Toolbar.e) childAt.getLayoutParams()).a & 8388615) == 8388611) {
                measuredWidth = zD ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        return measuredWidth - ((zD ? actionMenuView.getRight() : actionMenuView.getLeft()) + (zD ? this.l0 : -this.m0));
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        androidx.core.graphics.drawable.a.o(this.V, colorStateList);
    }

    public void setCradleVerticalOffset(float f2) {
        if (f2 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().h(f2);
            this.V.invalidateSelf();
            w0();
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        this.V.W(f2);
        getBehavior().G(this, this.V.B() - this.V.A());
    }

    public void setFabAlignmentMode(int i2) {
        x0(i2, 0);
    }

    public void setFabAnimationMode(int i2) {
        this.c0 = i2;
    }

    public void setFabCradleMargin(float f2) {
        if (f2 != getFabCradleMargin()) {
            getTopEdgeTreatment().i(f2);
            this.V.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f2) {
        if (f2 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().j(f2);
            this.V.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.d0 = z;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public void u0(int i2) {
        if (i2 != 0) {
            this.g0 = 0;
            getMenu().clear();
            x(i2);
        }
    }

    public void x0(int i2, int i3) {
        this.g0 = i3;
        this.h0 = true;
        s0(i2, this.i0);
        t0(i2);
        this.b0 = i2;
    }

    boolean y0(int i2) {
        float f2 = i2;
        if (f2 == getTopEdgeTreatment().g()) {
            return false;
        }
        getTopEdgeTreatment().k(f2);
        this.V.invalidateSelf();
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Behavior getBehavior() {
        if (this.j0 == null) {
            this.j0 = new Behavior();
        }
        return this.j0;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: e, reason: collision with root package name */
        private final Rect f11452e;

        /* renamed from: f, reason: collision with root package name */
        private WeakReference<BottomAppBar> f11453f;

        /* renamed from: g, reason: collision with root package name */
        private int f11454g;

        /* renamed from: h, reason: collision with root package name */
        private final View.OnLayoutChangeListener f11455h;

        class a implements View.OnLayoutChangeListener {
            a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f11453f.get();
                if (bottomAppBar == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                floatingActionButton.j(Behavior.this.f11452e);
                int iHeight = Behavior.this.f11452e.height();
                bottomAppBar.y0(iHeight);
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
                if (Behavior.this.f11454g == 0) {
                    ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(e.c.b.c.d.C) - ((floatingActionButton.getMeasuredHeight() - iHeight) / 2));
                    ((ViewGroup.MarginLayoutParams) fVar).leftMargin = bottomAppBar.getLeftInset();
                    ((ViewGroup.MarginLayoutParams) fVar).rightMargin = bottomAppBar.getRightInset();
                    if (com.google.android.material.internal.k.d(floatingActionButton)) {
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin += bottomAppBar.U;
                    } else {
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin += bottomAppBar.U;
                    }
                }
            }
        }

        public Behavior() {
            this.f11455h = new a();
            this.f11452e = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: M, reason: merged with bridge method [inline-methods] */
        public boolean l(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i2) {
            this.f11453f = new WeakReference<>(bottomAppBar);
            View viewO0 = bottomAppBar.o0();
            if (viewO0 != null && !t.Q(viewO0)) {
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) viewO0.getLayoutParams();
                fVar.f798d = 49;
                this.f11454g = ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                if (viewO0 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) viewO0;
                    floatingActionButton.addOnLayoutChangeListener(this.f11455h);
                    bottomAppBar.g0(floatingActionButton);
                }
                bottomAppBar.w0();
            }
            coordinatorLayout.I(bottomAppBar, i2);
            return super.l(coordinatorLayout, bottomAppBar, i2);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: N, reason: merged with bridge method [inline-methods] */
        public boolean A(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i2, int i3) {
            return bottomAppBar.getHideOnScroll() && super.A(coordinatorLayout, bottomAppBar, view, view2, i2, i3);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f11455h = new a();
            this.f11452e = new Rect();
        }
    }
}