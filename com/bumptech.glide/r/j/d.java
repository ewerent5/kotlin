package com.bumptech.glide.r.j;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: DrawableImageViewTarget.java */
/* loaded from: classes.dex */
public class d extends e<Drawable> {
    public d(ImageView imageView) {
        super(imageView);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.r.j.e
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void q(Drawable drawable) {
        ((ImageView) this.f4221g).setImageDrawable(drawable);
    }
}