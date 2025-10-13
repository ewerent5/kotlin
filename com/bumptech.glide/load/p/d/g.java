package com.bumptech.glide.load.p.d;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferBitmapDecoder.java */
/* loaded from: classes.dex */
public class g implements com.bumptech.glide.load.k<ByteBuffer, Bitmap> {
    private final m a;

    public g(m mVar) {
        this.a = mVar;
    }

    @Override // com.bumptech.glide.load.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.n.v<Bitmap> b(ByteBuffer byteBuffer, int i2, int i3, com.bumptech.glide.load.i iVar) {
        return this.a.f(com.bumptech.glide.t.a.f(byteBuffer), i2, i3, iVar);
    }

    @Override // com.bumptech.glide.load.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(ByteBuffer byteBuffer, com.bumptech.glide.load.i iVar) {
        return this.a.q(byteBuffer);
    }
}