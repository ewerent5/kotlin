package com.bumptech.glide.t;

import ch.qos.logback.core.CoreConstants;

/* compiled from: MultiClassKey.java */
/* loaded from: classes.dex */
public class i {
    private Class<?> a;

    /* renamed from: b, reason: collision with root package name */
    private Class<?> f4250b;

    /* renamed from: c, reason: collision with root package name */
    private Class<?> f4251c;

    public i() {
    }

    public void a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.a = cls;
        this.f4250b = cls2;
        this.f4251c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.a.equals(iVar.a) && this.f4250b.equals(iVar.f4250b) && k.c(this.f4251c, iVar.f4251c);
    }

    public int hashCode() {
        int iHashCode = ((this.a.hashCode() * 31) + this.f4250b.hashCode()) * 31;
        Class<?> cls = this.f4251c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.a + ", second=" + this.f4250b + CoreConstants.CURLY_RIGHT;
    }

    public i(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        a(cls, cls2, cls3);
    }
}