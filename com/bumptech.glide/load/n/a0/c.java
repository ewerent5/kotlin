package com.bumptech.glide.load.n.a0;

import android.graphics.Bitmap;

/* compiled from: AttributeStrategy.java */
/* loaded from: classes.dex */
class c implements l {
    private final b a = new b();

    /* renamed from: b, reason: collision with root package name */
    private final h<a, Bitmap> f3648b = new h<>();

    /* compiled from: AttributeStrategy.java */
    static class a implements m {
        private final b a;

        /* renamed from: b, reason: collision with root package name */
        private int f3649b;

        /* renamed from: c, reason: collision with root package name */
        private int f3650c;

        /* renamed from: d, reason: collision with root package name */
        private Bitmap.Config f3651d;

        public a(b bVar) {
            this.a = bVar;
        }

        @Override // com.bumptech.glide.load.n.a0.m
        public void a() {
            this.a.c(this);
        }

        public void b(int i2, int i3, Bitmap.Config config) {
            this.f3649b = i2;
            this.f3650c = i3;
            this.f3651d = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f3649b == aVar.f3649b && this.f3650c == aVar.f3650c && this.f3651d == aVar.f3651d;
        }

        public int hashCode() {
            int i2 = ((this.f3649b * 31) + this.f3650c) * 31;
            Bitmap.Config config = this.f3651d;
            return i2 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return c.f(this.f3649b, this.f3650c, this.f3651d);
        }
    }

    /* compiled from: AttributeStrategy.java */
    static class b extends d<a> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.bumptech.glide.load.n.a0.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a(this);
        }

        a e(int i2, int i3, Bitmap.Config config) {
            a aVarB = b();
            aVarB.b(i2, i3, config);
            return aVarB;
        }
    }

    c() {
    }

    static String f(int i2, int i3, Bitmap.Config config) {
        return "[" + i2 + "x" + i3 + "], " + config;
    }

    private static String g(Bitmap bitmap) {
        return f(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    @Override // com.bumptech.glide.load.n.a0.l
    public String a(int i2, int i3, Bitmap.Config config) {
        return f(i2, i3, config);
    }

    @Override // com.bumptech.glide.load.n.a0.l
    public int b(Bitmap bitmap) {
        return com.bumptech.glide.t.k.g(bitmap);
    }

    @Override // com.bumptech.glide.load.n.a0.l
    public void c(Bitmap bitmap) {
        this.f3648b.d(this.a.e(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    @Override // com.bumptech.glide.load.n.a0.l
    public Bitmap d(int i2, int i3, Bitmap.Config config) {
        return this.f3648b.a(this.a.e(i2, i3, config));
    }

    @Override // com.bumptech.glide.load.n.a0.l
    public String e(Bitmap bitmap) {
        return g(bitmap);
    }

    @Override // com.bumptech.glide.load.n.a0.l
    public Bitmap removeLast() {
        return this.f3648b.f();
    }

    public String toString() {
        return "AttributeStrategy:\n  " + this.f3648b;
    }
}