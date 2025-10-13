package com.google.android.material.appbar;

import android.view.View;
import c.h.l.t;

/* compiled from: ViewOffsetHelper.java */
/* loaded from: classes.dex */
class d {
    private final View a;

    /* renamed from: b, reason: collision with root package name */
    private int f11429b;

    /* renamed from: c, reason: collision with root package name */
    private int f11430c;

    /* renamed from: d, reason: collision with root package name */
    private int f11431d;

    /* renamed from: e, reason: collision with root package name */
    private int f11432e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f11433f = true;

    /* renamed from: g, reason: collision with root package name */
    private boolean f11434g = true;

    public d(View view) {
        this.a = view;
    }

    void a() {
        View view = this.a;
        t.W(view, this.f11431d - (view.getTop() - this.f11429b));
        View view2 = this.a;
        t.V(view2, this.f11432e - (view2.getLeft() - this.f11430c));
    }

    public int b() {
        return this.f11431d;
    }

    void c() {
        this.f11429b = this.a.getTop();
        this.f11430c = this.a.getLeft();
    }

    public boolean d(int i2) {
        if (!this.f11434g || this.f11432e == i2) {
            return false;
        }
        this.f11432e = i2;
        a();
        return true;
    }

    public boolean e(int i2) {
        if (!this.f11433f || this.f11431d == i2) {
            return false;
        }
        this.f11431d = i2;
        a();
        return true;
    }
}