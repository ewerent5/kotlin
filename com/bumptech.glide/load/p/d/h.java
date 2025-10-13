package com.bumptech.glide.load.p.d;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferBitmapImageDecoderResourceDecoder.java */
/* loaded from: classes.dex */
public final class h implements com.bumptech.glide.load.k<ByteBuffer, Bitmap> {
    private final d a = new d();

    @Override // com.bumptech.glide.load.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.n.v<Bitmap> b(ByteBuffer byteBuffer, int i2, int i3, com.bumptech.glide.load.i iVar) {
        return this.a.b(ImageDecoder.createSource(byteBuffer), i2, i3, iVar);
    }

    @Override // com.bumptech.glide.load.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(ByteBuffer byteBuffer, com.bumptech.glide.load.i iVar) {
        return true;
    }
}