package com.google.android.material.bottomappbar;

import e.c.b.c.c0.f;
import e.c.b.c.c0.m;

/* compiled from: BottomAppBarTopEdgeTreatment.java */
/* loaded from: classes.dex */
public class a extends f implements Cloneable {

    /* renamed from: e, reason: collision with root package name */
    private float f11467e;

    /* renamed from: f, reason: collision with root package name */
    private float f11468f;

    /* renamed from: g, reason: collision with root package name */
    private float f11469g;

    /* renamed from: h, reason: collision with root package name */
    private float f11470h;

    /* renamed from: i, reason: collision with root package name */
    private float f11471i;

    @Override // e.c.b.c.c0.f
    public void b(float f2, float f3, float f4, m mVar) {
        float f5 = this.f11469g;
        if (f5 == 0.0f) {
            mVar.m(f2, 0.0f);
            return;
        }
        float f6 = ((this.f11468f * 2.0f) + f5) / 2.0f;
        float f7 = f4 * this.f11467e;
        float f8 = f3 + this.f11471i;
        float f9 = (this.f11470h * f4) + ((1.0f - f4) * f6);
        if (f9 / f6 >= 1.0f) {
            mVar.m(f2, 0.0f);
            return;
        }
        float f10 = f6 + f7;
        float f11 = f9 + f7;
        float fSqrt = (float) Math.sqrt((f10 * f10) - (f11 * f11));
        float f12 = f8 - fSqrt;
        float f13 = f8 + fSqrt;
        float degrees = (float) Math.toDegrees(Math.atan(fSqrt / f11));
        float f14 = 90.0f - degrees;
        mVar.m(f12, 0.0f);
        float f15 = f7 * 2.0f;
        mVar.a(f12 - f7, 0.0f, f12 + f7, f15, 270.0f, degrees);
        mVar.a(f8 - f6, (-f6) - f9, f8 + f6, f6 - f9, 180.0f - f14, (f14 * 2.0f) - 180.0f);
        mVar.a(f13 - f7, 0.0f, f13 + f7, f15, 270.0f - degrees, degrees);
        mVar.m(f2, 0.0f);
    }

    float d() {
        return this.f11470h;
    }

    float e() {
        return this.f11468f;
    }

    float f() {
        return this.f11467e;
    }

    public float g() {
        return this.f11469g;
    }

    void h(float f2) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.f11470h = f2;
    }

    void i(float f2) {
        this.f11468f = f2;
    }

    void j(float f2) {
        this.f11467e = f2;
    }

    public void k(float f2) {
        this.f11469g = f2;
    }

    void l(float f2) {
        this.f11471i = f2;
    }
}