package com.bumptech.glide.load.n;

import ch.qos.logback.core.CoreConstants;
import java.security.MessageDigest;

/* compiled from: DataCacheKey.java */
/* loaded from: classes.dex */
final class d implements com.bumptech.glide.load.g {

    /* renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.g f3729b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.g f3730c;

    d(com.bumptech.glide.load.g gVar, com.bumptech.glide.load.g gVar2) {
        this.f3729b = gVar;
        this.f3730c = gVar2;
    }

    @Override // com.bumptech.glide.load.g
    public void a(MessageDigest messageDigest) {
        this.f3729b.a(messageDigest);
        this.f3730c.a(messageDigest);
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f3729b.equals(dVar.f3729b) && this.f3730c.equals(dVar.f3730c);
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return (this.f3729b.hashCode() * 31) + this.f3730c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f3729b + ", signature=" + this.f3730c + CoreConstants.CURLY_RIGHT;
    }
}