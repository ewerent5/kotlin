package com.bumptech.glide.load.p;

import android.annotation.SuppressLint;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import com.bumptech.glide.load.h;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.k;
import com.bumptech.glide.load.n.v;
import com.bumptech.glide.load.p.d.l;
import com.bumptech.glide.load.p.d.m;
import com.bumptech.glide.load.p.d.r;

/* compiled from: ImageDecoderResourceDecoder.java */
/* loaded from: classes.dex */
public abstract class a<T> implements k<ImageDecoder.Source, T> {
    final r a = r.b();

    /* compiled from: ImageDecoderResourceDecoder.java */
    /* renamed from: com.bumptech.glide.load.p.a$a, reason: collision with other inner class name */
    class C0094a implements ImageDecoder.OnHeaderDecodedListener {
        final /* synthetic */ int a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f3944b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f3945c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.bumptech.glide.load.b f3946d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ l f3947e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ j f3948f;

        /* compiled from: ImageDecoderResourceDecoder.java */
        /* renamed from: com.bumptech.glide.load.p.a$a$a, reason: collision with other inner class name */
        class C0095a implements ImageDecoder.OnPartialImageListener {
            C0095a() {
            }

            @Override // android.graphics.ImageDecoder.OnPartialImageListener
            public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
                return false;
            }
        }

        C0094a(int i2, int i3, boolean z, com.bumptech.glide.load.b bVar, l lVar, j jVar) {
            this.a = i2;
            this.f3944b = i3;
            this.f3945c = z;
            this.f3946d = bVar;
            this.f3947e = lVar;
            this.f3948f = jVar;
        }

        @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
        @SuppressLint({"Override"})
        public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            boolean z = false;
            if (a.this.a.e(this.a, this.f3944b, this.f3945c, false)) {
                imageDecoder.setAllocator(3);
            } else {
                imageDecoder.setAllocator(1);
            }
            if (this.f3946d == com.bumptech.glide.load.b.PREFER_RGB_565) {
                imageDecoder.setMemorySizePolicy(0);
            }
            imageDecoder.setOnPartialImageListener(new C0095a());
            Size size = imageInfo.getSize();
            int width = this.a;
            if (width == Integer.MIN_VALUE) {
                width = size.getWidth();
            }
            int height = this.f3944b;
            if (height == Integer.MIN_VALUE) {
                height = size.getHeight();
            }
            float fB = this.f3947e.b(size.getWidth(), size.getHeight(), width, height);
            int iRound = Math.round(size.getWidth() * fB);
            int iRound2 = Math.round(size.getHeight() * fB);
            if (Log.isLoggable("ImageDecoder", 2)) {
                Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + iRound + "x" + iRound2 + "] scaleFactor: " + fB);
            }
            imageDecoder.setTargetSize(iRound, iRound2);
            int i2 = Build.VERSION.SDK_INT;
            if (i2 < 28) {
                if (i2 >= 26) {
                    imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
                }
            } else {
                if (this.f3948f == j.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                    z = true;
                }
                imageDecoder.setTargetColorSpace(ColorSpace.get(z ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            }
        }
    }

    protected abstract v<T> c(ImageDecoder.Source source, int i2, int i3, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener);

    @Override // com.bumptech.glide.load.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final v<T> b(ImageDecoder.Source source, int i2, int i3, i iVar) {
        com.bumptech.glide.load.b bVar = (com.bumptech.glide.load.b) iVar.c(m.a);
        l lVar = (l) iVar.c(l.f3976h);
        h<Boolean> hVar = m.f3984e;
        return c(source, i2, i3, new C0094a(i2, i3, iVar.c(hVar) != null && ((Boolean) iVar.c(hVar)).booleanValue(), bVar, lVar, (j) iVar.c(m.f3981b)));
    }

    @Override // com.bumptech.glide.load.k
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final boolean a(ImageDecoder.Source source, i iVar) {
        return true;
    }
}