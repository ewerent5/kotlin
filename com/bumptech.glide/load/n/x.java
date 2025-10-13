package com.bumptech.glide.load.n;

import ch.qos.logback.core.CoreConstants;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: ResourceCacheKey.java */
/* loaded from: classes.dex */
final class x implements com.bumptech.glide.load.g {

    /* renamed from: b, reason: collision with root package name */
    private static final com.bumptech.glide.t.g<Class<?>, byte[]> f3857b = new com.bumptech.glide.t.g<>(50);

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.n.a0.b f3858c;

    /* renamed from: d, reason: collision with root package name */
    private final com.bumptech.glide.load.g f3859d;

    /* renamed from: e, reason: collision with root package name */
    private final com.bumptech.glide.load.g f3860e;

    /* renamed from: f, reason: collision with root package name */
    private final int f3861f;

    /* renamed from: g, reason: collision with root package name */
    private final int f3862g;

    /* renamed from: h, reason: collision with root package name */
    private final Class<?> f3863h;

    /* renamed from: i, reason: collision with root package name */
    private final com.bumptech.glide.load.i f3864i;

    /* renamed from: j, reason: collision with root package name */
    private final com.bumptech.glide.load.m<?> f3865j;

    x(com.bumptech.glide.load.n.a0.b bVar, com.bumptech.glide.load.g gVar, com.bumptech.glide.load.g gVar2, int i2, int i3, com.bumptech.glide.load.m<?> mVar, Class<?> cls, com.bumptech.glide.load.i iVar) {
        this.f3858c = bVar;
        this.f3859d = gVar;
        this.f3860e = gVar2;
        this.f3861f = i2;
        this.f3862g = i3;
        this.f3865j = mVar;
        this.f3863h = cls;
        this.f3864i = iVar;
    }

    private byte[] c() {
        com.bumptech.glide.t.g<Class<?>, byte[]> gVar = f3857b;
        byte[] bArrG = gVar.g(this.f3863h);
        if (bArrG != null) {
            return bArrG;
        }
        byte[] bytes = this.f3863h.getName().getBytes(com.bumptech.glide.load.g.a);
        gVar.k(this.f3863h, bytes);
        return bytes;
    }

    @Override // com.bumptech.glide.load.g
    public void a(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f3858c.c(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f3861f).putInt(this.f3862g).array();
        this.f3860e.a(messageDigest);
        this.f3859d.a(messageDigest);
        messageDigest.update(bArr);
        com.bumptech.glide.load.m<?> mVar = this.f3865j;
        if (mVar != null) {
            mVar.a(messageDigest);
        }
        this.f3864i.a(messageDigest);
        messageDigest.update(c());
        this.f3858c.d(bArr);
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f3862g == xVar.f3862g && this.f3861f == xVar.f3861f && com.bumptech.glide.t.k.c(this.f3865j, xVar.f3865j) && this.f3863h.equals(xVar.f3863h) && this.f3859d.equals(xVar.f3859d) && this.f3860e.equals(xVar.f3860e) && this.f3864i.equals(xVar.f3864i);
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        int iHashCode = (((((this.f3859d.hashCode() * 31) + this.f3860e.hashCode()) * 31) + this.f3861f) * 31) + this.f3862g;
        com.bumptech.glide.load.m<?> mVar = this.f3865j;
        if (mVar != null) {
            iHashCode = (iHashCode * 31) + mVar.hashCode();
        }
        return (((iHashCode * 31) + this.f3863h.hashCode()) * 31) + this.f3864i.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f3859d + ", signature=" + this.f3860e + ", width=" + this.f3861f + ", height=" + this.f3862g + ", decodedResourceClass=" + this.f3863h + ", transformation='" + this.f3865j + CoreConstants.SINGLE_QUOTE_CHAR + ", options=" + this.f3864i + CoreConstants.CURLY_RIGHT;
    }
}