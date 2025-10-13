package com.bumptech.glide.load.p.d;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: BitmapTransformation.java */
/* loaded from: classes.dex */
public abstract class f implements com.bumptech.glide.load.m<Bitmap> {
    @Override // com.bumptech.glide.load.m
    public final com.bumptech.glide.load.n.v<Bitmap> b(Context context, com.bumptech.glide.load.n.v<Bitmap> vVar, int i2, int i3) {
        if (!com.bumptech.glide.t.k.s(i2, i3)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i2 + " or height: " + i3 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        com.bumptech.glide.load.n.a0.e eVarF = com.bumptech.glide.b.c(context).f();
        Bitmap bitmap = vVar.get();
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getWidth();
        }
        if (i3 == Integer.MIN_VALUE) {
            i3 = bitmap.getHeight();
        }
        Bitmap bitmapC = c(eVarF, bitmap, i2, i3);
        return bitmap.equals(bitmapC) ? vVar : e.f(bitmapC, eVarF);
    }

    protected abstract Bitmap c(com.bumptech.glide.load.n.a0.e eVar, Bitmap bitmap, int i2, int i3);
}