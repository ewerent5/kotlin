package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: ViewOffsetBehavior.java */
/* loaded from: classes.dex */
class c<V extends View> extends CoordinatorLayout.c<V> {
    private d a;

    /* renamed from: b, reason: collision with root package name */
    private int f11427b;

    /* renamed from: c, reason: collision with root package name */
    private int f11428c;

    public c() {
        this.f11427b = 0;
        this.f11428c = 0;
    }

    public int E() {
        d dVar = this.a;
        if (dVar != null) {
            return dVar.b();
        }
        return 0;
    }

    protected void F(CoordinatorLayout coordinatorLayout, V v, int i2) {
        coordinatorLayout.I(v, i2);
    }

    public boolean G(int i2) {
        d dVar = this.a;
        if (dVar != null) {
            return dVar.e(i2);
        }
        this.f11427b = i2;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v, int i2) {
        F(coordinatorLayout, v, i2);
        if (this.a == null) {
            this.a = new d(v);
        }
        this.a.c();
        this.a.a();
        int i3 = this.f11427b;
        if (i3 != 0) {
            this.a.e(i3);
            this.f11427b = 0;
        }
        int i4 = this.f11428c;
        if (i4 == 0) {
            return true;
        }
        this.a.d(i4);
        this.f11428c = 0;
        return true;
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11427b = 0;
        this.f11428c = 0;
    }
}