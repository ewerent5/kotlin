package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.widget.TextView;

/* compiled from: CalendarItemStyle.java */
/* loaded from: classes.dex */
final class b {
    private final Rect a;

    /* renamed from: b, reason: collision with root package name */
    private final ColorStateList f11559b;

    /* renamed from: c, reason: collision with root package name */
    private final ColorStateList f11560c;

    /* renamed from: d, reason: collision with root package name */
    private final ColorStateList f11561d;

    /* renamed from: e, reason: collision with root package name */
    private final int f11562e;

    /* renamed from: f, reason: collision with root package name */
    private final e.c.b.c.c0.k f11563f;

    private b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i2, e.c.b.c.c0.k kVar, Rect rect) {
        c.h.k.h.b(rect.left);
        c.h.k.h.b(rect.top);
        c.h.k.h.b(rect.right);
        c.h.k.h.b(rect.bottom);
        this.a = rect;
        this.f11559b = colorStateList2;
        this.f11560c = colorStateList;
        this.f11561d = colorStateList3;
        this.f11562e = i2;
        this.f11563f = kVar;
    }

    static b a(Context context, int i2) throws Resources.NotFoundException {
        c.h.k.h.a(i2 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i2, e.c.b.c.l.B2);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(e.c.b.c.l.C2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(e.c.b.c.l.E2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(e.c.b.c.l.D2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(e.c.b.c.l.F2, 0));
        ColorStateList colorStateListA = e.c.b.c.z.c.a(context, typedArrayObtainStyledAttributes, e.c.b.c.l.G2);
        ColorStateList colorStateListA2 = e.c.b.c.z.c.a(context, typedArrayObtainStyledAttributes, e.c.b.c.l.L2);
        ColorStateList colorStateListA3 = e.c.b.c.z.c.a(context, typedArrayObtainStyledAttributes, e.c.b.c.l.J2);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(e.c.b.c.l.K2, 0);
        e.c.b.c.c0.k kVarM = e.c.b.c.c0.k.b(context, typedArrayObtainStyledAttributes.getResourceId(e.c.b.c.l.H2, 0), typedArrayObtainStyledAttributes.getResourceId(e.c.b.c.l.I2, 0)).m();
        typedArrayObtainStyledAttributes.recycle();
        return new b(colorStateListA, colorStateListA2, colorStateListA3, dimensionPixelSize, kVarM, rect);
    }

    int b() {
        return this.a.bottom;
    }

    int c() {
        return this.a.top;
    }

    void d(TextView textView) {
        e.c.b.c.c0.g gVar = new e.c.b.c.c0.g();
        e.c.b.c.c0.g gVar2 = new e.c.b.c.c0.g();
        gVar.setShapeAppearanceModel(this.f11563f);
        gVar2.setShapeAppearanceModel(this.f11563f);
        gVar.X(this.f11560c);
        gVar.d0(this.f11562e, this.f11561d);
        textView.setTextColor(this.f11559b);
        Drawable rippleDrawable = Build.VERSION.SDK_INT >= 21 ? new RippleDrawable(this.f11559b.withAlpha(30), gVar, gVar2) : gVar;
        Rect rect = this.a;
        c.h.l.t.n0(textView, new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}