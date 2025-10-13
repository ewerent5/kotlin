package com.bumptech.glide.load.p.d;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* compiled from: BitmapDrawableDecoder.java */
/* loaded from: classes.dex */
public class a<DataType> implements com.bumptech.glide.load.k<DataType, BitmapDrawable> {
    private final com.bumptech.glide.load.k<DataType, Bitmap> a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources f3952b;

    public a(Resources resources, com.bumptech.glide.load.k<DataType, Bitmap> kVar) {
        this.f3952b = (Resources) com.bumptech.glide.t.j.d(resources);
        this.a = (com.bumptech.glide.load.k) com.bumptech.glide.t.j.d(kVar);
    }

    @Override // com.bumptech.glide.load.k
    public boolean a(DataType datatype, com.bumptech.glide.load.i iVar) {
        return this.a.a(datatype, iVar);
    }

    @Override // com.bumptech.glide.load.k
    public com.bumptech.glide.load.n.v<BitmapDrawable> b(DataType datatype, int i2, int i3, com.bumptech.glide.load.i iVar) {
        return u.f(this.f3952b, this.a.b(datatype, i2, i3, iVar));
    }
}