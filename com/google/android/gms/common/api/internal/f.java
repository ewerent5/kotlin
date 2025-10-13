package com.google.android.gms.common.api.internal;

/* loaded from: classes.dex */
public final class f<L> {
    private final L a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4599b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a == fVar.a && this.f4599b.equals(fVar.f4599b);
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 31) + this.f4599b.hashCode();
    }
}