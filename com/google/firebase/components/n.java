package com.google.firebase.components;

/* compiled from: Dependency.java */
/* loaded from: classes.dex */
public final class n {
    private final Class<?> a;

    /* renamed from: b, reason: collision with root package name */
    private final int f12293b;

    /* renamed from: c, reason: collision with root package name */
    private final int f12294c;

    private n(Class<?> cls, int i2, int i3) {
        this.a = (Class) u.c(cls, "Null dependency anInterface.");
        this.f12293b = i2;
        this.f12294c = i3;
    }

    public static n e(Class<?> cls) {
        return new n(cls, 0, 0);
    }

    public static n f(Class<?> cls) {
        return new n(cls, 0, 1);
    }

    public static n g(Class<?> cls) {
        return new n(cls, 1, 0);
    }

    public static n h(Class<?> cls) {
        return new n(cls, 2, 0);
    }

    public Class<?> a() {
        return this.a;
    }

    public boolean b() {
        return this.f12294c == 0;
    }

    public boolean c() {
        return this.f12293b == 1;
    }

    public boolean d() {
        return this.f12293b == 2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.a == nVar.a && this.f12293b == nVar.f12293b && this.f12294c == nVar.f12294c;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f12293b) * 1000003) ^ this.f12294c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i2 = this.f12293b;
        sb.append(i2 == 1 ? "required" : i2 == 0 ? "optional" : "set");
        sb.append(", direct=");
        sb.append(this.f12294c == 0);
        sb.append("}");
        return sb.toString();
    }
}