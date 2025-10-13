package com.bumptech.glide.r.j;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* compiled from: BitmapImageViewTarget.java */
/* loaded from: classes.dex */
public class b extends e<Bitmap> {
    public b(ImageView imageView) {
        super(imageView);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.r.j.e
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void q(Bitmap bitmap) {
        ((ImageView) this.f4221g).setImageBitmap(bitmap);
    }
}