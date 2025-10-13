package com.bumptech.glide.load.p.d;

import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.h;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: VideoDecoder.java */
/* loaded from: classes.dex */
public class b0<T> implements com.bumptech.glide.load.k<T, Bitmap> {
    public static final com.bumptech.glide.load.h<Long> a = com.bumptech.glide.load.h.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* renamed from: b, reason: collision with root package name */
    public static final com.bumptech.glide.load.h<Integer> f3955b = com.bumptech.glide.load.h.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* renamed from: c, reason: collision with root package name */
    private static final e f3956c = new e();

    /* renamed from: d, reason: collision with root package name */
    private final f<T> f3957d;

    /* renamed from: e, reason: collision with root package name */
    private final com.bumptech.glide.load.n.a0.e f3958e;

    /* renamed from: f, reason: collision with root package name */
    private final e f3959f;

    /* compiled from: VideoDecoder.java */
    class a implements h.b<Long> {
        private final ByteBuffer a = ByteBuffer.allocate(8);

        a() {
        }

        @Override // com.bumptech.glide.load.h.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(byte[] bArr, Long l2, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.a) {
                this.a.position(0);
                messageDigest.update(this.a.putLong(l2.longValue()).array());
            }
        }
    }

    /* compiled from: VideoDecoder.java */
    class b implements h.b<Integer> {
        private final ByteBuffer a = ByteBuffer.allocate(4);

        b() {
        }

        @Override // com.bumptech.glide.load.h.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.a) {
                this.a.position(0);
                messageDigest.update(this.a.putInt(num.intValue()).array());
            }
        }
    }

    /* compiled from: VideoDecoder.java */
    private static final class c implements f<AssetFileDescriptor> {
        private c() {
        }

        @Override // com.bumptech.glide.load.p.d.b0.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) throws IllegalArgumentException {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    /* compiled from: VideoDecoder.java */
    static final class d implements f<ByteBuffer> {

        /* compiled from: VideoDecoder.java */
        class a extends MediaDataSource {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ByteBuffer f3960e;

            a(ByteBuffer byteBuffer) {
                this.f3960e = byteBuffer;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
                return this.f3960e.limit();
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j2, byte[] bArr, int i2, int i3) {
                if (j2 >= this.f3960e.limit()) {
                    return -1;
                }
                this.f3960e.position((int) j2);
                int iMin = Math.min(i3, this.f3960e.remaining());
                this.f3960e.get(bArr, i2, iMin);
                return iMin;
            }
        }

        d() {
        }

        @Override // com.bumptech.glide.load.p.d.b0.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) throws IllegalArgumentException {
            mediaMetadataRetriever.setDataSource(new a(byteBuffer));
        }
    }

    /* compiled from: VideoDecoder.java */
    static class e {
        e() {
        }

        public MediaMetadataRetriever a() {
            return new MediaMetadataRetriever();
        }
    }

    /* compiled from: VideoDecoder.java */
    interface f<T> {
        void a(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    /* compiled from: VideoDecoder.java */
    static final class g implements f<ParcelFileDescriptor> {
        g() {
        }

        @Override // com.bumptech.glide.load.p.d.b0.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) throws IllegalArgumentException {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    /* compiled from: VideoDecoder.java */
    private static final class h extends RuntimeException {
        h() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    b0(com.bumptech.glide.load.n.a0.e eVar, f<T> fVar) {
        this(eVar, fVar, f3956c);
    }

    public static com.bumptech.glide.load.k<AssetFileDescriptor, Bitmap> c(com.bumptech.glide.load.n.a0.e eVar) {
        return new b0(eVar, new c(null));
    }

    public static com.bumptech.glide.load.k<ByteBuffer, Bitmap> d(com.bumptech.glide.load.n.a0.e eVar) {
        return new b0(eVar, new d());
    }

    private static Bitmap e(MediaMetadataRetriever mediaMetadataRetriever, long j2, int i2, int i3, int i4, l lVar) {
        Bitmap bitmapG = (Build.VERSION.SDK_INT < 27 || i3 == Integer.MIN_VALUE || i4 == Integer.MIN_VALUE || lVar == l.f3974f) ? null : g(mediaMetadataRetriever, j2, i2, i3, i4, lVar);
        if (bitmapG == null) {
            bitmapG = f(mediaMetadataRetriever, j2, i2);
        }
        if (bitmapG != null) {
            return bitmapG;
        }
        throw new h();
    }

    private static Bitmap f(MediaMetadataRetriever mediaMetadataRetriever, long j2, int i2) {
        return mediaMetadataRetriever.getFrameAtTime(j2, i2);
    }

    @TargetApi(27)
    private static Bitmap g(MediaMetadataRetriever mediaMetadataRetriever, long j2, int i2, int i3, int i4, l lVar) {
        try {
            int i5 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int i6 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int i7 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (i7 == 90 || i7 == 270) {
                i6 = i5;
                i5 = i6;
            }
            float fB = lVar.b(i5, i6, i3, i4);
            return mediaMetadataRetriever.getScaledFrameAtTime(j2, i2, Math.round(i5 * fB), Math.round(fB * i6));
        } catch (Throwable th) {
            if (!Log.isLoggable("VideoDecoder", 3)) {
                return null;
            }
            Log.d("VideoDecoder", "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", th);
            return null;
        }
    }

    public static com.bumptech.glide.load.k<ParcelFileDescriptor, Bitmap> h(com.bumptech.glide.load.n.a0.e eVar) {
        return new b0(eVar, new g());
    }

    @Override // com.bumptech.glide.load.k
    public boolean a(T t, com.bumptech.glide.load.i iVar) {
        return true;
    }

    @Override // com.bumptech.glide.load.k
    public com.bumptech.glide.load.n.v<Bitmap> b(T t, int i2, int i3, com.bumptech.glide.load.i iVar) throws IOException {
        long jLongValue = ((Long) iVar.c(a)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + jLongValue);
        }
        Integer num = (Integer) iVar.c(f3955b);
        if (num == null) {
            num = 2;
        }
        l lVar = (l) iVar.c(l.f3976h);
        if (lVar == null) {
            lVar = l.f3975g;
        }
        l lVar2 = lVar;
        MediaMetadataRetriever mediaMetadataRetrieverA = this.f3959f.a();
        try {
            this.f3957d.a(mediaMetadataRetrieverA, t);
            Bitmap bitmapE = e(mediaMetadataRetrieverA, jLongValue, num.intValue(), i2, i3, lVar2);
            mediaMetadataRetrieverA.release();
            return com.bumptech.glide.load.p.d.e.f(bitmapE, this.f3958e);
        } catch (Throwable th) {
            mediaMetadataRetrieverA.release();
            throw th;
        }
    }

    b0(com.bumptech.glide.load.n.a0.e eVar, f<T> fVar, e eVar2) {
        this.f3958e = eVar;
        this.f3957d = fVar;
        this.f3959f = eVar2;
    }
}