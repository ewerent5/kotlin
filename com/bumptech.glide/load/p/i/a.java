package com.bumptech.glide.load.p.i;

import android.graphics.Bitmap;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.n.v;
import java.io.ByteArrayOutputStream;

/* compiled from: BitmapBytesTranscoder.java */
/* loaded from: classes.dex */
public class a implements e<Bitmap, byte[]> {
    private final Bitmap.CompressFormat a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4064b;

    public a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // com.bumptech.glide.load.p.i.e
    public v<byte[]> a(v<Bitmap> vVar, i iVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        vVar.get().compress(this.a, this.f4064b, byteArrayOutputStream);
        vVar.b();
        return new com.bumptech.glide.load.p.e.b(byteArrayOutputStream.toByteArray());
    }

    public a(Bitmap.CompressFormat compressFormat, int i2) {
        this.a = compressFormat;
        this.f4064b = i2;
    }
}