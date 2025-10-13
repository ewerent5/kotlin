package com.bumptech.glide.load.n.a0;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: LruBitmapPool.java */
/* loaded from: classes.dex */
public class k implements e {
    private static final Bitmap.Config a = Bitmap.Config.ARGB_8888;

    /* renamed from: b, reason: collision with root package name */
    private final l f3663b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<Bitmap.Config> f3664c;

    /* renamed from: d, reason: collision with root package name */
    private final long f3665d;

    /* renamed from: e, reason: collision with root package name */
    private final a f3666e;

    /* renamed from: f, reason: collision with root package name */
    private long f3667f;

    /* renamed from: g, reason: collision with root package name */
    private long f3668g;

    /* renamed from: h, reason: collision with root package name */
    private int f3669h;

    /* renamed from: i, reason: collision with root package name */
    private int f3670i;

    /* renamed from: j, reason: collision with root package name */
    private int f3671j;

    /* renamed from: k, reason: collision with root package name */
    private int f3672k;

    /* compiled from: LruBitmapPool.java */
    private interface a {
        void a(Bitmap bitmap);

        void b(Bitmap bitmap);
    }

    /* compiled from: LruBitmapPool.java */
    private static final class b implements a {
        b() {
        }

        @Override // com.bumptech.glide.load.n.a0.k.a
        public void a(Bitmap bitmap) {
        }

        @Override // com.bumptech.glide.load.n.a0.k.a
        public void b(Bitmap bitmap) {
        }
    }

    k(long j2, l lVar, Set<Bitmap.Config> set) {
        this.f3665d = j2;
        this.f3667f = j2;
        this.f3663b = lVar;
        this.f3664c = set;
        this.f3666e = new b();
    }

    @TargetApi(26)
    private static void f(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    private static Bitmap g(int i2, int i3, Bitmap.Config config) {
        if (config == null) {
            config = a;
        }
        return Bitmap.createBitmap(i2, i3, config);
    }

    private void h() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            i();
        }
    }

    private void i() {
        Log.v("LruBitmapPool", "Hits=" + this.f3669h + ", misses=" + this.f3670i + ", puts=" + this.f3671j + ", evictions=" + this.f3672k + ", currentSize=" + this.f3668g + ", maxSize=" + this.f3667f + "\nStrategy=" + this.f3663b);
    }

    private void j() {
        q(this.f3667f);
    }

    @TargetApi(26)
    private static Set<Bitmap.Config> k() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 19) {
            hashSet.add(null);
        }
        if (i2 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private static l l() {
        return Build.VERSION.SDK_INT >= 19 ? new n() : new c();
    }

    private synchronized Bitmap m(int i2, int i3, Bitmap.Config config) {
        Bitmap bitmapD;
        f(config);
        bitmapD = this.f3663b.d(i2, i3, config != null ? config : a);
        if (bitmapD == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Missing bitmap=" + this.f3663b.a(i2, i3, config));
            }
            this.f3670i++;
        } else {
            this.f3669h++;
            this.f3668g -= this.f3663b.b(bitmapD);
            this.f3666e.a(bitmapD);
            p(bitmapD);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            Log.v("LruBitmapPool", "Get bitmap=" + this.f3663b.a(i2, i3, config));
        }
        h();
        return bitmapD;
    }

    @TargetApi(19)
    private static void o(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 19) {
            bitmap.setPremultiplied(true);
        }
    }

    private static void p(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        o(bitmap);
    }

    private synchronized void q(long j2) {
        while (this.f3668g > j2) {
            Bitmap bitmapRemoveLast = this.f3663b.removeLast();
            if (bitmapRemoveLast == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    i();
                }
                this.f3668g = 0L;
                return;
            }
            this.f3666e.a(bitmapRemoveLast);
            this.f3668g -= this.f3663b.b(bitmapRemoveLast);
            this.f3672k++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=" + this.f3663b.e(bitmapRemoveLast));
            }
            h();
            bitmapRemoveLast.recycle();
        }
    }

    @Override // com.bumptech.glide.load.n.a0.e
    @SuppressLint({"InlinedApi"})
    public void a(int i2) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i2);
        }
        if (i2 >= 40 || (Build.VERSION.SDK_INT >= 23 && i2 >= 20)) {
            b();
        } else if (i2 >= 20 || i2 == 15) {
            q(n() / 2);
        }
    }

    @Override // com.bumptech.glide.load.n.a0.e
    public void b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        q(0L);
    }

    @Override // com.bumptech.glide.load.n.a0.e
    public synchronized void c(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.f3663b.b(bitmap) <= this.f3667f && this.f3664c.contains(bitmap.getConfig())) {
                int iB = this.f3663b.b(bitmap);
                this.f3663b.c(bitmap);
                this.f3666e.b(bitmap);
                this.f3671j++;
                this.f3668g += iB;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    Log.v("LruBitmapPool", "Put bitmap in pool=" + this.f3663b.e(bitmap));
                }
                h();
                j();
                return;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f3663b.e(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f3664c.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.n.a0.e
    public Bitmap d(int i2, int i3, Bitmap.Config config) {
        Bitmap bitmapM = m(i2, i3, config);
        if (bitmapM == null) {
            return g(i2, i3, config);
        }
        bitmapM.eraseColor(0);
        return bitmapM;
    }

    @Override // com.bumptech.glide.load.n.a0.e
    public Bitmap e(int i2, int i3, Bitmap.Config config) {
        Bitmap bitmapM = m(i2, i3, config);
        return bitmapM == null ? g(i2, i3, config) : bitmapM;
    }

    public long n() {
        return this.f3667f;
    }

    public k(long j2) {
        this(j2, l(), k());
    }
}