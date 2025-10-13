package com.bumptech.glide.load.p.d;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.p.d.l;
import com.bumptech.glide.load.p.d.s;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* compiled from: Downsampler.java */
/* loaded from: classes.dex */
public final class m {
    public static final com.bumptech.glide.load.h<com.bumptech.glide.load.b> a = com.bumptech.glide.load.h.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", com.bumptech.glide.load.b.f3585g);

    /* renamed from: b, reason: collision with root package name */
    public static final com.bumptech.glide.load.h<com.bumptech.glide.load.j> f3981b = com.bumptech.glide.load.h.f("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", com.bumptech.glide.load.j.SRGB);

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final com.bumptech.glide.load.h<l> f3982c = l.f3976h;

    /* renamed from: d, reason: collision with root package name */
    public static final com.bumptech.glide.load.h<Boolean> f3983d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.bumptech.glide.load.h<Boolean> f3984e;

    /* renamed from: f, reason: collision with root package name */
    private static final Set<String> f3985f;

    /* renamed from: g, reason: collision with root package name */
    private static final b f3986g;

    /* renamed from: h, reason: collision with root package name */
    private static final Set<ImageHeaderParser.ImageType> f3987h;

    /* renamed from: i, reason: collision with root package name */
    private static final Queue<BitmapFactory.Options> f3988i;

    /* renamed from: j, reason: collision with root package name */
    private final com.bumptech.glide.load.n.a0.e f3989j;

    /* renamed from: k, reason: collision with root package name */
    private final DisplayMetrics f3990k;

    /* renamed from: l, reason: collision with root package name */
    private final com.bumptech.glide.load.n.a0.b f3991l;

    /* renamed from: m, reason: collision with root package name */
    private final List<ImageHeaderParser> f3992m;
    private final r n = r.b();

    /* compiled from: Downsampler.java */
    class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.load.p.d.m.b
        public void a(com.bumptech.glide.load.n.a0.e eVar, Bitmap bitmap) {
        }

        @Override // com.bumptech.glide.load.p.d.m.b
        public void b() {
        }
    }

    /* compiled from: Downsampler.java */
    public interface b {
        void a(com.bumptech.glide.load.n.a0.e eVar, Bitmap bitmap);

        void b();
    }

    static {
        Boolean bool = Boolean.FALSE;
        f3983d = com.bumptech.glide.load.h.f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f3984e = com.bumptech.glide.load.h.f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f3985f = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f3986g = new a();
        f3987h = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        f3988i = com.bumptech.glide.t.k.e(0);
    }

    public m(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, com.bumptech.glide.load.n.a0.e eVar, com.bumptech.glide.load.n.a0.b bVar) {
        this.f3992m = list;
        this.f3990k = (DisplayMetrics) com.bumptech.glide.t.j.d(displayMetrics);
        this.f3989j = (com.bumptech.glide.load.n.a0.e) com.bumptech.glide.t.j.d(eVar);
        this.f3991l = (com.bumptech.glide.load.n.a0.b) com.bumptech.glide.t.j.d(bVar);
    }

    private static int a(double d2) {
        return x((d2 / (r1 / r0)) * x(l(d2) * d2));
    }

    private void b(s sVar, com.bumptech.glide.load.b bVar, boolean z, boolean z2, BitmapFactory.Options options, int i2, int i3) {
        if (this.n.i(i2, i3, options, z, z2)) {
            return;
        }
        if (bVar == com.bumptech.glide.load.b.PREFER_ARGB_8888 || Build.VERSION.SDK_INT == 16) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            return;
        }
        boolean zHasAlpha = false;
        try {
            zHasAlpha = sVar.d().hasAlpha();
        } catch (IOException e2) {
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + bVar, e2);
            }
        }
        Bitmap.Config config = zHasAlpha ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        options.inPreferredConfig = config;
        if (config == Bitmap.Config.RGB_565) {
            options.inDither = true;
        }
    }

    private static void c(ImageHeaderParser.ImageType imageType, s sVar, b bVar, com.bumptech.glide.load.n.a0.e eVar, l lVar, int i2, int i3, int i4, int i5, int i6, BitmapFactory.Options options) {
        int i7;
        int i8;
        int i9;
        int iFloor;
        double dFloor;
        int iRound;
        if (i3 <= 0 || i4 <= 0) {
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Unable to determine dimensions for: " + imageType + " with target [" + i5 + "x" + i6 + "]");
                return;
            }
            return;
        }
        if (r(i2)) {
            i8 = i3;
            i7 = i4;
        } else {
            i7 = i3;
            i8 = i4;
        }
        float fB = lVar.b(i7, i8, i5, i6);
        if (fB <= 0.0f) {
            throw new IllegalArgumentException("Cannot scale with factor: " + fB + " from: " + lVar + ", source: [" + i3 + "x" + i4 + "], target: [" + i5 + "x" + i6 + "]");
        }
        l.g gVarA = lVar.a(i7, i8, i5, i6);
        if (gVarA == null) {
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        float f2 = i7;
        float f3 = i8;
        int iX = i7 / x(fB * f2);
        int iX2 = i8 / x(fB * f3);
        l.g gVar = l.g.MEMORY;
        int iMax = gVarA == gVar ? Math.max(iX, iX2) : Math.min(iX, iX2);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 23 || !f3985f.contains(options.outMimeType)) {
            int iMax2 = Math.max(1, Integer.highestOneBit(iMax));
            if (gVarA == gVar && iMax2 < 1.0f / fB) {
                iMax2 <<= 1;
            }
            i9 = iMax2;
        } else {
            i9 = 1;
        }
        options.inSampleSize = i9;
        if (imageType == ImageHeaderParser.ImageType.JPEG) {
            float fMin = Math.min(i9, 8);
            iFloor = (int) Math.ceil(f2 / fMin);
            iRound = (int) Math.ceil(f3 / fMin);
            int i11 = i9 / 8;
            if (i11 > 0) {
                iFloor /= i11;
                iRound /= i11;
            }
        } else {
            if (imageType == ImageHeaderParser.ImageType.PNG || imageType == ImageHeaderParser.ImageType.PNG_A) {
                float f4 = i9;
                iFloor = (int) Math.floor(f2 / f4);
                dFloor = Math.floor(f3 / f4);
            } else if (imageType == ImageHeaderParser.ImageType.WEBP || imageType == ImageHeaderParser.ImageType.WEBP_A) {
                if (i10 >= 24) {
                    float f5 = i9;
                    iFloor = Math.round(f2 / f5);
                    iRound = Math.round(f3 / f5);
                } else {
                    float f6 = i9;
                    iFloor = (int) Math.floor(f2 / f6);
                    dFloor = Math.floor(f3 / f6);
                }
            } else if (i7 % i9 == 0 && i8 % i9 == 0) {
                iFloor = i7 / i9;
                iRound = i8 / i9;
            } else {
                int[] iArrM = m(sVar, options, bVar, eVar);
                iFloor = iArrM[0];
                iRound = iArrM[1];
            }
            iRound = (int) dFloor;
        }
        double dB = lVar.b(iFloor, iRound, i5, i6);
        if (i10 >= 19) {
            options.inTargetDensity = a(dB);
            options.inDensity = l(dB);
        }
        if (s(options)) {
            options.inScaled = true;
        } else {
            options.inTargetDensity = 0;
            options.inDensity = 0;
        }
        if (Log.isLoggable("Downsampler", 2)) {
            Log.v("Downsampler", "Calculate scaling, source: [" + i3 + "x" + i4 + "], degreesToRotate: " + i2 + ", target: [" + i5 + "x" + i6 + "], power of two scaled: [" + iFloor + "x" + iRound + "], exact scale factor: " + fB + ", power of 2 sample size: " + i9 + ", adjusted scale factor: " + dB + ", target density: " + options.inTargetDensity + ", density: " + options.inDensity);
        }
    }

    private com.bumptech.glide.load.n.v<Bitmap> e(s sVar, int i2, int i3, com.bumptech.glide.load.i iVar, b bVar) {
        byte[] bArr = (byte[]) this.f3991l.e(65536, byte[].class);
        BitmapFactory.Options optionsK = k();
        optionsK.inTempStorage = bArr;
        com.bumptech.glide.load.b bVar2 = (com.bumptech.glide.load.b) iVar.c(a);
        com.bumptech.glide.load.j jVar = (com.bumptech.glide.load.j) iVar.c(f3981b);
        l lVar = (l) iVar.c(l.f3976h);
        boolean zBooleanValue = ((Boolean) iVar.c(f3983d)).booleanValue();
        com.bumptech.glide.load.h<Boolean> hVar = f3984e;
        try {
            return e.f(h(sVar, optionsK, lVar, bVar2, jVar, iVar.c(hVar) != null && ((Boolean) iVar.c(hVar)).booleanValue(), i2, i3, zBooleanValue, bVar), this.f3989j);
        } finally {
            v(optionsK);
            this.f3991l.d(bArr);
        }
    }

    private Bitmap h(s sVar, BitmapFactory.Options options, l lVar, com.bumptech.glide.load.b bVar, com.bumptech.glide.load.j jVar, boolean z, int i2, int i3, boolean z2, b bVar2) {
        int i4;
        int i5;
        m mVar;
        int iRound;
        int iRound2;
        int i6;
        ColorSpace colorSpace;
        long jB = com.bumptech.glide.t.f.b();
        int[] iArrM = m(sVar, options, bVar2, this.f3989j);
        boolean z3 = false;
        int i7 = iArrM[0];
        int i8 = iArrM[1];
        String str = options.outMimeType;
        boolean z4 = (i7 == -1 || i8 == -1) ? false : z;
        int iA = sVar.a();
        int iG = z.g(iA);
        boolean zJ = z.j(iA);
        if (i2 == Integer.MIN_VALUE) {
            i4 = i3;
            i5 = r(iG) ? i8 : i7;
        } else {
            i4 = i3;
            i5 = i2;
        }
        int i9 = i4 == Integer.MIN_VALUE ? r(iG) ? i7 : i8 : i4;
        ImageHeaderParser.ImageType imageTypeD = sVar.d();
        c(imageTypeD, sVar, bVar2, this.f3989j, lVar, iG, i7, i8, i5, i9, options);
        b(sVar, bVar, z4, zJ, options, i5, i9);
        int i10 = Build.VERSION.SDK_INT;
        boolean z5 = i10 >= 19;
        if (options.inSampleSize == 1 || z5) {
            mVar = this;
            if (mVar.z(imageTypeD)) {
                if (i7 < 0 || i8 < 0 || !z2 || !z5) {
                    float f2 = s(options) ? options.inTargetDensity / options.inDensity : 1.0f;
                    int i11 = options.inSampleSize;
                    float f3 = i11;
                    float f4 = f2;
                    int iCeil = (int) Math.ceil(i7 / f3);
                    int iCeil2 = (int) Math.ceil(i8 / f3);
                    iRound = Math.round(iCeil * f4);
                    iRound2 = Math.round(iCeil2 * f4);
                    if (Log.isLoggable("Downsampler", 2)) {
                        Log.v("Downsampler", "Calculated target [" + iRound + "x" + iRound2 + "] for source [" + i7 + "x" + i8 + "], sampleSize: " + i11 + ", targetDensity: " + options.inTargetDensity + ", density: " + options.inDensity + ", density multiplier: " + f4);
                    }
                } else {
                    iRound = i5;
                    iRound2 = i9;
                }
                if (iRound > 0 && iRound2 > 0) {
                    y(options, mVar.f3989j, iRound, iRound2);
                }
            }
        } else {
            mVar = this;
        }
        if (i10 >= 28) {
            if (jVar == com.bumptech.glide.load.j.DISPLAY_P3 && (colorSpace = options.outColorSpace) != null && colorSpace.isWideGamut()) {
                z3 = true;
            }
            options.inPreferredColorSpace = ColorSpace.get(z3 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
        } else if (i10 >= 26) {
            options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        Bitmap bitmapI = i(sVar, options, bVar2, mVar.f3989j);
        bVar2.a(mVar.f3989j, bitmapI);
        if (Log.isLoggable("Downsampler", 2)) {
            i6 = iA;
            t(i7, i8, str, options, bitmapI, i2, i3, jB);
        } else {
            i6 = iA;
        }
        Bitmap bitmapK = null;
        if (bitmapI != null) {
            bitmapI.setDensity(mVar.f3990k.densityDpi);
            bitmapK = z.k(mVar.f3989j, bitmapI, i6);
            if (!bitmapI.equals(bitmapK)) {
                mVar.f3989j.c(bitmapI);
            }
        }
        return bitmapK;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        throw r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Bitmap i(com.bumptech.glide.load.p.d.s r5, android.graphics.BitmapFactory.Options r6, com.bumptech.glide.load.p.d.m.b r7, com.bumptech.glide.load.n.a0.e r8) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto Lc
            r7.b()
            r5.c()
        Lc:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = com.bumptech.glide.load.p.d.z.f()
            r4.lock()
            android.graphics.Bitmap r5 = r5.b(r6)     // Catch: java.lang.Throwable -> L25 java.lang.IllegalArgumentException -> L27
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.p.d.z.f()
            r6.unlock()
            return r5
        L25:
            r5 = move-exception
            goto L50
        L27:
            r4 = move-exception
            java.io.IOException r1 = u(r4, r1, r2, r3, r6)     // Catch: java.lang.Throwable -> L25
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L38
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch: java.lang.Throwable -> L25
        L38:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L4f
            r8.c(r0)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4e
            r0 = 0
            r6.inBitmap = r0     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4e
            android.graphics.Bitmap r5 = i(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4e
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.p.d.z.f()
            r6.unlock()
            return r5
        L4e:
            throw r1     // Catch: java.lang.Throwable -> L25
        L4f:
            throw r1     // Catch: java.lang.Throwable -> L25
        L50:
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.p.d.z.f()
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p.d.m.i(com.bumptech.glide.load.p.d.s, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.p.d.m$b, com.bumptech.glide.load.n.a0.e):android.graphics.Bitmap");
    }

    @TargetApi(19)
    private static String j(Bitmap bitmap) {
        String str;
        if (bitmap == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            str = " (" + bitmap.getAllocationByteCount() + ")";
        } else {
            str = "";
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + str;
    }

    private static synchronized BitmapFactory.Options k() {
        BitmapFactory.Options optionsPoll;
        Queue<BitmapFactory.Options> queue = f3988i;
        synchronized (queue) {
            optionsPoll = queue.poll();
        }
        if (optionsPoll == null) {
            optionsPoll = new BitmapFactory.Options();
            w(optionsPoll);
        }
        return optionsPoll;
    }

    private static int l(double d2) {
        if (d2 > 1.0d) {
            d2 = 1.0d / d2;
        }
        return (int) Math.round(d2 * 2.147483647E9d);
    }

    private static int[] m(s sVar, BitmapFactory.Options options, b bVar, com.bumptech.glide.load.n.a0.e eVar) {
        options.inJustDecodeBounds = true;
        i(sVar, options, bVar, eVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    private static String n(BitmapFactory.Options options) {
        return j(options.inBitmap);
    }

    private static boolean r(int i2) {
        return i2 == 90 || i2 == 270;
    }

    private static boolean s(BitmapFactory.Options options) {
        int i2;
        int i3 = options.inTargetDensity;
        return i3 > 0 && (i2 = options.inDensity) > 0 && i3 != i2;
    }

    private static void t(int i2, int i3, String str, BitmapFactory.Options options, Bitmap bitmap, int i4, int i5, long j2) {
        Log.v("Downsampler", "Decoded " + j(bitmap) + " from [" + i2 + "x" + i3 + "] " + str + " with inBitmap " + n(options) + " for [" + i4 + "x" + i5 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + com.bumptech.glide.t.f.a(j2));
    }

    private static IOException u(IllegalArgumentException illegalArgumentException, int i2, int i3, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i2 + ", outHeight: " + i3 + ", outMimeType: " + str + ", inBitmap: " + n(options), illegalArgumentException);
    }

    private static void v(BitmapFactory.Options options) {
        w(options);
        Queue<BitmapFactory.Options> queue = f3988i;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    private static void w(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    private static int x(double d2) {
        return (int) (d2 + 0.5d);
    }

    @TargetApi(26)
    private static void y(BitmapFactory.Options options, com.bumptech.glide.load.n.a0.e eVar, int i2, int i3) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig == Bitmap.Config.HARDWARE) {
            return;
        } else {
            config = options.outConfig;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = eVar.e(i2, i3, config);
    }

    private boolean z(ImageHeaderParser.ImageType imageType) {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return f3987h.contains(imageType);
    }

    public com.bumptech.glide.load.n.v<Bitmap> d(ParcelFileDescriptor parcelFileDescriptor, int i2, int i3, com.bumptech.glide.load.i iVar) {
        return e(new s.b(parcelFileDescriptor, this.f3992m, this.f3991l), i2, i3, iVar, f3986g);
    }

    public com.bumptech.glide.load.n.v<Bitmap> f(InputStream inputStream, int i2, int i3, com.bumptech.glide.load.i iVar) {
        return g(inputStream, i2, i3, iVar, f3986g);
    }

    public com.bumptech.glide.load.n.v<Bitmap> g(InputStream inputStream, int i2, int i3, com.bumptech.glide.load.i iVar, b bVar) {
        return e(new s.a(inputStream, this.f3992m, this.f3991l), i2, i3, iVar, bVar);
    }

    public boolean o(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.c();
    }

    public boolean p(InputStream inputStream) {
        return true;
    }

    public boolean q(ByteBuffer byteBuffer) {
        return true;
    }
}