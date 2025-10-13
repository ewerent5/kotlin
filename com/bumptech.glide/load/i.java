package com.bumptech.glide.load;

import ch.qos.logback.core.CoreConstants;
import java.security.MessageDigest;

/* compiled from: Options.java */
/* loaded from: classes.dex */
public final class i implements g {

    /* renamed from: b, reason: collision with root package name */
    private final c.e.a<h<?>, Object> f3633b = new com.bumptech.glide.t.b();

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void f(h<T> hVar, Object obj, MessageDigest messageDigest) {
        hVar.g(obj, messageDigest);
    }

    @Override // com.bumptech.glide.load.g
    public void a(MessageDigest messageDigest) {
        for (int i2 = 0; i2 < this.f3633b.size(); i2++) {
            f(this.f3633b.i(i2), this.f3633b.m(i2), messageDigest);
        }
    }

    public <T> T c(h<T> hVar) {
        return this.f3633b.containsKey(hVar) ? (T) this.f3633b.get(hVar) : hVar.c();
    }

    public void d(i iVar) {
        this.f3633b.j(iVar.f3633b);
    }

    public <T> i e(h<T> hVar, T t) {
        this.f3633b.put(hVar, t);
        return this;
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f3633b.equals(((i) obj).f3633b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return this.f3633b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f3633b + CoreConstants.CURLY_RIGHT;
    }
}