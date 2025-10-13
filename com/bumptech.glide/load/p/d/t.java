package com.bumptech.glide.load.p.d;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.InputStream;

/* compiled from: InputStreamBitmapImageDecoderResourceDecoder.java */
/* loaded from: classes.dex */
public final class t implements com.bumptech.glide.load.k<InputStream, Bitmap> {
    private final d a = new d();

    @Override // com.bumptech.glide.load.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.n.v<Bitmap> b(InputStream inputStream, int i2, int i3, com.bumptech.glide.load.i iVar) {
        return this.a.b(ImageDecoder.createSource(com.bumptech.glide.t.a.b(inputStream)), i2, i3, iVar);
    }

    @Override // com.bumptech.glide.load.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(InputStream inputStream, com.bumptech.glide.load.i iVar) {
        return true;
    }
}