package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;

/* compiled from: CalendarStyle.java */
/* loaded from: classes.dex */
final class c {
    final b a;

    /* renamed from: b, reason: collision with root package name */
    final b f11564b;

    /* renamed from: c, reason: collision with root package name */
    final b f11565c;

    /* renamed from: d, reason: collision with root package name */
    final b f11566d;

    /* renamed from: e, reason: collision with root package name */
    final b f11567e;

    /* renamed from: f, reason: collision with root package name */
    final b f11568f;

    /* renamed from: g, reason: collision with root package name */
    final b f11569g;

    /* renamed from: h, reason: collision with root package name */
    final Paint f11570h;

    c(Context context) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(e.c.b.c.z.b.c(context, e.c.b.c.b.s, h.class.getCanonicalName()), e.c.b.c.l.s2);
        this.a = b.a(context, typedArrayObtainStyledAttributes.getResourceId(e.c.b.c.l.v2, 0));
        this.f11569g = b.a(context, typedArrayObtainStyledAttributes.getResourceId(e.c.b.c.l.t2, 0));
        this.f11564b = b.a(context, typedArrayObtainStyledAttributes.getResourceId(e.c.b.c.l.u2, 0));
        this.f11565c = b.a(context, typedArrayObtainStyledAttributes.getResourceId(e.c.b.c.l.w2, 0));
        ColorStateList colorStateListA = e.c.b.c.z.c.a(context, typedArrayObtainStyledAttributes, e.c.b.c.l.x2);
        this.f11566d = b.a(context, typedArrayObtainStyledAttributes.getResourceId(e.c.b.c.l.z2, 0));
        this.f11567e = b.a(context, typedArrayObtainStyledAttributes.getResourceId(e.c.b.c.l.y2, 0));
        this.f11568f = b.a(context, typedArrayObtainStyledAttributes.getResourceId(e.c.b.c.l.A2, 0));
        Paint paint = new Paint();
        this.f11570h = paint;
        paint.setColor(colorStateListA.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}