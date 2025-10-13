package com.bumptech.glide.load.p.h;

import android.graphics.Bitmap;
import com.bumptech.glide.load.k;
import com.bumptech.glide.load.n.v;

/* compiled from: GifFrameResourceDecoder.java */
/* loaded from: classes.dex */
public final class h implements k<com.bumptech.glide.n.a, Bitmap> {
    private final com.bumptech.glide.load.n.a0.e a;

    public h(com.bumptech.glide.load.n.a0.e eVar) {
        this.a = eVar;
    }

    @Override // com.bumptech.glide.load.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public v<Bitmap> b(com.bumptech.glide.n.a aVar, int i2, int i3, com.bumptech.glide.load.i iVar) {
        return com.bumptech.glide.load.p.d.e.f(aVar.a(), this.a);
    }

    @Override // com.bumptech.glide.load.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(com.bumptech.glide.n.a aVar, com.bumptech.glide.load.i iVar) {
        return true;
    }
}