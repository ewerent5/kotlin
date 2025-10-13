package com.parizene.netmonitor.m0.b0;

/* compiled from: MyCellInfo.java */
/* loaded from: classes.dex */
public abstract class k {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final d f13303b;

    /* renamed from: c, reason: collision with root package name */
    public final r f13304c;

    public k(boolean z, d dVar, r rVar) {
        this.a = z;
        this.f13303b = dVar;
        this.f13304c = rVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.a == kVar.a && this.f13303b.equals(kVar.f13303b)) {
            return this.f13304c.equals(kVar.f13304c);
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a ? 1 : 0) * 31) + this.f13303b.hashCode()) * 31) + this.f13304c.hashCode();
    }
}