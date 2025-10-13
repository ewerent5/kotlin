package com.bumptech.glide.load;

import ch.qos.logback.core.CoreConstants;
import java.security.MessageDigest;

/* compiled from: Option.java */
/* loaded from: classes.dex */
public final class h<T> {
    private static final b<Object> a = new a();

    /* renamed from: b, reason: collision with root package name */
    private final T f3629b;

    /* renamed from: c, reason: collision with root package name */
    private final b<T> f3630c;

    /* renamed from: d, reason: collision with root package name */
    private final String f3631d;

    /* renamed from: e, reason: collision with root package name */
    private volatile byte[] f3632e;

    /* compiled from: Option.java */
    class a implements b<Object> {
        a() {
        }

        @Override // com.bumptech.glide.load.h.b
        public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    /* compiled from: Option.java */
    public interface b<T> {
        void a(byte[] bArr, T t, MessageDigest messageDigest);
    }

    private h(String str, T t, b<T> bVar) {
        this.f3631d = com.bumptech.glide.t.j.b(str);
        this.f3629b = t;
        this.f3630c = (b) com.bumptech.glide.t.j.d(bVar);
    }

    public static <T> h<T> a(String str, T t, b<T> bVar) {
        return new h<>(str, t, bVar);
    }

    private static <T> b<T> b() {
        return (b<T>) a;
    }

    private byte[] d() {
        if (this.f3632e == null) {
            this.f3632e = this.f3631d.getBytes(g.a);
        }
        return this.f3632e;
    }

    public static <T> h<T> e(String str) {
        return new h<>(str, null, b());
    }

    public static <T> h<T> f(String str, T t) {
        return new h<>(str, t, b());
    }

    public T c() {
        return this.f3629b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f3631d.equals(((h) obj).f3631d);
        }
        return false;
    }

    public void g(T t, MessageDigest messageDigest) {
        this.f3630c.a(d(), t, messageDigest);
    }

    public int hashCode() {
        return this.f3631d.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f3631d + CoreConstants.SINGLE_QUOTE_CHAR + CoreConstants.CURLY_RIGHT;
    }
}