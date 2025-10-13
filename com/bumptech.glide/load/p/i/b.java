package com.bumptech.glide.load.p.i;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.n.v;
import com.bumptech.glide.load.p.d.u;
import com.bumptech.glide.t.j;

/* compiled from: BitmapDrawableTranscoder.java */
/* loaded from: classes.dex */
public class b implements e<Bitmap, BitmapDrawable> {
    private final Resources a;

    public b(Resources resources) {
        this.a = (Resources) j.d(resources);
    }

    @Override // com.bumptech.glide.load.p.i.e
    public v<BitmapDrawable> a(v<Bitmap> vVar, i iVar) {
        return u.f(this.a, vVar);
    }
}