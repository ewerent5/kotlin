package com.bumptech.glide.load.p.d;

import android.os.Build;

/* compiled from: DownsampleStrategy.java */
/* loaded from: classes.dex */
public abstract class l {
    public static final l a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final l f3970b = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final l f3971c = new e();

    /* renamed from: d, reason: collision with root package name */
    public static final l f3972d = new c();

    /* renamed from: e, reason: collision with root package name */
    public static final l f3973e;

    /* renamed from: f, reason: collision with root package name */
    public static final l f3974f;

    /* renamed from: g, reason: collision with root package name */
    public static final l f3975g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.bumptech.glide.load.h<l> f3976h;

    /* renamed from: i, reason: collision with root package name */
    static final boolean f3977i;

    /* compiled from: DownsampleStrategy.java */
    private static class a extends l {
        a() {
        }

        @Override // com.bumptech.glide.load.p.d.l
        public g a(int i2, int i3, int i4, int i5) {
            return g.QUALITY;
        }

        @Override // com.bumptech.glide.load.p.d.l
        public float b(int i2, int i3, int i4, int i5) {
            if (Math.min(i3 / i5, i2 / i4) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r1);
        }
    }

    /* compiled from: DownsampleStrategy.java */
    private static class b extends l {
        b() {
        }

        @Override // com.bumptech.glide.load.p.d.l
        public g a(int i2, int i3, int i4, int i5) {
            return g.MEMORY;
        }

        @Override // com.bumptech.glide.load.p.d.l
        public float b(int i2, int i3, int i4, int i5) {
            int iCeil = (int) Math.ceil(Math.max(i3 / i5, i2 / i4));
            return 1.0f / (r2 << (Math.max(1, Integer.highestOneBit(iCeil)) >= iCeil ? 0 : 1));
        }
    }

    /* compiled from: DownsampleStrategy.java */
    private static class c extends l {
        c() {
        }

        @Override // com.bumptech.glide.load.p.d.l
        public g a(int i2, int i3, int i4, int i5) {
            return b(i2, i3, i4, i5) == 1.0f ? g.QUALITY : l.f3971c.a(i2, i3, i4, i5);
        }

        @Override // com.bumptech.glide.load.p.d.l
        public float b(int i2, int i3, int i4, int i5) {
            return Math.min(1.0f, l.f3971c.b(i2, i3, i4, i5));
        }
    }

    /* compiled from: DownsampleStrategy.java */
    private static class d extends l {
        d() {
        }

        @Override // com.bumptech.glide.load.p.d.l
        public g a(int i2, int i3, int i4, int i5) {
            return g.QUALITY;
        }

        @Override // com.bumptech.glide.load.p.d.l
        public float b(int i2, int i3, int i4, int i5) {
            return Math.max(i4 / i2, i5 / i3);
        }
    }

    /* compiled from: DownsampleStrategy.java */
    private static class e extends l {
        e() {
        }

        @Override // com.bumptech.glide.load.p.d.l
        public g a(int i2, int i3, int i4, int i5) {
            return l.f3977i ? g.QUALITY : g.MEMORY;
        }

        @Override // com.bumptech.glide.load.p.d.l
        public float b(int i2, int i3, int i4, int i5) {
            if (l.f3977i) {
                return Math.min(i4 / i2, i5 / i3);
            }
            if (Math.max(i3 / i5, i2 / i4) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r2);
        }
    }

    /* compiled from: DownsampleStrategy.java */
    private static class f extends l {
        f() {
        }

        @Override // com.bumptech.glide.load.p.d.l
        public g a(int i2, int i3, int i4, int i5) {
            return g.QUALITY;
        }

        @Override // com.bumptech.glide.load.p.d.l
        public float b(int i2, int i3, int i4, int i5) {
            return 1.0f;
        }
    }

    /* compiled from: DownsampleStrategy.java */
    public enum g {
        MEMORY,
        QUALITY
    }

    static {
        d dVar = new d();
        f3973e = dVar;
        f3974f = new f();
        f3975g = dVar;
        f3976h = com.bumptech.glide.load.h.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", dVar);
        f3977i = Build.VERSION.SDK_INT >= 19;
    }

    public abstract g a(int i2, int i3, int i4, int i5);

    public abstract float b(int i2, int i3, int i4, int i5);
}