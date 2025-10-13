package com.bumptech.glide.load.p.d;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;

/* compiled from: BitmapImageDecoderResourceDecoder.java */
/* loaded from: classes.dex */
public final class d extends com.bumptech.glide.load.p.a<Bitmap> {

    /* renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.n.a0.e f3964b = new com.bumptech.glide.load.n.a0.f();

    @Override // com.bumptech.glide.load.p.a
    protected com.bumptech.glide.load.n.v<Bitmap> c(ImageDecoder.Source source, int i2, int i3, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, onHeaderDecodedListener);
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i2 + "x" + i3 + "]");
        }
        return new e(bitmapDecodeBitmap, this.f3964b);
    }
}