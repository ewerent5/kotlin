package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.h.l.t;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {
    private int a;

    class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ View f11902e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f11903f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ e.c.b.c.w.a f11904g;

        a(View view, int i2, e.c.b.c.w.a aVar) {
            this.f11902e = view;
            this.f11903f = i2;
            this.f11904g = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f11902e.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.a == this.f11903f) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                e.c.b.c.w.a aVar = this.f11904g;
                expandableBehavior.H((View) aVar, this.f11902e, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.a = 0;
    }

    private boolean F(boolean z) {
        if (!z) {
            return this.a == 1;
        }
        int i2 = this.a;
        return i2 == 0 || i2 == 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected e.c.b.c.w.a G(CoordinatorLayout coordinatorLayout, View view) {
        List<View> listR = coordinatorLayout.r(view);
        int size = listR.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = listR.get(i2);
            if (e(coordinatorLayout, view, view2)) {
                return (e.c.b.c.w.a) view2;
            }
        }
        return null;
    }

    protected abstract boolean H(View view, View view2, boolean z, boolean z2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        e.c.b.c.w.a aVar = (e.c.b.c.w.a) view2;
        if (!F(aVar.a())) {
            return false;
        }
        this.a = aVar.a() ? 1 : 2;
        return H((View) aVar, view, aVar.a(), true);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i2) {
        e.c.b.c.w.a aVarG;
        if (t.Q(view) || (aVarG = G(coordinatorLayout, view)) == null || !F(aVarG.a())) {
            return false;
        }
        int i3 = aVarG.a() ? 1 : 2;
        this.a = i3;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, i3, aVarG));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
    }
}