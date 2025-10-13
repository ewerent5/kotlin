package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.p.d.w;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: ImageHeaderParserUtils.java */
/* loaded from: classes.dex */
public final class f {

    /* compiled from: ImageHeaderParserUtils.java */
    class a implements g {
        final /* synthetic */ InputStream a;

        a(InputStream inputStream) {
            this.a = inputStream;
        }

        @Override // com.bumptech.glide.load.f.g
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.b(this.a);
            } finally {
                this.a.reset();
            }
        }
    }

    /* compiled from: ImageHeaderParserUtils.java */
    class b implements g {
        final /* synthetic */ ByteBuffer a;

        b(ByteBuffer byteBuffer) {
            this.a = byteBuffer;
        }

        @Override // com.bumptech.glide.load.f.g
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
            return imageHeaderParser.a(this.a);
        }
    }

    /* compiled from: ImageHeaderParserUtils.java */
    class c implements g {
        final /* synthetic */ ParcelFileDescriptorRewinder a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.bumptech.glide.load.n.a0.b f3626b;

        c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, com.bumptech.glide.load.n.a0.b bVar) {
            this.a = parcelFileDescriptorRewinder;
            this.f3626b = bVar;
        }

        @Override // com.bumptech.glide.load.f.g
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws Throwable {
            w wVar;
            w wVar2 = null;
            try {
                wVar = new w(new FileInputStream(this.a.a().getFileDescriptor()), this.f3626b);
            } catch (Throwable th) {
                th = th;
            }
            try {
                ImageHeaderParser.ImageType imageTypeB = imageHeaderParser.b(wVar);
                try {
                    wVar.close();
                } catch (IOException unused) {
                }
                this.a.a();
                return imageTypeB;
            } catch (Throwable th2) {
                th = th2;
                wVar2 = wVar;
                if (wVar2 != null) {
                    try {
                        wVar2.close();
                    } catch (IOException unused2) {
                    }
                }
                this.a.a();
                throw th;
            }
        }
    }

    /* compiled from: ImageHeaderParserUtils.java */
    class d implements InterfaceC0078f {
        final /* synthetic */ InputStream a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.bumptech.glide.load.n.a0.b f3627b;

        d(InputStream inputStream, com.bumptech.glide.load.n.a0.b bVar) {
            this.a = inputStream;
            this.f3627b = bVar;
        }

        @Override // com.bumptech.glide.load.f.InterfaceC0078f
        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.c(this.a, this.f3627b);
            } finally {
                this.a.reset();
            }
        }
    }

    /* compiled from: ImageHeaderParserUtils.java */
    class e implements InterfaceC0078f {
        final /* synthetic */ ParcelFileDescriptorRewinder a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.bumptech.glide.load.n.a0.b f3628b;

        e(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, com.bumptech.glide.load.n.a0.b bVar) {
            this.a = parcelFileDescriptorRewinder;
            this.f3628b = bVar;
        }

        @Override // com.bumptech.glide.load.f.InterfaceC0078f
        public int a(ImageHeaderParser imageHeaderParser) throws Throwable {
            w wVar;
            w wVar2 = null;
            try {
                wVar = new w(new FileInputStream(this.a.a().getFileDescriptor()), this.f3628b);
            } catch (Throwable th) {
                th = th;
            }
            try {
                int iC = imageHeaderParser.c(wVar, this.f3628b);
                try {
                    wVar.close();
                } catch (IOException unused) {
                }
                this.a.a();
                return iC;
            } catch (Throwable th2) {
                th = th2;
                wVar2 = wVar;
                if (wVar2 != null) {
                    try {
                        wVar2.close();
                    } catch (IOException unused2) {
                    }
                }
                this.a.a();
                throw th;
            }
        }
    }

    /* compiled from: ImageHeaderParserUtils.java */
    /* renamed from: com.bumptech.glide.load.f$f, reason: collision with other inner class name */
    private interface InterfaceC0078f {
        int a(ImageHeaderParser imageHeaderParser);
    }

    /* compiled from: ImageHeaderParserUtils.java */
    private interface g {
        ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser);
    }

    public static int a(List<ImageHeaderParser> list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, com.bumptech.glide.load.n.a0.b bVar) {
        return c(list, new e(parcelFileDescriptorRewinder, bVar));
    }

    public static int b(List<ImageHeaderParser> list, InputStream inputStream, com.bumptech.glide.load.n.a0.b bVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new w(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return c(list, new d(inputStream, bVar));
    }

    private static int c(List<ImageHeaderParser> list, InterfaceC0078f interfaceC0078f) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            int iA = interfaceC0078f.a(list.get(i2));
            if (iA != -1) {
                return iA;
            }
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType d(List<ImageHeaderParser> list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, com.bumptech.glide.load.n.a0.b bVar) {
        return g(list, new c(parcelFileDescriptorRewinder, bVar));
    }

    public static ImageHeaderParser.ImageType e(List<ImageHeaderParser> list, InputStream inputStream, com.bumptech.glide.load.n.a0.b bVar) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new w(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return g(list, new a(inputStream));
    }

    public static ImageHeaderParser.ImageType f(List<ImageHeaderParser> list, ByteBuffer byteBuffer) {
        return byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : g(list, new b(byteBuffer));
    }

    private static ImageHeaderParser.ImageType g(List<ImageHeaderParser> list, g gVar) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ImageHeaderParser.ImageType imageTypeA = gVar.a(list.get(i2));
            if (imageTypeA != ImageHeaderParser.ImageType.UNKNOWN) {
                return imageTypeA;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}