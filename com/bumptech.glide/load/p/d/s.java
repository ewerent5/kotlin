package com.bumptech.glide.load.p.d;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.InputStream;
import java.util.List;

/* compiled from: ImageReader.java */
/* loaded from: classes.dex */
interface s {

    /* compiled from: ImageReader.java */
    public static final class a implements s {
        private final com.bumptech.glide.load.data.k a;

        /* renamed from: b, reason: collision with root package name */
        private final com.bumptech.glide.load.n.a0.b f4006b;

        /* renamed from: c, reason: collision with root package name */
        private final List<ImageHeaderParser> f4007c;

        a(InputStream inputStream, List<ImageHeaderParser> list, com.bumptech.glide.load.n.a0.b bVar) {
            this.f4006b = (com.bumptech.glide.load.n.a0.b) com.bumptech.glide.t.j.d(bVar);
            this.f4007c = (List) com.bumptech.glide.t.j.d(list);
            this.a = new com.bumptech.glide.load.data.k(inputStream, bVar);
        }

        @Override // com.bumptech.glide.load.p.d.s
        public int a() {
            return com.bumptech.glide.load.f.b(this.f4007c, this.a.a(), this.f4006b);
        }

        @Override // com.bumptech.glide.load.p.d.s
        public Bitmap b(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(this.a.a(), null, options);
        }

        @Override // com.bumptech.glide.load.p.d.s
        public void c() {
            this.a.c();
        }

        @Override // com.bumptech.glide.load.p.d.s
        public ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.f.e(this.f4007c, this.a.a(), this.f4006b);
        }
    }

    /* compiled from: ImageReader.java */
    public static final class b implements s {
        private final com.bumptech.glide.load.n.a0.b a;

        /* renamed from: b, reason: collision with root package name */
        private final List<ImageHeaderParser> f4008b;

        /* renamed from: c, reason: collision with root package name */
        private final ParcelFileDescriptorRewinder f4009c;

        b(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, com.bumptech.glide.load.n.a0.b bVar) {
            this.a = (com.bumptech.glide.load.n.a0.b) com.bumptech.glide.t.j.d(bVar);
            this.f4008b = (List) com.bumptech.glide.t.j.d(list);
            this.f4009c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // com.bumptech.glide.load.p.d.s
        public int a() {
            return com.bumptech.glide.load.f.a(this.f4008b, this.f4009c, this.a);
        }

        @Override // com.bumptech.glide.load.p.d.s
        public Bitmap b(BitmapFactory.Options options) {
            return BitmapFactory.decodeFileDescriptor(this.f4009c.a().getFileDescriptor(), null, options);
        }

        @Override // com.bumptech.glide.load.p.d.s
        public void c() {
        }

        @Override // com.bumptech.glide.load.p.d.s
        public ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.f.d(this.f4008b, this.f4009c, this.a);
        }
    }

    int a();

    Bitmap b(BitmapFactory.Options options);

    void c();

    ImageHeaderParser.ImageType d();
}