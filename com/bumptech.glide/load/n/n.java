package com.bumptech.glide.load.n;

import ch.qos.logback.core.CoreConstants;
import java.security.MessageDigest;
import java.util.Map;

/* compiled from: EngineKey.java */
/* loaded from: classes.dex */
class n implements com.bumptech.glide.load.g {

    /* renamed from: b, reason: collision with root package name */
    private final Object f3814b;

    /* renamed from: c, reason: collision with root package name */
    private final int f3815c;

    /* renamed from: d, reason: collision with root package name */
    private final int f3816d;

    /* renamed from: e, reason: collision with root package name */
    private final Class<?> f3817e;

    /* renamed from: f, reason: collision with root package name */
    private final Class<?> f3818f;

    /* renamed from: g, reason: collision with root package name */
    private final com.bumptech.glide.load.g f3819g;

    /* renamed from: h, reason: collision with root package name */
    private final Map<Class<?>, com.bumptech.glide.load.m<?>> f3820h;

    /* renamed from: i, reason: collision with root package name */
    private final com.bumptech.glide.load.i f3821i;

    /* renamed from: j, reason: collision with root package name */
    private int f3822j;

    n(Object obj, com.bumptech.glide.load.g gVar, int i2, int i3, Map<Class<?>, com.bumptech.glide.load.m<?>> map, Class<?> cls, Class<?> cls2, com.bumptech.glide.load.i iVar) {
        this.f3814b = com.bumptech.glide.t.j.d(obj);
        this.f3819g = (com.bumptech.glide.load.g) com.bumptech.glide.t.j.e(gVar, "Signature must not be null");
        this.f3815c = i2;
        this.f3816d = i3;
        this.f3820h = (Map) com.bumptech.glide.t.j.d(map);
        this.f3817e = (Class) com.bumptech.glide.t.j.e(cls, "Resource class must not be null");
        this.f3818f = (Class) com.bumptech.glide.t.j.e(cls2, "Transcode class must not be null");
        this.f3821i = (com.bumptech.glide.load.i) com.bumptech.glide.t.j.d(iVar);
    }

    @Override // com.bumptech.glide.load.g
    public void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f3814b.equals(nVar.f3814b) && this.f3819g.equals(nVar.f3819g) && this.f3816d == nVar.f3816d && this.f3815c == nVar.f3815c && this.f3820h.equals(nVar.f3820h) && this.f3817e.equals(nVar.f3817e) && this.f3818f.equals(nVar.f3818f) && this.f3821i.equals(nVar.f3821i);
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        if (this.f3822j == 0) {
            int iHashCode = this.f3814b.hashCode();
            this.f3822j = iHashCode;
            int iHashCode2 = (iHashCode * 31) + this.f3819g.hashCode();
            this.f3822j = iHashCode2;
            int i2 = (iHashCode2 * 31) + this.f3815c;
            this.f3822j = i2;
            int i3 = (i2 * 31) + this.f3816d;
            this.f3822j = i3;
            int iHashCode3 = (i3 * 31) + this.f3820h.hashCode();
            this.f3822j = iHashCode3;
            int iHashCode4 = (iHashCode3 * 31) + this.f3817e.hashCode();
            this.f3822j = iHashCode4;
            int iHashCode5 = (iHashCode4 * 31) + this.f3818f.hashCode();
            this.f3822j = iHashCode5;
            this.f3822j = (iHashCode5 * 31) + this.f3821i.hashCode();
        }
        return this.f3822j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f3814b + ", width=" + this.f3815c + ", height=" + this.f3816d + ", resourceClass=" + this.f3817e + ", transcodeClass=" + this.f3818f + ", signature=" + this.f3819g + ", hashCode=" + this.f3822j + ", transformations=" + this.f3820h + ", options=" + this.f3821i + CoreConstants.CURLY_RIGHT;
    }
}