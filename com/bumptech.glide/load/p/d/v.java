package com.bumptech.glide.load.p.d;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;

/* compiled from: ParcelFileDescriptorBitmapDecoder.java */
/* loaded from: classes.dex */
public final class v implements com.bumptech.glide.load.k<ParcelFileDescriptor, Bitmap> {
    private final m a;

    public v(m mVar) {
        this.a = mVar;
    }

    @Override // com.bumptech.glide.load.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.n.v<Bitmap> b(ParcelFileDescriptor parcelFileDescriptor, int i2, int i3, com.bumptech.glide.load.i iVar) {
        return this.a.d(parcelFileDescriptor, i2, i3, iVar);
    }

    @Override // com.bumptech.glide.load.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(ParcelFileDescriptor parcelFileDescriptor, com.bumptech.glide.load.i iVar) {
        return this.a.o(parcelFileDescriptor);
    }
}